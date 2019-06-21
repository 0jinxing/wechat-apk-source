package com.tencent.mm.plugin.fav.ui.gallery;

import android.support.v7.widget.GridLayoutManager.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class h$1 extends GridLayoutManager.b
{
  h$1(h paramh)
  {
  }

  public final int bU(int paramInt)
  {
    AppMethodBeat.i(74590);
    if (((f.c)this.moB.iPr.get(paramInt)).type == 2147483647)
    {
      paramInt = 4;
      AppMethodBeat.o(74590);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(74590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.h.1
 * JD-Core Version:    0.6.2
 */