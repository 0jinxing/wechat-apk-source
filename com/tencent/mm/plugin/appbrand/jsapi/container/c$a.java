package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$a
  implements Interpolator
{
  protected PointF a;
  protected PointF b;
  private int hIQ;
  private final PointF hIR;
  private final PointF hIS;
  protected PointF hIT;
  protected PointF hIU;
  protected PointF hIV;

  public c$a(c paramc)
  {
    this(paramc, new PointF(0.0F, 0.0F), new PointF(0.58F, 1.0F));
    AppMethodBeat.i(126284);
    AppMethodBeat.o(126284);
  }

  private c$a(c paramc, PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(126283);
    this.hIQ = 0;
    this.hIR = new PointF();
    this.hIS = new PointF();
    this.a = new PointF();
    this.b = new PointF();
    this.hIV = new PointF();
    if ((paramPointF1.x < 0.0F) || (paramPointF1.x > 1.0F))
    {
      paramc = new IllegalArgumentException("startX value must be in the range [0, 1]");
      AppMethodBeat.o(126283);
      throw paramc;
    }
    if ((paramPointF2.x < 0.0F) || (paramPointF2.x > 1.0F))
    {
      paramc = new IllegalArgumentException("endX value must be in the range [0, 1]");
      AppMethodBeat.o(126283);
      throw paramc;
    }
    this.hIT = paramPointF1;
    this.hIU = paramPointF2;
    AppMethodBeat.o(126283);
  }

  public final float getInterpolation(float paramFloat)
  {
    AppMethodBeat.i(126285);
    int i = 1;
    float f1 = paramFloat;
    while (i < 14)
    {
      this.hIV.x = (this.hIT.x * 3.0F);
      this.b.x = ((this.hIU.x - this.hIT.x) * 3.0F - this.hIV.x);
      this.a.x = (1.0F - this.hIV.x - this.b.x);
      f2 = (this.hIV.x + (this.b.x + this.a.x * f1) * f1) * f1 - paramFloat;
      if (Math.abs(f2) < 0.001D)
        break;
      f1 -= f2 / (this.hIV.x + (2.0F * this.b.x + this.a.x * 3.0F * f1) * f1);
      i++;
    }
    this.hIV.y = (this.hIT.y * 3.0F);
    this.b.y = ((this.hIU.y - this.hIT.y) * 3.0F - this.hIV.y);
    this.a.y = (1.0F - this.hIV.y - this.b.y);
    float f3 = this.hIV.y;
    float f2 = this.b.y;
    paramFloat = this.a.y;
    AppMethodBeat.o(126285);
    return (f3 + (f2 + paramFloat * f1) * f1) * f1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.c.a
 * JD-Core Version:    0.6.2
 */