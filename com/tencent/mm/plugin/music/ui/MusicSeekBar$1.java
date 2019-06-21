package com.tencent.mm.plugin.music.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.SeekBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MusicSeekBar$1
  implements ValueAnimator.AnimatorUpdateListener
{
  MusicSeekBar$1(MusicSeekBar paramMusicSeekBar)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(105125);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    paramValueAnimator = this.oPl.oPi;
    paramValueAnimator.oPn = f;
    paramValueAnimator.invalidateSelf();
    MusicSeekBar.a(this.oPl).setThumb(this.oPl.oPi);
    AppMethodBeat.o(105125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicSeekBar.1
 * JD-Core Version:    0.6.2
 */