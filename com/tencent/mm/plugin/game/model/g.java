package com.tencent.mm.plugin.game.model;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class g
{
  JSONObject mVR = new JSONObject();

  protected g(String paramString)
  {
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.GameServerData", "Null or nil json string");
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        this.mVR = localJSONObject;
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.GameServerData", "Json parsing error");
      }
    }
  }

  private static String j(JSONObject paramJSONObject, String paramString)
  {
    String str = null;
    if (paramJSONObject == null);
    while (true)
    {
      return str;
      if (!paramJSONObject.isNull(paramString))
        str = paramJSONObject.optString(paramString);
    }
  }

  protected static LinkedList<c> s(JSONArray paramJSONArray)
  {
    LinkedList localLinkedList = new LinkedList();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      ab.i("MicroMsg.GameServerData", "Null or empty json array");
    while (true)
    {
      return localLinkedList;
      ab.i("MicroMsg.GameServerData", "Parsing json AppInfo, size: %d", new Object[] { Integer.valueOf(paramJSONArray.length()) });
      int i = 0;
      if (i < paramJSONArray.length())
      {
        Object localObject = paramJSONArray.optJSONObject(i);
        if (localObject == null)
        {
          ab.e("MicroMsg.GameServerData", "Invalid json object");
          localObject = null;
        }
        while (true)
        {
          if (localObject != null)
            localLinkedList.add(localObject);
          i++;
          break;
          JSONObject localJSONObject = ((JSONObject)localObject).optJSONObject("YYB");
          String str = j((JSONObject)localObject, "appID");
          if (bo.isNullOrNil(str))
          {
            ab.e("MicroMsg.GameServerData", "No AppID field, abort");
            localObject = null;
          }
          else
          {
            ab.i("MicroMsg.GameServerData", "Parsing AppID: %s", new Object[] { str });
            c localc = new c();
            localc.field_appId = str;
            localc.field_appName = j((JSONObject)localObject, "name");
            localc.field_appIconUrl = j((JSONObject)localObject, "iconURL");
            localc.field_appType = ",1,";
            localc.field_packageName = j((JSONObject)localObject, "AndroidPackageName");
            localc.ih(j((JSONObject)localObject, "downloadURL"));
            localc.ik(j((JSONObject)localObject, "AndroidApkMd5"));
            str = j((JSONObject)localObject, "GooglePlayDownloadUrl");
            int j = ((JSONObject)localObject).optInt("GooglePlayDownloadFlag");
            localc.il(str);
            if (!bo.isNullOrNil(str))
            {
              ab.i("MicroMsg.GameServerData", "GooglePlay URL: %s, Download Flag: %d", new Object[] { str, Integer.valueOf(j) });
              localc.hq(j);
            }
            if (localJSONObject != null)
              localc.hq(localJSONObject.optInt("AndroidDownloadFlag"));
            if (localJSONObject != null)
            {
              localc.iq(j(localJSONObject, "DownloadUrl"));
              localc.ir(j(localJSONObject, "ApkMd5"));
              localc.io(j(localJSONObject, "PreemptiveUrl"));
              localc.ip(j(localJSONObject, "ExtInfo"));
              localc.hr(localJSONObject.optInt("SupportedVersionCode"));
            }
            localc.mVk = j((JSONObject)localObject, "desc");
            localc.mVj = j((JSONObject)localObject, "brief");
            localc.type = ((JSONObject)localObject).optInt("type", 0);
            localc.status = ((JSONObject)localObject).optInt("status");
            localc.mVm = j((JSONObject)localObject, "webURL");
            localc.mVn = j((JSONObject)localObject, "adUrl");
            localc.ctu = j((JSONObject)localObject, "noticeid");
            localc.mVo = ((JSONObject)localObject).optBoolean("isSubscribed");
            localc.versionCode = ((JSONObject)localObject).optInt("versionCode");
            localObject = localc;
            if (localJSONObject != null)
            {
              localc.mVp = j(localJSONObject, "DownloadTipsWording");
              localc.mVq = j(localJSONObject, "BackBtnWording");
              localc.mVr = j(localJSONObject, "DownloadBtnWording");
              localObject = localc;
            }
          }
        }
      }
    }
  }

  protected final JSONArray optJSONArray(String paramString)
  {
    return this.mVR.optJSONArray(paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.g
 * JD-Core Version:    0.6.2
 */