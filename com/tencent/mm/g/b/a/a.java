package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.plugin.report.a
{
  public long cTl = 0L;
  public int cTm = 0;
  public long cTn = 0L;
  private int cTo = 0;
  private String cTp = "";
  private String cTq = "";

  public final String Fj()
  {
    AppMethodBeat.i(56593);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTq);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(56593);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(56594);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("action:").append(this.cTl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("action_result:").append(this.cTm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("action_code:").append(this.cTn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("session:").append(this.cTo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("action_ext:").append(this.cTp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("session2:").append(this.cTq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(56594);
    return localObject;
  }

  public final a ep(String paramString)
  {
    AppMethodBeat.i(56592);
    this.cTq = t("session2", paramString, true);
    AppMethodBeat.o(56592);
    return this;
  }

  public final int getId()
  {
    return 15894;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.a
 * JD-Core Version:    0.6.2
 */