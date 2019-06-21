package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

class gd$1
  implements Runnable
{
  gd$1(gd paramgd, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5)
  {
  }

  public void run()
  {
    AppMethodBeat.i(98988);
    gd.a(this.g, gd.a(this.g) + this.a);
    gd.a(this.g, this.b, gd.a(this.g), true);
    if (gd.b(this.g) < 10)
    {
      gd.c(this.g).postDelayed(this, 16L);
      AppMethodBeat.o(98988);
    }
    while (true)
    {
      return;
      gd.a(this.g, this.b, this.c, true);
      if ((this.d >= 3.0F) && (this.d <= 20.0F))
      {
        if (this.e)
        {
          Runnable local1 = new Runnable()
          {
            public void run()
            {
              AppMethodBeat.i(98987);
              gd.d(gd.1.this.g).a().a(gd.1.this.f);
              AppMethodBeat.o(98987);
            }
          };
          gd.d(this.g).a().a((int)this.d, local1, false);
          AppMethodBeat.o(98988);
        }
        else
        {
          gd.d(this.g).a().a(this.f);
        }
      }
      else
        AppMethodBeat.o(98988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gd.1
 * JD-Core Version:    0.6.2
 */