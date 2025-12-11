package services;

import com.crowdar.api.rest.MethodsService;

public class BaseService extends MethodsService {

    public static ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
}
