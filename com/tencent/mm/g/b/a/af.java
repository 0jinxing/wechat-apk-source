package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class af extends a
{
  private String cWe = "";
  private String cYD = "";
  public long cYE = 0L;
  private String cYF = "";
  private String cYG = "";

  public final String Fj()
  {
    AppMethodBeat.i(91267);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYG);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91267);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91268);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sessionId:").append(this.cWe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isChange:").append(this.cYE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appidBefore:").append(this.cYF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appidAfter:").append(this.cYG);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91268);
    return localObject;
  }

  public final af ff(String paramString)
  {
    AppMethodBeat.i(91263);
    this.cYD = t("query", paramString, true);
    AppMethodBeat.o(91263);
    return this;
  }

  public final af fg(String paramString)
  {
    AppMethodBeat.i(91264);
    this.cWe = t("sessionId", paramString, true);
    AppMethodBeat.o(91264);
    return this;
  }

  public final af fh(String paramString)
  {
    AppMethodBeat.i(91265);
    this.cYF = t("appidBefore", paramString, true);
    AppMethodBeat.o(91265);
    return this;
  }

  public final af fi(String paramString)
  {
    AppMethodBeat.i(91266);
    this.cYG = t("appidAfter", paramString, true);
    AppMethodBeat.o(91266);
    return this;
  }

  public final int getId()
  {
    return 15960;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.af
 * JD-Core Version:    0.6.2
 */