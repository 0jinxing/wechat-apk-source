package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class q extends a
{
  public String cWR;
  public long cWS;
  public long cWT;
  public long cWU;

  public q()
  {
    this.cWR = "";
    this.cWS = 0L;
    this.cWT = 0L;
    this.cWU = 0L;
  }

  public q(String paramString)
  {
    AppMethodBeat.i(73291);
    this.cWR = "";
    this.cWS = 0L;
    this.cWT = 0L;
    this.cWU = 0L;
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 4)
          break label123;
        String[] arrayOfString = new String[4];
        Arrays.fill(arrayOfString, 0, 4, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label123: 
    while (true)
    {
      eN(paramString[0]);
      this.cWS = bo.getLong(paramString[1], 0L);
      aP(bo.getLong(paramString[2], 0L));
      this.cWU = bo.getLong(paramString[3], 0L);
      AppMethodBeat.o(73291);
      return;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(73294);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWU);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73294);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73295);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Name:").append(this.cWR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Type:").append(this.cWS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TimeStampMs:").append(this.cWT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HashCode:").append(this.cWU);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73295);
    return localObject;
  }

  public final q aP(long paramLong)
  {
    AppMethodBeat.i(73293);
    this.cWT = paramLong;
    super.aj("TimeStampMs", this.cWT);
    AppMethodBeat.o(73293);
    return this;
  }

  public final q eN(String paramString)
  {
    AppMethodBeat.i(73292);
    this.cWR = t("Name", paramString, true);
    AppMethodBeat.o(73292);
    return this;
  }

  public final int getId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.q
 * JD-Core Version:    0.6.2
 */