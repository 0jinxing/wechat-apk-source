package com.tencent.mm.plugin.facedetect.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements Animation.AnimationListener
{
  a$2(a parama, c paramc)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(384);
    ab.i("MicroMsg.FaceDetectJumper", "showJumperEnd: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    AppMethodBeat.o(384);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.a.2
 * JD-Core Version:    0.6.2
 */