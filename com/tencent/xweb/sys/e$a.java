package com.tencent.xweb.sys;

import android.content.Context;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.r;

final class e$a extends android.webkit.WebView
{
  public r icr;

  public e$a(e parame, Context paramContext)
  {
    super(paramContext);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(84698);
    boolean bool;
    if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getKeyCode() == 4) && (this.AQc.hasEnteredFullscreen()))
    {
      this.AQc.leaveFullscreen();
      bool = true;
      AppMethodBeat.o(84698);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84698);
    }
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(84697);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.AQc.APS != null)
      this.AQc.APS.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.icr != null)
      this.icr.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, this);
    AppMethodBeat.o(84697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.e.a
 * JD-Core Version:    0.6.2
 */