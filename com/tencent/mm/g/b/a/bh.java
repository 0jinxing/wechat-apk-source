package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bh extends a
{
  public long cVR = 0L;
  public long cVS = 0L;
  private String dcj = "";

  public final String Fj()
  {
    AppMethodBeat.i(77614);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcj);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77614);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77615);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Action:").append(this.cVS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("OrderId:").append(this.dcj);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77615);
    return localObject;
  }

  public final bh gd(String paramString)
  {
    AppMethodBeat.i(138575);
    this.dcj = t("OrderId", paramString, true);
    AppMethodBeat.o(138575);
    return this;
  }

  public final int getId()
  {
    return 17072;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bh
 * JD-Core Version:    0.6.2
 */