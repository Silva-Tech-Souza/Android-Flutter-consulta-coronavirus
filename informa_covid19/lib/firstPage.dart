import 'package:flutter/material.dart';
import './drawerOnly.dart';

class Fistpage  extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      drawer: new DrawerOnly(),
      appBar: new AppBar(
        title: new Text("Global"),
      ),
      body: _bodyglobal(),
    );
  }
}

_bodyglobal(){
  return Container(
    padding: EdgeInsets.all(10.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
            child: Container(
              width: 300,
              padding: EdgeInsets.all(20.0),
              child: Column(
                children: <Widget>[
                  _titulo(),
                  Text("\n\nCasos: "),
                  Text("\nMortes: "),
                ],
              ),
            ),
          ),
          Card(
            child: Container(
              width: 300,
              padding: EdgeInsets.all(30.0),
              child: Column(
                children: <Widget>[
                  _titulopocontinet(),
                  Text("\n\n África: \t\t Casos: \t\t Mortes:"),
                  Text("\n Ásia: \t\t Casos: \t\t Mortes:"),
                  Text("\n America: \t\t Casos: \t\t Mortes:"),
                  Text("\n etc... \t\t Casos: \t\t Mortes:"),
                ],
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

_titulopocontinet(){
  return Container(
    padding: EdgeInsets.all(5.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
            child: Container(
              child: Column(
                children: <Widget>[
                  Text("Por Continete"),
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