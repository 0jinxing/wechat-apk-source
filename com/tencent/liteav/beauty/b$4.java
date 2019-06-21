package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.beauty.b.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

class b$4
  implements Runnable
{
  b$4(b paramb, float paramFloat1, Bitmap paramBitmap1, float paramFloat2, Bitmap paramBitmap2, float paramFloat3)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66829);
    if (b.a(this.f) != null)
      a.a().d();
    if ((b.h(this.f) == null) && (b.i(this.f) == null))
    {
      if (b.a(this.f) == null)
        break label180;
      b.a(this.f).d();
      b.a(this.f, null);
      AppMethodBeat.o(66829);
    }
    while (true)
    {
      return;
      if (b.a(this.f) == null)
      {
        b.a(this.f, b.f(this.f), b.g(this.f), b.j(this.f), b.h(this.f), b.k(this.f), b.i(this.f), b.l(this.f));
        AppMethodBeat.o(66829);
      }
      else
      {
        b.a(this.f).a(this.a, this.b, this.c, this.d, this.e);
        label180: AppMethodBeat.o(66829);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.4
 * JD-Core Version:    0.6.2
 */