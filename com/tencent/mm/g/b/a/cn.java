package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cn extends a
{
  public long dha = 0L;
  public long dhb = 0L;
  private String dhc = "";
  public long dhd = 0L;
  private String dhe = "";
  private String dhf = "";

  public final String Fj()
  {
    AppMethodBeat.i(91272);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dha);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhf);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91272);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91273);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("actionType:").append(this.dha);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("clientTimestamp:").append(this.dhb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appId:").append(this.dhc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("serviceType:").append(this.dhd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("statBuffer:").append(this.dhe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("switchId:").append(this.dhf);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91273);
    return localObject;
  }

  public final int getId()
  {
    return 14688;
  }

  public final cn hr(String paramString)
  {
    AppMethodBeat.i(91269);
    this.dhc = t("appId", paramString, true);
    AppMethodBeat.o(91269);
    return this;
  }

  public final cn hs(String paramString)
  {
    AppMethodBeat.i(91270);
    this.dhe = t("statBuffer", paramString, true);
    AppMethodBeat.o(91270);
    return this;
  }

  public final cn ht(String paramString)
  {
    AppMethodBeat.i(91271);
    this.dhf = t("switchId", paramString, true);
    AppMethodBeat.o(91271);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cn
 * JD-Core Version:    0.6.2
 */