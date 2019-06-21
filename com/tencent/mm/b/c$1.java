package com.tencent.mm.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ListIterator;

public final class c$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public c$1(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(116141);
    float f1 = ((Float)paramValueAnimator.getAnimatedValue("deltaY")).floatValue();
    float f2 = ((Float)paramValueAnimator.getAnimatedValue("deltaX")).floatValue();
    ab.d("MicroMsg.StickBackAnim", "animatorValueY:%s  %s", new Object[] { Float.valueOf(f1), Float.valueOf(f1 - this.ccu.ccs) });
    e locale = this.ccu.ccp;
    float f3 = this.ccu.cct;
    float f4 = this.ccu.ccs;
    paramValueAnimator = this.ccu.ccr;
    Object localObject = (com.tencent.mm.cache.c)locale.CI();
    if (localObject == null)
      ab.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
    while (true)
    {
      this.ccu.ccs = f1;
      this.ccu.cct = f2;
      AppMethodBeat.o(116141);
      return;
      ListIterator localListIterator = ((com.tencent.mm.cache.c)localObject).Jj();
      if (localListIterator.hasPrevious())
      {
        localObject = (com.tencent.mm.y.c)localListIterator.previous();
        if (!((com.tencent.mm.y.c)localObject).eHf.equals(paramValueAnimator))
          break;
        ((com.tencent.mm.y.c)localObject).eHi.offset(f2 - f3, f1 - f4);
        locale.CP();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.c.1
 * JD-Core Version:    0.6.2
 */