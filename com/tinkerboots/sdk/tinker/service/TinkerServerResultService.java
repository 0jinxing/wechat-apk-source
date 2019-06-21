package com.tinkerboots.sdk.tinker.service;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.lib.util.b;
import com.tinkerboots.sdk.b.d.b;
import java.io.File;

public class TinkerServerResultService extends DefaultTinkerResultService
{
  private static boolean AUd = false;
  private static com.tinkerboots.sdk.tinker.a.a AUe = null;

  static void restartProcess()
  {
    AppMethodBeat.i(65551);
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "app is background now, i can kill quietly", new Object[0]);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(65551);
  }

  public final void a(com.tencent.tinker.lib.service.a parama)
  {
    AppMethodBeat.i(65550);
    if (parama == null)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerServerResultService", "received null result!!!!", new Object[0]);
      AppMethodBeat.o(65550);
    }
    while (true)
    {
      return;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "receive result: %s", new Object[] { parama.toString() });
      b.iY(getApplicationContext());
      if (parama.cxT)
      {
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "patch success, please restart process", new Object[0]);
        aj(new File(parama.ABv));
        if (b(parama))
        {
          if (AUd)
          {
            com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "tinker wait screen to restart process", new Object[0]);
            new d.b(getApplicationContext(), new TinkerServerResultService.1(this));
            AppMethodBeat.o(65550);
          }
        }
        else
        {
          com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "I have already install the newly patch version!", new Object[0]);
          AppMethodBeat.o(65550);
        }
      }
      else
      {
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerResultService", "patch fail, please check reason", new Object[0]);
        AppMethodBeat.o(65550);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.tinker.service.TinkerServerResultService
 * JD-Core Version:    0.6.2
 */