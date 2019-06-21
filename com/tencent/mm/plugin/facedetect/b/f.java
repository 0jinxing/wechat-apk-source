package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class f extends k
{
  j.a lSt;
  j.b lSu;

  f()
  {
    AppMethodBeat.i(63);
    this.lSt = new j.a();
    this.lSu = new j.b();
    AppMethodBeat.o(63);
  }

  public final l.d ZR()
  {
    return this.lSt;
  }

  public final l.e ZS()
  {
    return this.lSu;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 931;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/registerfacersa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.f
 * JD-Core Version:    0.6.2
 */