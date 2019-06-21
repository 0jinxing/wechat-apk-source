package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;

final class ChattingSendDataToDeviceUI$3$1
  implements Runnable
{
  ChattingSendDataToDeviceUI$3$1(ChattingSendDataToDeviceUI.3 param3, f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30763);
    g.a(this.yKR.yKQ.getBaseContext(), this.kNP.field_packageName, this.yKR.yKQ.yKN, this.kNP.field_appId, this.kNP.field_openId, 0, null, null);
    AppMethodBeat.o(30763);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.3.1
 * JD-Core Version:    0.6.2
 */