To add some headers to the scanners requests create a file called *acstis-config.txt* with the following content:

```text
options.identity.headers.update({
    "Authorization": "Bearer <JWT>"
})
```

Then create a config map from this file:

```bash
kubectl create configmap --from-file /path/to/my/acstis-config.txt acstis-config 
```

After mounting the config map to the specified path you can execute your scan.