package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

public final class z$a extends k
{
  private r.a gvZ;
  private r.b gwa;

  public z$a()
  {
    AppMethodBeat.i(108436);
    this.gvZ = new r.a();
    this.gwa = new r.b();
    AppMethodBeat.o(108436);
  }

  public final l.d ZR()
  {
    return this.gvZ;
  }

  public final l.e ZS()
  {
    return this.gwa;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 481;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/emailreg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.z.a
 * JD-Core Version:    0.6.2
 */