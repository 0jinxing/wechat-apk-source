package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery;
import com.tencent.mm.ui.widget.a.e.c;

final class RemittanceDetailUI$17
  implements a.a
{
  RemittanceDetailUI$17(RemittanceDetailUI paramRemittanceDetailUI, NetSceneTenpayRemittanceQuery paramNetSceneTenpayRemittanceQuery)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45016);
    new d(this.pVw).a(this.pVz.pQp, new e.c()
    {
      public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
      {
        AppMethodBeat.i(45015);
        if (paramAnonymousBoolean)
        {
          paramAnonymousString = new Intent();
          paramAnonymousString.putExtra("transaction_id", RemittanceDetailUI.17.this.pVw.pVl);
          paramAnonymousString.putExtra("transfer_id", RemittanceDetailUI.17.this.pVw.pRG);
          paramAnonymousString.putExtra("receiver_name", RemittanceDetailUI.b(RemittanceDetailUI.17.this.pVw));
          paramAnonymousString.putExtra("resend_msg_from_flag", 3);
          RemittanceDetailUI.17.this.pVw.an(paramAnonymousString);
        }
        AppMethodBeat.o(45015);
      }
    });
    AppMethodBeat.o(45016);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.17
 * JD-Core Version:    0.6.2
 */