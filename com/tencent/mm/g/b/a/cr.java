package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cr extends a
{
  public long cTl = 0L;
  private String cYv = "";
  public long cYx = 0L;
  public long dhm = 0L;
  public long dhw = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(70620);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYx);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(70620);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(70621);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("action:").append(this.cTl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("appid:").append(this.cYv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timecost:").append(this.dhm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("drawStrategy:").append(this.dhw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hasInitData:").append(this.cYx);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(70621);
    return localObject;
  }

  public final int getId()
  {
    return 15841;
  }

  public final cr hD(String paramString)
  {
    AppMethodBeat.i(70619);
    this.cYv = t("appid", paramString, true);
    AppMethodBeat.o(70619);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cr
 * JD-Core Version:    0.6.2
 */