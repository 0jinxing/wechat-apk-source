package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cv extends a
{
  public long cTl = 0L;
  private String cYD = "";
  public long dim = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(61715);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dim);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYD);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(61715);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(61716);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("actionScene:").append(this.dim);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("action:").append(this.cTl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(61716);
    return localObject;
  }

  public final int getId()
  {
    return 15776;
  }

  public final cv hL(String paramString)
  {
    AppMethodBeat.i(61714);
    this.cYD = t("query", paramString, true);
    AppMethodBeat.o(61714);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cv
 * JD-Core Version:    0.6.2
 */