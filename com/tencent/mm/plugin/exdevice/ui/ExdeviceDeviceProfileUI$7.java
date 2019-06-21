package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.b;

final class ExdeviceDeviceProfileUI$7
  implements h.b
{
  ExdeviceDeviceProfileUI$7(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(19944);
    ab.d("MicroMsg.ExdeviceDeviceProfileUI", "result : %s.", new Object[] { paramCharSequence });
    String str = "";
    if (paramCharSequence != null)
      str = paramCharSequence.toString();
    boolean bool;
    if (ExdeviceDeviceProfileUI.a(this.lAM))
    {
      ExdeviceDeviceProfileUI.a(this.lAM, str);
      this.lAM.runOnUiThread(new ExdeviceDeviceProfileUI.7.1(this));
      paramCharSequence = ad.boW().dS(ExdeviceDeviceProfileUI.b(this.lAM), ExdeviceDeviceProfileUI.c(this.lAM));
      if (paramCharSequence == null)
      {
        ab.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", new Object[] { ExdeviceDeviceProfileUI.b(this.lAM), ExdeviceDeviceProfileUI.c(this.lAM) });
        AppMethodBeat.o(19944);
        bool = false;
        return bool;
      }
      paramCharSequence.iy(ExdeviceDeviceProfileUI.d(this.lAM));
      ad.boW().c(paramCharSequence, new String[0]);
    }
    while (true)
    {
      AppMethodBeat.o(19944);
      bool = true;
      break;
      paramCharSequence = new y(ExdeviceDeviceProfileUI.b(this.lAM), ExdeviceDeviceProfileUI.c(this.lAM), str);
      ExdeviceDeviceProfileUI.a(this.lAM, paramCharSequence);
      aw.Rg().a(1263, this.lAM);
      aw.Rg().a(paramCharSequence, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.7
 * JD-Core Version:    0.6.2
 */