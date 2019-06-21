package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreviewFrameLayout extends RelativeLayout
{
  private double mAspectRatio = 1.333333333333333D;

  public PreviewFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public double getmAspectRatio()
  {
    return this.mAspectRatio;
  }

  public void setAspectRatio(double paramDouble)
  {
    AppMethodBeat.i(809);
    if (paramDouble <= 0.0D)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException();
      AppMethodBeat.o(809);
      throw localIllegalArgumentException;
    }
    if (this.mAspectRatio != paramDouble)
    {
      this.mAspectRatio = paramDouble;
      requestLayout();
    }
    AppMethodBeat.o(809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout
 * JD-Core Version:    0.6.2
 */