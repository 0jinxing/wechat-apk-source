package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;
import org.json.JSONObject;

public final class ax$a
{
  public String SNGAppId;
  public String actionFlag;
  public String mYX;
  public String taskApkId;
  public String taskAppId;
  public String taskPackageName;
  public int taskVersion;
  public String uin;
  public String uinType;
  public String via;

  private void NX(String paramString)
  {
    AppMethodBeat.i(111487);
    ab.i("MicroMsg.QQDownloaderSDKWrapper", "params is : [%s]", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.QQDownloaderSDKWrapper", "params is null or nil");
      AppMethodBeat.o(111487);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        this.taskApkId = localJSONObject.optString("taskApkId");
        this.via = localJSONObject.optString("via");
        this.taskVersion = localJSONObject.optInt("taskVersion");
        this.mYX = localJSONObject.optString("channelID");
        this.uin = localJSONObject.optString("uin");
        this.SNGAppId = localJSONObject.optString("SNGAppId");
        this.taskAppId = localJSONObject.optString("taskAppId");
        this.uinType = localJSONObject.optString("uinType");
        this.taskPackageName = localJSONObject.optString("taskPackageName");
        this.actionFlag = localJSONObject.optString("actionFlag");
        AppMethodBeat.o(111487);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.QQDownloaderSDKWrapper", "parse parms failed:[%s]", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(111487);
      }
    }
  }

  public final TMQQDownloaderOpenSDKParam NY(String paramString)
  {
    AppMethodBeat.i(111488);
    NX(paramString);
    paramString = new TMQQDownloaderOpenSDKParam(this.SNGAppId, this.taskAppId, this.taskApkId, this.taskVersion, this.via, this.taskPackageName, this.uin, this.uinType, this.mYX, this.actionFlag);
    AppMethodBeat.o(111488);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ax.a
 * JD-Core Version:    0.6.2
 */