package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bs extends a
{
  public long cVR = 0L;
  public long dbX = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  public long ddC = 0L;
  public bs.a ddN;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128684);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.ddN != null);
    for (int i = this.ddN.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.dbX);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128684);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128685);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.ddN);
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
    ((StringBuffer)localObject).append("type:").append(this.dbX);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128685);
    return localObject;
  }

  public final bs dB(long paramLong)
  {
    AppMethodBeat.i(128681);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128681);
    return this;
  }

  public final bs dC(long paramLong)
  {
    AppMethodBeat.i(128682);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128682);
    return this;
  }

  public final bs dD(long paramLong)
  {
    AppMethodBeat.i(128683);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128683);
    return this;
  }

  public final int getId()
  {
    return 16895;
  }

  public final bs gr(String paramString)
  {
    AppMethodBeat.i(128679);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128679);
    return this;
  }

  public final bs gs(String paramString)
  {
    AppMethodBeat.i(128680);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128680);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bs
 * JD-Core Version:    0.6.2
 */