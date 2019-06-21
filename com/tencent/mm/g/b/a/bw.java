package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bw extends a
{
  public long cVR = 0L;
  public long dbX = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  private long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  public long ddg = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public a dej;

  public final String Fj()
  {
    AppMethodBeat.i(128721);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dej != null);
    for (int i = this.dej.value; ; i = -1)
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
      AppMethodBeat.o(128721);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128722);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dej);
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
    AppMethodBeat.o(128722);
    return localObject;
  }

  public final bw gA(String paramString)
  {
    AppMethodBeat.i(128720);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128720);
    return this;
  }

  public final int getId()
  {
    return 16369;
  }

  public final bw gz(String paramString)
  {
    AppMethodBeat.i(128719);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128719);
    return this;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128718);
      dek = new a("release", 0, 1);
      del = new a("debug", 1, 2);
      dem = new a("demo", 2, 3);
      den = new a[] { dek, del, dem };
      AppMethodBeat.o(128718);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a gX(int paramInt)
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
        locala = dek;
        continue;
        locala = del;
        continue;
        locala = dem;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bw
 * JD-Core Version:    0.6.2
 */