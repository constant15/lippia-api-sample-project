package api.config;

import services.WorkspacesService;

public enum EntityConfiguration {

    WORKSPACES {
        @Override
        public Class<?> getEntityService() {
            return WorkspacesService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



