package com.tencent.mm.media.widget.a;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/OpenCameraThread;", "", "()V", "TAG", "", "isTimeouted", "", "lock", "Ljava/lang/Object;", "res", "Lcom/tencent/mm/compatible/deviceinfo/CameraUtil$IImpl$OpenCameraRes;", "openCamera", "context", "Landroid/content/Context;", "nowCameraId", "", "looper", "Landroid/os/Looper;", "plugin-mediaeditor_release"})
public final class f
{
  final String TAG;
  boolean fbr;
  d.a.a fbs;
  final Object lock;

  public f()
  {
    AppMethodBeat.i(13227);
    this.TAG = "MicroMsg.SightCamera.OpenCameraThread";
    this.lock = new Object();
    AppMethodBeat.o(13227);
  }

  public final d.a.a a(Context paramContext, int paramInt, Looper paramLooper)
  {
    AppMethodBeat.i(13226);
    if (paramContext == null)
      AppMethodBeat.o(13226);
    for (paramContext = null; ; paramContext = null)
    {
      long l1;
      while (true)
      {
        return paramContext;
        l1 = bo.anU();
        ??? = Thread.currentThread();
        j.o(???, "Thread.currentThread()");
        long l2 = ((Thread)???).getId();
        synchronized (this.lock)
        {
          this.fbr = false;
          this.fbs = null;
          f.a locala = new com/tencent/mm/media/widget/a/f$a;
          locala.<init>(this, l2, l1, paramContext, paramInt, paramLooper);
          d.post((Runnable)locala, "SightCamera_openCamera");
          try
          {
            this.lock.wait(30000L);
            if (this.fbs != null)
            {
              paramContext = this.fbs;
              if (paramContext == null)
                j.dWJ();
              if (paramContext.erH != null)
              {
                paramContext = this.TAG;
                long l3 = bo.anU();
                paramLooper = this.fbs;
                if (paramLooper == null)
                  j.dWJ();
                ab.i(paramContext, "Open Camera Succ thread:%d Time:%d camera:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l3 - l1), paramLooper.erH });
                paramContext = this.fbs;
                AppMethodBeat.o(13226);
              }
            }
          }
          catch (InterruptedException paramContext)
          {
            while (true)
              ab.e(this.TAG, "Lock wait failed e:%s", new Object[] { paramContext.getMessage() });
          }
        }
      }
      this.fbr = true;
      ab.e(this.TAG, "Open Camera Timeout:%d", new Object[] { Long.valueOf(bo.anU() - l1) });
      AppMethodBeat.o(13226);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.f
 * JD-Core Version:    0.6.2
 */