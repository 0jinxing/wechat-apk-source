package com.tencent.mm.plugin.walletlock.c;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public enum i
{
  private boolean tXd;
  private boolean tXe;
  private Object tXf;
  public HashSet<WeakReference<Activity>> tXg;

  static
  {
    AppMethodBeat.i(51743);
    tXc = new i("INSTANCE");
    tXh = new i[] { tXc };
    AppMethodBeat.o(51743);
  }

  private i()
  {
    AppMethodBeat.i(51740);
    this.tXd = false;
    this.tXe = false;
    this.tXf = new Object();
    this.tXg = new HashSet();
    AppMethodBeat.o(51740);
  }

  public final void c(WeakReference<Activity> paramWeakReference)
  {
    AppMethodBeat.i(51741);
    if (this.tXg != null)
    {
      if (paramWeakReference.get() != null)
        ab.v("MicroMsg.WalletLockStatusManager", "alvinluo addProtectActivity %s", new Object[] { ((Activity)paramWeakReference.get()).getClass().getName() });
      this.tXg.add(paramWeakReference);
    }
    AppMethodBeat.o(51741);
  }

  public final boolean cUd()
  {
    synchronized (this.tXf)
    {
      boolean bool = this.tXd;
      return bool;
    }
  }

  public final boolean cUe()
  {
    synchronized (this.tXf)
    {
      boolean bool = this.tXe;
      return bool;
    }
  }

  public final void cUf()
  {
    synchronized (this.tXf)
    {
      this.tXe = true;
      return;
    }
  }

  public final void cUg()
  {
    AppMethodBeat.i(51742);
    Iterator localIterator = this.tXg.iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)((WeakReference)localIterator.next()).get();
      if ((localActivity != null) && (!localActivity.isFinishing()))
      {
        ab.v("MicroMsg.WalletLockStatusManager", "alvinluo finish %s", new Object[] { localActivity.getClass().getName() });
        localActivity.finish();
      }
      localIterator.remove();
    }
    AppMethodBeat.o(51742);
  }

  public final void nB(boolean paramBoolean)
  {
    synchronized (this.tXf)
    {
      this.tXd = paramBoolean;
      return;
    }
  }

  public final void nC(boolean paramBoolean)
  {
    synchronized (this.tXf)
    {
      this.tXe = paramBoolean;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.i
 * JD-Core Version:    0.6.2
 */