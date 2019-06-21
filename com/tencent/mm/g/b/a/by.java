package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class by extends a
{
  private String bUh = "";
  public long cVR = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  public long ddj = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public by.a dev;
  public long dew = 0L;
  private String dex = "";

  public final String Fj()
  {
    AppMethodBeat.i(128744);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dev != null);
    for (int i = this.dev.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddz);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddA);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cVR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddB);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddC);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.bUh);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddj);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dew);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddg);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dex);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128744);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128745);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dev);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.ddz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CostTimeMs:").append(this.ddA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartTimeStampMs:").append(this.ddB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EndTimeStampMs:").append(this.ddC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("path:").append(this.bUh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isDownloadCode:").append(this.ddj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isPatch:").append(this.dew);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isPreload:").append(this.ddg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("networkTypeStr:").append(this.dex);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128745);
    return localObject;
  }

  public final by Ha()
  {
    AppMethodBeat.i(128741);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128741);
    return this;
  }

  public final by dO(long paramLong)
  {
    AppMethodBeat.i(128739);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128739);
    return this;
  }

  public final by dP(long paramLong)
  {
    AppMethodBeat.i(128740);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128740);
    return this;
  }

  public final by gE(String paramString)
  {
    AppMethodBeat.i(128737);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128737);
    return this;
  }

  public final by gF(String paramString)
  {
    AppMethodBeat.i(128738);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128738);
    return this;
  }

  public final by gG(String paramString)
  {
    AppMethodBeat.i(128742);
    this.bUh = t("path", paramString, true);
    AppMethodBeat.o(128742);
    return this;
  }

  public final by gH(String paramString)
  {
    AppMethodBeat.i(128743);
    this.dex = t("networkTypeStr", paramString, true);
    AppMethodBeat.o(128743);
    return this;
  }

  public final int getId()
  {
    return 16010;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.by
 * JD-Core Version:    0.6.2
 */