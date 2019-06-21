package com.tencent.mm.plugin.masssend.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MassSendHistoryUI$10
  implements View.OnTouchListener
{
  MassSendHistoryUI$10(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22803);
    ab.v("MicroMsg.MassSendHistoryUI", "onTouch");
    AppMethodBeat.o(22803);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.10
 * JD-Core Version:    0.6.2
 */