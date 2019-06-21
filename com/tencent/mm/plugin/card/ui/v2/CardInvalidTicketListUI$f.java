package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"})
final class CardInvalidTicketListUI$f
  implements MRecyclerView.a
{
  CardInvalidTicketListUI$f(CardInvalidTicketListUI paramCardInvalidTicketListUI)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    AppMethodBeat.i(89255);
    ab.i("MicroMsg.CardInvalidTicketListUI", "click item");
    paramView = this.kpK.bem().tl(paramInt);
    if (paramView != null)
      switch (paramView.type)
      {
      default:
        AppMethodBeat.o(89255);
      case 2:
      }
    while (true)
    {
      return;
      Object localObject = paramView.kqe;
      if (localObject == null)
        break;
      paramView = this.kpK;
      localObject = ((bih)localObject).vCb;
      j.o(localObject, "user_card_id");
      CardInvalidTicketListUI.a(paramView, (String)localObject);
      AppMethodBeat.o(89255);
      continue;
      AppMethodBeat.o(89255);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.f
 * JD-Core Version:    0.6.2
 */