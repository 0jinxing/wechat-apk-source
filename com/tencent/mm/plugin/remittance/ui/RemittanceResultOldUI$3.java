package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceResultOldUI$3
  implements Runnable
{
  RemittanceResultOldUI$3(RemittanceResultOldUI paramRemittanceResultOldUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45147);
    if ((RemittanceResultOldUI.c(this.pWQ) == 33) || (RemittanceResultOldUI.c(this.pWQ) == 32))
    {
      this.pWQ.finish();
      AppMethodBeat.o(45147);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(RemittanceResultOldUI.d(this.pWQ))) && (!RemittanceResultOldUI.e(this.pWQ)))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Chat_User", RemittanceResultOldUI.d(this.pWQ));
        localIntent.putExtra("finish_direct", false);
        d.f(this.pWQ, ".ui.chatting.ChattingUI", localIntent);
        AppMethodBeat.o(45147);
      }
      else
      {
        this.pWQ.finish();
        AppMethodBeat.o(45147);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI.3
 * JD-Core Version:    0.6.2
 */