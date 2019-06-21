package com.tencent.xweb;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.b.a;
import com.tencent.xweb.c.b.b;
import com.tencent.xweb.c.d;
import com.tencent.xweb.c.h;
import com.tencent.xweb.c.i;
import com.tencent.xweb.c.j;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

public class WebView extends FrameLayout
  implements h
{
  static WebView.d AMM;
  static String AMN;
  static com.tencent.xweb.x5.sdk.c AMT;
  h AMO;
  WebView.d AMQ;
  d AMS;
  private int AMU;
  public boolean isX5Kernel;
  View.OnLongClickListener zMt;

  static
  {
    AppMethodBeat.i(3941);
    x.initInterface();
    AMM = WebView.d.ANa;
    AMN = "";
    AppMethodBeat.o(3941);
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
    this(paramContext, paramAttributeSet, 0, WebView.d.ANa);
  }

  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, WebView.d paramd)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    AppMethodBeat.i(3854);
    this.AMQ = WebView.d.ANa;
    this.isX5Kernel = false;
    this.AMU = -1;
    b(paramd);
    AppMethodBeat.o(3854);
  }

  private static boolean a(Context paramContext, WebView.d paramd, c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(3851);
      WebView.d locald = paramd;
      int i;
      if (!a(paramd, paramContext, paramc, paramBoolean2))
      {
        locald = paramd;
        if (paramBoolean1)
        {
          paramd = WebView.d.ANa;
          WebView.d[] arrayOfd = new WebView.d[3];
          arrayOfd[0] = WebView.d.ANb;
          arrayOfd[1] = WebView.d.ANd;
          arrayOfd[2] = WebView.d.ANc;
          i = 0;
          locald = paramd;
          if (i < 3)
          {
            if ((arrayOfd[i] == paramd) || (!a(arrayOfd[i], paramContext, paramc, paramBoolean2)))
              break label152;
            locald = arrayOfd[i];
          }
        }
      }
      AMM = locald;
      if (WebView.d.ANa == locald)
      {
        f.dVj();
        org.xwalk.core.Log.e("xweb.WebView", "_initWebviewCore finally failed type = ".concat(String.valueOf(locald)));
        AppMethodBeat.o(3851);
      }
      for (paramBoolean1 = bool; ; paramBoolean1 = true)
      {
        return paramBoolean1;
        label152: i++;
        break;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>("init webview core type = ");
        XWalkEnvironment.addXWalkInitializeLog(locald + ", sdk:190301,xweb apk ver:" + XWalkEnvironment.getAvailableVersion());
        AppMethodBeat.o(3851);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private static boolean a(WebView.d paramd, Context paramContext, c paramc, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(3852);
    org.xwalk.core.Log.i("xweb.WebView", "try to init webview core = ".concat(String.valueOf(paramd)));
    if ((!paramBoolean) && (com.tencent.xweb.c.c.c(paramd)))
    {
      f.i(paramd);
      AppMethodBeat.o(3852);
      paramBoolean = bool2;
      return paramBoolean;
    }
    com.tencent.xweb.c.c localc = com.tencent.xweb.c.c.b("LOAD_CORE", paramd);
    localc.dUx();
    paramBoolean = bool1;
    while (true)
    {
      try
      {
        k.a locala = k.f(paramd);
        paramBoolean = bool1;
        bool1 = locala.initWebviewCore(paramContext, paramc);
        if (bool1)
        {
          paramBoolean = bool1;
          b.dTR().ALS = locala.getCookieManager();
          paramBoolean = bool1;
          c.ALU = locala.getCookieSyncManager();
          paramBoolean = bool1;
          f.h(paramd);
          paramBoolean = bool1;
          localc.dUy();
          paramBoolean = bool1;
          AppMethodBeat.o(3852);
          break;
        }
        paramBoolean = bool1;
        XWalkEnvironment.addXWalkInitializeLog("xweb.WebView", "init webview failed type = ".concat(String.valueOf(paramd)));
        paramBoolean = bool1;
        continue;
      }
      catch (Exception paramContext)
      {
        XWalkEnvironment.addXWalkInitializeLog("xweb.WebView", "init webview got exception  type = " + paramd + ", err = " + paramContext.getMessage());
      }
      try
      {
        paramc = new java/lang/StringBuilder;
        paramc.<init>("crash stack : ");
        XWalkEnvironment.addXWalkInitializeLog("xweb.WebView", android.util.Log.getStackTraceString(paramContext));
        label232: f.j(paramd);
      }
      catch (Exception paramContext)
      {
        break label232;
      }
    }
  }

  private void b(WebView.d paramd)
  {
    AppMethodBeat.i(3857);
    org.xwalk.core.Log.i("xweb.WebView", "start to init, prefer type = " + getCurWebType() + " , forcetype = " + paramd);
    if (XWalkEnvironment.getApplicationContext() == null)
      XWalkEnvironment.init(getContext());
    if (this.AMQ != WebView.d.ANa)
      AppMethodBeat.o(3857);
    while (true)
    {
      return;
      if (getCurWebType() == WebView.d.ANa)
      {
        b(getContext(), WebView.d.ANd, null);
        org.xwalk.core.Log.e("xweb.Webview", "use xweb without init, force to use sys web");
      }
      if (j.dUB().dUE())
      {
        this.AMQ = WebView.d.ANd;
        XWalkEnvironment.addXWalkInitializeLog("xweb.WebView", "isTestingSys, force to use sys web");
        label122: this.AMO = k.a(this.AMQ, this);
        if (this.AMO == null)
        {
          paramd = new WebView.d[3];
          paramd[0] = WebView.d.ANb;
          paramd[1] = WebView.d.ANd;
          paramd[2] = WebView.d.ANc;
        }
      }
      for (int i = 0; ; i++)
        if (i < 3)
        {
          if ((paramd[i] != this.AMQ) && (b(getContext(), paramd[i], null)))
          {
            this.AMO = k.a(paramd[i], this);
            if (this.AMO != null)
              this.AMQ = getCurWebType();
          }
        }
        else
        {
          if (this.AMO == null)
          {
            a(getContext(), WebView.d.ANd, null, false, true);
            this.AMO = k.a(WebView.d.ANd, this);
            this.AMQ = getCurWebType();
          }
          if (this.AMO != null)
            break label334;
          org.xwalk.core.Log.e("xweb.WebView", "init finally failed type = " + this.AMQ);
          f.dVk();
          AppMethodBeat.o(3857);
          break;
          if (paramd == WebView.d.ANd)
          {
            this.AMQ = paramd;
            break label122;
          }
          this.AMQ = getCurWebType();
          break label122;
        }
      label334: addView(this.AMO.getWebViewUI());
      if (this.AMQ == WebView.d.ANc)
        if (this.AMO.getX5WebViewExtension() != null)
        {
          this.isX5Kernel = true;
          org.xwalk.core.Log.i("xweb.WebView", "this webview instance is using x5-x5kernal");
          label382: if (this.AMO.getCurWebviewClient() != null)
            this.AMO.getCurWebviewClient().AMp = this.AMO.getDefalutOpProvider();
          if (this.AMO.getCurWebChromeClient() != null)
            this.AMO.getCurWebChromeClient().AMp = this.AMO.getDefalutOpProvider();
          this.AMO.getView().setOnLongClickListener(new WebView.2(this));
        }
      try
      {
        this.AMS = ((d)k.f(WebView.d.ANb).excute("STR_CMD_GET_DEBUG_VIEW", new Object[] { this }));
        this.AMS.dUl();
        if (getWebCoreType() == WebView.d.ANb)
        {
          paramd = a.auZ(getCurStrModule());
          i = a.auY(getCurStrModule());
          if ((this.AMO instanceof i))
            ((i)this.AMO).eU(paramd, i);
        }
        paramd = getSettings().getUserAgentString();
        getSettings().setUserAgentString(paramd + " MMWEBID/" + XWalkEnvironment.getGrayValue());
        AppMethodBeat.o(3857);
        continue;
        org.xwalk.core.Log.i("xweb.WebView", "this webview instance is using x5-syskernal ");
        break label382;
        org.xwalk.core.Log.i("xweb.WebView", "this webview instance is using :" + this.AMQ);
      }
      catch (Exception paramd)
      {
        while (true)
        {
          org.xwalk.core.Log.e("xweb.WebView", "create IDebugView failed, use dummy one ");
          this.AMS = new WebView.3(this);
        }
      }
    }
  }

  private static boolean b(Context paramContext, WebView.d paramd, c paramc)
  {
    try
    {
      AppMethodBeat.i(3850);
      boolean bool = a(paramContext, paramd, paramc, true, false);
      AppMethodBeat.o(3850);
      return bool;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  @Deprecated
  public static void disablePlatformNotifications()
  {
    AppMethodBeat.i(3914);
    if (getCurWebType() == WebView.d.ANd)
      com.tencent.xweb.util.e.iJ("android.webkit.WebView", "disablePlatformNotifications");
    AppMethodBeat.o(3914);
  }

  @Deprecated
  public static void enablePlatformNotifications()
  {
    AppMethodBeat.i(3913);
    if (getCurWebType() == WebView.d.ANd)
      com.tencent.xweb.util.e.iJ("android.webkit.WebView", "enablePlatformNotifications");
    AppMethodBeat.o(3913);
  }

  private List<TextureView> fA(View paramView)
  {
    AppMethodBeat.i(3873);
    ArrayList localArrayList = new ArrayList();
    if ((paramView instanceof TextureView))
      localArrayList.add((TextureView)paramView);
    while (true)
    {
      AppMethodBeat.o(3873);
      return localArrayList;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++)
          localArrayList.addAll(fA(paramView.getChildAt(i)));
      }
    }
  }

  public static boolean getCanReboot()
  {
    AppMethodBeat.i(3897);
    boolean bool;
    if (getCurWebType() == WebView.d.ANc)
      if (AMT != null)
      {
        bool = AMT.getCanReboot();
        AppMethodBeat.o(3897);
      }
    while (true)
    {
      return bool;
      org.xwalk.core.Log.e("xweb.WebView", "getCanReboot: sImp is null");
      if (j.dUB().dUF())
      {
        bool = true;
        AppMethodBeat.o(3897);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(3897);
      }
    }
  }

  public static String getCrashExtraMessage(Context paramContext)
  {
    AppMethodBeat.i(3896);
    if (AMT != null)
    {
      paramContext = AMT.getCrashExtraMessage(paramContext);
      AppMethodBeat.o(3896);
    }
    while (true)
    {
      return paramContext;
      org.xwalk.core.Log.e("xweb.WebView", "getCrashExtraMessage: sImp is null");
      paramContext = "";
      AppMethodBeat.o(3896);
    }
  }

  public static String getCurStrModule()
  {
    return AMN;
  }

  public static WebView.d getCurWebType()
  {
    return AMM;
  }

  public static int getInstalledTbsCoreVersion(Context paramContext)
  {
    AppMethodBeat.i(3893);
    int i;
    if (AMT != null)
    {
      i = AMT.getTbsCoreVersion(paramContext);
      AppMethodBeat.o(3893);
    }
    while (true)
    {
      return i;
      org.xwalk.core.Log.e("xweb.WebView", "getTbsCoreVersion: sImp is null");
      i = 0;
      AppMethodBeat.o(3893);
    }
  }

  public static WebView.d getPreferedWebviewType(Context paramContext, WebView.d paramd, String paramString)
  {
    AppMethodBeat.i(3848);
    if (AMM != WebView.d.ANa)
    {
      paramContext = AMM;
      AppMethodBeat.o(3848);
    }
    while (true)
    {
      return paramContext;
      XWalkEnvironment.init(paramContext);
      if (!XWalkEnvironment.isIaDevice())
        break;
      XWalkEnvironment.addXWalkInitializeLog("XWeb.getPreferedWebviewType", "x86 device use WV_KIND_SYS");
      f.nI(69L);
      paramContext = WebView.d.ANd;
      AppMethodBeat.o(3848);
    }
    int i;
    if (m.dTZ().avg(paramString) != WebView.d.ANa)
    {
      i = 1;
      paramd = m.dTZ().avg(paramString);
      XWalkEnvironment.addXWalkInitializeLog("XWeb.getPreferedWebviewType", "use hard code web type = ".concat(String.valueOf(paramd)));
    }
    while (true)
    {
      f.g(paramd);
      paramContext = paramd;
      if (i == 0)
      {
        paramContext = paramd;
        if (paramd == WebView.d.ANb)
        {
          paramContext = paramd;
          if (XWalkEnvironment.getXWebInitArgs("isgpversion", false))
          {
            paramContext = WebView.d.ANd;
            XWalkEnvironment.addXWalkInitializeLog("gp version  , use sys");
          }
        }
      }
      paramd = paramContext;
      if (paramContext == WebView.d.ANb)
      {
        paramd = paramContext;
        if (!XWalkEnvironment.hasAvailableVersion())
        {
          paramd = WebView.d.ANc;
          XWalkEnvironment.addXWalkInitializeLog("xwalk is not available , use x5");
        }
      }
      j.d(paramd);
      paramContext = paramd;
      if (j.dUB().dUG())
      {
        XWalkEnvironment.addXWalkInitializeLog("kind is match loadurlwatchdog switch to syskernal");
        paramContext = WebView.d.ANd;
      }
      AppMethodBeat.o(3848);
      break;
      if (a.auU(paramString) != WebView.d.ANa)
      {
        paramd = a.auU(paramString);
        XWalkEnvironment.addXWalkInitializeLog("XWeb.getPreferedWebviewType", "module " + paramString + "use cmd web type = " + paramd);
      }
      i = 0;
    }
  }

  public static WebView.d getPreferedWebviewType(Context paramContext, String paramString)
  {
    AppMethodBeat.i(3847);
    paramContext = getPreferedWebviewType(paramContext, WebView.d.ANc, paramString);
    AppMethodBeat.o(3847);
    return paramContext;
  }

  @Deprecated
  public static int getTbsCoreVersion(Context paramContext)
  {
    AppMethodBeat.i(3894);
    int i;
    if (AMT != null)
    {
      i = AMT.getTbsCoreVersion(paramContext);
      AppMethodBeat.o(3894);
    }
    while (true)
    {
      return i;
      org.xwalk.core.Log.e("xweb.WebView", "getTbsCoreVersion: sImp is null");
      i = 0;
      AppMethodBeat.o(3894);
    }
  }

  public static int getTbsSDKVersion(Context paramContext)
  {
    AppMethodBeat.i(3895);
    int i;
    if (AMT != null)
    {
      i = AMT.getTbsSDKVersion(paramContext);
      AppMethodBeat.o(3895);
    }
    while (true)
    {
      return i;
      org.xwalk.core.Log.e("xweb.WebView", "getTbsSDKVersion: sImp is null");
      i = 0;
      AppMethodBeat.o(3895);
    }
  }

  public static int getUsingTbsCoreVersion(Context paramContext)
  {
    AppMethodBeat.i(3892);
    int i;
    if (AMM == WebView.d.ANc)
      if (AMT != null)
      {
        i = AMT.getTbsCoreVersion(paramContext);
        AppMethodBeat.o(3892);
      }
    while (true)
    {
      return i;
      org.xwalk.core.Log.e("xweb.WebView", "getTbsCoreVersion: sImp is null");
      i = 0;
      AppMethodBeat.o(3892);
    }
  }

  public static boolean hasInited()
  {
    boolean bool = false;
    AppMethodBeat.i(3853);
    if (getCurWebType() == WebView.d.ANa)
      AppMethodBeat.o(3853);
    while (true)
    {
      return bool;
      if (k.f(getCurWebType()) == null)
      {
        AppMethodBeat.o(3853);
      }
      else
      {
        bool = k.f(getCurWebType()).hasInited();
        AppMethodBeat.o(3853);
      }
    }
  }

  public static void initWebviewCore(Context paramContext, WebView.d paramd, String paramString, c paramc)
  {
    AppMethodBeat.i(3849);
    if (AMM != WebView.d.ANa)
    {
      if (AMM != paramd)
        org.xwalk.core.Log.e("xweb.WebView", "invalid set webview kind to diffrent type");
      AppMethodBeat.o(3849);
    }
    while (true)
    {
      return;
      AMN = paramString;
      f.avn(paramString);
      String str = paramString;
      if (paramString == null)
        str = "";
      XWalkEnvironment.init(paramContext);
      m.jy(paramContext);
      b(paramContext, getPreferedWebviewType(paramContext, paramd, str), paramc);
      AppMethodBeat.o(3849);
    }
  }

  public static boolean isSys()
  {
    AppMethodBeat.i(3939);
    boolean bool;
    if (getCurWebType() == WebView.d.ANd)
    {
      bool = true;
      AppMethodBeat.o(3939);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3939);
    }
  }

  public static boolean isX5()
  {
    AppMethodBeat.i(3938);
    boolean bool;
    if (getCurWebType() == WebView.d.ANc)
    {
      bool = true;
      AppMethodBeat.o(3938);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3938);
    }
  }

  public static boolean isXWalk()
  {
    AppMethodBeat.i(3937);
    boolean bool;
    if (getCurWebType() == WebView.d.ANb)
    {
      bool = true;
      AppMethodBeat.o(3937);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3937);
    }
  }

  public static void setX5Interface(com.tencent.xweb.x5.sdk.c paramc)
  {
    AMT = paramc;
  }

  public void _disablePlatformNotifications()
  {
  }

  public void _enablePlatformNotifications()
  {
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(3912);
    this.AMO.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(3912);
  }

  public boolean canGoBack()
  {
    AppMethodBeat.i(3922);
    boolean bool = this.AMO.canGoBack();
    AppMethodBeat.o(3922);
    return bool;
  }

  public boolean canGoForward()
  {
    AppMethodBeat.i(3933);
    boolean bool = this.AMO.canGoForward();
    AppMethodBeat.o(3933);
    return bool;
  }

  public void clearHistory()
  {
    AppMethodBeat.i(3932);
    this.AMO.clearHistory();
    AppMethodBeat.o(3932);
  }

  public void clearMatches()
  {
    AppMethodBeat.i(3884);
    this.AMO.clearMatches();
    AppMethodBeat.o(3884);
  }

  public void clearSslPreferences()
  {
    AppMethodBeat.i(3899);
    this.AMO.clearSslPreferences();
    AppMethodBeat.o(3899);
  }

  public void clearView()
  {
    AppMethodBeat.i(3924);
    this.AMO.clearView();
    AppMethodBeat.o(3924);
  }

  public void destroy()
  {
    AppMethodBeat.i(3925);
    this.AMO.destroy();
    AppMethodBeat.o(3925);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3856);
    super.dispatchDraw(paramCanvas);
    AppMethodBeat.o(3856);
  }

  public void drawCanvas(Canvas paramCanvas)
  {
    AppMethodBeat.i(3871);
    if (isXWalkKernel())
    {
      paramCanvas.drawBitmap(getBitmap(), 0.0F, 0.0F, null);
      AppMethodBeat.o(3871);
    }
    while (true)
    {
      return;
      draw(paramCanvas);
      AppMethodBeat.o(3871);
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    AppMethodBeat.i(3855);
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    AppMethodBeat.o(3855);
    return bool;
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(3928);
    this.AMO.evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(3928);
  }

  public void findAllAsync(String paramString)
  {
    AppMethodBeat.i(3886);
    this.AMO.findAllAsync(paramString);
    AppMethodBeat.o(3886);
  }

  public void findNext(boolean paramBoolean)
  {
    AppMethodBeat.i(3885);
    this.AMO.findNext(paramBoolean);
    AppMethodBeat.o(3885);
  }

  public String getAbstractInfo()
  {
    AppMethodBeat.i(3888);
    String str = this.AMO.getAbstractInfo();
    AppMethodBeat.o(3888);
    return str;
  }

  public Bitmap getBitmap()
  {
    AppMethodBeat.i(3872);
    Bitmap localBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    Paint localPaint;
    Object localObject1;
    Object localObject2;
    if (localBitmap != null)
    {
      localBitmap.eraseColor(-1);
      Canvas localCanvas = new Canvas(localBitmap);
      if (!isXWalkKernel())
        break label197;
      try
      {
        localPaint = new android/graphics/Paint;
        localPaint.<init>();
        localObject1 = new android/graphics/PorterDuffXfermode;
        ((PorterDuffXfermode)localObject1).<init>(PorterDuff.Mode.SRC_OVER);
        localPaint.setXfermode((Xfermode)localObject1);
        localObject1 = fA(this).iterator();
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label148;
          localObject2 = ((TextureView)((Iterator)localObject1).next()).getBitmap();
          if (localObject2 == null)
            break;
          localCanvas.drawBitmap((Bitmap)localObject2, 0.0F, 0.0F, localPaint);
        }
      }
      catch (Exception localException)
      {
      }
    }
    while (true)
    {
      AppMethodBeat.o(3872);
      return localBitmap;
      org.xwalk.core.Log.e("xweb.WebView", "getBitmap textureViewBitmap = null");
      break;
      label148: localObject1 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
      localObject2 = new android/graphics/Canvas;
      ((Canvas)localObject2).<init>((Bitmap)localObject1);
      getTopView().draw((Canvas)localObject2);
      localException.drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, localPaint);
      continue;
      label197: draw(localException);
    }
  }

  public int getContentHeight()
  {
    AppMethodBeat.i(3901);
    int i = this.AMO.getContentHeight();
    AppMethodBeat.o(3901);
    return i;
  }

  public b.a getCookieManager()
  {
    return null;
  }

  public b.b getCookieSyncManager()
  {
    return null;
  }

  public l getCurWebChromeClient()
  {
    AppMethodBeat.i(3890);
    l locall = this.AMO.getCurWebChromeClient();
    AppMethodBeat.o(3890);
    return locall;
  }

  public s getCurWebviewClient()
  {
    AppMethodBeat.i(3889);
    s locals = this.AMO.getCurWebviewClient();
    AppMethodBeat.o(3889);
    return locals;
  }

  public com.tencent.xweb.c.e getDefalutOpProvider()
  {
    return null;
  }

  public a getFullscreenVideoKind()
  {
    AppMethodBeat.i(3929);
    a locala = this.AMO.getFullscreenVideoKind();
    AppMethodBeat.o(3929);
    return locala;
  }

  public WebView.b getHitTestResult()
  {
    AppMethodBeat.i(3882);
    WebView.b localb = this.AMO.getHitTestResult();
    AppMethodBeat.o(3882);
    return localb;
  }

  public float getScale()
  {
    AppMethodBeat.i(3902);
    float f = this.AMO.getScale();
    AppMethodBeat.o(3902);
    return f;
  }

  public p getSettings()
  {
    AppMethodBeat.i(3915);
    p localp = this.AMO.getSettings();
    AppMethodBeat.o(3915);
    return localp;
  }

  public String getTitle()
  {
    AppMethodBeat.i(3883);
    String str = this.AMO.getTitle();
    AppMethodBeat.o(3883);
    return str;
  }

  public ViewGroup getTopView()
  {
    AppMethodBeat.i(3877);
    ViewGroup localViewGroup = this.AMO.getTopView();
    AppMethodBeat.o(3877);
    return localViewGroup;
  }

  public String getUrl()
  {
    AppMethodBeat.i(3878);
    String str = this.AMO.getUrl();
    AppMethodBeat.o(3878);
    return str;
  }

  public String getVersionInfo()
  {
    AppMethodBeat.i(3887);
    String str = this.AMO.getVersionInfo();
    AppMethodBeat.o(3887);
    return str;
  }

  public View getView()
  {
    AppMethodBeat.i(3876);
    View localView = this.AMO.getView();
    AppMethodBeat.o(3876);
    return localView;
  }

  public int getVisibleTitleHeight()
  {
    AppMethodBeat.i(3906);
    int i = this.AMO.getVisibleTitleHeight();
    AppMethodBeat.o(3906);
    return i;
  }

  public WebView.d getWebCoreType()
  {
    return this.AMQ;
  }

  public int getWebScrollX()
  {
    AppMethodBeat.i(3904);
    int i = this.AMO.getWebScrollX();
    AppMethodBeat.o(3904);
    return i;
  }

  public int getWebScrollY()
  {
    AppMethodBeat.i(3903);
    int i = this.AMO.getWebScrollY();
    AppMethodBeat.o(3903);
    return i;
  }

  public View getWebViewUI()
  {
    AppMethodBeat.i(3916);
    View localView = this.AMO.getWebViewUI();
    AppMethodBeat.o(3916);
    return localView;
  }

  public Object getX5WebViewExtension()
  {
    AppMethodBeat.i(3858);
    Object localObject = this.AMO.getX5WebViewExtension();
    AppMethodBeat.o(3858);
    return localObject;
  }

  public void goBack()
  {
    AppMethodBeat.i(3923);
    this.AMO.goBack();
    AppMethodBeat.o(3923);
  }

  public boolean hasEnteredFullscreen()
  {
    AppMethodBeat.i(3926);
    boolean bool = this.AMO.hasEnteredFullscreen();
    AppMethodBeat.o(3926);
    return bool;
  }

  public boolean isOverScrollStart()
  {
    AppMethodBeat.i(3905);
    boolean bool = this.AMO.isOverScrollStart();
    AppMethodBeat.o(3905);
    return bool;
  }

  public boolean isSupportExtendPluginForAppbrand()
  {
    AppMethodBeat.i(3891);
    boolean bool;
    if (isXWalkKernel())
    {
      bool = this.AMO.isSupportExtendPluginForAppbrand();
      AppMethodBeat.o(3891);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3891);
    }
  }

  public boolean isSysKernel()
  {
    if (this.AMQ == WebView.d.ANd);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isXWalkKernel()
  {
    if (this.AMQ == WebView.d.ANb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void leaveFullscreen()
  {
    AppMethodBeat.i(3927);
    this.AMO.leaveFullscreen();
    AppMethodBeat.o(3927);
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(3900);
    this.AMO.loadData(paramString1, paramString2, paramString3);
    f.avp(paramString1);
    reportLoadByReason();
    AppMethodBeat.o(3900);
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(3908);
    this.AMO.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    f.avp(paramString1);
    AppMethodBeat.o(3908);
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(3921);
    if (this.AMS.avh(paramString))
    {
      this.AMO.loadUrl("http://weixin.qq.com/");
      AppMethodBeat.o(3921);
    }
    while (true)
    {
      return;
      this.AMO.loadUrl(paramString);
      f.avp(paramString);
      reportLoadByReason();
      AppMethodBeat.o(3921);
    }
  }

  @TargetApi(8)
  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(3911);
    if (this.AMS.avh(paramString))
    {
      this.AMO.loadUrl("http://weixin.qq.com/");
      AppMethodBeat.o(3911);
    }
    while (true)
    {
      return;
      this.AMO.loadUrl(paramString, paramMap);
      f.avp(paramString);
      reportLoadByReason();
      AppMethodBeat.o(3911);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(3868);
    this.AMO.onPause();
    AppMethodBeat.o(3868);
  }

  public void onResume()
  {
    AppMethodBeat.i(3867);
    this.AMO.onResume();
    AppMethodBeat.o(3867);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(3870);
    super.onVisibilityChanged(paramView, paramInt);
    if (this.AMO != null)
      this.AMO.getView().setVisibility(paramInt);
    AppMethodBeat.o(3870);
  }

  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public boolean overlayHorizontalScrollbar()
  {
    AppMethodBeat.i(3907);
    boolean bool = this.AMO.overlayHorizontalScrollbar();
    AppMethodBeat.o(3907);
    return bool;
  }

  public void reload()
  {
    AppMethodBeat.i(3898);
    this.AMO.reload();
    AppMethodBeat.o(3898);
  }

  public void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(3879);
    this.AMO.removeJavascriptInterface(paramString);
    AppMethodBeat.o(3879);
  }

  public void reportLoadByReason()
  {
    AppMethodBeat.i(3940);
    f.Sx(this.AMU);
    this.AMU = -1;
    AppMethodBeat.o(3940);
  }

  public boolean savePage(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(3931);
    boolean bool = this.AMO.savePage(paramString1, paramString2, paramInt);
    AppMethodBeat.o(3931);
    return bool;
  }

  public void setA8keyReason(int paramInt)
  {
    this.AMU = paramInt;
  }

  public void setDownloadListener(DownloadListener paramDownloadListener)
  {
    AppMethodBeat.i(3919);
    this.AMO.setDownloadListener(paramDownloadListener);
    AppMethodBeat.o(3919);
  }

  public void setFindListener(WebView.FindListener paramFindListener)
  {
    AppMethodBeat.i(3920);
    this.AMO.setFindListener(paramFindListener);
    AppMethodBeat.o(3920);
  }

  public void setFocusable(boolean paramBoolean)
  {
    AppMethodBeat.i(3874);
    if (!paramBoolean)
    {
      setDescendantFocusability(393216);
      super.setFocusable(false);
      AppMethodBeat.o(3874);
    }
    while (true)
    {
      return;
      setDescendantFocusability(131072);
      super.setFocusable(false);
      AppMethodBeat.o(3874);
    }
  }

  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    AppMethodBeat.i(3875);
    if (!paramBoolean)
    {
      setDescendantFocusability(393216);
      super.setFocusableInTouchMode(false);
      AppMethodBeat.o(3875);
    }
    while (true)
    {
      return;
      setDescendantFocusability(131072);
      super.setFocusableInTouchMode(false);
      AppMethodBeat.o(3875);
    }
  }

  public void setHorizontalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(3936);
    this.AMO.setHorizontalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(3936);
  }

  public void setJSExceptionListener(t paramt)
  {
    AppMethodBeat.i(3930);
    this.AMO.setJSExceptionListener(paramt);
    AppMethodBeat.o(3930);
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.zMt = paramOnLongClickListener;
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(3869);
    this.AMO.getWebViewUI().setOnTouchListener(paramOnTouchListener);
    AppMethodBeat.o(3869);
  }

  public void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(3935);
    this.AMO.setVerticalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(3935);
  }

  public void setWebChromeClient(l paraml)
  {
    AppMethodBeat.i(3918);
    if (paraml != null)
      paraml.AMp = this.AMO.getDefalutOpProvider();
    this.AMO.setWebChromeClient(paraml);
    AppMethodBeat.o(3918);
  }

  public void setWebViewCallbackClient(r paramr)
  {
    AppMethodBeat.i(3881);
    this.AMO.setWebViewCallbackClient(paramr);
    AppMethodBeat.o(3881);
  }

  public void setWebViewClient(s params)
  {
    AppMethodBeat.i(3917);
    if (params != null)
      params.AMp = this.AMO.getDefalutOpProvider();
    this.AMO.setWebViewClient(params);
    AppMethodBeat.o(3917);
  }

  public void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    AppMethodBeat.i(3859);
    this.AMO.setWebViewClientExtension(paramb);
    AppMethodBeat.o(3859);
  }

  public void stopLoading()
  {
    AppMethodBeat.i(3880);
    this.AMO.stopLoading();
    AppMethodBeat.o(3880);
  }

  public void super_computeScroll()
  {
    AppMethodBeat.i(3864);
    this.AMO.super_computeScroll();
    AppMethodBeat.o(3864);
  }

  public boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3863);
    boolean bool = this.AMO.super_dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(3863);
    return bool;
  }

  public boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3861);
    boolean bool = this.AMO.super_onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(3861);
    return bool;
  }

  public void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(3862);
    this.AMO.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(3862);
  }

  public void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(3865);
    this.AMO.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(3865);
  }

  public boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3860);
    boolean bool = this.AMO.super_onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(3860);
    return bool;
  }

  public boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(3866);
    paramBoolean = this.AMO.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(3866);
    return paramBoolean;
  }

  public boolean supportFeature(int paramInt)
  {
    AppMethodBeat.i(3934);
    boolean bool = this.AMO.supportFeature(paramInt);
    AppMethodBeat.o(3934);
    return bool;
  }

  public boolean zoomIn()
  {
    AppMethodBeat.i(3910);
    boolean bool = this.AMO.zoomIn();
    AppMethodBeat.o(3910);
    return bool;
  }

  public boolean zoomOut()
  {
    AppMethodBeat.i(3909);
    boolean bool = this.AMO.zoomOut();
    AppMethodBeat.o(3909);
    return bool;
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(3843);
      AMW = new a("NOT_HOOK", 0);
      AMX = new a("HOOK_NOT_EVALUTE_JS", 1);
      AMY = new a("HOOK_EVALUTE_JS", 2);
      AMZ = new a[] { AMW, AMX, AMY };
      AppMethodBeat.o(3843);
    }
  }

  public static abstract interface c
  {
    public abstract void BH();

    public abstract void onCoreInitFinished();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.WebView
 * JD-Core Version:    0.6.2
 */