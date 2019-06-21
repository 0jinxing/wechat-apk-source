package com.tencent.mm.plugin.order.ui.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.order.model.MallTransactionObject;

final class a$3$1
  implements DialogInterface.OnClickListener
{
  a$3$1(a.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43886);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("transaction_id", this.peu.pbT.cAa);
    paramDialogInterface.putExtra("receiver_name", this.peu.pbT.pcA);
    paramDialogInterface.putExtra("resend_msg_from_flag", 1);
    d.b(this.peu.val$context, "remittance", ".ui.RemittanceResendMsgUI", paramDialogInterface);
    AppMethodBeat.o(43886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.3.1
 * JD-Core Version:    0.6.2
 */