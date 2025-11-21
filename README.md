## Harbor Client

```shell
openapi-generator generate \
  -i https://raw.githubusercontent.com/goharbor/harbor/refs/heads/main/api/v2.0/swagger.yaml \
  -g java \
  --library restclient \
  -o ./harbor-client \
  --group-id com.ryan.openapi.harbor \
  --artifact-id harbor-client \
  --artifact-version 1.0.0 \
  --api-package com.ryan.openapi.harbor.client.api \
  --model-package com.ryan.openapi.harbor.client.model \
  --invoker-package com.ryan.openapi.harbor.client.invoker \
  --additional-properties=useMaven=true,dateLibrary=java21,hideGenerationTimestamp=true,generateBuilders=true,licenseName=MIT,licenseUrl=https://opensource.org/license/mit
```