package com.tencent.mm.plugin.webview.luggage.a;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.plugin.downloader.b.a.b;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$1
  implements a.b
{
  public final void E(int paramInt, long paramLong)
  {
    AppMethodBeat.i(6421);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 7:
    case 4:
    case 5:
    case 3:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(6421);
      while (true)
      {
        return;
        Object localObject = c.hv(paramLong);
        if (localObject != null)
        {
          JSONObject localJSONObject1 = new JSONObject();
          try
          {
            localJSONObject1.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
            localJSONObject1.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
            localJSONObject1.put("state", "download_start");
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            ((Bundle)localObject).putString("name", "wxdownload:state_change");
            ((Bundle)localObject).putString("data", localJSONObject1.toString());
            ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
            AppMethodBeat.o(6421);
          }
          catch (JSONException localJSONException1)
          {
          }
        }
        else
        {
          AppMethodBeat.o(6421);
          continue;
          localObject = c.hv(paramLong);
          if (localObject != null)
          {
            JSONObject localJSONObject2 = new JSONObject();
            try
            {
              localJSONObject2.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
              localJSONObject2.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
              if ((((com.tencent.mm.plugin.downloader.f.a)localObject).field_fromDownloadApp) && (((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadInWifi) && (!at.isWifi(ah.getContext())))
                localJSONObject2.put("state", "download_wait_for_wifi");
              while (true)
              {
                localObject = new android/os/Bundle;
                ((Bundle)localObject).<init>();
                ((Bundle)localObject).putString("name", "wxdownload:state_change");
                ((Bundle)localObject).putString("data", localJSONObject2.toString());
                ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                AppMethodBeat.o(6421);
                break;
                localJSONObject2.put("state", "download_pause");
              }
            }
            catch (JSONException localJSONException2)
            {
            }
          }
          else
          {
            AppMethodBeat.o(6421);
            continue;
            localObject = c.hv(paramLong);
            if (localObject != null)
            {
              JSONObject localJSONObject3 = new JSONObject();
              try
              {
                localJSONObject3.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                localJSONObject3.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
                localJSONObject3.put("state", "download_resumed");
                localObject = new android/os/Bundle;
                ((Bundle)localObject).<init>();
                ((Bundle)localObject).putString("name", "wxdownload:state_change");
                ((Bundle)localObject).putString("data", localJSONObject3.toString());
                ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                AppMethodBeat.o(6421);
              }
              catch (JSONException localJSONException3)
              {
              }
            }
            else
            {
              AppMethodBeat.o(6421);
              continue;
              localObject = c.hv(paramLong);
              if (localObject != null)
              {
                JSONObject localJSONObject4 = new JSONObject();
                try
                {
                  localJSONObject4.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                  localJSONObject4.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
                  localJSONObject4.put("state", "download_removed");
                  localObject = new android/os/Bundle;
                  ((Bundle)localObject).<init>();
                  ((Bundle)localObject).putString("name", "wxdownload:state_change");
                  ((Bundle)localObject).putString("data", localJSONObject4.toString());
                  ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                  AppMethodBeat.o(6421);
                }
                catch (JSONException localJSONException4)
                {
                }
              }
              else
              {
                AppMethodBeat.o(6421);
                continue;
                localObject = c.hv(paramLong);
                if (localObject != null)
                {
                  JSONObject localJSONObject5 = new JSONObject();
                  try
                  {
                    localJSONObject5.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                    localJSONObject5.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
                    localJSONObject5.put("state", "download_fail");
                    localObject = new android/os/Bundle;
                    ((Bundle)localObject).<init>();
                    ((Bundle)localObject).putString("name", "wxdownload:state_change");
                    ((Bundle)localObject).putString("data", localJSONObject5.toString());
                    ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                    AppMethodBeat.o(6421);
                  }
                  catch (JSONException localJSONException5)
                  {
                  }
                }
                else
                {
                  AppMethodBeat.o(6421);
                  continue;
                  localObject = c.hv(paramLong);
                  if (localObject != null)
                  {
                    JSONObject localJSONObject6 = new JSONObject();
                    try
                    {
                      localJSONObject6.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                      localJSONObject6.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
                      localJSONObject6.put("state", "download_succ");
                      localObject = new android/os/Bundle;
                      ((Bundle)localObject).<init>();
                      ((Bundle)localObject).putString("name", "wxdownload:state_change");
                      ((Bundle)localObject).putString("data", localJSONObject6.toString());
                      ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                      AppMethodBeat.o(6421);
                    }
                    catch (JSONException localJSONException6)
                    {
                    }
                  }
                  else
                  {
                    AppMethodBeat.o(6421);
                    continue;
                    localObject = c.hv(paramLong);
                    if ((localObject == null) || (((com.tencent.mm.plugin.downloader.f.a)localObject).field_totalSize == 0L))
                    {
                      ab.w("MicroMsg.JsDownloadEventDispatch", "loadDownloadProgress failed");
                      AppMethodBeat.o(6421);
                    }
                    else
                    {
                      paramInt = (int)(((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadedSize / ((com.tencent.mm.plugin.downloader.f.a)localObject).field_totalSize * 100.0D);
                      float f = (float)((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadedSize / (float)((com.tencent.mm.plugin.downloader.f.a)localObject).field_totalSize * 100.0F;
                      ab.d("MicroMsg.JsDownloadEventDispatch", "onDownloadTaskProgressChanged, progressFloat: %f", new Object[] { Float.valueOf(f) });
                      JSONObject localJSONObject7 = new JSONObject();
                      try
                      {
                        localJSONObject7.put("appid", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                        localJSONObject7.put("download_id", ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId);
                        localJSONObject7.put("progress", paramInt);
                        localJSONObject7.put("progress_float", f);
                        localObject = new android/os/Bundle;
                        ((Bundle)localObject).<init>();
                        ((Bundle)localObject).putString("name", "wxdownload:progress_change");
                        ((Bundle)localObject).putString("data", localJSONObject7.toString());
                        ToolsProcessIPCService.a((Parcelable)localObject, a.class, null);
                        AppMethodBeat.o(6421);
                      }
                      catch (JSONException localJSONException7)
                      {
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.a.b.1
 * JD-Core Version:    0.6.2
 */