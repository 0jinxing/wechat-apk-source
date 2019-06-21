package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class r
{
  public static final r.c gZP;

  static
  {
    AppMethodBeat.i(129643);
    gZP = new r.c();
    AppMethodBeat.o(129643);
  }

  private static void a(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    long l = 0L;
    AppMethodBeat.i(129635);
    Object localObject1 = g.RP().Ry();
    Object localObject2 = ac.a.xOm;
    if (!paramBoolean);
    for (paramLong1 = l; ; paramLong1 = Math.max(0L, paramLong1) + l)
    {
      ((z)localObject1).set((ac.a)localObject2, Long.valueOf(paramLong1));
      localObject2 = g.RP().Ry();
      localObject1 = ac.a.xOo;
      if (!paramBoolean)
        paramLong2 = 9223372036854775807L;
      ((z)localObject2).set((ac.a)localObject1, Long.valueOf(paramLong2));
      AppMethodBeat.o(129635);
      return;
      l = bo.anT();
    }
  }

  public static boolean axt()
  {
    AppMethodBeat.i(129636);
    q.axl();
    boolean bool;
    if (!g.RK())
    {
      bool = false;
      AppMethodBeat.o(129636);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)g.RP().Ry().get(ac.a.xOp, Boolean.FALSE)).booleanValue();
      AppMethodBeat.o(129636);
    }
  }

  static r.a axu()
  {
    int i = 0;
    AppMethodBeat.i(129637);
    r.a locala;
    if (!axv())
    {
      locala = r.a.gZQ;
      AppMethodBeat.o(129637);
    }
    while (true)
    {
      return locala;
      int j = ((Integer)g.RP().Ry().get(ac.a.xOg, Integer.valueOf(0))).intValue();
      r.a[] arrayOfa = r.a.values();
      int k = arrayOfa.length;
      while (true)
      {
        if (i >= k)
          break label87;
        locala = arrayOfa[i];
        if (locala.value == j)
        {
          AppMethodBeat.o(129637);
          break;
        }
        i++;
      }
      label87: locala = r.a.gZQ;
      AppMethodBeat.o(129637);
    }
  }

  public static boolean axv()
  {
    AppMethodBeat.i(129638);
    if (!g.RK())
    {
      AppMethodBeat.o(129638);
      bool = false;
      return bool;
    }
    long l = ((Long)g.RP().Ry().get(ac.a.xOd, Long.valueOf(0L))).longValue();
    if (l > bo.anT());
    for (boolean bool = true; ; bool = false)
    {
      if ((!bool) && (l > 0L))
      {
        g.RP().Ry().set(ac.a.xOd, Long.valueOf(0L));
        r.e locale = r.e.hab;
        r.e.axC();
      }
      AppMethodBeat.o(129638);
      break;
    }
  }

  static void axw()
  {
    AppMethodBeat.i(129639);
    q.axl();
    if (!g.RK())
      AppMethodBeat.o(129639);
    while (true)
    {
      return;
      r.e locale = r.e.hab;
      if (!((Boolean)g.RP().Ry().get(ac.a.xOj, Boolean.FALSE)).booleanValue())
      {
        r.e.a((String)g.RP().Ry().get(ac.a.xOe, ""), ((Long)g.RP().Ry().get(ac.a.xOf, Long.valueOf(0L))).longValue(), 0, r.e.axE());
        g.RP().Ry().set(ac.a.xOj, Boolean.TRUE);
      }
      AppMethodBeat.o(129639);
    }
  }

  public static void axx()
  {
    AppMethodBeat.i(129640);
    if (!g.RK())
      AppMethodBeat.o(129640);
    while (true)
    {
      return;
      if (axv())
      {
        b(false, 0L);
        a(false, 0L, 0L);
        r.e locale = r.e.hab;
        r.e.a((String)g.RP().Ry().get(ac.a.xOe, ""), ((Long)g.RP().Ry().get(ac.a.xOf, Long.valueOf(0L))).longValue(), 2, r.e.axE());
      }
      AppMethodBeat.o(129640);
    }
  }

  private static void b(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(129634);
    if (!paramBoolean)
    {
      g.RP().Ry().set(ac.a.xOd, Long.valueOf(0L));
      AppMethodBeat.o(129634);
      return;
    }
    if (paramLong == 0L);
    for (paramLong = 9223372036854775807L; ; paramLong = bo.anT() + Math.max(0L, paramLong))
    {
      g.RP().Ry().set(ac.a.xOd, Long.valueOf(paramLong));
      g.RP().Ry().set(ac.a.xOp, Boolean.TRUE);
      g.RP().Ry().set(ac.a.xOj, Boolean.FALSE);
      r.e locale = r.e.hab;
      r.e.a((String)g.RP().Ry().get(ac.a.xOe, ""), ((Long)g.RP().Ry().get(ac.a.xOf, Long.valueOf(0L))).longValue(), 1, r.e.axE());
      AppMethodBeat.o(129634);
      break;
    }
  }

  public static final class b
    implements bz.a
  {
    private static final b gZU;

    static
    {
      AppMethodBeat.i(129625);
      gZU = new b();
      AppMethodBeat.o(129625);
    }

    public static void axy()
    {
      AppMethodBeat.i(129621);
      q.axl();
      ((p)g.M(p.class)).getSysCmdMsgExtension().a("wxareddot", gZU, true);
      AppMethodBeat.o(129621);
    }

    public static void unregister()
    {
      AppMethodBeat.i(129622);
      q.axl();
      ((p)g.M(p.class)).getSysCmdMsgExtension().b("wxareddot", gZU, true);
      AppMethodBeat.o(129622);
    }

    public final void a(e.a parama)
    {
      AppMethodBeat.i(129623);
      parama = aa.a(parama.eAB.vED);
      if (bo.isNullOrNil(parama))
        AppMethodBeat.o(129623);
      while (true)
      {
        return;
        com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new r.b.1(this, parama));
        AppMethodBeat.o(129623);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.r
 * JD-Core Version:    0.6.2
 */