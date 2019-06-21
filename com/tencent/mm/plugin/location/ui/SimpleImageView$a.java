package com.tencent.mm.plugin.location.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class SimpleImageView$a
  implements Runnable
{
  private ak handler;
  private String url;

  public SimpleImageView$a(String paramString, ak paramak)
  {
    this.url = paramString;
    this.handler = paramak;
  }

  public final void run()
  {
    AppMethodBeat.i(113528);
    byte[] arrayOfByte = bo.ano(this.url);
    Message localMessage = Message.obtain();
    localMessage.obj = arrayOfByte;
    this.handler.sendMessage(localMessage);
    AppMethodBeat.o(113528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.SimpleImageView.a
 * JD-Core Version:    0.6.2
 */