package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class ax extends a
{
  private long cYQ = 0L;
  private String cZJ = "";
  private long cZK = 0L;
  private long dau = 0L;
  private long dav = 0L;

  public final String Fj()
  {
    AppMethodBeat.i(138742);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cZJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dau);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dav);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(138742);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(138743);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("StoryId:").append(this.cZJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoType:").append(this.dau);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreviewEnterScene:").append(this.cYQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ProfileSource:").append(this.cZK);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsAlbumStarButton:").append(this.dav);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(138743);
    return localObject;
  }

  public final ax ck(long paramLong)
  {
    this.dau = paramLong;
    return this;
  }

  public final ax cl(long paramLong)
  {
    this.cYQ = paramLong;
    return this;
  }

  public final ax cm(long paramLong)
  {
    this.cZK = paramLong;
    return this;
  }

  public final ax cn(long paramLong)
  {
    this.dav = paramLong;
    return this;
  }

  public final ax fN(String paramString)
  {
    AppMethodBeat.i(138741);
    this.cZJ = t("StoryId", paramString, true);
    AppMethodBeat.o(138741);
    return this;
  }

  public final int getId()
  {
    return 17090;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ax
 * JD-Core Version:    0.6.2
 */