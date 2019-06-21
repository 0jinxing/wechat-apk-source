package com.tencent.mm.plugin.fts.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.a;

final class FTSBaseUI$1
  implements View.OnTouchListener
{
  FTSBaseUI$1(FTSBaseUI paramFTSBaseUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(61779);
    FTSBaseUI.a(this.mIt).getFtsEditText().mLL.clearFocus();
    this.mIt.aqX();
    AppMethodBeat.o(61779);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseUI.1
 * JD-Core Version:    0.6.2
 */