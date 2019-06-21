package com.tencent.mm.ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class BizChatFavUI$2
  implements AdapterView.OnItemLongClickListener
{
  BizChatFavUI$2(BizChatFavUI paramBizChatFavUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30108);
    if (paramInt < BizChatFavUI.e(this.yEt).getHeaderViewsCount())
    {
      ab.w("MicroMsg.BizChatFavUI", "on header view long click, ignore");
      AppMethodBeat.o(30108);
    }
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.yEt, BizChatFavUI.g(this.yEt));
      AppMethodBeat.o(30108);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI.2
 * JD-Core Version:    0.6.2
 */