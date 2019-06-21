package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class d$1
  implements b.b
{
  d$1(d paramd)
  {
  }

  public final void c(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(13709);
    ab.i("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    com.tencent.mm.plugin.account.friend.a.a locala = (com.tencent.mm.plugin.account.friend.a.a)this.gtL.getItem(paramInt1);
    if (locala == null)
    {
      ab.e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", new Object[] { paramString });
      AppMethodBeat.o(13709);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.MobileFriendAdapter", "mobile friend:%s", new Object[] { locala.toString() });
      if (locala.status == 1)
      {
        paramString = new com.tencent.mm.pluginsdk.ui.applet.a(d.a(this.gtL), new d.1.1(this));
        paramString.vjI = new d.1.2(this, locala);
        if ((d.c(this.gtL) instanceof MobileFriendUI))
          ((MobileFriendUI)d.e(this.gtL)).ifE = new d.1.3(this, locala);
        paramString.gyj = locala.Aq();
        paramString.vjO = false;
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(Integer.valueOf(13));
        paramString.b(locala.getUsername(), localLinkedList, false);
      }
      AppMethodBeat.o(13709);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.d.1
 * JD-Core Version:    0.6.2
 */