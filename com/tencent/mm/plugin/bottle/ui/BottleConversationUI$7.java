package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.storage.ak;

final class BottleConversationUI$7
  implements AdapterView.OnItemClickListener
{
  BottleConversationUI$7(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18562);
    paramView = (ak)BottleConversationUI.a(this.jKb).getItem(paramInt);
    paramAdapterView = new Intent();
    paramAdapterView.addFlags(67108864);
    paramAdapterView.putExtra("Chat_User", paramView.field_username);
    paramAdapterView.putExtra("finish_direct", true);
    paramAdapterView.putExtra("key_need_send_video", false);
    com.tencent.mm.plugin.bottle.a.gkE.d(paramAdapterView, this.jKb);
    AppMethodBeat.o(18562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.7
 * JD-Core Version:    0.6.2
 */