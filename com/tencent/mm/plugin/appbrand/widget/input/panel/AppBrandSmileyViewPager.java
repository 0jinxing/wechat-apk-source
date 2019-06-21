package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomViewPager;

public class AppBrandSmileyViewPager extends CustomViewPager
{
  private int jiO;
  private int jiP;
  private AppBrandSmileyViewPager.b jiQ;
  private c jir;

  public AppBrandSmileyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134339);
    this.jiO = 0;
    this.jiP = 0;
    if (Build.VERSION.SDK_INT >= 9)
      setOverScrollMode(2);
    AppMethodBeat.o(134339);
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(134340);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.jir != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.jiO)) || ((paramInt1 > 0) && (paramInt1 != this.jiP))))))
    {
      this.jir.jiL = paramInt2;
      this.jir.jiM = paramInt1;
      if (this.jiQ != null)
        this.jiQ.aRC();
    }
    if (paramInt2 > 0)
      this.jiO = paramInt2;
    if (paramInt1 > 0)
      this.jiP = paramInt1;
    AppMethodBeat.o(134340);
  }

  public void setOnSizeChangedListener(AppBrandSmileyViewPager.b paramb)
  {
    this.jiQ = paramb;
  }

  public void setPanelManager(c paramc)
  {
    this.jir = paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyViewPager
 * JD-Core Version:    0.6.2
 */