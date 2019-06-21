package android.support.v4.view;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

final class c$b$a extends Handler
{
  c$b$a(c.b paramb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      throw new RuntimeException("Unknown message ".concat(String.valueOf(paramMessage)));
    case 1:
      this.Mg.LQ.onShowPress(this.Mg.LY);
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      paramMessage = this.Mg;
      paramMessage.mHandler.removeMessages(3);
      paramMessage.LU = false;
      paramMessage.LV = true;
      paramMessage.LQ.onLongPress(paramMessage.LY);
      continue;
      if (this.Mg.LR != null)
        if (!this.Mg.LS)
          this.Mg.LR.onSingleTapConfirmed(this.Mg.LY);
        else
          this.Mg.LU = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.view.c.b.a
 * JD-Core Version:    0.6.2
 */