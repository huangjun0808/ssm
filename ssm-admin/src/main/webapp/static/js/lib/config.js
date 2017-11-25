require.config({
    paths: {
        'jquery': 'jquery.min',
        'bootstrap':'bootstrap.min',
        'adminlte':'adminlte.min',
        'icheck':'icheck.min',
    },
    shim: {
        'bootstrap': {
            exports: '$',
            deps:['jquery']
        },
        'icheck':{
            exports:'$',
            deps:['jquery']
        },
        'adminlte':{
            exports: 'adminlte',
            deps:['jquery','bootstrap']
        }
    }
});