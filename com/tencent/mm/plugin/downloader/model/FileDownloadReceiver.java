package com.tencent.mm.plugin.downloader.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@JgClassChecked(author=20, fComment="checked", lastDate="20150202", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class FileDownloadReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(2440);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(2440);
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      ab.i("MicroMsg.FileDownloadReceiver", paramContext);
      if (bo.isNullOrNil(paramContext))
      {
        ab.e("MicroMsg.FileDownloadReceiver", "action is null or nill, ignore");
        AppMethodBeat.o(2440);
      }
      else
      {
        paramContext.equals("android.intent.action.DOWNLOAD_COMPLETE");
        AppMethodBeat.o(2440);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.FileDownloadReceiver
 * JD-Core Version:    0.6.2
 */