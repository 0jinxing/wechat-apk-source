package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ba extends a
{
  public long cVS = 0L;
  public long daR = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(73676);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.daR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVS);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73676);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73677);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ThirdAppType:").append(this.daR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Action:").append(this.cVS);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73677);
    return localObject;
  }

  public final int getId()
  {
    return 16996;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ba
 * JD-Core Version:    0.6.2
 */