package com.tencent.soter.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.c;
import com.tencent.soter.a.f.e;
import com.tencent.soter.a.g.h;
import com.tencent.soter.a.g.i;
import com.tencent.soter.a.g.k;
import com.tencent.soter.a.g.l;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.g;

public final class a
{
  public static boolean Ri(int paramInt)
  {
    AppMethodBeat.i(10458);
    boolean bool = com.tencent.soter.a.c.a.dRe().isInit();
    String str = (String)com.tencent.soter.a.c.a.dRe().dRg().get(paramInt);
    if ((bool) && (!g.isNullOrNil(str)))
      if (com.tencent.soter.core.a.cn(str, false).errCode == 0)
      {
        bool = true;
        AppMethodBeat.o(10458);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(10458);
      bool = false;
      continue;
      if (!bool)
      {
        d.w("Soter.SoterWrapperApi", "soter: not initialized yet", new Object[0]);
        AppMethodBeat.o(10458);
        bool = false;
      }
      else
      {
        d.w("Soter.SoterWrapperApi", "soter: scene not registered in init. please make sure", new Object[0]);
        AppMethodBeat.o(10458);
        bool = false;
      }
    }
  }

  public static void a(com.tencent.soter.a.b.b<com.tencent.soter.a.b.a> paramb, com.tencent.soter.a.g.b paramb1)
  {
    AppMethodBeat.i(10456);
    d.i("Soter.SoterWrapperApi", "soter: request authorize provide challenge. scene: %d", new Object[] { Integer.valueOf(paramb1.gOW) });
    if ((paramb1.Awh == 1) || (paramb1.Awh == 2))
    {
      paramb1 = new i(paramb1);
      paramb1.Awl = paramb;
      if (!com.tencent.soter.a.g.f.dRn().a(paramb1, new com.tencent.soter.a.b.a()))
        d.d("Soter.SoterWrapperApi", "soter: add 2.0 requestAuthorizeAndSign task failed.", new Object[0]);
      AppMethodBeat.o(10456);
    }
    while (true)
    {
      return;
      paramb1 = new h(paramb1);
      paramb1.Awl = paramb;
      if (!com.tencent.soter.a.g.f.dRn().a(paramb1, new com.tencent.soter.a.b.a()))
        d.d("Soter.SoterWrapperApi", "soter: add 1.0 requestAuthorizeAndSign task failed.", new Object[0]);
      AppMethodBeat.o(10456);
    }
  }

  public static void a(com.tencent.soter.a.b.b<c> paramb, boolean paramBoolean, int paramInt, e parame1, e parame2)
  {
    AppMethodBeat.i(10455);
    d.i("Soter.SoterWrapperApi", "soter: starting prepare auth key: %d", new Object[] { Integer.valueOf(paramInt) });
    parame1 = new l(paramInt, parame1, parame2, paramBoolean);
    parame1.Awl = paramb;
    if (!com.tencent.soter.a.g.f.dRn().a(parame1, new c()))
      d.d("Soter.SoterWrapperApi", "soter: add prepareAuthKey task failed.", new Object[0]);
    AppMethodBeat.o(10455);
  }

  public static void a(com.tencent.soter.a.b.b<c> paramb, boolean paramBoolean, e parame)
  {
    AppMethodBeat.i(10454);
    d.i("Soter.SoterWrapperApi", "soter: starting prepare ask key. ", new Object[0]);
    parame = new k(parame, paramBoolean);
    parame.Awl = paramb;
    if (!com.tencent.soter.a.g.f.dRn().a(parame, new c()))
      d.d("Soter.SoterWrapperApi", "soter: add prepareAppSecureKey task failed.", new Object[0]);
    AppMethodBeat.o(10454);
  }

  public static boolean dRc()
  {
    AppMethodBeat.i(10457);
    boolean bool;
    if ((com.tencent.soter.a.c.a.dRe().isInit()) && (com.tencent.soter.a.c.a.dRe().dRc()))
    {
      bool = true;
      AppMethodBeat.o(10457);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10457);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.a
 * JD-Core Version:    0.6.2
 */