package com.tencent.mm.plugin.subapp.ui.friend;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class FMessageConversationUI$4
  implements AdapterView.OnItemLongClickListener
{
  FMessageConversationUI$4(FMessageConversationUI paramFMessageConversationUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25361);
    if (paramInt < FMessageConversationUI.b(this.stR).getHeaderViewsCount())
    {
      ab.w("MicroMsg.FMessageConversationUI", "on header view long click, ignore");
      AppMethodBeat.o(25361);
    }
    while (true)
    {
      return true;
      int i = FMessageConversationUI.b(this.stR).getHeaderViewsCount();
      this.jKd.a(paramView, paramInt - i, paramLong, this.stR, FMessageConversationUI.c(this.stR));
      AppMethodBeat.o(25361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.4
 * JD-Core Version:    0.6.2
 */