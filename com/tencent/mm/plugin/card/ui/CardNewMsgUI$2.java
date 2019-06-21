package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.h;
import com.tencent.mm.sdk.platformtools.ab;

final class CardNewMsgUI$2
  implements AdapterView.OnItemClickListener
{
  CardNewMsgUI$2(CardNewMsgUI paramCardNewMsgUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(88593);
    if (paramInt == CardNewMsgUI.a(this.kmV).getCount())
    {
      paramInt = 1;
      if (am.baY().baS() > 0)
      {
        am.baY().baT();
        CardNewMsgUI.a(this.kmV).a(null, null);
        if (!CardNewMsgUI.b(this.kmV))
        {
          if (CardNewMsgUI.c(this.kmV).getParent() != null)
          {
            ab.d("MicroMsg.CardNewMsgUI", "remove footer");
            CardNewMsgUI.d(this.kmV).removeFooterView(CardNewMsgUI.c(this.kmV));
          }
          if ((!CardNewMsgUI.a(this.kmV).bdn()) && (CardNewMsgUI.e(this.kmV).getParent() == null) && (paramInt > 0))
          {
            CardNewMsgUI.d(this.kmV).addFooterView(CardNewMsgUI.e(this.kmV));
            ab.i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
          }
        }
        CardNewMsgUI.f(this.kmV);
        CardNewMsgUI.c(this.kmV).setVisibility(8);
        AppMethodBeat.o(88593);
      }
    }
    while (true)
    {
      return;
      paramInt = CardNewMsgUI.a(this.kmV).bdo();
      break;
      CardNewMsgUI.a(this.kmV, paramInt);
      AppMethodBeat.o(88593);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.2
 * JD-Core Version:    0.6.2
 */