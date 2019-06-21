package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

final class al$1
  implements Runnable
{
  al$1(al paramal, JSONObject paramJSONObject, bc.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6354);
    Object localObject = this.hsm.optJSONArray("appIdArray");
    if ((localObject != null) && (((JSONArray)localObject).length() > 0))
    {
      al.b((JSONArray)localObject, this.kOw);
      AppMethodBeat.o(6354);
    }
    while (true)
    {
      return;
      long l = this.hsm.optLong("download_id", -1L);
      localObject = this.hsm.optString("appid");
      FileDownloadTaskInfo localFileDownloadTaskInfo;
      if (l > 0L)
      {
        localFileDownloadTaskInfo = d.bij().hm(l);
        localObject = localFileDownloadTaskInfo;
        if (localFileDownloadTaskInfo == null)
          localObject = new FileDownloadTaskInfo();
        al.b((FileDownloadTaskInfo)localObject, this.kOw);
        AppMethodBeat.o(6354);
      }
      else if (!bo.isNullOrNil((String)localObject))
      {
        localFileDownloadTaskInfo = d.bij().Ir((String)localObject);
        localObject = localFileDownloadTaskInfo;
        if (localFileDownloadTaskInfo == null)
          localObject = new FileDownloadTaskInfo();
        al.b((FileDownloadTaskInfo)localObject, this.kOw);
        AppMethodBeat.o(6354);
      }
      else
      {
        this.kOw.d("fail", null);
        AppMethodBeat.o(6354);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.al.1
 * JD-Core Version:    0.6.2
 */