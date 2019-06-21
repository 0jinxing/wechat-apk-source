package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.b.h;
import com.tencent.liteav.beauty.b.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a extends com.tencent.liteav.beauty.b.b
{
  private int A = 0;
  private float B = 1.0F;
  private final float C = 0.7F;
  private float D = 0.8F;
  private float E = 2.0F;
  private int F = 0;
  private int G = 0;
  private int H = 0;
  private int I = 0;
  private c r = null;
  private d s = null;
  private e t = null;
  private h u = null;
  private o v = null;
  private b w = null;
  private String x = "TXCBeauty2Filter";
  private int y = 0;
  private int z = 0;

  private boolean c(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(66973);
    this.F = paramInt1;
    this.G = paramInt2;
    this.H = paramInt1;
    this.I = paramInt2;
    if (1.0F != this.E)
    {
      this.H = ((int)(this.H / this.E));
      this.I = ((int)(this.I / this.E));
    }
    TXCLog.i(this.x, "mResampleRatio " + this.E + " mResampleWidth " + this.H + " mResampleHeight " + this.I);
    boolean bool2;
    if (this.w == null)
    {
      this.w = new b();
      this.w.a(true);
      if (!this.w.a())
      {
        TXCLog.e(this.x, "mBeautyBlendFilter init failed!!, break init");
        AppMethodBeat.o(66973);
        bool2 = bool1;
      }
    }
    while (true)
    {
      return bool2;
      this.w.a(paramInt1, paramInt2);
      if (this.s == null)
      {
        this.s = new d();
        this.s.a(true);
        if (!this.s.a())
        {
          TXCLog.e(this.x, "m_horizontalFilter init failed!!, break init");
          AppMethodBeat.o(66973);
          bool2 = bool1;
        }
      }
      else
      {
        this.s.a(this.H, this.I);
        if (this.t == null)
        {
          this.t = new e();
          this.t.a(true);
          if (1.0F == this.E);
          for (bool2 = false; ; bool2 = true)
          {
            this.t.b(bool2);
            if (this.t.a())
              break label335;
            TXCLog.e(this.x, "m_verticalFilter init failed!!, break init");
            AppMethodBeat.o(66973);
            bool2 = bool1;
            break;
          }
        }
        label335: this.t.a(this.H, this.I);
        if (this.u == null)
        {
          this.u = new h(1.0F);
          this.u.a(true);
          if (!this.u.a())
          {
            TXCLog.e(this.x, "m_gammaFilter init failed!!, break init");
            AppMethodBeat.o(66973);
            bool2 = bool1;
          }
        }
        else
        {
          this.u.a(this.H, this.I);
          if (this.v == null)
          {
            this.v = new o();
            this.v.a(true);
            if (!this.v.a())
            {
              TXCLog.e(this.x, "mSharpenFilter init failed!!, break init");
              AppMethodBeat.o(66973);
              bool2 = bool1;
            }
          }
          else
          {
            this.v.a(paramInt1, paramInt2);
            AppMethodBeat.o(66973);
            bool2 = true;
          }
        }
      }
    }
  }

  private void g(int paramInt)
  {
    AppMethodBeat.i(66970);
    this.B = (1.0F - paramInt / 50.0F);
    if (this.u != null)
      this.u.a(this.B);
    AppMethodBeat.o(66970);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66966);
    if ((this.e == paramInt1) && (this.f == paramInt2))
      AppMethodBeat.o(66966);
    while (true)
    {
      return;
      this.e = paramInt1;
      this.f = paramInt2;
      c(paramInt1, paramInt2);
      AppMethodBeat.o(66966);
    }
  }

  public int b(int paramInt)
  {
    AppMethodBeat.i(66972);
    if (1.0F != this.E)
      GLES20.glViewport(0, 0, this.H, this.I);
    int i = this.s.b(paramInt);
    int j = this.t.b(i, paramInt);
    if (1.0F != this.E)
      GLES20.glViewport(0, 0, this.F, this.G);
    i = j;
    if (this.D > 0.7F)
      i = this.v.b(j);
    paramInt = this.w.b(i, paramInt);
    AppMethodBeat.o(66972);
    return paramInt;
  }

  public boolean b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66965);
    boolean bool = c(paramInt1, paramInt2);
    AppMethodBeat.o(66965);
    return bool;
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(66967);
    if (this.t != null)
      this.t.a(paramInt / 10.0F);
    this.y = paramInt;
    g(paramInt);
    AppMethodBeat.o(66967);
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66968);
    if (this.w != null)
      this.w.a(paramInt / 10.0F);
    this.z = paramInt;
    AppMethodBeat.o(66968);
  }

  public void e()
  {
    AppMethodBeat.i(66975);
    super.e();
    q();
    AppMethodBeat.o(66975);
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(66969);
    if (this.w != null)
      this.w.b(paramInt / 10.0F);
    this.A = paramInt;
    AppMethodBeat.o(66969);
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(66971);
    this.D = (0.7F + paramInt / 12.0F);
    TXCLog.i(this.x, "set mSharpenLevel ".concat(String.valueOf(paramInt)));
    if (this.v != null)
      this.v.a(this.D);
    AppMethodBeat.o(66971);
  }

  void q()
  {
    AppMethodBeat.i(66974);
    if (this.w != null)
    {
      this.w.d();
      this.w = null;
    }
    if (this.s != null)
    {
      this.s.d();
      this.s = null;
    }
    if (this.t != null)
    {
      this.t.d();
      this.t = null;
    }
    if (this.u != null)
    {
      this.u.d();
      this.u = null;
    }
    if (this.v != null)
    {
      this.v.d();
      this.v = null;
    }
    AppMethodBeat.o(66974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.a.a
 * JD-Core Version:    0.6.2
 */