package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class h extends k
{
  i.a lSx;
  i.b lSy;

  h()
  {
    AppMethodBeat.i(65);
    this.lSx = new i.a();
    this.lSy = new i.b();
    AppMethodBeat.o(65);
  }

  public final l.d ZR()
  {
    return this.lSx;
  }

  public final l.e ZS()
  {
    return this.lSy;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 733;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getbioconfigrsa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.h
 * JD-Core Version:    0.6.2
 */