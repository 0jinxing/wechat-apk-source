package com.tencent.mm.plugin.readerapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.d.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.bm;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.vfs.b;
import java.util.HashMap;
import java.util.List;

public class g
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private bm pEL;
  private c pEM;
  private a pEN;
  private d pEO;
  private f pEP;

  static
  {
    AppMethodBeat.i(76783);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("READERAPPINFO_TABLE".hashCode()), new g.1());
    AppMethodBeat.o(76783);
  }

  public g()
  {
    AppMethodBeat.i(76769);
    this.pEM = new c();
    this.pEN = new a();
    this.pEO = new d();
    this.pEP = new f();
    AppMethodBeat.o(76769);
  }

  private static void a(final int paramInt, g.a parama)
  {
    AppMethodBeat.i(76780);
    if (!com.tencent.mm.kernel.g.RK())
    {
      c(parama);
      AppMethodBeat.o(76780);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RS().aa(new Runnable()
      {
        public final void run()
        {
          int i = 0;
          AppMethodBeat.i(76765);
          Object localObject = new b(com.tencent.mm.plugin.i.c.XW());
          if ((!((b)localObject).exists()) || (!((b)localObject).isDirectory()))
          {
            g.d(this.pEQ);
            AppMethodBeat.o(76765);
          }
          while (true)
          {
            return;
            b[] arrayOfb = ((b)localObject).dMF();
            if ((arrayOfb == null) || (arrayOfb.length <= 0))
            {
              g.d(this.pEQ);
              AppMethodBeat.o(76765);
            }
            else
            {
              localObject = String.format("reader_%d_", new Object[] { Integer.valueOf(paramInt) });
              String str = String.format("ReaderApp_%d", new Object[] { Integer.valueOf(paramInt) });
              while (i < arrayOfb.length)
              {
                if (arrayOfb[i].getName().startsWith((String)localObject))
                  arrayOfb[i].delete();
                if (arrayOfb[i].getName().startsWith(str))
                  arrayOfb[i].delete();
                i++;
              }
              g.d(this.pEQ);
              AppMethodBeat.o(76765);
            }
          }
        }

        public final String toString()
        {
          AppMethodBeat.i(76766);
          String str = super.toString() + "|deleteAllPic";
          AppMethodBeat.o(76766);
          return str;
        }
      });
      AppMethodBeat.o(76780);
    }
  }

  public static void a(g.a parama)
  {
    AppMethodBeat.i(76774);
    cdZ().kJ(20);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().aoX("newsapp");
    a(20, parama);
    AppMethodBeat.o(76774);
  }

  public static void b(g.a parama)
  {
    AppMethodBeat.i(76775);
    cdZ().kJ(11);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().aoX("blogapp");
    a(11, parama);
    AppMethodBeat.o(76775);
  }

  private static void c(g.a parama)
  {
    AppMethodBeat.i(76779);
    al.d(new g.2(parama));
    AppMethodBeat.o(76779);
  }

  public static void cU(String paramString, int paramInt)
  {
    AppMethodBeat.i(76777);
    n(cdZ().Q(paramString, paramInt), paramInt);
    AppMethodBeat.o(76777);
  }

  private static g cdY()
  {
    AppMethodBeat.i(76770);
    g localg = (g)com.tencent.mm.model.q.Y(g.class);
    AppMethodBeat.o(76770);
    return localg;
  }

  public static bm cdZ()
  {
    AppMethodBeat.i(76771);
    com.tencent.mm.kernel.g.RN().QU();
    if (cdY().pEL == null)
      cdY().pEL = new bm(com.tencent.mm.kernel.g.RP().eJN);
    bm localbm = cdY().pEL;
    AppMethodBeat.o(76771);
    return localbm;
  }

  public static void jA(long paramLong)
  {
    AppMethodBeat.i(76776);
    n(cdZ().fn(paramLong), 20);
    AppMethodBeat.o(76776);
  }

  private static void n(List<bl> paramList, int paramInt)
  {
    AppMethodBeat.i(76778);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(76778);
    while (true)
    {
      return;
      int i = 0;
      if (i < paramList.size())
      {
        if (i == 0)
          bo.deleteFile(com.tencent.mm.pluginsdk.model.q.v(((bl)paramList.get(i)).aan(), paramInt, "@T"));
        while (true)
        {
          i++;
          break;
          bo.deleteFile(com.tencent.mm.pluginsdk.model.q.v(((bl)paramList.get(i)).aan(), paramInt, "@S"));
        }
      }
      AppMethodBeat.o(76778);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(76781);
    d.a.a(this.pEM);
    com.tencent.mm.kernel.g.RS().aa(new g.4(this));
    com.tencent.mm.sdk.b.a.xxA.c(this.pEN);
    com.tencent.mm.sdk.b.a.xxA.c(this.pEO);
    com.tencent.mm.sdk.b.a.xxA.c(this.pEP);
    e locale = e.pEK;
    AppMethodBeat.o(76781);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(76773);
    if ((0x80000 & paramInt) != 0)
      a(null);
    if ((0x40000 & paramInt) != 0)
      b(null);
    AppMethodBeat.o(76773);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(76772);
    d.a.b(this.pEM);
    com.tencent.mm.sdk.b.a.xxA.d(this.pEN);
    com.tencent.mm.sdk.b.a.xxA.d(this.pEO);
    com.tencent.mm.sdk.b.a.xxA.d(this.pEP);
    e locale = e.pEK;
    AppMethodBeat.o(76772);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.c.g
 * JD-Core Version:    0.6.2
 */