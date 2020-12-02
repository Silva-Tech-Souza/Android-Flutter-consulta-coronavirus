import 'package:flutter/material.dart';
import './drawerOnly.dart';

class Saude extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      drawer: new DrawerOnly(),
      appBar: new AppBar(
        title: new Text("Saúde"),
      ),
      body: _bodysaude(),
    );
  }
}

_bodysaude(){
  return Container(
    padding: EdgeInsets.all(10.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
            child: Container(
              width: 300,
              height: 300,
              padding: EdgeInsets.all(20.0),
              child: Column(
                children: <Widget>[
                  Text("\n\nO que é o Coronavírus "),
                ],
              ),
            ),
          ),
          Card(
            child: Container(
              width: 300,
              height: 300,
              padding: EdgeInsets.all(30.0),
              child: Column(
                children: <Widget>[
                  _titulopocontinet(),
                  Text("\n\n Sintomas"),
                ],
              ),
            ),
          ),
          Card(
            child: Container(
              width: 300,
              height: 300,
              padding: EdgeInsets.all(30.0),
              child: Column(
                children: <Widget>[
                  _titulopocontinet(),
                  Text("\n\n Prevenção"),
                ],
              ),
            ),
          )
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