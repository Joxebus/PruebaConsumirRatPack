/**
 * @author: Jorge Omar Bautista Valenzuela
 * Date: 16/10/2012
 * Time: 13:30
 * e-mail: joxebus@gmail.com
 */

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
