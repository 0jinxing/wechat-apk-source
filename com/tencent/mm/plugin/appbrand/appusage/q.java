package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.protobuf.are;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public enum q
{
  private static volatile long gZC;
  private static volatile are gZD;
  private static final Set<q.b> gZE;

  static
  {
    AppMethodBeat.i(129616);
    gZF = new q[0];
    gZE = Collections.newSetFromMap(new ConcurrentHashMap());
    AppMethodBeat.o(129616);
  }

  public static void a(q.b paramb)
  {
    AppMethodBeat.i(129607);
    gZE.add(paramb);
    AppMethodBeat.o(129607);
  }

  public static boolean axl()
  {
    return true;
  }

  public static boolean axm()
  {
    boolean bool = false;
    AppMethodBeat.i(129609);
    switch (q.3.gZK[axn().ordinal()])
    {
    default:
      AppMethodBeat.o(129609);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(129609);
      continue;
      AppMethodBeat.o(129609);
      bool = true;
      continue;
      if (axo())
      {
        AppMethodBeat.o(129609);
        bool = true;
      }
      else
      {
        if (gZD == null)
          break;
        if (gZD.jsN >= gZD.wuX)
        {
          AppMethodBeat.o(129609);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(129609);
        }
      }
    }
  }

  static q.a axn()
  {
    int i = 0;
    AppMethodBeat.i(129611);
    Object localObject;
    if (!g.RK())
    {
      localObject = q.a.gZL;
      AppMethodBeat.o(129611);
    }
    while (true)
    {
      return localObject;
      localObject = com.tencent.mm.model.c.c.abi().ll("100215");
      if (((com.tencent.mm.storage.c)localObject).isValid())
      {
        int j = bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("isOpenNewNearEntry"), 0);
        q.a[] arrayOfa = q.a.values();
        int k = arrayOfa.length;
        while (true)
        {
          if (i >= k)
            break label99;
          localObject = arrayOfa[i];
          if (((q.a)localObject).value == j)
          {
            AppMethodBeat.o(129611);
            break;
          }
          i++;
        }
      }
      label99: localObject = q.a.gZL;
      AppMethodBeat.o(129611);
    }
  }

  static boolean axo()
  {
    AppMethodBeat.i(129612);
    boolean bool = g.RP().Ry().getBoolean(ac.a.xOq, false);
    AppMethodBeat.o(129612);
    return bool;
  }

  static void axp()
  {
    AppMethodBeat.i(129613);
    g.RP().Ry().set(ac.a.xOq, Boolean.TRUE);
    AppMethodBeat.o(129613);
  }

  public static are axq()
  {
    return gZD;
  }

  public static boolean axr()
  {
    AppMethodBeat.i(129614);
    long l1 = bo.anT();
    long l2;
    boolean bool;
    if ((!g.RK()) || (gZD == null))
    {
      l2 = 0L;
      if (l1 < l2)
        break label47;
      bool = true;
      AppMethodBeat.o(129614);
    }
    while (true)
    {
      return bool;
      l2 = gZC;
      break;
      label47: bool = false;
      AppMethodBeat.o(129614);
    }
  }

  public static void b(q.b paramb)
  {
    AppMethodBeat.i(129608);
    gZE.remove(paramb);
    AppMethodBeat.o(129608);
  }

  public static void clearData()
  {
    gZD = null;
  }

  public static boolean refresh()
  {
    AppMethodBeat.i(129610);
    gZD = null;
    gZC = 0L;
    Object localObject = axn();
    boolean bool;
    if (q.a.gZL == localObject)
    {
      AppMethodBeat.o(129610);
      bool = false;
    }
    while (true)
    {
      return bool;
      PBool localPBool1 = new PBool();
      PBool localPBool2 = new PBool();
      localPBool1.value = false;
      localPBool2.value = false;
      localObject = new ap(Looper.getMainLooper(), new q.1(localPBool2, localPBool1), false);
      long l = TimeUnit.SECONDS.toMillis(20L);
      ((ap)localObject).ae(l, l);
      localObject = (b.a)com.tencent.mm.plugin.appbrand.s.e.bB(new q.2(localPBool1, localPBool2));
      com.tencent.mm.modelgeo.d.agz().b((b.a)localObject, false);
      bool = true;
      AppMethodBeat.o(129610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.q
 * JD-Core Version:    0.6.2
 */