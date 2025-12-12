package services;

import api.model.Data;
import api.model.workspace.workspaceResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

import static services.BaseService.X_API_KEY;


public class WorkspacesService extends MethodsService {

    public static Response get(String jsonName) {
       return get(jsonName, workspaceResponse[].class, setParams());
    }

    private static Map<String, String> setParams(){
        Map<String, String> param = new HashMap<>();
        param.put("base.url", PropertyManager.getProperty("base.api.url"));
        param.put("api-key", X_API_KEY.get());
        return param;
    }



}


