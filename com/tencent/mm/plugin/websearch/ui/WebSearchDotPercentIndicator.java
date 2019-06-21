package com.tencent.mm.plugin.websearch.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class WebSearchDotPercentIndicator extends LinearLayout
{
  private int hYk;
  private LayoutInflater mInflater;

  public WebSearchDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(73806);
    init(paramContext);
    AppMethodBeat.o(73806);
  }

  public WebSearchDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(73807);
    init(paramContext);
    AppMethodBeat.o(73807);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(73808);
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(73808);
  }

  public void setDotsNum(int paramInt)
  {
    AppMethodBeat.i(73809);
    if (paramInt > 1);
    while (true)
    {
      this.hYk = paramInt;
      removeAllViews();
      for (paramInt = 0; paramInt < this.hYk; paramInt++)
        addView((ImageView)this.mInflater.inflate(2130969641, this, false));
      paramInt = 8;
    }
    AppMethodBeat.o(73809);
  }

  public void setPercent(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(73810);
    if (paramFloat < 0.0F)
    {
      paramFloat = f2;
      if (paramFloat <= 1.0F)
        break label115;
      paramFloat = f1;
    }
    int k;
    label115: 
    while (true)
    {
      int i = (int)Math.rint(this.hYk * paramFloat);
      ab.v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(i) });
      for (int j = 0; ; j++)
      {
        k = j;
        if (j >= i)
          break;
        k = j;
        if (j >= getChildCount())
          break;
        ((ImageView)getChildAt(j)).setImageResource(2130838893);
      }
      break;
    }
    while (k < getChildCount())
    {
      ((ImageView)getChildAt(k)).setImageResource(2130838892);
      k++;
    }
    AppMethodBeat.o(73810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.ui.WebSearchDotPercentIndicator
 * JD-Core Version:    0.6.2
 */