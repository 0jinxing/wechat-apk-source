package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bo extends a
{
  public long dcW = 0L;
  public long dcY = 0L;
  private String dcZ = "";
  public long dda = 0L;
  public long ddb = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128644);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dcY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dda);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcW);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(128644);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(128645);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("DeleteReason:").append(this.dcY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Appid:").append(this.dcZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DebugType:").append(this.dda);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DeleteCount:").append(this.ddb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AbtestStatus:").append(this.dcW);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128645);
    return localObject;
  }

  public final int getId()
  {
    return 15402;
  }

  public final bo gk(String paramString)
  {
    AppMethodBeat.i(128643);
    this.dcZ = t("Appid", paramString, true);
    AppMethodBeat.o(128643);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bo
 * JD-Core Version:    0.6.2
 */