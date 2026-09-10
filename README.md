# PsiConnect App (exercício)

App Android simples (Java, sem Kotlin) com 3 telas — marketplace de psicólogos, perfil do médico e agendamento — feito como exercício de navegação e passagem de parâmetro entre `Activity`s via `Intent`.

## Telas

<table>
  <tr>
    <td><img width="180" src="https://github.com/user-attachments/assets/f7c766a1-784c-44eb-b2b3-0cbb62572e83" /></td>
    <td><img width="180" src="https://github.com/user-attachments/assets/0bb84382-39a3-43a8-9f7c-8d57b4783261" /></td>
    <td><img width="180" src="https://github.com/user-attachments/assets/cdf0f8cd-358a-4b23-b320-3d7bd51393b0" /></td>
    <td><img width="180" src="https://github.com/user-attachments/assets/456b9f70-f1d9-4786-a852-743b33a9ac9e" /></td>
  </tr>
</table>

## Como testar

Baixe o APK direto da [Release v1.0](https://github.com/AdrielRattes-SERVIDORES-WEB/psiconnect-mobile-exercicio/releases/download/v1.0/psiconnect-app.apk) e instale no Android (o Play Protect pode pedir "Instalar mesmo assim").

## Estrutura

- `MarketplaceActivity` — lista de psicólogos (`ListView`) + menu de navegação fixo na parte de baixo
- `MedicoActivity` — perfil do profissional (recebe dados via `Intent extras`)
- `AgendamentoActivity` — formulário de agendamento (recebe o nome do médico via `Intent extra`)
- `strings.xml` / `colors.xml` — todo texto e cor centralizados
- `.github/workflows/build-apk.yml` — build automático do `.apk` via GitHub Actions
