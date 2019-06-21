package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.os.Message;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.dg;

public class hy
{
  private iz a;
  private dg b;
  private int c = 0;
  private hy.a d;
  private boolean e = false;

  public hy(iz paramiz, dg paramdg)
  {
    this.a = paramiz;
    this.b = paramdg;
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(99701);
    if (this.a == null)
      AppMethodBeat.o(99701);
    while (true)
    {
      return;
      if (this.c <= 0)
        a((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F), 0);
      this.a.b().b(this.c, (int)(paramFloat4 * 255.0F));
      this.a.b().a();
      AppMethodBeat.o(99701);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99700);
    if ((this.a != null) && (this.b != null))
    {
      this.c = this.a.b().a(paramInt1, paramInt2, paramInt3, paramInt4, -1, this.b.c());
      this.a.h();
    }
    AppMethodBeat.o(99700);
  }

  private int c(int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }

  private int d(int paramInt)
  {
    return paramInt & 0xFF;
  }

  private void d()
  {
    AppMethodBeat.i(99702);
    if (this.a != null)
    {
      this.a.b().e(this.c);
      this.a.b().a();
      this.c = -1;
    }
    AppMethodBeat.o(99702);
  }

  private int e(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }

  public void a(int paramInt)
  {
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(99698);
    if ((paramLong > 0L) && (this.d != null))
    {
      this.d.b(paramLong);
      AppMethodBeat.o(99698);
    }
    while (true)
    {
      return;
      if (this.d != null)
        this.d.a();
      d();
      b();
      AppMethodBeat.o(99698);
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99699);
    this.e = paramBoolean;
    if (paramBoolean)
    {
      a();
      AppMethodBeat.o(99699);
    }
    while (true)
    {
      return;
      d();
      AppMethodBeat.o(99699);
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(99697);
    boolean bool;
    if (this.b == null)
    {
      bool = false;
      AppMethodBeat.o(99697);
    }
    while (true)
    {
      return bool;
      int i = this.b.a();
      if (this.d == null)
        this.d = new hy.a(this, b(i), c(i), d(i), e(i), -1);
      this.d.a(this.b.b());
      bool = true;
      AppMethodBeat.o(99697);
    }
  }

  public int b(int paramInt)
  {
    return paramInt >> 16 & 0xFF;
  }

  public void b()
  {
    this.d = null;
    this.a = null;
    this.b = null;
  }

  public boolean c()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hy
 * JD-Core Version:    0.6.2
 */