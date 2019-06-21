package com.tencent.liteav.screencapture;

import android.os.Bundle;
import com.tencent.liteav.basic.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class b$6
  implements Runnable
{
  b$6(b paramb)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66770);
    if (b.h(this.a) != null)
    {
      a locala = (a)b.h(this.a).get();
      if (locala != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("EVT_MSG", "录屏启动成功");
        locala.onNotifyEvent(1004, localBundle);
      }
    }
    AppMethodBeat.o(66770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.b.6
 * JD-Core Version:    0.6.2
 */