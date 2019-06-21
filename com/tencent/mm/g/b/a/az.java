package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class az extends a
{
  public long daO = 0L;
  private String daP = "";
  private String daQ = "";

  public final String Fj()
  {
    AppMethodBeat.i(15833);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.daO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daQ);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(15833);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(15834);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("LogType:").append(this.daO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WechatLanguage:").append(this.daP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("InputLanguage:").append(this.daQ);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(15834);
    return localObject;
  }

  public final az fR(String paramString)
  {
    AppMethodBeat.i(15831);
    this.daP = t("WechatLanguage", paramString, true);
    AppMethodBeat.o(15831);
    return this;
  }

  public final az fS(String paramString)
  {
    AppMethodBeat.i(15832);
    this.daQ = t("InputLanguage", paramString, true);
    AppMethodBeat.o(15832);
    return this;
  }

  public final int getId()
  {
    return 15493;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.az
 * JD-Core Version:    0.6.2
 */