package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;

final class CardListSelectedUI$3
  implements AdapterView.OnItemClickListener
{
  CardListSelectedUI$3(CardListSelectedUI paramCardListSelectedUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(88557);
    if (paramView.getAlpha() != 1.0F)
    {
      ab.d("MicroMsg.CardListSelectedUI", "item view is gray, cannot click, do nothing return！");
      AppMethodBeat.o(88557);
      return;
    }
    boolean bool;
    if (this.kmz.kml)
    {
      bool = ((Boolean)this.kmz.kmm.get(Integer.valueOf(paramInt))).booleanValue();
      paramAdapterView = this.kmz.kmm;
      if (!bool)
      {
        bool = true;
        label78: paramAdapterView.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
      }
    }
    while (true)
    {
      CardListSelectedUI.c(this.kmz).notifyDataSetChanged();
      CardListSelectedUI.d(this.kmz);
      AppMethodBeat.o(88557);
      break;
      bool = false;
      break label78;
      while (i < this.kmz.eAF.size())
      {
        this.kmz.kmm.put(Integer.valueOf(i), Boolean.FALSE);
        i++;
      }
      this.kmz.kmm.put(Integer.valueOf(paramInt), Boolean.TRUE);
      CardListSelectedUI.a(this.kmz, (a)this.kmz.eAF.get(paramInt));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI.3
 * JD-Core Version:    0.6.2
 */