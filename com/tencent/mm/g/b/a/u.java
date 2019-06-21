package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class u extends a
{
  private String cXQ = "";
  public long cXR = 0L;
  public long cXS = 0L;
  public long cXT = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77591);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cXQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXT);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77591);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77592);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("sessionID:").append(this.cXQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("actionCode:").append(this.cXR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("actionCodeResult:").append(this.cXS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("clickAddContact:").append(this.cXT);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77592);
    return localObject;
  }

  public final u eP(String paramString)
  {
    AppMethodBeat.i(77590);
    this.cXQ = t("sessionID", paramString, true);
    AppMethodBeat.o(77590);
    return this;
  }

  public final int getId()
  {
    return 15850;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.u
 * JD-Core Version:    0.6.2
 */