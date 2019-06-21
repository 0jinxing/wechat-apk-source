package com.tencent.voip.mars.xlog;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

class Log$1$1
  implements Runnable
{
  Log$1$1(Log.1 param1, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(92790);
    Toast.makeText(Log.toastSupportContext, this.val$log, 1).show();
    AppMethodBeat.o(92790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.xlog.Log.1.1
 * JD-Core Version:    0.6.2
 */