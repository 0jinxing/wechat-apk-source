package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class bp extends a
{
  public long cVR = 0L;
  private String cWo = "";
  private String ddc = "";
  public long ddd = 0L;
  public bp.a dde;
  public bp.b ddf;
  public long ddg = 0L;
  public long ddh = 0L;
  public long ddi = 0L;
  public long ddj = 0L;
  public long ddk = 0L;

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(128654);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cWo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ddd);
    ((StringBuffer)localObject).append(",");
    if (this.dde != null);
    for (int j = this.dde.value; ; j = -1)
    {
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      j = i;
      if (this.ddf != null)
        j = this.ddf.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddg);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddh);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddi);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddj);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cVR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.ddk);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128654);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128655);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("SessionId:").append(this.cWo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppVersion:").append(this.ddd);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppState:").append(this.dde);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.ddf);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isPreload:").append(this.ddg);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreloadKey:").append(this.ddh);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreloadValue:").append(this.ddi);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("isDownloadCode:").append(this.ddj);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hasSplashScreen:").append(this.ddk);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128655);
    return localObject;
  }

  public final int getId()
  {
    return 16602;
  }

  public final bp gl(String paramString)
  {
    AppMethodBeat.i(128652);
    this.cWo = t("SessionId", paramString, true);
    AppMethodBeat.o(128652);
    return this;
  }

  public final bp gm(String paramString)
  {
    AppMethodBeat.i(128653);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(128653);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bp
 * JD-Core Version:    0.6.2
 */