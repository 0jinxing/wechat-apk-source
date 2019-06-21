package com.tencent.mm.plugin.qmessage.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.b.a;

final class QConversationUI$10
  implements AdapterView.OnItemLongClickListener
{
  QConversationUI$10(QConversationUI paramQConversationUI, a parama)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24136);
    if (paramInt < QConversationUI.c(this.ptk).getHeaderViewsCount())
    {
      ab.w("MicroMsg.QConversationUI", "on header view long click, ignore");
      AppMethodBeat.o(24136);
    }
    while (true)
    {
      return true;
      this.ptl.a(paramView, paramInt, paramLong, this.ptk, QConversationUI.d(this.ptk), 0, 0);
      AppMethodBeat.o(24136);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.10
 * JD-Core Version:    0.6.2
 */