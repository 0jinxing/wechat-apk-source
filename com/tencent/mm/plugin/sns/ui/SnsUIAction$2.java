package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.ui.tools.a.a;

final class SnsUIAction$2
  implements a.a
{
  SnsUIAction$2(SnsUIAction paramSnsUIAction)
  {
  }

  public final String ZB(String paramString)
  {
    AppMethodBeat.i(39638);
    paramString = g.x((this.rCe.filePath + System.currentTimeMillis()).getBytes());
    paramString = af.getAccSnsTmpPath() + paramString;
    AppMethodBeat.o(39638);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.2
 * JD-Core Version:    0.6.2
 */