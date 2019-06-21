package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.i;

final class SendAppMessageWrapperUI$2
  implements DialogInterface.OnDismissListener
{
  SendAppMessageWrapperUI$2(SendAppMessageWrapperUI paramSendAppMessageWrapperUI, String paramString, View paramView)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35214);
    ((i)g.K(i.class)).a(this.hno, this.val$view);
    AppMethodBeat.o(35214);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.2
 * JD-Core Version:    0.6.2
 */