package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cu extends a
{
  public long cYo = 0L;
  public long dig = 0L;
  public long dih = 0L;
  public long dii = 0L;
  public long dij = 0L;
  private String dik = "";
  private String dil = "";

  public final String Fj()
  {
    AppMethodBeat.i(73313);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dig);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dih);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dii);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dij);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dik);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dil);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73313);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73314);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ExptId:").append(this.dig);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("GroupId:").append(this.dih);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptSeq:").append(this.dii);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartTimeStampSec:").append(this.cYo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EndTimeStampSec:").append(this.dij);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptKey:").append(this.dik);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExptVal:").append(this.dil);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73314);
    return localObject;
  }

  public final int getId()
  {
    return 15452;
  }

  public final cu hJ(String paramString)
  {
    AppMethodBeat.i(73311);
    this.dik = t("ExptKey", paramString, true);
    AppMethodBeat.o(73311);
    return this;
  }

  public final cu hK(String paramString)
  {
    AppMethodBeat.i(73312);
    this.dil = t("ExptVal", paramString, false);
    AppMethodBeat.o(73312);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cu
 * JD-Core Version:    0.6.2
 */