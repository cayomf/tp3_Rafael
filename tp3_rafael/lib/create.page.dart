import 'dart:convert';

import 'package:dio/dio.dart';
import 'package:flutter/material.dart';

import 'arma.model.dart';

class CreatePage extends StatefulWidget {
  const CreatePage({Key? key}) : super(key: key);

  @override
  State<CreatePage> createState() => _CreatePageState();
}

class _CreatePageState extends State<CreatePage> {
  TextEditingController nome = TextEditingController();
  TextEditingController desconto = TextEditingController();
  TextEditingController dano = TextEditingController();
  TextEditingController raridade = TextEditingController();
  TextEditingController ataque = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        children: [
          TextField(
            controller: nome,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Nome',
            ),
          ),
          TextField(
            controller: desconto,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Desconto',
            ),
          ),
          TextField(
            controller: raridade,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Raridade',
            ),
          ),
          TextField(
            controller: ataque,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Ataque',
            ),
          ),
          TextField(
            controller: dano,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Dano',
            ),
          ),
          ElevatedButton(
            child: Text('Criar'),
            onPressed: createWeapon,
            style: ElevatedButton.styleFrom(
                primary: Colors.purple,
                padding: EdgeInsets.symmetric(horizontal: 50, vertical: 20),
                textStyle: TextStyle(fontSize: 30, fontWeight: FontWeight.bold)),
          ),
        ],
      ),
    );
  }

  void createWeapon() async {
    ArmaModel arma = ArmaModel(
      id: DateTime.now().microsecondsSinceEpoch.toString(),
      ataque: ataque.text,
      dano: dano.text,
      desconto: double.parse(desconto.text),
      nome: nome.text,
      raridade: raridade.text,
    );

    var jsonArma = arma.toJson();
    try {
      await Dio().post('http://192.168.1.72:8080/create',
          data: json.encode(jsonArma), options: Options(headers: {"Content-Type": "application/json"}));
    } catch (e) {
      print(e.toString());
    }
  }
}
