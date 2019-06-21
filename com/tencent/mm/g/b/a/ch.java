package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ch extends a
{
  private long cVR = 0L;
  public long cXm = 0L;
  private long ddA = 0L;
  public long ddB = 0L;
  private long ddC = 0L;
  private String ddc = "";
  private long ddd = 0L;
  private String ddx = "";
  private long ddz = 0L;
  private ch.a dfZ;
  public ch.c dga;
  public ch.b dgb;
  public long dgc = 0L;

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(128846);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dfZ != null)
    {
      j = this.dfZ.value;
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
      if (this.dga == null)
        break label277;
    }
    label277: for (int j = this.dga.value; ; j = -1)
    {
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      j = i;
      if (this.dgb != null)
        j = this.dgb.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cXm);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dgc);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128846);
      return localObject;
      j = -1;
      break;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128847);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dfZ);
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
    ((StringBuffer)localObject).append("Ret:").append(this.dga);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsSync:").append(this.dgb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetworkType:").append(this.cXm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsNormalOpen:").append(this.dgc);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128847);
    return localObject;
  }

  public final ch a(ch.a parama)
  {
    this.dfZ = parama;
    return this;
  }

  public final ch eh(long paramLong)
  {
    this.ddd = paramLong;
    return this;
  }

  public final ch ei(long paramLong)
  {
    this.ddz = paramLong;
    return this;
  }

  public final ch ej(long paramLong)
  {
    AppMethodBeat.i(128843);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128843);
    return this;
  }

  public final ch ek(long paramLong)
  {
    this.cVR = paramLong;
    return this;
  }

  public final ch el(long paramLong)
  {
    AppMethodBeat.i(128844);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128844);
    return this;
  }

  public final ch em(long paramLong)
  {
    AppMethodBeat.i(128845);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128845);
    return this;
  }

  public final int getId()
  {
    return 15765;
  }

  public final ch hd(String paramString)
  {
    AppMethodBeat.i(128841);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128841);
    return this;
  }

  public final ch he(String paramString)
  {
    AppMethodBeat.i(128842);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128842);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ch
 * JD-Core Version:    0.6.2
 */