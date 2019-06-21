package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class cw extends a
{
  public long cXP = 0L;
  private String cXU = "";
  private String cYD = "";
  private String din = "";
  public long dio = 0L;
  private String dip = "";
  public long diq = 0L;
  private String dis = "";
  public long dit = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(91282);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cXP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.din);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dio);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dip);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.diq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dis);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cXU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dit);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91282);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91283);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("scene:").append(this.cXP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("searchid:").append(this.din);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("businesstype:").append(this.dio);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("docid:").append(this.dip);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("timestampInMs:").append(this.diq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("expand2:").append(this.dis);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("query:").append(this.cYD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sessionid:").append(this.cXU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("resultsubtype:").append(this.dit);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91283);
    return localObject;
  }

  public final int getId()
  {
    return 16033;
  }

  public final cw hM(String paramString)
  {
    AppMethodBeat.i(91277);
    this.din = t("searchid", paramString, true);
    AppMethodBeat.o(91277);
    return this;
  }

  public final cw hN(String paramString)
  {
    AppMethodBeat.i(91278);
    this.dip = t("docid", paramString, true);
    AppMethodBeat.o(91278);
    return this;
  }

  public final cw hO(String paramString)
  {
    AppMethodBeat.i(91279);
    this.dis = t("expand2", paramString, true);
    AppMethodBeat.o(91279);
    return this;
  }

  public final cw hP(String paramString)
  {
    AppMethodBeat.i(91280);
    this.cYD = t("query", paramString, true);
    AppMethodBeat.o(91280);
    return this;
  }

  public final cw hQ(String paramString)
  {
    AppMethodBeat.i(91281);
    this.cXU = t("sessionid", paramString, true);
    AppMethodBeat.o(91281);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cw
 * JD-Core Version:    0.6.2
 */