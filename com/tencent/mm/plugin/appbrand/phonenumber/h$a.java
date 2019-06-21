package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "adapter", "Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter;Landroid/view/View;)V", "getAdapter", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter;", "deleteIv", "Landroid/widget/ImageView;", "phoneTv", "Landroid/widget/TextView;", "remarkTv", "fillItem", "", "phoneItem", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "plugin-appbrand-integration_release"})
public final class h$a extends RecyclerView.v
{
  final TextView ixA;
  final TextView ixB;
  final h ixC;
  final ImageView ixz;

  public h$a(h paramh, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(134787);
    this.ixC = paramh;
    paramh = paramView.findViewById(2131821268);
    j.o(paramh, "view.findViewById(R.id.p…nager_dialog_item_delete)");
    this.ixz = ((ImageView)paramh);
    paramh = paramView.findViewById(2131821269);
    j.o(paramh, "view.findViewById(R.id.p…anager_dialog_item_phone)");
    this.ixA = ((TextView)paramh);
    paramh = paramView.findViewById(2131821270);
    j.o(paramh, "view.findViewById(R.id.p…nager_dialog_item_remark)");
    this.ixB = ((TextView)paramh);
    AppMethodBeat.o(134787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.h.a
 * JD-Core Version:    0.6.2
 */