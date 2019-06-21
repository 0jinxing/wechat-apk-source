package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class at extends a
{
  private long cTJ = 0L;
  private String cYX = "";
  private long cYY = 0L;
  private long cYZ = 0L;
  private long cZd = 0L;
  private long cZe = 0L;
  private long cZm = 0L;
  private long cZn = 0L;
  private long cZp = 0L;
  private long dac = 0L;
  private long dad = 0L;
  private long dae = 0L;
  private long daf = 0L;
  private long dag = 0L;
  private long dah = 0L;
  private String dai = "";

  public final at FV()
  {
    this.dad = 1L;
    return this;
  }

  public final at FW()
  {
    this.dae = 1L;
    return this;
  }

  public final at FX()
  {
    this.dag = 1L;
    return this;
  }

  public final at FY()
  {
    this.cZn = 1L;
    return this;
  }

  public final String Fj()
  {
    AppMethodBeat.i(108871);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dac);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dad);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dae);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZe);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.daf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dag);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dah);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dai);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cZp);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(108871);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(108872);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("NetType:").append(this.cTJ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PublishObjectId:").append(this.cYX);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterScene:").append(this.cYY);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EnterTime:").append(this.cYZ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("QuitTime:").append(this.dac);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasRecordVideo:").append(this.dad);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HasEnterAllbum:").append(this.dae);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EmojiWidgetCount:").append(this.cZd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("TextWidgetCount:").append(this.cZe);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isAddMusic:").append(this.daf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isAddPosition:").append(this.dag);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ActionTrace:").append(this.dah);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewActionTrace:").append(this.dai);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("VideoObjectId:").append(this.cZm);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsClickSearchMusic:").append(this.cZn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsPublicTimeLine:").append(this.cZp);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(108872);
    return localObject;
  }

  public final at bV(long paramLong)
  {
    this.cTJ = paramLong;
    return this;
  }

  public final at bW(long paramLong)
  {
    this.cYY = paramLong;
    return this;
  }

  public final at bX(long paramLong)
  {
    this.cYZ = paramLong;
    return this;
  }

  public final at bY(long paramLong)
  {
    this.dac = paramLong;
    return this;
  }

  public final at bZ(long paramLong)
  {
    this.cZd = paramLong;
    return this;
  }

  public final at ca(long paramLong)
  {
    this.cZe = paramLong;
    return this;
  }

  public final at cb(long paramLong)
  {
    this.daf = paramLong;
    return this;
  }

  public final at cc(long paramLong)
  {
    this.cZm = paramLong;
    return this;
  }

  public final at cd(long paramLong)
  {
    this.cZp = paramLong;
    return this;
  }

  public final at fD(String paramString)
  {
    AppMethodBeat.i(108869);
    this.cYX = t("PublishObjectId", paramString, true);
    AppMethodBeat.o(108869);
    return this;
  }

  public final at fE(String paramString)
  {
    AppMethodBeat.i(108870);
    this.dai = t("NewActionTrace", paramString, true);
    AppMethodBeat.o(108870);
    return this;
  }

  public final int getId()
  {
    return 16639;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.at
 * JD-Core Version:    0.6.2
 */