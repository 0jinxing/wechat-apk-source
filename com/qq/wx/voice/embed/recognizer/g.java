package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g
{
  Handler b;
  c bCB;

  public g()
  {
    AppMethodBeat.i(123225);
    this.b = new h(this);
    AppMethodBeat.o(123225);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(123226);
    Message localMessage = this.b.obtainMessage(100);
    Bundle localBundle = new Bundle();
    localBundle.putInt("errorCode", paramInt);
    localMessage.setData(localBundle);
    this.b.sendMessage(localMessage);
    AppMethodBeat.o(123226);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.g
 * JD-Core Version:    0.6.2
 */