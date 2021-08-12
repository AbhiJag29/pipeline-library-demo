def checkoutGit(path,url){
  checkout(
          changelog:true,
          poll:poll,
          scm:[
          $class:'GitSCM',
          branches:[[name:branch_name]],
          extensions:[],
          userRemoteConfigs:[[url:url]]
  )
