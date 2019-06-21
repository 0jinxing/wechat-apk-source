package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class ca extends a
{
  public long cVR = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public ca.a deJ;
  private String deK = "";
  private String deL = "";
  public long dep = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128768);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.deJ != null);
    for (int i = this.deJ.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.ddg);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deK);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deL);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dep);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128768);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128769);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.deJ);
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
    ((StringBuffer)localObject).append("isPreload:").append(this.ddg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("fileName:").append(this.deK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("libVersion:").append(this.deL);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("fileSize:").append(this.dep);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128769);
    return localObject;
  }

  public final ca Hc()
  {
    AppMethodBeat.i(128765);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128765);
    return this;
  }

  public final ca dS(long paramLong)
  {
    AppMethodBeat.i(128763);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128763);
    return this;
  }

  public final ca dT(long paramLong)
  {
    AppMethodBeat.i(128764);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128764);
    return this;
  }

  public final ca gM(String paramString)
  {
    AppMethodBeat.i(128761);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128761);
    return this;
  }

  public final ca gN(String paramString)
  {
    AppMethodBeat.i(128762);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128762);
    return this;
  }

  public final ca gO(String paramString)
  {
    AppMethodBeat.i(128766);
    this.deK = t("fileName", paramString, true);
    AppMethodBeat.o(128766);
    return this;
  }

  public final ca gP(String paramString)
  {
    AppMethodBeat.i(128767);
    this.deL = t("libVersion", paramString, true);
    AppMethodBeat.o(128767);
    return this;
  }

  public final int getId()
  {
    return 15815;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ca
 * JD-Core Version:    0.6.2
 */