package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class ck extends a
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
  public a dgL;

  public final String Fj()
  {
    AppMethodBeat.i(128881);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dgL != null);
    for (int i = this.dgL.value; ; i = -1)
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
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128881);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128882);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dgL);
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
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128882);
    return localObject;
  }

  public final ck Hh()
  {
    AppMethodBeat.i(128880);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128880);
    return this;
  }

  public final ck er(long paramLong)
  {
    AppMethodBeat.i(128878);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128878);
    return this;
  }

  public final ck es(long paramLong)
  {
    AppMethodBeat.i(128879);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128879);
    return this;
  }

  public final int getId()
  {
    return 15813;
  }

  public final ck hj(String paramString)
  {
    AppMethodBeat.i(128876);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128876);
    return this;
  }

  public final ck hk(String paramString)
  {
    AppMethodBeat.i(128877);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128877);
    return this;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128875);
      dgM = new a("release", 0, 1);
      dgN = new a("debug", 1, 2);
      dgO = new a("demo", 2, 3);
      dgP = new a[] { dgM, dgN, dgO };
      AppMethodBeat.o(128875);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a hl(int paramInt)
    {
      a locala;
      switch (paramInt)
      {
      default:
        locala = null;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        return locala;
        locala = dgM;
        continue;
        locala = dgN;
        continue;
        locala = dgO;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ck
 * JD-Core Version:    0.6.2
 */