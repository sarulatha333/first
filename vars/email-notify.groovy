def call(status,mail_to,cc_to){

if(status=='STARTED'){
mail to: "${mail_to}",
cc: "${cc_to}",
subject: "TEST (Build Status - INITIATED ) - ${PROJECT} has been initiated",
body: """Hi Team, Build Started"""
}

else if(status=='SUCCESS'){  
mail to: "${mail_to}",
cc: "${cc_to}",
subject: "TEST (Build Status - success ) - ${PROJECT} has been initiated",
body: """Hi Team, build success"""
}

else{
mail to: "${mail_to}",
cc: "${cc_to}",
subject: "TEST (Build Status - failure ) - ${PROJECT} has been initiated",
body: """Hi Team, build aborted"""
}
}
