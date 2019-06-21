package com.tencent.liteav.beauty.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends b
{
  private static final String r;
  private float A = 0.0F;
  private f s;
  private c.a t;
  private p u = null;
  private int v = -1;
  private int w = -1;
  private float x = 0.0F;
  private float y = 0.0F;
  private float z = 0.0F;

  static
  {
    AppMethodBeat.i(66932);
    r = c.class.getSimpleName();
    AppMethodBeat.o(66932);
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat2) * paramFloat1 + paramFloat2;
  }

  private static float b(float paramFloat)
  {
    AppMethodBeat.i(66930);
    float f;
    if (paramFloat > 1.0F)
      if (paramFloat < 2.5D)
      {
        f = a((paramFloat - 1.0F) / 1.5F, 1.0F, 4.1F);
        paramFloat = f / 10.0F;
        AppMethodBeat.o(66930);
      }
    while (true)
    {
      return paramFloat;
      if (paramFloat < 4.0F)
      {
        f = a((paramFloat - 2.5F) / 1.5F, 4.1F, 5.6F);
        break;
      }
      if (paramFloat < 5.5D)
      {
        f = a((paramFloat - 4.0F) / 1.5F, 5.6F, 6.8F);
        break;
      }
      f = paramFloat;
      if (paramFloat > 7.0D)
        break;
      f = a((paramFloat - 5.5F) / 1.5F, 6.8F, 7.0F);
      break;
      paramFloat = 0.1F;
      AppMethodBeat.o(66930);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66923);
    if ((this.v == paramInt1) && (this.w == paramInt2))
      AppMethodBeat.o(66923);
    while (true)
    {
      return;
      new StringBuilder("onOutputSizeChanged mFrameWidth = ").append(paramInt1).append("  mFrameHeight = ").append(paramInt2);
      this.v = paramInt1;
      this.w = paramInt2;
      b(this.v, this.w);
      AppMethodBeat.o(66923);
    }
  }

  public int b(int paramInt)
  {
    AppMethodBeat.i(66922);
    if ((this.x <= 0.0F) && (this.y <= 0.0F))
    {
      i = paramInt;
      if (this.z <= 0.0F);
    }
    else
    {
      if (this.x == 0.0F)
        break label90;
    }
    label90: for (int i = this.s.b(paramInt); ; i = paramInt)
    {
      i = this.t.a(i, paramInt, paramInt);
      paramInt = i;
      if (this.A > 0.0F)
        paramInt = this.u.b(i);
      AppMethodBeat.o(66922);
      return paramInt;
    }
  }

  public boolean b(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(66924);
    this.v = paramInt1;
    this.w = paramInt2;
    new StringBuilder("init mFrameWidth = ").append(paramInt1).append("  mFrameHeight = ").append(paramInt2);
    if (this.s == null)
    {
      this.s = new f();
      this.s.a(true);
      if (!this.s.a())
        AppMethodBeat.o(66924);
    }
    while (true)
    {
      return bool;
      this.s.a(this.v, this.w);
      if (this.t == null)
      {
        this.t = new c.a();
        this.t.a(true);
        if (!this.t.a())
          AppMethodBeat.o(66924);
      }
      else
      {
        this.t.a(this.v, this.w);
        if (this.u == null)
        {
          this.u = new p();
          this.u.a(true);
          if (!this.u.a())
            AppMethodBeat.o(66924);
        }
        else
        {
          this.u.a(this.v, this.w);
          AppMethodBeat.o(66924);
          bool = true;
        }
      }
    }
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(66926);
    this.x = paramInt;
    if (this.t != null)
      this.t.a(paramInt);
    AppMethodBeat.o(66926);
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66927);
    this.y = paramInt;
    if (this.t != null)
      this.t.b(paramInt);
    AppMethodBeat.o(66927);
  }

  public void e()
  {
    AppMethodBeat.i(66925);
    if (this.t != null)
    {
      this.t.d();
      this.t = null;
    }
    if (this.s != null)
    {
      this.s.d();
      this.s = null;
    }
    if (this.u != null)
    {
      this.u.d();
      this.u = null;
    }
    AppMethodBeat.o(66925);
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(66928);
    this.z = paramInt;
    if (this.t != null)
      this.t.c(paramInt);
    AppMethodBeat.o(66928);
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(66929);
    this.A = (paramInt / 15.0F);
    if (this.u != null)
      this.u.a(this.A);
    AppMethodBeat.o(66929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.c
 * JD-Core Version:    0.6.2
 */