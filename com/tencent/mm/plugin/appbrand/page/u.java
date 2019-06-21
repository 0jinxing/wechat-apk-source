package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.f.a;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.b.c.a;
import com.tencent.mm.plugin.appbrand.widget.input.ad;
import com.tencent.mm.plugin.appbrand.widget.input.u.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
public class u extends b
  implements com.tencent.mm.plugin.appbrand.jsapi.e, ar
{
  protected static final int isC = 2131820549;
  private volatile boolean apg;
  private volatile boolean fCY;
  public volatile boolean gPH;
  private volatile i gPI;
  private String hsV;
  private com.tencent.mm.plugin.appbrand.widget.input.u ico;
  private final u.c icp;
  private final ConcurrentLinkedQueue<Runnable> ies;
  private String ikx;
  protected List<com.tencent.mm.plugin.appbrand.menu.n> irD;
  protected ap irO;
  private FrameLayout irj;
  protected int isD;
  private RelativeLayout isE;
  protected com.tencent.mm.plugin.appbrand.widget.actionbar.d isF;
  protected com.tencent.mm.plugin.appbrand.widget.actionbar.b isG;
  private ac isH;
  private al isI;
  protected aj isJ;
  public y isK;
  private volatile boolean isL;
  private volatile boolean isM;
  private boolean isN;
  public boolean isO;
  protected CharSequence isP;
  public String isQ;
  private c isR;
  public final com.tencent.mm.plugin.appbrand.widget.f.b isS;
  public com.tencent.mm.plugin.appbrand.page.b.c isT;
  am isU;
  private ViewTreeObserver.OnGlobalLayoutListener isV;
  private n isW;
  ab isX;
  private boolean isY;
  public Context mContext;

  public u()
  {
    AppMethodBeat.i(87198);
    this.isD = 2131820548;
    this.isL = false;
    this.isM = false;
    this.apg = false;
    this.gPH = false;
    this.fCY = false;
    this.isN = false;
    this.isO = false;
    this.isP = null;
    this.isQ = null;
    this.isS = new com.tencent.mm.plugin.appbrand.widget.f.b(this);
    this.ico = null;
    this.icp = new u.1(this);
    this.irO = null;
    this.isY = false;
    this.ies = new ConcurrentLinkedQueue();
    this.isX = new ab(this);
    AppMethodBeat.o(87198);
  }

  private String Df(String paramString)
  {
    AppMethodBeat.i(87252);
    paramString = getAppId() + ":" + getURL() + ":" + paramString;
    AppMethodBeat.o(87252);
    return paramString;
  }

  private void L(Runnable paramRunnable)
  {
    AppMethodBeat.i(87266);
    synchronized (this.ies)
    {
      if (this.isM)
      {
        paramRunnable.run();
        AppMethodBeat.o(87266);
        return;
      }
      this.ies.offer(paramRunnable);
      AppMethodBeat.o(87266);
    }
  }

  private void aJL()
  {
    AppMethodBeat.i(87258);
    Object localObject = bo.bc(this.isQ, "portrait");
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    default:
    case 3005871:
    case 1430647483:
    case 729267099:
    case -2022952606:
    }
    while (true)
      switch (i)
      {
      default:
        localObject = String.format(Locale.US, "resetPageOrientation get invalid value, appId[%s], url[%s], orientation[%s]", new Object[] { getAppId(), getURL(), this.isQ });
        if (!this.gNV)
          break label307;
        localObject = new IllegalArgumentException((String)localObject);
        AppMethodBeat.o(87258);
        throw ((Throwable)localObject);
        if (((String)localObject).equals("auto"))
        {
          i = 0;
          continue;
          if (((String)localObject).equals("landscape"))
          {
            i = 1;
            continue;
            if (((String)localObject).equals("portrait"))
            {
              i = 2;
              continue;
              if (((String)localObject).equals("landscapeLeft"))
                i = 3;
            }
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).a(a.b.hiL, null);
    AppMethodBeat.o(87258);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).a(a.b.hiN, null);
      AppMethodBeat.o(87258);
      continue;
      com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).a(a.b.hiK, null);
      AppMethodBeat.o(87258);
      continue;
      com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).a(a.b.hiO, null);
      AppMethodBeat.o(87258);
      continue;
      label307: com.tencent.luggage.g.d.e("MicroMsg.AppBrandPageView", (String)localObject);
      AppMethodBeat.o(87258);
    }
  }

  private void aJN()
  {
    AppMethodBeat.i(87264);
    aJO();
    L(new u.27(this));
    AppMethodBeat.o(87264);
  }

  private void aJO()
  {
    AppMethodBeat.i(87265);
    if (this.isL)
      AppMethodBeat.o(87265);
    while (true)
    {
      return;
      this.isL = true;
      String str = aJP();
      if (!TextUtils.isEmpty(str))
        this.isJ.bU(aJB(), str);
      AppMethodBeat.o(87265);
    }
  }

  private void aJu()
  {
    AppMethodBeat.i(138233);
    if (this.isH == null)
    {
      com.tencent.luggage.g.d.e("MicroMsg.AppBrandPageView", "mCustomViewContainer is null, err, return");
      AppMethodBeat.o(138233);
    }
    while (true)
    {
      return;
      this.isH.a(new u.12(this));
      AppMethodBeat.o(138233);
    }
  }

  private void ex(boolean paramBoolean)
  {
    AppMethodBeat.i(87242);
    this.isY = paramBoolean;
    ViewGroup.LayoutParams localLayoutParams1 = this.isF.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams2 = this.irj.getLayoutParams();
    if ((!(localLayoutParams1 instanceof RelativeLayout.LayoutParams)) || (!(localLayoutParams2 instanceof RelativeLayout.LayoutParams)))
    {
      AppMethodBeat.o(87242);
      return;
    }
    ((RelativeLayout.LayoutParams)localLayoutParams1).addRule(10);
    if (paramBoolean)
      ((RelativeLayout.LayoutParams)localLayoutParams2).removeRule(3);
    while (true)
    {
      this.isE.requestLayout();
      this.isG.setFullscreenMode(this.isY);
      AppMethodBeat.o(87242);
      break;
      ((RelativeLayout.LayoutParams)localLayoutParams2).addRule(3, isC);
    }
  }

  public boolean AA(String paramString)
  {
    AppMethodBeat.i(87215);
    this.hsV = h.bO(paramString);
    this.ikx = paramString;
    aJC();
    boolean bool;
    if (!aw.b(this.gPI, this.hsV))
    {
      bN(paramString);
      onReady();
      bool = false;
      AppMethodBeat.o(87215);
    }
    while (true)
    {
      return bool;
      L(new u.3(this, paramString));
      bool = true;
      AppMethodBeat.o(87215);
    }
  }

  public void AB(String paramString)
  {
    AppMethodBeat.i(87237);
    runOnUiThread(new u.10(this, paramString));
    AppMethodBeat.o(87237);
  }

  public void AC(String paramString)
  {
    AppMethodBeat.i(87251);
    runOnUiThread(new u.22(this, paramString));
    AppMethodBeat.o(87251);
  }

  protected void De(String paramString)
  {
  }

  public final void Dg(String paramString)
  {
    AppMethodBeat.i(87256);
    com.tencent.luggage.g.d.i("MicroMsg.AppBrandPageView", "updatePageOrientation appId[%s], url[%s], orientation[%s]", new Object[] { getAppId(), getURL(), paramString });
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(87256);
    while (true)
    {
      return;
      runOnUiThread(new u.24(this, paramString));
      AppMethodBeat.o(87256);
    }
  }

  public final void Dh(String paramString)
  {
    AppMethodBeat.i(87260);
    if (paramString.equalsIgnoreCase("dark"))
    {
      this.isO = true;
      AppMethodBeat.o(87260);
    }
    while (true)
    {
      return;
      this.isO = false;
      AppMethodBeat.o(87260);
    }
  }

  public final void Dw()
  {
    AppMethodBeat.i(87200);
    aCd();
    this.gPH = true;
    aJO();
    L(new u.26(this));
    AppMethodBeat.o(87200);
  }

  public final void H(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(87248);
    Iterator localIterator = this.irD.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.appbrand.menu.n localn = (com.tencent.mm.plugin.appbrand.menu.n)localIterator.next();
      if ((localn != null) && (localn.id == paramInt))
      {
        localn.imK = paramBoolean;
        AppMethodBeat.o(87248);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(87248);
    }
  }

  public <T> T a(int paramInt, Bundle paramBundle, Object[] paramArrayOfObject)
  {
    return null;
  }

  public void a(Context paramContext, i parami)
  {
    AppMethodBeat.i(87199);
    this.mContext = paramContext;
    this.gPI = parami;
    this.apg = true;
    this.irD = aJx();
    e(parami.gNI);
    super.init();
    initView();
    aJN();
    this.isU = cG(this.mContext);
    this.isT = aBq();
    AppMethodBeat.o(87199);
  }

  public void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(87217);
    if (this.gPI == null)
    {
      com.tencent.luggage.g.d.i("MicroMsg.AppBrandPageView", "publish runtime is null, event %s", new Object[] { paramString1 });
      AppMethodBeat.o(87217);
    }
    while (true)
    {
      return;
      this.gPI.xT().h(paramString1, paramString2, hashCode());
      AppMethodBeat.o(87217);
    }
  }

  public al aAX()
  {
    return this.isI;
  }

  public ViewGroup aAY()
  {
    AppMethodBeat.i(87205);
    ViewGroup localViewGroup = this.isI.getContainer();
    AppMethodBeat.o(87205);
    return localViewGroup;
  }

  protected void aBa()
  {
    AppMethodBeat.i(87225);
    getContentView().invalidate();
    AppMethodBeat.o(87225);
  }

  protected void aBb()
  {
    AppMethodBeat.i(87227);
    this.isJ.wU();
    aJH();
    aJL();
    this.isT.aAS();
    this.isU.aAS();
    if (this.isG.aOI())
    {
      a.b(this);
      this.isG.getCapsuleBar().resume();
    }
    xP();
    this.isJ.setTitle(Df("VISIBLE"));
    if (getContentView() != null)
    {
      this.ico = com.tencent.mm.plugin.appbrand.widget.input.n.cI(getContentView());
      if (this.ico != null)
        this.ico.a(this.icp);
    }
    AppMethodBeat.o(87227);
  }

  protected void aBc()
  {
    AppMethodBeat.i(87229);
    this.isJ.wW();
    this.isJ.setTitle(Df("INVISIBLE"));
    this.isR.aIZ();
    this.isF.setActuallyVisible(false);
    this.isU.aAT();
    this.isG.getCapsuleBar().pause();
    if (this.ico != null)
      this.ico.b(this.icp);
    AppMethodBeat.o(87229);
  }

  protected void aBd()
  {
    AppMethodBeat.i(87232);
    this.apg = false;
    if (this.irj != null)
    {
      ViewTreeObserver localViewTreeObserver = this.irj.getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeOnGlobalLayoutListener(this.isV);
    }
    AppMethodBeat.o(87232);
  }

  public ac aBf()
  {
    return this.isH;
  }

  public String aBg()
  {
    AppMethodBeat.i(87238);
    Object localObject = this.isG.getMainTitle();
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      AppMethodBeat.o(87238);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(87238);
    }
  }

  public void aBh()
  {
    AppMethodBeat.i(87243);
    runOnUiThread(new u.16(this));
    AppMethodBeat.o(87243);
  }

  public void aBi()
  {
    AppMethodBeat.i(87244);
    runOnUiThread(new u.17(this));
    AppMethodBeat.o(87244);
  }

  public void aBj()
  {
    AppMethodBeat.i(87250);
    runOnUiThread(new u.21(this));
    AppMethodBeat.o(87250);
  }

  public FrameLayout aBk()
  {
    return this.irj;
  }

  public View aBl()
  {
    View localView = null;
    AppMethodBeat.i(87261);
    if (!TextUtils.isEmpty(this.isP))
    {
      localView = LayoutInflater.from(this.mContext).inflate(2130968759, null);
      ((TextView)localView.findViewById(2131821470)).setText(this.isP);
      AppMethodBeat.o(87261);
    }
    while (true)
    {
      return localView;
      AppMethodBeat.o(87261);
    }
  }

  public String aBm()
  {
    return this.ikx;
  }

  public Bitmap aBo()
  {
    AppMethodBeat.i(87269);
    Bitmap localBitmap = as.cq(this.isJ.getWrapperView());
    if (localBitmap != null)
      as.a(aAY(), new Canvas(localBitmap));
    AppMethodBeat.o(87269);
    return localBitmap;
  }

  protected com.tencent.mm.plugin.appbrand.page.b.c aBq()
  {
    AppMethodBeat.i(87201);
    com.tencent.mm.plugin.appbrand.page.b.c localc = c.a.r(this);
    AppMethodBeat.o(87201);
    return localc;
  }

  public String aJA()
  {
    return "https://servicewechat.com/";
  }

  protected final String aJB()
  {
    AppMethodBeat.i(87213);
    String str1 = aJA();
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    str2 = str2 + "page-frame.html";
    AppMethodBeat.o(87213);
    return str2;
  }

  protected void aJC()
  {
    AppMethodBeat.i(87216);
    a.d locald = getPageConfig();
    AB(locald.hfs);
    u(locald.hfu);
    nV(com.tencent.mm.plugin.appbrand.r.g.Ee(locald.hfw));
    runOnUiThread(new u.11(this, locald.hft));
    ex(locald.ayx());
    dO(locald.hfA);
    bV(locald.hfC, locald.hfo);
    this.isQ = locald.hfD;
    AppMethodBeat.o(87216);
  }

  public final void aJD()
  {
    AppMethodBeat.i(87223);
    this.isF.setActuallyVisible(true);
    AppMethodBeat.o(87223);
  }

  public final void aJE()
  {
    AppMethodBeat.i(87233);
    runOnUiThread(new u.6(this));
    AppMethodBeat.o(87233);
  }

  public final void aJF()
  {
    AppMethodBeat.i(87234);
    runOnUiThread(new u.7(this));
    AppMethodBeat.o(87234);
  }

  protected final void aJG()
  {
    AppMethodBeat.i(87246);
    runOnUiThread(new u.19(this));
    AppMethodBeat.o(87246);
  }

  protected void aJH()
  {
    AppMethodBeat.i(87253);
    aJI();
    AppMethodBeat.o(87253);
  }

  protected final void aJI()
  {
    AppMethodBeat.i(87254);
    this.isG.setNavHidden(false);
    this.isG.setNavBackOrClose(true);
    AppMethodBeat.o(87254);
  }

  protected final void aJJ()
  {
    AppMethodBeat.i(87255);
    if (this.gPI.asV().getPageCount() == 1)
    {
      this.isG.setNavHidden(true);
      AppMethodBeat.o(87255);
    }
    while (true)
    {
      return;
      this.isG.setNavHidden(false);
      this.isG.setNavBackOrClose(true);
      AppMethodBeat.o(87255);
    }
  }

  protected boolean aJK()
  {
    AppMethodBeat.i(87257);
    boolean bool;
    if (!(this.mContext instanceof Activity))
    {
      AppMethodBeat.o(87257);
      bool = false;
    }
    while (true)
    {
      return bool;
      a.b localb1 = com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
      a.b localb2 = com.tencent.mm.plugin.appbrand.config.a.a.yV(this.isQ);
      if (a.b.hiL == localb2)
      {
        AppMethodBeat.o(87257);
        bool = false;
      }
      else
      {
        a.b localb3 = localb2;
        if (localb2 == null)
          localb3 = a.b.hiK;
        if (!localb1.c(localb3))
        {
          bool = true;
          AppMethodBeat.o(87257);
        }
        else
        {
          AppMethodBeat.o(87257);
          bool = false;
        }
      }
    }
  }

  public final void aJM()
  {
    AppMethodBeat.i(87262);
    this.isM = true;
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.ies)
    {
      localLinkedList.addAll(this.ies);
      this.ies.clear();
      ??? = localLinkedList.iterator();
      if (((Iterator)???).hasNext())
        ((Runnable)((Iterator)???).next()).run();
    }
    AppMethodBeat.o(87262);
  }

  protected String aJP()
  {
    return "<html></html>";
  }

  public final boolean aJQ()
  {
    AppMethodBeat.i(87268);
    a.b localb = com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)this.mContext).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
    boolean bool;
    if ((localb == a.b.hiM) || (localb == a.b.hiN) || (localb == a.b.hiO) || (localb == a.b.hiP))
    {
      bool = true;
      AppMethodBeat.o(87268);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87268);
    }
  }

  public final boolean aJt()
  {
    return this.fCY;
  }

  public final n aJv()
  {
    return this.isW;
  }

  public final ad aJw()
  {
    if ((this.mContext instanceof ad));
    for (ad localad = (ad)this.mContext; ; localad = null)
      return localad;
  }

  protected List<com.tencent.mm.plugin.appbrand.menu.n> aJx()
  {
    AppMethodBeat.i(87210);
    LinkedList localLinkedList = new LinkedList();
    AppMethodBeat.o(87210);
    return localLinkedList;
  }

  protected final c aJy()
  {
    AppMethodBeat.i(87211);
    c localc;
    if (this.isR != null)
    {
      localc = this.isR;
      AppMethodBeat.o(87211);
    }
    while (true)
    {
      return localc;
      this.isR = new c(this.mContext);
      this.isR.a(new u.2(this));
      localc = this.isR;
      AppMethodBeat.o(87211);
    }
  }

  public final aj aJz()
  {
    return this.isJ;
  }

  protected void aL(List<com.tencent.mm.plugin.appbrand.menu.n> paramList)
  {
    AppMethodBeat.i(87207);
    new o(this, new LinkedList(this.irD)).aJm();
    AppMethodBeat.o(87207);
  }

  public final boolean atU()
  {
    AppMethodBeat.i(87263);
    boolean bool;
    if (getRuntime() == null)
    {
      bool = true;
      AppMethodBeat.o(87263);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87263);
    }
  }

  protected void atV()
  {
  }

  public Map<String, m> aub()
  {
    AppMethodBeat.i(87203);
    Map localMap = Collections.emptyMap();
    AppMethodBeat.o(87203);
    return localMap;
  }

  public final String auc()
  {
    return "AppBrandPageView";
  }

  protected void bN(String paramString)
  {
  }

  public void bV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87247);
    runOnUiThread(new u.20(this, paramString2, paramString1));
    AppMethodBeat.o(87247);
  }

  public aj cF(Context paramContext)
  {
    AppMethodBeat.i(87208);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    paramContext = new ag(localContext, this.isX);
    AppMethodBeat.o(87208);
    return paramContext;
  }

  protected am cG(Context paramContext)
  {
    return am.iuX;
  }

  public final void cleanup()
  {
    AppMethodBeat.i(87220);
    super.cleanup();
    xN();
    com.tencent.mm.plugin.appbrand.jsapi.g localg = this.iqN;
    localg.hvU.clear();
    localg.hvX.clear();
    localg.hvV.clear();
    localg.hvW.clear();
    localg.hvY.clear();
    localg.hvZ.clear();
    AppMethodBeat.o(87220);
  }

  public void dN(boolean paramBoolean)
  {
    AppMethodBeat.i(87240);
    runOnUiThread(new u.14(this, paramBoolean));
    AppMethodBeat.o(87240);
  }

  public void dO(boolean paramBoolean)
  {
    AppMethodBeat.i(87245);
    runOnUiThread(new u.18(this, paramBoolean));
    AppMethodBeat.o(87245);
  }

  public void ew(boolean paramBoolean)
  {
    AppMethodBeat.i(87241);
    runOnUiThread(new u.15(this, paramBoolean));
    AppMethodBeat.o(87241);
  }

  public boolean g(Canvas paramCanvas)
  {
    AppMethodBeat.i(87209);
    this.isF.draw(paramCanvas);
    Bitmap localBitmap = aBo();
    if (localBitmap != null)
      paramCanvas.drawBitmap(localBitmap, 0.0F, this.irj.getTop(), null);
    AppMethodBeat.o(87209);
    return true;
  }

  public final com.tencent.mm.plugin.appbrand.widget.actionbar.b getActionBar()
  {
    return this.isG;
  }

  public View getContentView()
  {
    return this.isE;
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public final a.d getPageConfig()
  {
    AppMethodBeat.i(87214);
    a.d locald;
    if (!isRunning())
    {
      locald = null;
      AppMethodBeat.o(87214);
    }
    while (true)
    {
      return locald;
      locald = getRuntime().getAppConfig().yR(getURL());
      AppMethodBeat.o(87214);
    }
  }

  public i getRuntime()
  {
    return this.gPI;
  }

  public String getURL()
  {
    return this.hsV;
  }

  public void h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(87218);
    L(new u.4(this, paramString1, paramString2, paramInt));
    AppMethodBeat.o(87218);
  }

  protected void initActionBar()
  {
    AppMethodBeat.i(87206);
    this.isG = ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)this.irO.b(this.mContext, com.tencent.mm.plugin.appbrand.widget.actionbar.b.class));
    this.isG.getActionView().setId(this.isD);
    this.isG.setBackButtonClickListener(new u.29(this));
    this.isG.setCloseButtonClickListener(new u.30(this));
    this.isG.a(new u.31(this));
    this.isG.setOptionButtonClickListener(new u.32(this));
    this.isG.aOJ();
    this.isF = new com.tencent.mm.plugin.appbrand.widget.actionbar.d(this.mContext);
    this.isF.setId(isC);
    this.isF.setActuallyVisible(false);
    this.isF.setDeferStatusBarHeightChange(false);
    this.isF.addView(this.isG, new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(87206);
  }

  protected void initView()
  {
    AppMethodBeat.i(87202);
    initActionBar();
    if (this.isJ == null)
      aCd();
    this.isJ.cE(this.mContext);
    this.isJ.setFullscreenImpl(aJy());
    this.isK = new y(this.mContext, this.isJ);
    this.isK.setOnPullDownListener(new u.33(this));
    this.isK.setOnPullDownOffsetListener(new y.b()
    {
      public final void nT(int paramAnonymousInt)
      {
        AppMethodBeat.i(87193);
        u.k(u.this).nT(paramAnonymousInt);
        AppMethodBeat.o(87193);
      }
    });
    this.irj = new FrameLayout(this.mContext);
    this.irj.setId(2131820567);
    this.irj.addView(this.isK);
    y localy = this.isK;
    al localal = ((al.a)com.tencent.luggage.a.e.B(al.a.class)).q(this);
    this.isI = localal;
    localy.addView(localal.getContainer());
    this.isK.setOnPullDownOffsetListener(this.isI);
    this.isJ.setOnScrollChangedListener(this.isI);
    this.isJ.setWebViewLayoutListener(this.isI);
    this.isI.setupWebViewTouchInterceptor(this.isJ);
    this.isE = new u.a(this, this.mContext);
    this.isE.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.isE.addView(this.irj, new ViewGroup.LayoutParams(-1, -1));
    this.isE.addView(this.isF);
    this.isH = new ac(this.isI.getContainer());
    this.isH.setFullscreenImpl(aJy());
    aBk().addOnLayoutChangeListener(new u.23(this));
    AppMethodBeat.o(87202);
  }

  public boolean isFullScreen()
  {
    return this.isN;
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(87219);
    boolean bool;
    if ((this.apg) && (super.isRunning()))
    {
      bool = true;
      AppMethodBeat.o(87219);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87219);
    }
  }

  protected final void k(n paramn)
  {
    AppMethodBeat.i(138232);
    this.isW = paramn;
    aJu();
    AppMethodBeat.o(138232);
  }

  public void nV(int paramInt)
  {
    AppMethodBeat.i(87236);
    runOnUiThread(new u.9(this, paramInt));
    AppMethodBeat.o(87236);
  }

  public void nW(int paramInt)
  {
    AppMethodBeat.i(87239);
    runOnUiThread(new u.13(this, paramInt));
    AppMethodBeat.o(87239);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  protected void onCreate()
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(87231);
    aBd();
    Iterator localIterator = this.iqN.hvX.iterator();
    while (localIterator.hasNext())
      ((f.c)localIterator.next()).onDestroy();
    AppMethodBeat.o(87231);
  }

  public final void onReady()
  {
    AppMethodBeat.i(87224);
    runOnUiThread(new u.5(this));
    AppMethodBeat.o(87224);
  }

  final void pr(int paramInt)
  {
    AppMethodBeat.i(87212);
    if (this.isY)
      AppMethodBeat.o(87212);
    while (true)
    {
      return;
      if ((this.isF.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))
      {
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.isF.getLayoutParams();
        if (localMarginLayoutParams.bottomMargin != paramInt)
        {
          localMarginLayoutParams.bottomMargin = paramInt;
          this.isF.setLayoutParams(localMarginLayoutParams);
        }
      }
      AppMethodBeat.o(87212);
    }
  }

  public final com.tencent.mm.plugin.appbrand.menu.n ps(int paramInt)
  {
    AppMethodBeat.i(87249);
    Iterator localIterator = this.irD.iterator();
    com.tencent.mm.plugin.appbrand.menu.n localn;
    while (localIterator.hasNext())
    {
      localn = (com.tencent.mm.plugin.appbrand.menu.n)localIterator.next();
      if ((localn != null) && (localn.id == paramInt))
        AppMethodBeat.o(87249);
    }
    while (true)
    {
      return localn;
      localn = null;
      AppMethodBeat.o(87249);
    }
  }

  protected final void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(87222);
    if (!com.tencent.mm.sdk.platformtools.al.isMainThread())
    {
      getContentView().post(paramRunnable);
      AppMethodBeat.o(87222);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(87222);
    }
  }

  public final void u(double paramDouble)
  {
    AppMethodBeat.i(87235);
    runOnUiThread(new u.8(this, paramDouble));
    AppMethodBeat.o(87235);
  }

  public final void wU()
  {
    AppMethodBeat.i(87226);
    this.fCY = true;
    aBb();
    Iterator localIterator = this.iqN.hvW.iterator();
    while (localIterator.hasNext())
      ((f.d)localIterator.next()).wU();
    AppMethodBeat.o(87226);
  }

  public final void wW()
  {
    AppMethodBeat.i(87228);
    this.fCY = false;
    aBc();
    Iterator localIterator = this.iqN.hvV.iterator();
    while (localIterator.hasNext())
      ((f.b)localIterator.next()).wW();
    AppMethodBeat.o(87228);
  }

  public boolean wY()
  {
    boolean bool = true;
    AppMethodBeat.i(87230);
    if (this.isR.aIZ())
    {
      AppMethodBeat.o(87230);
      return bool;
    }
    Iterator localIterator = this.iqN.hvY.iterator();
    bool = false;
    label41: if (localIterator.hasNext())
    {
      if (!((f.a)localIterator.next()).wY())
        break label81;
      bool = true;
    }
    label81: 
    while (true)
    {
      break label41;
      AppMethodBeat.o(87230);
      break;
    }
  }

  protected void xN()
  {
    AppMethodBeat.i(87221);
    this.isJ.destroy();
    aBf().removeAll();
    ??? = this.isG;
    ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)???).removeAllViews();
    ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)???).getCapsuleBar().destroy();
    this.isE.removeAllViews();
    synchronized (this.ies)
    {
      this.ies.clear();
      AppMethodBeat.o(87221);
      return;
    }
  }

  protected boolean xP()
  {
    boolean bool = false;
    AppMethodBeat.i(87259);
    if (!this.isJ.aAN())
      AppMethodBeat.o(87259);
    while (true)
    {
      return bool;
      this.isL = false;
      this.isM = false;
      com.tencent.luggage.g.d.i("MicroMsg.AppBrandPageView", "[wxa_reload]reload page %s %s", new Object[] { getAppId(), this.ikx });
      aJN();
      AA(this.ikx);
      L(new u.25(this));
      AppMethodBeat.o(87259);
      bool = true;
    }
  }

  public com.tencent.mm.plugin.appbrand.q xT()
  {
    AppMethodBeat.i(87204);
    com.tencent.mm.plugin.appbrand.q localq = getRuntime().xT();
    AppMethodBeat.o(87204);
    return localq;
  }

  public final JSONObject xW()
  {
    AppMethodBeat.i(87267);
    JSONObject localJSONObject = getRuntime().xT().xW();
    AppMethodBeat.o(87267);
    return localJSONObject;
  }

  public final void z(CharSequence paramCharSequence)
  {
    this.isP = paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u
 * JD-Core Version:    0.6.2
 */