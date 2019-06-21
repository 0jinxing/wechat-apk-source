package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class bx extends a
{
  public long cVR = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public bx.a deo;
  public long dep = 0L;
  private String deq = "";

  public final String Fj()
  {
    AppMethodBeat.i(128732);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.deo != null);
    for (int i = this.deo.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.dep);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deq);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128732);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128733);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.deo);
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
    ((StringBuffer)localObject).append("fileSize:").append(this.dep);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("filePath:").append(this.deq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128733);
    return localObject;
  }

  public final bx GZ()
  {
    AppMethodBeat.i(128730);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128730);
    return this;
  }

  public final bx dM(long paramLong)
  {
    AppMethodBeat.i(128728);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128728);
    return this;
  }

  public final bx dN(long paramLong)
  {
    AppMethodBeat.i(128729);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128729);
    return this;
  }

  public final bx gB(String paramString)
  {
    AppMethodBeat.i(128726);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128726);
    return this;
  }

  public final bx gC(String paramString)
  {
    AppMethodBeat.i(128727);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128727);
    return this;
  }

  public final bx gD(String paramString)
  {
    AppMethodBeat.i(128731);
    this.deq = t("filePath", paramString, true);
    AppMethodBeat.o(128731);
    return this;
  }

  public final int getId()
  {
    return 16007;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bx
 * JD-Core Version:    0.6.2
 */