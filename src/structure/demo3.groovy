package structure

/**
 * @author wanghong* @date 2019/08/12 21:09
 *  Groovy中的范围
 * */
def range = 1..10
println range[0]
println range.contains(10)
println range.from
println range.to

range.each {
    println it
}

def getGrade(Number num){
    def result
    switch (num){
        case 0..60:
            result = '及格'
            break
        case 70..80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
}

def result = getGrade(90)
println result