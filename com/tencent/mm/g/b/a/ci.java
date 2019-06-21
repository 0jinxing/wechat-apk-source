package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ci extends a
{
  private long ddA = 0L;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public ci.a dgp;
  private long dgq = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128855);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dgp != null);
    for (int i = this.dgp.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddz);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddA);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dgq);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128855);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128856);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dgp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.ddz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CostTimeMs:").append(this.ddA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WaitingTimeMs:").append(this.dgq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128856);
    return localObject;
  }

  public final ci en(long paramLong)
  {
    AppMethodBeat.i(128853);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128853);
    return this;
  }

  public final ci eo(long paramLong)
  {
    AppMethodBeat.i(128854);
    this.dgq = paramLong;
    super.ai("WaitingTimeMs", this.dgq);
    AppMethodBeat.o(128854);
    return this;
  }

  public final int getId()
  {
    return 15853;
  }

  public final ci hf(String paramString)
  {
    AppMethodBeat.i(128851);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128851);
    return this;
  }

  public final ci hg(String paramString)
  {
    AppMethodBeat.i(128852);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128852);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ci
 * JD-Core Version:    0.6.2
 */