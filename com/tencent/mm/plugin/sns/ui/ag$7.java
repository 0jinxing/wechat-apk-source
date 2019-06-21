package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.ui.tools.a.a;

final class ag$7
  implements a.a
{
  ag$7(ag paramag)
  {
  }

  public final String ZB(String paramString)
  {
    AppMethodBeat.i(38483);
    paramString = g.x((paramString + System.currentTimeMillis()).getBytes());
    paramString = af.getAccSnsTmpPath() + paramString;
    AppMethodBeat.o(38483);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.7
 * JD-Core Version:    0.6.2
 */