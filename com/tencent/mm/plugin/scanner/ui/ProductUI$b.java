package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductUI$b
{
  int acV;
  ProductScrollView qdA;
  boolean qdB;
  private ProductScrollView.a qdC;

  public ProductUI$b(ProductUI paramProductUI)
  {
    AppMethodBeat.i(81104);
    this.qdC = new ProductUI.b.1(this);
    this.qdA = ((ProductScrollView)this.qdu.findViewById(2131826575));
    this.qdA.setOnScrollListener(this.qdC);
    this.acV = ProductUI.w(this.qdu);
    AppMethodBeat.o(81104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.b
 * JD-Core Version:    0.6.2
 */