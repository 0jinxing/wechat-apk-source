package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.d.d.c;

final class FTSSOSHomeWebViewUI$18
  implements View.OnTouchListener
{
  FTSSOSHomeWebViewUI$18(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI, AbsoluteLayout paramAbsoluteLayout)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8447);
    if (FTSSOSHomeWebViewUI.a(this.uBG) != null)
    {
      paramView = FTSSOSHomeWebViewUI.a(this.uBG);
      d.c localc = paramView.xCt;
      if (localc != null)
        localc.sendMessage(Message.obtain(paramView.xCt, 15, paramMotionEvent));
    }
    boolean bool = this.ucU.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(8447);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.18
 * JD-Core Version:    0.6.2
 */