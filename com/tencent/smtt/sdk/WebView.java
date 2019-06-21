package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.d;
import com.tencent.smtt.utils.r;
import com.tencent.smtt.utils.w;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WebView extends FrameLayout
  implements View.OnLongClickListener
{
  public static final int GETPVERROR = -1;
  public static int NIGHT_MODE_ALPHA = 0;
  public static final int NIGHT_MODE_COLOR = -16777216;
  public static final int NORMAL_MODE_ALPHA = 255;
  public static final String SCHEME_GEO = "geo:0,0?q=";
  public static final String SCHEME_MAILTO = "mailto:";
  public static final String SCHEME_TEL = "tel:";
  private static final Lock c;
  private static OutputStream d;
  private static Context j;
  public static boolean mSysWebviewCreated;
  public static boolean mWebViewCreated;
  private static BroadcastReceiver n;
  private static w o;
  private static Method p;
  private static String s;
  private static Paint y;
  private static boolean z;
  private Object A;
  private View.OnLongClickListener B;
  int a;
  private final String b;
  private boolean e;
  private IX5WebViewBase f;
  private WebView.b g;
  private WebSettings h;
  private Context i;
  private boolean k;
  private am l;
  private boolean m;
  public WebViewCallbackClient mWebViewCallbackClient;
  private WebViewClient q;
  private WebChromeClient r;
  private final int t;
  private final int u;
  private final int v;
  private final String w;
  private final String x;

  static
  {
    AppMethodBeat.i(65023);
    c = new ReentrantLock();
    d = null;
    j = null;
    n = null;
    mWebViewCreated = false;
    o = null;
    p = null;
    s = null;
    mSysWebviewCreated = false;
    y = null;
    z = true;
    NIGHT_MODE_ALPHA = 153;
    AppMethodBeat.o(65023);
  }

  public WebView(Context paramContext)
  {
    this(paramContext, null);
  }

  public WebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, false);
  }

  @TargetApi(11)
  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, Map<String, Object> paramMap, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(64862);
    this.b = "WebView";
    this.e = false;
    this.h = null;
    this.i = null;
    this.a = 0;
    this.k = false;
    this.l = null;
    this.m = false;
    this.q = null;
    this.r = null;
    this.t = 1;
    this.u = 2;
    this.v = 3;
    this.w = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
    this.x = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
    this.A = null;
    this.B = null;
    mWebViewCreated = true;
    this.l = new am();
    this.l.a("init_all", (byte)1);
    if ((QbSdk.getIsSysWebViewForcedByOuter()) && (TbsShareManager.isThirdPartyApp(paramContext)))
    {
      this.i = paramContext;
      this.f = null;
      this.e = false;
      QbSdk.a(paramContext, "failed to createTBSWebview!");
      this.g = new WebView.b(this, paramContext, paramAttributeSet);
      CookieManager.getInstance().a(paramContext, true, false);
      CookieSyncManager.createInstance(this.i).startSync();
    }
    try
    {
      paramAttributeSet = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
      paramAttributeSet.setAccessible(true);
      paramMap = ((Handler)paramAttributeSet.invoke(null, new Object[0])).getLooper().getThread();
      paramAttributeSet = new com/tencent/smtt/sdk/p;
      paramAttributeSet.<init>();
      paramMap.setUncaughtExceptionHandler(paramAttributeSet);
      mSysWebviewCreated = true;
      label250: CookieManager.getInstance().a();
      this.g.setFocusableInTouchMode(true);
      addView(this.g, new FrameLayout.LayoutParams(-1, -1));
      TbsLog.i("WebView", "SystemWebView Created Success! #3");
      TbsLog.e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
      TbsCoreLoadStat.getInstance().a(paramContext, 402, new Throwable());
      AppMethodBeat.o(64862);
      while (true)
      {
        return;
        if (TbsShareManager.isThirdPartyApp(paramContext))
          TbsLog.setWriteLogJIT(true);
        while (true)
        {
          this.l.a("tbslog_init", (byte)1);
          TbsLog.initIfNeed(paramContext);
          this.l.a("tbslog_init", (byte)2);
          if (paramContext != null)
            break;
          paramContext = new IllegalArgumentException("Invalid context argument");
          AppMethodBeat.o(64862);
          throw paramContext;
          TbsLog.setWriteLogJIT(false);
        }
        if (o == null)
          o = w.a(paramContext);
        if (o.a)
        {
          TbsLog.e("WebView", "sys WebView: debug.conf force syswebview", true);
          QbSdk.a(paramContext, "debug.conf force syswebview!");
        }
        a(paramContext, this.l);
        this.i = paramContext;
        if (paramContext != null)
          j = paramContext.getApplicationContext();
        if ((this.e) && (!QbSdk.a))
        {
          this.l.a("init_x5_webview", (byte)1);
          this.f = bv.a().a(true).a(paramContext);
          this.l.a("init_x5_webview", (byte)2);
          if ((this.f == null) || (this.f.getView() == null))
          {
            TbsLog.e("WebView", "sys WebView: failed to createTBSWebview", true);
            this.f = null;
            this.e = false;
            QbSdk.a(paramContext, "failed to createTBSWebview!");
            a(paramContext, this.l);
            if (TbsShareManager.isThirdPartyApp(this.i))
            {
              this.g = new WebView.b(this, paramContext, paramAttributeSet);
              label577: TbsLog.i("WebView", "SystemWebView Created Success! #1");
              CookieManager.getInstance().a(paramContext, true, false);
              CookieManager.getInstance().a();
              this.g.setFocusableInTouchMode(true);
              addView(this.g, new FrameLayout.LayoutParams(-1, -1));
            }
          }
        }
        try
        {
          if (Build.VERSION.SDK_INT >= 11)
          {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
          }
          label654: b(paramContext);
          TbsLog.writeLogToDisk();
          an.a(paramContext);
          AppMethodBeat.o(64862);
          continue;
          this.g = new WebView.b(this, paramContext);
          break label577;
          TbsLog.i("WebView", "X5 WebView Created Success!!");
          this.f.getView().setFocusableInTouchMode(true);
          a(paramAttributeSet);
          addView(this.f.getView(), new FrameLayout.LayoutParams(-1, -1));
          this.f.setDownloadListener(new b(this, null, this.e));
          this.f.getX5WebViewExtension().setWebViewClientExtension(new bm(this, bv.a().a(true).k()));
          try
          {
            if (Build.VERSION.SDK_INT >= 11)
            {
              removeJavascriptInterface("searchBoxJavaBridge_");
              removeJavascriptInterface("accessibility");
              removeJavascriptInterface("accessibilityTraversal");
            }
            label821: if ((("com.tencent.mobileqq".equals(this.i.getApplicationInfo().packageName)) || ("com.tencent.mm".equals(this.i.getApplicationInfo().packageName))) && (o.a(true).h()) && (Build.VERSION.SDK_INT >= 11))
              setLayerType(1, null);
            if (this.f != null)
            {
              TbsLog.writeLogToDisk();
              if (!TbsShareManager.isThirdPartyApp(paramContext))
              {
                paramInt = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0);
                if ((paramInt <= 0) || (paramInt == an.a().i(paramContext)) || (paramInt != an.a().j(paramContext)))
                  break label1104;
                an.a().o(paramContext);
              }
            }
            while (true)
            {
              if (this.l != null)
              {
                this.l.a("load_url_gap", (byte)1);
                this.l.a("init_all", (byte)2);
              }
              QbSdk.continueLoadSo(paramContext);
              AppMethodBeat.o(64862);
              break;
              this.f = null;
              if (TbsShareManager.isThirdPartyApp(this.i));
              for (this.g = new WebView.b(this, paramContext, paramAttributeSet); ; this.g = new WebView.b(this, paramContext))
              {
                TbsLog.i("WebView", "SystemWebView Created Success! #2");
                CookieManager.getInstance().a(paramContext, true, false);
                CookieManager.getInstance().a();
                this.g.setFocusableInTouchMode(true);
                addView(this.g, new FrameLayout.LayoutParams(-1, -1));
                setDownloadListener(null);
                b(paramContext);
                TbsLog.writeLogToDisk();
                an.a(paramContext);
                break;
              }
              label1104: TbsLog.i("WebView", "webview construction #1 deCoupleCoreVersion is " + paramInt + " getTbsCoreShareDecoupleCoreVersion is " + an.a().i(paramContext) + " getTbsCoreInstalledVerInNolock is " + an.a().j(paramContext));
            }
          }
          catch (Throwable paramAttributeSet)
          {
            break label821;
          }
        }
        catch (Throwable paramAttributeSet)
        {
          break label654;
        }
      }
    }
    catch (Exception paramAttributeSet)
    {
      break label250;
    }
  }

  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    this(paramContext, paramAttributeSet, paramInt, null, paramBoolean);
  }

  private void a(Context paramContext, am paramam)
  {
    AppMethodBeat.i(64873);
    if ((QbSdk.i) && (TbsShareManager.isThirdPartyApp(paramContext)))
      TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(paramContext);
    if (paramam != null)
      paramam.a("x5_core_engine_init_sync", (byte)1);
    bv localbv = bv.a();
    localbv.a(paramContext, paramam);
    this.e = localbv.b();
    AppMethodBeat.o(64873);
  }

  private void a(AttributeSet paramAttributeSet)
  {
    int i1 = 0;
    AppMethodBeat.i(64992);
    if (paramAttributeSet != null);
    label168: 
    while (true)
    {
      int[] arrayOfInt;
      int i3;
      try
      {
        int i2 = paramAttributeSet.getAttributeCount();
        if (i1 < i2)
        {
          if (paramAttributeSet.getAttributeName(i1).equalsIgnoreCase("scrollbars"))
          {
            arrayOfInt = getResources().getIntArray(16842974);
            i3 = paramAttributeSet.getAttributeIntValue(i1, -1);
            if (i3 == arrayOfInt[1])
            {
              this.f.getView().setVerticalScrollBarEnabled(false);
              this.f.getView().setHorizontalScrollBarEnabled(false);
            }
          }
          else
          {
            i1++;
            continue;
          }
          if (i3 == arrayOfInt[2])
          {
            this.f.getView().setVerticalScrollBarEnabled(false);
            continue;
          }
        }
      }
      catch (Exception paramAttributeSet)
      {
        AppMethodBeat.o(64992);
      }
      while (true)
      {
        return;
        if (i3 != arrayOfInt[3])
          break label168;
        this.f.getView().setHorizontalScrollBarEnabled(false);
        break;
        AppMethodBeat.o(64992);
      }
    }
  }

  private boolean a(View paramView)
  {
    AppMethodBeat.i(65003);
    boolean bool;
    if ((this.i != null) && (getTbsCoreVersion(this.i) > 36200))
    {
      AppMethodBeat.o(65003);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramView = r.a(this.A, "onLongClick", new Class[] { View.class }, new Object[] { paramView });
      if (paramView != null)
      {
        bool = ((Boolean)paramView).booleanValue();
        AppMethodBeat.o(65003);
      }
      else
      {
        AppMethodBeat.o(65003);
        bool = false;
      }
    }
  }

  private void b(Context paramContext)
  {
    AppMethodBeat.i(64863);
    if (n != null)
      AppMethodBeat.o(64863);
    while (true)
    {
      return;
      n = new WebView.a(null);
      new bn(this, paramContext).start();
      AppMethodBeat.o(64863);
    }
  }

  private boolean c(Context paramContext)
  {
    AppMethodBeat.i(64871);
    try
    {
      int i1 = paramContext.getPackageName().indexOf("com.tencent.mobileqq");
      if (i1 >= 0)
      {
        bool = true;
        AppMethodBeat.o(64871);
        return bool;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(64871);
      }
    }
  }

  // ERROR //
  private int d(Context paramContext)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: ldc_w 632
    //   5: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: iconst_1
    //   10: ldc_w 634
    //   13: invokestatic 639	com/tencent/smtt/utils/k:b	(Landroid/content/Context;ZLjava/lang/String;)Ljava/io/FileOutputStream;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +23 -> 41
    //   21: aload_1
    //   22: aload_3
    //   23: invokestatic 642	com/tencent/smtt/utils/k:a	(Landroid/content/Context;Ljava/io/FileOutputStream;)Ljava/nio/channels/FileLock;
    //   26: astore 4
    //   28: aload 4
    //   30: ifnonnull +20 -> 50
    //   33: ldc_w 632
    //   36: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload_2
    //   40: ireturn
    //   41: ldc_w 632
    //   44: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: goto -8 -> 39
    //   50: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   53: invokeinterface 647 1 0
    //   58: ifeq +457 -> 515
    //   61: aconst_null
    //   62: astore 5
    //   64: aload_1
    //   65: ldc_w 649
    //   68: iconst_0
    //   69: invokevirtual 653	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   72: astore 6
    //   74: new 655	java/io/File
    //   77: astore_1
    //   78: new 508	java/lang/StringBuilder
    //   81: astore 7
    //   83: aload 7
    //   85: invokespecial 656	java/lang/StringBuilder:<init>	()V
    //   88: aload_1
    //   89: aload 7
    //   91: aload 6
    //   93: invokevirtual 659	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   96: getstatic 662	java/io/File:separator	Ljava/lang/String;
    //   99: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc_w 664
    //   105: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: ldc_w 666
    //   114: invokespecial 668	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload_1
    //   118: invokevirtual 671	java/io/File:exists	()Z
    //   121: istore 8
    //   123: iload 8
    //   125: ifne +26 -> 151
    //   128: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   131: invokeinterface 674 1 0
    //   136: aload 4
    //   138: aload_3
    //   139: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   142: ldc_w 632
    //   145: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -109 -> 39
    //   151: new 679	java/util/Properties
    //   154: astore 6
    //   156: aload 6
    //   158: invokespecial 680	java/util/Properties:<init>	()V
    //   161: new 682	java/io/FileInputStream
    //   164: astore 7
    //   166: aload 7
    //   168: aload_1
    //   169: invokespecial 685	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   172: aload 7
    //   174: astore_1
    //   175: aload 6
    //   177: aload 7
    //   179: invokevirtual 689	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   182: aload 7
    //   184: astore_1
    //   185: aload 7
    //   187: invokevirtual 692	java/io/FileInputStream:close	()V
    //   190: aload 7
    //   192: astore_1
    //   193: aload 6
    //   195: ldc_w 694
    //   198: invokevirtual 698	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   201: astore 5
    //   203: aload 5
    //   205: ifnonnull +61 -> 266
    //   208: aload 7
    //   210: invokevirtual 692	java/io/FileInputStream:close	()V
    //   213: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   216: invokeinterface 674 1 0
    //   221: aload 4
    //   223: aload_3
    //   224: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   227: ldc_w 632
    //   230: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: goto -194 -> 39
    //   236: astore_1
    //   237: ldc_w 700
    //   240: new 508	java/lang/StringBuilder
    //   243: dup
    //   244: ldc_w 702
    //   247: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   250: aload_1
    //   251: invokevirtual 703	java/io/IOException:toString	()Ljava/lang/String;
    //   254: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokestatic 705	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: goto -50 -> 213
    //   266: aload 7
    //   268: astore_1
    //   269: aload 5
    //   271: invokestatic 710	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   274: istore 9
    //   276: iload 9
    //   278: istore_2
    //   279: aload 7
    //   281: invokevirtual 692	java/io/FileInputStream:close	()V
    //   284: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   287: invokeinterface 674 1 0
    //   292: aload 4
    //   294: aload_3
    //   295: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   298: ldc_w 632
    //   301: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   304: goto -265 -> 39
    //   307: astore_1
    //   308: ldc_w 700
    //   311: new 508	java/lang/StringBuilder
    //   314: dup
    //   315: ldc_w 702
    //   318: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   321: aload_1
    //   322: invokevirtual 703	java/io/IOException:toString	()Ljava/lang/String;
    //   325: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: invokestatic 705	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: goto -50 -> 284
    //   337: astore 5
    //   339: aconst_null
    //   340: astore 7
    //   342: aload 7
    //   344: astore_1
    //   345: new 508	java/lang/StringBuilder
    //   348: astore 6
    //   350: aload 7
    //   352: astore_1
    //   353: aload 6
    //   355: ldc_w 712
    //   358: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   361: aload 7
    //   363: astore_1
    //   364: ldc_w 700
    //   367: aload 6
    //   369: aload 5
    //   371: invokevirtual 713	java/lang/Exception:toString	()Ljava/lang/String;
    //   374: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   380: invokestatic 705	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   383: aload 7
    //   385: ifnull +8 -> 393
    //   388: aload 7
    //   390: invokevirtual 692	java/io/FileInputStream:close	()V
    //   393: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   396: invokeinterface 674 1 0
    //   401: aload 4
    //   403: aload_3
    //   404: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   407: ldc_w 632
    //   410: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   413: goto -374 -> 39
    //   416: astore_1
    //   417: ldc_w 700
    //   420: new 508	java/lang/StringBuilder
    //   423: dup
    //   424: ldc_w 702
    //   427: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   430: aload_1
    //   431: invokevirtual 703	java/io/IOException:toString	()Ljava/lang/String;
    //   434: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   440: invokestatic 705	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: goto -50 -> 393
    //   446: astore_1
    //   447: aload 5
    //   449: astore 7
    //   451: aload 7
    //   453: ifnull +8 -> 461
    //   456: aload 7
    //   458: invokevirtual 692	java/io/FileInputStream:close	()V
    //   461: getstatic 98	com/tencent/smtt/sdk/WebView:c	Ljava/util/concurrent/locks/Lock;
    //   464: invokeinterface 674 1 0
    //   469: aload 4
    //   471: aload_3
    //   472: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   475: ldc_w 632
    //   478: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   481: aload_1
    //   482: athrow
    //   483: astore 7
    //   485: ldc_w 700
    //   488: new 508	java/lang/StringBuilder
    //   491: dup
    //   492: ldc_w 702
    //   495: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   498: aload 7
    //   500: invokevirtual 703	java/io/IOException:toString	()Ljava/lang/String;
    //   503: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: invokestatic 705	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   512: goto -51 -> 461
    //   515: aload 4
    //   517: aload_3
    //   518: invokestatic 677	com/tencent/smtt/utils/k:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   521: ldc_w 632
    //   524: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   527: goto -488 -> 39
    //   530: astore 5
    //   532: aload_1
    //   533: astore 7
    //   535: aload 5
    //   537: astore_1
    //   538: goto -87 -> 451
    //   541: astore 5
    //   543: goto -201 -> 342
    //
    // Exception table:
    //   from	to	target	type
    //   208	213	236	java/io/IOException
    //   279	284	307	java/io/IOException
    //   64	123	337	java/lang/Exception
    //   151	172	337	java/lang/Exception
    //   388	393	416	java/io/IOException
    //   64	123	446	finally
    //   151	172	446	finally
    //   456	461	483	java/io/IOException
    //   175	182	530	finally
    //   185	190	530	finally
    //   193	203	530	finally
    //   269	276	530	finally
    //   345	350	530	finally
    //   353	361	530	finally
    //   364	383	530	finally
    //   175	182	541	java/lang/Exception
    //   185	190	541	java/lang/Exception
    //   193	203	541	java/lang/Exception
    //   269	276	541	java/lang/Exception
  }

  static void d()
  {
    AppMethodBeat.i(65008);
    new bu().start();
    AppMethodBeat.o(65008);
  }

  @Deprecated
  public static void disablePlatformNotifications()
  {
    AppMethodBeat.i(64892);
    if (!bv.a().b())
      r.a("android.webkit.WebView", "disablePlatformNotifications");
    AppMethodBeat.o(64892);
  }

  private void e(Context paramContext)
  {
    AppMethodBeat.i(65002);
    try
    {
      paramContext = paramContext.getDir("tbs", 0);
      File localFile = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localFile.<init>(paramContext + File.separator + "core_private", "pv.db");
      boolean bool = localFile.exists();
      if (!bool)
        AppMethodBeat.o(65002);
      while (true)
      {
        return;
        localFile.delete();
        AppMethodBeat.o(65002);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        TbsLog.i("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + paramContext.toString());
        AppMethodBeat.o(65002);
      }
    }
  }

  @Deprecated
  public static void enablePlatformNotifications()
  {
    AppMethodBeat.i(64891);
    if (!bv.a().b())
      r.a("android.webkit.WebView", "enablePlatformNotifications");
    AppMethodBeat.o(64891);
  }

  public static String findAddress(String paramString)
  {
    AppMethodBeat.i(64951);
    if (!bv.a().b())
    {
      paramString = android.webkit.WebView.findAddress(paramString);
      AppMethodBeat.o(64951);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(64951);
    }
  }

  public static String getCrashExtraMessage(Context paramContext)
  {
    AppMethodBeat.i(65006);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(65006);
    }
    while (true)
    {
      return paramContext;
      String str = "tbs_core_version:" + QbSdk.getTbsVersionForCrash(paramContext) + ";tbs_sdk_version:43644;";
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(o.a(true).e());
      localStringBuilder.append("\n");
      localStringBuilder.append(str);
      if ((!TbsShareManager.isThirdPartyApp(paramContext)) && (QbSdk.n != null) && (QbSdk.n.containsKey("weapp_id")) && (QbSdk.n.containsKey("weapp_name")))
      {
        paramContext = "weapp_id:" + QbSdk.n.get("weapp_id") + ";weapp_name:" + QbSdk.n.get("weapp_name") + ";";
        localStringBuilder.append("\n");
        localStringBuilder.append(paramContext);
      }
      if (localStringBuilder.length() > 8192)
      {
        paramContext = localStringBuilder.substring(localStringBuilder.length() - 8192);
        AppMethodBeat.o(65006);
      }
      else
      {
        paramContext = localStringBuilder.toString();
        AppMethodBeat.o(65006);
      }
    }
  }

  public static PackageInfo getCurrentWebViewPackage()
  {
    AppMethodBeat.i(64931);
    PackageInfo localPackageInfo;
    if (!bv.a().b())
      if (Build.VERSION.SDK_INT < 26)
      {
        AppMethodBeat.o(64931);
        localPackageInfo = null;
      }
    while (true)
    {
      return localPackageInfo;
      try
      {
        localPackageInfo = (PackageInfo)r.a("android.webkit.WebView", "getCurrentWebViewPackage");
        AppMethodBeat.o(64931);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(64931);
        localObject = null;
      }
      continue;
      AppMethodBeat.o(64931);
      Object localObject = null;
    }
  }

  @Deprecated
  public static Object getPluginList()
  {
    try
    {
      AppMethodBeat.i(64964);
      Object localObject1;
      if (!bv.a().b())
      {
        localObject1 = r.a("android.webkit.WebView", "getPluginList");
        AppMethodBeat.o(64964);
      }
      while (true)
      {
        return localObject1;
        localObject1 = null;
        AppMethodBeat.o(64964);
      }
    }
    finally
    {
    }
  }

  public static int getTbsCoreVersion(Context paramContext)
  {
    AppMethodBeat.i(64989);
    int i1 = QbSdk.getTbsVersion(paramContext);
    AppMethodBeat.o(64989);
    return i1;
  }

  public static boolean getTbsNeedReboot()
  {
    AppMethodBeat.i(65007);
    d();
    boolean bool = o.a(true).f();
    AppMethodBeat.o(65007);
    return bool;
  }

  public static int getTbsSDKVersion(Context paramContext)
  {
    return 43644;
  }

  private long i()
  {
    AppMethodBeat.i(64890);
    synchronized (QbSdk.h)
    {
      if (QbSdk.e)
      {
        QbSdk.g += System.currentTimeMillis() - QbSdk.f;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=");
        TbsLog.d("sdkreport", QbSdk.g);
      }
      long l1 = QbSdk.g / 1000L;
      QbSdk.g = 0L;
      QbSdk.f = System.currentTimeMillis();
      AppMethodBeat.o(64890);
      return l1;
    }
  }

  public static void setSysDayOrNight(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64995);
        if (paramBoolean == z)
        {
          AppMethodBeat.o(64995);
          return;
        }
        z = paramBoolean;
        if (y == null)
        {
          Paint localPaint = new android/graphics/Paint;
          localPaint.<init>();
          y = localPaint;
          localPaint.setColor(-16777216);
        }
        if (!paramBoolean)
        {
          if (y.getAlpha() == NIGHT_MODE_ALPHA)
            break label115;
          y.setAlpha(NIGHT_MODE_ALPHA);
          AppMethodBeat.o(64995);
          continue;
        }
      }
      finally
      {
      }
      if (y.getAlpha() != 255)
        y.setAlpha(255);
      label115: AppMethodBeat.o(64995);
    }
  }

  public static void setWebContentsDebuggingEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64908);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()))
    {
      ((bv)localObject).c().a(paramBoolean);
      AppMethodBeat.o(64908);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 19)
        try
        {
          localObject = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", new Class[] { Boolean.TYPE });
          p = (Method)localObject;
          if (localObject != null)
          {
            p.setAccessible(true);
            p.invoke(null, new Object[] { Boolean.valueOf(paramBoolean) });
          }
          AppMethodBeat.o(64908);
        }
        catch (Exception localException)
        {
          TbsLog.e("QbSdk", "Exception:" + localException.getStackTrace());
        }
      else
        AppMethodBeat.o(64908);
    }
  }

  protected void a()
  {
    AppMethodBeat.i(64979);
    if ((!this.k) && (this.a != 0))
    {
      this.k = true;
      String str1 = "";
      String str2 = "";
      String str3 = "";
      String str4 = str1;
      String str5 = str2;
      String str6 = str3;
      if (this.e)
      {
        Bundle localBundle = this.f.getX5WebViewExtension().getSdkQBStatisticsInfo();
        str4 = str1;
        str5 = str2;
        str6 = str3;
        if (localBundle != null)
        {
          str4 = localBundle.getString("guid");
          str5 = localBundle.getString("qua2");
          str6 = localBundle.getString("lc");
        }
      }
      if ("com.qzone".equals(this.i.getApplicationInfo().packageName))
      {
        int i1 = d(this.i);
        int i2 = i1;
        if (i1 == -1)
          i2 = this.a;
        this.a = i2;
        e(this.i);
      }
      com.tencent.smtt.sdk.a.b.a(this.i, str4, str5, str6, this.a, this.e, i());
      this.a = 0;
      this.k = false;
    }
    super.onDetachedFromWindow();
    AppMethodBeat.o(64979);
  }

  // ERROR //
  void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 904
    //   3: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 891	com/tencent/smtt/sdk/WebView:d	(Landroid/content/Context;)I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_m1
    //   14: if_icmpeq +146 -> 160
    //   17: new 508	java/lang/StringBuilder
    //   20: dup
    //   21: ldc_w 906
    //   24: invokespecial 511	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   27: iload_2
    //   28: iconst_1
    //   29: iadd
    //   30: invokestatic 908	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   33: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: astore_3
    //   40: aload_1
    //   41: ldc_w 649
    //   44: iconst_0
    //   45: invokevirtual 653	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   48: astore_1
    //   49: new 655	java/io/File
    //   52: dup
    //   53: new 508	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 656	java/lang/StringBuilder:<init>	()V
    //   60: aload_1
    //   61: invokevirtual 659	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   64: getstatic 662	java/io/File:separator	Ljava/lang/String;
    //   67: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w 664
    //   73: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 526	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: ldc_w 666
    //   82: invokespecial 668	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: astore 4
    //   87: aload 4
    //   89: invokevirtual 912	java/io/File:getParentFile	()Ljava/io/File;
    //   92: invokevirtual 915	java/io/File:mkdirs	()Z
    //   95: pop
    //   96: aload 4
    //   98: invokevirtual 918	java/io/File:isFile	()Z
    //   101: ifeq +11 -> 112
    //   104: aload 4
    //   106: invokevirtual 671	java/io/File:exists	()Z
    //   109: ifne +9 -> 118
    //   112: aload 4
    //   114: invokevirtual 921	java/io/File:createNewFile	()Z
    //   117: pop
    //   118: new 923	java/io/FileOutputStream
    //   121: astore_1
    //   122: aload_1
    //   123: aload 4
    //   125: iconst_0
    //   126: invokespecial 926	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   129: aload_1
    //   130: putstatic 100	com/tencent/smtt/sdk/WebView:d	Ljava/io/OutputStream;
    //   133: aload_1
    //   134: aload_3
    //   135: invokevirtual 930	java/lang/String:getBytes	()[B
    //   138: invokevirtual 936	java/io/OutputStream:write	([B)V
    //   141: getstatic 100	com/tencent/smtt/sdk/WebView:d	Ljava/io/OutputStream;
    //   144: ifnull +54 -> 198
    //   147: getstatic 100	com/tencent/smtt/sdk/WebView:d	Ljava/io/OutputStream;
    //   150: invokevirtual 939	java/io/OutputStream:flush	()V
    //   153: ldc_w 904
    //   156: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: return
    //   160: ldc_w 941
    //   163: astore_3
    //   164: goto -124 -> 40
    //   167: astore_1
    //   168: getstatic 100	com/tencent/smtt/sdk/WebView:d	Ljava/io/OutputStream;
    //   171: ifnull +9 -> 180
    //   174: getstatic 100	com/tencent/smtt/sdk/WebView:d	Ljava/io/OutputStream;
    //   177: invokevirtual 939	java/io/OutputStream:flush	()V
    //   180: ldc_w 904
    //   183: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: aload_1
    //   187: athrow
    //   188: astore_1
    //   189: ldc_w 904
    //   192: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: goto -36 -> 159
    //   198: ldc_w 904
    //   201: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: goto -45 -> 159
    //
    // Exception table:
    //   from	to	target	type
    //   87	112	167	finally
    //   112	118	167	finally
    //   118	141	167	finally
    //   141	159	188	java/lang/Throwable
    //   168	180	188	java/lang/Throwable
    //   180	188	188	java/lang/Throwable
  }

  void a(android.webkit.WebView paramWebView)
  {
  }

  void a(IX5WebViewBase paramIX5WebViewBase)
  {
    this.f = paramIX5WebViewBase;
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(64961);
    if (!this.e)
    {
      this.g.addJavascriptInterface(paramObject, paramString);
      AppMethodBeat.o(64961);
    }
    while (true)
    {
      return;
      this.f.addJavascriptInterface(paramObject, paramString);
      AppMethodBeat.o(64961);
    }
  }

  public void addView(View paramView)
  {
    AppMethodBeat.i(65004);
    if (!this.e)
    {
      this.g.addView(paramView);
      AppMethodBeat.o(65004);
    }
    while (true)
    {
      return;
      View localView = this.f.getView();
      try
      {
        Method localMethod = r.a(localView, "addView", new Class[] { View.class });
        localMethod.setAccessible(true);
        localMethod.invoke(localView, new Object[] { paramView });
        AppMethodBeat.o(65004);
      }
      catch (Throwable paramView)
      {
        AppMethodBeat.o(65004);
      }
    }
  }

  android.webkit.WebView b()
  {
    if (!this.e);
    for (WebView.b localb = this.g; ; localb = null)
      return localb;
  }

  IX5WebViewBase c()
  {
    return this.f;
  }

  public boolean canGoBack()
  {
    AppMethodBeat.i(64910);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.canGoBack();
      AppMethodBeat.o(64910);
    }
    while (true)
    {
      return bool;
      bool = this.f.canGoBack();
      AppMethodBeat.o(64910);
    }
  }

  public boolean canGoBackOrForward(int paramInt)
  {
    AppMethodBeat.i(64914);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.canGoBackOrForward(paramInt);
      AppMethodBeat.o(64914);
    }
    while (true)
    {
      return bool;
      bool = this.f.canGoBackOrForward(paramInt);
      AppMethodBeat.o(64914);
    }
  }

  public boolean canGoForward()
  {
    AppMethodBeat.i(64912);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.canGoForward();
      AppMethodBeat.o(64912);
    }
    while (true)
    {
      return bool;
      bool = this.f.canGoForward();
      AppMethodBeat.o(64912);
    }
  }

  @Deprecated
  public boolean canZoomIn()
  {
    AppMethodBeat.i(64969);
    Object localObject;
    boolean bool;
    if (!this.e)
      if (Build.VERSION.SDK_INT >= 11)
      {
        localObject = r.a(this.g, "canZoomIn");
        if (localObject == null)
        {
          AppMethodBeat.o(64969);
          bool = false;
        }
      }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(64969);
      continue;
      AppMethodBeat.o(64969);
      bool = false;
      continue;
      bool = this.f.canZoomIn();
      AppMethodBeat.o(64969);
    }
  }

  @Deprecated
  public boolean canZoomOut()
  {
    AppMethodBeat.i(64971);
    Object localObject;
    boolean bool;
    if (!this.e)
      if (Build.VERSION.SDK_INT >= 11)
      {
        localObject = r.a(this.g, "canZoomOut");
        if (localObject == null)
        {
          AppMethodBeat.o(64971);
          bool = false;
        }
      }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(64971);
      continue;
      AppMethodBeat.o(64971);
      bool = false;
      continue;
      bool = this.f.canZoomOut();
      AppMethodBeat.o(64971);
    }
  }

  @Deprecated
  public Picture capturePicture()
  {
    AppMethodBeat.i(64919);
    Object localObject;
    if (!this.e)
    {
      localObject = r.a(this.g, "capturePicture");
      if (localObject == null)
      {
        localObject = null;
        AppMethodBeat.o(64919);
      }
    }
    while (true)
    {
      return localObject;
      localObject = (Picture)localObject;
      AppMethodBeat.o(64919);
      continue;
      localObject = this.f.capturePicture();
      AppMethodBeat.o(64919);
    }
  }

  public void clearCache(boolean paramBoolean)
  {
    AppMethodBeat.i(64943);
    if (!this.e)
    {
      this.g.clearCache(paramBoolean);
      AppMethodBeat.o(64943);
    }
    while (true)
    {
      return;
      this.f.clearCache(paramBoolean);
      AppMethodBeat.o(64943);
    }
  }

  public void clearFormData()
  {
    AppMethodBeat.i(64944);
    if (!this.e)
    {
      this.g.clearFormData();
      AppMethodBeat.o(64944);
    }
    while (true)
    {
      return;
      this.f.clearFormData();
      AppMethodBeat.o(64944);
    }
  }

  public void clearHistory()
  {
    AppMethodBeat.i(64945);
    if (!this.e)
    {
      this.g.clearHistory();
      AppMethodBeat.o(64945);
    }
    while (true)
    {
      return;
      this.f.clearHistory();
      AppMethodBeat.o(64945);
    }
  }

  @TargetApi(3)
  public void clearMatches()
  {
    AppMethodBeat.i(64953);
    if (!this.e)
    {
      this.g.clearMatches();
      AppMethodBeat.o(64953);
    }
    while (true)
    {
      return;
      this.f.clearMatches();
      AppMethodBeat.o(64953);
    }
  }

  public void clearSslPreferences()
  {
    AppMethodBeat.i(64946);
    if (!this.e)
    {
      this.g.clearSslPreferences();
      AppMethodBeat.o(64946);
    }
    while (true)
    {
      return;
      this.f.clearSslPreferences();
      AppMethodBeat.o(64946);
    }
  }

  @Deprecated
  public void clearView()
  {
    AppMethodBeat.i(64918);
    if (!this.e)
    {
      r.a(this.g, "clearView");
      AppMethodBeat.o(64918);
    }
    while (true)
    {
      return;
      this.f.clearView();
      AppMethodBeat.o(64918);
    }
  }

  public int computeHorizontalScrollExtent()
  {
    AppMethodBeat.i(64869);
    try
    {
      Method localMethod;
      if (this.e)
      {
        localMethod = r.a(this.f.getView(), "computeHorizontalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.f.getView(), null)).intValue();
        AppMethodBeat.o(64869);
      }
      while (true)
      {
        return i1;
        localMethod = r.a(this.g, "computeHorizontalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64869);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64869);
      }
    }
  }

  public int computeHorizontalScrollOffset()
  {
    AppMethodBeat.i(64865);
    try
    {
      Method localMethod;
      if (this.e)
      {
        localMethod = r.a(this.f.getView(), "computeHorizontalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.f.getView(), null)).intValue();
        AppMethodBeat.o(64865);
      }
      while (true)
      {
        return i1;
        localMethod = r.a(this.g, "computeHorizontalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64865);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64865);
      }
    }
  }

  public int computeHorizontalScrollRange()
  {
    AppMethodBeat.i(64868);
    try
    {
      if (this.e)
      {
        i1 = ((Integer)r.a(this.f.getView(), "computeHorizontalScrollRange", new Class[0], new Object[0])).intValue();
        AppMethodBeat.o(64868);
      }
      while (true)
      {
        return i1;
        Method localMethod = r.a(this.g, "computeHorizontalScrollRange", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64868);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64868);
      }
    }
  }

  public void computeScroll()
  {
    AppMethodBeat.i(64976);
    if (!this.e)
    {
      this.g.computeScroll();
      AppMethodBeat.o(64976);
    }
    while (true)
    {
      return;
      this.f.computeScroll();
      AppMethodBeat.o(64976);
    }
  }

  public int computeVerticalScrollExtent()
  {
    AppMethodBeat.i(64867);
    try
    {
      Method localMethod;
      if (this.e)
      {
        localMethod = r.a(this.f.getView(), "computeVerticalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.f.getView(), null)).intValue();
        AppMethodBeat.o(64867);
      }
      while (true)
      {
        return i1;
        localMethod = r.a(this.g, "computeVerticalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64867);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64867);
      }
    }
  }

  public int computeVerticalScrollOffset()
  {
    AppMethodBeat.i(64866);
    try
    {
      Method localMethod;
      if (this.e)
      {
        localMethod = r.a(this.f.getView(), "computeVerticalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.f.getView(), null)).intValue();
        AppMethodBeat.o(64866);
      }
      while (true)
      {
        return i1;
        localMethod = r.a(this.g, "computeVerticalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64866);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64866);
      }
    }
  }

  public int computeVerticalScrollRange()
  {
    AppMethodBeat.i(64870);
    try
    {
      if (this.e)
      {
        i1 = ((Integer)r.a(this.f.getView(), "computeVerticalScrollRange", new Class[0], new Object[0])).intValue();
        AppMethodBeat.o(64870);
      }
      while (true)
      {
        return i1;
        Method localMethod = r.a(this.g, "computeVerticalScrollRange", new Class[0]);
        localMethod.setAccessible(true);
        i1 = ((Integer)localMethod.invoke(this.g, null)).intValue();
        AppMethodBeat.o(64870);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = -1;
        AppMethodBeat.o(64870);
      }
    }
  }

  public WebBackForwardList copyBackForwardList()
  {
    AppMethodBeat.i(64947);
    WebBackForwardList localWebBackForwardList;
    if (this.e)
    {
      localWebBackForwardList = WebBackForwardList.a(this.f.copyBackForwardList());
      AppMethodBeat.o(64947);
    }
    while (true)
    {
      return localWebBackForwardList;
      localWebBackForwardList = WebBackForwardList.a(this.g.copyBackForwardList());
      AppMethodBeat.o(64947);
    }
  }

  public Object createPrintDocumentAdapter(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(64864);
    if (this.e);
    while (true)
    {
      try
      {
        paramString = this.f.createPrintDocumentAdapter(paramString);
        AppMethodBeat.o(64864);
        return paramString;
      }
      catch (Throwable paramString)
      {
        AppMethodBeat.o(64864);
        paramString = localObject;
        continue;
      }
      if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(64864);
        paramString = localObject;
      }
      else
      {
        paramString = r.a(this.g, "createPrintDocumentAdapter", new Class[] { String.class }, new Object[] { paramString });
        AppMethodBeat.o(64864);
      }
    }
  }

  public void customDiskCachePathEnabled(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(64957);
    if ((this.e) && (getX5WebViewExtension() != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("enabled", paramBoolean);
      localBundle.putString("path", paramString);
      getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", localBundle);
    }
    AppMethodBeat.o(64957);
  }

  public void destroy()
  {
    AppMethodBeat.i(64889);
    try
    {
      if ("com.xunmeng.pinduoduo".equals(this.i.getApplicationInfo().packageName))
      {
        bo localbo = new com/tencent/smtt/sdk/bo;
        localbo.<init>(this, "WebviewDestroy");
        localbo.start();
        if (this.e)
        {
          this.f.destroy();
          AppMethodBeat.o(64889);
        }
        while (true)
        {
          return;
          this.g.destroy();
          AppMethodBeat.o(64889);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        tbsWebviewDestroy(true);
        AppMethodBeat.o(64889);
        continue;
        tbsWebviewDestroy(true);
        AppMethodBeat.o(64889);
      }
    }
  }

  public void documentHasImages(Message paramMessage)
  {
    AppMethodBeat.i(64954);
    if (!this.e)
    {
      this.g.documentHasImages(paramMessage);
      AppMethodBeat.o(64954);
    }
    while (true)
    {
      return;
      this.f.documentHasImages(paramMessage);
      AppMethodBeat.o(64954);
    }
  }

  public void dumpViewHierarchyWithProperties(BufferedWriter paramBufferedWriter, int paramInt)
  {
    AppMethodBeat.i(64974);
    if (!this.e)
    {
      r.a(this.g, "dumpViewHierarchyWithProperties", new Class[] { BufferedWriter.class, Integer.TYPE }, new Object[] { paramBufferedWriter, Integer.valueOf(paramInt) });
      AppMethodBeat.o(64974);
    }
    while (true)
    {
      return;
      this.f.dumpViewHierarchyWithProperties(paramBufferedWriter, paramInt);
      AppMethodBeat.o(64974);
    }
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(64988);
    if (this.e);
    while (true)
    {
      Method localMethod;
      try
      {
        localMethod = r.a(this.f.getView(), "evaluateJavascript", new Class[] { String.class, android.webkit.ValueCallback.class });
        localMethod.setAccessible(true);
        localMethod.invoke(this.f.getView(), new Object[] { paramString, paramValueCallback });
        AppMethodBeat.o(64988);
        return;
      }
      catch (Exception paramValueCallback)
      {
        loadUrl(paramString);
        AppMethodBeat.o(64988);
        continue;
      }
      if (Build.VERSION.SDK_INT >= 19)
        try
        {
          localMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", new Class[] { String.class, android.webkit.ValueCallback.class });
          localMethod.setAccessible(true);
          localMethod.invoke(this.g, new Object[] { paramString, paramValueCallback });
          AppMethodBeat.o(64988);
        }
        catch (Exception paramString)
        {
        }
      else
        AppMethodBeat.o(64988);
    }
  }

  @Deprecated
  public int findAll(String paramString)
  {
    AppMethodBeat.i(64950);
    int i1;
    if (!this.e)
    {
      paramString = r.a(this.g, "findAll", new Class[] { String.class }, new Object[] { paramString });
      if (paramString == null)
      {
        AppMethodBeat.o(64950);
        i1 = 0;
      }
    }
    while (true)
    {
      return i1;
      i1 = ((Integer)paramString).intValue();
      AppMethodBeat.o(64950);
      continue;
      i1 = this.f.findAll(paramString);
      AppMethodBeat.o(64950);
    }
  }

  @TargetApi(16)
  public void findAllAsync(String paramString)
  {
    AppMethodBeat.i(64952);
    if (!this.e)
    {
      if (Build.VERSION.SDK_INT < 16)
        break label67;
      r.a(this.g, "findAllAsync", new Class[] { String.class }, new Object[] { paramString });
      AppMethodBeat.o(64952);
    }
    while (true)
    {
      return;
      this.f.findAllAsync(paramString);
      label67: AppMethodBeat.o(64952);
    }
  }

  public View findHierarchyView(String paramString, int paramInt)
  {
    AppMethodBeat.i(64975);
    if (!this.e)
    {
      paramString = (View)r.a(this.g, "findHierarchyView", new Class[] { String.class, Integer.TYPE }, new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(64975);
    }
    while (true)
    {
      return paramString;
      paramString = this.f.findHierarchyView(paramString, paramInt);
      AppMethodBeat.o(64975);
    }
  }

  @TargetApi(3)
  public void findNext(boolean paramBoolean)
  {
    AppMethodBeat.i(64949);
    if (!this.e)
    {
      this.g.findNext(paramBoolean);
      AppMethodBeat.o(64949);
    }
    while (true)
    {
      return;
      this.f.findNext(paramBoolean);
      AppMethodBeat.o(64949);
    }
  }

  public void flingScroll(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64967);
    if (!this.e)
    {
      this.g.flingScroll(paramInt1, paramInt2);
      AppMethodBeat.o(64967);
    }
    while (true)
    {
      return;
      this.f.flingScroll(paramInt1, paramInt2);
      AppMethodBeat.o(64967);
    }
  }

  @Deprecated
  public void freeMemory()
  {
    AppMethodBeat.i(64942);
    if (!this.e)
    {
      r.a(this.g, "freeMemory");
      AppMethodBeat.o(64942);
    }
    while (true)
    {
      return;
      this.f.freeMemory();
      AppMethodBeat.o(64942);
    }
  }

  public SslCertificate getCertificate()
  {
    AppMethodBeat.i(64883);
    SslCertificate localSslCertificate;
    if (!this.e)
    {
      localSslCertificate = this.g.getCertificate();
      AppMethodBeat.o(64883);
    }
    while (true)
    {
      return localSslCertificate;
      localSslCertificate = this.f.getCertificate();
      AppMethodBeat.o(64883);
    }
  }

  public int getContentHeight()
  {
    AppMethodBeat.i(64936);
    int i1;
    if (!this.e)
    {
      i1 = this.g.getContentHeight();
      AppMethodBeat.o(64936);
    }
    while (true)
    {
      return i1;
      i1 = this.f.getContentHeight();
      AppMethodBeat.o(64936);
    }
  }

  public int getContentWidth()
  {
    AppMethodBeat.i(64937);
    Object localObject;
    int i1;
    if (!this.e)
    {
      localObject = r.a(this.g, "getContentWidth");
      if (localObject == null)
      {
        i1 = 0;
        AppMethodBeat.o(64937);
      }
    }
    while (true)
    {
      return i1;
      i1 = ((Integer)localObject).intValue();
      AppMethodBeat.o(64937);
      continue;
      i1 = this.f.getContentWidth();
      AppMethodBeat.o(64937);
    }
  }

  public Bitmap getFavicon()
  {
    AppMethodBeat.i(64930);
    Bitmap localBitmap;
    if (!this.e)
    {
      localBitmap = this.g.getFavicon();
      AppMethodBeat.o(64930);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = this.f.getFavicon();
      AppMethodBeat.o(64930);
    }
  }

  public WebView.HitTestResult getHitTestResult()
  {
    AppMethodBeat.i(64923);
    WebView.HitTestResult localHitTestResult;
    if (!this.e)
    {
      localHitTestResult = new WebView.HitTestResult(this.g.getHitTestResult());
      AppMethodBeat.o(64923);
    }
    while (true)
    {
      return localHitTestResult;
      localHitTestResult = new WebView.HitTestResult(this.f.getHitTestResult());
      AppMethodBeat.o(64923);
    }
  }

  public String[] getHttpAuthUsernamePassword(String paramString1, String paramString2)
  {
    AppMethodBeat.i(64887);
    if (!this.e)
    {
      paramString1 = this.g.getHttpAuthUsernamePassword(paramString1, paramString2);
      AppMethodBeat.o(64887);
    }
    while (true)
    {
      return paramString1;
      paramString1 = this.f.getHttpAuthUsernamePassword(paramString1, paramString2);
      AppMethodBeat.o(64887);
    }
  }

  @TargetApi(3)
  public String getOriginalUrl()
  {
    AppMethodBeat.i(64928);
    String str;
    if (!this.e)
    {
      str = this.g.getOriginalUrl();
      AppMethodBeat.o(64928);
    }
    while (true)
    {
      return str;
      str = this.f.getOriginalUrl();
      AppMethodBeat.o(64928);
    }
  }

  public int getProgress()
  {
    AppMethodBeat.i(64935);
    int i1;
    if (!this.e)
    {
      i1 = this.g.getProgress();
      AppMethodBeat.o(64935);
    }
    while (true)
    {
      return i1;
      i1 = this.f.getProgress();
      AppMethodBeat.o(64935);
    }
  }

  public boolean getRendererPriorityWaivedWhenNotVisible()
  {
    AppMethodBeat.i(64934);
    try
    {
      if (!this.e)
      {
        int i1 = Build.VERSION.SDK_INT;
        if (i1 < 26)
        {
          AppMethodBeat.o(64934);
          bool = false;
        }
      }
      while (true)
      {
        return bool;
        Object localObject = r.a(this.g, "getRendererPriorityWaivedWhenNotVisible");
        if (localObject == null)
        {
          AppMethodBeat.o(64934);
          bool = false;
        }
        else
        {
          bool = ((Boolean)localObject).booleanValue();
          AppMethodBeat.o(64934);
          continue;
          AppMethodBeat.o(64934);
          bool = false;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(64934);
        boolean bool = false;
      }
    }
  }

  public int getRendererRequestedPriority()
  {
    AppMethodBeat.i(64933);
    try
    {
      if (!this.e)
      {
        i1 = Build.VERSION.SDK_INT;
        if (i1 < 26)
        {
          AppMethodBeat.o(64933);
          i1 = 0;
        }
      }
      while (true)
      {
        return i1;
        Object localObject = r.a(this.g, "getRendererRequestedPriority");
        if (localObject == null)
        {
          AppMethodBeat.o(64933);
          i1 = 0;
        }
        else
        {
          i1 = ((Integer)localObject).intValue();
          AppMethodBeat.o(64933);
          continue;
          AppMethodBeat.o(64933);
          i1 = 0;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(64933);
        int i1 = 0;
      }
    }
  }

  @Deprecated
  public float getScale()
  {
    AppMethodBeat.i(64920);
    Object localObject;
    float f1;
    if (!this.e)
    {
      localObject = r.a(this.g, "getScale");
      if (localObject == null)
      {
        f1 = 0.0F;
        AppMethodBeat.o(64920);
      }
    }
    while (true)
    {
      return f1;
      f1 = ((Float)localObject).floatValue();
      AppMethodBeat.o(64920);
      continue;
      f1 = this.f.getScale();
      AppMethodBeat.o(64920);
    }
  }

  public int getScrollBarDefaultDelayBeforeFade()
  {
    AppMethodBeat.i(65016);
    int i1;
    if (getView() == null)
    {
      i1 = 0;
      AppMethodBeat.o(65016);
    }
    while (true)
    {
      return i1;
      i1 = getView().getScrollBarDefaultDelayBeforeFade();
      AppMethodBeat.o(65016);
    }
  }

  public int getScrollBarFadeDuration()
  {
    AppMethodBeat.i(65017);
    int i1;
    if (getView() == null)
    {
      i1 = 0;
      AppMethodBeat.o(65017);
    }
    while (true)
    {
      return i1;
      i1 = getView().getScrollBarFadeDuration();
      AppMethodBeat.o(65017);
    }
  }

  public int getScrollBarSize()
  {
    AppMethodBeat.i(65018);
    int i1;
    if (getView() == null)
    {
      i1 = 0;
      AppMethodBeat.o(65018);
    }
    while (true)
    {
      return i1;
      i1 = getView().getScrollBarSize();
      AppMethodBeat.o(65018);
    }
  }

  public int getScrollBarStyle()
  {
    AppMethodBeat.i(65019);
    int i1;
    if (getView() == null)
    {
      i1 = 0;
      AppMethodBeat.o(65019);
    }
    while (true)
    {
      return i1;
      i1 = getView().getScrollBarStyle();
      AppMethodBeat.o(65019);
    }
  }

  public WebSettings getSettings()
  {
    AppMethodBeat.i(64963);
    WebSettings localWebSettings;
    if (this.h != null)
    {
      localWebSettings = this.h;
      AppMethodBeat.o(64963);
    }
    while (true)
    {
      return localWebSettings;
      if (this.e)
      {
        localWebSettings = new WebSettings(this.f.getSettings());
        this.h = localWebSettings;
        AppMethodBeat.o(64963);
      }
      else
      {
        localWebSettings = new WebSettings(this.g.getSettings());
        this.h = localWebSettings;
        AppMethodBeat.o(64963);
      }
    }
  }

  public IX5WebSettingsExtension getSettingsExtension()
  {
    AppMethodBeat.i(64983);
    IX5WebSettingsExtension localIX5WebSettingsExtension;
    if (!this.e)
    {
      localIX5WebSettingsExtension = null;
      AppMethodBeat.o(64983);
    }
    while (true)
    {
      return localIX5WebSettingsExtension;
      localIX5WebSettingsExtension = this.f.getX5WebViewExtension().getSettingsExtension();
      AppMethodBeat.o(64983);
    }
  }

  public int getSysNightModeAlpha()
  {
    return NIGHT_MODE_ALPHA;
  }

  public String getTitle()
  {
    AppMethodBeat.i(64929);
    String str;
    if (!this.e)
    {
      str = this.g.getTitle();
      AppMethodBeat.o(64929);
    }
    while (true)
    {
      return str;
      str = this.f.getTitle();
      AppMethodBeat.o(64929);
    }
  }

  public String getUrl()
  {
    AppMethodBeat.i(64927);
    String str;
    if (!this.e)
    {
      str = this.g.getUrl();
      AppMethodBeat.o(64927);
    }
    while (true)
    {
      return str;
      str = this.f.getUrl();
      AppMethodBeat.o(64927);
    }
  }

  public View getView()
  {
    AppMethodBeat.i(64978);
    Object localObject;
    if (!this.e)
    {
      localObject = this.g;
      AppMethodBeat.o(64978);
    }
    while (true)
    {
      return localObject;
      localObject = this.f.getView();
      AppMethodBeat.o(64978);
    }
  }

  public int getVisibleTitleHeight()
  {
    AppMethodBeat.i(64882);
    Object localObject;
    int i1;
    if (!this.e)
    {
      localObject = r.a(this.g, "getVisibleTitleHeight");
      if (localObject == null)
      {
        i1 = 0;
        AppMethodBeat.o(64882);
      }
    }
    while (true)
    {
      return i1;
      i1 = ((Integer)localObject).intValue();
      AppMethodBeat.o(64882);
      continue;
      i1 = this.f.getVisibleTitleHeight();
      AppMethodBeat.o(64882);
    }
  }

  public WebChromeClient getWebChromeClient()
  {
    return this.r;
  }

  public IX5WebChromeClientExtension getWebChromeClientExtension()
  {
    AppMethodBeat.i(64986);
    IX5WebChromeClientExtension localIX5WebChromeClientExtension;
    if (!this.e)
    {
      localIX5WebChromeClientExtension = null;
      AppMethodBeat.o(64986);
    }
    while (true)
    {
      return localIX5WebChromeClientExtension;
      localIX5WebChromeClientExtension = this.f.getX5WebViewExtension().getWebChromeClientExtension();
      AppMethodBeat.o(64986);
    }
  }

  public int getWebScrollX()
  {
    AppMethodBeat.i(64880);
    int i1;
    if (this.e)
    {
      i1 = this.f.getView().getScrollX();
      AppMethodBeat.o(64880);
    }
    while (true)
    {
      return i1;
      i1 = this.g.getScrollX();
      AppMethodBeat.o(64880);
    }
  }

  public int getWebScrollY()
  {
    AppMethodBeat.i(64881);
    int i1;
    if (this.e)
    {
      i1 = this.f.getView().getScrollY();
      AppMethodBeat.o(64881);
    }
    while (true)
    {
      return i1;
      i1 = this.g.getScrollY();
      AppMethodBeat.o(64881);
    }
  }

  public WebViewClient getWebViewClient()
  {
    return this.q;
  }

  public IX5WebViewClientExtension getWebViewClientExtension()
  {
    AppMethodBeat.i(64987);
    IX5WebViewClientExtension localIX5WebViewClientExtension;
    if (!this.e)
    {
      localIX5WebViewClientExtension = null;
      AppMethodBeat.o(64987);
    }
    while (true)
    {
      return localIX5WebViewClientExtension;
      localIX5WebViewClientExtension = this.f.getX5WebViewExtension().getWebViewClientExtension();
      AppMethodBeat.o(64987);
    }
  }

  public IX5WebViewBase.HitTestResult getX5HitTestResult()
  {
    AppMethodBeat.i(64924);
    IX5WebViewBase.HitTestResult localHitTestResult;
    if (!this.e)
    {
      localHitTestResult = null;
      AppMethodBeat.o(64924);
    }
    while (true)
    {
      return localHitTestResult;
      localHitTestResult = this.f.getHitTestResult();
      AppMethodBeat.o(64924);
    }
  }

  public IX5WebViewExtension getX5WebViewExtension()
  {
    AppMethodBeat.i(64982);
    IX5WebViewExtension localIX5WebViewExtension;
    if (!this.e)
    {
      localIX5WebViewExtension = null;
      AppMethodBeat.o(64982);
    }
    while (true)
    {
      return localIX5WebViewExtension;
      localIX5WebViewExtension = this.f.getX5WebViewExtension();
      AppMethodBeat.o(64982);
    }
  }

  @Deprecated
  public View getZoomControls()
  {
    AppMethodBeat.i(64968);
    View localView;
    if (!this.e)
    {
      localView = (View)r.a(this.g, "getZoomControls");
      AppMethodBeat.o(64968);
    }
    while (true)
    {
      return localView;
      localView = this.f.getZoomControls();
      AppMethodBeat.o(64968);
    }
  }

  public void goBack()
  {
    AppMethodBeat.i(64911);
    if (!this.e)
    {
      this.g.goBack();
      AppMethodBeat.o(64911);
    }
    while (true)
    {
      return;
      this.f.goBack();
      AppMethodBeat.o(64911);
    }
  }

  public void goBackOrForward(int paramInt)
  {
    AppMethodBeat.i(64915);
    if (!this.e)
    {
      this.g.goBackOrForward(paramInt);
      AppMethodBeat.o(64915);
    }
    while (true)
    {
      return;
      this.f.goBackOrForward(paramInt);
      AppMethodBeat.o(64915);
    }
  }

  public void goForward()
  {
    AppMethodBeat.i(64913);
    if (!this.e)
    {
      this.g.goForward();
      AppMethodBeat.o(64913);
    }
    while (true)
    {
      return;
      this.f.goForward();
      AppMethodBeat.o(64913);
    }
  }

  public void invokeZoomPicker()
  {
    AppMethodBeat.i(64922);
    if (!this.e)
    {
      this.g.invokeZoomPicker();
      AppMethodBeat.o(64922);
    }
    while (true)
    {
      return;
      this.f.invokeZoomPicker();
      AppMethodBeat.o(64922);
    }
  }

  public boolean isDayMode()
  {
    return z;
  }

  public boolean isPrivateBrowsingEnabled()
  {
    AppMethodBeat.i(64970);
    Object localObject;
    boolean bool;
    if (!this.e)
      if (Build.VERSION.SDK_INT >= 11)
      {
        localObject = r.a(this.g, "isPrivateBrowsingEnabled");
        if (localObject == null)
        {
          AppMethodBeat.o(64970);
          bool = false;
        }
      }
    while (true)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(64970);
      continue;
      AppMethodBeat.o(64970);
      bool = false;
      continue;
      bool = this.f.isPrivateBrowsingEnable();
      AppMethodBeat.o(64970);
    }
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64903);
    if (!this.e)
    {
      this.g.loadData(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64903);
    }
    while (true)
    {
      return;
      this.f.loadData(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64903);
    }
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(64904);
    if (!this.e)
    {
      this.g.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      AppMethodBeat.o(64904);
    }
    while (true)
    {
      return;
      this.f.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      AppMethodBeat.o(64904);
    }
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(64900);
    if ((this.e) && (this.l != null) && (!this.m))
      this.l.a("load_url_gap", (byte)2);
    if ((paramString == null) || (showDebugView(paramString)))
      AppMethodBeat.o(64900);
    while (true)
    {
      return;
      if (!this.e)
      {
        this.g.loadUrl(paramString);
        AppMethodBeat.o(64900);
      }
      else
      {
        this.f.loadUrl(paramString);
        AppMethodBeat.o(64900);
      }
    }
  }

  @TargetApi(8)
  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(64899);
    if ((this.e) && (this.l != null) && (!this.m))
      this.l.a("load_url_gap", (byte)2);
    if ((paramString == null) || (showDebugView(paramString)))
      AppMethodBeat.o(64899);
    while (true)
    {
      return;
      if (!this.e)
      {
        if (Build.VERSION.SDK_INT >= 8)
        {
          this.g.loadUrl(paramString, paramMap);
          AppMethodBeat.o(64899);
        }
      }
      else
      {
        this.f.loadUrl(paramString, paramMap);
        AppMethodBeat.o(64899);
      }
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(64980);
    try
    {
      if ("com.xunmeng.pinduoduo".equals(this.i.getApplicationInfo().packageName))
      {
        bt localbt = new com/tencent/smtt/sdk/bt;
        localbt.<init>(this, "onDetachedFromWindow");
        localbt.start();
        AppMethodBeat.o(64980);
      }
      while (true)
      {
        return;
        a();
        AppMethodBeat.o(64980);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        a();
        AppMethodBeat.o(64980);
      }
    }
  }

  public boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(64998);
    boolean bool;
    if (this.B != null)
      if (!this.B.onLongClick(paramView))
      {
        bool = a(paramView);
        AppMethodBeat.o(64998);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(64998);
      continue;
      bool = a(paramView);
      AppMethodBeat.o(64998);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(64940);
    if (!this.e)
    {
      r.a(this.g, "onPause");
      AppMethodBeat.o(64940);
    }
    while (true)
    {
      return;
      this.f.onPause();
      AppMethodBeat.o(64940);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(64941);
    if (!this.e)
    {
      r.a(this.g, "onResume");
      AppMethodBeat.o(64941);
    }
    while (true)
    {
      return;
      this.f.onResume();
      AppMethodBeat.o(64941);
    }
  }

  @TargetApi(11)
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(64872);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((Build.VERSION.SDK_INT >= 21) && (c(this.i)) && (isHardwareAccelerated()) && (paramInt1 > 0) && (paramInt2 > 0))
      getLayerType();
    AppMethodBeat.o(64872);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(64981);
    if (this.i == null)
    {
      super.onVisibilityChanged(paramView, paramInt);
      AppMethodBeat.o(64981);
    }
    while (true)
    {
      return;
      if (s == null)
        s = this.i.getApplicationInfo().packageName;
      if ((s != null) && ((s.equals("com.tencent.mm")) || (s.equals("com.tencent.mobileqq"))))
      {
        super.onVisibilityChanged(paramView, paramInt);
        AppMethodBeat.o(64981);
      }
      else
      {
        if ((paramInt != 0) && (!this.k) && (this.a != 0))
        {
          this.k = true;
          String str1 = "";
          String str2 = "";
          String str3 = "";
          String str4 = str1;
          String str5 = str2;
          String str6 = str3;
          if (this.e)
          {
            Bundle localBundle = this.f.getX5WebViewExtension().getSdkQBStatisticsInfo();
            str4 = str1;
            str5 = str2;
            str6 = str3;
            if (localBundle != null)
            {
              str4 = localBundle.getString("guid");
              str5 = localBundle.getString("qua2");
              str6 = localBundle.getString("lc");
            }
          }
          if ("com.qzone".equals(this.i.getApplicationInfo().packageName))
          {
            int i1 = d(this.i);
            int i2 = i1;
            if (i1 == -1)
              i2 = this.a;
            this.a = i2;
            e(this.i);
          }
          com.tencent.smtt.sdk.a.b.a(this.i, str4, str5, str6, this.a, this.e, i());
          this.a = 0;
          this.k = false;
        }
        super.onVisibilityChanged(paramView, paramInt);
        AppMethodBeat.o(64981);
      }
    }
  }

  public boolean overlayHorizontalScrollbar()
  {
    AppMethodBeat.i(64877);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.overlayHorizontalScrollbar();
      AppMethodBeat.o(64877);
    }
    while (true)
    {
      return bool;
      bool = this.f.overlayHorizontalScrollbar();
      AppMethodBeat.o(64877);
    }
  }

  public boolean overlayVerticalScrollbar()
  {
    AppMethodBeat.i(64878);
    boolean bool;
    if (this.e)
    {
      bool = this.f.overlayVerticalScrollbar();
      AppMethodBeat.o(64878);
    }
    while (true)
    {
      return bool;
      bool = this.g.overlayVerticalScrollbar();
      AppMethodBeat.o(64878);
    }
  }

  public boolean pageDown(boolean paramBoolean)
  {
    AppMethodBeat.i(64917);
    if (!this.e)
    {
      paramBoolean = this.g.pageDown(paramBoolean);
      AppMethodBeat.o(64917);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = this.f.pageDown(paramBoolean, -1);
      AppMethodBeat.o(64917);
    }
  }

  public boolean pageUp(boolean paramBoolean)
  {
    AppMethodBeat.i(64916);
    if (!this.e)
    {
      paramBoolean = this.g.pageUp(paramBoolean);
      AppMethodBeat.o(64916);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = this.f.pageUp(paramBoolean, -1);
      AppMethodBeat.o(64916);
    }
  }

  public void pauseTimers()
  {
    AppMethodBeat.i(64938);
    if (!this.e)
    {
      this.g.pauseTimers();
      AppMethodBeat.o(64938);
    }
    while (true)
    {
      return;
      this.f.pauseTimers();
      AppMethodBeat.o(64938);
    }
  }

  @TargetApi(5)
  public void postUrl(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(64902);
    if (!this.e)
    {
      this.g.postUrl(paramString, paramArrayOfByte);
      AppMethodBeat.o(64902);
    }
    while (true)
    {
      return;
      this.f.postUrl(paramString, paramArrayOfByte);
      AppMethodBeat.o(64902);
    }
  }

  @Deprecated
  public void refreshPlugins(boolean paramBoolean)
  {
    AppMethodBeat.i(64965);
    if (!this.e)
    {
      r.a(this.g, "refreshPlugins", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(64965);
    }
    while (true)
    {
      return;
      this.f.refreshPlugins(paramBoolean);
      AppMethodBeat.o(64965);
    }
  }

  public void reload()
  {
    AppMethodBeat.i(64909);
    if (!this.e)
    {
      this.g.reload();
      AppMethodBeat.o(64909);
    }
    while (true)
    {
      return;
      this.f.reload();
      AppMethodBeat.o(64909);
    }
  }

  @TargetApi(11)
  public void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(64962);
    if (!this.e)
      if (Build.VERSION.SDK_INT >= 11)
      {
        r.a(this.g, "removeJavascriptInterface", new Class[] { String.class }, new Object[] { paramString });
        AppMethodBeat.o(64962);
      }
    while (true)
    {
      return;
      this.f.removeJavascriptInterface(paramString);
      AppMethodBeat.o(64962);
    }
  }

  public void removeView(View paramView)
  {
    AppMethodBeat.i(65005);
    if (!this.e)
    {
      this.g.removeView(paramView);
      AppMethodBeat.o(65005);
    }
    while (true)
    {
      return;
      View localView = this.f.getView();
      try
      {
        Method localMethod = r.a(localView, "removeView", new Class[] { View.class });
        localMethod.setAccessible(true);
        localMethod.invoke(localView, new Object[] { paramView });
        AppMethodBeat.o(65005);
      }
      catch (Throwable paramView)
      {
        AppMethodBeat.o(65005);
      }
    }
  }

  public void reportInitPerformance(long paramLong1, int paramInt, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(64898);
    TbsLog.i("sdkreport", "reportInitPerformance initType is " + paramLong1 + " isX5Core is " + this.e + " isPerformanceDataRecorded" + this.m);
    if ((this.e) && (this.l != null) && (!this.m))
    {
      this.l.a("init_type", paramLong1);
      this.l.a("time_oncreate", paramLong2);
      this.l.a("webview_type", paramInt);
      this.l.a("time_webaccelerator", paramLong3);
      if (this.l.a(this.f.hashCode(), getUrl()))
        this.m = true;
    }
    AppMethodBeat.o(64898);
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    AppMethodBeat.i(64879);
    Object localObject1;
    Object localObject2;
    if (this.e)
    {
      localObject1 = this.f.getView();
      if ((localObject1 instanceof ViewGroup))
      {
        localObject2 = (ViewGroup)localObject1;
        if (paramView == this)
        {
          paramView = (View)localObject1;
          paramBoolean = ((ViewGroup)localObject2).requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
          AppMethodBeat.o(64879);
        }
      }
    }
    while (true)
    {
      return paramBoolean;
      break;
      paramBoolean = false;
      AppMethodBeat.o(64879);
      continue;
      localObject2 = this.g;
      localObject1 = paramView;
      if (paramView == this)
        localObject1 = this.g;
      paramBoolean = ((android.webkit.WebView)localObject2).requestChildRectangleOnScreen((View)localObject1, paramRect, paramBoolean);
      AppMethodBeat.o(64879);
    }
  }

  public void requestFocusNodeHref(Message paramMessage)
  {
    AppMethodBeat.i(64925);
    if (!this.e)
    {
      this.g.requestFocusNodeHref(paramMessage);
      AppMethodBeat.o(64925);
    }
    while (true)
    {
      return;
      this.f.requestFocusNodeHref(paramMessage);
      AppMethodBeat.o(64925);
    }
  }

  public void requestImageRef(Message paramMessage)
  {
    AppMethodBeat.i(64926);
    if (!this.e)
    {
      this.g.requestImageRef(paramMessage);
      AppMethodBeat.o(64926);
    }
    while (true)
    {
      return;
      this.f.requestImageRef(paramMessage);
      AppMethodBeat.o(64926);
    }
  }

  @Deprecated
  public boolean restorePicture(Bundle paramBundle, File paramFile)
  {
    AppMethodBeat.i(64896);
    boolean bool;
    if (!this.e)
    {
      paramBundle = r.a(this.g, "restorePicture", new Class[] { Bundle.class, File.class }, new Object[] { paramBundle, paramFile });
      if (paramBundle == null)
      {
        AppMethodBeat.o(64896);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramBundle).booleanValue();
      AppMethodBeat.o(64896);
      continue;
      bool = this.f.restorePicture(paramBundle, paramFile);
      AppMethodBeat.o(64896);
    }
  }

  public WebBackForwardList restoreState(Bundle paramBundle)
  {
    AppMethodBeat.i(64897);
    if (!this.e)
    {
      paramBundle = WebBackForwardList.a(this.g.restoreState(paramBundle));
      AppMethodBeat.o(64897);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = WebBackForwardList.a(this.f.restoreState(paramBundle));
      AppMethodBeat.o(64897);
    }
  }

  public void resumeTimers()
  {
    AppMethodBeat.i(64939);
    if (!this.e)
    {
      this.g.resumeTimers();
      AppMethodBeat.o(64939);
    }
    while (true)
    {
      return;
      this.f.resumeTimers();
      AppMethodBeat.o(64939);
    }
  }

  @Deprecated
  public void savePassword(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64885);
    if (!this.e)
    {
      r.a(this.g, "savePassword", new Class[] { String.class, String.class, String.class }, new Object[] { paramString1, paramString2, paramString3 });
      AppMethodBeat.o(64885);
    }
    while (true)
    {
      return;
      this.f.savePassword(paramString1, paramString2, paramString3);
      AppMethodBeat.o(64885);
    }
  }

  @Deprecated
  public boolean savePicture(Bundle paramBundle, File paramFile)
  {
    AppMethodBeat.i(64895);
    boolean bool;
    if (!this.e)
    {
      paramBundle = r.a(this.g, "savePicture", new Class[] { Bundle.class, File.class }, new Object[] { paramBundle, paramFile });
      if (paramBundle == null)
      {
        AppMethodBeat.o(64895);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramBundle).booleanValue();
      AppMethodBeat.o(64895);
      continue;
      bool = this.f.savePicture(paramBundle, paramFile);
      AppMethodBeat.o(64895);
    }
  }

  public WebBackForwardList saveState(Bundle paramBundle)
  {
    AppMethodBeat.i(64894);
    if (!this.e)
    {
      paramBundle = WebBackForwardList.a(this.g.saveState(paramBundle));
      AppMethodBeat.o(64894);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = WebBackForwardList.a(this.f.saveState(paramBundle));
      AppMethodBeat.o(64894);
    }
  }

  @TargetApi(11)
  public void saveWebArchive(String paramString)
  {
    AppMethodBeat.i(64905);
    if (!this.e)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label67;
      r.a(this.g, "saveWebArchive", new Class[] { String.class }, new Object[] { paramString });
      AppMethodBeat.o(64905);
    }
    while (true)
    {
      return;
      this.f.saveWebArchive(paramString);
      label67: AppMethodBeat.o(64905);
    }
  }

  @TargetApi(11)
  public void saveWebArchive(String paramString, boolean paramBoolean, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(64906);
    if (!this.e)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label92;
      r.a(this.g, "saveWebArchive", new Class[] { String.class, Boolean.TYPE, android.webkit.ValueCallback.class }, new Object[] { paramString, Boolean.valueOf(paramBoolean), paramValueCallback });
      AppMethodBeat.o(64906);
    }
    while (true)
    {
      return;
      this.f.saveWebArchive(paramString, paramBoolean, paramValueCallback);
      label92: AppMethodBeat.o(64906);
    }
  }

  public void setARModeEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(64997);
    try
    {
      if (this.e)
        getSettingsExtension().setARModeEnable(paramBoolean);
      AppMethodBeat.o(64997);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(64997);
    }
  }

  public void setBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(64977);
    if (!this.e)
      this.g.setBackgroundColor(paramInt);
    while (true)
    {
      super.setBackgroundColor(paramInt);
      AppMethodBeat.o(64977);
      return;
      this.f.setBackgroundColor(paramInt);
    }
  }

  @Deprecated
  public void setCertificate(SslCertificate paramSslCertificate)
  {
    AppMethodBeat.i(64884);
    if (!this.e)
    {
      this.g.setCertificate(paramSslCertificate);
      AppMethodBeat.o(64884);
    }
    while (true)
    {
      return;
      this.f.setCertificate(paramSslCertificate);
      AppMethodBeat.o(64884);
    }
  }

  public void setDayOrNight(boolean paramBoolean)
  {
    AppMethodBeat.i(64996);
    try
    {
      if (this.e)
        getSettingsExtension().setDayOrNight(paramBoolean);
      setSysDayOrNight(paramBoolean);
      getView().postInvalidate();
      AppMethodBeat.o(64996);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(64996);
    }
  }

  public void setDownloadListener(DownloadListener paramDownloadListener)
  {
    AppMethodBeat.i(64958);
    if (!this.e)
    {
      this.g.setDownloadListener(new bq(this, paramDownloadListener));
      AppMethodBeat.o(64958);
    }
    while (true)
    {
      return;
      this.f.setDownloadListener(new b(this, paramDownloadListener, this.e));
      AppMethodBeat.o(64958);
    }
  }

  @TargetApi(16)
  public void setFindListener(IX5WebViewBase.FindListener paramFindListener)
  {
    AppMethodBeat.i(64948);
    if (!this.e)
    {
      if (Build.VERSION.SDK_INT < 16)
        break label54;
      this.g.setFindListener(new bp(this, paramFindListener));
      AppMethodBeat.o(64948);
    }
    while (true)
    {
      return;
      this.f.setFindListener(paramFindListener);
      label54: AppMethodBeat.o(64948);
    }
  }

  public void setHorizontalScrollbarOverlay(boolean paramBoolean)
  {
    AppMethodBeat.i(64875);
    if (!this.e)
    {
      this.g.setHorizontalScrollbarOverlay(paramBoolean);
      AppMethodBeat.o(64875);
    }
    while (true)
    {
      return;
      this.f.setHorizontalScrollbarOverlay(paramBoolean);
      AppMethodBeat.o(64875);
    }
  }

  public void setHttpAuthUsernamePassword(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(64886);
    if (!this.e)
    {
      this.g.setHttpAuthUsernamePassword(paramString1, paramString2, paramString3, paramString4);
      AppMethodBeat.o(64886);
    }
    while (true)
    {
      return;
      this.f.setHttpAuthUsernamePassword(paramString1, paramString2, paramString3, paramString4);
      AppMethodBeat.o(64886);
    }
  }

  public void setInitialScale(int paramInt)
  {
    AppMethodBeat.i(64921);
    if (!this.e)
    {
      this.g.setInitialScale(paramInt);
      AppMethodBeat.o(64921);
    }
    while (true)
    {
      return;
      this.f.setInitialScale(paramInt);
      AppMethodBeat.o(64921);
    }
  }

  @Deprecated
  public void setMapTrackballToArrowKeys(boolean paramBoolean)
  {
    AppMethodBeat.i(64966);
    if (!this.e)
    {
      r.a(this.g, "setMapTrackballToArrowKeys", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(64966);
    }
    while (true)
    {
      return;
      this.f.setMapTrackballToArrowKeys(paramBoolean);
      AppMethodBeat.o(64966);
    }
  }

  public void setNetworkAvailable(boolean paramBoolean)
  {
    AppMethodBeat.i(64893);
    if (!this.e)
    {
      if (Build.VERSION.SDK_INT < 3)
        break label45;
      this.g.setNetworkAvailable(paramBoolean);
      AppMethodBeat.o(64893);
    }
    while (true)
    {
      return;
      this.f.setNetworkAvailable(paramBoolean);
      label45: AppMethodBeat.o(64893);
    }
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(64999);
    if (!this.e)
    {
      this.g.setOnLongClickListener(paramOnLongClickListener);
      AppMethodBeat.o(64999);
    }
    while (true)
    {
      return;
      Object localObject1 = this.f.getView();
      try
      {
        if (this.A == null)
        {
          Object localObject2 = r.a(localObject1, "getListenerInfo", new Class[0]);
          ((Method)localObject2).setAccessible(true);
          localObject2 = ((Method)localObject2).invoke(localObject1, null);
          localObject1 = localObject2.getClass().getDeclaredField("mOnLongClickListener");
          ((Field)localObject1).setAccessible(true);
          this.A = ((Field)localObject1).get(localObject2);
        }
        this.B = paramOnLongClickListener;
        getView().setOnLongClickListener(this);
        AppMethodBeat.o(64999);
      }
      catch (Throwable paramOnLongClickListener)
      {
        AppMethodBeat.o(64999);
      }
    }
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(64991);
    getView().setOnTouchListener(paramOnTouchListener);
    AppMethodBeat.o(64991);
  }

  public void setPictureListener(WebView.PictureListener paramPictureListener)
  {
    AppMethodBeat.i(64960);
    if (!this.e)
      if (paramPictureListener == null)
      {
        this.g.setPictureListener(null);
        AppMethodBeat.o(64960);
      }
    while (true)
    {
      return;
      this.g.setPictureListener(new br(this, paramPictureListener));
      AppMethodBeat.o(64960);
      continue;
      if (paramPictureListener == null)
      {
        this.f.setPictureListener(null);
        AppMethodBeat.o(64960);
      }
      else
      {
        this.f.setPictureListener(new bs(this, paramPictureListener));
        AppMethodBeat.o(64960);
      }
    }
  }

  public void setRendererPriorityPolicy(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(64932);
    try
    {
      if (!this.e)
      {
        int i1 = Build.VERSION.SDK_INT;
        if (i1 < 26)
          AppMethodBeat.o(64932);
      }
      while (true)
      {
        return;
        r.a(this.g, "setRendererPriorityPolicy", new Class[] { Integer.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64932);
        continue;
        AppMethodBeat.o(64932);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64932);
    }
  }

  public void setScrollBarStyle(int paramInt)
  {
    AppMethodBeat.i(64874);
    if (this.e)
    {
      this.f.getView().setScrollBarStyle(paramInt);
      AppMethodBeat.o(64874);
    }
    while (true)
    {
      return;
      this.g.setScrollBarStyle(paramInt);
      AppMethodBeat.o(64874);
    }
  }

  public void setSysNightModeAlpha(int paramInt)
  {
    NIGHT_MODE_ALPHA = paramInt;
  }

  public void setVerticalScrollbarOverlay(boolean paramBoolean)
  {
    AppMethodBeat.i(64876);
    if (!this.e)
    {
      this.g.setVerticalScrollbarOverlay(paramBoolean);
      AppMethodBeat.o(64876);
    }
    while (true)
    {
      return;
      this.f.setVerticalScrollbarOverlay(paramBoolean);
      AppMethodBeat.o(64876);
    }
  }

  public boolean setVideoFullScreen(Context paramContext, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(64990);
    if ((paramContext.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader")) && (this.f != null))
    {
      paramContext = new Bundle();
      if (paramBoolean)
      {
        paramContext.putInt("DefaultVideoScreen", 2);
        this.f.getX5WebViewExtension().invokeMiscMethod("setVideoParams", paramContext);
        AppMethodBeat.o(64990);
        paramBoolean = bool;
      }
    }
    while (true)
    {
      return paramBoolean;
      paramContext.putInt("DefaultVideoScreen", 1);
      break;
      paramBoolean = false;
      AppMethodBeat.o(64990);
    }
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(65020);
    super.setVisibility(paramInt);
    if (getView() == null)
      AppMethodBeat.o(65020);
    while (true)
    {
      return;
      getView().setVisibility(paramInt);
      AppMethodBeat.o(65020);
    }
  }

  public void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    IX5WebViewBase localIX5WebViewBase = null;
    Object localObject = null;
    AppMethodBeat.i(64959);
    if (this.e)
    {
      localIX5WebViewBase = this.f;
      if (paramWebChromeClient == null);
      while (true)
      {
        localIX5WebViewBase.setWebChromeClient((IX5WebChromeClient)localObject);
        this.r = paramWebChromeClient;
        AppMethodBeat.o(64959);
        return;
        localObject = new q(bv.a().a(true).i(), this, paramWebChromeClient);
      }
    }
    WebView.b localb = this.g;
    if (paramWebChromeClient == null);
    for (localObject = localIX5WebViewBase; ; localObject = new SystemWebChromeClient(this, paramWebChromeClient))
    {
      localb.setWebChromeClient((android.webkit.WebChromeClient)localObject);
      break;
    }
  }

  public void setWebChromeClientExtension(IX5WebChromeClientExtension paramIX5WebChromeClientExtension)
  {
    AppMethodBeat.i(64985);
    if (!this.e)
      AppMethodBeat.o(64985);
    while (true)
    {
      return;
      this.f.getX5WebViewExtension().setWebChromeClientExtension(paramIX5WebChromeClientExtension);
      AppMethodBeat.o(64985);
    }
  }

  public void setWebViewCallbackClient(WebViewCallbackClient paramWebViewCallbackClient)
  {
    AppMethodBeat.i(64956);
    this.mWebViewCallbackClient = paramWebViewCallbackClient;
    if ((this.e) && (getX5WebViewExtension() != null))
    {
      paramWebViewCallbackClient = new Bundle();
      paramWebViewCallbackClient.putBoolean("flag", true);
      getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", paramWebViewCallbackClient);
    }
    AppMethodBeat.o(64956);
  }

  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    IX5WebViewBase localIX5WebViewBase = null;
    Object localObject = null;
    AppMethodBeat.i(64955);
    if (this.e)
    {
      localIX5WebViewBase = this.f;
      if (paramWebViewClient == null);
      while (true)
      {
        localIX5WebViewBase.setWebViewClient((IX5WebViewClient)localObject);
        this.q = paramWebViewClient;
        AppMethodBeat.o(64955);
        return;
        localObject = new v(bv.a().a(true).j(), this, paramWebViewClient);
      }
    }
    WebView.b localb = this.g;
    if (paramWebViewClient == null);
    for (localObject = localIX5WebViewBase; ; localObject = new ad(this, paramWebViewClient))
    {
      localb.setWebViewClient((android.webkit.WebViewClient)localObject);
      break;
    }
  }

  public void setWebViewClientExtension(IX5WebViewClientExtension paramIX5WebViewClientExtension)
  {
    AppMethodBeat.i(64984);
    if (!this.e)
      AppMethodBeat.o(64984);
    while (true)
    {
      return;
      this.f.getX5WebViewExtension().setWebViewClientExtension(paramIX5WebViewClientExtension);
      AppMethodBeat.o(64984);
    }
  }

  @SuppressLint({"NewApi"})
  public boolean showDebugView(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(64901);
    paramString = paramString.toLowerCase();
    if (paramString.startsWith("http://debugtbs.qq.com"))
    {
      getView().setVisibility(4);
      d.a(this.i).a(paramString, this, this.i, al.a().getLooper());
      AppMethodBeat.o(64901);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramString.startsWith("http://debugx5.qq.com"))
      {
        if (!this.e)
        {
          paramString = new StringBuilder();
          paramString.append("<!DOCTYPE html><html><body>");
          paramString.append("<head>");
          paramString.append("<title>无法打开debugx5</title>");
          paramString.append("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" />");
          paramString.append("</head>");
          paramString.append("<br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />");
          paramString.append("尝试<a href=\"http://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a>");
          paramString.append("</body></html>");
          loadDataWithBaseURL(null, paramString.toString(), "text/html", "utf-8", null);
          AppMethodBeat.o(64901);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(64901);
        }
      }
      else
        AppMethodBeat.o(64901);
    }
  }

  public boolean showFindDialog(String paramString, boolean paramBoolean)
  {
    return false;
  }

  public void stopLoading()
  {
    AppMethodBeat.i(64907);
    if (!this.e)
    {
      this.g.stopLoading();
      AppMethodBeat.o(64907);
    }
    while (true)
    {
      return;
      this.f.stopLoading();
      AppMethodBeat.o(64907);
    }
  }

  public void super_computeScroll()
  {
    AppMethodBeat.i(65015);
    if (!this.e)
    {
      this.g.a();
      AppMethodBeat.o(65015);
    }
    while (true)
    {
      return;
      View localView = this.f.getView();
      try
      {
        r.a(localView, "super_computeScroll");
        AppMethodBeat.o(65015);
      }
      catch (Throwable localThrowable)
      {
        AppMethodBeat.o(65015);
      }
    }
  }

  public boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65012);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.b(paramMotionEvent);
      AppMethodBeat.o(65012);
    }
    while (true)
    {
      return bool;
      View localView = this.f.getView();
      try
      {
        paramMotionEvent = r.a(localView, "super_dispatchTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
        if (paramMotionEvent == null)
        {
          AppMethodBeat.o(65012);
          bool = false;
        }
        else
        {
          bool = ((Boolean)paramMotionEvent).booleanValue();
          AppMethodBeat.o(65012);
        }
      }
      catch (Throwable paramMotionEvent)
      {
        AppMethodBeat.o(65012);
        bool = false;
      }
    }
  }

  public boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65013);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.c(paramMotionEvent);
      AppMethodBeat.o(65013);
    }
    while (true)
    {
      return bool;
      View localView = this.f.getView();
      try
      {
        paramMotionEvent = r.a(localView, "super_onInterceptTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
        if (paramMotionEvent == null)
        {
          AppMethodBeat.o(65013);
          bool = false;
        }
        else
        {
          bool = ((Boolean)paramMotionEvent).booleanValue();
          AppMethodBeat.o(65013);
        }
      }
      catch (Throwable paramMotionEvent)
      {
        AppMethodBeat.o(65013);
        bool = false;
      }
    }
  }

  public void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(65011);
    if (!this.e)
    {
      this.g.a(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      AppMethodBeat.o(65011);
    }
    while (true)
    {
      return;
      View localView = this.f.getView();
      try
      {
        r.a(localView, "super_onOverScrolled", new Class[] { Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
        AppMethodBeat.o(65011);
      }
      catch (Throwable localThrowable)
      {
        AppMethodBeat.o(65011);
      }
    }
  }

  public void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(65009);
    if (!this.e)
    {
      this.g.a(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(65009);
    }
    while (true)
    {
      return;
      View localView = this.f.getView();
      try
      {
        r.a(localView, "super_onScrollChanged", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
        AppMethodBeat.o(65009);
      }
      catch (Throwable localThrowable)
      {
        AppMethodBeat.o(65009);
      }
    }
  }

  public boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65014);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.a(paramMotionEvent);
      AppMethodBeat.o(65014);
    }
    while (true)
    {
      return bool;
      View localView = this.f.getView();
      try
      {
        paramMotionEvent = r.a(localView, "super_onTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
        if (paramMotionEvent == null)
        {
          AppMethodBeat.o(65014);
          bool = false;
        }
        else
        {
          bool = ((Boolean)paramMotionEvent).booleanValue();
          AppMethodBeat.o(65014);
        }
      }
      catch (Throwable paramMotionEvent)
      {
        AppMethodBeat.o(65014);
        bool = false;
      }
    }
  }

  public boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(65010);
    if (!this.e)
    {
      paramBoolean = this.g.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      AppMethodBeat.o(65010);
    }
    while (true)
    {
      return paramBoolean;
      Object localObject = this.f.getView();
      try
      {
        localObject = r.a(localObject, "super_overScrollBy", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Boolean.valueOf(paramBoolean) });
        if (localObject != null)
          break label237;
        paramBoolean = false;
        AppMethodBeat.o(65010);
      }
      catch (Throwable localThrowable)
      {
        paramBoolean = false;
        AppMethodBeat.o(65010);
      }
      continue;
      label237: paramBoolean = ((Boolean)localThrowable).booleanValue();
      AppMethodBeat.o(65010);
    }
  }

  public void switchNightMode(boolean paramBoolean)
  {
    AppMethodBeat.i(64993);
    if (paramBoolean == z)
      AppMethodBeat.o(64993);
    while (true)
    {
      return;
      z = paramBoolean;
      if (paramBoolean)
      {
        TbsLog.e("QB_SDK", "deleteNightMode");
        loadUrl("javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));");
        AppMethodBeat.o(64993);
      }
      else
      {
        TbsLog.e("QB_SDK", "nightMode");
        loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
        AppMethodBeat.o(64993);
      }
    }
  }

  public void switchToNightMode()
  {
    AppMethodBeat.i(64994);
    TbsLog.e("QB_SDK", "switchToNightMode 01");
    if (!z)
    {
      TbsLog.e("QB_SDK", "switchToNightMode");
      loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }
    AppMethodBeat.o(64994);
  }

  public void tbsWebviewDestroy(boolean paramBoolean)
  {
    AppMethodBeat.i(64888);
    Object localObject1;
    Object localObject3;
    int i2;
    if ((!this.k) && (this.a != 0))
    {
      this.k = true;
      String str1 = "";
      String str2 = "";
      String str3 = "";
      localObject1 = str1;
      ??? = str2;
      localObject3 = str3;
      if (this.e)
      {
        Bundle localBundle = this.f.getX5WebViewExtension().getSdkQBStatisticsInfo();
        localObject1 = str1;
        ??? = str2;
        localObject3 = str3;
        if (localBundle != null)
        {
          localObject1 = localBundle.getString("guid");
          ??? = localBundle.getString("qua2");
          localObject3 = localBundle.getString("lc");
        }
      }
      if ("com.qzone".equals(this.i.getApplicationInfo().packageName))
      {
        int i1 = d(this.i);
        i2 = i1;
        if (i1 == -1)
          i2 = this.a;
        this.a = i2;
        e(this.i);
      }
      com.tencent.smtt.sdk.a.b.a(this.i, (String)localObject1, (String)???, (String)localObject3, this.a, this.e, i());
      this.a = 0;
      this.k = false;
    }
    if (!this.e);
    try
    {
      ??? = Class.forName("android.webkit.WebViewClassic");
      localObject3 = ((Class)???).getMethod("fromWebView", new Class[] { android.webkit.WebView.class });
      ((Method)localObject3).setAccessible(true);
      localObject3 = ((Method)localObject3).invoke(null, new Object[] { this.g });
      if (localObject3 != null)
      {
        ??? = ((Class)???).getDeclaredField("mListBoxDialog");
        ((Field)???).setAccessible(true);
        localObject3 = ((Field)???).get(localObject3);
        if (localObject3 != null)
        {
          localObject3 = (Dialog)localObject3;
          ((Dialog)localObject3).setOnCancelListener(null);
          ??? = Class.forName("android.app.Dialog");
          localObject1 = ((Class)???).getDeclaredField("CANCEL");
          ((Field)localObject1).setAccessible(true);
          i2 = ((Integer)((Field)localObject1).get(localObject3)).intValue();
          ??? = ((Class)???).getDeclaredField("mListenersHandler");
          ((Field)???).setAccessible(true);
          ((Handler)((Field)???).get(localObject3)).removeMessages(i2);
        }
      }
      label388: if (paramBoolean)
        this.g.destroy();
      while (true)
      {
        try
        {
          ??? = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
          ((Field)???).setAccessible(true);
          localObject3 = (ComponentCallbacks)((Field)???).get(null);
          if (localObject3 != null)
          {
            ((Field)???).set(null, null);
            ??? = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
            ((Field)???).setAccessible(true);
            ??? = ((Field)???).get(null);
            if (??? == null);
          }
          synchronized ((List)???)
          {
            ((List)???).remove(localObject3);
            TbsLog.i("WebView", "X5 GUID = " + QbSdk.b());
            AppMethodBeat.o(64888);
            return;
          }
        }
        catch (Exception localException1)
        {
          continue;
        }
        if (paramBoolean)
          this.f.destroy();
      }
    }
    catch (Exception localException2)
    {
      break label388;
    }
  }

  public boolean zoomIn()
  {
    AppMethodBeat.i(64972);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.zoomIn();
      AppMethodBeat.o(64972);
    }
    while (true)
    {
      return bool;
      bool = this.f.zoomIn();
      AppMethodBeat.o(64972);
    }
  }

  public boolean zoomOut()
  {
    AppMethodBeat.i(64973);
    boolean bool;
    if (!this.e)
    {
      bool = this.g.zoomOut();
      AppMethodBeat.o(64973);
    }
    while (true)
    {
      return bool;
      bool = this.f.zoomOut();
      AppMethodBeat.o(64973);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebView
 * JD-Core Version:    0.6.2
 */