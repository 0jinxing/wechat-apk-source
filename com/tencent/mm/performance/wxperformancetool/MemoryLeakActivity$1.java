package com.tencent.mm.performance.wxperformancetool;

import android.app.AlertDialog;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class MemoryLeakActivity$1 extends ak
{
  MemoryLeakActivity$1(MemoryLeakActivity paramMemoryLeakActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76882);
    if (((WeakReference)a.ggu.get(MemoryLeakActivity.a(this.ggs))).get() == null)
    {
      this.ggs.finish();
      AppMethodBeat.o(76882);
    }
    while (true)
    {
      return;
      MemoryLeakActivity.b(this.ggs).show();
      AppMethodBeat.o(76882);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.wxperformancetool.MemoryLeakActivity.1
 * JD-Core Version:    0.6.2
 */