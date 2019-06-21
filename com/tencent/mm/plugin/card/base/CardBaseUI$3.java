package com.tencent.mm.plugin.card.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardBaseUI$3
  implements AdapterView.OnItemLongClickListener
{
  CardBaseUI$3(CardBaseUI paramCardBaseUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(87619);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.CardBaseUI", "onItemLongClick pos is 0");
      AppMethodBeat.o(87619);
    }
    while (true)
    {
      return true;
      int i = paramInt;
      if (paramInt > 0)
        i = paramInt - 1;
      if (i >= this.kav.kan.getCount())
      {
        AppMethodBeat.o(87619);
      }
      else
      {
        paramAdapterView = this.kav.kat.sM(i);
        this.kav.a(paramAdapterView);
        AppMethodBeat.o(87619);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.base.CardBaseUI.3
 * JD-Core Version:    0.6.2
 */