package com.tencent.mm.plugin.card.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardBaseUI$2
  implements AdapterView.OnItemClickListener
{
  CardBaseUI$2(CardBaseUI paramCardBaseUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(87618);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.CardBaseUI", "onItemClick pos is 0, onListHeaderItemClick()");
      AppMethodBeat.o(87618);
    }
    while (true)
    {
      return;
      int i = paramInt;
      if (paramInt > 0)
        i = paramInt - 1;
      if (i >= this.kav.kan.getCount())
      {
        AppMethodBeat.o(87618);
      }
      else
      {
        paramAdapterView = this.kav.kat.sM(i);
        this.kav.b(paramAdapterView, i);
        AppMethodBeat.o(87618);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.base.CardBaseUI.2
 * JD-Core Version:    0.6.2
 */