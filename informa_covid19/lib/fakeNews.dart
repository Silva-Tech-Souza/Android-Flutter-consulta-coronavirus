import 'package:flutter/material.dart';
import './drawerOnly.dart';

class FakeNews extends StatelessWidget{
@override
Widget build(BuildContext context) {
  return new Scaffold(
    drawer: new DrawerOnly(),
    appBar: new AppBar(
      title: new Text("Fake News"),
    ),
    body: new Text("pagina 3"),
  );
}
}