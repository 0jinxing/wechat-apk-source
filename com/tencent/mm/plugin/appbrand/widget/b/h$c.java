package com.tencent.mm.plugin.appbrand.widget.b;

import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$ItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$ItemAdapter$ViewHolder;", "items", "", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Item;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "luggage-wechat-full-sdk_release"})
public final class h$c extends RecyclerView.a<h.c.a>
{
  List<h.b> items;

  public h$c(List<h.b> paramList)
  {
    AppMethodBeat.i(102491);
    this.items = paramList;
    AppMethodBeat.o(102491);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(102489);
    int i = this.items.size();
    AppMethodBeat.o(102489);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h.c
 * JD-Core Version:    0.6.2
 */