package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class as extends a
{
  public long cZW = 0L;
  public long cZX = 0L;
  public long cZY = 0L;
  private long cZZ = 0L;
  public long cZm = 0L;
  private long daa = 0L;
  private long dab = 0L;

  public final as FQ()
  {
    this.cZW = 0L;
    return this;
  }

  public final as FR()
  {
    this.cZX = 0L;
    return this;
  }

  public final as FS()
  {
    this.cZY = 0L;
    return this;
  }

  public final as FT()
  {
    this.cZm = 0L;
    return this;
  }

  public final long FU()
  {
    return this.cZm;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108867);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cZW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daa);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dab);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108867);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108868);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ClickMyProfileTime:").append(this.cZW);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickCameraTime:").append(this.cZX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ClickGuidePageTime:").append(this.cZY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isProfileRedPoint:").append(this.cZZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isCameraRedPoint:").append(this.daa);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoObjectId:").append(this.cZm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isStoryCommentRedDot:").append(this.dab);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108868);
    return localObject;
  }

  public final as bS(long paramLong)
  {
    this.cZZ = paramLong;
    return this;
  }

  public final as bT(long paramLong)
  {
    this.daa = paramLong;
    return this;
  }

  public final as bU(long paramLong)
  {
    this.dab = paramLong;
    return this;
  }

  public final int getId()
  {
    return 16844;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.as
 * JD-Core Version:    0.6.2
 */