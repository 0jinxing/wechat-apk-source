package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class br extends a
{
  public long cVR = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  public long ddC = 0L;
  public a ddH;
  public long ddI = 0L;
  private String ddc = "";
  private String ddx = "";
  public long ddz = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128674);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    if (this.ddH != null);
    for (int i = this.ddH.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.ddI);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128674);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128675);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.ddH);
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
    ((StringBuffer)localObject).append("IsPreload:").append(this.ddI);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128675);
    return localObject;
  }

  public final br GX()
  {
    AppMethodBeat.i(128673);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128673);
    return this;
  }

  public final br dA(long paramLong)
  {
    AppMethodBeat.i(128672);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128672);
    return this;
  }

  public final br dz(long paramLong)
  {
    AppMethodBeat.i(128671);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128671);
    return this;
  }

  public final int getId()
  {
    return 17111;
  }

  public final br gp(String paramString)
  {
    AppMethodBeat.i(128669);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128669);
    return this;
  }

  public final br gq(String paramString)
  {
    AppMethodBeat.i(128670);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128670);
    return this;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128668);
      ddJ = new a("release", 0, 1);
      ddK = new a("debug", 1, 2);
      ddL = new a("demo", 2, 3);
      ddM = new a[] { ddJ, ddK, ddL };
      AppMethodBeat.o(128668);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a gS(int paramInt)
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
        locala = ddJ;
        continue;
        locala = ddK;
        continue;
        locala = ddL;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.br
 * JD-Core Version:    0.6.2
 */