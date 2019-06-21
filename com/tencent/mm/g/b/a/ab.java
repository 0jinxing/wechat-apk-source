package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ab extends a
{
  public long cYk = 0L;
  private String cYl = "";

  public final String Fj()
  {
    AppMethodBeat.i(77605);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYl);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77605);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77606);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SendScene:").append(this.cYk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("emoticonMd5:").append(this.cYl);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77606);
    return localObject;
  }

  public final ab eW(String paramString)
  {
    AppMethodBeat.i(77604);
    this.cYl = t("emoticonMd5", paramString, true);
    AppMethodBeat.o(77604);
    return this;
  }

  public final int getId()
  {
    return 16868;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ab
 * JD-Core Version:    0.6.2
 */