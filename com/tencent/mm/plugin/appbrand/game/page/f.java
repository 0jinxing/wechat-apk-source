package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.luggage.g.h;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.MBCanvasHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.game.d.d.1;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.AppBrandActionHeaderLayout;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.am;
import com.tencent.mm.plugin.appbrand.page.b.c.b;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.Collections;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
public final class f extends w
{
  private boolean apg;
  WAGamePageViewContainerLayout hsL;
  public com.tencent.magicbrush.b hsM;
  private ImageView hsN;
  private Bitmap hsO;
  private boolean hsP;
  private boolean hsQ;
  private ac hsR;
  private b hsS;
  private Bitmap hsT;
  private final Object hsU;
  private String hsV;
  private String mUrl;

  static
  {
    AppMethodBeat.i(130274);
    if (!f.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(130274);
      return;
    }
  }

  f(Context paramContext, i parami)
  {
    AppMethodBeat.i(130247);
    this.apg = true;
    this.hsP = false;
    this.hsQ = false;
    this.hsT = null;
    this.hsU = new Object();
    long l = bo.yz();
    this.irO = parami.asV().getDecorWidgetFactory();
    super.a(paramContext, parami);
    ab.i("AppBrandGame.WAGamePageView", "[damonlei] WAGamePageView cost [%d]ms", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(130247);
  }

  private void aAZ()
  {
    AppMethodBeat.i(130250);
    if (!com.tencent.mm.sdk.platformtools.al.isMainThread())
    {
      com.tencent.mm.sdk.platformtools.al.d(new f.2(this));
      AppMethodBeat.o(130250);
    }
    while (true)
    {
      return;
      this.hsM = new com.tencent.magicbrush.b(this.mContext);
      this.hsM.setMBRuntime(((com.tencent.mm.plugin.appbrand.game.b)atK()).getMBRuntime());
      this.hsM.registerEventListener(new f.a(this, (byte)0));
      this.hsM.setId(2131820556);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      this.hsL.addView(this.hsM, 0, localLayoutParams);
      AppMethodBeat.o(130250);
    }
  }

  private void aBe()
  {
    AppMethodBeat.i(130260);
    synchronized (this.hsU)
    {
      if ((this.hsT != null) && (!this.hsT.isRecycled()))
      {
        ab.i("AppBrandGame.WAGamePageView", "hy: recycling captured screen");
        this.hsT.recycle();
        this.hsT = null;
      }
      AppMethodBeat.o(130260);
      return;
    }
  }

  private void aBn()
  {
    AppMethodBeat.i(130265);
    if (this.hsP)
    {
      this.hsP = false;
      this.hsN.setVisibility(8);
      if (this.hsO != null)
      {
        this.hsO.recycle();
        this.hsO = null;
      }
    }
    AppMethodBeat.o(130265);
  }

  private Bitmap aBp()
  {
    Object localObject = null;
    AppMethodBeat.i(130268);
    if (this.hsM == null)
    {
      ab.e("AppBrandGame.WAGamePageView", "captureScreen, view == null");
      AppMethodBeat.o(130268);
    }
    while (true)
    {
      return localObject;
      if ((!$assertionsDisabled) && (this.hsM.getMBRuntime() == null))
      {
        localObject = new AssertionError();
        AppMethodBeat.o(130268);
        throw ((Throwable)localObject);
      }
      localObject = this.hsM.getMBRuntime().getCanvasHandler().a(null, true);
      AppMethodBeat.o(130268);
    }
  }

  @SuppressLint({"MissingSuperCall"})
  public final boolean AA(String paramString)
  {
    AppMethodBeat.i(130254);
    this.ito.DB(paramString);
    this.mUrl = paramString;
    this.hsV = h.bO(paramString);
    ab.i("AppBrandGame.WAGamePageView", "loadURL url : ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(130254);
    return true;
  }

  public final void AB(String paramString)
  {
  }

  public final void AC(String paramString)
  {
    AppMethodBeat.i(130261);
    runOnUiThread(new f.3(this, paramString));
    AppMethodBeat.o(130261);
  }

  public final <T> T a(int paramInt, Bundle paramBundle, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    AppMethodBeat.i(130264);
    switch (paramInt)
    {
    default:
      ab.w("AppBrandGame.WAGamePageView", "hy: not support this command!! %d", new Object[] { Integer.valueOf(paramInt) });
      paramBundle = super.a(paramInt, paramBundle, paramArrayOfObject);
      AppMethodBeat.o(130264);
    case 1:
      while (true)
      {
        return paramBundle;
        AppMethodBeat.o(130264);
        paramBundle = null;
      }
    case 2:
    }
    if (paramBundle != null)
      bool = paramBundle.getBoolean("needPortraitSnapshot", false);
    if (this.hsO != null)
    {
      this.hsO.recycle();
      this.hsO = null;
    }
    if (this.hsN == null)
      this.hsN = new ImageView(this.mContext);
    paramBundle = com.tencent.mm.plugin.appbrand.config.a.a.t(getRuntime().atM()).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
    if ((a.b.hiM == paramBundle) || (a.b.hiN == paramBundle) || (a.b.hiO == paramBundle) || (a.b.hiP == paramBundle))
    {
      this.hsO = aBp();
      this.hsL.setOnConfigurationChangedListener(new f.5(this));
    }
    while (true)
    {
      AppMethodBeat.o(130264);
      paramBundle = null;
      break;
      if (bool)
      {
        this.hsO = aBp();
        if (this.hsO == null)
        {
          ab.e("AppBrandGame.WAGamePageView", "hy: screenshot is null");
        }
        else
        {
          com.tencent.mm.sdk.platformtools.al.d(new f.6(this));
          this.hsP = true;
          ab.i("AppBrandGame.WAGamePageView", "hy: vertical game. isRedpackge isPortrait screenshot");
        }
      }
      else
      {
        ab.i("AppBrandGame.WAGamePageView", "hy: vertical game. not need screenshot");
      }
    }
  }

  public final void a(ah paramah)
  {
    AppMethodBeat.i(130253);
    ab.e("AppBrandGame.WAGamePageView", "dispatch not support");
    AppMethodBeat.o(130253);
  }

  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(130255);
    getRuntime().atK().h(paramString1, paramString2, hashCode());
    AppMethodBeat.o(130255);
  }

  public final com.tencent.mm.plugin.appbrand.page.al aAX()
  {
    return this.hsS;
  }

  public final ViewGroup aAY()
  {
    return this.hsS;
  }

  public final void aBa()
  {
    AppMethodBeat.i(130256);
    this.ito.aLj();
    AppMethodBeat.o(130256);
  }

  public final void aBb()
  {
    AppMethodBeat.i(130257);
    ab.i("AppBrandGame.WAGamePageView", "hy: on perform foreground");
    this.ito.wU();
    if (this.isF != null)
      this.isF.setActuallyVisible(true);
    aBe();
    this.hsM.bSv.resume();
    this.isT.aAS();
    aBn();
    AppMethodBeat.o(130257);
  }

  public final void aBc()
  {
    AppMethodBeat.i(130258);
    ab.i("AppBrandGame.WAGamePageView", "hy: on perform background");
    this.ito.wW();
    if (this.isF != null)
      this.isF.setActuallyVisible(false);
    this.hsM.bSv.pause();
    if (this.itm != null)
      this.itm.dismiss();
    AppMethodBeat.o(130258);
  }

  public final void aBd()
  {
    AppMethodBeat.i(130259);
    super.aBd();
    ab.i("AppBrandGame.WAGamePageView", "performPageDestroy");
    aBe();
    com.tencent.mm.plugin.appbrand.game.d.d.release();
    AppMethodBeat.o(130259);
  }

  public final ac aBf()
  {
    return this.hsR;
  }

  public final String aBg()
  {
    return null;
  }

  public final void aBh()
  {
  }

  public final void aBi()
  {
  }

  public final void aBj()
  {
    AppMethodBeat.i(130262);
    runOnUiThread(new f.4(this));
    AppMethodBeat.o(130262);
  }

  public final FrameLayout aBk()
  {
    return this.hsL;
  }

  public final View aBl()
  {
    AppMethodBeat.i(130263);
    AppBrandActionHeaderLayout localAppBrandActionHeaderLayout = new AppBrandActionHeaderLayout(this.mContext);
    localAppBrandActionHeaderLayout.setAppId(getAppId());
    localAppBrandActionHeaderLayout.setActionHeaderStyle(this.isO);
    ab.w("AppBrandGame.WAGamePageView", "getActionSheetHeader orientation:%d, mActionSheetTitle:%s", new Object[] { Integer.valueOf(((MMActivity)this.mContext).getRequestedOrientation()), this.isP });
    if (aJQ())
    {
      if (!TextUtils.isEmpty(this.isP))
        localAppBrandActionHeaderLayout.setStatusDescription(this.isP);
      localAppBrandActionHeaderLayout.cI(getRuntime().atI().iconUrl, getRuntime().atI().cwz);
      AppMethodBeat.o(130263);
    }
    while (true)
    {
      return localAppBrandActionHeaderLayout;
      if (!TextUtils.isEmpty(this.isP))
      {
        localAppBrandActionHeaderLayout.setStatusDescription(this.isP);
        AppMethodBeat.o(130263);
      }
      else
      {
        localAppBrandActionHeaderLayout = null;
        AppMethodBeat.o(130263);
      }
    }
  }

  public final String aBm()
  {
    return this.mUrl;
  }

  public final Bitmap aBo()
  {
    AppMethodBeat.i(130267);
    ab.i("AppBrandGame.WAGamePageView", "hy: jsapi enter wait");
    synchronized (this.hsU)
    {
      ab.i("AppBrandGame.WAGamePageView", "hy: jsapi enter");
      if ((this.hsT != null) && (!this.hsT.isRecycled()))
      {
        localBitmap = this.hsT;
        AppMethodBeat.o(130267);
        return localBitmap;
      }
      ab.e("AppBrandGame.WAGamePageView", "hy: already background and not triggered by transmit. abort");
      Bitmap localBitmap = null;
      AppMethodBeat.o(130267);
    }
  }

  public final com.tencent.mm.plugin.appbrand.page.b.c aBq()
  {
    AppMethodBeat.i(130270);
    com.tencent.mm.plugin.appbrand.game.page.a.a locala = new com.tencent.mm.plugin.appbrand.game.page.a.a(this);
    AppMethodBeat.o(130270);
    return locala;
  }

  public final Map<String, m> aub()
  {
    AppMethodBeat.i(130251);
    Map localMap = Collections.emptyMap();
    AppMethodBeat.o(130251);
    return localMap;
  }

  public final void bV(String paramString1, String paramString2)
  {
  }

  public final aj cF(Context paramContext)
  {
    AppMethodBeat.i(130271);
    paramContext = new a();
    AppMethodBeat.o(130271);
    return paramContext;
  }

  public final am cG(Context paramContext)
  {
    return am.iuX;
  }

  public final void dN(boolean paramBoolean)
  {
  }

  public final void dO(boolean paramBoolean)
  {
  }

  public final boolean g(Canvas paramCanvas)
  {
    return true;
  }

  public final View getContentView()
  {
    return this.hsL;
  }

  public final String getURL()
  {
    return this.hsV;
  }

  public final void h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(130252);
    ab.e("AppBrandGame.WAGamePageView", "dispatch not support");
    AppMethodBeat.o(130252);
  }

  public final void initActionBar()
  {
    AppMethodBeat.i(130249);
    super.initActionBar();
    getActionBar().setFullscreenMode(true);
    AppMethodBeat.o(130249);
  }

  public final void initView()
  {
    AppMethodBeat.i(130248);
    ab.i("AppBrandGame.WAGamePageView", "new Rendder GameView");
    initActionBar();
    this.hsL = new WAGamePageViewContainerLayout(this.mContext);
    aAZ();
    this.hsS = new b(this.mContext);
    this.hsL.addView(this.hsS, new FrameLayout.LayoutParams(-1, -1));
    this.hsR = new c(this.hsS);
    this.hsR.setFullscreenImpl(aJy());
    this.hsR.a(new f.1(this));
    Object localObject1 = new FrameLayout.LayoutParams(-2, -2);
    ((FrameLayout.LayoutParams)localObject1).gravity = 8388661;
    ((FrameLayout.LayoutParams)localObject1).rightMargin = com.tencent.mm.bz.a.am(this.mContext, 2131428004);
    ((FrameLayout.LayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.am(this.mContext, 2131428005);
    this.hsL.addView(this.isF, (ViewGroup.LayoutParams)localObject1);
    if ((com.tencent.mm.sdk.platformtools.f.DEBUG) || (getRuntime().atH().bQp));
    boolean bool;
    Object localObject3;
    for (int i = 1; ; i = 0)
    {
      bool = getRuntime().atH().bQp;
      if ((i == 0) && (!bool))
        break label560;
      localObject1 = com.tencent.mm.plugin.appbrand.game.d.d.aAI();
      localObject3 = ((com.tencent.mm.plugin.appbrand.game.b)atK()).getMBRuntime();
      ??? = this.hsL;
      ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).bSv = ((MBRuntime)localObject3);
      if (Looper.myLooper() == Looper.getMainLooper())
        break;
      localObject1 = new IllegalStateException("You can only init GameInspector in main thread.");
      AppMethodBeat.o(130248);
      throw ((Throwable)localObject1);
    }
    if (((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mState == 0)
    {
      ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mContext = ((FrameLayout)???).getContext();
      if (i != 0)
      {
        localObject3 = ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).bSv;
        ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrH = new com.tencent.mm.plugin.appbrand.game.d.c(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mContext, (MBRuntime)localObject3);
        ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrH.setBackground(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mContext.getResources().getDrawable(2130837737));
      }
      if (bool)
        ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI = new com.tencent.mm.plugin.appbrand.game.d.b(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).bSv, ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mContext);
      ((FrameLayout)???).setClipChildren(false);
      float f = ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mContext.getResources().getDisplayMetrics().density;
      if (((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI != null)
      {
        localObject3 = new FrameLayout.LayoutParams(-1, -1);
        ((FrameLayout)???).addView(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI, (ViewGroup.LayoutParams)localObject3);
        localObject3 = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams)localObject3).gravity = 8388693;
        ((FrameLayout.LayoutParams)localObject3).bottomMargin = ((int)(25.0F * f));
        i = (int)(f * 15.0F);
        ((FrameLayout.LayoutParams)localObject3).rightMargin = i;
        ((FrameLayout.LayoutParams)localObject3).leftMargin = i;
        ((FrameLayout)???).addView(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI.hrB, (ViewGroup.LayoutParams)localObject3);
      }
      if (((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrH != null)
      {
        localObject3 = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout)???).addView(((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrH, (ViewGroup.LayoutParams)localObject3);
      }
    }
    synchronized (((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrK)
    {
      ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).mState = 1;
      if ((bool) && (((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI != null))
      {
        com.tencent.mm.plugin.appbrand.game.d.b localb = ((com.tencent.mm.plugin.appbrand.game.d.d)localObject1).hrI;
        localObject3 = new com/tencent/mm/plugin/appbrand/game/d/d$1;
        ((d.1)localObject3).<init>((com.tencent.mm.plugin.appbrand.game.d.d)localObject1);
        localb.post((Runnable)localObject3);
      }
      label560: this.hsN = new ImageView(this.mContext);
      this.hsL.addView(this.hsN, new FrameLayout.LayoutParams(-1, -1));
      AppMethodBeat.o(130248);
      return;
    }
  }

  public final boolean isFullScreen()
  {
    AppMethodBeat.i(130269);
    boolean bool;
    if (this.isT.aBt() == c.b.ivv)
    {
      bool = true;
      AppMethodBeat.o(130269);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(130269);
    }
  }

  public final void nV(int paramInt)
  {
  }

  public final void nW(int paramInt)
  {
  }

  public final boolean wY()
  {
    return false;
  }

  @SuppressLint({"MissingSuperCall"})
  public final void xN()
  {
  }

  public final com.tencent.mm.vending.g.c<Bitmap> xR()
  {
    AppMethodBeat.i(130266);
    com.tencent.mm.ci.f localf = com.tencent.mm.ci.g.da(null);
    AppMethodBeat.o(130266);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f
 * JD-Core Version:    0.6.2
 */