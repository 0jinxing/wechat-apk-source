package com.tencent.mm.sdk.platformtools;

import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public class am extends Handler
  implements aq.a
{
  private String toStringResult;
  private Looper xzn;
  private Handler.Callback xzo;
  public a xzp;

  public am(Handler.Callback paramCallback, a parama)
  {
    super(paramCallback);
    AppMethodBeat.i(52144);
    this.toStringResult = null;
    this.xzn = getLooper();
    this.xzo = paramCallback;
    this.xzp = parama;
    AppMethodBeat.o(52144);
  }

  public am(Looper paramLooper, Handler.Callback paramCallback, a parama)
  {
    super(paramLooper, paramCallback);
    AppMethodBeat.i(52145);
    this.toStringResult = null;
    this.xzn = getLooper();
    this.xzo = paramCallback;
    this.xzp = parama;
    AppMethodBeat.o(52145);
  }

  public am(Looper paramLooper, a parama)
  {
    super(paramLooper);
    AppMethodBeat.i(52143);
    this.toStringResult = null;
    this.xzn = getLooper();
    this.xzp = parama;
    AppMethodBeat.o(52143);
  }

  public am(a parama)
  {
    AppMethodBeat.i(52142);
    this.toStringResult = null;
    this.xzn = getLooper();
    this.xzp = parama;
    AppMethodBeat.o(52142);
  }

  public final void a(Runnable paramRunnable, aq paramaq)
  {
    AppMethodBeat.i(52150);
    if (this.xzp != null)
      this.xzp.onTaskRunEnd(paramRunnable, paramaq);
    AppMethodBeat.o(52150);
  }

  public final void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, long paramLong3, float paramFloat)
  {
    AppMethodBeat.i(52151);
    if (this.xzp != null)
      this.xzp.onLog(null, paramRunnable, paramThread, paramLong1, paramLong2, paramLong3, paramFloat);
    AppMethodBeat.o(52151);
  }

  public void dispatchMessage(Message paramMessage)
  {
    AppMethodBeat.i(52147);
    if ((paramMessage.getCallback() != null) || (this.xzo != null))
    {
      super.dispatchMessage(paramMessage);
      AppMethodBeat.o(52147);
    }
    while (true)
    {
      return;
      long l1 = System.currentTimeMillis();
      Bundle localBundle = paramMessage.getData();
      long l2 = localBundle.getLong("addTime");
      long l3 = localBundle.getLong("delay");
      localBundle = localBundle.getBundle("tmp");
      long l4 = Debug.threadCpuTimeNanos();
      paramMessage.setData(localBundle);
      handleMessage(paramMessage);
      if (this.xzp != null)
        this.xzp.onLog(paramMessage, null, this.xzn.getThread(), System.currentTimeMillis() - l1, Debug.threadCpuTimeNanos() - l4, l1 - l2 - l3, -1.0F);
      AppMethodBeat.o(52147);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(52148);
    if (this.xzp != null)
      this.xzp.handleMessage(paramMessage);
    AppMethodBeat.o(52148);
  }

  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(52146);
    boolean bool2;
    Runnable localRunnable;
    long l;
    Object localObject;
    if (paramMessage != null)
    {
      bool2 = true;
      Assert.assertTrue("msg is null", bool2);
      localRunnable = paramMessage.getCallback();
      l = paramLong - SystemClock.uptimeMillis();
      if (localRunnable != null)
        break label107;
      localObject = new Bundle();
      ((Bundle)localObject).putBundle("tmp", paramMessage.getData());
      ((Bundle)localObject).putLong("delay", l);
      ((Bundle)localObject).putLong("addTime", System.currentTimeMillis());
      paramMessage.setData((Bundle)localObject);
      bool2 = super.sendMessageAtTime(paramMessage, paramLong);
      AppMethodBeat.o(52146);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label107: if (paramMessage.getTarget() == null);
      aq localaq;
      for (localObject = this; ; localObject = paramMessage.getTarget())
      {
        localaq = new aq(this.xzn.getThread(), (Handler)localObject, localRunnable, paramMessage.obj, this);
        if (l > 0L)
          localaq.xzH = l;
        localObject = Message.obtain(paramMessage.getTarget(), localaq);
        ((Message)localObject).what = paramMessage.what;
        ((Message)localObject).arg1 = paramMessage.arg1;
        ((Message)localObject).arg2 = paramMessage.arg2;
        ((Message)localObject).obj = paramMessage.obj;
        ((Message)localObject).replyTo = paramMessage.replyTo;
        ((Message)localObject).setData(paramMessage.getData());
        paramMessage.recycle();
        if ((getLooper() == null) || (getLooper().getThread().isAlive()))
          break label306;
        ab.w("MicroMsg.MMInnerHandler", "sendMessageAtTime but thread[%d, %s] is dead so return false!", new Object[] { Long.valueOf(getLooper().getThread().getId()), getLooper().getThread().getName() });
        AppMethodBeat.o(52146);
        bool2 = bool1;
        break;
      }
      label306: if (this.xzp != null)
        this.xzp.onTaskAdded(localRunnable, localaq);
      bool2 = super.sendMessageAtTime((Message)localObject, paramLong);
      if ((!bool2) && (this.xzp != null))
        this.xzp.onTaskRunEnd(localRunnable, localaq);
      AppMethodBeat.o(52146);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(52149);
    if (this.toStringResult == null)
      this.toStringResult = ("MMInnerHandler{listener = " + this.xzp + "}");
    String str = this.toStringResult;
    AppMethodBeat.o(52149);
    return str;
  }

  public static abstract interface a
  {
    public abstract void handleMessage(Message paramMessage);

    public abstract void onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, long paramLong3, float paramFloat);

    public abstract void onTaskAdded(Runnable paramRunnable, aq paramaq);

    public abstract void onTaskRunEnd(Runnable paramRunnable, aq paramaq);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.am
 * JD-Core Version:    0.6.2
 */