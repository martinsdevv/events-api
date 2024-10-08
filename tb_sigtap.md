classDiagram
direction BT
class financiamentos {
   varchar(100) nome
   varchar(6) data_competencia
   varchar(2) id
}
class forma_organizacao {
   varchar(100) nome
   varchar(6) data_competencia
   varchar(2) grupo_id
   varchar(2) sub_grupo_id
   varchar(2) id
}
class grupos {
   varchar(100) nome
   varchar(6) data_competencia
   varchar(2) id
}
class procedimentos {
   varchar(250) nome
   smallint tp_complexidade
   char tp_sexo
   integer qtd_maxima_execucao
   integer qtd_dias_permanencia
   integer qtd_pontos
   integer val_idade_minima
   integer val_idade_maxima
   smallint val_sh
   smallint val_sa
   smallint val_sp
   varchar(6) data_competencia
   varchar(2) financiamento_id
   varchar(2) id
}
class sub_grupos {
   varchar(2) grupo_id
   varchar(100) nome
   varchar(6) data
   varchar(2) id
}

forma_organizacao  -->  grupos : grupo_id:id
forma_organizacao  -->  sub_grupos : sub_grupo_id:id
procedimentos  -->  financiamentos : financiamento_id:id
sub_grupos  -->  grupos : grupo_id:id
