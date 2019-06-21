package com.tencent.mm.al;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class f$2 extends ak
{
  f$2(f paramf, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(78075);
    if (paramMessage.what != 1)
      AppMethodBeat.o(78075);
    while (true)
    {
      return;
      if (f.a(this.fzD) == 0L)
      {
        AppMethodBeat.o(78075);
      }
      else
      {
        int i = paramMessage.arg1;
        ab.i("MicroMsg.SubCoreCdnTransport", "try get dns again scene[%d] lastGetDnsErrorTime[%d]  diff[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(f.a(this.fzD)), Long.valueOf(bo.gb(f.a(this.fzD))) });
        g.Rg().a(new d(i), 0);
        AppMethodBeat.o(78075);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.f.2
 * JD-Core Version:    0.6.2
 */