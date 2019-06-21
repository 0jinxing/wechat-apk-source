package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k$a
{
  public String bssid;
  public int cIb;
  public String cuH;
  public String cuI;
  public String ehr;
  public String kBq;
  private int mub;
  public String muc;
  public String mud;
  public int mue;
  public long muf;
  public String mug;
  public String muh;
  private long mui;
  public int result;
  public String ssid;

  public final k byq()
  {
    AppMethodBeat.i(20607);
    k localk = new k((byte)0);
    k.a(localk, this.ssid);
    k.b(localk, this.bssid);
    k.c(localk, this.cuI);
    k.d(localk, this.cuH);
    k.a(localk, this.mub);
    k.e(localk, this.muc);
    k.f(localk, this.mud);
    k.g(localk, this.kBq);
    k.b(localk, this.mue);
    k.a(localk, Integer.valueOf("1" + String.format("%03d", new Object[] { Integer.valueOf(this.mue) }) + String.format("%03d", new Object[] { Long.valueOf(this.muf) })).intValue());
    k.h(localk, this.mug);
    k.c(localk, this.result);
    k.d(localk, this.cIb);
    k.i(localk, this.muh);
    k.b(localk, this.mui);
    k.j(localk, this.ehr);
    AppMethodBeat.o(20607);
    return localk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.k.a
 * JD-Core Version:    0.6.2
 */