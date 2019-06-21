package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class ForceNotifyListUI$d$1
  implements Runnable
{
  ForceNotifyListUI$d$1(ForceNotifyListUI.d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51075);
    Object localObject = ForceNotifyListUI.b(this.mtt.mtn);
    if (localObject == null)
      j.dWJ();
    ((ForceNotifyListUI.a)localObject).notifyDataSetChanged();
    localObject = ForceNotifyListUI.g(this.mtt.mtn);
    if (localObject == null)
      j.dWJ();
    ((View)localObject).setVisibility(8);
    if (ForceNotifyListUI.a(this.mtt.mtn).isEmpty())
    {
      localObject = ForceNotifyListUI.c(this.mtt.mtn);
      if (localObject == null)
        j.dWJ();
      ((RecyclerView)localObject).setVisibility(8);
      localObject = ForceNotifyListUI.d(this.mtt.mtn);
      if (localObject == null)
        j.dWJ();
      ((View)localObject).setVisibility(0);
      AppMethodBeat.o(51075);
    }
    while (true)
    {
      return;
      localObject = ForceNotifyListUI.c(this.mtt.mtn);
      if (localObject == null)
        j.dWJ();
      ((RecyclerView)localObject).setVisibility(0);
      AppMethodBeat.o(51075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.d.1
 * JD-Core Version:    0.6.2
 */