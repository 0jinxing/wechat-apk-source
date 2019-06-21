package com.tencent.mm.plugin.appbrand.dynamic.j;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.an;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.k;
import com.tencent.mm.plugin.appbrand.r.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;
import java.io.InputStream;

public final class c
{
  private static final String[] gTT = an.gTT;

  // ERROR //
  private static o bO(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 10997
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 26	com/tencent/mm/plugin/appbrand/appcache/ao
    //   9: astore_2
    //   10: aload_2
    //   11: aload_0
    //   12: invokespecial 30	com/tencent/mm/plugin/appbrand/appcache/ao:<init>	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: invokevirtual 34	com/tencent/mm/plugin/appbrand/appcache/ao:avW	()Z
    //   19: pop
    //   20: aload_2
    //   21: aload_1
    //   22: invokevirtual 38	com/tencent/mm/plugin/appbrand/appcache/ao:xy	(Ljava/lang/String;)Ljava/io/InputStream;
    //   25: astore_3
    //   26: aload_1
    //   27: invokestatic 44	com/tencent/mm/sdk/f/b:ako	(Ljava/lang/String;)Ljava/lang/String;
    //   30: astore 4
    //   32: aload_2
    //   33: invokestatic 50	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   36: new 52	com/tencent/xweb/o
    //   39: astore_1
    //   40: aload_1
    //   41: aload 4
    //   43: ldc 54
    //   45: aload_3
    //   46: invokespecial 57	com/tencent/xweb/o:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   49: sipush 10997
    //   52: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aload_1
    //   56: astore_0
    //   57: aload_0
    //   58: areturn
    //   59: astore_1
    //   60: aconst_null
    //   61: astore_3
    //   62: aconst_null
    //   63: astore_2
    //   64: ldc 62
    //   66: ldc 64
    //   68: iconst_2
    //   69: anewarray 4	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_0
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: aload_1
    //   79: invokestatic 68	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   82: aastore
    //   83: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: aload_2
    //   87: invokestatic 50	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   90: aload_3
    //   91: invokestatic 50	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   94: sipush 10997
    //   97: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aconst_null
    //   101: astore_0
    //   102: goto -45 -> 57
    //   105: astore_1
    //   106: aconst_null
    //   107: astore_3
    //   108: goto -44 -> 64
    //   111: astore_1
    //   112: goto -48 -> 64
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	59	java/lang/Exception
    //   15	26	105	java/lang/Exception
    //   26	49	111	java/lang/Exception
  }

  private static o bP(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(10998);
    Object localObject2 = k.Aa(paramString1);
    if (localObject2 != null)
    {
      localObject2 = ((WxaWidgetContext)localObject2).azF();
      if (localObject2 != null)
        break label58;
      ab.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null appInfo by id %s", new Object[] { paramString1 });
      AppMethodBeat.o(10998);
      paramString1 = localObject1;
    }
    while (true)
    {
      return paramString1;
      localObject2 = null;
      break;
      label58: if (bo.isNullOrNil(((WxaPkgWrappingInfo)localObject2).gSP))
      {
        ab.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get Null Or Nil pkgPath[%s] by appId %s", new Object[] { ((WxaPkgWrappingInfo)localObject2).gSP, paramString1 });
        AppMethodBeat.o(10998);
        paramString1 = localObject1;
      }
      else
      {
        localObject2 = ((WxaPkgWrappingInfo)localObject2).gSP;
        if (bo.isNullOrNil((String)localObject2))
        {
          ab.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null or nil pkgLocalPath");
          AppMethodBeat.o(10998);
          paramString1 = localObject1;
        }
        else
        {
          ab.d("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, id(%s), fileName(%s)", new Object[] { paramString1, paramString2 });
          paramString1 = bO((String)localObject2, paramString2);
          AppMethodBeat.o(10998);
        }
      }
    }
  }

  private static o bQ(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(10999);
    Object localObject2 = k.Aa(paramString1);
    if (localObject2 != null)
    {
      localObject2 = ((WxaWidgetContext)localObject2).azG();
      if (localObject2 != null)
        break label43;
      AppMethodBeat.o(10999);
      paramString1 = localObject1;
    }
    while (true)
    {
      return paramString1;
      localObject2 = null;
      break;
      label43: if (((WxaPkgWrappingInfo)localObject2).gVw)
      {
        paramString1 = an.openRead(paramString2);
        if (paramString1 != null)
        {
          paramString1 = new o(b.ako(paramString2), "UTF-8", paramString1);
          AppMethodBeat.o(10999);
        }
        else
        {
          AppMethodBeat.o(10999);
          paramString1 = localObject1;
        }
      }
      else if (bo.isNullOrNil(((WxaPkgWrappingInfo)localObject2).gSP))
      {
        ab.e("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, pkgPath[%s] is Null Or Nil", new Object[] { ((WxaPkgWrappingInfo)localObject2).gSP });
        AppMethodBeat.o(10999);
        paramString1 = localObject1;
      }
      else
      {
        ab.d("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, id(%s), fileName(%s)", new Object[] { paramString1, paramString2 });
        paramString1 = bO(((WxaPkgWrappingInfo)localObject2).gSP, paramString2);
        AppMethodBeat.o(10999);
      }
    }
  }

  public static String bR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11000);
    if (bo.isNullOrNil(paramString2))
    {
      paramString1 = "";
      AppMethodBeat.o(11000);
    }
    while (true)
    {
      return paramString1;
      o localo = bS(paramString1, paramString2);
      if ((localo != null) && (localo.mInputStream != null))
      {
        try
        {
          ab.d("MicroMsg.ResPkgReader", "getCacheContent, dataStream available = %d, url = %s", new Object[] { Integer.valueOf(localo.mInputStream.available()), paramString2 });
          paramString1 = d.convertStreamToString(localo.mInputStream);
          AppMethodBeat.o(11000);
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.ResPkgReader", "getCacheContent exp = %s, id = %s, url = %s", new Object[] { localException, paramString1, paramString2 });
        }
      }
      else
      {
        ab.e("MicroMsg.ResPkgReader", "get cache content for id : %s from url : %s, failed", new Object[] { paramString1, paramString2 });
        paramString1 = "";
        AppMethodBeat.o(11000);
      }
    }
  }

  public static o bS(String paramString1, String paramString2)
  {
    Bundle localBundle = null;
    AppMethodBeat.i(11001);
    ab.i("MicroMsg.ResPkgReader", "getCacheResource called, id = %s, reqURL = %s", new Object[] { paramString1, paramString2 });
    if (bo.isNullOrNil(paramString2))
    {
      AppMethodBeat.o(11001);
      paramString1 = localBundle;
    }
    while (true)
    {
      return paramString1;
      if (u.t(paramString2, "about:blank"))
      {
        AppMethodBeat.o(11001);
        paramString1 = localBundle;
      }
      else if (!d.Ed(paramString2))
      {
        paramString2 = l.yk(paramString2);
        if (a.contains(gTT, paramString2))
        {
          paramString1 = bQ(paramString1, paramString2);
          AppMethodBeat.o(11001);
        }
        else
        {
          paramString2 = bP(paramString1, paramString2);
          if (paramString2 == null)
          {
            localBundle = new Bundle();
            localBundle.putString("id", paramString1);
            localBundle.putInt("widgetState", 2102);
            f.a(i.azC().zV(paramString1), localBundle, f.a.class, null);
          }
          AppMethodBeat.o(11001);
          paramString1 = paramString2;
        }
      }
      else
      {
        AppMethodBeat.o(11001);
        paramString1 = localBundle;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.c
 * JD-Core Version:    0.6.2
 */