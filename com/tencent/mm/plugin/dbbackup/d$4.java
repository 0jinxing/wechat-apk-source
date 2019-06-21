package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.be;
import java.util.Arrays;
import java.util.List;

final class d$4
  implements Runnable
{
  d$4(d paramd, com.tencent.mm.vfs.b paramb, String paramString, b paramb1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18973);
    try
    {
      Thread.sleep(200L);
      label12: aw.ZK();
      Object localObject1 = c.Rt();
      Object localObject2 = (String)localObject1 + this.kIT.getName().replace(".db", "temp.db");
      ab.i("MicroMsg.SubCoreDBBackup", "temp db path is %s", new Object[] { localObject2 });
      this.kIT.o(new com.tencent.mm.vfs.b((String)localObject2));
      String str = (String)localObject1 + "sqlTemp.sql";
      List localList = Arrays.asList(new String[] { "getcontactinfo", "contact", "contact_ext", "ContactCmdBuf", "rcontact", "img_flag", "userinfo" });
      localObject1 = new int[1];
      long l = System.currentTimeMillis();
      aw.ZK();
      boolean bool = c.Ru().a((String)localObject2, this.val$key, str, localList, new d.4.1(this, (int[])localObject1));
      if (bool)
      {
        aw.ZK();
        c.XO().bOz();
        aw.ZK();
        c.XR().dsL();
        aw.ZK();
        c.XO().bOB();
        aw.ZK();
        c.XO().bOA();
        i = 12;
        com.tencent.mm.plugin.report.service.h.pYm.a(181L, i, 1L, true);
        l = System.currentTimeMillis() - l;
        ab.i("MicroMsg.SubCoreDBBackup", "execute %d sql and last %d", new Object[] { Integer.valueOf(localObject1[0]), Long.valueOf(l) });
        localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
        if (!bool)
          break label385;
        i = 1;
        label306: ((com.tencent.mm.plugin.report.service.h)localObject2).e(11224, new Object[] { Integer.valueOf(i), localObject1, Long.valueOf(l) });
        aw.RS().doM();
        if (this.kIC != null)
        {
          localObject1 = this.kIC;
          if (!bool)
            break label391;
        }
      }
      label385: label391: for (int i = 0; ; i = -1)
      {
        ((b)localObject1).tL(i);
        AppMethodBeat.o(18973);
        return;
        i = 15;
        break;
        i = 0;
        break label306;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label12;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.4
 * JD-Core Version:    0.6.2
 */