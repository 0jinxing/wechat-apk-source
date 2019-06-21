package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class cj extends a
{
  public long cVR = 0L;
  public long cXm = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  public long ddC = 0L;
  private String ddc = "";
  public long ddd = 0L;
  private String ddx = "";
  public long ddz = 0L;
  private long dgA = 0L;
  public cj.a dgv;
  public long dgw = 0L;
  public cj.c dgx;
  public cj.b dgy;
  public long dgz = 0L;

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(128871);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dgv != null)
    {
      j = this.dgv.value;
      ((StringBuffer)localObject).append(j);
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
      ((StringBuffer)localObject).append(this.dgw);
      ((StringBuffer)localObject).append(",");
      if (this.dgx == null)
        break label309;
    }
    label309: for (int j = this.dgx.value; ; j = -1)
    {
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      j = i;
      if (this.dgy != null)
        j = this.dgy.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cXm);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dgz);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dgA);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128871);
      return localObject;
      j = -1;
      break;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128872);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dgv);
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
    ((StringBuffer)localObject).append("PkgSize:").append(this.dgw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsLaunchSync:").append(this.dgx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsContactSync:").append(this.dgy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetworkType:").append(this.cXm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasDownloadCode:").append(this.dgz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsFirstDownload:").append(this.dgA);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128872);
    return localObject;
  }

  public final cj Hg()
  {
    AppMethodBeat.i(128870);
    this.ddC = bo.anU();
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128870);
    return this;
  }

  public final cj ep(long paramLong)
  {
    AppMethodBeat.i(128868);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128868);
    return this;
  }

  public final cj eq(long paramLong)
  {
    AppMethodBeat.i(128869);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128869);
    return this;
  }

  public final int getId()
  {
    return 15766;
  }

  public final cj hh(String paramString)
  {
    AppMethodBeat.i(128866);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128866);
    return this;
  }

  public final cj hi(String paramString)
  {
    AppMethodBeat.i(128867);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128867);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cj
 * JD-Core Version:    0.6.2
 */