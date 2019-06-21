package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.r.a;
import com.tencent.mm.protocal.r.b;

public final class l extends k
{
  private final r.a ftd;
  private final r.b fte;

  public l()
  {
    AppMethodBeat.i(58161);
    this.ftd = new r.a();
    this.fte = new r.b();
    AppMethodBeat.o(58161);
  }

  protected final l.d ZR()
  {
    return this.ftd;
  }

  public final l.e ZS()
  {
    return this.fte;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 381;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getcert";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.l
 * JD-Core Version:    0.6.2
 */