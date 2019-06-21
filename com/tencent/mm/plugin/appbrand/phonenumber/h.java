package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter$ViewHolder;", "context", "Landroid/content/Context;", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "deletePhoneItems", "getDeletePhoneItems", "()Ljava/util/ArrayList;", "getPhoneItems", "setPhoneItems", "(Ljava/util/ArrayList;)V", "showDelete", "", "getShowDelete", "()Z", "setShowDelete", "(Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "phoneItem", "updatePhoneItems", "", "ViewHolder", "plugin-appbrand-integration_release"})
public final class h extends RecyclerView.a<h.a>
{
  final Context context;
  final ArrayList<PhoneItem> ixw;
  boolean ixx;
  ArrayList<PhoneItem> ixy;

  public h(Context paramContext, ArrayList<PhoneItem> paramArrayList)
  {
    AppMethodBeat.i(134791);
    this.context = paramContext;
    this.ixy = paramArrayList;
    this.ixw = new ArrayList();
    AppMethodBeat.o(134791);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(134789);
    int i = this.ixy.size();
    AppMethodBeat.o(134789);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.h
 * JD-Core Version:    0.6.2
 */