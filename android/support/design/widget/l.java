package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class l
{
  private static l rr;
  private final Handler mHandler = new Handler(Looper.getMainLooper(), new l.1(this));
  final Object mLock = new Object();
  l.b rs;
  l.b rt;

  static l co()
  {
    if (rr == null)
      rr = new l();
    return rr;
  }

  public final void a(l.a parama)
  {
    synchronized (this.mLock)
    {
      if ((d(parama)) && (!this.rs.rw))
      {
        this.rs.rw = true;
        this.mHandler.removeCallbacksAndMessages(this.rs);
      }
      return;
    }
  }

  final boolean a(l.b paramb)
  {
    if ((l.a)paramb.rv.get() != null)
      this.mHandler.removeCallbacksAndMessages(paramb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void b(l.a parama)
  {
    synchronized (this.mLock)
    {
      if ((d(parama)) && (this.rs.rw))
      {
        this.rs.rw = false;
        b(this.rs);
      }
      return;
    }
  }

  final void b(l.b paramb)
  {
    if (paramb.duration == -2)
      return;
    int i = 2750;
    if (paramb.duration > 0)
      i = paramb.duration;
    while (true)
    {
      this.mHandler.removeCallbacksAndMessages(paramb);
      this.mHandler.sendMessageDelayed(Message.obtain(this.mHandler, 0, paramb), i);
      break;
      if (paramb.duration == -1)
        i = 1500;
    }
  }

  public final boolean c(l.a parama)
  {
    synchronized (this.mLock)
    {
      if ((d(parama)) || (e(parama)))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  final boolean d(l.a parama)
  {
    if ((this.rs != null) && (this.rs.f(parama)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean e(l.a parama)
  {
    if ((this.rt != null) && (this.rt.f(parama)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.l
 * JD-Core Version:    0.6.2
 */