package com.tencent.mm.ui.chatting.i;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.e.b.b;
import java.util.ArrayList;

final class b$2$1$2
  implements Runnable
{
  b$2$1$2(b.2.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32528);
    if (this.yZd.yZc.yZb.yYY != null)
    {
      this.yZd.yZc.yZb.yYZ.aop.notifyChanged();
      this.yZd.yZc.yZb.yYY.ch(this.yZd.yZc.yNK, this.yZd.yZc.yZb.iPr.isEmpty());
    }
    AppMethodBeat.o(32528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b.2.1.2
 * JD-Core Version:    0.6.2
 */