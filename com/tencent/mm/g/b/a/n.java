package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class n extends a
{
  public int cWc = 0;
  public String cWd;
  public String cWe = "";
  public long cWf = 0L;
  public long cWg = 0L;
  public long cWh = 0L;
  public String cWi;
  public int cWj = 0;
  public int cWk = 0;
  public int cWl = 0;
  public int cWm = 0;

  public final String Fj()
  {
    AppMethodBeat.i(73289);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWm);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(73289);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(73290);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("PID:").append(this.cWc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PName:").append(this.cWd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("sessionId:").append(this.cWe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("frontTime:").append(this.cWf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("stayTotalTime:").append(this.cWg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("scrollTotalTime:").append(this.cWh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("reportFeedList:").append(this.cWi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("reportFeedCount:").append(this.cWj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Seq:").append(this.cWk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SubSeq:").append(this.cWl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SubSeqSum:").append(this.cWm);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73290);
    return localObject;
  }

  public final n eF(String paramString)
  {
    AppMethodBeat.i(73287);
    this.cWd = t("PName", paramString, true);
    AppMethodBeat.o(73287);
    return this;
  }

  public final n eG(String paramString)
  {
    AppMethodBeat.i(73288);
    this.cWe = t("sessionId", paramString, true);
    AppMethodBeat.o(73288);
    return this;
  }

  public final int getId()
  {
    return 16242;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.n
 * JD-Core Version:    0.6.2
 */