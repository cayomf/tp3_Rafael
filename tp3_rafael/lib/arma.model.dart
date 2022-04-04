import 'package:json_annotation/json_annotation.dart';

part 'arma.model.g.dart';

@JsonSerializable()
class ArmaModel {
  final String id;
  final String nome;
  final double desconto;
  final String raridade;
  final String ataque;
  final String dano;

  const ArmaModel(
      {required this.id,
      required this.nome,
      required this.desconto,
      required this.raridade,
      required this.ataque,
      required this.dano})
      : super();

  factory ArmaModel.fromJson(Map<String, dynamic> json) => _$ArmaModelFromJson(json);
  Map<String, dynamic> toJson() => _$ArmaModelToJson(this);
}
