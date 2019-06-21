package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ae extends a
{
  private String cYA = "";
  private String cYB = "";
  private long cYC = 0L;
  private String cYv = "";

  public final String Fj()
  {
    AppMethodBeat.i(91261);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYC);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91261);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91262);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("api:").append(this.cYA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("arg:").append(this.cYB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timestampMs:").append(this.cYC);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91262);
    return localObject;
  }

  public final ae aS(long paramLong)
  {
    AppMethodBeat.i(91260);
    this.cYC = paramLong;
    super.aj("timestampMs", this.cYC);
    AppMethodBeat.o(91260);
    return this;
  }

  public final ae fc(String paramString)
  {
    AppMethodBeat.i(91257);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(91257);
    return this;
  }

  public final ae fd(String paramString)
  {
    AppMethodBeat.i(91258);
    this.cYA = t("api", paramString, true);
    AppMethodBeat.o(91258);
    return this;
  }

  public final ae fe(String paramString)
  {
    AppMethodBeat.i(91259);
    this.cYB = t("arg", paramString, true);
    AppMethodBeat.o(91259);
    return this;
  }

  public final int getId()
  {
    return 15961;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ae
 * JD-Core Version:    0.6.2
 */