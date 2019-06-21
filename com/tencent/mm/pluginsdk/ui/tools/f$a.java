package com.tencent.mm.pluginsdk.ui.tools;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

abstract class f$a<T>
{
  private ak handler;
  final int vuH = Math.max(1, 16);
  LinkedList<T> vuI = new LinkedList();

  public f$a(f paramf, Looper paramLooper)
  {
    this.handler = new f.a.1(this, paramLooper, paramf);
  }

  public final void cy(T paramT)
  {
    this.handler.sendMessage(this.handler.obtainMessage(1, paramT));
  }

  protected abstract T dlr();

  public final T dls()
  {
    if (this.vuI.isEmpty());
    for (Object localObject = dlr(); ; localObject = this.vuI.removeFirst())
      return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.a
 * JD-Core Version:    0.6.2
 */