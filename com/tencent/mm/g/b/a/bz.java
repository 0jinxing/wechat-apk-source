package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class bz extends a
{
  private String bUh = "";
  public long cVR = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  public long ddj = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public a deC;
  public long deD = 0L;
  public long deE = 0L;
  public long dew = 0L;
  private String dex = "";

  public final String Fj()
  {
    AppMethodBeat.i(128756);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.deC != null);
    for (int i = this.deC.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.deD);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dex);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deE);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128756);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128757);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.deC);
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
    ((StringBuffer)localObject).append("isPreloadPageFrame:").append(this.deD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("networkTypeStr:").append(this.dex);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isSplitCodeLib:").append(this.deE);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128757);
    return localObject;
  }

  public final bz Hb()
  {
    AppMethodBeat.i(128753);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128753);
    return this;
  }

  public final bz dQ(long paramLong)
  {
    AppMethodBeat.i(128751);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128751);
    return this;
  }

  public final bz dR(long paramLong)
  {
    AppMethodBeat.i(128752);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128752);
    return this;
  }

  public final bz gI(String paramString)
  {
    AppMethodBeat.i(128749);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128749);
    return this;
  }

  public final bz gJ(String paramString)
  {
    AppMethodBeat.i(128750);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128750);
    return this;
  }

  public final bz gK(String paramString)
  {
    AppMethodBeat.i(128754);
    this.bUh = t("path", paramString, true);
    AppMethodBeat.o(128754);
    return this;
  }

  public final bz gL(String paramString)
  {
    AppMethodBeat.i(128755);
    this.dex = t("networkTypeStr", paramString, true);
    AppMethodBeat.o(128755);
    return this;
  }

  public final int getId()
  {
    return 16009;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128748);
      deF = new a("release", 0, 1);
      deG = new a("debug", 1, 2);
      deH = new a("demo", 2, 3);
      deI = new a[] { deF, deG, deH };
      AppMethodBeat.o(128748);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a ha(int paramInt)
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
        locala = deF;
        continue;
        locala = deG;
        continue;
        locala = deH;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bz
 * JD-Core Version:    0.6.2
 */