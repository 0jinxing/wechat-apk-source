package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bl extends a
{
  public long dck = 0L;
  private String dcp = "";
  public long dcq = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(56605);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dck);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcq);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(56605);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(56606);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ReportScene:").append(this.dck);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TransferUserName:").append(this.dcp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TransferAmount:").append(this.dcq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(56606);
    return localObject;
  }

  public final bl ge(String paramString)
  {
    AppMethodBeat.i(56604);
    this.dcp = t("TransferUserName", paramString, true);
    AppMethodBeat.o(56604);
    return this;
  }

  public final int getId()
  {
    return 16016;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bl
 * JD-Core Version:    0.6.2
 */