package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class kw<T extends kv>
{
  private final ku<T> a;
  private final ku<T> b;
  private Float c;
  private final Float d;

  public kw(List<T> paramList1, List<T> paramList2)
  {
    AppMethodBeat.i(100270);
    this.c = null;
    this.a = new ku(paramList1);
    this.b = new ku(paramList2);
    this.d = Float.valueOf(this.a.b().a().h() + this.b.b().a().h());
    AppMethodBeat.o(100270);
  }

  public final ku<T> a()
  {
    return this.a;
  }

  public final ku<T> b()
  {
    return this.b;
  }

  public final float c()
  {
    AppMethodBeat.i(100271);
    if (this.c == null)
      this.c = Float.valueOf(this.a.b().a().g() + this.b.b().a().g());
    float f = this.c.floatValue();
    AppMethodBeat.o(100271);
    return f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kw
 * JD-Core Version:    0.6.2
 */