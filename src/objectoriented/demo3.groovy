package objectoriented

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder

/**
 * @author wanghong* @date 2019/08/12 22:04
 * */
def list = [new Person(name: 'wh', age: 28),
            new Person(name: 'wg', age: 29)]
def json = JsonOutput.toJson(list)
println JsonOutput.prettyPrint(json)

/*def jsonSper = new JsonSlurper()
jsonSper.parse()*/

def getNetWorkData(String url) {
    // 发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod("GET")
    connection.connect()
    def response = connection.content.text

    // 将json转换为实体对象
    def jsonSper = new JsonSlurper()
    return jsonSper.parseText(response)
}

final String xml =''' '''
def xmlSlurper = new XmlSlurper()
def response = xmlSlurper.parseText(xml)

println response.value.bookes[0].book[0].title.text
println response.value.bookes[0].book[0].@id // 标签属性值

// 深度遍历和广度遍历

// 生成xml格式数据
def sw = new StringWriter()
def xmlBuilder = new MarkupBuilder(sw) // 用来生成xml的核心类
xmlBuilder.langs()


