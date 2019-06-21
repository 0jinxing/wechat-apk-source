package com.tencent.ttpic.device;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAttrs$1
  implements Runnable
{
  DeviceAttrs$1(DeviceAttrs paramDeviceAttrs, String paramString1, String paramString2, String paramString3, DeviceAttrs.UpdateListener paramUpdateListener)
  {
  }

  public void run()
  {
    boolean bool = true;
    AppMethodBeat.i(49803);
    Object localObject1 = DeviceAttrs.access$000(this.this$0).getString("xml_version", "0");
    LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] currentVer = ".concat(String.valueOf(localObject1)));
    Object localObject2 = DeviceUpdate.checkConfigVersion(DeviceAttrs.access$200(this.this$0), this.val$packageName, (String)localObject1, this.val$appId, this.val$appVersion);
    LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] jsonStr = ".concat(String.valueOf(localObject2)));
    if (TextUtils.isEmpty((CharSequence)localObject2))
      AppMethodBeat.o(49803);
    while (true)
    {
      return;
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = ((JSONObject)localObject1).getString("ret");
        LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] retStr = ".concat(String.valueOf(localObject2)));
        if (((String)localObject2).equals("1"))
        {
          Object localObject3 = ((JSONObject)localObject1).getString("camCoreConfUrl");
          LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] urlStr = ".concat(String.valueOf(localObject3)));
          localObject2 = ((JSONObject)localObject1).getString("curCamCoreVersion");
          LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] verStr = ".concat(String.valueOf(localObject2)));
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = DeviceAttrs.access$300(this.this$0) + "phone_attrs_config.zip";
          if (DeviceUpdate.httpDownloadFile((String)localObject3, (String)localObject4))
          {
            localObject3 = DeviceUpdate.unZip((String)localObject4, DeviceAttrs.access$300(this.this$0));
            if (!TextUtils.isEmpty((CharSequence)localObject3))
            {
              LogUtils.d(DeviceAttrs.access$100(), "[checkVersion] unZipfilePath = ".concat(String.valueOf(localObject3)));
              localObject4 = DeviceAttrs.access$000(this.this$0).edit();
              ((SharedPreferences.Editor)localObject4).putString("xml_version", (String)localObject2);
              ((SharedPreferences.Editor)localObject4).apply();
              localObject2 = DeviceParser.parseCameraAttrsFile(DeviceAttrs.access$400(this.this$0), (String)localObject3, DeviceInstance.getInstance().getDeviceName(), DeviceAttrs.access$500(this.this$0));
              if (localObject2 != null)
                DeviceAttrs.access$600(this.this$0, (String)localObject2);
              DeviceAttrs.access$700(this.this$0);
              DeviceAttrs.access$800(this.this$0);
              if (this.val$listener != null)
              {
                localObject3 = this.val$listener;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((DeviceAttrs.UpdateListener)localObject3).onSuccess(DeviceAttrs.access$200(this.this$0) + ", download and parse success");
              }
              localObject2 = new android/content/Intent;
              ((Intent)localObject2).<init>();
              ((Intent)localObject2).setAction("action_check_online_update_finish");
              DeviceAttrs.access$400(this.this$0).sendBroadcast((Intent)localObject2);
            }
          }
        }
        localObject2 = this.this$0;
        if (((JSONObject)localObject1).optInt("nativeJpegEnable", 1) == 1);
        while (true)
        {
          ((DeviceAttrs)localObject2).serverJpegEnable = bool;
          AppMethodBeat.o(49803);
          break;
          bool = false;
        }
      }
      catch (JSONException localJSONException)
      {
        LogUtils.e(DeviceAttrs.access$100(), "checkVersion JSONException e = ".concat(String.valueOf(localJSONException)));
        AppMethodBeat.o(49803);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceAttrs.1
 * JD-Core Version:    0.6.2
 */