package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.j;

final class SendAppMessageWrapperUI$9
  implements DialogInterface.OnCancelListener
{
  SendAppMessageWrapperUI$9(SendAppMessageWrapperUI paramSendAppMessageWrapperUI, j paramj)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35221);
    this.yTe.dhb();
    this.zKA.setResult(-1);
    this.zKA.finish();
    AppMethodBeat.o(35221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.9
 * JD-Core Version:    0.6.2
 */