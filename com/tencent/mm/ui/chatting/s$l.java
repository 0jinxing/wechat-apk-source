package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$l extends s.e
{
  public s$l(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(30730);
    ay localay = (ay)paramView.getTag();
    int i = localay.tid;
    String str1 = localay.fiE;
    parambi = localay.desc;
    paramView = localay.iconUrl;
    String str2 = localay.secondUrl;
    if (i != 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("geta8key_username", parama.getTalkerUserName());
      localIntent.putExtra("rawUrl", localay.dJv);
      localIntent.putExtra("topic_id", i);
      localIntent.putExtra("topic_name", str1);
      localIntent.putExtra("topic_desc", parambi);
      localIntent.putExtra("topic_icon_url", paramView);
      localIntent.putExtra("topic_ad_url", str2);
      localIntent.putExtra("extra_scence", 22);
      d.b(parama.yTx.getContext(), "emoji", ".ui.EmojiStoreTopicUI", localIntent);
      AppMethodBeat.o(30730);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.DesignerClickListener", "topic id is zero.");
      AppMethodBeat.o(30730);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.l
 * JD-Core Version:    0.6.2
 */