package com.tencent.mm.ui.chatting.i;

import android.support.v7.widget.GridLayoutManager.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.b.c;
import java.util.ArrayList;

final class e$1 extends GridLayoutManager.b
{
  e$1(e parame)
  {
  }

  public final int bU(int paramInt)
  {
    AppMethodBeat.i(32552);
    if (((b.c)e.a(this.yZo).get(paramInt)).type == 2147483647)
    {
      paramInt = 4;
      AppMethodBeat.o(32552);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(32552);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.1
 * JD-Core Version:    0.6.2
 */