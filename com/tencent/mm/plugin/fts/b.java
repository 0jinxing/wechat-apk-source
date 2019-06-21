package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public final class b extends a
  implements Runnable
{
  private int errorCode;
  private i mAJ;
  private WeakReference<l> mAK;

  public b(int paramInt, i parami)
  {
    AppMethodBeat.i(136518);
    this.errorCode = paramInt;
    this.mAJ = parami;
    this.mAK = new WeakReference(parami.mEw);
    this.mAJ.mEw = null;
    AppMethodBeat.o(136518);
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136519);
    j localj;
    if ((this.errorCode == -2) || (this.errorCode == -3))
    {
      localj = new j(this.mAJ);
      localj.mEx = this;
      localj.bFZ = this.errorCode;
      localj.mEy = new LinkedList();
      localj.mDz = g.aO(this.mAJ.query, false);
      if (this.mAJ.handler != null)
        break label113;
      l locall = (l)this.mAK.get();
      if (locall != null)
        locall.b(localj);
    }
    while (true)
    {
      AppMethodBeat.o(136519);
      return true;
      label113: this.mAJ.handler.post(new b.1(this, localj));
    }
  }

  public final int getId()
  {
    return -1;
  }

  public final int getPriority()
  {
    return 0;
  }

  public final boolean isCancelled()
  {
    return false;
  }

  public final void run()
  {
    AppMethodBeat.i(136520);
    try
    {
      execute();
      AppMethodBeat.o(136520);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(136520);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b
 * JD-Core Version:    0.6.2
 */