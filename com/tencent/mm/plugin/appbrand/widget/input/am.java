package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class am
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final View jhl;
  private final am.a jhm;
  private boolean jhn;
  private int lastHeight;
  private int lastWidth;

  private am(View paramView, am.a parama)
  {
    this.jhl = paramView;
    this.jhm = parama;
  }

  public static void a(View paramView, am.a parama)
  {
    AppMethodBeat.i(67826);
    paramView = new am(paramView, parama);
    paramView.jhl.getViewTreeObserver().addOnGlobalLayoutListener(paramView);
    AppMethodBeat.o(67826);
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(67827);
    if (!this.jhn)
    {
      this.jhn = true;
      this.lastWidth = this.jhl.getWidth();
      this.lastHeight = this.jhl.getHeight();
      AppMethodBeat.o(67827);
    }
    while (true)
    {
      return;
      if ((this.jhl.getWidth() != this.lastWidth) || (this.jhl.getHeight() != this.lastHeight))
      {
        this.jhm.aQk();
        this.lastWidth = this.jhl.getWidth();
        this.lastHeight = this.jhl.getHeight();
      }
      AppMethodBeat.o(67827);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.am
 * JD-Core Version:    0.6.2
 */