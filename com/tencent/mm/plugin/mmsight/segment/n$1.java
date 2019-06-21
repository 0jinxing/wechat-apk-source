package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$1
  implements Runnable
{
  n$1(n paramn, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55011);
    if (this.ozi <= n.a(this.ozl) * 2)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("MaxExtent can not less than sliderWidth * 2");
      AppMethodBeat.o(55011);
      throw localIllegalStateException;
    }
    n.b(this.ozl);
    n.a(this.ozl, this.ozj);
    n.b(this.ozl, Math.min(this.ozi, this.ozl.getWidth() - this.ozj * 2));
    n.c(this.ozl, Math.max(this.ozk, n.a(this.ozl) * 2));
    n.c(this.ozl).setBounds(this.ozj, 0, this.ozj + n.a(this.ozl), this.ozl.getHeight());
    n.e(this.ozl).setBounds(this.ozj + n.d(this.ozl) - n.a(this.ozl), 0, n.d(this.ozl) + this.ozj, this.ozl.getHeight());
    if ((n.f(this.ozl) == null) && (n.g(this.ozl) == null))
    {
      n.a(this.ozl, n.c(this.ozl).getBounds());
      n.b(this.ozl, n.e(this.ozl).getBounds());
    }
    this.ozl.invalidate();
    AppMethodBeat.o(55011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.n.1
 * JD-Core Version:    0.6.2
 */