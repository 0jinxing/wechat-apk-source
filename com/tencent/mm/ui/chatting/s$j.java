package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$j extends s.e
{
  public s$j(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(30728);
    paramView = (ay)paramView.getTag();
    int i = paramView.tid;
    String str1 = paramView.fiE;
    String str2 = paramView.desc;
    parambi = paramView.iconUrl;
    String str3 = paramView.secondUrl;
    int j = paramView.pageType;
    if (i != 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("geta8key_username", parama.getTalkerUserName());
      localIntent.putExtra("rawUrl", paramView.dJv);
      localIntent.putExtra("set_id", i);
      localIntent.putExtra("set_title", str1);
      localIntent.putExtra("set_iconURL", parambi);
      localIntent.putExtra("set_desc", str2);
      localIntent.putExtra("headurl", str3);
      localIntent.putExtra("pageType", j);
      d.b(parama.yTx.getContext(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
      AppMethodBeat.o(30728);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.DesignerClickListener", "topic id is zero.");
      AppMethodBeat.o(30728);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.j
 * JD-Core Version:    0.6.2
 */