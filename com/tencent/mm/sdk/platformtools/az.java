package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class az
{
  boolean cHY;
  Object lock;
  String name;
  int priority;
  public LinkedBlockingQueue<az.a> xAV;
  private int xAW;
  Vector<az.b> xAX;
  ak xAY;

  public az(int paramInt, String paramString)
  {
    this(paramInt, paramString, 1);
  }

  public az(int paramInt1, String paramString, int paramInt2)
  {
    this(paramInt1, paramString, paramInt2, Looper.myLooper());
    AppMethodBeat.i(52235);
    AppMethodBeat.o(52235);
  }

  public az(int paramInt1, String paramString, int paramInt2, Looper paramLooper)
  {
    AppMethodBeat.i(52236);
    this.xAV = new LinkedBlockingQueue();
    this.cHY = false;
    this.xAW = 1;
    this.priority = 1;
    this.name = "";
    this.lock = new byte[0];
    this.xAX = new Vector();
    this.xAW = paramInt2;
    this.name = paramString;
    this.priority = paramInt1;
    paramString = paramLooper;
    if (paramLooper == null)
    {
      paramString = paramLooper;
      if (Looper.getMainLooper() != null)
      {
        paramString = Looper.getMainLooper();
        ab.i("QueueWorkerThread.QueueWorkerThread", "looper is null use MainLooper!");
      }
    }
    this.xAY = new az.1(this, paramString);
    AppMethodBeat.o(52236);
  }

  @Deprecated
  public final boolean dpg()
  {
    AppMethodBeat.i(52238);
    boolean bool;
    if ((this.xAX == null) || (this.xAX.size() == 0))
    {
      bool = true;
      AppMethodBeat.o(52238);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52238);
    }
  }

  public final int e(az.a parama)
  {
    int i = 0;
    AppMethodBeat.i(52237);
    if (parama == null)
    {
      ab.e("QueueWorkerThread.QueueWorkerThread", "add empty thread object");
      i = -1;
      AppMethodBeat.o(52237);
    }
    while (true)
    {
      return i;
      try
      {
        if (this.xAV.offer(parama, 1L, TimeUnit.MILLISECONDS))
          break label108;
        ab.e("QueueWorkerThread.QueueWorkerThread", "add To Queue failed");
        i = -2;
        AppMethodBeat.o(52237);
      }
      catch (Exception parama)
      {
        ab.e("QueueWorkerThread.QueueWorkerThread", "add To Queue failed :" + parama.getMessage());
        ab.printErrStackTrace("QueueWorkerThread.QueueWorkerThread", parama, "", new Object[0]);
        i = -3;
        AppMethodBeat.o(52237);
      }
      continue;
      label108: if ((this.xAX.size() == 0) || ((this.xAV.size() > 0) && (this.xAW > this.xAX.size())))
        new az.b(this, (byte)0).start();
      AppMethodBeat.o(52237);
    }
  }

  public final void pk(boolean paramBoolean)
  {
    AppMethodBeat.i(52239);
    synchronized (this.lock)
    {
      this.cHY = paramBoolean;
      if (!paramBoolean);
      synchronized (this.lock)
      {
        this.lock.notifyAll();
        AppMethodBeat.o(52239);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.az
 * JD-Core Version:    0.6.2
 */