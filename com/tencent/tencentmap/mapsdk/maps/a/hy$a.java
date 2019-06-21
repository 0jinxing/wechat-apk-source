package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

class hy$a
{
  private float b;
  private float c;
  private float d;
  private float e;
  private int f;
  private int g;
  private int h;
  private float i;
  private float j;
  private int k;
  private boolean l;
  private Handler m;

  hy$a(hy paramhy, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(99690);
    this.b = 0.0F;
    this.c = 0.0F;
    this.d = 0.0F;
    this.e = 0.0F;
    this.f = -1;
    this.g = 1;
    this.h = 0;
    this.i = 0.0F;
    this.j = 0.0F;
    this.k = 0;
    this.l = false;
    this.m = new hy.a.1(this);
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      if (paramInt1 > 255);
      for (int i2 = 255; ; i2 = paramInt1)
      {
        if (paramInt2 < 0);
        for (paramInt1 = 0; ; paramInt1 = paramInt2)
        {
          if (paramInt1 > 255);
          for (paramInt2 = 255; ; paramInt2 = paramInt1)
          {
            if (paramInt3 < 0);
            for (paramInt1 = 0; ; paramInt1 = paramInt3)
            {
              paramInt3 = paramInt1;
              if (paramInt1 > 255)
                paramInt3 = 255;
              if (paramInt4 < 0);
              for (paramInt1 = n; ; paramInt1 = paramInt4)
              {
                if (paramInt1 > 255)
                  paramInt1 = i1;
                while (true)
                {
                  this.b = (i2 / 255.0F);
                  this.c = (paramInt2 / 255.0F);
                  this.d = (paramInt3 / 255.0F);
                  this.e = (paramInt1 / 255.0F);
                  this.f = paramInt5;
                  AppMethodBeat.o(99690);
                  return;
                }
              }
            }
          }
        }
      }
    }
  }

  private void a(float paramFloat1, float paramFloat2, long paramLong)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(99694);
    if (this.m == null)
    {
      AppMethodBeat.o(99694);
      return;
    }
    a();
    if (paramFloat1 < 0.0F)
      paramFloat1 = 0.0F;
    while (true)
    {
      float f3 = paramFloat1;
      if (paramFloat1 > 1.0F)
        f3 = 1.0F;
      if (paramFloat2 < 0.0F);
      for (paramFloat1 = f2; ; paramFloat1 = paramFloat2)
      {
        if (paramFloat1 > 1.0F)
          paramFloat1 = f1;
        while (true)
        {
          long l1 = paramLong;
          if (paramLong < 0L)
            l1 = 0L;
          this.g = 1;
          if (l1 > 0L)
            this.g = ((int)(50L * (l1 / 1000L)));
          if (this.g == 0)
            this.g = 1;
          this.h = ((int)(l1 / this.g));
          this.i = ((paramFloat1 - f3) / this.g);
          this.j = f3;
          this.k = 0;
          this.m.sendEmptyMessage(0);
          AppMethodBeat.o(99694);
          break;
        }
      }
    }
  }

  private void b()
  {
    AppMethodBeat.i(99695);
    this.m = null;
    this.a.b();
    AppMethodBeat.o(99695);
  }

  void a()
  {
    AppMethodBeat.i(99693);
    if (this.m != null)
      this.m.removeMessages(0);
    AppMethodBeat.o(99693);
  }

  void a(long paramLong)
  {
    AppMethodBeat.i(99691);
    this.l = false;
    a(0.0F, this.e, paramLong);
    AppMethodBeat.o(99691);
  }

  void b(long paramLong)
  {
    AppMethodBeat.i(99692);
    this.l = true;
    a(this.j, 0.0F, paramLong);
    AppMethodBeat.o(99692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hy.a
 * JD-Core Version:    0.6.2
 */