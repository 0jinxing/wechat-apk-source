package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.luggage.g.f;
import com.tencent.luggage.g.h;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.SwipeBackLayout.a;
import org.json.JSONObject;

public abstract class n extends SwipeBackLayout
{
  private View WL;
  private q gND;
  private final SwipeBackLayout.a irA = new n.1(this);
  private boolean irv = true;
  private boolean irw = false;
  private int irx;
  private int iry;
  final boolean[] irz = { false };
  public boolean mSwiping = false;

  public n(Context paramContext, q paramq)
  {
    super(paramContext);
    this.gND = paramq;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setScrimColor(0);
    this.WL = aAQ();
    addView(getContentView());
    setContentView(getContentView());
    a(this.irA);
  }

  private void a(String paramString, aq paramaq)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", h.bO(getCurrentUrl()));
    localHashMap.put("query", h.bP(getCurrentUrl()));
    localHashMap.put("rawPath", getCurrentUrl());
    if (paramaq != null)
      localHashMap.put("openType", paramaq.toString());
    if ("onAppRoute".equals(paramString))
      localHashMap.put("resizing", Boolean.valueOf(getCurrentPageView().aJK()));
    e.d(localHashMap);
    getCurrentPageView().a(paramString, new JSONObject(localHashMap).toString(), null);
  }

  protected static boolean f(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramArrayOfInt != null)
    {
      if (paramArrayOfInt.length != 0)
        break label17;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label17: int i = paramArrayOfInt.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label47;
        bool2 = bool1;
        if (paramArrayOfInt[j] == paramInt)
          break;
      }
      label47: bool2 = false;
    }
  }

  private View getContentView()
  {
    return this.WL;
  }

  private void hide()
  {
    if (this.irv)
      setVisibility(4);
  }

  private static void l(View paramView, float paramFloat)
  {
    paramView.clearAnimation();
    paramView.setTranslationX(paramFloat);
  }

  private void onSwipe(float paramFloat)
  {
    if (this.irv)
    {
      if (paramFloat < 0.0F)
        break label45;
      setVisibility(0);
    }
    while (true)
    {
      float f = getContentView().getWidth() / 4;
      l(getContentView(), f * (1.0F - paramFloat) * -1.0F);
      return;
      label45: hide();
    }
  }

  public abstract boolean Ay(String paramString);

  public final void a(aq paramaq)
  {
    a("onAppRoute", paramaq);
    ab.i("MicroMsg.AppBrandPage", "onAppRoute: %s, %s", new Object[] { paramaq.toString(), getCurrentUrl() });
  }

  protected void a(u paramu, AppBrandPageFullScreenView paramAppBrandPageFullScreenView)
  {
    if ((paramAppBrandPageFullScreenView != null) && (paramAppBrandPageFullScreenView.getParent() == null) && ((this.WL instanceof ViewGroup)))
      ((ViewGroup)this.WL).addView(paramAppBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
  }

  protected abstract View aAQ();

  protected void aAR()
  {
    ab.d("MicroMsg.AppBrandPage", "onPageDestroy: %s", new Object[] { getCurrentUrl() });
  }

  protected void aAS()
  {
    ab.d("MicroMsg.AppBrandPage", "onPageForeground: %s", new Object[] { getCurrentUrl() });
    if (getPageConfig().hfB)
      setEnableGesture(false);
    while (true)
    {
      setEdgeTrackingEnabled(1);
      onSwipe(1.0F);
      setVisibility(0);
      return;
      setEnableGesture(this.gND.aAV());
    }
  }

  protected void aAT()
  {
    ab.d("MicroMsg.AppBrandPage", "onPageBackground: %s", new Object[] { getCurrentUrl() });
  }

  final void aJj()
  {
    if (this.irv)
    {
      this.irv = false;
      this.irw = false;
      aAS();
    }
  }

  final void aJk()
  {
    if (!this.irv)
    {
      this.irv = true;
      aAT();
    }
  }

  public final void aJl()
  {
    a("onAppRouteDone", null);
    ab.i("MicroMsg.AppBrandPage", "onAppRouteDone: %s", new Object[] { getCurrentUrl() });
  }

  protected final void aqX()
  {
    f.az(getContext());
  }

  public abstract void b(String paramString1, String paramString2, int[] paramArrayOfInt);

  protected void cleanup()
  {
  }

  public String getAppId()
  {
    return this.gND.getAppId();
  }

  protected q getContainer()
  {
    return this.gND;
  }

  public abstract u getCurrentPageView();

  public abstract String getCurrentUrl();

  public a.d getPageConfig()
  {
    return getCurrentPageView().getPageConfig();
  }

  protected final boolean isInBackground()
  {
    return this.irv;
  }

  public abstract void loadUrl(String paramString);

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.irv)
      this.irw = true;
    u localu = getCurrentPageView();
    if (localu != null)
      localu.onConfigurationChanged(paramConfiguration);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    if ((this.irv) && (!this.irw) && (this.irx > 0) && (this.iry > 0))
    {
      i = 1;
      if (i == 0)
        break label64;
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.irx, 1073741824), View.MeasureSpec.makeMeasureSpec(this.iry, 1073741824));
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label64: super.onMeasure(paramInt1, paramInt2);
      this.irx = getMeasuredWidth();
      this.iry = getMeasuredHeight();
    }
  }

  final void performDestroy()
  {
    aAR();
  }

  final void xN()
  {
    cleanup();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.n
 * JD-Core Version:    0.6.2
 */