package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder;", "Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;", "(Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "plugin-force-notify_release"})
public final class ForceNotifyListUI$a extends RecyclerView.a<ForceNotifyListUI.b>
{
  public final int getItemCount()
  {
    AppMethodBeat.i(51065);
    int i = ForceNotifyListUI.a(this.mtn).size();
    AppMethodBeat.o(51065);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.a
 * JD-Core Version:    0.6.2
 */