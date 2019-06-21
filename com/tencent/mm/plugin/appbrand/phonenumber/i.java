package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$ViewHolder;", "appId", "", "context", "Landroid/content/Context;", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Landroid/content/Context;Ljava/util/ArrayList;)V", "getAppId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getPhoneItems", "()Ljava/util/ArrayList;", "setPhoneItems", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetPhoneItems", "ViewHolder", "plugin-appbrand-integration_release"})
public final class i extends RecyclerView.a<i.a>
{
  private final String appId;
  final Context context;
  ArrayList<PhoneItem> ixy;

  public i(String paramString, Context paramContext, ArrayList<PhoneItem> paramArrayList)
  {
    AppMethodBeat.i(134797);
    this.appId = paramString;
    this.context = paramContext;
    this.ixy = paramArrayList;
    AppMethodBeat.o(134797);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(134795);
    int i = this.ixy.size();
    AppMethodBeat.o(134795);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.i
 * JD-Core Version:    0.6.2
 */