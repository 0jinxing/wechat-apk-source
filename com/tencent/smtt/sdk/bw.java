package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.IconListener;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

class bw
{
  private DexLoader a;

  public bw(DexLoader paramDexLoader)
  {
    this.a = paramDexLoader;
  }

  public int a(Context paramContext, String paramString1, Map<String, String> paramMap, String paramString2, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(65107);
    int i;
    if (TbsDownloader.getOverSea(paramContext))
    {
      i = -103;
      AppMethodBeat.o(65107);
    }
    while (true)
    {
      return i;
      if (paramString2 == null)
      {
        paramValueCallback = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, Map.class, ValueCallback.class }, new Object[] { paramContext, paramString1, paramMap, paramValueCallback });
        paramString2 = paramValueCallback;
        if (paramValueCallback == null)
          paramString2 = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, Map.class }, new Object[] { paramContext, paramString1, paramMap });
        paramMap = paramString2;
        if (paramString2 == null)
          paramMap = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString1 });
        if (paramMap == null)
        {
          i = -104;
          AppMethodBeat.o(65107);
        }
        else
        {
          i = ((Integer)paramMap).intValue();
          AppMethodBeat.o(65107);
        }
      }
      else
      {
        paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, String.class }, new Object[] { paramContext, paramString1, paramString2 });
        if (paramContext == null)
        {
          i = -104;
          AppMethodBeat.o(65107);
        }
        else
        {
          i = ((Integer)paramContext).intValue();
          AppMethodBeat.o(65107);
        }
      }
    }
  }

  public IX5WebViewBase a(Context paramContext)
  {
    Object localObject1 = null;
    AppMethodBeat.i(65051);
    Object localObject2 = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createSDKWebview", new Class[] { Context.class }, new Object[] { paramContext });
    if (localObject2 == null);
    try
    {
      localObject3 = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((localObject3 != null) && ((localObject3 instanceof Throwable)))
        TbsCoreLoadStat.getInstance().a(paramContext, 325, (Throwable)localObject3);
      if ((localObject3 != null) && ((localObject3 instanceof String)))
      {
        localObject4 = TbsCoreLoadStat.getInstance();
        localObject5 = new java/lang/Throwable;
        ((Throwable)localObject5).<init>((String)localObject3);
        ((TbsCoreLoadStat)localObject4).a(paramContext, 325, (Throwable)localObject5);
      }
      localObject4 = null;
      localObject3 = null;
      do
      {
        if (localObject3 != null)
          break;
        AppMethodBeat.o(65051);
        localObject4 = localObject1;
        return localObject4;
        localObject5 = (IX5WebViewBase)localObject2;
        localObject4 = localObject5;
        localObject3 = localObject2;
      }
      while (localObject5 == null);
      localObject4 = localObject5;
      localObject3 = localObject2;
    }
    catch (Exception paramContext)
    {
      while (true)
        try
        {
          if (((IX5WebViewBase)localObject5).getView() == null)
          {
            localObject4 = TbsCoreLoadStat.getInstance();
            localObject3 = new java/lang/Throwable;
            ((Throwable)localObject3).<init>("x5webview.getView is null!");
            ((TbsCoreLoadStat)localObject4).a(paramContext, 325, (Throwable)localObject3);
            localObject3 = null;
            localObject4 = localObject5;
            continue;
            AppMethodBeat.o(65051);
            continue;
            paramContext = paramContext;
            localObject4 = null;
            localObject3 = localObject2;
          }
        }
        catch (Exception paramContext)
        {
          Object localObject5;
          Object localObject4 = localObject5;
          Object localObject3 = localObject2;
        }
    }
  }

  public InputStream a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(65054);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCacheFile", new Class[] { String.class, Boolean.TYPE }, new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65054);
    }
    while (true)
    {
      return paramString;
      paramString = (InputStream)paramString;
      AppMethodBeat.o(65054);
    }
  }

  public String a(String paramString)
  {
    AppMethodBeat.i(65052);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCookie", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65052);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65052);
    }
  }

  public String a(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(65091);
    paramString1 = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilComposeSearchUrl", new Class[] { String.class, String.class, String.class }, new Object[] { paramString1, paramString2, paramString3 });
    if (paramString1 == null)
    {
      paramString1 = null;
      AppMethodBeat.o(65091);
    }
    while (true)
    {
      return paramString1;
      paramString1 = (String)paramString1;
      AppMethodBeat.o(65091);
    }
  }

  public void a(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(65106);
    TbsLog.w("desktop", " tbsWizard clearAllX5Cache");
    if (paramBoolean)
    {
      this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "clearAllCache", new Class[] { Context.class }, new Object[] { paramContext });
      AppMethodBeat.o(65106);
    }
    while (true)
    {
      return;
      try
      {
        this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "clearAllCache", new Class[] { Context.class, Boolean.TYPE }, new Object[] { paramContext, Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(65106);
      }
      catch (Exception localException)
      {
        this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
        this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearHttpAuthUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
        this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearFormData", new Class[] { Context.class }, new Object[] { paramContext });
        this.a.invokeStaticMethod("com.tencent.smtt.webkit.CacheManager", "removeAllCacheFiles", null, new Object[0]);
        this.a.invokeStaticMethod("com.tencent.smtt.webkit.CacheManager", "clearLocalStorage", null, new Object[0]);
        paramContext = this.a.invokeStaticMethod("com.tencent.smtt.net.http.DnsManager", "getInstance", null, new Object[0]);
        if (paramContext != null)
          this.a.invokeMethod(paramContext, "com.tencent.smtt.net.http.DnsManager", "removeAllDns", null, new Object[0]);
        paramContext = this.a.invokeStaticMethod("com.tencent.smtt.webkit.SmttPermanentPermissions", "getInstance", null, new Object[0]);
        if (paramContext != null)
          this.a.invokeMethod(paramContext, "com.tencent.smtt.webkit.SmttPermanentPermissions", "clearAllPermanentPermission", null, new Object[0]);
        this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "removeAllIcons", null, new Object[0]);
        AppMethodBeat.o(65106);
      }
    }
  }

  public void a(ValueCallback<Map> paramValueCallback)
  {
    AppMethodBeat.i(65073);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetOrigins", new Class[] { ValueCallback.class }, new Object[] { paramValueCallback });
    AppMethodBeat.o(65073);
  }

  public void a(String paramString, long paramLong)
  {
    AppMethodBeat.i(65076);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageSetQuotaForOrigin", new Class[] { String.class, Long.TYPE }, new Object[] { paramString, Long.valueOf(paramLong) });
    AppMethodBeat.o(65076);
  }

  public void a(String paramString, ValueCallback<Long> paramValueCallback)
  {
    AppMethodBeat.i(65074);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetUsageForOrigin", new Class[] { String.class, ValueCallback.class }, new Object[] { paramString, paramValueCallback });
    AppMethodBeat.o(65074);
  }

  public void a(String paramString, IconListener paramIconListener)
  {
    AppMethodBeat.i(65063);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "requestIconForPageUrl", new Class[] { String.class, IconListener.class }, new Object[] { paramString, paramIconListener });
    AppMethodBeat.o(65063);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(65050);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webview_setWebContentsDebuggingEnabled", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(65050);
  }

  public boolean a()
  {
    AppMethodBeat.i(65045);
    while (true)
    {
      try
      {
        Object localObject = this.a.getClassLoader().loadClass("com.tencent.tbs.tbsshell.WebCoreProxy").getMethod("canUseX5", new Class[0]);
        ((Method)localObject).setAccessible(true);
        localObject = ((Method)localObject).invoke(null, new Object[0]);
        if ((localObject instanceof Boolean))
        {
          bool = ((Boolean)localObject).booleanValue();
          AppMethodBeat.o(65045);
          return bool;
        }
      }
      catch (Throwable localThrowable)
      {
        AppMethodBeat.o(65045);
        throw localThrowable;
      }
      boolean bool = ((Boolean)localThrowable).booleanValue();
      AppMethodBeat.o(65045);
    }
  }

  public boolean a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(65108);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "canOpenFile", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString });
    boolean bool;
    if ((paramContext instanceof Boolean))
    {
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(65108);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(65108);
      bool = false;
    }
  }

  public boolean a(Map<String, String[]> paramMap)
  {
    AppMethodBeat.i(65049);
    paramMap = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookies", new Class[] { Map.class }, new Object[] { paramMap });
    boolean bool;
    if (paramMap == null)
    {
      AppMethodBeat.o(65049);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramMap).booleanValue();
      AppMethodBeat.o(65049);
    }
  }

  public byte[] a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65092);
    paramArrayOfByte = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilDecode", new Class[] { String.class }, new Object[] { paramArrayOfByte });
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(65092);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = (byte[])paramArrayOfByte;
      AppMethodBeat.o(65092);
    }
  }

  public Uri[] a(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(65061);
    paramIntent = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "parseFileChooserResult", new Class[] { Integer.TYPE, Intent.class }, new Object[] { Integer.valueOf(paramInt), paramIntent });
    if (paramIntent == null)
    {
      paramIntent = null;
      AppMethodBeat.o(65061);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = (Uri[])paramIntent;
      AppMethodBeat.o(65061);
    }
  }

  public DexLoader b()
  {
    return this.a;
  }

  public String b(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(65105);
    paramString1 = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilGuessFileName", new Class[] { String.class, String.class, String.class }, new Object[] { paramString1, paramString2, paramString3 });
    if (paramString1 == null)
    {
      paramString1 = null;
      AppMethodBeat.o(65105);
    }
    while (true)
    {
      return paramString1;
      paramString1 = (String)paramString1;
      AppMethodBeat.o(65105);
    }
  }

  public void b(ValueCallback<Set<String>> paramValueCallback)
  {
    AppMethodBeat.i(65080);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "geolocationPermissionsGetOrigins", new Class[] { ValueCallback.class }, new Object[] { paramValueCallback });
    AppMethodBeat.o(65080);
  }

  public void b(String paramString)
  {
    AppMethodBeat.i(65060);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "openIconDB", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65060);
  }

  public void b(String paramString, ValueCallback<Long> paramValueCallback)
  {
    AppMethodBeat.i(65075);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetQuotaForOrigin", new Class[] { String.class, ValueCallback.class }, new Object[] { paramString, paramValueCallback });
    AppMethodBeat.o(65075);
  }

  public boolean b(Context paramContext)
  {
    AppMethodBeat.i(65067);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65067);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(65067);
    }
  }

  public Object c()
  {
    AppMethodBeat.i(65046);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cacheDisabled", new Class[0], new Object[0]);
    AppMethodBeat.o(65046);
    return localObject;
  }

  public void c(Context paramContext)
  {
    AppMethodBeat.i(65068);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
    AppMethodBeat.o(65068);
  }

  public void c(String paramString)
  {
    AppMethodBeat.i(65064);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "retainIconForPageUrl", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65064);
  }

  public void c(String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(65081);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "geolocationPermissionsGetAllowed", new Class[] { String.class, ValueCallback.class }, new Object[] { paramString, paramValueCallback });
    AppMethodBeat.o(65081);
  }

  public void d(String paramString)
  {
    AppMethodBeat.i(65065);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "releaseIconForPageUrl", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65065);
  }

  public boolean d()
  {
    AppMethodBeat.i(65047);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptCookie", new Class[0], new Object[0]);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(65047);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(65047);
    }
  }

  public boolean d(Context paramContext)
  {
    AppMethodBeat.i(65069);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasHttpAuthUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65069);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(65069);
    }
  }

  public void e()
  {
    AppMethodBeat.i(65048);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookie", new Class[0], new Object[0]);
    AppMethodBeat.o(65048);
  }

  public void e(Context paramContext)
  {
    AppMethodBeat.i(65070);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearHttpAuthUsernamePassword", new Class[] { Context.class }, new Object[] { paramContext });
    AppMethodBeat.o(65070);
  }

  public void e(String paramString)
  {
    AppMethodBeat.i(65077);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageDeleteOrigin", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65077);
  }

  public String f()
  {
    AppMethodBeat.i(65053);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getMiniQBVersion", new Class[0], new Object[0]);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(65053);
    }
    while (true)
    {
      return localObject;
      localObject = (String)localObject;
      AppMethodBeat.o(65053);
    }
  }

  public void f(String paramString)
  {
    AppMethodBeat.i(65082);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "geolocationPermissionsClear", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65082);
  }

  public boolean f(Context paramContext)
  {
    AppMethodBeat.i(65071);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasFormData", new Class[] { Context.class }, new Object[] { paramContext });
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65071);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(65071);
    }
  }

  public Object g()
  {
    AppMethodBeat.i(65055);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCachFileBaseDir", new Class[0], new Object[0]);
    AppMethodBeat.o(65055);
    return localObject;
  }

  public void g(Context paramContext)
  {
    AppMethodBeat.i(65072);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearFormData", new Class[] { Context.class }, new Object[] { paramContext });
    AppMethodBeat.o(65072);
  }

  public void g(String paramString)
  {
    AppMethodBeat.i(65083);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "geolocationPermissionsAllow", new Class[] { String.class }, new Object[] { paramString });
    AppMethodBeat.o(65083);
  }

  public IX5DateSorter h(Context paramContext)
  {
    AppMethodBeat.i(65079);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDateSorter", new Class[] { Context.class }, new Object[] { paramContext });
    if (paramContext == null)
    {
      paramContext = null;
      AppMethodBeat.o(65079);
    }
    while (true)
    {
      return paramContext;
      paramContext = (IX5DateSorter)paramContext;
      AppMethodBeat.o(65079);
    }
  }

  public String h(String paramString)
  {
    AppMethodBeat.i(65085);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "mimeTypeMapGetFileExtensionFromUrl", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65085);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65085);
    }
  }

  public boolean h()
  {
    AppMethodBeat.i(65056);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_hasCookies", new Class[0], new Object[0]);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(65056);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(65056);
    }
  }

  public IX5WebChromeClient i()
  {
    AppMethodBeat.i(65057);
    Object localObject;
    if (this.a == null)
    {
      AppMethodBeat.o(65057);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClient", new Class[0], new Object[0]);
      if (localObject == null)
      {
        AppMethodBeat.o(65057);
        localObject = null;
      }
      else
      {
        localObject = (IX5WebChromeClient)localObject;
        AppMethodBeat.o(65057);
      }
    }
  }

  public String i(Context paramContext)
  {
    AppMethodBeat.i(65110);
    paramContext = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getDefaultUserAgent", new Class[] { Context.class }, new Object[] { paramContext });
    if ((paramContext instanceof String))
    {
      paramContext = (String)paramContext;
      AppMethodBeat.o(65110);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(65110);
    }
  }

  public boolean i(String paramString)
  {
    AppMethodBeat.i(65086);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "mimeTypeMapHasMimeType", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65086);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65086);
    }
  }

  public IX5WebViewClient j()
  {
    AppMethodBeat.i(65058);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebViewClient", new Class[0], new Object[0]);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(65058);
    }
    while (true)
    {
      return localObject;
      localObject = (IX5WebViewClient)localObject;
      AppMethodBeat.o(65058);
    }
  }

  public String j(String paramString)
  {
    AppMethodBeat.i(65087);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "mimeTypeMapGetMimeTypeFromExtension", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65087);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65087);
    }
  }

  public IX5WebViewClientExtension k()
  {
    AppMethodBeat.i(65059);
    Object localObject = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClientExtension", new Class[0], new Object[0]);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(65059);
    }
    while (true)
    {
      return localObject;
      localObject = (IX5WebViewClientExtension)localObject;
      AppMethodBeat.o(65059);
    }
  }

  public boolean k(String paramString)
  {
    AppMethodBeat.i(65088);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "mimeTypeMapHasExtension", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65088);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65088);
    }
  }

  public String l(String paramString)
  {
    AppMethodBeat.i(65089);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "mimeTypeMapGetMimeTypeFromExtension", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65089);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65089);
    }
  }

  public void l()
  {
    AppMethodBeat.i(65062);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "removeAllIcons", null, new Object[0]);
    AppMethodBeat.o(65062);
  }

  public String m(String paramString)
  {
    AppMethodBeat.i(65090);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilGuessUrl", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65090);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65090);
    }
  }

  public void m()
  {
    AppMethodBeat.i(65066);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "closeIconDB", null, new Object[0]);
    AppMethodBeat.o(65066);
  }

  public void n()
  {
    AppMethodBeat.i(65078);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageDeleteAllData", null, new Object[0]);
    AppMethodBeat.o(65078);
  }

  public boolean n(String paramString)
  {
    AppMethodBeat.i(65093);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsAssetUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65093);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65093);
    }
  }

  public void o()
  {
    AppMethodBeat.i(65084);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "geolocationPermissionsClearAll", null, new Object[0]);
    AppMethodBeat.o(65084);
  }

  public boolean o(String paramString)
  {
    AppMethodBeat.i(65094);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsCookielessProxyUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65094);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65094);
    }
  }

  public void p()
  {
    AppMethodBeat.i(65109);
    this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "closeFileReader", new Class[0], new Object[0]);
    AppMethodBeat.o(65109);
  }

  public boolean p(String paramString)
  {
    AppMethodBeat.i(65095);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsFileUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65095);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65095);
    }
  }

  public boolean q(String paramString)
  {
    AppMethodBeat.i(65096);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsAboutUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65096);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65096);
    }
  }

  public boolean r(String paramString)
  {
    AppMethodBeat.i(65097);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsDataUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65097);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65097);
    }
  }

  public boolean s(String paramString)
  {
    AppMethodBeat.i(65098);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsJavaScriptUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65098);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65098);
    }
  }

  public boolean t(String paramString)
  {
    AppMethodBeat.i(65099);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsHttpUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65099);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65099);
    }
  }

  public boolean u(String paramString)
  {
    AppMethodBeat.i(65100);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsHttpsUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65100);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65100);
    }
  }

  public boolean v(String paramString)
  {
    AppMethodBeat.i(65101);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsNetworkUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65101);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65101);
    }
  }

  public boolean w(String paramString)
  {
    AppMethodBeat.i(65102);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsContentUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65102);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65102);
    }
  }

  public boolean x(String paramString)
  {
    AppMethodBeat.i(65103);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilIsValidUrl", new Class[] { String.class }, new Object[] { paramString });
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(65103);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(65103);
    }
  }

  public String y(String paramString)
  {
    AppMethodBeat.i(65104);
    paramString = this.a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "urlUtilStripAnchor", new Class[] { String.class }, new Object[] { paramString });
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(65104);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString;
      AppMethodBeat.o(65104);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bw
 * JD-Core Version:    0.6.2
 */