package com.b.a.a;

import java.lang.ref.WeakReference;

abstract class r$a
  implements Runnable
{
  private final WeakReference<r> bFR;

  private r$a(r paramr)
  {
    this.bFR = new WeakReference(paramr);
  }

  final r wn()
  {
    r localr = (r)this.bFR.get();
    if (localr == null)
      throw new Exception("OnlineModule.AbstractOnlineModuleRunnable: online module not available");
    return localr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.b.a.a.r.a
 * JD-Core Version:    0.6.2
 */