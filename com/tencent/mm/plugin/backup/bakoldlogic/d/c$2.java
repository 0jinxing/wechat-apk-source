package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.f;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.a;
import com.tencent.mm.cd.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

final class c$2
  implements h.a
{
  c$2(c paramc)
  {
  }

  public final void RF()
  {
    AppMethodBeat.i(18023);
    if (this.jBg.jBe != null)
    {
      g localg = this.jBg.jBe;
      Iterator localIterator = localg.ybM.keySet().iterator();
      while (localIterator.hasNext())
        ((i)localg.ybM.get(localIterator.next())).dvy();
    }
    AppMethodBeat.o(18023);
  }

  public final void RG()
  {
  }

  public final void RH()
  {
    AppMethodBeat.i(18024);
    g localg;
    if (this.jBg.jBe != null)
    {
      localg = this.jBg.jBe;
      if (localg.ybN.size() != 0)
      {
        ab.i("MicroMsg.MemoryStorage", "attachTable begin stg:%s size:%d", new Object[] { "stg_null", Integer.valueOf(localg.ybN.size()) });
        if (localg.ybk == null)
        {
          ab.e("MicroMsg.MemoryStorage", "attachTable db is null");
          AppMethodBeat.o(18024);
        }
      }
    }
    while (true)
    {
      return;
      label133: g.a locala;
      if (localg.ybK.inTransaction())
      {
        ab.w("MicroMsg.MemoryStorage", "attachTable is in transcation ,give up attach table size:%d", new Object[] { Integer.valueOf(localg.ybN.size()) });
        AppMethodBeat.o(18024);
        continue;
        locala = (g.a)localg.ybN.peek();
        if (locala == null)
          localg.ybN.poll();
      }
      else
      {
        while (true)
        {
          String str;
          while (true)
          {
            if (localg.ybN.size() <= 0)
              break label635;
            if (!localg.ybK.inTransaction())
              break label133;
            ab.w("MicroMsg.MemoryStorage", "attachTable is in transcation , break attach table size:%d", new Object[] { Integer.valueOf(localg.ybN.size()) });
            AppMethodBeat.o(18024);
            break;
            str = locala.getTableName();
            if (bo.isNullOrNil(str))
            {
              ab.e("MicroMsg.MemoryStorage", "attachTable Error table Name :%s", new Object[] { str });
              localg.ybN.poll();
            }
            else if (f.a(localg.ybk, str))
            {
              ab.e("MicroMsg.MemoryStorage", "attachTable Error Attach table twice :%s", new Object[] { str });
              localg.ybN.poll();
            }
            else if (localg.aqv(str) != 0)
            {
              try
              {
                if (localg.vcA)
                {
                  localg.ybk.execSQL("DETACH DATABASE old");
                  ab.i("MicroMsg.MemoryStorage", "DETACH DATABASE ");
                  localg.vcA = false;
                }
                Object localObject1;
                Object localObject2;
                if (bo.isNullOrNil(localg.ybK.getKey()))
                {
                  localObject1 = localg.ybk;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>("ATTACH DATABASE '");
                  ((f)localObject1).execSQL(localg.ybK.getPath() + "' AS old ");
                }
                while (true)
                {
                  ab.i("MicroMsg.MemoryStorage", "ATTACH DATABASE ");
                  localg.vcA = true;
                  if (localg.aqv(str) == 0)
                    break label542;
                  ab.e("MicroMsg.MemoryStorage", "copy table failed :".concat(String.valueOf(str)));
                  AppMethodBeat.o(18024);
                  break;
                  localObject2 = localg.ybk;
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>("ATTACH DATABASE '");
                  ((f)localObject2).execSQL(localg.ybK.getPath() + "' AS old KEY '" + localg.ybK.getKey() + "'");
                }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  localg.vcA = false;
                  ab.e("MicroMsg.MemoryStorage", "ERROR : attach disk db [%s] , will do again !", new Object[] { localException.getMessage() });
                  ab.e("MicroMsg.MemoryStorage", "exception:%s", new Object[] { bo.l(localException) });
                }
              }
            }
          }
          label542: ab.i("MicroMsg.MemoryStorage", "attachTable %s succ , waitsize:%d finsize:%d", new Object[] { str, Integer.valueOf(localg.ybN.size()), Integer.valueOf(localg.ybM.size()) });
          i locali = new i(localg.ybK, str);
          localg.ybM.put(str, locali);
          locala.a(localg);
          localg.ybN.poll();
        }
        label635: AppMethodBeat.o(18024);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.c.2
 * JD-Core Version:    0.6.2
 */