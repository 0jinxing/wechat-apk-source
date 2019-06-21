package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.protocal.v.b;

public final class az extends k
{
  private final v.a flU;
  private final v.b flV;

  public az()
  {
    AppMethodBeat.i(58106);
    this.flU = new v.a();
    this.flV = new v.b();
    AppMethodBeat.o(58106);
  }

  public final l.d ZR()
  {
    return this.flU;
  }

  public final l.e ZS()
  {
    return this.flV;
  }

  public final int getType()
  {
    return 126;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/newreg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.az
 * JD-Core Version:    0.6.2
 */