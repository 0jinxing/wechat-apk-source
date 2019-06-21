package com.tencent.mm.plugin.scanner.util;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class ScanCameraLightDetector$1 extends ak
{
  public ScanCameraLightDetector$1(ScanCameraLightDetector paramScanCameraLightDetector, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(81446);
    if (paramMessage.what == 233)
    {
      paramMessage = (ScanCameraLightDetector.a)paramMessage.obj;
      if (paramMessage != null)
      {
        long l = bo.yz();
        boolean bool = ScanCameraLightDetector.w(paramMessage.ovq, paramMessage.width, paramMessage.height);
        ab.i("MicroMsg.ScanCameraLightDetector", "isYuvDark: %s, currentLight: %s, used %sms", new Object[] { Boolean.valueOf(bool), Float.valueOf(ScanCameraLightDetector.a(this.qif)), Long.valueOf(bo.az(l)) });
        if (bool)
        {
          ab.i("MicroMsg.ScanCameraLightDetector", "is dark now");
          al.d(new ScanCameraLightDetector.1.1(this));
          AppMethodBeat.o(81446);
        }
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ScanCameraLightDetector", "not dark");
      al.d(new ScanCameraLightDetector.1.2(this));
      AppMethodBeat.o(81446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.1
 * JD-Core Version:    0.6.2
 */