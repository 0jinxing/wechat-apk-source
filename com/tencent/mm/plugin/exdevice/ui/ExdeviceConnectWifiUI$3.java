package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.exdevice.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.e;

final class ExdeviceConnectWifiUI$3
  implements Runnable
{
  ExdeviceConnectWifiUI$3(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19874);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      aw.ZK();
      localObject = e.e(c.getAccPath() + "exdevice_wifi_infos", 0, 2147483647);
      if (localObject != null)
      {
        ExdeviceConnectWifiUI.o(this.lAf).parseFrom((byte[])localObject);
        ExdeviceConnectWifiUI.p(this.lAf);
      }
      al.n(new ExdeviceConnectWifiUI.3.1(this), 500L);
      AppMethodBeat.o(19874);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.d("MicroMsg.exdevice.ExdeviceConnectWifiUI", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", localException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.3
 * JD-Core Version:    0.6.2
 */