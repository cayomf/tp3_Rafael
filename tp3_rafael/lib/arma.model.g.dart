// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'arma.model.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

ArmaModel _$ArmaModelFromJson(Map<String, dynamic> json) => ArmaModel(
      id: json['id'] as String,
      nome: json['nome'] as String,
      desconto: (json['desconto'] as num).toDouble(),
      raridade: json['raridade'] as String,
      ataque: json['ataque'] as String,
      dano: json['dano'] as String,
    );

Map<String, dynamic> _$ArmaModelToJson(ArmaModel instance) => <String, dynamic>{
      'id': instance.id,
      'nome': instance.nome,
      'desconto': instance.desconto,
      'raridade': instance.raridade,
      'ataque': instance.ataque,
      'dano': instance.dano,
    };
