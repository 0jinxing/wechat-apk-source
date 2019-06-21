package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class VideoDotPercentIndicator extends LinearLayout
{
  private int hYk;
  private LayoutInflater mInflater;

  public VideoDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(84559);
    init(paramContext);
    AppMethodBeat.o(84559);
  }

  public VideoDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(84560);
    init(paramContext);
    AppMethodBeat.o(84560);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(84561);
    this.mInflater = LayoutInflater.from(paramContext);
    setDotsNum(0);
    AppMethodBeat.o(84561);
  }

  public void setDotsNum(int paramInt)
  {
    AppMethodBeat.i(84562);
    if (paramInt > 1);
    while (true)
    {
      this.hYk = paramInt;
      removeAllViews();
      for (paramInt = 0; paramInt < this.hYk; paramInt++)
        addView((ImageView)this.mInflater.inflate(2130971252, this, false));
      paramInt = 8;
    }
    AppMethodBeat.o(84562);
  }

  public void setProgress(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(84563);
    paramFloat /= 100.0F;
    if (paramFloat < 0.0F)
    {
      paramFloat = f2;
      if (paramFloat <= 1.0F)
        break label120;
      paramFloat = f1;
    }
    int k;
    label120: 
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
        ((ImageView)getChildAt(j)).setImageResource(2130840842);
      }
      break;
    }
    while (k < getChildCount())
    {
      ((ImageView)getChildAt(k)).setImageResource(2130840841);
      k++;
    }
    AppMethodBeat.o(84563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.VideoDotPercentIndicator
 * JD-Core Version:    0.6.2
 */