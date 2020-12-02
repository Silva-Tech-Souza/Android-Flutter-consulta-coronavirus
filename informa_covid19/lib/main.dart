import 'package:flutter/material.dart';
import './dwidget.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: new DWidget(),
    );
  }

}


// _tituloporregiao(){
//   return Container(
//     padding: EdgeInsets.all(5.0),
//     child: Center(
//       child: Column(
//         children: <Widget>[
//           Card(
//             child: Container(
//               child: Column(
//                 children: <Widget>[
//                   Text("Por Região"),
//                 ],
//               ),
//               width: 299,
//               height: 20,
//               decoration: BoxDecoration(
//                 color: Colors.blue,
//               ),
//             ),
//           ),
//         ],
//       ),
//     ),
//   );
// }

