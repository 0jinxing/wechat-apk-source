package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public String appId;
  public String appName;
  public int cBA;
  public String downloadUrl;
  public String extInfo;
  public int fileType;
  public boolean kNt;
  public String kOB;
  public long kOC;
  public String kOD;
  public String packageName;
  public int scene;

  public static a H(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(35547);
    a locala = new a();
    if (paramMap == null)
      AppMethodBeat.o(35547);
    while (true)
    {
      return locala;
      locala.appName = ((String)paramMap.get("task_name"));
      locala.downloadUrl = ((String)paramMap.get("task_url"));
      locala.kOB = ((String)paramMap.get("alternative_url"));
      locala.kOC = bo.getLong((String)paramMap.get("task_size"), 0L);
      locala.kOD = ((String)paramMap.get("file_md5"));
      locala.extInfo = ((String)paramMap.get("extInfo"));
      locala.fileType = bo.getInt((String)paramMap.get("fileType"), 0);
      locala.appId = ((String)paramMap.get("appid"));
      locala.packageName = ((String)paramMap.get("package_name"));
      locala.scene = bo.getInt((String)paramMap.get("scene"), 1000);
      locala.cBA = bo.getInt((String)paramMap.get("downloader_type"), 1);
      AppMethodBeat.o(35547);
    }
  }

  public static a R(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(35546);
    a locala = new a();
    locala.appName = paramJSONObject.optString("task_name");
    locala.downloadUrl = paramJSONObject.optString("task_url");
    locala.kOB = paramJSONObject.optString("alternative_url");
    locala.kOC = paramJSONObject.optLong("task_size");
    locala.kOD = paramJSONObject.optString("file_md5");
    locala.extInfo = paramJSONObject.optString("extInfo");
    locala.fileType = bo.getInt(paramJSONObject.optString("fileType"), 0);
    locala.appId = paramJSONObject.optString("appid");
    locala.packageName = paramJSONObject.optString("packageName");
    locala.scene = paramJSONObject.optInt("scene", 1000);
    locala.cBA = paramJSONObject.optInt("downloader_type", 1);
    locala.kNt = paramJSONObject.optBoolean("download_in_wifi", false);
    AppMethodBeat.o(35546);
    return locala;
  }

  public final boolean isValid()
  {
    AppMethodBeat.i(35548);
    boolean bool;
    if (!bo.isNullOrNil(this.downloadUrl))
    {
      bool = true;
      AppMethodBeat.o(35548);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.a
 * JD-Core Version:    0.6.2
 */