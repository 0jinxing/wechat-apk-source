package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.ui.base.CustomViewPager;

public class WebViewSmileyViewPager extends CustomViewPager
{
  private int jiO;
  private int jiP;
  private a uKI;
  private c uKz;

  public WebViewSmileyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(10126);
    this.jiO = 0;
    this.jiP = 0;
    if (d.iW(9))
      setOverScrollMode(2);
    AppMethodBeat.o(10126);
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(10127);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.uKz != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.jiO)) || ((paramInt1 > 0) && (paramInt1 != this.jiP))))))
    {
      this.uKz.jiL = paramInt2;
      this.uKz.jiM = paramInt1;
      if (this.uKI != null)
        this.uKI.aRC();
    }
    if (paramInt2 > 0)
      this.jiO = paramInt2;
    if (paramInt1 > 0)
      this.jiP = paramInt1;
    AppMethodBeat.o(10127);
  }

  public void setOnSizeChangedListener(a parama)
  {
    this.uKI = parama;
  }

  public void setPanelManager(c paramc)
  {
    this.uKz = paramc;
  }

  public static abstract interface a
  {
    public abstract void aRC();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager
 * JD-Core Version:    0.6.2
 */