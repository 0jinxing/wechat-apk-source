package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a
  implements Handler.Callback, Choreographer.FrameCallback
{
  private static final a bsX;
  public volatile long bsW;
  private final HandlerThread bsY;
  private Choreographer bsZ;
  private int bta;
  final Handler handler;

  static
  {
    AppMethodBeat.i(96034);
    bsX = new a();
    AppMethodBeat.o(96034);
  }

  private d$a()
  {
    AppMethodBeat.i(96031);
    this.bsY = new HandlerThread("ChoreographerOwner:Handler");
    this.bsY.start();
    this.handler = new Handler(this.bsY.getLooper(), this);
    this.handler.sendEmptyMessage(0);
    AppMethodBeat.o(96031);
  }

  public static a tZ()
  {
    return bsX;
  }

  public final void doFrame(long paramLong)
  {
    AppMethodBeat.i(96032);
    this.bsW = paramLong;
    this.bsZ.postFrameCallbackDelayed(this, 500L);
    AppMethodBeat.o(96032);
  }

  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(96033);
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(96033);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      this.bsZ = Choreographer.getInstance();
      AppMethodBeat.o(96033);
      continue;
      this.bta += 1;
      if (this.bta == 1)
        this.bsZ.postFrameCallback(this);
      AppMethodBeat.o(96033);
      continue;
      this.bta -= 1;
      if (this.bta == 0)
      {
        this.bsZ.removeFrameCallback(this);
        this.bsW = 0L;
      }
      AppMethodBeat.o(96033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.d.a
 * JD-Core Version:    0.6.2
 */