
## DEV
oc new-app https://github.com/debianmaster/store-orders

## QA
oc new-build https://github.com/debianmaster/store-orders --context-dir=qa --name=orders-pipeline

## PROD
oc new-build https://github.com/debianmaster/store-orders --context-dir=prod --name=orders-pipeline


## Permissions
```sh
oc adm policy add-role-to-user edit system:serviceaccounts:qa -n myproject
oc adm policy add-role-to-user edit system:serviceaccounts:prod -n qa
```
