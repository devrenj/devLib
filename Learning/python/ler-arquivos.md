# Python

## Ler arquivos em um diretório

Quando é obtido todos os arquivos da pasta. Usamos o sort( ) para ordenar os arquivos se não me engano por ordem alfabética (A até Z, a até z) algo assim.

Ai ao usar o FOR ele irá percorrer por cada registro na ordem dos índices do FOR ou seja na ordem que o SORT retornou (Alfabética)

Essa parte aqui do código

~~~python

import os

# Pasta dos arquivos 
caminho = '/home/ec2-user/etls/Testes_Wiki/'

# Obter todos os arquivos da pasta
files = os.listdir(caminho)
files.sort()

# Teremos uma lista com todos os arquivos .txt
arquivos_txt = [file for file in files if '.txt' in file]

~~~

print(arquivos_txt)
Se você olhar o print dessa lista (arquivos_txt) é nesta ordem que iremos ler os arquivos.

- Organizando por data de criação

~~~python

import os
import datetime
import pandas as pd

# Pasta dos arquivos 
caminho = '/home/ec2-user/etls/'

# Obter todos os arquivos da pasta
files = os.listdir(caminho)
files.sort()

# Teremos uma lista com todos os arquivos .txt
dict_arquivos = {
    'file': [],
    'created_at': []
}

for file in files:
    #Verificar se é TXT
    if '.txt' in file: 
        # Obter a data de criação em timestamp e converter para Date
        timestamp = os.path.getmtime(f"{caminho}{file}")
        created_at = datetime.datetime.fromtimestamp(timestamp).date()
        
        # Alimentar o Dicionario
        dict_arquivos['file'].append(file)
        dict_arquivos['created_at'].append(created_at)

# Criar o DataFrame com esses dados
df_file = pd.DataFrame(dict_arquivos)

# Ordernar os dados pela data de criação
df_file = df_file.sort_values(by =['created_at'])

~~~