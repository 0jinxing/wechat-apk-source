package com.tencent.mm.ui.widget;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSwitchBtn$b extends Animation
{
  int direction;
  float startX;
  long zNe;

  private MMSwitchBtn$b(MMSwitchBtn paramMMSwitchBtn)
  {
    AppMethodBeat.i(112576);
    this.direction = 0;
    this.startX = 0.0F;
    this.zNe = 0L;
    setInterpolator(new AccelerateDecelerateInterpolator());
    setAnimationListener(new MMSwitchBtn.b.1(this, paramMMSwitchBtn));
    AppMethodBeat.o(112576);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(112577);
    if (this.direction == 0);
    for (MMSwitchBtn.d(this.zNf).left = (this.startX - (float)this.zNe * paramFloat); ; MMSwitchBtn.d(this.zNf).left = (this.startX + (float)this.zNe * paramFloat))
    {
      MMSwitchBtn.e(this.zNf);
      this.zNf.invalidate();
      AppMethodBeat.o(112577);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMSwitchBtn.b
 * JD-Core Version:    0.6.2
 */