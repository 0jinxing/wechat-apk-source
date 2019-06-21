package com.tencent.mm.plugin.bottle.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class BottleConversationUI$6
  implements AdapterView.OnItemLongClickListener
{
  BottleConversationUI$6(BottleConversationUI paramBottleConversationUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18561);
    if (paramInt < BottleConversationUI.c(this.jKb).getHeaderViewsCount())
    {
      ab.w("MicroMsg.Bottle.BottleConversationUI", "on header view long click, ignore");
      AppMethodBeat.o(18561);
    }
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.jKb, BottleConversationUI.d(this.jKb));
      AppMethodBeat.o(18561);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.6
 * JD-Core Version:    0.6.2
 */