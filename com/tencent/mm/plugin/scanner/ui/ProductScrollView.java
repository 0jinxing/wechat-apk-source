package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ProductScrollView extends ScrollView
{
  private ProductScrollView.a qcT;

  public ProductScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ProductScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(81077);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.qcT != null)
      this.qcT.bpT();
    AppMethodBeat.o(81077);
  }

  public void setOnScrollListener(ProductScrollView.a parama)
  {
    this.qcT = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductScrollView
 * JD-Core Version:    0.6.2
 */