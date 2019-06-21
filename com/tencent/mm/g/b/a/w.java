package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class w extends a
{
  private String cWR;
  public long cWS;
  public long cWT;
  public long cWU;
  public int cWc;
  private String cWd;
  public long cYc;
  private long cYd;
  private boolean cYe;

  public w()
  {
    this.cWc = 0;
    this.cWd = "";
    this.cYc = 0L;
    this.cWR = "";
    this.cWS = 0L;
    this.cWT = 0L;
    this.cYd = 0L;
    this.cWU = 0L;
  }

  public w(String paramString)
  {
    AppMethodBeat.i(73296);
    this.cWc = 0;
    this.cWd = "";
    this.cYc = 0L;
    this.cWR = "";
    this.cWS = 0L;
    this.cWT = 0L;
    this.cYd = 0L;
    this.cWU = 0L;
    String[] arrayOfString;
    if (paramString != null)
    {
      arrayOfString = paramString.split(",");
      if (arrayOfString != null)
      {
        if (arrayOfString.length >= 9)
          break label199;
        paramString = new String[9];
        Arrays.fill(paramString, 0, 9, "");
        System.arraycopy(arrayOfString, 0, paramString, 0, arrayOfString.length);
      }
    }
    while (true)
    {
      this.cWc = bo.getInt(paramString[0], 0);
      eS(paramString[1]);
      this.cYc = bo.getLong(paramString[2], 0L);
      eT(paramString[3]);
      this.cWS = bo.getLong(paramString[4], 0L);
      aQ(bo.getLong(paramString[5], 0L));
      this.cYd = bo.getLong(paramString[6], 0L);
      this.cYe = a.getBoolean(paramString[7]);
      this.cWU = bo.getLong(paramString[8], 0L);
      AppMethodBeat.o(73296);
      return;
      label199: paramString = arrayOfString;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(73300);
    String str = eU(",");
    AppMethodBeat.o(73300);
    return str;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73302);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("PID:").append(this.cWc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PName:").append(this.cWd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Seq:").append(this.cYc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Name:").append(this.cWR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Type:").append(this.cWS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TimeStampMs:").append(this.cWT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("GreenManFg:").append(this.cYd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("QueueFgBool:").append(this.cYe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HashCode:").append(this.cWU);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73302);
    return localObject;
  }

  public final w aQ(long paramLong)
  {
    AppMethodBeat.i(73299);
    this.cWT = paramLong;
    super.aj("TimeStampMs", this.cWT);
    AppMethodBeat.o(73299);
    return this;
  }

  public final w eS(String paramString)
  {
    AppMethodBeat.i(73297);
    this.cWd = t("PName", paramString, true);
    AppMethodBeat.o(73297);
    return this;
  }

  public final w eT(String paramString)
  {
    AppMethodBeat.i(73298);
    this.cWR = t("Name", paramString, true);
    AppMethodBeat.o(73298);
    return this;
  }

  public final String eU(String paramString)
  {
    AppMethodBeat.i(73301);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.cWc);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cWd);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cYc);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cWR);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cWS);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cWT);
    localStringBuffer.append(paramString);
    localStringBuffer.append(this.cYd);
    localStringBuffer.append(paramString);
    if (this.cYe);
    for (int i = 1; ; i = 0)
    {
      localStringBuffer.append(i);
      localStringBuffer.append(paramString);
      localStringBuffer.append(this.cWU);
      paramString = localStringBuffer.toString();
      VX(paramString);
      AppMethodBeat.o(73301);
      return paramString;
    }
  }

  public final int getId()
  {
    return 15885;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.w
 * JD-Core Version:    0.6.2
 */