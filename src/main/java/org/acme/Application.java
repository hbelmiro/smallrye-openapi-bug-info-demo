package org.acme;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(title = "This is the title", description = "This is the API description", version = "v42"))
public class Application extends javax.ws.rs.core.Application{
}
