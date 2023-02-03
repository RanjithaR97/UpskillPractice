class AuthenticationService{

    registerSuccessfull(username,password){
        console.log("registeredSuccessfull");
        sessionStorage.setItem('authenticatedUser',username)
    }

    logout(){
        sessionStorage.removeItem('authenticatedUser')

    }

    isUserloggedIn(){
        let user=sessionStorage.getItem('authenticatedUser')
        if(user===null)  {
            return false
        }
        return true
       

    }

}
export default new AuthenticationService