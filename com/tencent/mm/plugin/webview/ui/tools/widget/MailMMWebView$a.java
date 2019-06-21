package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailMMWebView$a extends FrameLayout
{
  public MailMMWebView$a(MailMMWebView paramMailMMWebView, Context paramContext)
  {
    super(paramContext);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10037);
    boolean bool;
    if ((!MailMMWebView.b(this.uJQ)) && (!MailMMWebView.c(this.uJQ)))
    {
      bool = false;
      AppMethodBeat.o(10037);
      return bool;
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      super.dispatchTouchEvent(paramMotionEvent);
      bool = true;
      AppMethodBeat.o(10037);
      break;
      MailMMWebView.d(this.uJQ);
      MailMMWebView.e(this.uJQ);
    }
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(10038);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this == MailMMWebView.f(this.uJQ)) && (this.uJQ.getTitleHeight() > 0))
    {
      this.uJQ.dcS();
      AppMethodBeat.o(10038);
    }
    while (true)
    {
      return;
      if ((this == MailMMWebView.g(this.uJQ)) && (this.uJQ.getBottomHeight() > 0))
        this.uJQ.dcT();
      AppMethodBeat.o(10038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView.a
 * JD-Core Version:    0.6.2
 */