package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;

final class k extends Thread
{
  k(Context paramContext, Handler paramHandler)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63988);
    int i = an.a().a(true, this.a);
    TbsDownloader.setAppContext(this.a);
    TbsLog.i("QbSdk", "QbSdk preinit ver is ".concat(String.valueOf(i)));
    if (i == 0)
      an.a().b(this.a, true);
    TbsLog.i("QbSdk", "preInit -- prepare initAndLoadSo");
    o.a(true).a(this.a, false, false, null);
    bv localbv = bv.a();
    localbv.a(this.a, null);
    boolean bool = localbv.b();
    this.b.sendEmptyMessage(3);
    if (!bool)
    {
      this.b.sendEmptyMessage(2);
      AppMethodBeat.o(63988);
    }
    while (true)
    {
      return;
      this.b.sendEmptyMessage(1);
      AppMethodBeat.o(63988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.k
 * JD-Core Version:    0.6.2
 */