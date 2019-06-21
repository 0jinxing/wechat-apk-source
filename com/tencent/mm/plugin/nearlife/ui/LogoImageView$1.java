package com.tencent.mm.plugin.nearlife.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

final class LogoImageView$1 extends ak
{
  LogoImageView$1(LogoImageView paramLogoImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22968);
    byte[] arrayOfByte = (byte[])paramMessage.obj;
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      ab.e("MicroMsg.LogoImageView", "handleMsg fail, data is null");
      AppMethodBeat.o(22968);
      return;
    }
    paramMessage = d.bQ(arrayOfByte);
    String str = LogoImageView.a(this.oSr) + g.x(LogoImageView.b(this.oSr).getBytes());
    ab.d("MicroMsg.LogoImageView", "filePath  %s", new Object[] { str });
    e.b(str, arrayOfByte, arrayOfByte.length);
    if ((paramMessage != null) && (LogoImageView.c(this.oSr) > 0) && (LogoImageView.d(this.oSr) > 0))
      paramMessage = d.a(paramMessage, LogoImageView.d(this.oSr), LogoImageView.c(this.oSr), true, false);
    while (true)
    {
      this.oSr.setImageBitmap(paramMessage);
      AppMethodBeat.o(22968);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.LogoImageView.1
 * JD-Core Version:    0.6.2
 */