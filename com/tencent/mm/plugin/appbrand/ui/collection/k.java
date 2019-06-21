package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder;", "dataList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;", "(Ljava/util/ArrayList;Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;)V", "getDataList", "()Ljava/util/ArrayList;", "mListener", "cloneList", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceList", "list", "", "plugin-appbrand-integration_release"})
final class k extends RecyclerView.a<m>
{
  final ArrayList<LocalUsageInfo> iLD;
  private final m.a iLO;

  public k(ArrayList<LocalUsageInfo> paramArrayList, m.a parama)
  {
    AppMethodBeat.i(135113);
    this.iLD = paramArrayList;
    this.iLO = parama;
    AppMethodBeat.o(135113);
  }

  private void a(m paramm, int paramInt)
  {
    AppMethodBeat.i(135109);
    j.p(paramm, "holder");
    Object localObject = this.iLD.get(paramInt);
    j.o(localObject, "dataList[position]");
    paramm.f((LocalUsageInfo)localObject);
    AppMethodBeat.o(135109);
  }

  public final ArrayList<LocalUsageInfo> aNd()
  {
    AppMethodBeat.i(135105);
    synchronized (this.iLD)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(this.iLD.size());
      localArrayList2.addAll((Collection)this.iLD);
      AppMethodBeat.o(135105);
      return localArrayList2;
    }
  }

  public final void aO(List<? extends LocalUsageInfo> paramList)
  {
    AppMethodBeat.i(135106);
    j.p(paramList, "list");
    synchronized (this.iLD)
    {
      this.iLD.clear();
      this.iLD.addAll((Collection)paramList);
      AppMethodBeat.o(135106);
      return;
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(135107);
    int i = this.iLD.size();
    AppMethodBeat.o(135107);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(135112);
    LocalUsageInfo localLocalUsageInfo = (LocalUsageInfo)this.iLD.get(paramInt);
    long l = (localLocalUsageInfo.username + localLocalUsageInfo.har).hashCode();
    AppMethodBeat.o(135112);
    return l;
  }

  public final int getItemViewType(int paramInt)
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.k
 * JD-Core Version:    0.6.2
 */