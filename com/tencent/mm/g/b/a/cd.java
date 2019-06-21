package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cd extends a
{
  public long cVR = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  private long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;
  public a dfc;
  public long dfd = 0L;
  public long dfe = 0L;
  public long dff = 0L;
  public long dfg = 0L;
  public long dfh = 0L;
  public long dfi = 0L;
  public long dfj = 0L;
  public long dfk = 0L;
  public long dfl = 0L;
  public long dfm = 0L;
  public long dfn = 0L;
  public long dfo = 0L;
  public long dfp = 0L;
  public long dfq = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(128792);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dfc != null);
    for (int i = this.dfc.value; ; i = -1)
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
      ((StringBuffer)localObject).append(this.dfd);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfe);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dff);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfg);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfh);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfi);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfj);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfk);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfl);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfm);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfn);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfo);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfp);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dfq);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128792);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128793);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dfc);
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
    ((StringBuffer)localObject).append("fps:").append(this.dfd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("fpsVariance:").append(this.dfe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("cpu:").append(this.dff);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("memory:").append(this.dfg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("memoryDiff:").append(this.dfh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("androidNativeMemory:").append(this.dfi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("androidDalvikMemory:").append(this.dfj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("runtimeDuration:").append(this.dfk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("runtimeCount:").append(this.dfl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("mainCanvasType:").append(this.dfm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("triangles:").append(this.dfn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("drawcall:").append(this.dfo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("vertex:").append(this.dfp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("useCommandBuffer:").append(this.dfq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128793);
    return localObject;
  }

  public final cd Hd()
  {
    AppMethodBeat.i(128789);
    this.ddA = 0L;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128789);
    return this;
  }

  public final cd He()
  {
    AppMethodBeat.i(128790);
    this.ddB = 0L;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128790);
    return this;
  }

  public final cd Hf()
  {
    AppMethodBeat.i(128791);
    this.ddC = 0L;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128791);
    return this;
  }

  public final cd gU(String paramString)
  {
    AppMethodBeat.i(128787);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128787);
    return this;
  }

  public final cd gV(String paramString)
  {
    AppMethodBeat.i(128788);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128788);
    return this;
  }

  public final int getId()
  {
    return 16023;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128786);
      dfr = new a("release", 0, 1);
      dfs = new a("debug", 1, 2);
      dft = new a("demo", 2, 3);
      dfu = new a[] { dfr, dfs, dft };
      AppMethodBeat.o(128786);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }

    public static a hd(int paramInt)
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
        locala = dfr;
        continue;
        locala = dfs;
        continue;
        locala = dft;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cd
 * JD-Core Version:    0.6.2
 */