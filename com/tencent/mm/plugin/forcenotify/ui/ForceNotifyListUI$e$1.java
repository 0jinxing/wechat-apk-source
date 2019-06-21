package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class ForceNotifyListUI$e$1
  implements Runnable
{
  ForceNotifyListUI$e$1(ForceNotifyListUI.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51077);
    Object localObject;
    if (ForceNotifyListUI.a(this.mtu.mtn).isEmpty())
    {
      localObject = ForceNotifyListUI.c(this.mtu.mtn);
      if (localObject == null)
        j.dWJ();
      ((RecyclerView)localObject).setVisibility(8);
      localObject = ForceNotifyListUI.d(this.mtu.mtn);
      if (localObject == null)
        j.dWJ();
      ((View)localObject).setVisibility(0);
      AppMethodBeat.o(51077);
    }
    while (true)
    {
      return;
      localObject = ForceNotifyListUI.c(this.mtu.mtn);
      if (localObject == null)
        j.dWJ();
      ((RecyclerView)localObject).setVisibility(0);
      localObject = ForceNotifyListUI.b(this.mtu.mtn);
      if (localObject == null)
        j.dWJ();
      ((ForceNotifyListUI.a)localObject).notifyDataSetChanged();
      AppMethodBeat.o(51077);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.e.1
 * JD-Core Version:    0.6.2
 */