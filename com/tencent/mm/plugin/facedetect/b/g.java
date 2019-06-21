package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class g extends k
{
  k.a lSv;
  k.b lSw;

  g()
  {
    AppMethodBeat.i(64);
    this.lSv = new k.a();
    this.lSw = new k.b();
    AppMethodBeat.o(64);
  }

  public final l.d ZR()
  {
    return this.lSv;
  }

  public final l.e ZS()
  {
    return this.lSw;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 930;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/verifyfacersa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.g
 * JD-Core Version:    0.6.2
 */