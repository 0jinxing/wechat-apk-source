package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class al extends a
{
  private long cTJ = 0L;
  private long cVG = 0L;
  private String cYX = "";
  private long cYY = 0L;
  private long cYZ = 0L;
  private long cZa = 0L;
  private long cZb = 0L;
  private long cZc = 0L;
  private long cZd = 0L;
  private long cZe = 0L;
  private String cZf = "";
  private long cZg = 0L;
  private String cZh = "";
  private long cZi = 0L;
  private String cZj = "";
  private String cZk = "";
  private String cZl = "";
  private long cZm = 0L;
  private long cZn = 0L;
  private long cZo = 0L;
  private long cZp = 1L;

  public final String Fj()
  {
    AppMethodBeat.i(108847);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZa);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZp);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108847);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108848);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("NetType:").append(this.cTJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PublishObjectId:").append(this.cYX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterScene:").append(this.cYY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterTime:").append(this.cYZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartEditTime:").append(this.cZa);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SendTime:").append(this.cZb);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoDuration:").append(this.cVG);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoSource:").append(this.cZc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EmojiWidgetCount:").append(this.cZd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TextWidgetCount:").append(this.cZe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MusicId:").append(this.cZf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MusicOrder:").append(this.cZg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PositionInfo:").append(this.cZh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MusicRequestId:").append(this.cZi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PositionLatitude:").append(this.cZj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PositionLongitude:").append(this.cZk);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ActionTrace:").append(this.cZl);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoObjectId:").append(this.cZm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsClickSearchMusic:").append(this.cZn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsSearchMusic:").append(this.cZo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsPublicTimeLine:").append(this.cZp);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108848);
    return localObject;
  }

  public final String Fv()
  {
    return this.cYX;
  }

  public final al Fw()
  {
    this.cZn = 1L;
    return this;
  }

  public final al aX(long paramLong)
  {
    this.cTJ = paramLong;
    return this;
  }

  public final al aY(long paramLong)
  {
    this.cYY = paramLong;
    return this;
  }

  public final al aZ(long paramLong)
  {
    this.cYZ = paramLong;
    return this;
  }

  public final al ba(long paramLong)
  {
    this.cZa = paramLong;
    return this;
  }

  public final al bb(long paramLong)
  {
    this.cZb = paramLong;
    return this;
  }

  public final al bc(long paramLong)
  {
    this.cVG = paramLong;
    return this;
  }

  public final al bd(long paramLong)
  {
    this.cZc = paramLong;
    return this;
  }

  public final al be(long paramLong)
  {
    this.cZd = paramLong;
    return this;
  }

  public final al bf(long paramLong)
  {
    this.cZe = paramLong;
    return this;
  }

  public final al bg(long paramLong)
  {
    this.cZg = paramLong;
    return this;
  }

  public final al bh(long paramLong)
  {
    this.cZi = paramLong;
    return this;
  }

  public final al bi(long paramLong)
  {
    this.cZm = paramLong;
    return this;
  }

  public final al bj(long paramLong)
  {
    this.cZo = paramLong;
    return this;
  }

  public final al bk(long paramLong)
  {
    this.cZp = paramLong;
    return this;
  }

  public final al fm(String paramString)
  {
    AppMethodBeat.i(108841);
    this.cYX = t("PublishObjectId", paramString, true);
    AppMethodBeat.o(108841);
    return this;
  }

  public final al fn(String paramString)
  {
    AppMethodBeat.i(108842);
    this.cZf = t("MusicId", paramString, true);
    AppMethodBeat.o(108842);
    return this;
  }

  public final al fo(String paramString)
  {
    AppMethodBeat.i(108843);
    this.cZh = t("PositionInfo", paramString, true);
    AppMethodBeat.o(108843);
    return this;
  }

  public final al fp(String paramString)
  {
    AppMethodBeat.i(108844);
    this.cZj = t("PositionLatitude", paramString, true);
    AppMethodBeat.o(108844);
    return this;
  }

  public final al fq(String paramString)
  {
    AppMethodBeat.i(108845);
    this.cZk = t("PositionLongitude", paramString, true);
    AppMethodBeat.o(108845);
    return this;
  }

  public final al fr(String paramString)
  {
    AppMethodBeat.i(108846);
    this.cZl = t("ActionTrace", paramString, true);
    AppMethodBeat.o(108846);
    return this;
  }

  public final int getId()
  {
    return 16638;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.al
 * JD-Core Version:    0.6.2
 */