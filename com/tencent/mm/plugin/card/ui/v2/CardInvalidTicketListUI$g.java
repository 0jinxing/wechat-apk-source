package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "parent", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemLongClick"})
final class CardInvalidTicketListUI$g
  implements MRecyclerView.b
{
  CardInvalidTicketListUI$g(CardInvalidTicketListUI paramCardInvalidTicketListUI)
  {
  }

  public final boolean L(View paramView, int paramInt)
  {
    AppMethodBeat.i(89258);
    ab.i("MicroMsg.CardInvalidTicketListUI", "long click item");
    d locald = this.kpK.bem().tl(paramInt);
    if (locald != null)
      switch (locald.type)
      {
      default:
      case 2:
      }
    while (true)
    {
      AppMethodBeat.o(89258);
      return false;
      paramView = new j((Context)this.kpK.dxU());
      paramView.a((n.c)new CardInvalidTicketListUI.g.a(this, locald));
      paramView.a((n.d)new CardInvalidTicketListUI.g.b(this, locald));
      paramView.cuu();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.g
 * JD-Core Version:    0.6.2
 */