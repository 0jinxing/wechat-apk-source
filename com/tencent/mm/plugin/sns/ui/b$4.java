package com.tencent.mm.plugin.sns.ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4 extends Animation
{
  b$4(b paramb, int paramInt1, int paramInt2)
  {
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(38067);
    paramTransformation = (RelativeLayout.LayoutParams)this.rfW.rfU.getLayoutParams();
    if (paramFloat == 1.0F);
    for (int i = 0; ; i = (int)((this.rfX - this.rfY) * (1.0F - paramFloat)))
    {
      paramTransformation.bottomMargin = i;
      this.rfW.rfU.requestLayout();
      AppMethodBeat.o(38067);
      return;
    }
  }

  public final boolean willChangeBounds()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.4
 * JD-Core Version:    0.6.2
 */