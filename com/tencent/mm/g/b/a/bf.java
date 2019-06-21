package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bf extends a
{
  public long cVR = 0L;
  private String dbU = "";
  public long dbV = 0L;
  private long dbW = 0L;
  public long dbX = 0L;
  private long dbY = 0L;
  private String dbZ = "";
  public long dca = 0L;
  private String dcb = "";

  public final String Fj()
  {
    AppMethodBeat.i(77612);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dca);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcb);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77612);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77613);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("BiilNo:").append(this.dbU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("failReason:").append(this.dbV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("playerErrCode:").append(this.dbW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("type:").append(this.dbX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("retCode:").append(this.dbY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("content:").append(this.dbZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("amount:").append(this.dca);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("packId:").append(this.dcb);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77613);
    return localObject;
  }

  public final bf fV(String paramString)
  {
    AppMethodBeat.i(77609);
    this.dbU = t("BiilNo", paramString, true);
    AppMethodBeat.o(77609);
    return this;
  }

  public final bf fW(String paramString)
  {
    AppMethodBeat.i(77610);
    this.dbZ = t("content", paramString, true);
    AppMethodBeat.o(77610);
    return this;
  }

  public final bf fX(String paramString)
  {
    AppMethodBeat.i(77611);
    this.dcb = t("packId", paramString, true);
    AppMethodBeat.o(77611);
    return this;
  }

  public final int getId()
  {
    return 14404;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bf
 * JD-Core Version:    0.6.2
 */