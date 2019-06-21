package com.tencent.mm.plugin.cdndownloader.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g.a;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.plugin.cdndownloader.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public class CDNDownloadService extends Service
  implements a
{
  private static com.tencent.mm.plugin.cdndownloader.a.b ktn;
  private static g.a ktz;
  private final a.a kty;

  static
  {
    AppMethodBeat.i(957);
    ktz = new CDNDownloadService.2();
    AppMethodBeat.o(957);
  }

  public CDNDownloadService()
  {
    AppMethodBeat.i(949);
    this.kty = new CDNDownloadService.1(this);
    AppMethodBeat.o(949);
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(950);
    ab.i("MicroMsg.CDNDownloadService", "onBind");
    paramIntent = this.kty;
    AppMethodBeat.o(950);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(952);
    super.onCreate();
    ab.i("MicroMsg.CDNDownloadService", "onCreate");
    AppMethodBeat.o(952);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(953);
    super.onDestroy();
    ab.i("MicroMsg.CDNDownloadService", "onDestroy");
    b.a.PZ().b(this);
    h.pYm.a(710L, 1L, 1L, false);
    AppMethodBeat.o(953);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(951);
    ab.i("MicroMsg.CDNDownloadService", "onUnbind");
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(951);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService
 * JD-Core Version:    0.6.2
 */