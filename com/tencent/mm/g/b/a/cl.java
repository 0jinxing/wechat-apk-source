package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class cl extends a
{
  private String bUh = "";
  public long cVR = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public long deD = 0L;
  private String dex = "";
  public cl.a dgQ;

  public final String Fj()
  {
    AppMethodBeat.i(128893);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dgQ != null);
    for (int i = this.dgQ.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.ddg);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deD);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dex);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128893);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128894);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dgQ);
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
    ((StringBuffer)localObject).append("isPreload:").append(this.ddg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isPreloadPageFrame:").append(this.deD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("networkTypeStr:").append(this.dex);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128894);
    return localObject;
  }

  public final cl Hi()
  {
    AppMethodBeat.i(128890);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128890);
    return this;
  }

  public final cl et(long paramLong)
  {
    AppMethodBeat.i(128888);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128888);
    return this;
  }

  public final cl eu(long paramLong)
  {
    AppMethodBeat.i(128889);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128889);
    return this;
  }

  public final int getId()
  {
    return 16011;
  }

  public final cl hl(String paramString)
  {
    AppMethodBeat.i(128886);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128886);
    return this;
  }

  public final cl hm(String paramString)
  {
    AppMethodBeat.i(128887);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128887);
    return this;
  }

  public final cl hn(String paramString)
  {
    AppMethodBeat.i(128891);
    this.bUh = t("path", paramString, true);
    AppMethodBeat.o(128891);
    return this;
  }

  public final cl ho(String paramString)
  {
    AppMethodBeat.i(128892);
    this.dex = t("networkTypeStr", paramString, true);
    AppMethodBeat.o(128892);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cl
 * JD-Core Version:    0.6.2
 */