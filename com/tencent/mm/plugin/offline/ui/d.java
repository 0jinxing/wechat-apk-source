package com.tencent.mm.plugin.offline.ui;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.su;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ak;

public final class d extends c<su>
{
  private ak mHandler;

  public d()
  {
    AppMethodBeat.i(43501);
    this.mHandler = new ak(Looper.getMainLooper());
    this.xxI = su.class.getName().hashCode();
    AppMethodBeat.o(43501);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.d
 * JD-Core Version:    0.6.2
 */