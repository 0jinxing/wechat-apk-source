package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsw;
import com.tencent.mm.protocal.protobuf.bsy;
import com.tencent.mm.protocal.protobuf.bsz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import java.util.Map;

public final class e
{
  private static boolean E(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(79506);
    boolean bool;
    if ((paramMap.get(paramString) == null) && (paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null))
    {
      bool = true;
      AppMethodBeat.o(79506);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79506);
    }
  }

  private static boolean F(String paramString, Map<String, String> paramMap)
  {
    boolean bool = false;
    AppMethodBeat.i(79510);
    ab.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceCache()");
    String str1 = (String)paramMap.get(paramString + ".CDNUrl");
    int i = bo.getInt((String)paramMap.get(paramString + ".subType"), -1);
    int j = bo.getInt((String)paramMap.get(paramString + ".resType"), -1);
    String str2 = (String)paramMap.get(paramString + ".md5");
    int k = bo.getInt((String)paramMap.get(paramString + ".priority"), 0);
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)) || (-1 == i) || (-1 == j) || (k < 0))
    {
      AppMethodBeat.o(79510);
      return bool;
    }
    bsw localbsw = new bsw();
    localbsw.wUV = new bsz();
    if (bo.getInt((String)paramMap.get(paramString + ".fileEncrypt"), 0) > 0);
    for (int m = i.a.dij(); ; m = 0)
    {
      int n = m;
      if (bo.getInt((String)paramMap.get(paramString + ".fileCompress"), 0) > 0)
        n = i.a.KB(m);
      localbsw.wOI = i;
      localbsw.wVa = bo.getInt((String)paramMap.get(paramString + ".networkType"), 2);
      localbsw.vQW = bo.getInt((String)paramMap.get(paramString + ".expireTime"), 1);
      localbsw.wUV.Url = str1;
      localbsw.wUV.wVf = bo.getInt((String)paramMap.get(paramString + ".resVer"), 0);
      localbsw.wUV.wdO = str2;
      localbsw.wUV.wVi = ((String)paramMap.get(paramString + ".originalmd5"));
      localbsw.wUV.wVg = n;
      localbsw.wUV.wVh = null;
      localbsw.wUV.wdt = null;
      localbsw.wxG = k;
      localbsw.wpk = i.b.vev.bJt;
      localbsw.wUX = bo.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      localbsw.wUY = ((String)paramMap.get(paramString + ".sampleID"));
      localbsw.wUZ = bo.getInt((String)paramMap.get(paramString + ".retryTime"), 3);
      localbsw.wVb = bo.getInt((String)paramMap.get(paramString + ".retryInterval"), 0);
      localbsw.vek = 0;
      b.c.dif().b(j, localbsw, true);
      j.z(localbsw.wUX, 34L);
      AppMethodBeat.o(79510);
      bool = true;
      break;
    }
  }

  private static boolean G(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(79512);
    ab.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDelete()");
    int i = bo.getInt((String)paramMap.get(paramString + ".resType"), -1);
    int j = bo.getInt((String)paramMap.get(paramString + ".subType"), -1);
    if ((-1 == i) || (-1 == j))
      AppMethodBeat.o(79512);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      bsw localbsw = new bsw();
      localbsw.wOI = j;
      localbsw.wUV = new bsz();
      localbsw.wUV.wVf = bo.getInt((String)paramMap.get(paramString + ".resVer"), 0);
      localbsw.wUY = ((String)paramMap.get(paramString + ".sampleID"));
      localbsw.wUX = bo.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      localbsw.wpk = i.b.vex.bJt;
      b.c.dif().a(i, localbsw, true);
      j.z(localbsw.wUX, 40L);
      AppMethodBeat.o(79512);
    }
  }

  private static boolean c(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(79511);
    ab.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDecrypt()");
    int i = bo.getInt((String)paramMap.get(paramString + ".resType"), -1);
    int j = bo.getInt((String)paramMap.get(paramString + ".subType"), -1);
    if ((-1 == i) || (-1 == j))
      AppMethodBeat.o(79511);
    for (paramBoolean = false; ; paramBoolean = true)
    {
      return paramBoolean;
      bsw localbsw = new bsw();
      localbsw.wUW = new bsy();
      localbsw.wOI = j;
      localbsw.wUW.wVe = ((String)paramMap.get(paramString + ".resKey"));
      localbsw.wUW.wVd = bo.getInt((String)paramMap.get(paramString + ".resKeyVersion"), 0);
      localbsw.wUY = ((String)paramMap.get(paramString + ".sampleID"));
      localbsw.wUX = bo.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      localbsw.wpk = i.b.vew.bJt;
      localbsw.wUV = new bsz();
      localbsw.wUV.wVi = ((String)paramMap.get(paramString + ".originalmd5"));
      b.c.dif().a(i, localbsw, true, false);
      j.z(localbsw.wUX, 37L);
      AppMethodBeat.o(79511);
    }
  }

  private static boolean d(int paramInt, String paramString, Map<String, String> paramMap)
  {
    boolean bool = true;
    AppMethodBeat.i(79509);
    if ((paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null))
      AppMethodBeat.o(79509);
    while (true)
    {
      return bool;
      if (i.b.KF(paramInt))
      {
        bool = G(paramString, paramMap);
        AppMethodBeat.o(79509);
      }
      else if (i.b.KD(paramInt))
      {
        bool = F(paramString, paramMap);
        AppMethodBeat.o(79509);
      }
      else if (i.b.KE(paramInt))
      {
        bool = c(paramString, paramMap, true);
        AppMethodBeat.o(79509);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(79509);
      }
    }
  }

  static void k(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(79507);
    if (E(String.format("%s.%s", new Object[] { paramString1, paramString2 }), paramMap))
      AppMethodBeat.o(79507);
    while (true)
    {
      return;
      boolean bool = l(paramString1, paramString2, paramMap) | false;
      int i = 0;
      while (true)
      {
        i++;
        if (E(String.format(Locale.US, "%s.%s%d", new Object[] { paramString1, paramString2, Integer.valueOf(i) }), paramMap))
          break;
        bool |= l(paramString1, paramString2, paramMap);
      }
      i = i.b.aiZ(paramString2);
      if (i.b.KD(i))
      {
        j.z(0L, 32L);
        if (!bool)
        {
          j.z(0L, 33L);
          AppMethodBeat.o(79507);
        }
      }
      else if (i.b.KE(i))
      {
        j.z(0L, 35L);
        if (!bool)
        {
          j.z(0L, 36L);
          AppMethodBeat.o(79507);
        }
      }
      else
      {
        if (i.b.KF(i))
        {
          j.z(0L, 38L);
          if (!bool)
            j.z(0L, 39L);
        }
        AppMethodBeat.o(79507);
      }
    }
  }

  private static boolean l(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(79508);
    String str = String.format("%s.%s.%s", new Object[] { paramString1, paramString2, "Resource" });
    int i = i.b.aiZ(paramString2);
    boolean bool;
    if (E(str, paramMap))
    {
      AppMethodBeat.o(79508);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = d(i, str, paramMap) | false;
      int j = 0;
      while (true)
      {
        j++;
        str = String.format(Locale.US, "%s.%s.%s%d", new Object[] { paramString1, paramString2, "Resource", Integer.valueOf(j) });
        if (E(str, paramMap))
          break;
        bool |= d(i, str, paramMap);
      }
      AppMethodBeat.o(79508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.e
 * JD-Core Version:    0.6.2
 */