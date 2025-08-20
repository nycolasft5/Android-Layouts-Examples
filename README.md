# Android-Layouts-Examples
Exemplos de Layouts Android (FrameLayout, LinearLayout, RelativeLayout, ConstraintLayout e RecyclerView)

---

# 📌 1️⃣ FrameLayoutExample/README.md

# FrameLayout

## O que é
O FrameLayout organiza os elementos **empilhados uns sobre os outros**. Cada novo elemento é adicionado "por cima" do anterior.

## Quando usar
- Para **sobrepor elementos**, como uma imagem de fundo com texto em cima.  
- Ideal para **elementos simples**, sem muitas regras de alinhamento.

## Exemplo
- activity_frame.xml
- MainActivity.java (LAYOUT_USADO = "FRAME")
```

---

# 📌 2️⃣ LinearLayoutExample/README.md

# LinearLayout

## O que é
O LinearLayout organiza os elementos em **uma linha vertical ou horizontal**.

## Quando usar
- Para **listas simples de elementos** empilhados verticalmente ou horizontalmente.  
- Quando você quer **uma ordem clara** dos elementos, sem sobreposição.

## Exemplo
- activity_linear.xml
- MainActivity.java (LAYOUT_USADO = "LINEAR")
```

---

# 📌 3️⃣ RelativeLayoutExample/README.md

# RelativeLayout

## O que é
O RelativeLayout organiza os elementos **relativamente uns aos outros** ou ao pai.

## Quando usar
- Para **posicionar elementos em relação a outros**, sem precisar de hierarquia complexa.  
- Útil quando precisa alinhar botões, textos ou imagens de forma dinâmica.

## Exemplo
- activity_relative.xml
- MainActivity.java (LAYOUT_USADO = "RELATIVE")
```

---

# 📌 4️⃣ ConstraintLayoutExample/README.md

# ConstraintLayout

## O que é
O ConstraintLayout organiza elementos usando **restrições (constraints)** em relação a outros elementos ou ao pai.

## Quando usar
- Para **layouts complexos e responsivos**.  
- Ideal para **telas com muitos elementos** que precisam se ajustar a diferentes tamanhos de tela.  
- Substitui LinearLayout e RelativeLayout em layouts mais avançados.

## Exemplo
- activity_constraint.xml
- MainActivity.java (LAYOUT_USADO = "CONSTRAINT")
```

---

# 📌 5️⃣ RecyclerViewExample/README.md

# RecyclerView

## O que é
O RecyclerView exibe uma **lista de elementos rolável** de forma eficiente.  
É usado junto com um **Adapter** que popula os itens dinamicamente.

## Quando usar
- Para **listas grandes** que precisam ser recicladas para economizar memória.  
- Ideal para listas de produtos, mensagens, feeds, contatos, etc.

## Exemplo
- activity_recyclerview.xml
- MainActivity.java (LAYOUT_USADO = "RECYCLER")
- SimpleAdapter.java
- item_layout.xml
```

---


