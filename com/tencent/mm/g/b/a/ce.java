package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ce extends a
{
  private String ddc = "";
  public long ddd = 0L;
  public long ddz = 0L;
  private String dex = "";
  public a dfv;
  private String dfw = "";
  public long dfx = 0L;
  public long dfy = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128800);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dfv != null);
    for (int i = this.dfv.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddz);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfw);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfx);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfy);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dex);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128800);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128801);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dfv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.ddz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Provider:").append(this.dfw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Version:").append(this.dfx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Stage:").append(this.dfy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("networkTypeStr:").append(this.dex);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128801);
    return localObject;
  }

  public final ce gW(String paramString)
  {
    AppMethodBeat.i(128797);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128797);
    return this;
  }

  public final ce gX(String paramString)
  {
    AppMethodBeat.i(128798);
    this.dfw = t("Provider", paramString, true);
    AppMethodBeat.o(128798);
    return this;
  }

  public final ce gY(String paramString)
  {
    AppMethodBeat.i(128799);
    this.dex = t("networkTypeStr", paramString, true);
    AppMethodBeat.o(128799);
    return this;
  }

  public final int getId()
  {
    return 17120;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128796);
      dfz = new a("release", 0, 1);
      dfA = new a("debug", 1, 2);
      dfB = new a("demo", 2, 3);
      dfC = new a[] { dfz, dfA, dfB };
      AppMethodBeat.o(128796);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a he(int paramInt)
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
        locala = dfz;
        continue;
        locala = dfA;
        continue;
        locala = dfB;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ce
 * JD-Core Version:    0.6.2
 */