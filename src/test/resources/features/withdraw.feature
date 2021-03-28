# language: fr
Fonctionnalité: Retrait
  Plan du Scénario: Retrait d'un montant fixe
    Etant donné que j'ai <Solde> sur mon compte
    Quand je choisis de retirer un montant fixe de <Retrait>
    Alors je devrais <Résultat>
    Et le solde de mon compte devrait être <Reste>

    Exemples: Successful withdrawals
      | Solde | Retrait | Résultat | Reste |
      | 500     | 50         | recevoir 50 | 450 |
      | 500     | 100        | recevoir 100 | 400 |

    Exemples: Attempts to withdraw too much
      | Solde | Retrait | Résultat | Reste |
      | 100     | 200        | voir un message d'erreur | 100 |
      | 0       | 100        | voir un message d'erreur | 0   |
