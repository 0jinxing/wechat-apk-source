package com.tencent.smtt.utils;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

class g
  implements Runnable
{
  g(e parame, int paramInt)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65198);
    this.b.e.setText("已下载" + this.a + "%");
    AppMethodBeat.o(65198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.g
 * JD-Core Version:    0.6.2
 */