package com.tencent.mm.plugin.facedetectlight.ui.a;

import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama, int paramInt1, int paramInt2, Animation paramAnimation)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(824);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.meh.meg.getLayoutParams();
    localMarginLayoutParams.width = ((int)(this.val$width * 0.7D));
    localMarginLayoutParams.height = ((int)(this.val$width * 0.7D));
    localMarginLayoutParams.topMargin = ((int)(this.val$height * 0.4D - this.val$width * 0.35D));
    this.meh.meg.setLayoutParams(localMarginLayoutParams);
    this.meh.meg.setVisibility(0);
    this.meh.meg.startAnimation(this.mei);
    AppMethodBeat.o(824);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.a.a.2
 * JD-Core Version:    0.6.2
 */