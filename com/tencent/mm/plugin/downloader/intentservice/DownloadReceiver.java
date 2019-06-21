package com.tencent.mm.plugin.downloader.intentservice;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ap;
import com.tencent.mm.plugin.notification.c;

public class DownloadReceiver extends ResultReceiver
{
  private static final String TAG;
  private v.c Fw;

  static
  {
    AppMethodBeat.i(2339);
    TAG = DownloadReceiver.class.getSimpleName();
    AppMethodBeat.o(2339);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(2338);
    super.onReceiveResult(paramInt, paramBundle);
    if (paramInt == 4657)
    {
      paramInt = paramBundle.getInt("progress");
      if (c.oVm == null)
        AppMethodBeat.o(2338);
    }
    while (true)
    {
      return;
      if (paramInt < 100)
      {
        this.Fw.b(100, paramInt, false).e("Download in progress:".concat(String.valueOf(paramInt)));
        c.oVm.notify(4657, this.Fw.build());
        AppMethodBeat.o(2338);
      }
      else
      {
        this.Fw.b(0, 0, false).e("Download Complete");
        c.oVm.notify(4658, this.Fw.build());
        AppMethodBeat.o(2338);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.intentservice.DownloadReceiver
 * JD-Core Version:    0.6.2
 */