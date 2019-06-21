package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class fd
  implements Cloneable
{
  float a;
  Class<?> b;
  boolean c = false;
  private Interpolator d = null;

  public static fd a(float paramFloat)
  {
    return new fd.a(paramFloat);
  }

  public static fd a(float paramFloat, double paramDouble)
  {
    return new fd.a(paramFloat, paramDouble);
  }

  public static fd a(float paramFloat, Object paramObject)
  {
    return new b(paramFloat, paramObject);
  }

  public static fd b(float paramFloat)
  {
    return new b(paramFloat, null);
  }

  public abstract Object a();

  public void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }

  public float b()
  {
    return this.a;
  }

  public Interpolator c()
  {
    return this.d;
  }

  public abstract fd d();

  static class b extends fd
  {
    Object d;

    b(float paramFloat, Object paramObject)
    {
      AppMethodBeat.i(98865);
      this.a = paramFloat;
      this.d = paramObject;
      boolean bool;
      if (paramObject != null)
      {
        bool = true;
        this.c = bool;
        if (!this.c)
          break label58;
      }
      label58: for (paramObject = paramObject.getClass(); ; paramObject = Object.class)
      {
        this.b = paramObject;
        AppMethodBeat.o(98865);
        return;
        bool = false;
        break;
      }
    }

    public Object a()
    {
      return this.d;
    }

    public b e()
    {
      AppMethodBeat.i(98866);
      b localb = new b(b(), this.d);
      localb.a(c());
      AppMethodBeat.o(98866);
      return localb;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fd
 * JD-Core Version:    0.6.2
 */