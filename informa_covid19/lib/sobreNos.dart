import 'package:flutter/material.dart';
import './drawerOnly.dart';

class SobreNos extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      drawer: new DrawerOnly(),
      appBar: new AppBar(
        title: new Text("Sobre Nós"),
      ),
      body: _body(),
    );
  }
}

_body(){
  return Container(
    padding: EdgeInsets.all(10.0),
    child: Center(
      child: Column(
        children: <Widget>[
          Card(
            child: Container(
              padding: EdgeInsets.all(20.0),
              child: Column(
                children: <Widget>[
                  Text("Informa Covid-19"),
                  Text("sobre nós"),
                ],
              ),
            ),
          )
        ],
      ),
    ),
  );
}