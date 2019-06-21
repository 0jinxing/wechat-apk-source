package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class cg extends a
{
  public long cVR;
  public long cXm;
  private long ddA;
  private long ddB;
  private long ddC;
  private String ddc;
  public long ddd;
  private String ddx;
  public long ddz;
  public cg.a dfQ;
  public cg.b dfR;

  public cg()
  {
    this.ddx = "";
    this.ddc = "";
    this.ddd = 0L;
    this.ddz = 0L;
    this.ddA = 0L;
    this.cVR = 0L;
    this.ddB = 0L;
    this.ddC = 0L;
    this.cXm = 0L;
  }

  public cg(String paramString)
  {
    AppMethodBeat.i(128824);
    this.ddx = "";
    this.ddc = "";
    this.ddd = 0L;
    this.ddz = 0L;
    this.ddA = 0L;
    this.cVR = 0L;
    this.ddB = 0L;
    this.ddC = 0L;
    this.cXm = 0L;
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 11)
          break label239;
        String[] arrayOfString = new String[11];
        Arrays.fill(arrayOfString, 0, 11, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label239: 
    while (true)
    {
      hb(paramString[0]);
      hc(paramString[1]);
      this.ddd = bo.getLong(paramString[2], 0L);
      this.dfQ = cg.a.hg(bo.getInt(paramString[3], 0));
      this.ddz = bo.getLong(paramString[4], 0L);
      ee(bo.getLong(paramString[5], 0L));
      this.cVR = bo.getLong(paramString[6], 0L);
      ef(bo.getLong(paramString[7], 0L));
      eg(bo.getLong(paramString[8], 0L));
      this.dfR = cg.b.hh(bo.getInt(paramString[9], 0));
      this.cXm = bo.getLong(paramString[10], 0L);
      AppMethodBeat.o(128824);
      return;
    }
  }

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(128830);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dfQ != null);
    for (int j = this.dfQ.value; ; j = -1)
    {
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
      j = i;
      if (this.dfR != null)
        j = this.dfR.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cXm);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128830);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128831);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("InstanceId:").append(this.ddx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dfQ);
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
    ((StringBuffer)localObject).append("Ret:").append(this.dfR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NetworkType:").append(this.cXm);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128831);
    return localObject;
  }

  public final cg ee(long paramLong)
  {
    AppMethodBeat.i(128827);
    this.ddA = paramLong;
    super.ai("CostTimeMs", this.ddA);
    AppMethodBeat.o(128827);
    return this;
  }

  public final cg ef(long paramLong)
  {
    AppMethodBeat.i(128828);
    this.ddB = paramLong;
    super.aj("StartTimeStampMs", this.ddB);
    AppMethodBeat.o(128828);
    return this;
  }

  public final cg eg(long paramLong)
  {
    AppMethodBeat.i(128829);
    this.ddC = paramLong;
    super.aj("EndTimeStampMs", this.ddC);
    AppMethodBeat.o(128829);
    return this;
  }

  public final int getId()
  {
    return 15798;
  }

  public final cg hb(String paramString)
  {
    AppMethodBeat.i(128825);
    this.ddx = t("InstanceId", paramString, true);
    AppMethodBeat.o(128825);
    return this;
  }

  public final cg hc(String paramString)
  {
    AppMethodBeat.i(128826);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128826);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cg
 * JD-Core Version:    0.6.2
 */