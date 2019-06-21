package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class av extends a
{
  private String cWo = "";
  private String dal = "";
  public long dam = 0L;
  private String dan = "";
  public long dao = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(35571);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.dal);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dam);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dan);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dao);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(35571);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(35572);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("EnterObjectId:").append(this.dal);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeUinCount:").append(this.dam);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeUinList:").append(this.dan);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ExposeNewVideoCount:").append(this.dao);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(35572);
    return localObject;
  }

  public final av fH(String paramString)
  {
    AppMethodBeat.i(35568);
    this.dal = t("EnterObjectId", paramString, true);
    AppMethodBeat.o(35568);
    return this;
  }

  public final av fI(String paramString)
  {
    AppMethodBeat.i(35569);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(35569);
    return this;
  }

  public final av fJ(String paramString)
  {
    AppMethodBeat.i(35570);
    this.dan = t("ExposeUinList", paramString, true);
    AppMethodBeat.o(35570);
    return this;
  }

  public final int getId()
  {
    return 16843;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.av
 * JD-Core Version:    0.6.2
 */