package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cb extends a
{
  private long cVR = 0L;
  private String cYP = "";
  private long ddA = 0L;
  private long ddB = 0L;
  private long ddC = 0L;
  private String ddc = "";
  private long ddd = 0L;
  private String ddx = "";
  private long ddz = 0L;
  private a deQ;
  private long deR = 0L;
  private String dex = "";

  public final String Fj()
  {
    AppMethodBeat.i(128777);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.deQ != null);
    for (int i = this.deQ.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.dex);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.deR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cYP);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128777);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128778);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.deQ);
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
    ((StringBuffer)localObject).append("networkTypeStr:").append(this.dex);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isLaunch:").append(this.deR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UserName:").append(this.cYP);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128778);
    return localObject;
  }

  public final cb a(a parama)
  {
    this.deQ = parama;
    return this;
  }

  public final cb dU(long paramLong)
  {
    this.ddd = paramLong;
    return this;
  }

  public final cb dV(long paramLong)
  {
    this.ddz = paramLong;
    return this;
  }

  public final cb dW(long paramLong)
  {
    this.cVR = paramLong;
    return this;
  }

  public final cb dX(long paramLong)
  {
    this.deR = paramLong;
    return this;
  }

  public final cb gQ(String paramString)
  {
    AppMethodBeat.i(128773);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128773);
    return this;
  }

  public final cb gR(String paramString)
  {
    AppMethodBeat.i(128774);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128774);
    return this;
  }

  public final cb gS(String paramString)
  {
    AppMethodBeat.i(128775);
    this.dex = t("networkTypeStr", paramString, true);
    AppMethodBeat.o(128775);
    return this;
  }

  public final cb gT(String paramString)
  {
    AppMethodBeat.i(128776);
    this.cYP = t("UserName", paramString, true);
    AppMethodBeat.o(128776);
    return this;
  }

  public final int getId()
  {
    return 16367;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128772);
      deS = new a("release", 0, 1);
      deT = new a("debug", 1, 2);
      deU = new a("demo", 2, 3);
      deV = new a[] { deS, deT, deU };
      AppMethodBeat.o(128772);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a hc(int paramInt)
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
        locala = deS;
        continue;
        locala = deT;
        continue;
        locala = deU;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cb
 * JD-Core Version:    0.6.2
 */