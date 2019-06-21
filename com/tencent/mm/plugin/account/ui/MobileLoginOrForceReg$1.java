package com.tencent.mm.plugin.account.ui;

import android.graphics.Bitmap;
import android.os.Message;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MobileLoginOrForceReg$1 extends ak
{
  MobileLoginOrForceReg$1(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(125203);
    if (paramMessage.obj != null)
    {
      paramMessage = (Bitmap)paramMessage.obj;
      MobileLoginOrForceReg.a(this.gEv).setImageBitmap(paramMessage);
    }
    AppMethodBeat.o(125203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.1
 * JD-Core Version:    0.6.2
 */