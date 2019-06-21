package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class ky
  implements kt, kv
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;

  protected ky(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(100280);
    this.a = Math.min(paramFloat1, paramFloat3);
    this.b = Math.min(paramFloat2, paramFloat4);
    this.c = Math.max(paramFloat1, paramFloat3);
    this.d = Math.max(paramFloat2, paramFloat4);
    AppMethodBeat.o(100280);
  }

  public static ky a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    AppMethodBeat.i(100282);
    ky localky = new ky((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
    AppMethodBeat.o(100282);
    return localky;
  }

  public static ky a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(100283);
    ky localky = new ky(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    AppMethodBeat.o(100283);
    return localky;
  }

  private boolean a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100288);
    boolean bool;
    if (Float.floatToIntBits(paramFloat1) == Float.floatToIntBits(paramFloat2))
    {
      bool = true;
      AppMethodBeat.o(100288);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100288);
    }
  }

  public final ky a()
  {
    return this;
  }

  public final boolean a(ky paramky)
  {
    boolean bool = false;
    AppMethodBeat.i(100284);
    float f = Math.max(this.a, paramky.a);
    if (Math.min(this.c, paramky.c) < f)
      AppMethodBeat.o(100284);
    while (true)
    {
      return bool;
      f = Math.max(this.b, paramky.b);
      if (Math.min(this.d, paramky.d) >= f)
      {
        bool = true;
        AppMethodBeat.o(100284);
      }
      else
      {
        AppMethodBeat.o(100284);
      }
    }
  }

  public final kt b()
  {
    return this;
  }

  public final ky b(ky paramky)
  {
    AppMethodBeat.i(100281);
    paramky = new ky(Math.min(this.a, paramky.a), Math.min(this.b, paramky.b), Math.max(this.c, paramky.c), Math.max(this.d, paramky.d));
    AppMethodBeat.o(100281);
    return paramky;
  }

  public final float c()
  {
    return this.a;
  }

  public final float c(ky paramky)
  {
    AppMethodBeat.i(100289);
    float f;
    if (!a(paramky))
    {
      f = 0.0F;
      AppMethodBeat.o(100289);
    }
    while (true)
    {
      return f;
      f = a(Math.max(this.a, paramky.a), Math.max(this.b, paramky.b), Math.min(this.c, paramky.c), Math.min(this.d, paramky.d)).g();
      AppMethodBeat.o(100289);
    }
  }

  public final float d()
  {
    return this.b;
  }

  public final float e()
  {
    return this.c;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(100287);
    if (paramObject == null)
      AppMethodBeat.o(100287);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ky))
      {
        AppMethodBeat.o(100287);
      }
      else
      {
        paramObject = (ky)paramObject;
        if ((a(this.a, paramObject.a)) && (a(this.c, paramObject.c)) && (a(this.b, paramObject.b)) && (a(this.d, paramObject.d)))
        {
          bool = true;
          AppMethodBeat.o(100287);
        }
        else
        {
          AppMethodBeat.o(100287);
        }
      }
    }
  }

  public final float f()
  {
    return this.d;
  }

  public final float g()
  {
    return (this.c - this.a) * (this.d - this.b);
  }

  public final float h()
  {
    return (this.c - this.a) * 2.0F + (this.d - this.b) * 2.0F;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(100286);
    int i = Arrays.hashCode(new Object[] { Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d) });
    AppMethodBeat.o(100286);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(100285);
    String str = "Rectangle [x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + "]";
    AppMethodBeat.o(100285);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ky
 * JD-Core Version:    0.6.2
 */