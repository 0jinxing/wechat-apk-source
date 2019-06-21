package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class WxaCommLibRuntimeReader
{
  private static com.tencent.mm.plugin.appbrand.appstorage.o gTE;
  private static Future<Object> gTF;
  private static final ThreadPoolExecutor gTG;

  static
  {
    AppMethodBeat.i(59474);
    gTG = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    AppMethodBeat.o(59474);
  }

  // ERROR //
  public static void avN()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 53
    //   5: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 56	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:sg	()V
    //   11: getstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   14: ifnonnull +80 -> 94
    //   17: getstatic 64	com/tencent/mm/plugin/appbrand/appcache/c:gSg	Lcom/tencent/mm/plugin/appbrand/appcache/c;
    //   20: putstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   23: ldc 53
    //   25: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: ldc 2
    //   30: monitorexit
    //   31: return
    //   32: astore_0
    //   33: ldc 66
    //   35: ldc 68
    //   37: iconst_1
    //   38: anewarray 4	java/lang/Object
    //   41: dup
    //   42: iconst_0
    //   43: aload_0
    //   44: aastore
    //   45: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: getstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   51: ifnonnull +43 -> 94
    //   54: getstatic 64	com/tencent/mm/plugin/appbrand/appcache/c:gSg	Lcom/tencent/mm/plugin/appbrand/appcache/c;
    //   57: putstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   60: ldc 53
    //   62: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: goto -37 -> 28
    //   68: astore_0
    //   69: ldc 2
    //   71: monitorexit
    //   72: aload_0
    //   73: athrow
    //   74: astore_0
    //   75: getstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   78: ifnonnull +9 -> 87
    //   81: getstatic 64	com/tencent/mm/plugin/appbrand/appcache/c:gSg	Lcom/tencent/mm/plugin/appbrand/appcache/c;
    //   84: putstatic 58	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:gTE	Lcom/tencent/mm/plugin/appbrand/appstorage/o;
    //   87: ldc 53
    //   89: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_0
    //   93: athrow
    //   94: ldc 53
    //   96: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: goto -71 -> 28
    //
    // Exception table:
    //   from	to	target	type
    //   8	11	32	java/lang/Throwable
    //   3	8	68	finally
    //   11	28	68	finally
    //   48	65	68	finally
    //   75	87	68	finally
    //   87	94	68	finally
    //   94	99	68	finally
    //   8	11	74	finally
    //   33	48	74	finally
  }

  public static boolean avO()
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(59466);
      com.tencent.mm.plugin.appbrand.appstorage.o localo = gTE;
      ab.i("MicroMsg.WxaCommLibRuntimeReader", "loaded(), reader %s", new Object[] { localo });
      if (localo != null)
        AppMethodBeat.o(59466);
      while (true)
      {
        return bool;
        AppMethodBeat.o(59466);
        bool = false;
      }
    }
    finally
    {
    }
  }

  public static com.tencent.mm.plugin.appbrand.appstorage.o avP()
  {
    try
    {
      AppMethodBeat.i(59467);
      if (gTE == null)
        avN();
      com.tencent.mm.plugin.appbrand.appstorage.o localo = gTE;
      AppMethodBeat.o(59467);
      return localo;
    }
    finally
    {
    }
  }

  public static WxaPkgWrappingInfo avQ()
  {
    AppMethodBeat.i(59473);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = avP().avm();
    AppMethodBeat.o(59473);
    return localWxaPkgWrappingInfo;
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(59471);
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream);
    char[] arrayOfChar = new char[4096];
    StringWriter localStringWriter = new StringWriter();
    try
    {
      while (true)
      {
        int i = localInputStreamReader.read(arrayOfChar);
        if (-1 == i)
          break;
        localStringWriter.write(arrayOfChar, 0, i);
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.WxaCommLibRuntimeReader", "convertStreamToString: read, %s", new Object[] { localException.getMessage() });
      String str = "";
      bo.b(localInputStreamReader);
      bo.b(paramInputStream);
      AppMethodBeat.o(59471);
      paramInputStream = str;
      while (true)
      {
        return paramInputStream;
        bo.b(localInputStreamReader);
        bo.b(paramInputStream);
        paramInputStream = str.toString();
        AppMethodBeat.o(59471);
      }
    }
    finally
    {
      bo.b(localInputStreamReader);
      bo.b(paramInputStream);
      AppMethodBeat.o(59471);
    }
  }

  public static String getVersionName()
  {
    AppMethodBeat.i(59468);
    String str = avP().avk();
    AppMethodBeat.o(59468);
    return str;
  }

  public static void sg()
  {
    try
    {
      AppMethodBeat.i(59465);
      if (gTE != null)
      {
        ab.i("MicroMsg.WxaCommLibRuntimeReader", "load(), sReader %s loaded", new Object[] { gTE });
        AppMethodBeat.o(59465);
      }
      while (true)
      {
        return;
        if (!an.avU())
          break;
        gTE = c.gSg;
        ab.i("MicroMsg.WxaCommLibRuntimeReader", "load(), forceLocal, use AssetReader");
        AppMethodBeat.o(59465);
      }
    }
    finally
    {
    }
    Object localObject2;
    if (!ah.doI())
    {
      ab.e("MicroMsg.WxaCommLibRuntimeReader", "load(), mm process not exists");
      localObject2 = new com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader$AccountNotReadyError;
      ((AccountNotReadyError)localObject2).<init>();
      AppMethodBeat.o(59465);
      throw ((Throwable)localObject2);
    }
    Object localObject4;
    while (true)
    {
      try
      {
        if (gTF != null)
        {
          ab.i("MicroMsg.WxaCommLibRuntimeReader", "loadAwaitingRetriever(), wait for existing retriever");
          localObject4 = gTF.get(5L, TimeUnit.SECONDS);
          if (!(localObject4 instanceof WxaPkgWrappingInfo))
            break label229;
          localObject2 = (WxaPkgWrappingInfo)localObject4;
          if (!((WxaPkgWrappingInfo)localObject2).gVw)
            break label216;
          localObject2 = c.gSg;
          gTE = (com.tencent.mm.plugin.appbrand.appstorage.o)localObject2;
          AppMethodBeat.o(59465);
          break;
        }
        ab.i("MicroMsg.WxaCommLibRuntimeReader", "loadAwaitingRetriever(), new retriever");
        localObject2 = gTG;
        localObject5 = new com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader$1;
        ((WxaCommLibRuntimeReader.1)localObject5).<init>();
        gTF = ((ThreadPoolExecutor)localObject2).submit((Callable)localObject5);
        continue;
      }
      catch (Throwable localThrowable)
      {
        gTF.cancel(false);
        gTF = null;
        AppMethodBeat.o(59465);
        throw localThrowable;
      }
      label216: localObject3 = new WxaCommLibRuntimeReader.b(localThrowable, (byte)0);
    }
    label229: if ((localObject4 instanceof AccountNotReadyError))
    {
      localObject3 = (AccountNotReadyError)localObject4;
      AppMethodBeat.o(59465);
      throw ((Throwable)localObject3);
    }
    if ((localObject4 instanceof Exception))
    {
      localObject3 = (Exception)localObject4;
      AppMethodBeat.o(59465);
      throw ((Throwable)localObject3);
    }
    Object localObject5 = new java/lang/IllegalArgumentException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>("Unknown result ");
    if (null == localObject4);
    for (localObject3 = "null"; ; localObject3 = localObject4.getClass().getName())
    {
      ((IllegalArgumentException)localObject5).<init>((String)localObject3);
      AppMethodBeat.o(59465);
      throw ((Throwable)localObject5);
    }
  }

  private static InputStream xt(String paramString)
  {
    AppMethodBeat.i(59469);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(59469);
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.plugin.appbrand.appstorage.o localo = avP();
      InputStream localInputStream = localo.openRead(paramString);
      String str = String.format(Locale.US, "[v%d | %d | %s | %b]", new Object[] { Integer.valueOf(localo.avm().gVu), Integer.valueOf(localo.avm().gVt), bo.mx(localo.avm().gVv), Boolean.valueOf(localo.avm().gVw) });
      int i;
      if (localInputStream == null)
        i = -1;
      try
      {
        while (true)
        {
          ab.i("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, ret %d", new Object[] { paramString, str, Integer.valueOf(i) });
          AppMethodBeat.o(59469);
          paramString = localInputStream;
          break;
          i = localInputStream.available();
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, e %s", new Object[] { paramString, str, localException });
      }
    }
  }

  public static String xu(String paramString)
  {
    AppMethodBeat.i(59470);
    paramString = xt(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(59470);
    }
    while (true)
    {
      return paramString;
      paramString = convertStreamToString(paramString);
      AppMethodBeat.o(59470);
    }
  }

  public static com.tencent.xweb.o xv(String paramString)
  {
    AppMethodBeat.i(59472);
    InputStream localInputStream = xt(paramString);
    if (localInputStream == null)
    {
      paramString = null;
      AppMethodBeat.o(59472);
    }
    while (true)
    {
      return paramString;
      paramString = new com.tencent.xweb.o(b.ako(paramString), "UTF-8", localInputStream);
      AppMethodBeat.o(59472);
    }
  }

  static final class AccountNotReadyError extends Error
    implements Parcelable
  {
    public static final Parcelable.Creator<AccountNotReadyError> CREATOR;

    static
    {
      AppMethodBeat.i(59456);
      CREATOR = new WxaCommLibRuntimeReader.AccountNotReadyError.1();
      AppMethodBeat.o(59456);
    }

    AccountNotReadyError()
    {
    }

    AccountNotReadyError(byte paramByte)
    {
    }

    public final int describeContents()
    {
      return 0;
    }

    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader
 * JD-Core Version:    0.6.2
 */