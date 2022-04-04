import 'dart:developer';

import 'package:flutter/material.dart';
import 'package:dio/dio.dart';

import 'create.page.dart';

class CrudPage extends StatefulWidget {
  const CrudPage({Key? key}) : super(key: key);

  @override
  State<CrudPage> createState() => _CrudPageState();
}

class _CrudPageState extends State<CrudPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        children: [
          TextButton(
            onPressed: () {},
            child: const Text("Criar"),
          ),
          const SizedBox(height: 20),
          TextButton(
            onPressed: () {},
            child: const Text("Editar"),
          ),
          const SizedBox(height: 20),
          TextButton(
            onPressed: () {},
            child: const Text("Deletar"),
          ),
          ElevatedButton(
            child: Text('Criar'),
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => CreatePage()),
              );
            },
            style: ElevatedButton.styleFrom(
                primary: Colors.purple,
                padding: EdgeInsets.symmetric(horizontal: 50, vertical: 20),
                textStyle: TextStyle(fontSize: 30, fontWeight: FontWeight.bold)),
          ),
        ],
      ),
    );

    // ignore: dead_code
    get({required String url}) async {
      try {
        var response = await Dio().get(url);
        return response.data;
      } catch (e) {
        log(e.toString());
      }
    }
  }
}
