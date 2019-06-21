package com.tencent.mm.ui;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewChattingTabUI$2
  implements Runnable
{
  NewChattingTabUI$2(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29793);
    Looper.myQueue().addIdleHandler(NewChattingTabUI.f(this.ypr));
    AppMethodBeat.o(29793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.2
 * JD-Core Version:    0.6.2
 */