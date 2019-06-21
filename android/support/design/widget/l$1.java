package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class l$1
  implements Handler.Callback
{
  l$1(l paraml)
  {
  }

  public final boolean handleMessage(Message arg1)
  {
    boolean bool;
    switch (???.what)
    {
    default:
      bool = false;
    case 0:
    }
    while (true)
    {
      return bool;
      l locall = this.ru;
      l.b localb = (l.b)???.obj;
      synchronized (locall.mLock)
      {
        if ((locall.rs == localb) || (locall.rt == localb))
          locall.a(localb);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.l.1
 * JD-Core Version:    0.6.2
 */