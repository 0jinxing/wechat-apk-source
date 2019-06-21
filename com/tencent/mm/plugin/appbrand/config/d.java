package com.tencent.mm.plugin.appbrand.config;

import android.webkit.WebSettings;
import com.tencent.luggage.a.e;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.file.a;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.plugin.appbrand.r.q;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.protocal.protobuf.azz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  @Deprecated
  public static void a(AppBrandSysConfigLU paramAppBrandSysConfigLU)
  {
    paramAppBrandSysConfigLU.cwz = paramAppBrandSysConfigLU.cwz;
    paramAppBrandSysConfigLU.appId = paramAppBrandSysConfigLU.appId;
    paramAppBrandSysConfigLU.hgW = paramAppBrandSysConfigLU.hgW;
    paramAppBrandSysConfigLU.hgX = paramAppBrandSysConfigLU.hgX;
    paramAppBrandSysConfigLU.hhb = paramAppBrandSysConfigLU.hhb;
    paramAppBrandSysConfigLU.hhc = paramAppBrandSysConfigLU.hhc;
    paramAppBrandSysConfigLU.hhd = paramAppBrandSysConfigLU.hhd;
    paramAppBrandSysConfigLU.hgY = paramAppBrandSysConfigLU.hgY;
  }

  public static String ayy()
  {
    AppMethodBeat.i(101791);
    try
    {
      String str1 = WebSettings.getDefaultUserAgent(ah.getContext());
      str1 = q.a(ah.getContext(), str1, (q.a)e.B(q.a.class));
      AppMethodBeat.o(101791);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
        String str2 = System.getProperty("http.agent");
    }
  }

  public static a b(AppBrandSysConfigLU paramAppBrandSysConfigLU)
  {
    AppMethodBeat.i(101790);
    a locala = new a();
    locala.bQD = paramAppBrandSysConfigLU.bQD;
    if (locala.bQD <= 0L)
      locala.bQD = 10L;
    locala.hgg = paramAppBrandSysConfigLU.bQO.hgg;
    if (locala.hgg <= 0L)
      locala.hgg = 30L;
    AppMethodBeat.o(101790);
    return locala;
  }

  public static int n(int[] paramArrayOfInt)
  {
    int i = 0;
    int j = 0;
    if (i < 2)
    {
      int k = paramArrayOfInt[i];
      int m;
      if (k > 0)
        if (j == 0)
          m = k;
      while (true)
      {
        i++;
        j = m;
        break;
        m = k;
        if (k >= j)
          m = j;
      }
    }
    return j;
  }

  public static ArrayList<byte[]> s(i parami)
  {
    AppMethodBeat.i(101789);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new j();
    parami.asE().b("cer", (j)localObject);
    if (((j)localObject).value == null)
      AppMethodBeat.o(101789);
    while (true)
    {
      return localArrayList;
      localObject = com.tencent.mm.plugin.appbrand.r.d.q((ByteBuffer)((j)localObject).value);
      try
      {
        parami = new com/tencent/mm/protocal/protobuf/azz;
        parami.<init>();
        parami.parseFrom((byte[])localObject);
        localObject = parami.wDN;
        if (localObject == null)
        {
          AppMethodBeat.o(101789);
        }
        else
        {
          parami = parami.wDN.iterator();
          while (parami.hasNext())
            localArrayList.add(((b)parami.next()).wR);
        }
      }
      catch (Exception parami)
      {
        ab.e("", "readPkgCertificate, parse error: ".concat(String.valueOf(parami)));
        AppMethodBeat.o(101789);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.d
 * JD-Core Version:    0.6.2
 */