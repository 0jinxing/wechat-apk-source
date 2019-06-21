package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bu extends a
{
  public long cVR = 0L;
  public long dbX = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  public long ddC = 0L;
  public bu.a ddY;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128704);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.ddY != null);
    for (int i = this.ddY.value; ; i = -1)
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
      AppMethodBeat.o(128704);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128705);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.ddY);
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
    AppMethodBeat.o(128705);
    return localObject;
  }

  public final bu dH(long paramLong)
  {
    AppMethodBeat.i(128701);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128701);
    return this;
  }

  public final bu dI(long paramLong)
  {
    AppMethodBeat.i(128702);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128702);
    return this;
  }

  public final bu dJ(long paramLong)
  {
    AppMethodBeat.i(128703);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128703);
    return this;
  }

  public final int getId()
  {
    return 16899;
  }

  public final bu gv(String paramString)
  {
    AppMethodBeat.i(128699);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128699);
    return this;
  }

  public final bu gw(String paramString)
  {
    AppMethodBeat.i(128700);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128700);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bu
 * JD-Core Version:    0.6.2
 */