import 'package:flutter/material.dart';
import './drawerOnly.dart';
import 'package:informa_covid19/http.dart';

HTTPRequest httpRequest = new HTTPRequest();

class SecondPage extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      drawer: new DrawerOnly(),
      appBar: new AppBar(
        title: new Text("Brasil"),
      ),
      body: _bodybrasil(),
    );
  }
}

_bodybrasil(){

  return Container(
    padding: EdgeInsets.all(10.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
            child: Container(
              child: FutureBuilder(

                future: httpRequest.getCVC("https://raw.githubusercontent.com/wcota/covid19br/master/cases-brazil-total.csv"),
                builder: (context, snapshot) {
                if (snapshot.hasData) {

                  List listaBrasilCVC = snapshot.data;

                  List listaBrasil = listaBrasilCVC[listaBrasilCVC.length - 2];

                  //print("linha: " + listaBrasilCVC[ listaBrasilCVC.length -2 ].toString() +
                  //"\n" +"Colunas: " + listaBrasil[2] + " " + listaBrasil[5]);

                  return Center(
                    child: Column(
                      children: <Widget>[
                        _titulo(),
                        Text("\n\nCasos: " + listaBrasil[2]),
                        Text("\nMortes: " + listaBrasil[5]),
                      ],
                    )
                  );
                } else {
                  return Center(
                    child: CircularProgressIndicator(),
                  );
                }
              }
              ),
              width: 300,
              padding: EdgeInsets.all(20.0),
            ),
          ),
          Card(
            child: Container(
              width: 300,
              padding: EdgeInsets.all(30.0),
              child: FutureBuilder(

                future: httpRequest.getCVC("https://raw.githubusercontent.com/wcota/covid19br/master/cases-brazil-total.csv"),
                builder: (context, snapshot) {
                if (snapshot.hasData) {

                  List listaBrasilCVC = snapshot.data;

                  List listaBrasil;

                  listaBrasilCVC.removeAt(0);
                  listaBrasilCVC.removeAt(28);
                  listaBrasilCVC.removeAt(27);

                  //print("linha: " + listaBrasilCVC[ listaBrasilCVC.length -2 ].toString() +
                  //"\n" +"Colunas: " + listaBrasil[2] + " " + listaBrasil[5]);

                  return Center(
                    child: SizedBox(
                      height: 300,
                    child: ListView.builder(
                      
                      itemCount: listaBrasilCVC.length,

                      itemBuilder: (context, index) {

                        listaBrasil = listaBrasilCVC[index];

                        return ListTile(
                          title: Text( "\n\n" + listaBrasil[1] + "\n" 
                                    +  "Mortes: " + listaBrasil[2] + "\n"
                                    +  "Casos confirmados: " + listaBrasil[5]),
                        );
                      },
                    )
                  )
                );
                } else {
                  return Center(
                    child: CircularProgressIndicator(),
                  );
                }
              }
              ),
            ),
          )
        ],
      ),
    ),
  );
}

_titulo(){
  return Container(
    padding: EdgeInsets.all(5.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
           child: Container(
             child: Column(
               children: <Widget>[
                 Text("Covid-19"),
               ],
             ),
             width: 299,
             height: 20,
             decoration: BoxDecoration(
               color: Colors.blue,
             ),
           ),
          ),
        ],
      ),
    ),
  );
}