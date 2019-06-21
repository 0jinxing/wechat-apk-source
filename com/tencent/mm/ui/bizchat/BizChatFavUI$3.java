package com.tencent.mm.ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatFavUI$3
  implements AdapterView.OnItemClickListener
{
  BizChatFavUI$3(BizChatFavUI paramBizChatFavUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30109);
    paramAdapterView = (com.tencent.mm.aj.a.c)BizChatFavUI.c(this.yEt).getItem(paramInt);
    BizChatFavUI.b(this.yEt, paramAdapterView.field_bizChatLocalId);
    AppMethodBeat.o(30109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI.3
 * JD-Core Version:    0.6.2
 */