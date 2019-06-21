package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cp;
import com.tencent.tencentmap.mapsdk.a.dp;

public class iv
  implements gf
{
  private iz a;

  public iv(iz paramiz)
  {
    this.a = paramiz;
  }

  public void a()
  {
  }

  public boolean a(float paramFloat)
  {
    return false;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99876);
    if (this.a == null)
      AppMethodBeat.o(99876);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99876);
      }
      else if ((this.a.k != null) && (this.a.H))
      {
        bool = this.a.k.a(paramFloat1, paramFloat2);
        AppMethodBeat.o(99876);
      }
      else
      {
        AppMethodBeat.o(99876);
      }
    }
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, double paramDouble1, double paramDouble2)
  {
    return false;
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, float paramFloat)
  {
    return false;
  }

  public boolean b()
  {
    return false;
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99877);
    if (this.a == null)
      AppMethodBeat.o(99877);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99877);
      }
      else
      {
        if (!this.a.d(paramFloat1, paramFloat2))
          this.a.b(paramFloat1, paramFloat2);
        if ((this.a.k != null) && (this.a.H))
        {
          bool = this.a.k.b(paramFloat1, paramFloat2);
          AppMethodBeat.o(99877);
        }
        else
        {
          AppMethodBeat.o(99877);
        }
      }
    }
  }

  public boolean c()
  {
    return false;
  }

  public boolean c(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99878);
    if (this.a == null)
      AppMethodBeat.o(99878);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99878);
      }
      else if (this.a.k != null)
      {
        bool = this.a.k.c(paramFloat1, paramFloat2);
        AppMethodBeat.o(99878);
      }
      else
      {
        AppMethodBeat.o(99878);
      }
    }
  }

  public boolean d()
  {
    return false;
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99879);
    if (this.a == null)
      AppMethodBeat.o(99879);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99879);
      }
      else if (this.a.k != null)
      {
        bool = this.a.k.d(paramFloat1, paramFloat2);
        AppMethodBeat.o(99879);
      }
      else
      {
        AppMethodBeat.o(99879);
      }
    }
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99880);
    if (this.a == null)
      AppMethodBeat.o(99880);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99880);
      }
      else
      {
        this.a.a(paramFloat1, paramFloat2);
        if (this.a.k != null)
        {
          bool = this.a.k.e(paramFloat1, paramFloat2);
          AppMethodBeat.o(99880);
        }
        else
        {
          AppMethodBeat.o(99880);
        }
      }
    }
  }

  public boolean f(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean g(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean h(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean i(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99881);
    if (this.a == null)
      AppMethodBeat.o(99881);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99881);
      }
      else
      {
        iz localiz = this.a;
        localiz.L += 1;
        if (this.a.k != null)
        {
          bool = this.a.k.f(paramFloat1, paramFloat2);
          AppMethodBeat.o(99881);
        }
        else
        {
          AppMethodBeat.o(99881);
        }
      }
    }
  }

  public boolean j(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99882);
    if (this.a == null)
      AppMethodBeat.o(99882);
    while (true)
    {
      return bool;
      if (!this.a.H)
      {
        AppMethodBeat.o(99882);
      }
      else
      {
        iz localiz = this.a;
        Object localObject;
        int i;
        if (this.a.L > 0)
        {
          localObject = this.a;
          i = ((iz)localObject).L - 1;
          ((iz)localObject).L = i;
        }
        while (true)
        {
          localiz.L = i;
          if ((!this.a.K) || (!this.a.J) || (this.a.L != 0))
            break label151;
          localObject = this.a.p();
          if (localObject != null)
            break label142;
          AppMethodBeat.o(99882);
          break;
          i = 0;
        }
        label142: this.a.onCameraChangeFinished((cp)localObject);
        label151: if (this.a.k != null)
        {
          bool = this.a.k.g(paramFloat1, paramFloat2);
          AppMethodBeat.o(99882);
        }
        else
        {
          AppMethodBeat.o(99882);
        }
      }
    }
  }

  public boolean k(float paramFloat1, float paramFloat2)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iv
 * JD-Core Version:    0.6.2
 */