package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class z extends a
{
  public long cYk = 0L;
  private String cYl = "";
  public long cYm = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(77600);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYm);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(77600);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(77601);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SendScene:").append(this.cYk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("emoticonMd5:").append(this.cYl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hasTxt:").append(this.cYm);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(77601);
    return localObject;
  }

  public final z eV(String paramString)
  {
    AppMethodBeat.i(77599);
    this.cYl = t("emoticonMd5", paramString, true);
    AppMethodBeat.o(77599);
    return this;
  }

  public final int getId()
  {
    return 16872;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.z
 * JD-Core Version:    0.6.2
 */