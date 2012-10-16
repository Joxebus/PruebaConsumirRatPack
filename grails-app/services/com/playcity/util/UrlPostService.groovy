/**
 * @author: Jorge Omar Bautista Valenzuela
 * Date: 16/10/2012
 * Time: 13:30
 * e-mail: joxebus@gmail.com
 */


package com.playcity.util

import groovy.json.JsonSlurper

class UrlPostService {
    def slurper = new JsonSlurper()

    def post = { urlString, queryString ->
        def url = new URL(urlString)
        def connection = url.openConnection()
        connection.setRequestMethod("POST")
        connection.doOutput = true

        def writer = new OutputStreamWriter(connection.outputStream)
        writer.write(queryString)
        writer.flush()
        writer.close()
        connection.connect()

        def json = connection.content.text

        println "texto en JSON $json"

        if(json){
            slurper.parseText(json)
        }else{
            null
        }

    }
}
