package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class ad$2
  implements Runnable
{
  ad$2(ad paramad)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19381);
    boolean bool1 = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
    boolean bool2 = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
    if ((bool1) && (bool2))
      h.pYm.a(11891, "3", true, true);
    while (true)
    {
      ab.i("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] deviceFeatures stepCounter %s, stepDetector %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      AppMethodBeat.o(19381);
      return;
      if (bool1)
        h.pYm.a(11891, "1", true, true);
      else if (bool2)
        h.pYm.a(11891, "2", true, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ad.2
 * JD-Core Version:    0.6.2
 */