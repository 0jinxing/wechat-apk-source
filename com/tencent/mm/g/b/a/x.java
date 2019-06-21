package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class x extends a
{
  private String cVA;
  private String cVC;
  private long cVD;
  private long cVE;
  private String cVM;
  private String cVQ;
  private String cVw;
  private String cVx;
  private String cVz;
  private long cYf;
  private long cYg;
  private int cYh;
  private long cYi;
  private long cYj;

  public x()
  {
    this.cVD = 0L;
    this.cVE = 0L;
    this.cYf = 0L;
    this.cVC = "";
    this.cYg = 0L;
    this.cYh = 0;
    this.cYi = 0L;
    this.cVM = "";
    this.cVw = "";
    this.cVx = "";
    this.cYj = 0L;
    this.cVz = "";
    this.cVA = "";
    this.cVQ = "";
  }

  public x(String paramString)
  {
    AppMethodBeat.i(50537);
    this.cVD = 0L;
    this.cVE = 0L;
    this.cYf = 0L;
    this.cVC = "";
    this.cYg = 0L;
    this.cYh = 0;
    this.cYi = 0L;
    this.cVM = "";
    this.cVw = "";
    this.cVx = "";
    this.cYj = 0L;
    this.cVz = "";
    this.cVA = "";
    this.cVQ = "";
    String[] arrayOfString;
    if (paramString != null)
    {
      arrayOfString = paramString.split(",");
      if (arrayOfString != null)
      {
        if (arrayOfString.length >= 14)
          break label321;
        paramString = new String[14];
        Arrays.fill(paramString, 0, 14, "");
        System.arraycopy(arrayOfString, 0, paramString, 0, arrayOfString.length);
      }
    }
    while (true)
    {
      this.cVD = bo.getLong(paramString[0], 0L);
      this.cVE = bo.getLong(paramString[1], 0L);
      this.cYf = bo.getLong(paramString[2], 0L);
      this.cVC = t("NewMd5", paramString[3], true);
      this.cYg = bo.getLong(paramString[4], 0L);
      this.cYh = bo.getInt(paramString[5], 0);
      this.cYi = bo.getLong(paramString[6], 0L);
      this.cVM = t("CDNIp", paramString[7], true);
      this.cVw = t("FromUser", paramString[8], true);
      this.cVx = t("Session", paramString[9], true);
      this.cYj = bo.getLong(paramString[10], 0L);
      this.cVz = t("FileId", paramString[11], true);
      this.cVA = t("SnsUrl", paramString[12], true);
      this.cVQ = t("Publishid", paramString[13], true);
      AppMethodBeat.o(50537);
      return;
      label321: paramString = arrayOfString;
    }
  }

  public final String Fj()
  {
    AppMethodBeat.i(50538);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cVD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cVQ);
    localObject = ((StringBuffer)localObject).toString();
    VX((String)localObject);
    AppMethodBeat.o(50538);
    return localObject;
  }

  public final String Fk()
  {
    AppMethodBeat.i(50539);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("DownloadStartTime:").append(this.cVD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadEndTime:").append(this.cVE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadSize:").append(this.cYf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("NewMd5:").append(this.cVC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MsgType:").append(this.cYg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownloadSpeed:").append(this.cYh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("HadFinishSize:").append(this.cYi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("CDNIp:").append(this.cVM);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FromUser:").append(this.cVw);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Session:").append(this.cVx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChatroomNum:").append(this.cYj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("FileId:").append(this.cVz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SnsUrl:").append(this.cVA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Publishid:").append(this.cVQ);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50539);
    return localObject;
  }

  public final int getId()
  {
    return 14499;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.x
 * JD-Core Version:    0.6.2
 */