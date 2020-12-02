import 'package:flutter/material.dart';
import './drawerOnly.dart';

class DWidget extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: new DrawerOnly(),
      appBar:  new AppBar(
        title: Text("Global"),
      ),
      body: Text("corpo"),
    );
  }

}