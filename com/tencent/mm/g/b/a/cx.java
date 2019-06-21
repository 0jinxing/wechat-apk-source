package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cx extends a
{
  public long cXP = 0L;
  private String cXU = "";
  private String cYD = "";
  private String dbZ = "";
  private String din = "";
  private String diu = "";
  private String div = "";

  public final String Fj()
  {
    AppMethodBeat.i(91290);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cXP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dbZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.din);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.div);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91290);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91291);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("scene:").append(this.cXP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("content:").append(this.dbZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("searchid:").append(this.din);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sessionid:").append(this.cXU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("resulttype:").append(this.diu);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("resultsubtypelist:").append(this.div);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91291);
    return localObject;
  }

  public final int getId()
  {
    return 16032;
  }

  public final cx hR(String paramString)
  {
    AppMethodBeat.i(91284);
    this.dbZ = t("content", paramString, true);
    AppMethodBeat.o(91284);
    return this;
  }

  public final cx hS(String paramString)
  {
    AppMethodBeat.i(91285);
    this.din = t("searchid", paramString, true);
    AppMethodBeat.o(91285);
    return this;
  }

  public final cx hT(String paramString)
  {
    AppMethodBeat.i(91286);
    this.cXU = t("sessionid", paramString, true);
    AppMethodBeat.o(91286);
    return this;
  }

  public final cx hU(String paramString)
  {
    AppMethodBeat.i(91287);
    this.cYD = t("query", paramString, true);
    AppMethodBeat.o(91287);
    return this;
  }

  public final cx hV(String paramString)
  {
    AppMethodBeat.i(91288);
    this.diu = t("resulttype", paramString, true);
    AppMethodBeat.o(91288);
    return this;
  }

  public final cx hW(String paramString)
  {
    AppMethodBeat.i(91289);
    this.div = t("resultsubtypelist", paramString, true);
    AppMethodBeat.o(91289);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cx
 * JD-Core Version:    0.6.2
 */