package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "adapter", "Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter;Landroid/view/View;)V", "getAdapter", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter;", "checkIv", "Landroid/widget/ImageView;", "phoneTv", "Landroid/widget/TextView;", "remarkTv", "fillItem", "", "phoneItem", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "plugin-appbrand-integration_release"})
public final class i$a extends RecyclerView.v
{
  final TextView ixA;
  final TextView ixB;
  final ImageView ixF;
  final i ixG;

  public i$a(i parami, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(134792);
    this.ixG = parami;
    parami = paramView.findViewById(2131821269);
    j.o(parami, "view.findViewById(R.id.p…anager_dialog_item_phone)");
    this.ixA = ((TextView)parami);
    parami = paramView.findViewById(2131821270);
    j.o(parami, "view.findViewById(R.id.p…nager_dialog_item_remark)");
    this.ixB = ((TextView)parami);
    parami = paramView.findViewById(2131821271);
    j.o(parami, "view.findViewById(R.id.p…anager_dialog_item_check)");
    this.ixF = ((ImageView)parami);
    AppMethodBeat.o(134792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.i.a
 * JD-Core Version:    0.6.2
 */