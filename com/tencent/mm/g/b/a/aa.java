package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class aa extends a
{
  public long cVT = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77602);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVT);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77602);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77603);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ClickScene:").append(this.cVT);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77603);
    return localObject;
  }

  public final int getId()
  {
    return 16867;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.aa
 * JD-Core Version:    0.6.2
 */