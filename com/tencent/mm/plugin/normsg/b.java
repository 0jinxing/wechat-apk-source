package com.tencent.mm.plugin.normsg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.d.e.a.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

 enum b
  implements com.tencent.mm.plugin.normsg.a.a
{
  private static final al oTF;

  static
  {
    AppMethodBeat.i(10349);
    oTE = new b("INSTANCE");
    oTG = new b[] { oTE };
    oTF = new al("NormsgWorker");
    AppMethodBeat.o(10349);
  }

  private static String TR(String paramString)
  {
    AppMethodBeat.i(10322);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(10322);
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder(paramString.length());
      int i = 0;
      if (i < paramString.length())
      {
        char c = paramString.charAt(i);
        switch (c)
        {
        default:
          if ((c > '~') || (c == '[') || (c == ']'))
            localStringBuilder.append("&#").append(c).append(';');
          break;
        case '"':
        case '&':
        case '\'':
        case '<':
        case '>':
        }
        while (true)
        {
          i++;
          break;
          localStringBuilder.append("&quot;");
          continue;
          localStringBuilder.append("&amp;");
          continue;
          localStringBuilder.append("&apos;");
          continue;
          localStringBuilder.append("&lt;");
          continue;
          localStringBuilder.append("&gt;");
          continue;
          localStringBuilder.append(c);
        }
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(10322);
    }
  }

  private static String bVO()
  {
    AppMethodBeat.i(10320);
    String str;
    if (new com.tencent.mrs.b.c().get("clicfg_use_new_cached_imei_method", false))
    {
      str = q.LL();
      AppMethodBeat.o(10320);
    }
    while (true)
    {
      return str;
      str = q.LK();
      AppMethodBeat.o(10320);
    }
  }

  private static String bVP()
  {
    AppMethodBeat.i(10325);
    try
    {
      Object localObject = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
      if (((NetworkInfo)localObject).getType() == 1);
      StringBuilder localStringBuilder;
      for (localObject = "wifi"; ; localObject = ((NetworkInfo)localObject).getSubtype())
      {
        AppMethodBeat.o(10325);
        return localObject;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NormsgSourceImpl", "getNetTypeStr: %s", new Object[] { bo.l(localException) });
        String str = "";
      }
    }
  }

  private static String eK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(10323);
    Object localObject1 = "";
    Object localObject2 = ah.getContext().getPackageManager();
    try
    {
      localObject2 = ((PackageManager)localObject2).getPackageInfo(ah.getPackageName(), 0);
      if (localObject2 != null)
        localObject2 = ((PackageInfo)localObject2).applicationInfo.sourceDir;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((String)localObject2);
        localObject2 = com.tencent.mm.c.c.y((File)localObject1);
        localObject1 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
        {
          com.tencent.mm.plugin.report.e.pXa.a(322L, 13L, 1L, true);
          com.tencent.mm.plugin.report.e.pXa.e(11098, new Object[] { Integer.valueOf(4013), String.format("%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) });
          localObject1 = localObject2;
        }
        AppMethodBeat.o(10323);
        return localObject1;
        localNameNotFoundException = localNameNotFoundException;
        Object localObject3 = null;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ah.getPackageName());
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormsgSourceImpl", "summertoken getSecurityCode e: " + localException.getMessage());
          localObject1 = "0";
          com.tencent.mm.plugin.report.e.pXa.a(322L, 12L, 1L, true);
          com.tencent.mm.plugin.report.e.pXa.e(11098, new Object[] { Integer.valueOf(4012), String.format("%s|%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localException.getMessage() }) });
        }
      }
    }
  }

  private static int getVersionCode()
  {
    int i = 0;
    AppMethodBeat.i(10324);
    Object localObject1 = ah.getContext().getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo(ah.getPackageName(), 0);
      if (localObject1 != null)
        i = ((PackageInfo)localObject1).versionCode;
      AppMethodBeat.o(10324);
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        Object localObject2 = null;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ah.getPackageName());
      }
    }
  }

  public final byte[] Am(int paramInt)
  {
    AppMethodBeat.i(10317);
    byte[] arrayOfByte = Normsg.b.Aj(paramInt);
    AppMethodBeat.o(10317);
    return arrayOfByte;
  }

  public final String An(int paramInt)
  {
    AppMethodBeat.i(10321);
    Object localObject1 = "";
    if (com.tencent.mm.kernel.g.RK())
      localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(79, "");
    com.tencent.mm.kernel.g.RS().m(new b.1(this), 5000L);
    String str1 = "";
    label118: int i;
    label121: int j;
    label129: label138: int k;
    label147: int m;
    label168: int n;
    label177: int i1;
    label186: label207: int i2;
    String str4;
    StringBuilder localStringBuilder1;
    Object localObject3;
    if (com.tencent.mm.kernel.g.RK())
    {
      if (com.tencent.mm.kernel.g.RP().eJN.ybP.ybm)
        str1 = "1";
    }
    else
    {
      Context localContext = ah.getContext().getApplicationContext();
      String str2 = at.gE(localContext);
      String str3 = at.gF(localContext);
      localObject2 = ah.getContext();
      if (localObject2 != null)
        break label1150;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormsgSourceImpl", "Failed checking mock location: application context not initialized.");
      i = 0;
      if (i == 0)
        break label1171;
      i = 1;
      if (!Normsg.b.bVI())
        break label1177;
      j = 1;
      if (!Debug.isDebuggerConnected())
        break label1183;
      k = 1;
      if ((!com.tencent.mm.plugin.normsg.b.f.oVf) && (!com.tencent.mm.plugin.normsg.b.f.oVg) && (!com.tencent.mm.plugin.normsg.b.f.oVh))
        break label1189;
      m = 1;
      if (!com.tencent.mm.plugin.normsg.b.e.oVb)
        break label1195;
      n = 1;
      if (!com.tencent.mm.plugin.normsg.b.g.oVi)
        break label1201;
      i1 = 1;
      localObject2 = Normsg.b.bVJ();
      if (localObject2 == null)
        break label1207;
      localObject2 = com.tencent.mm.plugin.normsg.b.d.v((byte[])localObject2, 0, localObject2.length);
      i2 = getVersionCode();
      str4 = eK(i2, paramInt);
      Map localMap = q.Ma();
      localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = localStringBuilder1.append("<softtype><lctmoc>").append(i).append("</lctmoc><level>").append(j).append("</level>").append((String)localObject1).append("<k1>");
      localObject3 = (String)localMap.get("model name");
      localObject1 = localObject3;
      if (localObject3 == null)
        localObject1 = q.LT()[0];
      localStringBuilder2 = localStringBuilder2.append(TR((String)localObject1)).append("</k1><k2>").append(TR(q.LV())).append("</k2><k3>").append(TR(q.LW())).append("</k3><k4>").append(TR(bVO())).append("</k4><k5>").append(TR(q.LX())).append("</k5><k6>").append(TR(q.LY())).append("</k6><k7>").append(TR(q.getAndroidId())).append("</k7><k8>").append(TR(q.LZ())).append("</k8><k9>").append(TR(q.LS())).append("</k9><k10>").append(q.Mb()).append("</k10><k11>").append(bo.nullAsNil(TR((String)localMap.get("hardware")))).append("</k11><k12>").append(bo.nullAsNil(TR((String)localMap.get("revision")))).append("</k12><k13>").append(bo.nullAsNil(TR((String)localMap.get("serial")))).append("</k13><k14>").append(TR(q.LP())).append("</k14><k15>").append(TR(q.LU())).append("</k15><k16>");
      localObject3 = (String)localMap.get("features");
      localObject1 = localObject3;
      if (localObject3 == null)
        localObject1 = (String)localMap.get("flags");
      localObject1 = localStringBuilder2.append(bo.nullAsNil(TR((String)localObject1))).append("</k16><k18>").append((String)localObject2).append("</k18><k21>").append(bo.nullAsNil(TR(str2))).append("</k21><k22>").append(bo.nullAsNil(TR(q.bC(localContext)))).append("</k22><k24>").append(bo.nullAsNil(TR(str3))).append("</k24><k26>").append(k).append("</k26><k30>");
      localObject2 = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
      if (localObject2 == null)
        break label1214;
    }
    label1171: label1177: label1183: label1189: label1195: label1201: label1207: label1214: for (Object localObject2 = ((NetworkInfo)localObject2).getExtraInfo(); ; localObject2 = null)
    {
      localObject3 = ((StringBuilder)localObject1).append(bo.nullAsNil(TR((String)localObject2))).append("</k30><k33>").append(TR(ah.getPackageName())).append("</k33><k34>").append(bo.nullAsNil(TR(com.tencent.mm.compatible.e.ab.get("ro.build.fingerprint")))).append("</k34><k35>").append(bo.nullAsNil(TR(Build.BOARD))).append("</k35><k36>").append(bo.nullAsNil(TR(Build.BOOTLOADER))).append("</k36><k37>").append(bo.nullAsNil(TR(Build.BRAND))).append("</k37><k38>").append(bo.nullAsNil(TR(Build.DEVICE))).append("</k38><k39>").append(bo.nullAsNil(TR(Build.HARDWARE))).append("</k39><k40>").append(bo.nullAsNil(TR(Build.PRODUCT))).append("</k40><k41>").append(m).append("</k41><k42>").append(bo.nullAsNil(TR(com.tencent.mm.compatible.e.ab.get("ro.product.manufacturer")))).append("</k42><k43>").append(Settings.System.getString(ah.getContext().getContentResolver(), "89884a87498ef44f")).append("</k43><k44>0</k44><k45>");
      localObject1 = bo.nullAsNil(bo.gP(ah.getContext()));
      localObject2 = localObject1;
      if (((String)localObject1).length() > 0)
        localObject2 = com.tencent.mm.a.g.x(((String)localObject1).getBytes());
      ((StringBuilder)localObject3).append((String)localObject2).append("</k45><k46>").append(str1).append("</k46><k47>").append(TR(bVP())).append("</k47><k48>").append(bVO()).append("</k48><k49>").append(com.tencent.mm.compatible.util.e.eSi).append("</k49><k52>").append(n).append("</k52><k53>").append(i1).append("</k53><k57>").append(i2).append("</k57><k58>").append(bo.nullAsNil(TR(str4))).append("</k58><k59>").append(paramInt).append("</k59><k60>").append(TR(com.tencent.mm.sdk.platformtools.f.xxZ.getString("FEATURE_ID"))).append("</k60><k61>").append(q.LN()).append("</k61></softtype>");
      str1 = localStringBuilder1.toString();
      AppMethodBeat.o(10321);
      return str1;
      str1 = "0";
      break;
      label1150: if (Settings.Secure.getInt(((Context)localObject2).getContentResolver(), "mock_location", 0) == 0)
        break label118;
      i = 1;
      break label121;
      i = 0;
      break label129;
      j = 0;
      break label138;
      k = 0;
      break label147;
      m = 0;
      break label168;
      n = 0;
      break label177;
      i1 = 0;
      break label186;
      localObject2 = "";
      break label207;
    }
  }

  public final void Ao(int paramInt)
  {
    AppMethodBeat.i(10337);
    com.tencent.mm.plugin.normsg.b.a.bVT().Ao(paramInt);
    AppMethodBeat.o(10337);
  }

  public final void TI(String paramString)
  {
    AppMethodBeat.i(10339);
    Normsg.c.TI(paramString);
    AppMethodBeat.o(10339);
  }

  public final void TJ(String paramString)
  {
    AppMethodBeat.i(10340);
    Normsg.c.TJ(paramString);
    AppMethodBeat.o(10340);
  }

  public final void TK(String paramString)
  {
    AppMethodBeat.i(10341);
    Normsg.c.TK(paramString);
    AppMethodBeat.o(10341);
  }

  public final boolean TL(String paramString)
  {
    AppMethodBeat.i(10342);
    boolean bool = Normsg.c.TL(paramString);
    AppMethodBeat.o(10342);
    return bool;
  }

  public final byte[] TM(String paramString)
  {
    AppMethodBeat.i(10343);
    paramString = Normsg.c.TM(paramString);
    AppMethodBeat.o(10343);
    return paramString;
  }

  public final void TN(String paramString)
  {
    AppMethodBeat.i(10346);
    Normsg.c.TN(paramString);
    AppMethodBeat.o(10346);
  }

  public final boolean TO(String paramString)
  {
    AppMethodBeat.i(10347);
    boolean bool = Normsg.c.TO(paramString);
    AppMethodBeat.o(10347);
    return bool;
  }

  public final byte[] TP(String paramString)
  {
    AppMethodBeat.i(10348);
    paramString = Normsg.c.TP(paramString);
    AppMethodBeat.o(10348);
    return paramString;
  }

  public final String TQ(String paramString)
  {
    AppMethodBeat.i(10319);
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    for (int j = 0; j < i; j++)
      localStringBuilder.append((char)(paramString.charAt(j) ^ 0xFFFFFFA7 ^ (byte)(j + 1 ^ i ^ 0xFFFFFFFF)));
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(10319);
    return paramString;
  }

  public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
  {
    AppMethodBeat.i(10336);
    com.tencent.mm.plugin.normsg.b.c.a(paramView, paramClass);
    AppMethodBeat.o(10336);
  }

  public final void a(String paramString, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10345);
    Normsg.c.a(paramString, paramMotionEvent);
    AppMethodBeat.o(10345);
  }

  public final boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, PByteArray paramPByteArray)
  {
    AppMethodBeat.i(10338);
    boolean bool = Normsg.a.a(paramInt1, paramArrayOfByte, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPByteArray);
    AppMethodBeat.o(10338);
    return bool;
  }

  public final void ae(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(10318);
    Object localObject = ah.getContext();
    if ((paramInt2 <= 0) || (paramInt2 > 4))
    {
      localObject = new IllegalArgumentException("action invalid: ".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(10318);
      throw ((Throwable)localObject);
    }
    localObject = new d.a((Context)localObject, paramInt1, paramInt2, (byte)0);
    long l = paramInt3 * 1000;
    if (l < com.tencent.d.e.a.a.f.AtJ)
      ((d.a)localObject).Ato = com.tencent.d.e.a.a.f.AtJ;
    while (true)
    {
      ((d.a)localObject).Ato = l;
      localObject = new com.tencent.d.e.a.d((d.a)localObject, (byte)0);
      com.tencent.d.e.a.e.dQs().a((com.tencent.d.e.a.d)localObject);
      AppMethodBeat.o(10318);
      return;
      if (l > com.tencent.d.e.a.a.f.AtG * 12L)
        ((d.a)localObject).Ato = (com.tencent.d.e.a.a.f.AtG * 12L);
    }
  }

  public final boolean bVI()
  {
    AppMethodBeat.i(10328);
    boolean bool = Normsg.b.bVI();
    AppMethodBeat.o(10328);
    return bool;
  }

  public final boolean bVL()
  {
    AppMethodBeat.i(10330);
    boolean bool = Normsg.b.bVL();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormsgSourceImpl", "[tomys-edt] alpha tom: %s", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(10330);
    return bool;
  }

  public final boolean bVM()
  {
    AppMethodBeat.i(10331);
    boolean bool = Normsg.b.bVM();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormsgSourceImpl", "[tomys-edt] bravo jerry: %s", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(10331);
    return bool;
  }

  public final boolean bVN()
  {
    AppMethodBeat.i(10332);
    boolean bool = Normsg.b.bVN();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormsgSourceImpl", "[tomys-edt] charlie brown: %s", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(10332);
    return bool;
  }

  public final String bVQ()
  {
    AppMethodBeat.i(10327);
    Object localObject1;
    if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormsgSourceImpl", "*** point 0, explained by source code.");
      localObject1 = "";
      AppMethodBeat.o(10327);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = ah.getContext().getPackageManager().getInstalledPackages(0);
      localObject1 = new StringBuilder(8192);
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((StringBuilder)localObject1).append(((PackageInfo)((Iterator)localObject2).next()).packageName).append('\n');
      localObject1 = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(10327);
    }
  }

  public final boolean bVR()
  {
    boolean bool1 = false;
    AppMethodBeat.i(10329);
    try
    {
      bool2 = Normsg.b.bVK();
      AppMethodBeat.o(10329);
      return bool2;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.NormsgSourceImpl", localThrowable, "unexpected error.", new Object[0]);
        AppMethodBeat.o(10329);
        boolean bool2 = bool1;
      }
    }
  }

  public final byte[] bVS()
  {
    AppMethodBeat.i(10334);
    byte[] arrayOfByte = Normsg.b.Aj(0);
    AppMethodBeat.o(10334);
    return arrayOfByte;
  }

  public final boolean c(Object paramObject, Class paramClass)
  {
    AppMethodBeat.i(10333);
    boolean bool = Normsg.d.b(paramObject, paramClass);
    AppMethodBeat.o(10333);
    return bool;
  }

  public final boolean cg(Object paramObject)
  {
    AppMethodBeat.i(10335);
    boolean bool = Normsg.d.cg(paramObject);
    AppMethodBeat.o(10335);
    return bool;
  }

  public final void fu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10344);
    Normsg.c.fu(paramString1, paramString2);
    AppMethodBeat.o(10344);
  }

  public final String jE(boolean paramBoolean)
  {
    AppMethodBeat.i(10326);
    String str = Normsg.b.aZ(",", paramBoolean);
    AppMethodBeat.o(10326);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b
 * JD-Core Version:    0.6.2
 */