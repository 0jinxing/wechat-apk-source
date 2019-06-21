package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "itemInfo", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "getItemInfo$plugin_appbrand_integration_release", "()Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "setItemInfo$plugin_appbrand_integration_release", "(Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;)V", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "textType", "getTextType", "fillContent", "", "dataItem", "onClick", "v", "plugin-appbrand-integration_release"})
public final class n extends RecyclerView.v
  implements View.OnClickListener
{
  final TextView iLP;
  private final TextView iLQ;
  final ImageView iLR;
  LocalUsageInfo iLT;

  public n(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(135122);
    paramView.setOnClickListener((View.OnClickListener)this);
    View localView = paramView.findViewById(2131820735);
    j.o(localView, "itemView.findViewById(R.id.name)");
    this.iLP = ((TextView)localView);
    localView = paramView.findViewById(2131821153);
    j.o(localView, "itemView.findViewById(R.id.tag_text)");
    this.iLQ = ((TextView)localView);
    paramView = paramView.findViewById(2131820915);
    j.o(paramView, "itemView.findViewById(R.id.icon)");
    this.iLR = ((ImageView)paramView);
    AppMethodBeat.o(135122);
  }

  public final void f(LocalUsageInfo paramLocalUsageInfo)
  {
    AppMethodBeat.i(135121);
    j.p(paramLocalUsageInfo, "dataItem");
    this.iLT = paramLocalUsageInfo;
    this.iLP.setText((CharSequence)paramLocalUsageInfo.nickname);
    String str = com.tencent.mm.plugin.appbrand.appcache.b.no(paramLocalUsageInfo.har);
    CharSequence localCharSequence = (CharSequence)str;
    int i;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label109;
      this.iLQ.setVisibility(8);
    }
    while (true)
    {
      com.tencent.mm.modelappbrand.a.b.abR().a(this.iLR, paramLocalUsageInfo.haO, com.tencent.mm.modelappbrand.a.a.abQ(), (b.f)com.tencent.mm.modelappbrand.a.f.fqH);
      AppMethodBeat.o(135121);
      return;
      i = 0;
      break;
      label109: this.iLQ.setVisibility(0);
      this.iLQ.setText((CharSequence)str);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135120);
    Object localObject = this.iLT;
    if (localObject != null)
    {
      com.tencent.luggage.sdk.customize.a locala = com.tencent.mm.plugin.appbrand.launching.precondition.f.ijT;
      if (paramView == null)
        j.dWJ();
      paramView = paramView.getContext();
      String str1 = ((LocalUsageInfo)localObject).username;
      String str2 = ((LocalUsageInfo)localObject).appId;
      int i = ((LocalUsageInfo)localObject).har;
      localObject = new AppBrandStatObject();
      ((AppBrandStatObject)localObject).scene = 1103;
      locala.a(paramView, str1, str2, null, i, 0, (AppBrandStatObject)localObject, null, null);
      AppMethodBeat.o(135120);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135120);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.n
 * JD-Core Version:    0.6.2
 */