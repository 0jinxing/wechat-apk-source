package com.tencent.mm.pluginsdk.i;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a extends Handler
{
  boolean faH = false;
  int hzv = 0;

  public b$a(Looper paramLooper)
  {
    super(paramLooper);
  }

  @TargetApi(8)
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27464);
    Camera localCamera = (Camera)paramMessage.obj;
    Camera.Parameters localParameters = localCamera.getParameters();
    int i = localParameters.getZoom() + this.hzv;
    if (this.faH)
      if (i >= localParameters.getMaxZoom() / 2)
        i = localParameters.getMaxZoom() / 2;
    while (true)
    {
      localParameters.setZoom(i);
      localCamera.setParameters(localParameters);
      AppMethodBeat.o(27464);
      return;
      sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
      continue;
      if (i <= 0)
        i = 0;
      else
        sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.b.a
 * JD-Core Version:    0.6.2
 */