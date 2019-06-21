package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class c$1
  implements b.b
{
  c$1(c paramc)
  {
  }

  public final void c(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(13697);
    ab.d("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    com.tencent.mm.plugin.account.friend.a.a locala = (com.tencent.mm.plugin.account.friend.a.a)this.gtC.getItem(paramInt1);
    if (locala == null)
    {
      ab.e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", new Object[] { paramString });
      AppMethodBeat.o(13697);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.MobileFriendAdapter", "mobile friend:%s", new Object[] { locala.toString() });
      if (locala.status == 1)
      {
        com.tencent.mm.pluginsdk.ui.applet.a locala1 = new com.tencent.mm.pluginsdk.ui.applet.a(c.a(this.gtC), new c.1.1(this));
        locala1.vjI = new c.1.2(this, locala);
        if ((c.c(this.gtC) instanceof MobileFriendUI))
          ((MobileFriendUI)c.e(this.gtC)).ifE = new c.1.3(this, locala);
        locala1.gyj = locala.Aq();
        locala1.vjO = false;
        paramString = new LinkedList();
        paramString.add(Integer.valueOf(13));
        locala1.b(locala.getUsername(), paramString, false);
      }
      AppMethodBeat.o(13697);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.c.1
 * JD-Core Version:    0.6.2
 */