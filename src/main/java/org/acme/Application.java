package org.acme;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "This is the title",
                description = """
                        -----------------
                        This is the API description. It supports [CommonMark syntax](https://spec.commonmark.org/).
                                                
                        You can define code blocks, for instance:
                        ```java"
                        public class Application {...}"
                        ```
                                                
                        This is the end of the description.
                        
                        ---------
                        """,
                termsOfService = "http://example.com/terms/",
                contact = @Contact(
                        name = "John Doe",
                        url = "https://john.doe",
                        email = "johndoe@example.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"),
                version = "v42"))
public class Application extends javax.ws.rs.core.Application {

}
