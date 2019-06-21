package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import a.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "context", "Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getDataList", "()Ljava/util/ArrayList;", "mList", "Lcom/tencent/mm/ui/widget/sortlist/DragSortListView;", "attachListView", "", "list", "getItemId", "", "position", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder;", "item", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "remove", "index", "plugin-appbrand-integration_release"})
public final class c extends ArrayAdapter<LocalUsageInfo>
{
  final ArrayList<LocalUsageInfo> iLD;
  DragSortListView iLp;

  public c(Context paramContext, ArrayList<LocalUsageInfo> paramArrayList)
  {
    super(paramContext, d.aNc(), (List)paramArrayList);
    AppMethodBeat.i(135092);
    this.iLD = paramArrayList;
    AppMethodBeat.o(135092);
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(135090);
    LocalUsageInfo localLocalUsageInfo = (LocalUsageInfo)getItem(paramInt);
    long l = (localLocalUsageInfo.username + localLocalUsageInfo.har).hashCode();
    AppMethodBeat.o(135090);
    return l;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(135091);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(getContext());
      a.f.b.j.o(paramView, "LayoutInflater.from(context)");
      paramViewGroup = paramView.inflate(d.aNc(), paramViewGroup, false);
      paramView = ((ViewStub)paramViewGroup.findViewById(2131821156)).inflate();
      if (paramView != null)
        paramView.setBackground(null);
      a.f.b.j.o(paramViewGroup, "view");
      paramView = new j(paramViewGroup);
      paramViewGroup = getItem(paramInt);
      a.f.b.j.o(paramViewGroup, "getItem(position)");
      paramView.f((LocalUsageInfo)paramViewGroup);
      paramViewGroup = paramView.apJ;
      a.f.b.j.o(paramViewGroup, "holder.itemView");
      paramViewGroup.setClickable(false);
      if (paramInt != getCount() - 1)
        break label224;
    }
    label224: for (int i = 8; ; i = 0)
    {
      paramView.iLS.setVisibility(i);
      paramViewGroup = paramView.iLN;
      a.f.b.j.o(paramViewGroup, "rightExtraBottomLine");
      paramViewGroup.setVisibility(i);
      paramView.iLM.setOnClickListener((View.OnClickListener)new c.a(this, paramInt));
      paramView = paramView.apJ;
      a.f.b.j.o(paramView, "holder.itemView");
      AppMethodBeat.o(135091);
      return paramView;
      paramView = paramView.getTag();
      if (paramView == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.collection.CollectionSortViewHolder");
        AppMethodBeat.o(135091);
        throw paramView;
      }
      paramView = (j)paramView;
      break;
    }
  }

  public final LocalUsageInfo pR(int paramInt)
  {
    AppMethodBeat.i(135089);
    LocalUsageInfo localLocalUsageInfo = (LocalUsageInfo)getItem(paramInt);
    super.remove(localLocalUsageInfo);
    AppMethodBeat.o(135089);
    return localLocalUsageInfo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.c
 * JD-Core Version:    0.6.2
 */