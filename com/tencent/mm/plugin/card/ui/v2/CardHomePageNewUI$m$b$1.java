package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.card.model.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$4$1$2$1"})
final class CardHomePageNewUI$m$b$1
  implements DialogInterface.OnClickListener
{
  CardHomePageNewUI$m$b$1(CardHomePageNewUI.m.b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(89224);
    Object localObject1 = this.kpD.kpB.koY;
    Object localObject2 = this.kpD.kpC.koU;
    if (localObject2 == null)
      j.dWJ();
    localObject2 = ((ns)localObject2).vSR;
    j.o(localObject2, "element!!.card_pack_merchant_id");
    j.p(localObject2, "merchantId");
    ab.i("MicroMsg.CardHomePageNewUI", "do delete merchant: %s", new Object[] { localObject2 });
    new e((String)localObject2).acy().b((a)new CardHomePageNewUI.g((CardHomePageNewUI)localObject1, (String)localObject2));
    paramDialogInterface.dismiss();
    paramDialogInterface = h.pYm;
    localObject1 = this.kpD.kpC.koU;
    if (localObject1 == null)
      j.dWJ();
    paramDialogInterface.e(16324, new Object[] { Integer.valueOf(2), ((ns)localObject1).vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(9), Integer.valueOf(this.kpD.iPU), Integer.valueOf(CardHomePageNewUI.k(this.kpD.kpB.koY)) });
    AppMethodBeat.o(89224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.m.b.1
 * JD-Core Version:    0.6.2
 */