package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;

public final class f$b
{
  public long mvE;
  public String mvO;
  public String mvP;
  public String mvQ;
  public boolean mvR;

  f$b(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    AppMethodBeat.i(20720);
    this.mvO = m.Mv(paramString1);
    this.mvP = paramString2;
    this.mvQ = paramString3;
    this.mvE = paramLong;
    this.mvR = false;
    AppMethodBeat.o(20720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.f.b
 * JD-Core Version:    0.6.2
 */