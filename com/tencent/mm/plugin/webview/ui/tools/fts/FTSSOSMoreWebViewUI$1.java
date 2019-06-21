package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;

final class FTSSOSMoreWebViewUI$1
  implements View.OnTouchListener
{
  FTSSOSMoreWebViewUI$1(FTSSOSMoreWebViewUI paramFTSSOSMoreWebViewUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8523);
    this.uBX.dby().mLL.clearFocus();
    this.uBX.aqX();
    AppMethodBeat.o(8523);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI.1
 * JD-Core Version:    0.6.2
 */