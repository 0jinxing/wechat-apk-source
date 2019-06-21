package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class CardInvalidTicketListUI$i$2
  implements DialogInterface.OnClickListener
{
  public static final 2 kpP;

  static
  {
    AppMethodBeat.i(89262);
    kpP = new 2();
    AppMethodBeat.o(89262);
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(89261);
    paramDialogInterface.dismiss();
    h.pYm.e(16322, new Object[] { Integer.valueOf(12) });
    AppMethodBeat.o(89261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.i.2
 * JD-Core Version:    0.6.2
 */