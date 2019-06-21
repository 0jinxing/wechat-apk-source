package com.tencent.mm.plugin.report.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.report.a.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class j
  implements at
{
  private static HashMap<Integer, h.d> jZD;
  private c jOJ;
  private t.a jZF;
  public boolean pWV;
  public HashMap<String, List<d>> pYD;
  public HashMap<String, String> pYE;

  static
  {
    AppMethodBeat.i(72814);
    HashMap localHashMap = new HashMap();
    jZD = localHashMap;
    localHashMap.put(Integer.valueOf("DUPLICATEKVLOG_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return b.fnj;
      }
    });
    AppMethodBeat.o(72814);
  }

  public j()
  {
    AppMethodBeat.i(72808);
    this.pWV = false;
    this.jOJ = new c()
    {
    };
    AppMethodBeat.o(72808);
  }

  public static j cgu()
  {
    AppMethodBeat.i(72811);
    j localj = (j)q.Y(j.class);
    AppMethodBeat.o(72811);
    return localj;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void aa(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(72813);
    if ((this.pWV) && (this.pYE != null))
    {
      ab.v("MicroMsg.SubCoreReport", "put kv info [%s %s %s]", new Object[] { paramString1, paramString2, paramString3 });
      this.pYE.put(ag.ck(paramString1), paramString2 + paramString3);
    }
    AppMethodBeat.o(72813);
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(72810);
    long l = System.currentTimeMillis();
    String str = g.RP().cachePath + "CommonOneMicroMsg.db";
    this.jZF = t.a(hashCode(), str, jZD, false);
    ab.i("MicroMsg.SubCoreReport", "summeranrt onAccountPostReset tid[%d] [%d]ms, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l), bo.dpG() });
    a.xxA.c(this.jOJ);
    this.pYD = new HashMap();
    this.pYE = new HashMap();
    g.RQ();
    g.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(72804);
        if (!g.RK())
          AppMethodBeat.o(72804);
        while (true)
        {
          return;
          bo.o(g.RP().cachePath + "logcat/", "temp_", 10800000L);
          AppMethodBeat.o(72804);
        }
      }

      public final String toString()
      {
        AppMethodBeat.i(72805);
        String str = super.toString() + "|onAccountPostReset";
        AppMethodBeat.o(72805);
        return str;
      }
    });
    AppMethodBeat.o(72810);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(72809);
    if (cgu() != null)
    {
      j localj = cgu();
      if (localj.jZF != null)
      {
        localj.jZF.mJ(localj.hashCode());
        localj.jZF = null;
      }
    }
    a.xxA.d(this.jOJ);
    if (this.pYD != null)
      this.pYD.clear();
    if (this.pYE != null)
      this.pYE.clear();
    AppMethodBeat.o(72809);
  }

  public final void t(long paramLong, String paramString)
  {
    AppMethodBeat.i(72812);
    Object localObject;
    if ((this.pWV) && (this.pYD != null))
    {
      ab.v("MicroMsg.SubCoreReport", "put kv info [%d %s]", new Object[] { Long.valueOf(paramLong), paramString });
      localObject = (List)this.pYD.get(String.valueOf(paramLong));
      if (localObject == null)
      {
        localObject = new LinkedList();
        bool = false;
        ((List)localObject).add(0, new d(paramLong, paramString, bo.anU(), bool));
        this.pYD.put(String.valueOf(paramLong), localObject);
      }
    }
    else
    {
      AppMethodBeat.o(72812);
      return;
    }
    d locald = (d)((List)localObject).get(((List)localObject).size() - 1);
    if (bo.gb(locald.pXQ) < 1000L);
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        locald.pXS = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.j
 * JD-Core Version:    0.6.2
 */