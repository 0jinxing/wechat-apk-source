package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cz extends a
{
  private String diA = "";
  public long diz = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(91293);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.diz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diA);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91293);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91294);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("canPreload:").append(this.diz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("existPkgInfo:").append(this.diA);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91294);
    return localObject;
  }

  public final int getId()
  {
    return 15779;
  }

  public final cz ia(String paramString)
  {
    AppMethodBeat.i(91292);
    this.diA = t("existPkgInfo", paramString, true);
    AppMethodBeat.o(91292);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cz
 * JD-Core Version:    0.6.2
 */