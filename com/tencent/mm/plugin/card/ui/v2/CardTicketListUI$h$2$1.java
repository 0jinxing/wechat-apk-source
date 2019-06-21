package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bih;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class CardTicketListUI$h$2$1
  implements DialogInterface.OnClickListener
{
  CardTicketListUI$h$2$1(CardTicketListUI.h.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(89305);
    Object localObject1 = this.kqk.kqi.kqh;
    Object localObject2 = this.kqk.kqj;
    if (localObject2 == null)
      j.dWJ();
    localObject2 = ((bih)localObject2).vCb;
    j.o(localObject2, "ticketElement!!.user_card_id");
    CardTicketListUI.b((CardTicketListUI)localObject1, (String)localObject2);
    paramDialogInterface.dismiss();
    paramDialogInterface = h.pYm;
    localObject1 = this.kqk.kqj;
    if (localObject1 == null)
      j.dWJ();
    paramInt = ((bih)localObject1).wLB;
    localObject1 = this.kqk.kqj;
    if (localObject1 == null)
      j.dWJ();
    localObject1 = ((bih)localObject1).vCb;
    localObject2 = CardTicketListUI.b(this.kqk.kqi.kqh);
    bih localbih = this.kqk.kqj;
    if (localbih == null)
      j.dWJ();
    String str = localbih.vCb;
    j.o(str, "ticketElement!!.user_card_id");
    localbih = this.kqk.kqj;
    if (localbih == null)
      j.dWJ();
    paramDialogInterface.e(16326, new Object[] { Integer.valueOf(paramInt), localObject1, Integer.valueOf(((c)localObject2).bO(str, localbih.wLB)), Integer.valueOf(4) });
    AppMethodBeat.o(89305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.h.2.1
 * JD-Core Version:    0.6.2
 */