package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class o extends a
{
  private long cVR = 0L;
  private String cWn = "";
  private String cWo = "";
  private String cWp = "";
  public long cWq = 0L;
  private String cWr = "";
  private String cWs = "";
  public long cWt = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(91255);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWt);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(91255);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(91256);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SearchId:").append(this.cWn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Query:").append(this.cWp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("JumpType:").append(this.cWq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Path:").append(this.cWr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("WeappUsrname:").append(this.cWs);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ServiceType:").append(this.cWt);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(91256);
    return localObject;
  }

  public final o Fp()
  {
    this.cVR = 47L;
    return this;
  }

  public final o eH(String paramString)
  {
    AppMethodBeat.i(91250);
    this.cWn = t("SearchId", paramString, true);
    AppMethodBeat.o(91250);
    return this;
  }

  public final o eI(String paramString)
  {
    AppMethodBeat.i(91251);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(91251);
    return this;
  }

  public final o eJ(String paramString)
  {
    AppMethodBeat.i(91252);
    this.cWp = t("Query", paramString, true);
    AppMethodBeat.o(91252);
    return this;
  }

  public final o eK(String paramString)
  {
    AppMethodBeat.i(91253);
    this.cWr = t("Path", paramString, true);
    AppMethodBeat.o(91253);
    return this;
  }

  public final o eL(String paramString)
  {
    AppMethodBeat.i(91254);
    this.cWs = t("WeappUsrname", paramString, true);
    AppMethodBeat.o(91254);
    return this;
  }

  public final int getId()
  {
    return 16019;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.o
 * JD-Core Version:    0.6.2
 */