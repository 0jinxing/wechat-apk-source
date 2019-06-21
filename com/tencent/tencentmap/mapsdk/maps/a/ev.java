package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import android.view.animation.Interpolator;

public abstract class ev
{
  protected long a;
  protected long b;
  protected ev.a c;
  private boolean d;
  private boolean e;
  private Interpolator f;

  private long c()
  {
    return SystemClock.uptimeMillis();
  }

  public void a()
  {
    if (!this.d)
      if ((!this.e) && (this.c != null))
        this.c.a();
    while (true)
    {
      return;
      float f1 = (float)(c() - this.b) / (float)this.a;
      if (f1 > 1.0F)
      {
        this.d = false;
        a(1.0F, this.f);
        if (this.c != null)
          this.c.a();
        this.e = true;
      }
      else
      {
        a(f1, this.f);
      }
    }
  }

  protected abstract void a(float paramFloat, Interpolator paramInterpolator);

  public boolean b()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ev
 * JD-Core Version:    0.6.2
 */