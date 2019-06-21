package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;

public class MMFalseProgressBar extends ProgressBar
{
  private float Yn;
  private float iUf;
  private float iUg;
  private float iUh;
  private float iUi;
  private boolean iUj;
  private ak mHandler;
  private boolean mIsStart;

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(87444);
    this.mIsStart = false;
    this.Yn = 0.0F;
    this.iUj = true;
    this.mHandler = new MMFalseProgressBar.1(this, Looper.getMainLooper());
    setMax(1000);
    if (at.gH(ah.getContext()))
    {
      this.iUf = 4.0F;
      this.iUg = 1.0F;
      this.iUh = 0.3F;
      this.iUi = 50.0F;
      AppMethodBeat.o(87444);
    }
    while (true)
    {
      return;
      this.iUf = 2.0F;
      this.iUg = 0.5F;
      this.iUh = 0.15F;
      this.iUi = 50.0F;
      AppMethodBeat.o(87444);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar
 * JD-Core Version:    0.6.2
 */