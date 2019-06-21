package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.i;

final class SelectConversationUI$6
  implements DialogInterface.OnDismissListener
{
  SelectConversationUI$6(SelectConversationUI paramSelectConversationUI, String paramString, View paramView)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35130);
    ((i)g.K(i.class)).a(this.hno, this.val$view);
    AppMethodBeat.o(35130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.6
 * JD-Core Version:    0.6.2
 */