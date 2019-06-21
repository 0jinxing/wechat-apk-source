package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.particles.a.b;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

final class c$2
  implements ValueAnimator.AnimatorUpdateListener
{
  c$2(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42437);
    long l1 = paramValueAnimator.getCurrentPlayTime();
    c.a(this.oan, l1);
    c localc = this.oan;
    paramValueAnimator = localc.nZJ.iterator();
    label92: label359: label365: label369: 
    while (paramValueAnimator.hasNext())
    {
      b localb = (b)paramValueAnimator.next();
      if (localb.oaz == -1L)
        localb.oaz = l1;
      long l2 = l1 - localb.oaz;
      boolean bool;
      if (l2 >= 0L)
      {
        bool = true;
        localb.oaO = bool;
        if ((localb.oaO) && (!localb.terminated))
        {
          localb.oaL = b.a(l2, localb.oaA, localb.oaC, localb.nZU, localb.oaE, localb.nZY);
          localb.oaM = b.a(l2, localb.oaB, localb.oaD, localb.nZW, localb.oaF, localb.oaa);
          localb.oaN = b.a(l2, localb.oaG, localb.oaH, localb.oag, localb.oaI, localb.oai);
          if (localb.nZO == null)
            break label348;
          localb.alpha = ((int)(localb.nZO.getInterpolation((float)l2 / localb.oaJ) * 255.0F));
          if ((localb.oaP) || ((float)l2 < localb.oaJ))
            break label359;
          bool = true;
          localb.terminated = bool;
          localb.oaK = Math.min(1.0F, (float)l2 / localb.oaJ);
        }
        if (localb.terminated)
          break label365;
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label369;
        paramValueAnimator.remove();
        localc.nZI.add(localb);
        break;
        bool = false;
        break label92;
        localb.alpha = 255;
        break label256;
        bool = false;
        break label279;
      }
    }
    label256: label279: label348: if ((this.oan.nZJ.size() == 0) && (l1 >= this.oan.nZM))
    {
      this.oan.bLM();
      AppMethodBeat.o(42437);
    }
    while (true)
    {
      return;
      this.oan.nZH.invalidate();
      AppMethodBeat.o(42437);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.c.2
 * JD-Core Version:    0.6.2
 */