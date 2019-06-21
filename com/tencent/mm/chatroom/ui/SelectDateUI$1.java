package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class SelectDateUI$1
  implements Runnable
{
  SelectDateUI$1(SelectDateUI paramSelectDateUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104380);
    SelectDateUI.a(this.emr);
    SelectDateUI.f(this.emr).post(new SelectDateUI.1.1(this));
    AppMethodBeat.o(104380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDateUI.1
 * JD-Core Version:    0.6.2
 */