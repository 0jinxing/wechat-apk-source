package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bi extends a
{
  public long dck = 0L;
  public long dcl = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(56602);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dck);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcl);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(56602);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(56603);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ReportScene:").append(this.dck);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ResetScece:").append(this.dcl);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(56603);
    return localObject;
  }

  public final int getId()
  {
    return 15522;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bi
 * JD-Core Version:    0.6.2
 */