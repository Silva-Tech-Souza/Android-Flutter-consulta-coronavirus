import 'package:flutter/material.dart';
import './drawerOnly.dart';

class Compartilhar extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      drawer: new DrawerOnly(),
      appBar: new AppBar(
        title: new Text("Compartilhar"),
      ),
      body: new Text("pagina 5"),
    );
  }
}