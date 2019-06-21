package com.tencent.mm.ah;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;

public final class b
{
  public static boolean U(String paramString, int paramInt)
  {
    AppMethodBeat.i(77843);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(77843);
    }
    while (true)
    {
      return bool;
      h localh1 = o.act().qo(paramString);
      if ((localh1 != null) && (paramString.equals(localh1.getUsername())) && (paramInt == localh1.dtR))
      {
        bool = true;
        AppMethodBeat.o(77843);
      }
      else
      {
        h localh2 = localh1;
        if (localh1 == null)
          localh2 = new h();
        localh2.username = paramString;
        localh2.dtR = paramInt;
        localh2.bJt = 3;
        bool = o.act().b(localh2);
        AppMethodBeat.o(77843);
      }
    }
  }

  public static Bitmap a(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(77846);
    if ((bo.isNullOrNil(paramString)) || (!g.RN().QY()))
    {
      paramString = null;
      AppMethodBeat.o(77846);
    }
    while (true)
    {
      return paramString;
      if (!g.RP().RB())
      {
        paramString = o.acd().bU(ah.getContext());
        AppMethodBeat.o(77846);
      }
      else
      {
        String str = paramString;
        if (ad.mR(paramString))
          str = ad.aoC(paramString);
        paramString = o.acv().b(str, paramBoolean, paramInt);
        AppMethodBeat.o(77846);
      }
    }
  }

  public static h a(String paramString, bbv parambbv)
  {
    AppMethodBeat.i(77849);
    h localh = new h();
    localh.bJt = -1;
    localh.username = paramString;
    localh.frV = parambbv.vXn;
    localh.frW = parambbv.vXm;
    ab.i("MicroMsg.AvatarLogic", "dkhurl contact %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.ack(), localh.acl() });
    boolean bool;
    if (parambbv.wGg != 0)
    {
      bool = true;
      localh.cB(bool);
      if ((parambbv.wGb != 3) && (parambbv.wGb != 4))
        break label121;
      localh.dtR = parambbv.wGb;
    }
    while (true)
    {
      AppMethodBeat.o(77849);
      return localh;
      bool = false;
      break;
      label121: if (parambbv.wGb == 2)
      {
        localh.dtR = 3;
        if (!r.Yz().equals(paramString))
        {
          o.acd();
          d.E(paramString, false);
          o.acd();
          d.E(paramString, true);
          o.act().b(localh);
          o.acv().pZ(paramString);
        }
      }
    }
  }

  public static String at(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77832);
    paramString1 = paramString1 + "?access_token=" + paramString2;
    AppMethodBeat.o(77832);
    return paramString1;
  }

  public static Bitmap d(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(77845);
    if ((bo.isNullOrNil(paramString)) || (!g.RN().QY()))
    {
      paramString = null;
      AppMethodBeat.o(77845);
    }
    while (true)
    {
      return paramString;
      o.acd();
      Object localObject = d.j(paramString, paramInt1, paramInt2);
      if (localObject == null)
      {
        localObject = new e();
        ((e)localObject).a(paramString, new b.1((e)localObject));
        paramString = a(paramString, false, paramInt3);
        AppMethodBeat.o(77845);
      }
      else
      {
        paramString = (String)localObject;
        if (paramInt3 > 5)
          paramString = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, false, paramInt3);
        AppMethodBeat.o(77845);
      }
    }
  }

  public static boolean d(long paramLong, int paramInt)
  {
    AppMethodBeat.i(77840);
    boolean bool;
    if (paramInt != 3)
    {
      bool = false;
      AppMethodBeat.o(77840);
    }
    while (true)
    {
      return bool;
      bool = pV(fq(paramLong));
      AppMethodBeat.o(77840);
    }
  }

  private static String fq(long paramLong)
  {
    AppMethodBeat.i(77838);
    String str = new p(paramLong) + "@qqim";
    AppMethodBeat.o(77838);
    return str;
  }

  public static Bitmap fr(long paramLong)
  {
    AppMethodBeat.i(77842);
    Bitmap localBitmap = a(fq(paramLong), false, -1);
    AppMethodBeat.o(77842);
    return localBitmap;
  }

  public static Bitmap pP(String paramString)
  {
    AppMethodBeat.i(77833);
    paramString = a(paramString + "@google", false, -1);
    AppMethodBeat.o(77833);
    return paramString;
  }

  private static String pQ(String paramString)
  {
    AppMethodBeat.i(77834);
    paramString = "http://graph.facebook.com/" + paramString + "/picture";
    AppMethodBeat.o(77834);
    return paramString;
  }

  public static void pR(String paramString)
  {
    AppMethodBeat.i(77835);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77835);
    while (true)
    {
      return;
      String str = paramString + "@fb";
      h localh1 = o.act().qo(str);
      if ((localh1 != null) && (str.equals(localh1.getUsername())) && (3 == localh1.dtR))
      {
        AppMethodBeat.o(77835);
      }
      else
      {
        h localh2 = localh1;
        if (localh1 == null)
          localh2 = new h();
        localh2.username = str;
        localh2.dtR = 3;
        localh2.frW = pQ(paramString);
        localh2.frV = pQ(paramString);
        localh2.cB(true);
        localh2.bJt = 31;
        o.act().b(localh2);
        AppMethodBeat.o(77835);
      }
    }
  }

  public static Bitmap pS(String paramString)
  {
    AppMethodBeat.i(77836);
    paramString = a(paramString + "@fb", false, -1);
    AppMethodBeat.o(77836);
    return paramString;
  }

  public static long pT(String paramString)
  {
    long l1 = -1L;
    AppMethodBeat.i(77837);
    long l2;
    if (!ad.aoz(paramString))
    {
      AppMethodBeat.o(77837);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      paramString = paramString.split("@");
      try
      {
        l2 = bo.getLong(paramString[0], -1L);
        AppMethodBeat.o(77837);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(77837);
        l2 = l1;
      }
    }
  }

  public static long pU(String paramString)
  {
    long l1 = -1L;
    AppMethodBeat.i(77839);
    long l2;
    if (!ad.aow(paramString))
    {
      AppMethodBeat.o(77839);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      paramString = paramString.split("@");
      try
      {
        l2 = bo.getLong(paramString[0], -1L);
        AppMethodBeat.o(77839);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(77839);
        l2 = l1;
      }
    }
  }

  public static boolean pV(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(77841);
    if (paramString == null)
    {
      ab.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
      AppMethodBeat.o(77841);
    }
    while (true)
    {
      return bool;
      if (!paramString.endsWith("@qqim"))
      {
        ab.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
        AppMethodBeat.o(77841);
      }
      else
      {
        h localh = new h();
        localh.username = paramString;
        localh.dtR = 3;
        localh.bJt = 3;
        bool = o.act().b(localh);
        AppMethodBeat.o(77841);
      }
    }
  }

  public static Bitmap pW(String paramString)
  {
    AppMethodBeat.i(138576);
    paramString = a(paramString, false, -1);
    AppMethodBeat.o(138576);
    return paramString;
  }

  public static String pX(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(77847);
    if ((bo.isNullOrNil(paramString)) || (!g.RN().QY()))
    {
      AppMethodBeat.o(77847);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!g.RP().RB())
      {
        AppMethodBeat.o(77847);
        paramString = localObject;
      }
      else if (ad.mR(paramString))
      {
        o.acd();
        paramString = d.C(ad.aoC(paramString), false);
        AppMethodBeat.o(77847);
      }
      else
      {
        o.acd();
        paramString = d.C(paramString, false);
        AppMethodBeat.o(77847);
      }
    }
  }

  public static void pY(String paramString)
  {
    AppMethodBeat.i(77848);
    h localh = o.act().qo(paramString);
    if (localh == null)
      AppMethodBeat.o(77848);
    while (true)
    {
      return;
      if (!paramString.equals(localh.getUsername()))
      {
        AppMethodBeat.o(77848);
      }
      else
      {
        localh.frY = 0;
        localh.bJt = 64;
        o.act().b(localh);
        AppMethodBeat.o(77848);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.b
 * JD-Core Version:    0.6.2
 */