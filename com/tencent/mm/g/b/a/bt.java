package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bt extends a
{
  public long cVR = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  public long ddC = 0L;
  public bt.a ddS;
  public long ddT = 0L;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128694);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.ddS != null);
    for (int i = this.ddS.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.ddT);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128694);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128695);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.ddS);
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
    ((StringBuffer)localObject).append("isFromAndroidRecents:").append(this.ddT);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128695);
    return localObject;
  }

  public final bt dE(long paramLong)
  {
    AppMethodBeat.i(128691);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128691);
    return this;
  }

  public final bt dF(long paramLong)
  {
    AppMethodBeat.i(128692);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128692);
    return this;
  }

  public final bt dG(long paramLong)
  {
    AppMethodBeat.i(128693);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128693);
    return this;
  }

  public final int getId()
  {
    return 16898;
  }

  public final bt gt(String paramString)
  {
    AppMethodBeat.i(128689);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128689);
    return this;
  }

  public final bt gu(String paramString)
  {
    AppMethodBeat.i(128690);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128690);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bt
 * JD-Core Version:    0.6.2
 */