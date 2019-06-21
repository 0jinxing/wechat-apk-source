package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$2 extends AnimatorListenerAdapter
{
  j$2(j paramj)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8180);
    if (j.d(this.uza) != null)
      j.d(this.uza).onAnimationEnd(paramAnimator);
    this.uza.setVisibility(8);
    if ((j.e(this.uza) != null) && (!j.e(this.uza).isRecycled()))
    {
      ab.i("MicroMsg.TransformToBagAniMask", "bitmap recycle %s", new Object[] { j.e(this.uza).toString() });
      j.e(this.uza).recycle();
    }
    AppMethodBeat.o(8180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.j.2
 * JD-Core Version:    0.6.2
 */