package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bj extends a
{
  public long cVT = 0L;
  public long dcm = 0L;
  public long dcn = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77616);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcn);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77616);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77617);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ClickScene:").append(this.cVT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ReportValue:").append(this.dcm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EntryScene:").append(this.dcn);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77617);
    return localObject;
  }

  public final int getId()
  {
    return 15661;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bj
 * JD-Core Version:    0.6.2
 */