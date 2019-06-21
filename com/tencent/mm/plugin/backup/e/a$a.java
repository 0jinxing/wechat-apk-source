package com.tencent.mm.plugin.backup.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

public final class a$a extends k
{
  private final k.a juo;
  private final k.b jup;

  public a$a()
  {
    AppMethodBeat.i(17311);
    this.juo = new k.a();
    this.jup = new k.b();
    AppMethodBeat.o(17311);
  }

  public final l.d ZR()
  {
    return this.juo;
  }

  public final l.e ZS()
  {
    return this.jup;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 1000;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.e.a.a
 * JD-Core Version:    0.6.2
 */