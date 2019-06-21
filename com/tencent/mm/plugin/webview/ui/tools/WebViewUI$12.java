package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.a;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.r;

final class WebViewUI$12
  implements r
{
  WebViewUI$12(WebViewUI paramWebViewUI)
  {
  }

  public final boolean A(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7819);
    boolean bool;
    if (this.uxp.pzf == null)
    {
      bool = false;
      AppMethodBeat.o(7819);
    }
    while (true)
    {
      return bool;
      bool = this.uxp.pzf.Q(paramMotionEvent);
      AppMethodBeat.o(7819);
    }
  }

  public final boolean B(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7824);
    boolean bool;
    if (this.uxp.pzf == null)
    {
      bool = false;
      AppMethodBeat.o(7824);
    }
    while (true)
    {
      return bool;
      bool = this.uxp.pzf.R(paramMotionEvent);
      AppMethodBeat.o(7824);
    }
  }

  public final boolean C(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7825);
    boolean bool;
    if (this.uxp.pzf == null)
    {
      bool = false;
      AppMethodBeat.o(7825);
    }
    while (true)
    {
      return bool;
      bool = this.uxp.pzf.S(paramMotionEvent);
      AppMethodBeat.o(7825);
    }
  }

  public final void aGs()
  {
    AppMethodBeat.i(7821);
    if (this.uxp.pzf == null)
      AppMethodBeat.o(7821);
    while (true)
    {
      return;
      this.uxp.pzf.dKK();
      AppMethodBeat.o(7821);
    }
  }

  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(7820);
    if (this.uxp.pzf == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(7820);
    }
    while (true)
    {
      return paramBoolean;
      aq.a locala = this.uxp.ulI.cXY();
      if (paramInt4 > locala.una)
        locala.una = paramInt4;
      locala.rCb = paramInt6;
      paramBoolean = this.uxp.pzf.c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      AppMethodBeat.o(7820);
    }
  }

  @TargetApi(9)
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(7822);
    if (this.uxp.pzf == null)
      AppMethodBeat.o(7822);
    while (true)
    {
      return;
      this.uxp.pzf.e(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      if ((paramBoolean2) && (this.uxp.ulI != null))
        this.uxp.ulI.q("mm_scroll_bottom", Boolean.TRUE);
      AppMethodBeat.o(7822);
    }
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(7823);
    if (this.uxp.pzf == null)
      AppMethodBeat.o(7823);
    while (true)
    {
      return;
      this.uxp.pzf.M(paramInt1, paramInt2, paramInt3, paramInt4);
      this.uxp.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(7823);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.12
 * JD-Core Version:    0.6.2
 */