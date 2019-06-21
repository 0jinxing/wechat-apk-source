package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CheckCanSubscribeBizUI$3
  implements Runnable
{
  CheckCanSubscribeBizUI$3(CheckCanSubscribeBizUI paramCheckCanSubscribeBizUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29143);
    ab.d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange toUserName = " + CheckCanSubscribeBizUI.d(this.yfJ) + ", userName = " + this.fwC);
    if (CheckCanSubscribeBizUI.d(this.yfJ).equals(this.fwC))
    {
      CheckCanSubscribeBizUI.e(this.yfJ);
      if (!CheckCanSubscribeBizUI.f(this.yfJ))
        CheckCanSubscribeBizUI.b(this.yfJ);
    }
    AppMethodBeat.o(29143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.CheckCanSubscribeBizUI.3
 * JD-Core Version:    0.6.2
 */