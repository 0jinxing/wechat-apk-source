package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$c$a
  implements ViewTreeObserver.OnPreDrawListener
{
  private final int ape;
  private final int rMb;

  static
  {
    AppMethodBeat.i(40363);
    if (!DynamicGridView.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(40363);
      return;
    }
  }

  DynamicGridView$c$a(DynamicGridView.c paramc, int paramInt1, int paramInt2)
  {
    this.rMb = paramInt1;
    this.ape = paramInt2;
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(40362);
    this.rMd.rLT.getViewTreeObserver().removeOnPreDrawListener(this);
    DynamicGridView.a(this.rMd.rLT, DynamicGridView.e(this.rMd.rLT) + this.rMd.yI);
    DynamicGridView.b(this.rMd.rLT, DynamicGridView.f(this.rMd.rLT) + this.rMd.yH);
    DynamicGridView.a(this.rMd.rLT, this.rMb, this.ape);
    new StringBuilder("id ").append(this.rMd.rLT.kO(DynamicGridView.h(this.rMd.rLT)));
    if (DynamicGridView.g(this.rMd.rLT) == null)
      AppMethodBeat.o(40362);
    while (true)
    {
      return true;
      if (DynamicGridView.g(this.rMd.rLT) == null)
      {
        AppMethodBeat.o(40362);
      }
      else
      {
        AssertionError localAssertionError;
        if ((!$assertionsDisabled) && (DynamicGridView.g(this.rMd.rLT) == null))
        {
          localAssertionError = new AssertionError();
          AppMethodBeat.o(40362);
          throw localAssertionError;
        }
        DynamicGridView.g(this.rMd.rLT).setVisibility(0);
        DynamicGridView.b(this.rMd.rLT, this.rMd.rLT.kP(DynamicGridView.h(this.rMd.rLT)));
        if (DynamicGridView.g(this.rMd.rLT) == null)
        {
          AppMethodBeat.o(40362);
        }
        else
        {
          if ((!$assertionsDisabled) && (DynamicGridView.g(this.rMd.rLT) == null))
          {
            localAssertionError = new AssertionError();
            AppMethodBeat.o(40362);
            throw localAssertionError;
          }
          DynamicGridView.g(this.rMd.rLT).setVisibility(4);
          AppMethodBeat.o(40362);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.c.a
 * JD-Core Version:    0.6.2
 */