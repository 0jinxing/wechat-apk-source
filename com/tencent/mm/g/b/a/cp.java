package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cp extends a
{
  private String cYD = "";
  private String cYv = "";
  public long cYx = 0L;
  public long dhm = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(91275);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYx);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91275);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91276);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timecost:").append(this.dhm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hasInitData:").append(this.cYx);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91276);
    return localObject;
  }

  public final int getId()
  {
    return 15831;
  }

  public final cp hw(String paramString)
  {
    AppMethodBeat.i(91274);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(91274);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cp
 * JD-Core Version:    0.6.2
 */