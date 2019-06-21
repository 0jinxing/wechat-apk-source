package com.tencent.mm.view;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

public final class SmileyPanelScrollView$a
  implements Runnable
{
  long AaL;
  long mStartTime;

  public SmileyPanelScrollView$a(SmileyPanelScrollView paramSmileyPanelScrollView)
  {
  }

  final void dMJ()
  {
    AppMethodBeat.i(62942);
    this.AaL = 300L;
    this.mStartTime = SystemClock.uptimeMillis();
    h.pYm.e(13361, new Object[] { Integer.valueOf(0) });
    AppMethodBeat.o(62942);
  }

  public final void run()
  {
    AppMethodBeat.i(62943);
    dMJ();
    AppMethodBeat.o(62943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyPanelScrollView.a
 * JD-Core Version:    0.6.2
 */