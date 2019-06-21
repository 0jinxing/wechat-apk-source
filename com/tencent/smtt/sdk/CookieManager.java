package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CookieManager
{
  public static String LOGTAG = "CookieManager";
  private static CookieManager d;
  ArrayList<b> a;
  String b;
  CookieManager.a c = CookieManager.a.a;
  private boolean e = false;
  private boolean f = false;

  public static CookieManager getInstance()
  {
    AppMethodBeat.i(63865);
    if (d == null);
    try
    {
      if (d == null)
      {
        localCookieManager = new com/tencent/smtt/sdk/CookieManager;
        localCookieManager.<init>();
        d = localCookieManager;
      }
      CookieManager localCookieManager = d;
      AppMethodBeat.o(63865);
      return localCookieManager;
    }
    finally
    {
      AppMethodBeat.o(63865);
    }
  }

  public static int getROMCookieDBVersion(Context paramContext)
  {
    AppMethodBeat.i(63885);
    if (Build.VERSION.SDK_INT >= 11);
    for (paramContext = paramContext.getSharedPreferences("cookiedb_info", 4); ; paramContext = paramContext.getSharedPreferences("cookiedb_info", 0))
    {
      int i = paramContext.getInt("db_version", -1);
      AppMethodBeat.o(63885);
      return i;
    }
  }

  public static void setROMCookieDBVersion(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(63886);
    if (Build.VERSION.SDK_INT >= 11);
    for (paramContext = paramContext.getSharedPreferences("cookiedb_info", 4); ; paramContext = paramContext.getSharedPreferences("cookiedb_info", 0))
    {
      paramContext = paramContext.edit();
      paramContext.putInt("db_version", paramInt);
      paramContext.commit();
      AppMethodBeat.o(63886);
      return;
    }
  }

  void a()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(63882);
        this.f = true;
        if ((this.a == null) || (this.a.size() == 0))
        {
          AppMethodBeat.o(63882);
          return;
        }
        Object localObject1 = bv.a();
        if ((localObject1 == null) || (!((bv)localObject1).b()))
          break label146;
        localIterator = this.a.iterator();
        if (!localIterator.hasNext())
          break label296;
        localObject1 = (b)localIterator.next();
        switch (((b)localObject1).a)
        {
        default:
          break;
        case 1:
          setCookie(((b)localObject1).b, ((b)localObject1).c, ((b)localObject1).d);
          continue;
        case 2:
        }
      }
      finally
      {
      }
      setCookie(localObject2.b, localObject2.c);
      continue;
      label146: Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Object localObject3 = (b)localIterator.next();
        switch (((b)localObject3).a)
        {
        default:
          break;
        case 1:
          if (Build.VERSION.SDK_INT >= 21)
          {
            android.webkit.CookieManager localCookieManager = android.webkit.CookieManager.getInstance();
            String str1 = ((b)localObject3).b;
            String str2 = ((b)localObject3).c;
            localObject3 = ((b)localObject3).d;
            r.a(localCookieManager, "setCookie", new Class[] { String.class, String.class, android.webkit.ValueCallback.class }, new Object[] { str1, str2, localObject3 });
          }
          break;
        case 2:
          android.webkit.CookieManager.getInstance().setCookie(((b)localObject3).b, ((b)localObject3).c);
        }
      }
      label296: this.a.clear();
      AppMethodBeat.o(63882);
    }
  }

  protected void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l1;
    long l2;
    Object localObject1;
    Object localObject2;
    boolean bool;
    int i;
    int j;
    int k;
    while (true)
    {
      try
      {
        AppMethodBeat.i(63884);
        if ((this.c == CookieManager.a.a) || (paramContext == null) || (!TbsExtensionFunctionManager.getInstance().canUseFunction(paramContext, "cookie_switch.txt")) || (this.e))
        {
          AppMethodBeat.o(63884);
          return;
        }
        l1 = System.currentTimeMillis();
        l2 = 0L;
        localObject1 = LOGTAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("compatiableCookieDatabaseIfNeed,isX5Inited:");
        TbsLog.i((String)localObject1, paramBoolean1 + ",useX5:" + paramBoolean2);
        if ((!paramBoolean1) && (!QbSdk.getIsSysWebViewForcedByOuter()) && (!QbSdk.a))
          break label536;
        if ((QbSdk.getIsSysWebViewForcedByOuter()) || (QbSdk.a))
          paramBoolean2 = false;
        bool = TbsExtensionFunctionManager.getInstance().canUseFunction(paramContext, "usex5.txt");
        localObject1 = LOGTAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("usex5 : mUseX5LastProcess->");
        TbsLog.i((String)localObject1, bool + ",useX5:" + paramBoolean2);
        TbsExtensionFunctionManager.getInstance().setFunctionEnable(paramContext, "usex5.txt", paramBoolean2);
        if (bool == paramBoolean2)
        {
          AppMethodBeat.o(63884);
          continue;
        }
      }
      finally
      {
      }
      localObject1 = TbsLogReport.getInstance(paramContext).tbsLogInfo();
      if (!TextUtils.isEmpty(this.b))
      {
        if ((an.a().n(paramContext) > 0) && (an.a().n(paramContext) < 36001))
        {
          AppMethodBeat.o(63884);
          continue;
        }
        if (bool)
        {
          i = x.d(paramContext);
          j = i;
          if (i <= 0)
            break label460;
          k = getROMCookieDBVersion(paramContext);
          if (k > 0)
            break label552;
          paramBoolean1 = true;
          j = i;
        }
      }
    }
    while (true)
    {
      label294: if ((!paramBoolean1) && ((j <= 0) || (k <= 0)))
        ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(702);
      while (true)
      {
        while (true)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("x5->sys:");
          ((TbsLogReport.TbsLogInfo)localObject1).setFailDetail(bool + " from:" + j + " to:" + k + ",timeused:" + l2);
          TbsLogReport.getInstance(paramContext).eventReport(TbsLogReport.EventType.TYPE_COOKIE_DB_SWITCH, (TbsLogReport.TbsLogInfo)localObject1);
          AppMethodBeat.o(63884);
          break;
          i = x.d(paramContext);
          j = i;
          if (i > 0)
          {
            localObject2 = an.a().d(paramContext, "cookies_database_version");
            paramBoolean1 = TextUtils.isEmpty((CharSequence)localObject2);
            j = i;
            if (!paramBoolean1)
              try
              {
                k = Integer.parseInt((String)localObject2);
                paramBoolean1 = false;
                j = i;
              }
              catch (Exception localException)
              {
                j = i;
              }
          }
        }
        label460: paramBoolean1 = false;
        k = 0;
        break label294;
        if (k >= j)
        {
          ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(703);
        }
        else
        {
          x.a(paramContext, this.c, this.b, paramBoolean1, paramBoolean2);
          ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(704);
          l2 = System.currentTimeMillis() - l1;
          continue;
          ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(701);
          k = 0;
          j = 0;
        }
      }
      label536: bv.a().a(paramContext, null);
      AppMethodBeat.o(63884);
      break;
      label552: paramBoolean1 = false;
      j = i;
    }
  }

  public boolean acceptCookie()
  {
    AppMethodBeat.i(63879);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().d();
      AppMethodBeat.o(63879);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.CookieManager.getInstance().acceptCookie();
      AppMethodBeat.o(63879);
    }
  }

  public boolean acceptThirdPartyCookies(WebView paramWebView)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(63874);
        Object localObject = bv.a();
        if ((localObject != null) && (((bv)localObject).b()))
        {
          localObject = ((bv)localObject).c().b();
          paramWebView = paramWebView.getView();
          paramWebView = ((DexLoader)localObject).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptThirdPartyCookies", new Class[] { Object.class }, new Object[] { paramWebView });
          if (paramWebView != null)
          {
            bool = ((Boolean)paramWebView).booleanValue();
            AppMethodBeat.o(63874);
            return bool;
          }
          AppMethodBeat.o(63874);
          bool = true;
          continue;
        }
        if (Build.VERSION.SDK_INT < 21)
        {
          AppMethodBeat.o(63874);
          bool = true;
          continue;
        }
        localObject = android.webkit.CookieManager.getInstance();
        paramWebView = paramWebView.getView();
        paramWebView = r.a(localObject, "acceptThirdPartyCookies", new Class[] { android.webkit.WebView.class }, new Object[] { paramWebView });
        if (paramWebView != null)
        {
          bool = ((Boolean)paramWebView).booleanValue();
          AppMethodBeat.o(63874);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(63874);
      boolean bool = false;
    }
  }

  public void flush()
  {
    AppMethodBeat.i(63870);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
      AppMethodBeat.o(63870);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(63870);
      }
      else
      {
        r.a(android.webkit.CookieManager.getInstance(), "flush", new Class[0], new Object[0]);
        AppMethodBeat.o(63870);
      }
    }
  }

  public String getCookie(String paramString)
  {
    AppMethodBeat.i(63880);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().a(paramString);
      AppMethodBeat.o(63880);
    }
    while (true)
    {
      return paramString;
      localbv = null;
      try
      {
        paramString = android.webkit.CookieManager.getInstance().getCookie(paramString);
        AppMethodBeat.o(63880);
      }
      catch (Throwable paramString)
      {
        while (true)
          paramString = localbv;
      }
    }
  }

  public boolean hasCookies()
  {
    AppMethodBeat.i(63878);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().h();
      AppMethodBeat.o(63878);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.CookieManager.getInstance().hasCookies();
      AppMethodBeat.o(63878);
    }
  }

  public void removeAllCookie()
  {
    AppMethodBeat.i(63868);
    if (this.a != null)
      this.a.clear();
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().e();
      AppMethodBeat.o(63868);
    }
    while (true)
    {
      return;
      android.webkit.CookieManager.getInstance().removeAllCookie();
      AppMethodBeat.o(63868);
    }
  }

  public void removeAllCookies(ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(63869);
    if (this.a != null)
      this.a.clear();
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[] { android.webkit.ValueCallback.class }, new Object[] { paramValueCallback });
      AppMethodBeat.o(63869);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(63869);
      }
      else
      {
        r.a(android.webkit.CookieManager.getInstance(), "removeAllCookies", new Class[] { android.webkit.ValueCallback.class }, new Object[] { paramValueCallback });
        AppMethodBeat.o(63869);
      }
    }
  }

  public void removeExpiredCookie()
  {
    AppMethodBeat.i(63871);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
      AppMethodBeat.o(63871);
    }
    while (true)
    {
      return;
      android.webkit.CookieManager.getInstance().removeExpiredCookie();
      AppMethodBeat.o(63871);
    }
  }

  public void removeSessionCookie()
  {
    AppMethodBeat.i(63866);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
      AppMethodBeat.o(63866);
    }
    while (true)
    {
      return;
      android.webkit.CookieManager.getInstance().removeSessionCookie();
      AppMethodBeat.o(63866);
    }
  }

  public void removeSessionCookies(ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(63867);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[] { android.webkit.ValueCallback.class }, new Object[] { paramValueCallback });
      AppMethodBeat.o(63867);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(63867);
      }
      else
      {
        r.a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", new Class[] { android.webkit.ValueCallback.class }, new Object[] { paramValueCallback });
        AppMethodBeat.o(63867);
      }
    }
  }

  // ERROR //
  public void setAcceptCookie(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 398
    //   5: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 110	com/tencent/smtt/sdk/bv:a	()Lcom/tencent/smtt/sdk/bv;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +57 -> 70
    //   16: aload_2
    //   17: invokevirtual 112	com/tencent/smtt/sdk/bv:b	()Z
    //   20: ifeq +50 -> 70
    //   23: aload_2
    //   24: invokevirtual 307	com/tencent/smtt/sdk/bv:c	()Lcom/tencent/smtt/sdk/bw;
    //   27: invokevirtual 319	com/tencent/smtt/sdk/bw:b	()Lcom/tencent/smtt/export/external/DexLoader;
    //   30: ldc_w 327
    //   33: ldc_w 400
    //   36: iconst_1
    //   37: anewarray 149	java/lang/Class
    //   40: dup
    //   41: iconst_0
    //   42: getstatic 404	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   45: aastore
    //   46: iconst_1
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: iload_1
    //   53: invokestatic 408	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   56: aastore
    //   57: invokevirtual 335	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: ldc_w 398
    //   64: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: invokestatic 146	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   73: iload_1
    //   74: invokevirtual 410	android/webkit/CookieManager:setAcceptCookie	(Z)V
    //   77: ldc_w 398
    //   80: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -16 -> 67
    //   86: astore_2
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_2
    //   90: athrow
    //   91: astore_2
    //   92: ldc_w 398
    //   95: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: goto -31 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   2	12	86	finally
    //   16	67	86	finally
    //   70	77	86	finally
    //   77	83	86	finally
    //   92	98	86	finally
    //   70	77	91	java/lang/Throwable
  }

  public void setAcceptThirdPartyCookies(WebView paramWebView, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(63873);
        localObject1 = bv.a();
        if ((localObject1 != null) && (((bv)localObject1).b()))
        {
          localObject1 = ((bv)localObject1).c().b();
          localObject2 = Boolean.TYPE;
          paramWebView = paramWebView.getView();
          ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptThirdPartyCookies", new Class[] { Object.class, localObject2 }, new Object[] { paramWebView, Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(63873);
          return;
        }
        if (Build.VERSION.SDK_INT < 21)
        {
          AppMethodBeat.o(63873);
          continue;
        }
      }
      finally
      {
      }
      Object localObject2 = android.webkit.CookieManager.getInstance();
      Object localObject1 = Boolean.TYPE;
      paramWebView = paramWebView.getView();
      r.a(localObject2, "setAcceptThirdPartyCookies", new Class[] { android.webkit.WebView.class, localObject1 }, new Object[] { paramWebView, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(63873);
    }
  }

  public void setCookie(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(63875);
      setCookie(paramString1, paramString2, false);
      AppMethodBeat.o(63875);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  public void setCookie(String paramString1, String paramString2, ValueCallback<Boolean> paramValueCallback)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(63877);
        Object localObject = bv.a();
        if ((localObject != null) && (((bv)localObject).b()))
        {
          ((bv)localObject).c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[] { String.class, String.class, android.webkit.ValueCallback.class }, new Object[] { paramString1, paramString2, paramValueCallback });
          AppMethodBeat.o(63877);
          return;
        }
        if (!bv.a().d())
        {
          b localb = new com/tencent/smtt/sdk/CookieManager$b;
          localb.<init>(this);
          localb.a = 1;
          localb.b = paramString1;
          localb.c = paramString2;
          localb.d = paramValueCallback;
          if (this.a == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            this.a = ((ArrayList)localObject);
          }
          this.a.add(localb);
        }
        if (!this.f)
          break label238;
        if (Build.VERSION.SDK_INT < 21)
        {
          AppMethodBeat.o(63877);
          continue;
        }
      }
      finally
      {
      }
      r.a(android.webkit.CookieManager.getInstance(), "setCookie", new Class[] { String.class, String.class, android.webkit.ValueCallback.class }, new Object[] { paramString1, paramString2, paramValueCallback });
      label238: AppMethodBeat.o(63877);
    }
  }

  public void setCookie(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(63876);
      Object localObject = bv.a();
      if ((localObject != null) && (((bv)localObject).b()))
      {
        ((bv)localObject).c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[] { String.class, String.class }, new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(63876);
      }
      while (true)
      {
        return;
        if ((this.f) || (paramBoolean))
          android.webkit.CookieManager.getInstance().setCookie(paramString1, paramString2);
        if (!bv.a().d())
        {
          localObject = new com/tencent/smtt/sdk/CookieManager$b;
          ((b)localObject).<init>(this);
          ((b)localObject).a = 2;
          ((b)localObject).b = paramString1;
          ((b)localObject).c = paramString2;
          ((b)localObject).d = null;
          if (this.a == null)
          {
            paramString1 = new java/util/ArrayList;
            paramString1.<init>();
            this.a = paramString1;
          }
          this.a.add(localObject);
        }
        AppMethodBeat.o(63876);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public boolean setCookieCompatialbeMode(Context paramContext, CookieManager.a parama, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63883);
    System.currentTimeMillis();
    if ((paramContext == null) || (!TbsExtensionFunctionManager.getInstance().canUseFunction(paramContext, "cookie_switch.txt")))
    {
      paramBoolean = false;
      AppMethodBeat.o(63883);
    }
    while (true)
    {
      return paramBoolean;
      this.c = parama;
      if (paramString != null)
        this.b = paramString;
      if ((this.c != CookieManager.a.a) && (paramBoolean) && (!bv.a().d()))
        bv.a().a(paramContext, null);
      paramBoolean = true;
      AppMethodBeat.o(63883);
    }
  }

  public void setCookies(Map<String, String[]> paramMap)
  {
    AppMethodBeat.i(63881);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()));
    for (boolean bool = ((bv)localObject).c().a(paramMap); ; bool = false)
    {
      if (!bool)
      {
        Iterator localIterator = paramMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localObject = (String[])paramMap.get(str);
          int i = localObject.length;
          for (int j = 0; j < i; j++)
            setCookie(str, localObject[j]);
        }
      }
      AppMethodBeat.o(63881);
      return;
    }
  }

  class b
  {
    int a;
    String b;
    String c;
    ValueCallback<Boolean> d;

    b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.CookieManager
 * JD-Core Version:    0.6.2
 */