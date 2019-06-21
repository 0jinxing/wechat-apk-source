package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.forcenotify.b.c;
import java.util.ArrayList;
import java.util.Collection;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class ForceNotifyListUI$e
  implements Runnable
{
  ForceNotifyListUI$e(ForceNotifyListUI paramForceNotifyListUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51078);
    ForceNotifyListUI.a(this.mtn).clear();
    ArrayList localArrayList = ForceNotifyListUI.a(this.mtn);
    c localc = c.mtf;
    localArrayList.addAll((Collection)c.bxW());
    this.mtn.runOnUiThread((Runnable)new ForceNotifyListUI.e.1(this));
    AppMethodBeat.o(51078);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.e
 * JD-Core Version:    0.6.2
 */