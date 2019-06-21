package com.tencent.mm.plugin.appbrand.b;

abstract class h extends com.tencent.mm.plugin.appbrand.report.h
{
  private final i gXa;

  h(i parami)
  {
    this.gXa = parami;
  }

  public void enter()
  {
    super.enter();
    this.gXa.a(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.h
 * JD-Core Version:    0.6.2
 */