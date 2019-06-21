package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.Map;

final class g$65
  implements Runnable
{
  g$65(g paramg, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9126);
    long l = bo.getLong((String)this.uqf.puc.get("download_id"), -1L);
    Object localObject = (String)this.uqf.puc.get("appid");
    String str = (String)this.uqf.puc.get("appIdArray");
    ab.i("MicroMsg.MsgHandler", "doQueryDownloadTask, downloadId = " + l + ",appId = " + (String)localObject + ",appIds = " + str);
    if (!bo.isNullOrNil(str))
    {
      g.a(this.uHd, str, this.uqf);
      AppMethodBeat.o(9126);
      return;
    }
    if (l > 0L)
    {
      localObject = d.bij().hm(l);
      label150: switch (((FileDownloadTaskInfo)localObject).status)
      {
      case 0:
      default:
        str = "default";
      case -1:
      case 1:
      case 3:
      case 2:
      case 4:
      }
    }
    while (true)
    {
      ab.i("MicroMsg.MsgHandler", "doQueryDownloadTask, state = ".concat(String.valueOf(str)));
      HashMap localHashMap = new HashMap();
      localHashMap.put("state", str);
      localHashMap.put("download_id", Long.valueOf(((FileDownloadTaskInfo)localObject).id));
      if (((FileDownloadTaskInfo)localObject).kNu)
        localHashMap.put("reserve_for_wifi", Integer.valueOf(1));
      if (((FileDownloadTaskInfo)localObject).jrb != 0L)
      {
        l = ((FileDownloadTaskInfo)localObject).kNr * 100L / ((FileDownloadTaskInfo)localObject).jrb;
        float f = (float)((FileDownloadTaskInfo)localObject).kNr * 100.0F / (float)((FileDownloadTaskInfo)localObject).jrb;
        localHashMap.put("progress", Long.valueOf(l));
        localHashMap.put("progress_float", Float.valueOf(f));
      }
      g.a(this.uHd, this.uqf, "query_download_task:ok", localHashMap);
      AppMethodBeat.o(9126);
      break;
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = d.bij().Ir((String)localObject);
        break label150;
      }
      ab.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, invalid downloadId = " + l + " or appid is null");
      g.a(this.uHd, this.uqf, "query_download_task:fail", null);
      AppMethodBeat.o(9126);
      break;
      ab.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, api not support");
      g.a(this.uHd, this.uqf, "query_download_task:fail_apilevel_too_low", null);
      AppMethodBeat.o(9126);
      break;
      str = "downloading";
      continue;
      if (e.ct(((FileDownloadTaskInfo)localObject).path))
      {
        str = "download_succ";
      }
      else
      {
        str = "default";
        continue;
        str = "download_pause";
        continue;
        str = "download_fail";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.65
 * JD-Core Version:    0.6.2
 */