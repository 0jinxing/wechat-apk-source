package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;

final class FTSSOSHomeWebViewUI$13
  implements View.OnTouchListener
{
  FTSSOSHomeWebViewUI$13(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8442);
    this.uBG.dby().mLL.clearFocus();
    this.uBG.aqX();
    AppMethodBeat.o(8442);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.13
 * JD-Core Version:    0.6.2
 */