package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends a
{
  private String cUM = "";
  public long cUN = 0L;
  public long cUO = 0L;
  public long cUP = 0L;
  public boolean cUQ;
  public long cUR = 0L;
  public long cUS = 0L;
  public long cUT = 0L;
  private long cUU = 0L;
  private long cUV = 0L;
  public e.a cUW;

  public final String Fj()
  {
    AppMethodBeat.i(15829);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cUM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cUN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cUO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cUP);
    ((StringBuffer)localObject).append(",");
    if (this.cUQ)
    {
      i = 1;
      ((StringBuffer)localObject).append(i);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cUR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cUS);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cUT);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cUU);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cUV);
      ((StringBuffer)localObject).append(",");
      if (this.cUW == null)
        break label225;
    }
    label225: for (int i = this.cUW.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(15829);
      return localObject;
      i = 0;
      break;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(15830);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ChatName:").append(this.cUM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MemberCount:").append(this.cUN);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MsgSvrId:").append(this.cUO);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MsgCreateTime:").append(this.cUP);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsHdImgBool:").append(this.cUQ);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ImgSize:").append(this.cUR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ImgWidth:").append(this.cUS);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ImgHeight:").append(this.cUT);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartDownloadTimeStampMs:").append(this.cUU);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FinishDownloadTimeStampMs:").append(this.cUV);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FinishCode:").append(this.cUW);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(15830);
    return localObject;
  }

  public final e Fn()
  {
    AppMethodBeat.i(15827);
    this.cUU = bo.anU();
    super.aj("StartDownloadTimeStampMs", this.cUU);
    AppMethodBeat.o(15827);
    return this;
  }

  public final e Fo()
  {
    AppMethodBeat.i(15828);
    this.cUV = bo.anU();
    super.aj("FinishDownloadTimeStampMs", this.cUV);
    AppMethodBeat.o(15828);
    return this;
  }

  public final e er(String paramString)
  {
    AppMethodBeat.i(15826);
    this.cUM = t("ChatName", paramString, true);
    AppMethodBeat.o(15826);
    return this;
  }

  public final int getId()
  {
    return 15749;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.e
 * JD-Core Version:    0.6.2
 */