package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bg extends a
{
  public long dcc = 0L;
  public long dcd = 0L;
  private String dce = "";
  private String dcf = "";
  private String dcg = "";
  private String dch = "";
  private String dci = "";

  public final String Fj()
  {
    AppMethodBeat.i(56600);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dcc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dce);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dcg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dch);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dci);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(56600);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(56601);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("PayType:").append(this.dcc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CallbackType:").append(this.dcd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SourceH5Url:").append(this.dce);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SourceAppUsername:").append(this.dcf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SourceAppPath:").append(this.dcg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TargetAppUsername:").append(this.dch);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TargetAppPath:").append(this.dci);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(56601);
    return localObject;
  }

  public final bg fY(String paramString)
  {
    AppMethodBeat.i(56595);
    this.dce = t("SourceH5Url", paramString, true);
    AppMethodBeat.o(56595);
    return this;
  }

  public final bg fZ(String paramString)
  {
    AppMethodBeat.i(56596);
    this.dcf = t("SourceAppUsername", paramString, true);
    AppMethodBeat.o(56596);
    return this;
  }

  public final bg ga(String paramString)
  {
    AppMethodBeat.i(56597);
    this.dcg = t("SourceAppPath", paramString, true);
    AppMethodBeat.o(56597);
    return this;
  }

  public final bg gb(String paramString)
  {
    AppMethodBeat.i(56598);
    this.dch = t("TargetAppUsername", paramString, true);
    AppMethodBeat.o(56598);
    return this;
  }

  public final bg gc(String paramString)
  {
    AppMethodBeat.i(56599);
    this.dci = t("TargetAppPath", paramString, true);
    AppMethodBeat.o(56599);
    return this;
  }

  public final int getId()
  {
    return 16310;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bg
 * JD-Core Version:    0.6.2
 */