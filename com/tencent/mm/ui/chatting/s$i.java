package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$i extends s.e
{
  public s$i(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(30727);
    paramView = (ay)paramView.getTag();
    int i = paramView.designerUIN;
    parambi = paramView.designerName;
    String str = paramView.designerRediretctUrl;
    if (i != 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("geta8key_username", parama.getTalkerUserName());
      localIntent.putExtra("rawUrl", paramView.dJv);
      localIntent.putExtra("uin", i);
      localIntent.putExtra("name", parambi);
      localIntent.putExtra("rediret_url", str);
      localIntent.putExtra("extra_scence", 22);
      d.b(parama.yTx.getContext(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", localIntent);
    }
    AppMethodBeat.o(30727);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.i
 * JD-Core Version:    0.6.2
 */