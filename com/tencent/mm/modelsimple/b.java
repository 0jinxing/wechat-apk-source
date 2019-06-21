package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.w.a;
import com.tencent.mm.protocal.w.b;

final class b extends k
{
  private final w.a fOn;
  private final w.b fOo;

  b()
  {
    AppMethodBeat.i(78563);
    this.fOn = new w.a();
    this.fOo = new w.b();
    AppMethodBeat.o(78563);
  }

  public final l.d ZR()
  {
    return this.fOn;
  }

  public final l.e ZS()
  {
    return this.fOo;
  }

  public final int getType()
  {
    return 26;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/sendcard";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.b
 * JD-Core Version:    0.6.2
 */