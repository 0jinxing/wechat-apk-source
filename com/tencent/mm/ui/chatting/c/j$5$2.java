package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.an;
import com.tencent.mm.ui.chatting.an.1;
import com.tencent.mm.ui.chatting.an.2;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.k;
import java.util.List;

final class j$5$2
  implements n.d
{
  j$5$2(j.5 param5)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31312);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(31312);
    case 0:
    case 1:
      while (true)
      {
        return;
        j.a(this.yOT.yOP, true);
        k.a(this.yOT.yOP.cgL.yTx.getContext(), j.c(this.yOT.yOP), j.d(this.yOT.yOP), j.e(this.yOT.yOP).field_username, this.yOT.yOP);
        AppMethodBeat.o(31312);
        continue;
        j.a(this.yOT.yOP, false);
        k.a(this.yOT.yOP.cgL.yTx.getContext(), j.c(this.yOT.yOP), j.d(this.yOT.yOP), j.e(this.yOT.yOP).field_username, this.yOT.yOP);
        AppMethodBeat.o(31312);
      }
    case 2:
    }
    Activity localActivity = this.yOT.yOP.cgL.yTx.getContext();
    paramMenuItem = j.e(this.yOT.yOP);
    List localList = j.c(this.yOT.yOP);
    boolean bool = j.d(this.yOT.yOP);
    if (localList.size() != 0)
    {
      if (!com.tencent.mm.ui.chatting.j.eR(localList))
        break label318;
      ab.w("MicroMsg.SendToWeWorkHelper", "isContainUndownloadFile");
      h.a(localActivity, localActivity.getString(2131298780), "", new an.1(), null);
    }
    while (true)
    {
      this.yOT.yOP.dDL();
      break;
      label318: if (!com.tencent.mm.ui.chatting.j.a(true, localList, null))
      {
        ab.w("MicroMsg.SendToWeWorkHelper", "handleInvalidSendToFriendMsg");
        h.d(localActivity, localActivity.getString(2131300631), "", localActivity.getString(2131302491), localActivity.getString(2131296868), new an.2(localActivity, paramMenuItem, localList, bool), null);
      }
      else
      {
        an.a(localActivity, paramMenuItem, localList, bool);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.5.2
 * JD-Core Version:    0.6.2
 */