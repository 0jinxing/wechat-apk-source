package com.tencent.smtt.utils;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

class h
  implements Runnable
{
  h(e parame)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65199);
    Toast.makeText(this.a.b, "下载失败，请检查网络", 0).show();
    AppMethodBeat.o(65199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.h
 * JD-Core Version:    0.6.2
 */