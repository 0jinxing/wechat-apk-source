package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;

public enum b
{
  static
  {
    AppMethodBeat.i(55362);
    oPw = new b("INSTANCE");
    oPx = new b[] { oPw };
    AppMethodBeat.o(55362);
  }

  public static void TA(String paramString)
  {
    AppMethodBeat.i(55361);
    bd localbd = ((j)g.K(j.class)).XM();
    if (localbd.aoQ(paramString))
      localbd.aoU(paramString);
    bf.a(paramString, new b.1());
    g.RP().Ry().set(143873, "");
    g.RP().Ry().set(143874, Long.valueOf(0L));
    bUW();
    AppMethodBeat.o(55361);
  }

  public static boolean bUU()
  {
    AppMethodBeat.i(55358);
    if (bo.h((Integer)g.RP().Ry().get(143875, Integer.valueOf(0))) == 1)
      AppMethodBeat.o(55358);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(55358);
    }
  }

  public static void bUV()
  {
    AppMethodBeat.i(55359);
    g.RP().Ry().set(143875, Integer.valueOf(1));
    AppMethodBeat.o(55359);
  }

  public static void bUW()
  {
    AppMethodBeat.i(55360);
    g.RP().Ry().set(143875, Integer.valueOf(0));
    AppMethodBeat.o(55360);
  }

  public static void cK(String paramString, int paramInt)
  {
    AppMethodBeat.i(55356);
    paramString = new d(paramString, (int)bo.fp(bo.c((Long)g.RP().Ry().get(143874, Long.valueOf(0L)))), paramInt);
    g.Rg().a(paramString, 0);
    AppMethodBeat.o(55356);
  }

  public static boolean fr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(55355);
    ad localad = new ad();
    localad.iB(paramString2);
    localad.setUsername(paramString1);
    paramString2 = ((j)g.K(j.class)).XM();
    ab.d("MicroMsg.LbsroomLogic", "Save lbsroom contact name:" + localad.field_username);
    if (!paramString2.aoQ(localad.field_username))
      paramString2.Z(localad);
    g.RP().Ry().set(143873, paramString1);
    g.RP().Ry().set(143874, Long.valueOf(bo.anT()));
    AppMethodBeat.o(55355);
    return true;
  }

  public static void zY(int paramInt)
  {
    AppMethodBeat.i(55357);
    String str = bo.nullAsNil((String)g.RP().Ry().get(143873, ""));
    if (!str.equals(""))
      if (bo.fp(bo.c((Long)g.RP().Ry().get(143874, Long.valueOf(0L)))) < 7200L)
      {
        cK(str, paramInt);
        AppMethodBeat.o(55357);
      }
    while (true)
    {
      return;
      TA(str);
      AppMethodBeat.o(55357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.b
 * JD-Core Version:    0.6.2
 */