package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

public final class ad$a extends k
{
  private final t.a gwe;
  private final t.b gwf;

  public ad$a()
  {
    AppMethodBeat.i(108456);
    this.gwe = new t.a();
    this.gwf = new t.b();
    AppMethodBeat.o(108456);
  }

  public final l.d ZR()
  {
    return this.gwe;
  }

  public final l.e ZS()
  {
    return this.gwf;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 429;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getsuggestalias";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ad.a
 * JD-Core Version:    0.6.2
 */