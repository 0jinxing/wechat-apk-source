package com.tencent.mm.plugin.voip.video;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class OpenGlRender$a extends ak
{
  public OpenGlRender$a(OpenGlRender paramOpenGlRender, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(5070);
    this.taY.requestRender();
    AppMethodBeat.o(5070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.OpenGlRender.a
 * JD-Core Version:    0.6.2
 */