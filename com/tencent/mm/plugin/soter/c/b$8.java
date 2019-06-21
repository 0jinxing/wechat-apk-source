package com.tencent.mm.plugin.soter.c;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$8
  implements Animation.AnimationListener
{
  b$8(b paramb, CharSequence paramCharSequence)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(73879);
    this.rNW.iqw.post(this.rNW.rNV);
    AppMethodBeat.o(73879);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(73878);
    this.rNW.rNP.setImageResource(2130838823);
    this.rNW.iqw.setText(this.tT);
    this.rNW.iqw.setTextColor(this.rNW.iqw.getResources().getColor(2131690651));
    this.rNW.iqw.removeCallbacks(this.rNW.rNV);
    AppMethodBeat.o(73878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.b.8
 * JD-Core Version:    0.6.2
 */