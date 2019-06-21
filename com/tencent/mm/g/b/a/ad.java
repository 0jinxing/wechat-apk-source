package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ad extends a
{
  private String cYr = "";
  public long cYs = 0L;
  public long cYt = 0L;
  public long cYu = 0L;
  private String cYv = "";
  public long cYw = 0L;
  public long cYx = 0L;
  private String cYy = "";
  private String cYz = "";

  public final String Fj()
  {
    AppMethodBeat.i(70617);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYz);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(70617);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(70618);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("statId:").append(this.cYr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("statEvent:").append(this.cYs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("statTimeStamp:").append(this.cYt);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("success:").append(this.cYu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("searchType:").append(this.cYw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hasInitData:").append(this.cYx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("netType:").append(this.cYy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("jsError:").append(this.cYz);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(70618);
    return localObject;
  }

  public final ad eY(String paramString)
  {
    AppMethodBeat.i(70613);
    this.cYr = t("statId", paramString, true);
    AppMethodBeat.o(70613);
    return this;
  }

  public final ad eZ(String paramString)
  {
    AppMethodBeat.i(70614);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(70614);
    return this;
  }

  public final ad fa(String paramString)
  {
    AppMethodBeat.i(70615);
    this.cYy = t("netType", paramString, true);
    AppMethodBeat.o(70615);
    return this;
  }

  public final ad fb(String paramString)
  {
    AppMethodBeat.i(70616);
    this.cYz = t("jsError", paramString, true);
    AppMethodBeat.o(70616);
    return this;
  }

  public final int getId()
  {
    return 14452;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ad
 * JD-Core Version:    0.6.2
 */