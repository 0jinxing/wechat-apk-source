package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class co extends a
{
  private long cVR = 0L;
  private long cVS = 0L;
  private long ddA = 0L;
  private String ddc = "";
  private long ddz = 0L;
  private a dhg;
  private String dhh = "";

  public final String Fj()
  {
    AppMethodBeat.i(128908);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    if (this.dhg != null);
    for (int i = this.dhg.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddz);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddA);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cVR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cVS);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dhh);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128908);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128909);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dhg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.ddz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CostTimeMs:").append(this.ddA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Action:").append(this.cVS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ErrMsg:").append(this.dhh);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128909);
    return localObject;
  }

  public final co a(a parama)
  {
    this.dhg = parama;
    return this;
  }

  public final co ev(long paramLong)
  {
    this.ddz = paramLong;
    return this;
  }

  public final co ew(long paramLong)
  {
    AppMethodBeat.i(128906);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128906);
    return this;
  }

  public final co ex(long paramLong)
  {
    this.cVR = paramLong;
    return this;
  }

  public final co ey(long paramLong)
  {
    this.cVS = paramLong;
    return this;
  }

  public final int getId()
  {
    return 17147;
  }

  public final co hu(String paramString)
  {
    AppMethodBeat.i(128905);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128905);
    return this;
  }

  public final co hv(String paramString)
  {
    AppMethodBeat.i(128907);
    this.dhh = t("ErrMsg", paramString, true);
    AppMethodBeat.o(128907);
    return this;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128904);
      dhi = new a("release", 0, 1);
      dhj = new a("debug", 1, 2);
      dhk = new a("demo", 2, 3);
      dhl = new a[] { dhi, dhj, dhk };
      AppMethodBeat.o(128904);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a ho(int paramInt)
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
        locala = dhi;
        continue;
        locala = dhj;
        continue;
        locala = dhk;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.co
 * JD-Core Version:    0.6.2
 */