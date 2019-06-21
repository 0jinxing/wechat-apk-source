package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$b$a
  implements ViewTreeObserver.OnPreDrawListener
{
  private final int ape;
  private final View rMa;
  private final int rMb;

  DynamicGridView$b$a(DynamicGridView.b paramb, View paramView, int paramInt1, int paramInt2)
  {
    this.rMa = paramView;
    this.rMb = paramInt1;
    this.ape = paramInt2;
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(40359);
    this.rMc.rLT.getViewTreeObserver().removeOnPreDrawListener(this);
    DynamicGridView.a(this.rMc.rLT, DynamicGridView.e(this.rMc.rLT) + DynamicGridView.b.a(this.rMc));
    DynamicGridView.b(this.rMc.rLT, DynamicGridView.f(this.rMc.rLT) + DynamicGridView.b.b(this.rMc));
    DynamicGridView.a(this.rMc.rLT, this.rMb, this.ape);
    this.rMa.setVisibility(0);
    if (DynamicGridView.g(this.rMc.rLT) != null)
      DynamicGridView.g(this.rMc.rLT).setVisibility(4);
    AppMethodBeat.o(40359);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b.a
 * JD-Core Version:    0.6.2
 */