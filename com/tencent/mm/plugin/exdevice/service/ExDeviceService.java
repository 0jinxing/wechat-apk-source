package com.tencent.mm.plugin.exdevice.service;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.k;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.service.MMService;

@k
public class ExDeviceService extends MMService
{
  private h.a lwD = null;

  private static boolean bpn()
  {
    AppMethodBeat.i(19569);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      bool = true;
      ab.i("MicroMsg.exdevice.ExDeviceService", "isInstallWearApp %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(19569);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        boolean bool = false;
    }
  }

  public final IBinder Iu()
  {
    AppMethodBeat.i(19570);
    ab.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onBind");
    if (this.lwD == null)
      this.lwD = new y();
    h.a locala = this.lwD;
    AppMethodBeat.o(19570);
    return locala;
  }

  public final String getTag()
  {
    return "MicroMsg.exdevice.ExDeviceService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(19567);
    ab.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onCreate");
    super.onCreate();
    AppMethodBeat.o(19567);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(19568);
    ab.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onDestroy");
    Java2CExDevice.closeBluetoothAccessoryLib();
    super.onDestroy();
    if (!bpn())
    {
      ab.i("MicroMsg.exdevice.ExDeviceService", "kill exdevice process now");
      Process.killProcess(Process.myPid());
    }
    AppMethodBeat.o(19568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ExDeviceService
 * JD-Core Version:    0.6.2
 */