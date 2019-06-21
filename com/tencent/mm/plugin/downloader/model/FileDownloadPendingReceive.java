package com.tencent.mm.plugin.downloader.model;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

public class FileDownloadPendingReceive extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(2439);
    ab.i("MicroMsg.FileDownloadPendingReceive", "onReceive()");
    paramIntent.setComponent(new ComponentName(paramIntent.getComponent().getPackageName(), FileDownloadService.class.getName()));
    d.aH(paramIntent);
    AppMethodBeat.o(2439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive
 * JD-Core Version:    0.6.2
 */