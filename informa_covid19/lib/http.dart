import 'package:http/http.dart' as http;

class HTTPRequest{

  Future<List<List<String>>> getCVC(String url) async{	

    http.Response resposta = await http.get(url);

    String valores = resposta.body.toString();

    List<String> lista = valores.split("\n"); 
    //Alguns valores retornam sem separaç~ao de virgula, por isso os valores do final e do começo se fundiram

    //print(lista.toString());

    List<List<String>> listaSuprema = new List();

    for(int x = lista.length; x > 0; x--){

      List<String> list = lista[ x-1 ].toString().split(",");

      listaSuprema.add(list);

    }

    //print(listaSuprema.toString());

    return listaSuprema;

  }


}