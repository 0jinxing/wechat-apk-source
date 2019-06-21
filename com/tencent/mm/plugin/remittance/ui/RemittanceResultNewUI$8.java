package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceResultNewUI$8
  implements Runnable
{
  RemittanceResultNewUI$8(RemittanceResultNewUI paramRemittanceResultNewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45122);
    if ((RemittanceResultNewUI.k(this.pWO) == 33) || (RemittanceResultNewUI.k(this.pWO) == 32) || (RemittanceResultNewUI.k(this.pWO) == 48))
    {
      this.pWO.finish();
      AppMethodBeat.o(45122);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(RemittanceResultNewUI.l(this.pWO))) && (!RemittanceResultNewUI.m(this.pWO)))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Chat_User", RemittanceResultNewUI.l(this.pWO));
        localIntent.putExtra("finish_direct", false);
        d.f(this.pWO, ".ui.chatting.ChattingUI", localIntent);
        AppMethodBeat.o(45122);
      }
      else
      {
        this.pWO.finish();
        AppMethodBeat.o(45122);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.8
 * JD-Core Version:    0.6.2
 */