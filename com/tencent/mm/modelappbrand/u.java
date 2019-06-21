package com.tencent.mm.modelappbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.HashMap;
import java.util.Map;

public final class u
{
  private static Map<String, Long> fpN;
  private static Map<String, Long> fpO;
  private static Map<String, Long> fpP;
  private static Map<String, Long> fpQ;
  private static Map<String, u.a> fpR;

  static
  {
    AppMethodBeat.i(70641);
    fpN = new HashMap();
    fpO = new HashMap();
    fpP = new HashMap();
    fpQ = new HashMap();
    fpR = new HashMap();
    AppMethodBeat.o(70641);
  }

  public static void B(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(70639);
    ab.i("SearchWidgetStartTrace", "drawEnd %s,succ %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    long l;
    if (paramBoolean)
      if (fpN.containsKey(paramString))
      {
        l = ((Long)fpN.get(paramString)).longValue();
        if (l <= 0L)
          break label80;
        System.currentTimeMillis();
        AppMethodBeat.o(70639);
      }
    while (true)
    {
      return;
      l = 0L;
      break;
      label80: ab.e("SearchWidgetStartTrace", "can't find widget Recv timestamp for appid %s", new Object[] { paramString });
      AppMethodBeat.o(70639);
    }
  }

  public static void a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(70631);
    u.a locala1 = (u.a)fpR.get(paramString1);
    u.a locala2 = locala1;
    if (locala1 == null)
      locala2 = new u.a();
    locala2.csB = paramString2;
    locala2.fmr = paramInt1;
    locala2.fpT = paramInt2;
    locala2.fpS = paramString3;
    fpR.put(paramString1, locala2);
    AppMethodBeat.o(70631);
  }

  public static void abL()
  {
    AppMethodBeat.i(70640);
    ab.i("SearchWidgetStartTrace", "hasInitData %s", new Object[] { Boolean.TRUE });
    AppMethodBeat.o(70640);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70637);
    ab.e("SearchWidgetStartTrace", "widget trace - " + paramString1 + "-" + paramString2, paramArrayOfObject);
    AppMethodBeat.o(70637);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70636);
    ab.i("SearchWidgetStartTrace", "widget trace - " + paramString1 + "-" + paramString2, paramArrayOfObject);
    AppMethodBeat.o(70636);
  }

  public static void pp(String paramString)
  {
    AppMethodBeat.i(70630);
    Object localObject = (u.a)fpR.get(paramString);
    if (localObject != null)
      if (((u.a)localObject).fpU)
      {
        i("SearchWidgetStartTrace", "do not report draw succ agagin", new Object[0]);
        AppMethodBeat.o(70630);
      }
    while (true)
    {
      return;
      ((u.a)localObject).fpU = true;
      v.kT(20);
      localObject = new ad().eZ(pr(paramString));
      ((ad)localObject).cYw = pq(paramString);
      ((ad)localObject).cYs = 12L;
      ((ad)localObject).cYu = 1L;
      paramString = ((ad)localObject).eY(paramString);
      paramString.cYt = System.currentTimeMillis();
      paramString.fa(at.gB(ah.getContext())).ajK();
      AppMethodBeat.o(70630);
    }
  }

  public static int pq(String paramString)
  {
    AppMethodBeat.i(70632);
    paramString = (u.a)fpR.get(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.fmr;
      AppMethodBeat.o(70632);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(70632);
    }
  }

  public static String pr(String paramString)
  {
    AppMethodBeat.i(70633);
    u.a locala = (u.a)fpR.get(paramString);
    if (locala != null)
    {
      paramString = locala.fpS;
      AppMethodBeat.o(70633);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(70633);
    }
  }

  public static int pt(String paramString)
  {
    AppMethodBeat.i(70634);
    paramString = (u.a)fpR.get(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.fpT;
      AppMethodBeat.o(70634);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(70634);
    }
  }

  public static void pu(String paramString)
  {
    AppMethodBeat.i(70638);
    ab.i("SearchWidgetStartTrace", "realInsert %s", new Object[] { paramString });
    AppMethodBeat.o(70638);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70635);
    ab.i("SearchWidgetStartTrace", "widget trace - " + paramString1 + "-" + paramString2, paramArrayOfObject);
    AppMethodBeat.o(70635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.u
 * JD-Core Version:    0.6.2
 */