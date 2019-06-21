package com.tencent.mm.plugin.webview.ui.tools.widget.input;

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

public class WebViewSmileyPanel extends LinearLayout
  implements ViewPager.OnPageChangeListener, WebViewSmileyViewPager.a
{
  View WL;
  private boolean jgc;
  MMActivity jiE;
  private MMDotView jiG;
  private boolean jiH;
  private WebViewSmileyPanel.a uKC;
  private WebViewSmileyViewPager uKD;
  c uKz;

  public WebViewSmileyPanel(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(10114);
    this.jgc = false;
    this.WL = null;
    this.uKD = null;
    this.jiH = true;
    init();
    AppMethodBeat.o(10114);
  }

  public WebViewSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(10115);
    this.jgc = false;
    this.WL = null;
    this.uKD = null;
    this.jiH = true;
    init();
    AppMethodBeat.o(10115);
  }

  private void aRG()
  {
    AppMethodBeat.i(10118);
    if (this.jiG == null)
    {
      AppMethodBeat.o(10118);
      return;
    }
    boolean bool = j.gu(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.jiH)
    {
      if (!bool)
        break label111;
      this.jiG.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(2131427796));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jiG.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(2131428368);
      this.jiG.setLayoutParams(localLayoutParams);
    }
    while (true)
    {
      this.jiH = bool;
      AppMethodBeat.o(10118);
      break;
      label111: this.jiG.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(2131427786));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jiG.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.jiG.setLayoutParams(localLayoutParams);
    }
  }

  private void init()
  {
    AppMethodBeat.i(10116);
    this.jiE = ((MMActivity)getContext());
    this.uKz = new c();
    this.uKz.jiq = getContext();
    this.uKz.uKG = this.uKC;
    AppMethodBeat.o(10116);
  }

  public final void aRC()
  {
    AppMethodBeat.i(10111);
    if (this.uKD == null)
    {
      AppMethodBeat.o(10111);
      return;
    }
    this.uKz.jiH = j.gu(getContext());
    WebViewSmileyViewPager.b localb = (WebViewSmileyViewPager.b)this.uKD.getAdapter();
    if (localb != null)
    {
      localb.jiR.clear();
      localb.uKz = this.uKz;
      localb.notifyDataSetChanged();
    }
    while (true)
    {
      this.uKD.post(new WebViewSmileyPanel.1(this));
      AppMethodBeat.o(10111);
      break;
      localb = new WebViewSmileyViewPager.b();
      localb.uKz = this.uKz;
      this.uKD.setAdapter(localb);
    }
  }

  protected final c getManager()
  {
    return this.uKz;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(10113);
    if (this.jgc)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, -2147483648));
      AppMethodBeat.o(10113);
    }
    while (true)
    {
      return;
      j.gu(getContext());
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(10113);
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
    AppMethodBeat.i(10110);
    a locala = this.uKz.ddb();
    int i = locala.getPageCount();
    int j = locala.jis;
    if (i <= 1)
    {
      this.jiG.setVisibility(4);
      AppMethodBeat.o(10110);
    }
    while (true)
    {
      return;
      this.jiG.setVisibility(0);
      this.jiG.setDotCount(i);
      this.jiG.setSelectedDot(paramInt - j);
      AppMethodBeat.o(10110);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(10112);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    aRG();
    AppMethodBeat.o(10112);
  }

  public void setOnTextOperationListener(WebViewSmileyPanel.a parama)
  {
    this.uKC = parama;
    this.uKz.uKG = this.uKC;
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(10117);
    if (paramInt == 0);
    for (this.jgc = false; ; this.jgc = true)
    {
      super.setVisibility(paramInt);
      if (this.jgc)
        break label179;
      this.jiE.aqX();
      if ((this.WL == null) || (getChildCount() <= 0))
        break;
      this.WL.setVisibility(0);
      AppMethodBeat.o(10117);
      return;
    }
    if (this.WL == null)
      this.WL = View.inflate(ah.getContext(), 2130971219, null);
    while (true)
    {
      this.uKD = ((WebViewSmileyViewPager)this.WL.findViewById(2131821506));
      this.uKD.setOnPageChangeListener(this);
      this.uKD.setPanelManager(this.uKz);
      this.uKD.setOnSizeChangedListener(this);
      this.jiG = ((MMDotView)this.WL.findViewById(2131821505));
      this.jiG.setDotCount(1);
      aRG();
      addView(this.WL, new LinearLayout.LayoutParams(-1, -1));
      label179: AppMethodBeat.o(10117);
      break;
      if (this.WL.getParent() != null)
        ((ViewGroup)this.WL.getParent()).removeView(this.WL);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel
 * JD-Core Version:    0.6.2
 */