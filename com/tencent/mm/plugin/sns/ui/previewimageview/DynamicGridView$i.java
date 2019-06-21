package com.tencent.mm.plugin.sns.ui.previewimageview;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$i
  implements DynamicGridView.j
{
  private int yH;
  private int yI;

  public DynamicGridView$i(DynamicGridView paramDynamicGridView, int paramInt1, int paramInt2)
  {
    this.yH = paramInt1;
    this.yI = paramInt2;
  }

  public final void fE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40366);
    DynamicGridView.a(this.rLT, DynamicGridView.e(this.rLT) + this.yI);
    DynamicGridView.b(this.rLT, DynamicGridView.f(this.rLT) + this.yH);
    AppMethodBeat.o(40366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.i
 * JD-Core Version:    0.6.2
 */