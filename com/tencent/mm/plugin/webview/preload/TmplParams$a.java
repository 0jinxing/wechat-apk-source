package com.tencent.mm.plugin.webview.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class TmplParams$a
{
  String cWP;
  int upR;
  int upS;
  String upT;
  String upU;
  String upV;
  String upW;
  long upX;
  int upY;

  public final a IW(int paramInt)
  {
    this.upR = paramInt;
    return this;
  }

  public final a IX(int paramInt)
  {
    this.upS = paramInt;
    return this;
  }

  public final a IY(int paramInt)
  {
    this.upY = paramInt;
    return this;
  }

  public final a aeW(String paramString)
  {
    this.upT = paramString;
    return this;
  }

  public final a aeX(String paramString)
  {
    this.upU = paramString;
    return this;
  }

  public final a aeY(String paramString)
  {
    this.cWP = paramString;
    return this;
  }

  public final a aeZ(String paramString)
  {
    this.upV = paramString;
    return this;
  }

  public final a afa(String paramString)
  {
    this.upW = paramString;
    return this;
  }

  public final TmplParams cYS()
  {
    AppMethodBeat.i(80446);
    TmplParams localTmplParams = new TmplParams();
    localTmplParams.jSV = this.upR;
    localTmplParams.version = this.upS;
    localTmplParams.jVi = this.upT;
    localTmplParams.upO = this.upU;
    localTmplParams.cvZ = this.cWP;
    localTmplParams.upQ = this.upY;
    localTmplParams.qOg = this.upX;
    localTmplParams.jSY = this.upV;
    localTmplParams.upP = this.upW;
    AppMethodBeat.o(80446);
    return localTmplParams;
  }

  public final a lR(long paramLong)
  {
    this.upX = paramLong;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.TmplParams.a
 * JD-Core Version:    0.6.2
 */