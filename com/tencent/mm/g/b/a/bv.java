package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class bv extends a
{
  public long cVR = 0L;
  public long dbX = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public bv.a ded;
  public long dee = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128714);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.ded != null);
    for (int i = this.ded.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.dbX);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dee);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128714);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128715);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.ded);
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
    ((StringBuffer)localObject).append("type:").append(this.dbX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isGame:").append(this.dee);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128715);
    return localObject;
  }

  public final bv GY()
  {
    AppMethodBeat.i(128713);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128713);
    return this;
  }

  public final bv dK(long paramLong)
  {
    AppMethodBeat.i(128711);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128711);
    return this;
  }

  public final bv dL(long paramLong)
  {
    AppMethodBeat.i(128712);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128712);
    return this;
  }

  public final int getId()
  {
    return 15814;
  }

  public final bv gx(String paramString)
  {
    AppMethodBeat.i(128709);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128709);
    return this;
  }

  public final bv gy(String paramString)
  {
    AppMethodBeat.i(128710);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128710);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bv
 * JD-Core Version:    0.6.2
 */