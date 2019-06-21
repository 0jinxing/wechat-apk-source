package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.ui.tools.a.a;

final class SettingSnsBackgroundUI$1
  implements a.a
{
  SettingSnsBackgroundUI$1(SettingSnsBackgroundUI paramSettingSnsBackgroundUI)
  {
  }

  public final String ZB(String paramString)
  {
    AppMethodBeat.i(38553);
    paramString = g.x((this.rmS.filePath + System.currentTimeMillis()).getBytes());
    paramString = af.getAccSnsTmpPath() + paramString;
    AppMethodBeat.o(38553);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.1
 * JD-Core Version:    0.6.2
 */