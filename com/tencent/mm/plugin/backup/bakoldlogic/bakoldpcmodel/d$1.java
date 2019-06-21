package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17828);
    d locald = this.jzz;
    locald.jzy = 0;
    locald.jzt = new d.2(locald);
    com.tencent.mm.plugin.backup.g.b.a(5, locald.jzt);
    String str1 = (String)com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().Ry().get(2, null);
    Iterator localIterator = locald.jzq.iterator();
    String str2;
    ak localak;
    if (localIterator.hasNext())
    {
      str2 = (String)localIterator.next();
      localak = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().XR().aoZ(str2);
      if (localak == null)
        break label189;
    }
    label189: for (int i = localak.field_unReadCount; ; i = 0)
    {
      ab.i("MicroMsg.BakPCServer", "backupImp convName:%s, unReadCount:%d", new Object[] { str2, Integer.valueOf(i) });
      if (locald.r(str2, str1, i))
        break;
      ab.i("MicroMsg.BakPCServer", "backupImp.backupChatMsg canceled");
      AppMethodBeat.o(17828);
      while (true)
      {
        return;
        locald.jzu = true;
        ab.i("MicroMsg.BakPCServer", "send conplete waiting to send finishCmd");
        locald.aUI();
        AppMethodBeat.o(17828);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.d.1
 * JD-Core Version:    0.6.2
 */