package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class am extends a
{
  private long cTJ = 0L;
  private long cYQ = 0L;
  private long cYR = 0L;
  private String cZq = "";
  public long cZr = 0L;
  private long cZs = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(108850);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYR);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZs);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108850);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108851);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("NetType:").append(this.cTJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreviewEnterScene:").append(this.cYQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SourceUserName:").append(this.cZq);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SourceContactType:").append(this.cZr);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasUnreadStoryTips:").append(this.cYR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasEnterPreview:").append(this.cZs);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108851);
    return localObject;
  }

  public final am Fx()
  {
    this.cYR = 1L;
    return this;
  }

  public final am Fy()
  {
    this.cZs = 1L;
    return this;
  }

  public final am bl(long paramLong)
  {
    this.cTJ = paramLong;
    return this;
  }

  public final am bm(long paramLong)
  {
    this.cYQ = paramLong;
    return this;
  }

  public final am fs(String paramString)
  {
    AppMethodBeat.i(108849);
    this.cZq = t("SourceUserName", paramString, true);
    AppMethodBeat.o(108849);
    return this;
  }

  public final int getId()
  {
    return 16659;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.am
 * JD-Core Version:    0.6.2
 */