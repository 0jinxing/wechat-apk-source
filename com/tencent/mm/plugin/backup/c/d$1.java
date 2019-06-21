package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.n;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17198);
    e.reset();
    e.aST();
    d.a(this.jsF).begin();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = d.b(this.jsF).keySet().iterator();
    while (true)
    {
      label346: long l;
      if (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        d.aSO();
        Object localObject2 = g.EZ(str) + str;
        if (b.dnO())
        {
          d.a(this.jsF, (String)localObject2, localHashMap1, localHashMap2);
          if (d.c(this.jsF))
          {
            ab.e("MicroMsg.BackupRecoverMerger", "recoverFromSdcardImp Thread has been canceled, msgDataId[%s], transferMsgList[%d], recovering session num[%d]", new Object[] { str, Long.valueOf(d.d(this.jsF)), Integer.valueOf(d.e(this.jsF)) });
            d.aSP();
            d.a(this.jsF).end();
            com.tencent.mm.plugin.backup.h.c.k(localHashMap1);
            d.a(this.jsF, d.f(this.jsF), d.g(this.jsF));
            AppMethodBeat.o(17198);
          }
        }
        else
        {
          while (true)
          {
            return;
            try
            {
              d.a(this.jsF, (String)localObject2, localHashMap1, localHashMap2);
              if (!d.c(this.jsF))
                break label346;
              ab.e("MicroMsg.BackupRecoverMerger", "recoverFromSdcardImp Thread has been canceled, msgDataId[%s], transferMsgList[%d], recovering session num[%d]", new Object[] { str, Long.valueOf(d.d(this.jsF)), Integer.valueOf(d.e(this.jsF)) });
              d.aSP();
              d.a(this.jsF).end();
              com.tencent.mm.plugin.backup.h.c.k(localHashMap1);
              d.a(this.jsF, d.f(this.jsF), d.g(this.jsF));
              AppMethodBeat.o(17198);
            }
            catch (Exception localException)
            {
              ab.printErrStackTrace("MicroMsg.BackupRecoverMerger", localException, "recoverFromSdcard MMThread.run():", new Object[0]);
            }
          }
          continue;
        }
        d.h(this.jsF).add(d.b(this.jsF).get(localException));
        d.i(this.jsF);
        d.j(this.jsF).aSu().jqW = 26;
        localObject2 = d.j(this.jsF).aSu();
        if (d.d(this.jsF) > d.k(this.jsF))
        {
          l = 100L;
          label427: ((com.tencent.mm.plugin.backup.b.e)localObject2).jqZ = ((int)l);
          this.jsF.rl(26);
          d.a(this.jsF).aSR();
          d.aSP();
        }
      }
      try
      {
        Thread.sleep(10L);
        label463: ab.i("MicroMsg.BackupRecoverMerger", "msgDataId[%s] merge finish, transferMsgList[%d], transferSessions size[%d]", new Object[] { localException, Long.valueOf(d.d(this.jsF)), Integer.valueOf(d.h(this.jsF).size()) });
        continue;
        l = d.d(this.jsF) * 100L / d.k(this.jsF);
        break label427;
        this.jsF.rl(30);
        com.tencent.mm.plugin.backup.h.c.k(localHashMap1);
        ab.i("MicroMsg.BackupRecoverMerger", "readFromSdcard build temDB finish! transferMsgList[%d], totalMsgList[%d], transferSession[%d], totalSession[%d]", new Object[] { Long.valueOf(d.d(this.jsF)), Long.valueOf(d.k(this.jsF)), Integer.valueOf(d.h(this.jsF).size()), Integer.valueOf(d.e(this.jsF)) });
        d.a(this.jsF).end();
        if (b.dnO())
        {
          localObject1 = d.j(this.jsF).aSu();
          if (d.h(this.jsF).size() > d.e(this.jsF))
          {
            i = d.e(this.jsF);
            label670: ((com.tencent.mm.plugin.backup.b.e)localObject1).jqX = i;
            localObject1 = d.j(this.jsF).aSu();
            if (d.d(this.jsF) <= d.k(this.jsF))
              break label959;
            l = 100L;
            label710: ((com.tencent.mm.plugin.backup.b.e)localObject1).jqZ = ((int)l);
            label717: d.j(this.jsF).aSu().jqY = d.e(this.jsF);
            ab.dot();
            if (d.l(this.jsF) != d.AU())
            {
              d.a(this.jsF, d.AU());
              d.aSN();
              ab.i("MicroMsg.BackupRecoverMerger", "recoverFromSdcardImp backupRecoverCloseTempDb merge success, restart sync");
              if (d.m(this.jsF) != 1)
                break label1039;
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xPD, Boolean.FALSE);
              label801: if (d.n(this.jsF) != null)
                d.n(this.jsF).aSt();
              aw.ZK().Yq().drx();
              aw.ZK().Yr().drx();
              localObject1 = d.j(this.jsF).aSu();
              if (d.h(this.jsF).size() <= d.e(this.jsF))
                break label1069;
            }
          }
        }
        label1039: label1069: for (int i = d.e(this.jsF); ; i = d.h(this.jsF).size())
        {
          ((com.tencent.mm.plugin.backup.b.e)localObject1).O(27, i, d.e(this.jsF));
          this.jsF.rl(27);
          d.a(this.jsF, d.aSQ());
          d.o(this.jsF);
          d.j(this.jsF).aSw();
          AppMethodBeat.o(17198);
          break;
          i = d.h(this.jsF).size();
          break label670;
          label959: l = d.d(this.jsF) * 100L / d.k(this.jsF);
          break label710;
          d.j(this.jsF).aSu().jqX = d.e(this.jsF);
          d.j(this.jsF).aSu().jqZ = ((int)(d.d(this.jsF) * 100L / d.k(this.jsF)));
          break label717;
          if (d.m(this.jsF) != 2)
            break label801;
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xPG, Boolean.FALSE);
          break label801;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label463;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.d.1
 * JD-Core Version:    0.6.2
 */