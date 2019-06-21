package com.tencent.mm.plugin.location.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;

final class SimpleImageView$1 extends ak
{
  SimpleImageView$1(SimpleImageView paramSimpleImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(113527);
    byte[] arrayOfByte = (byte[])paramMessage.obj;
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      ab.e("MicroMsg.SimpleImageView", "handleMsg fail, data is null");
      AppMethodBeat.o(113527);
      return;
    }
    paramMessage = d.bQ(arrayOfByte);
    String str = SimpleImageView.a(this.nNl) + g.x(SimpleImageView.b(this.nNl).getBytes());
    ab.d("MicroMsg.SimpleImageView", "filePath  %s", new Object[] { str });
    e.b(str, arrayOfByte, arrayOfByte.length);
    if ((paramMessage != null) && (SimpleImageView.c(this.nNl) > 0) && (SimpleImageView.d(this.nNl) > 0))
      paramMessage = d.a(paramMessage, SimpleImageView.d(this.nNl), SimpleImageView.c(this.nNl), true, false);
    while (true)
    {
      this.nNl.setImageBitmap(paramMessage);
      AppMethodBeat.o(113527);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.SimpleImageView.1
 * JD-Core Version:    0.6.2
 */