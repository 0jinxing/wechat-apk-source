package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class kn$a
{
  private Integer a;
  private Integer b;
  private kq c;
  private ko d;
  private boolean e;

  private kn$a()
  {
    AppMethodBeat.i(100250);
    this.a = null;
    this.b = null;
    this.c = new kr();
    this.d = new kp();
    this.e = false;
    AppMethodBeat.o(100250);
  }

  public a a(int paramInt)
  {
    AppMethodBeat.i(100251);
    this.b = Integer.valueOf(paramInt);
    AppMethodBeat.o(100251);
    return this;
  }

  public <T, S extends kt> kn<T, S> a()
  {
    AppMethodBeat.i(100253);
    if (this.a == null)
      this.a = Integer.valueOf(4);
    if (this.b == null)
      this.b = Integer.valueOf((int)Math.round(this.a.intValue() * 0.4D));
    kn localkn = new kn(new kf(this.b.intValue(), this.a.intValue(), this.d, this.c), null);
    AppMethodBeat.o(100253);
    return localkn;
  }

  public a b(int paramInt)
  {
    AppMethodBeat.i(100252);
    this.a = Integer.valueOf(paramInt);
    AppMethodBeat.o(100252);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kn.a
 * JD-Core Version:    0.6.2
 */