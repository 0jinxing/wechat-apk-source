package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.roomsdk.a.b;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.f;
import java.util.LinkedList;

final class ad$4
  implements n.d
{
  ad$4(ad paramad, LinkedList paramLinkedList, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31617);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(31617);
      while (true)
      {
        return;
        ((f)this.yRg.cgL.aF(f.class)).aJ(this.yRi);
        AppMethodBeat.o(31617);
      }
      com.tencent.mm.roomsdk.a.c.a locala = b.alY(this.yRg.cgL.sRl.field_username).L(this.yRj, this.yRg.cgL.sRl.field_username);
      paramMenuItem = this.yRg.cgL.yTx.getContext();
      this.yRg.cgL.yTx.getMMResources().getString(2131297061);
      locala.a(paramMenuItem, this.yRg.cgL.yTx.getMMResources().getString(2131302533), true, new ad.4.1(this, locala));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ad.4
 * JD-Core Version:    0.6.2
 */