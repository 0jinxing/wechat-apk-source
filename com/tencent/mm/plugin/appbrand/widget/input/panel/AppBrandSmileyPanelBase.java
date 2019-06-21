package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.statusbar.d;

public class AppBrandSmileyPanelBase extends LinearLayout
  implements ViewPager.OnPageChangeListener, AppBrandSmileyViewPager.b
{
  private View WL;
  private boolean jgc;
  private f jiD;
  private MMActivity jiE;
  private AppBrandSmileyViewPager jiF;
  private MMDotView jiG;
  private boolean jiH;
  private c jir;

  public AppBrandSmileyPanelBase(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(134318);
    this.jgc = false;
    this.WL = null;
    this.jiF = null;
    this.jiH = true;
    init();
    AppMethodBeat.o(134318);
  }

  public AppBrandSmileyPanelBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134319);
    this.jgc = false;
    this.WL = null;
    this.jiF = null;
    this.jiH = true;
    init();
    AppMethodBeat.o(134319);
  }

  private void aRF()
  {
    AppMethodBeat.i(134327);
    this.WL.setVisibility(0);
    AppMethodBeat.o(134327);
  }

  private void aRG()
  {
    AppMethodBeat.i(134329);
    if (this.jiG == null)
    {
      AppMethodBeat.o(134329);
      return;
    }
    boolean bool = j.gu(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.jiH)
    {
      if (!bool)
        break label108;
      this.jiG.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(2131427796));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jiG.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(2131428368);
      this.jiG.setLayoutParams(localLayoutParams);
    }
    while (true)
    {
      this.jiH = bool;
      AppMethodBeat.o(134329);
      break;
      label108: this.jiG.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(2131427786));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jiG.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.jiG.setLayoutParams(localLayoutParams);
    }
  }

  private void init()
  {
    AppMethodBeat.i(134323);
    this.jiE = ((MMActivity)d.cY(getContext()));
    this.jir = aQY();
    this.jir.jiq = getContext();
    this.jir.jiK = this.jiD;
    AppMethodBeat.o(134323);
  }

  protected c aQY()
  {
    AppMethodBeat.i(134324);
    c localc = new c();
    AppMethodBeat.o(134324);
    return localc;
  }

  public final void aRC()
  {
    AppMethodBeat.i(134314);
    if (this.jiF == null)
    {
      AppMethodBeat.o(134314);
      return;
    }
    this.jir.jiH = j.gu(getContext());
    AppBrandSmileyViewPager.a locala = (AppBrandSmileyViewPager.a)this.jiF.getAdapter();
    if (locala != null)
    {
      locala.jiR.clear();
      locala.jir = this.jir;
      locala.notifyDataSetChanged();
    }
    while (true)
    {
      this.jiF.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(134312);
          AppBrandSmileyPanelBase.this.onPageSelected(AppBrandSmileyPanelBase.a(AppBrandSmileyPanelBase.this).getCurrentItem());
          AppMethodBeat.o(134312);
        }
      });
      AppMethodBeat.o(134314);
      break;
      locala = new AppBrandSmileyViewPager.a();
      locala.jir = this.jir;
      this.jiF.setAdapter(locala);
    }
  }

  public final void aRD()
  {
    AppMethodBeat.i(134321);
    if (this.WL != null)
      this.WL.setVisibility(0);
    AppMethodBeat.o(134321);
  }

  public final void aRE()
  {
    AppMethodBeat.i(134322);
    if (this.WL != null)
      this.WL.setVisibility(4);
    AppMethodBeat.o(134322);
  }

  @SuppressLint({"WrongCall"})
  protected final void du(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134317);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(134317);
  }

  protected final c getManager()
  {
    return this.jir;
  }

  protected final void initView()
  {
    AppMethodBeat.i(134328);
    if ((this.WL != null) && (getChildCount() > 0))
    {
      aRF();
      AppMethodBeat.o(134328);
      return;
    }
    if (this.WL == null)
      this.WL = View.inflate(ah.getContext(), 2130968772, null);
    while (true)
    {
      this.jiF = ((AppBrandSmileyViewPager)this.WL.findViewById(2131821506));
      this.jiF.setOnPageChangeListener(this);
      this.jiF.setPanelManager(this.jir);
      this.jiF.setOnSizeChangedListener(this);
      this.jiG = ((MMDotView)this.WL.findViewById(2131821505));
      this.jiG.setDotCount(1);
      aRG();
      addView(this.WL, new LinearLayout.LayoutParams(-1, -1));
      AppMethodBeat.o(134328);
      break;
      if (this.WL.getParent() != null)
        ((ViewGroup)this.WL.getParent()).removeView(this.WL);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(134320);
    c localc = this.jir;
    localc.jiJ = null;
    localc.jiq = null;
    if (this.WL != null)
    {
      ((ViewGroup)this.WL.getParent()).removeView(this.WL);
      ((ViewGroup)this.WL).removeAllViews();
      this.WL = null;
    }
    this.jiE = null;
    AppMethodBeat.o(134320);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134316);
    if (this.jgc)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, -2147483648));
      AppMethodBeat.o(134316);
    }
    while (true)
    {
      return;
      j.gu(getContext());
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(134316);
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(134313);
    a locala = this.jir.aRH();
    int i = locala.getPageCount();
    int j = locala.jis;
    if (i <= 1)
    {
      this.jiG.setVisibility(4);
      AppMethodBeat.o(134313);
    }
    while (true)
    {
      return;
      this.jiG.setVisibility(0);
      this.jiG.setDotCount(i);
      this.jiG.setSelectedDot(paramInt - j);
      AppMethodBeat.o(134313);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(134315);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    aRG();
    AppMethodBeat.o(134315);
  }

  protected final void qG(int paramInt)
  {
    AppMethodBeat.i(134326);
    super.setVisibility(paramInt);
    AppMethodBeat.o(134326);
  }

  public void setOnTextOperationListener(f paramf)
  {
    this.jiD = paramf;
    this.jir.jiK = this.jiD;
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(134325);
    if (paramInt == 0);
    for (this.jgc = false; ; this.jgc = true)
    {
      super.setVisibility(paramInt);
      if (!this.jgc)
      {
        this.jiE.aqX();
        initView();
      }
      AppMethodBeat.o(134325);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase
 * JD-Core Version:    0.6.2
 */