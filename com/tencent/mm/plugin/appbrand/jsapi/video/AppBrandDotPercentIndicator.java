package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class AppBrandDotPercentIndicator extends LinearLayout
{
  private int hYk;
  private LayoutInflater mInflater;

  public AppBrandDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(126436);
    init(paramContext);
    AppMethodBeat.o(126436);
  }

  public AppBrandDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126437);
    init(paramContext);
    AppMethodBeat.o(126437);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(126438);
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(126438);
  }

  public void setDotsNum(int paramInt)
  {
    AppMethodBeat.i(126439);
    if (paramInt > 1);
    while (true)
    {
      this.hYk = paramInt;
      removeAllViews();
      for (paramInt = 0; paramInt < this.hYk; paramInt++)
        addView((ImageView)this.mInflater.inflate(2130968678, this, false));
      paramInt = 8;
    }
    AppMethodBeat.o(126439);
  }

  public void setPercent(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(126440);
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
        ((ImageView)getChildAt(j)).setImageResource(2130837730);
      }
      break;
    }
    while (k < getChildCount())
    {
      ((ImageView)getChildAt(k)).setImageResource(2130837729);
      k++;
    }
    AppMethodBeat.o(126440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandDotPercentIndicator
 * JD-Core Version:    0.6.2
 */