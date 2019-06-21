package com.tencent.mm.plugin.websearch.widget.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

public final class a$2
  implements n.c
{
  public a$2(a parama, List paramList, d paramd)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(91474);
    for (int i = 0; i < this.mhY.size(); i++)
    {
      y localy = (y)this.mhY.get(i);
      paraml.a(i, localy.title, localy.desc);
      if (localy.gBF)
        this.gCw.zQA = i;
    }
    AppMethodBeat.o(91474);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.a.2
 * JD-Core Version:    0.6.2
 */