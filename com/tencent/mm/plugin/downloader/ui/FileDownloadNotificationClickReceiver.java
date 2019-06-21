package com.tencent.mm.plugin.downloader.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class FileDownloadNotificationClickReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(2521);
    ab.i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
    ab.i("MicroMsg.FileDownloadNotificationClickReceiver", "topActivityName = ".concat(String.valueOf(bo.cc(paramContext))));
    Bundle localBundle = paramIntent.getExtras();
    paramIntent = new Intent(paramContext, FileDownloadConfirmUI.class);
    paramIntent.putExtras(localBundle);
    paramIntent.setFlags(268435456);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(2521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.ui.FileDownloadNotificationClickReceiver
 * JD-Core Version:    0.6.2
 */