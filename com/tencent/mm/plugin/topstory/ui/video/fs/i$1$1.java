package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.e.a;

final class i$1$1
  implements Runnable
{
  i$1$1(i.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2007);
    e.a locala = new e.a(ah.getContext());
    locala.asL(this.sGM.sGL.sDo.bKU().getString(2131304112)).re(true);
    locala.Qg(2131296955).b(new i.1.1.2(this)).b(new i.1.1.1(this)).show();
    AppMethodBeat.o(2007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.i.1.1
 * JD-Core Version:    0.6.2
 */