package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings.LayoutAlgorithm;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.p;
import java.lang.reflect.Method;
import java.net.URL;

public class MMWebView extends WebView
{
  public static final WebView.d zNq = WebView.d.ANc;
  public static String zNr = null;
  private boolean htt;
  public boolean inited;
  private View.OnTouchListener jZu;
  private String uFw;
  private s zNp;
  protected boolean zNs;
  private boolean zNt;
  private ViewGroup zNu;
  public MMWebView.d zNv;

  public MMWebView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, WebView.d.ANa);
  }

  public MMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, WebView.d.ANa);
  }

  public MMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, WebView.d paramd)
  {
    super(paramContext, paramAttributeSet, paramInt, paramd);
    AppMethodBeat.i(107940);
    this.zNp = new s();
    this.inited = false;
    this.zNs = false;
    this.zNt = false;
    this.zNv = null;
    setBackgroundColor(-1);
    dKG();
    AppMethodBeat.o(107940);
  }

  private static boolean a(MMWebView paramMMWebView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(107948);
    try
    {
      Object localObject = new com/tencent/mm/compatible/loader/c;
      ((c)localObject).<init>(paramMMWebView, "mSysWebView", null);
      paramMMWebView = ((c)localObject).get();
      localObject = new com/tencent/mm/compatible/loader/c;
      ((c)localObject).<init>(paramMMWebView, "mProvider", null);
      paramMMWebView = ((c)localObject).get();
      localObject = new com/tencent/mm/compatible/loader/c;
      ((c)localObject).<init>(paramMMWebView, "mWebViewCore", null);
      paramMMWebView = ((c)localObject).get();
      localObject = paramMMWebView.getClass().getDeclaredMethod("sendMessage", new Class[] { Message.class });
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(paramMMWebView, new Object[] { Message.obtain(null, 194, paramString) });
      AppMethodBeat.o(107948);
      return bool;
    }
    catch (Exception paramMMWebView)
    {
      while (true)
      {
        ab.e("MicroMsg.MMWebView", "reflectJSExec, e = %s", new Object[] { paramMMWebView });
        AppMethodBeat.o(107948);
        bool = false;
      }
    }
  }

  public static void il(Context paramContext)
  {
    AppMethodBeat.i(107957);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    String str1 = localSharedPreferences.getString("tbs_webview_disable", "0");
    paramContext = localSharedPreferences.getString("tbs_webview_min_sdk_version", null);
    String str2 = localSharedPreferences.getString("tbs_webview_max_sdk_version", null);
    ab.i("MicroMsg.MMWebView", "initTbsSettings, tbsDisable = %s, minSdkVersion = %s, maxSdkVersion = %s", new Object[] { str1, paramContext, str2 });
    if ("1".equals(str1))
    {
      int i = bo.getInt(paramContext, 0);
      int j = bo.getInt(str2, 0);
      int k = Build.VERSION.SDK_INT;
      if ((k >= i) && ((k <= j) || (j == 0)))
        ab.i("MicroMsg.MMWebView", "in selection, disable x5");
    }
    for (boolean bool1 = false; ; bool1 = true)
    {
      ab.i("MicroMsg.MMWebView", "initTbsSettings, enableTbsKernel = %b", new Object[] { Boolean.valueOf(bool1) });
      if (!bool1)
        com.tencent.xweb.x5.sdk.d.forceSysWebView();
      bool1 = localSharedPreferences.getBoolean("tbs_download_oversea", false);
      boolean bool2 = g.dnY();
      ab.i("MicroMsg.MMWebView", "initTbsSettings, tbs_download_oversea = %b, isGPVersion = %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2))
        com.tencent.xweb.x5.sdk.d.forceSysWebView();
      AppMethodBeat.o(107957);
      return;
    }
  }

  public final void M(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107956);
    super.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(107956);
  }

  public final boolean Q(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(107951);
    int i = paramMotionEvent.getAction();
    boolean bool2 = super.super_onTouchEvent(paramMotionEvent);
    switch (i & 0xFF)
    {
    case 1:
    default:
      if (bool2)
        if (this.zNt)
          break;
      break;
    case 0:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(107951);
      return bool1;
      this.zNt = false;
      break;
      if (this.zNu == null)
        break;
      if (this.zNt)
      {
        this.zNu.requestDisallowInterceptTouchEvent(false);
        break;
      }
      this.zNu.requestDisallowInterceptTouchEvent(true);
      break;
      bool1 = false;
      continue;
      bool1 = bool2;
    }
  }

  public final boolean R(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107953);
    boolean bool = super.super_dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(107953);
    return bool;
  }

  public final boolean S(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107954);
    boolean bool = super.super_onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(107954);
    return bool;
  }

  public void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(107946);
    super.evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(107946);
  }

  public void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(107947);
    super.evaluateJavascript(paramString3, paramValueCallback);
    AppMethodBeat.o(107947);
  }

  @TargetApi(9)
  public final boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(107950);
    paramBoolean = super.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    if ((paramInt4 < 0) || ((paramInt4 == 0) && (paramInt2 < 0)))
      this.zNt = true;
    AppMethodBeat.o(107950);
    return paramBoolean;
  }

  @TargetApi(11)
  protected final void dKG()
  {
    AppMethodBeat.i(107942);
    try
    {
      if (Build.VERSION.SDK_INT >= 11)
        super.removeJavascriptInterface("searchBoxJavaBridge_");
      AppMethodBeat.o(107942);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(107942);
      }
    }
  }

  public final void dKH()
  {
    AppMethodBeat.i(107943);
    if (Build.VERSION.SDK_INT >= 5)
    {
      new MMWebView.c(this, (byte)0);
      MMWebView.c.e(this);
      AppMethodBeat.o(107943);
    }
    while (true)
    {
      return;
      new MMWebView.b(this, (byte)0);
      setScrollBarStyle(0);
      AppMethodBeat.o(107943);
    }
  }

  public final void dKI()
  {
    AppMethodBeat.i(107944);
    if (Build.VERSION.SDK_INT >= 8)
      getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    AppMethodBeat.o(107944);
  }

  public final void dKJ()
  {
    AppMethodBeat.i(107949);
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        boolean bool = false;
        AppMethodBeat.i(107934);
        if (MMWebView.this.getIsX5Kernel())
        {
          int i = paramAnonymousMotionEvent.getAction();
          if (MMWebView.d(MMWebView.this) != null);
          switch (i & 0xFF)
          {
          default:
            MMWebView.d(MMWebView.this).requestDisallowInterceptTouchEvent(true);
            if (MMWebView.e(MMWebView.this) != null)
            {
              bool = MMWebView.e(MMWebView.this).onTouch(paramAnonymousView, paramAnonymousMotionEvent);
              AppMethodBeat.o(107934);
            }
            break;
          case 0:
          case 2:
          case 1:
          case 3:
          }
        }
        while (true)
        {
          return bool;
          MMWebView.d(MMWebView.this).requestDisallowInterceptTouchEvent(true);
          break;
          MMWebView.d(MMWebView.this).requestDisallowInterceptTouchEvent(false);
          break;
          AppMethodBeat.o(107934);
        }
      }
    });
    AppMethodBeat.o(107949);
  }

  @TargetApi(9)
  public final void dKK()
  {
    AppMethodBeat.i(107955);
    super.super_computeScroll();
    AppMethodBeat.o(107955);
  }

  @TargetApi(9)
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(107952);
    super.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(107952);
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(107945);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(107945);
    while (true)
    {
      return;
      if ((com.tencent.mm.compatible.util.d.iW(19)) || (this.isX5Kernel));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label61;
        super.evaluateJavascript(paramString, paramValueCallback);
        AppMethodBeat.o(107945);
        break;
      }
      label61: if ((this.zNs) && (a(this, paramString)))
      {
        AppMethodBeat.o(107945);
      }
      else
      {
        paramValueCallback = paramString;
        try
        {
          if (!paramString.startsWith("javascript:"))
            paramValueCallback = "javascript:".concat(String.valueOf(paramString));
          super.loadUrl(paramValueCallback);
          AppMethodBeat.o(107945);
        }
        catch (Exception paramString)
        {
          ab.i("MicroMsg.MMWebView", "evaluateJavascript failed : %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(107945);
        }
      }
    }
  }

  public boolean getIsX5Kernel()
  {
    return this.isX5Kernel;
  }

  public s getPerformanceHelper()
  {
    return this.zNp;
  }

  public String getRandomStr()
  {
    return this.uFw;
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(107941);
    super.loadUrl(paramString);
    AppMethodBeat.o(107941);
  }

  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107958);
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.zNv != null)
      this.zNv.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(107958);
  }

  public void setCompetitorView(ViewGroup paramViewGroup)
  {
    this.zNu = paramViewGroup;
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.jZu = paramOnTouchListener;
  }

  public void setPreload(boolean paramBoolean)
  {
    this.htt = paramBoolean;
  }

  public void setRandomStr(String paramString)
  {
    this.uFw = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMWebView
 * JD-Core Version:    0.6.2
 */