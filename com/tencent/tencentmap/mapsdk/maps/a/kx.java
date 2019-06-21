package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class kx
  implements kt
{
  private final ky a;

  protected kx(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100272);
    this.a = ky.a(paramFloat1, paramFloat2, paramFloat1, paramFloat2);
    AppMethodBeat.o(100272);
  }

  public static kx a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(100273);
    kx localkx = new kx((float)paramDouble1, (float)paramDouble2);
    AppMethodBeat.o(100273);
    return localkx;
  }

  public final ky a()
  {
    return this.a;
  }

  public final boolean a(ky paramky)
  {
    AppMethodBeat.i(100274);
    boolean bool = this.a.a(paramky);
    AppMethodBeat.o(100274);
    return bool;
  }

  public final float b()
  {
    AppMethodBeat.i(100275);
    float f = this.a.c();
    AppMethodBeat.o(100275);
    return f;
  }

  public final float c()
  {
    AppMethodBeat.i(100276);
    float f = this.a.d();
    AppMethodBeat.o(100276);
    return f;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(100278);
    if (paramObject == null)
      AppMethodBeat.o(100278);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof kx))
      {
        AppMethodBeat.o(100278);
      }
      else
      {
        paramObject = (kx)paramObject;
        if ((this.a == paramObject.a()) || ((this.a != null) && (this.a.equals(paramObject.a()))))
        {
          bool = true;
          AppMethodBeat.o(100278);
        }
        else
        {
          AppMethodBeat.o(100278);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(100277);
    int i = Arrays.hashCode(new Object[] { this.a });
    AppMethodBeat.o(100277);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(100279);
    String str = "Point [x=" + b() + ", y=" + c() + "]";
    AppMethodBeat.o(100279);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kx
 * JD-Core Version:    0.6.2
 */