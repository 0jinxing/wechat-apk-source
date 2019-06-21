package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class da extends a
{
  private String cYv = "";
  public long diB = 0L;
  private String diC = "";
  private String diD = "";
  public long diE = 0L;
  public long diF = 0L;
  public long diG = 0L;
  public long diH = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(91298);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diH);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91298);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91299);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appVersion:").append(this.diB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("pkgMd5:").append(this.diC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("downloadUrl:").append(this.diD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isSuccess:").append(this.diE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timeCostInMs:").append(this.diF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timeStampInMs:").append(this.diG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("totalLen:").append(this.diH);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91299);
    return localObject;
  }

  public final int getId()
  {
    return 15778;
  }

  public final da ib(String paramString)
  {
    AppMethodBeat.i(91295);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(91295);
    return this;
  }

  public final da ic(String paramString)
  {
    AppMethodBeat.i(91296);
    this.diC = t("pkgMd5", paramString, true);
    AppMethodBeat.o(91296);
    return this;
  }

  public final da ie(String paramString)
  {
    AppMethodBeat.i(91297);
    this.diD = t("downloadUrl", paramString, true);
    AppMethodBeat.o(91297);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.da
 * JD-Core Version:    0.6.2
 */