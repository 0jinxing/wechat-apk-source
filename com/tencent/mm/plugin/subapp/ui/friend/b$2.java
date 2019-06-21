package com.tencent.mm.plugin.subapp.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.applet.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ay;
import java.util.LinkedList;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25347);
    com.tencent.mm.pluginsdk.ui.preference.b localb;
    if ((paramView.getTag() instanceof com.tencent.mm.pluginsdk.ui.preference.b))
    {
      ab.d("MicroMsg.FMessageConversationUI", "addOnClick onClick");
      localb = (com.tencent.mm.pluginsdk.ui.preference.b)paramView.getTag();
      if ((localb == null) || (bo.isNullOrNil(localb.username)))
      {
        ab.e("MicroMsg.FMessageConversationUI", "cpan add contact failed. username is null.");
        AppMethodBeat.o(25347);
      }
    }
    while (true)
    {
      return;
      paramView = com.tencent.mm.pluginsdk.ui.preference.b.a(d.akO().apx(localb.username));
      a locala = new a(b.a(this.stz), new b.2.1(this, localb, paramView));
      ab.d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + localb.username + ", opcode = MM_VERIFYUSER_ADDCONTACT");
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(localb.qvb));
      locala.ajw(paramView.dus);
      locala.b(localb.username, localLinkedList, true);
      AppMethodBeat.o(25347);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.b.2
 * JD-Core Version:    0.6.2
 */