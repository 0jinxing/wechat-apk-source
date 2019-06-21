package com.tencent.mm.plugin.nearlife.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class LogoImageView$a
  implements Runnable
{
  private ak handler;
  private String url;

  LogoImageView$a(String paramString, ak paramak)
  {
    this.url = paramString;
    this.handler = paramak;
  }

  public final void run()
  {
    AppMethodBeat.i(22969);
    byte[] arrayOfByte = bo.ano(this.url);
    Message localMessage = Message.obtain();
    localMessage.obj = arrayOfByte;
    this.handler.sendMessage(localMessage);
    AppMethodBeat.o(22969);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.LogoImageView.a
 * JD-Core Version:    0.6.2
 */