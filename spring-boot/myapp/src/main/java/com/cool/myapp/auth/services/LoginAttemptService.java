package com.cool.myapp.auth.services;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@Service
public class LoginAttemptService {
    
    private static final int MAX_ATTEMPT_COUNT = 3;
    private static final long CACHE_DURATION = 60;
    private LoadingCache<String, Integer> loginAttemptCache;

    public LoginAttemptService() {
        this.loginAttemptCache = CacheBuilder.newBuilder()
                                    .expireAfterWrite(CACHE_DURATION, TimeUnit.SECONDS)
                                    .build(new CacheLoader<String, Integer>() {
                                        @Override
                                        public Integer load(String key) throws Exception {
                                            return 0;
                                        }

                                    });
                                            
    }

    public void loginSuccess(String username) {
		loginAttemptCache.invalidate(username);
	}

	public void loginFailed(String username) {
		int failedAttemptCounter = 0;
		
		try {
			failedAttemptCounter = loginAttemptCache.get(username);
		} 
		catch (ExecutionException e) {
			failedAttemptCounter = 0;
		}
        
		failedAttemptCounter++;
		loginAttemptCache.put(username, failedAttemptCounter);
	}
	
	public boolean isBlocked(String username) {
		try {
			return loginAttemptCache.get(username) >= MAX_ATTEMPT_COUNT;
		} 
		catch (ExecutionException e) {
			return false;
		}
	}
}
