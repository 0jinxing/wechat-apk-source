package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ak extends a
{
  private long cWY = 0L;
  private long cYS = 0L;
  private long cYT = 0L;
  private long cYU = 0L;
  private String cYV;
  private String cYW;

  public final String Fj()
  {
    AppMethodBeat.i(108839);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cWY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYW);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108839);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108840);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ComposeTime:").append(this.cYS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ComposeErrorType:").append(this.cYT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadTime:").append(this.cWY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadErrorType:").append(this.cYU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ComposeErrorTypeStr:").append(this.cYV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("UploadErrorTypeStr:").append(this.cYW);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108840);
    return localObject;
  }

  public final long Ft()
  {
    return this.cYS;
  }

  public final long Fu()
  {
    return this.cWY;
  }

  public final ak aT(long paramLong)
  {
    this.cYS = paramLong;
    return this;
  }

  public final ak aU(long paramLong)
  {
    this.cYT = paramLong;
    return this;
  }

  public final ak aV(long paramLong)
  {
    this.cWY = paramLong;
    return this;
  }

  public final ak aW(long paramLong)
  {
    this.cYU = paramLong;
    return this;
  }

  public final int getId()
  {
    return 16688;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ak
 * JD-Core Version:    0.6.2
 */