package pruebaconsumirratpack



class RegistroController {

    def urlPostService

    def index() {
        render view:"formulario"
    }

    def login () {
        def urlString = message(code: 'url.webservice.login')
        def queryString = "usuario=${params.usuario}&contrasenia=${params.contrasenia}"

        def response = urlPostService.post(urlString,queryString)

        println "Mapa de propiedades: "+response?:""
        if(response){
            params.usuario = response
            render view:"exito", model:params
        }else{
            render view:"error"
        }
    }
}
