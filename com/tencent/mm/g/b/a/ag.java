package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class ag extends a
{
  private String cWo = "";
  public long cYH = 0L;
  private long cYI = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(35562);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYI);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(35562);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(35563);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Entrance:").append(this.cYH);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickTimeStampMs:").append(this.cYI);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(35563);
    return localObject;
  }

  public final ag Fr()
  {
    AppMethodBeat.i(35561);
    this.cYI = bo.anU();
    super.aj("ClickTimeStampMs", this.cYI);
    AppMethodBeat.o(35561);
    return this;
  }

  public final ag fj(String paramString)
  {
    AppMethodBeat.i(35560);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(35560);
    return this;
  }

  public final int getId()
  {
    return 15987;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ag
 * JD-Core Version:    0.6.2
 */