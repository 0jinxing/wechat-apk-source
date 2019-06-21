package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bs extends br
{
  public bs(bp parambp)
  {
    super(parambp);
  }

  public final cv a()
  {
    AppMethodBeat.i(98577);
    en.d().a(1);
    cv localcv = super.a();
    AppMethodBeat.o(98577);
    return localcv;
  }

  protected final cv a(int paramInt)
  {
    AppMethodBeat.i(98576);
    Object localObject = new cs(this.c, this.a.d, this.a.c, this.a.b, paramInt, this.a.g, false, 0, this.a.l, en.d().f(), this.a.o);
    ((cs)localObject).a = this.b;
    ((cs)localObject).o = this.d;
    ((cs)localObject).a("app");
    this.e = ((cq)localObject);
    this.e.l = this.a.n;
    localObject = this.e.a();
    AppMethodBeat.o(98576);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bs
 * JD-Core Version:    0.6.2
 */