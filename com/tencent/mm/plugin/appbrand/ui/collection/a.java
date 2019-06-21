package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionViewHolder;", "dataList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "(Ljava/util/ArrayList;)V", "getDataList", "()Ljava/util/ArrayList;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "plugin-appbrand-integration_release"})
public final class a extends RecyclerView.a<n>
{
  final ArrayList<LocalUsageInfo> iLD;

  public a(ArrayList<LocalUsageInfo> paramArrayList)
  {
    AppMethodBeat.i(135077);
    this.iLD = paramArrayList;
    AppMethodBeat.o(135077);
  }

  private void a(n paramn, int paramInt)
  {
    AppMethodBeat.i(135074);
    j.p(paramn, "holder");
    Object localObject = this.iLD.get(paramInt);
    j.o(localObject, "dataList[position]");
    paramn.f((LocalUsageInfo)localObject);
    AppMethodBeat.o(135074);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(135072);
    int i = this.iLD.size();
    AppMethodBeat.o(135072);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.a
 * JD-Core Version:    0.6.2
 */