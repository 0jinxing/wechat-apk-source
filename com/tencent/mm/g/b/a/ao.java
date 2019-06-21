package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ao extends a
{
  private long cZv = 0L;
  private long cZw = 0L;
  private long cZx = 0L;
  private long cZy = 0L;

  public final long FA()
  {
    return this.cZx;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108852);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cZv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZy);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108852);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108853);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ExposeViewId:").append(this.cZv);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickClearCount:").append(this.cZw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickRenewCount:").append(this.cZx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IfDeleteVideo:").append(this.cZy);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108853);
    return localObject;
  }

  public final long Fz()
  {
    return this.cZw;
  }

  public final ao bA(long paramLong)
  {
    this.cZw = paramLong;
    return this;
  }

  public final ao bB(long paramLong)
  {
    this.cZx = paramLong;
    return this;
  }

  public final ao bC(long paramLong)
  {
    this.cZy = paramLong;
    return this;
  }

  public final ao bz(long paramLong)
  {
    this.cZv = paramLong;
    return this;
  }

  public final int getId()
  {
    return 16913;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ao
 * JD-Core Version:    0.6.2
 */