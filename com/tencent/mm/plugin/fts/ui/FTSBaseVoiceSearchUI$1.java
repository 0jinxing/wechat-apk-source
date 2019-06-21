package com.tencent.mm.plugin.fts.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.d;

final class FTSBaseVoiceSearchUI$1
  implements View.OnTouchListener
{
  FTSBaseVoiceSearchUI$1(FTSBaseVoiceSearchUI paramFTSBaseVoiceSearchUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(61782);
    this.mIx.mIu.clearFocus();
    this.mIx.aqX();
    AppMethodBeat.o(61782);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.1
 * JD-Core Version:    0.6.2
 */