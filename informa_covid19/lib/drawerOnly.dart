import 'package:flutter/material.dart';
import './firstPage.dart';
import './secondPage.dart';
import './fakeNews.dart';
import './saude.dart';
import './compartilhar.dart';
import './sobreNos.dart';

class DrawerOnly  extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new Drawer(
      child: new ListView(
        children: <Widget>[
          new DrawerHeader(
              child: Text("decoration do drawer"),
            decoration: BoxDecoration(
              gradient: LinearGradient(colors: <Color>[
                Colors.blueAccent,
                Colors.blue,
                Colors.white,
              ]),
            ),
          ),
          new ListTile(
            title: Text("Global"),

            onTap: (){
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context)=> new Fistpage()));
            },
          ),
          new ListTile(
           title: Text("Brasil"),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context) => new SecondPage()));
            },
          ),
          new ListTile(
            title: Text("Fake News"),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context) => new FakeNews()));
            },
          ),
          new ListTile(
            title: Text("Saúde"),
            leading: Icon(Icons.add_circle),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context) => new Saude()));
            },
          ),
          new ListTile(
            title: Text("Compartilhar"),
            leading: Icon(Icons.send),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context) => new Compartilhar()));
            },
          ),
          new ListTile(
            title: Text("Sobre Nós"),
            leading: Icon(Icons.account_circle),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(context, new MaterialPageRoute(builder: (context) => new SobreNos()));
            },
          ),
        ],
      ),
    );
  }
}