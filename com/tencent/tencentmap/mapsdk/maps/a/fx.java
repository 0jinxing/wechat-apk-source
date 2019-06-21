package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class fx
{
  public static final fx g;
  public static final fx h;
  public static final fx i;
  public int a;
  public double[] b;
  public long c = -1L;
  public boolean d = false;
  public boolean e;
  public Runnable f;
  private fy j;

  static
  {
    AppMethodBeat.i(98949);
    g = new fx(1, null);
    h = new fx(2, null, true);
    i = new fx(104, null);
    AppMethodBeat.o(98949);
  }

  public fx()
  {
  }

  public fx(int paramInt, double[] paramArrayOfDouble)
  {
    this(paramInt, paramArrayOfDouble, false);
  }

  public fx(int paramInt, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramArrayOfDouble;
    this.e = paramBoolean;
  }

  public fx(Runnable paramRunnable)
  {
    this.a = 6;
    this.f = paramRunnable;
  }

  protected boolean a()
  {
    return true;
  }

  boolean a(fz.a parama)
  {
    AppMethodBeat.i(98946);
    if (this.j != null)
      this.j.a();
    boolean bool = a();
    parama.a(this);
    AppMethodBeat.o(98946);
    return bool;
  }

  public void b()
  {
    AppMethodBeat.i(98947);
    if (this.j != null)
      this.j.b();
    AppMethodBeat.o(98947);
  }

  public void c()
  {
    AppMethodBeat.i(98948);
    if (this.j != null)
      this.j.c();
    AppMethodBeat.o(98948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fx
 * JD-Core Version:    0.6.2
 */