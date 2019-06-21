package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cf extends a
{
  private long cVR = 0L;
  public long cXm = 0L;
  private long ddA = 0L;
  private long ddB = 0L;
  private long ddC = 0L;
  private String ddc = "";
  private long ddd = 0L;
  private String ddx = "";
  private long ddz = 0L;
  private cf.a dfD;
  public cf.c dfE;
  public cf.b dfF;

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(128816);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dfD != null)
    {
      j = this.dfD.value;
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
      if (this.dfE == null)
        break label261;
    }
    label261: for (int j = this.dfE.value; ; j = -1)
    {
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      j = i;
      if (this.dfF != null)
        j = this.dfF.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cXm);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128816);
      return localObject;
      j = -1;
      break;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128817);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dfD);
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
    ((StringBuffer)localObject).append("Ret:").append(this.dfE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsSync:").append(this.dfF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetworkType:").append(this.cXm);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128817);
    return localObject;
  }

  public final cf a(cf.a parama)
  {
    this.dfD = parama;
    return this;
  }

  public final cf dY(long paramLong)
  {
    this.ddd = paramLong;
    return this;
  }

  public final cf dZ(long paramLong)
  {
    this.ddz = paramLong;
    return this;
  }

  public final cf ea(long paramLong)
  {
    AppMethodBeat.i(128813);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128813);
    return this;
  }

  public final cf eb(long paramLong)
  {
    this.cVR = paramLong;
    return this;
  }

  public final cf ec(long paramLong)
  {
    AppMethodBeat.i(128814);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128814);
    return this;
  }

  public final cf ed(long paramLong)
  {
    AppMethodBeat.i(128815);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128815);
    return this;
  }

  public final cf gZ(String paramString)
  {
    AppMethodBeat.i(128811);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128811);
    return this;
  }

  public final int getId()
  {
    return 15764;
  }

  public final cf ha(String paramString)
  {
    AppMethodBeat.i(128812);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128812);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cf
 * JD-Core Version:    0.6.2
 */