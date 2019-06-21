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
import java.util.regex.Pattern;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "listener", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;)V", "bottomLine", "getBottomLine", "()Landroid/view/View;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "itemInfo", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "mListener", "getMListener", "()Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "textType", "getTextType", "fillContent", "", "dataItem", "fillDiffs", "newItem", "diffs", "Landroid/os/Bundle;", "fillIconURL", "fillNickname", "onClick", "v", "IEnterWxaListener", "plugin-appbrand-integration_release"})
public class m extends RecyclerView.v
  implements View.OnClickListener
{
  private final a iLO;
  private final TextView iLP;
  private final TextView iLQ;
  final ImageView iLR;
  final View iLS;
  LocalUsageInfo iLT;

  public m(View paramView, a parama)
  {
    super(paramView);
    AppMethodBeat.i(135119);
    this.iLO = parama;
    paramView.setOnClickListener((View.OnClickListener)this);
    parama = paramView.findViewById(2131820649);
    j.o(parama, "itemView.findViewById(R.id.primary_text)");
    this.iLP = ((TextView)parama);
    parama = paramView.findViewById(2131821153);
    j.o(parama, "itemView.findViewById(R.id.tag_text)");
    this.iLQ = ((TextView)parama);
    parama = paramView.findViewById(2131820915);
    j.o(parama, "itemView.findViewById(R.id.icon)");
    this.iLR = ((ImageView)parama);
    paramView = paramView.findViewById(2131821128);
    j.o(paramView, "itemView.findViewById(R.id.divider)");
    this.iLS = paramView;
    AppMethodBeat.o(135119);
  }

  final void aNe()
  {
    AppMethodBeat.i(135117);
    com.tencent.mm.modelappbrand.a.b localb = com.tencent.mm.modelappbrand.a.b.abR();
    ImageView localImageView = this.iLR;
    LocalUsageInfo localLocalUsageInfo = this.iLT;
    if (localLocalUsageInfo == null)
      j.dWJ();
    localb.a(localImageView, localLocalUsageInfo.haO, com.tencent.mm.modelappbrand.a.a.abQ(), (b.f)com.tencent.mm.modelappbrand.a.f.fqH);
    AppMethodBeat.o(135117);
  }

  final void aNf()
  {
    AppMethodBeat.i(135118);
    Object localObject = this.iLT;
    if (localObject == null)
      j.dWJ();
    String str = ((LocalUsageInfo)localObject).nickname;
    TextView localTextView = this.iLP;
    localObject = (CharSequence)str;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label116;
      localObject = this.iLT;
      if (localObject == null)
        j.dWJ();
      str = ((LocalUsageInfo)localObject).username;
      j.o(str, "itemInfo!!.username");
      localObject = Pattern.quote("@app");
      j.o(localObject, "Pattern.quote(ConstantsStorage.TAG_APPBRAND)");
    }
    label116: for (localObject = (CharSequence)a.k.m.aI(str, (String)localObject, ""); ; localObject = (CharSequence)str)
    {
      localTextView.setText((CharSequence)localObject);
      AppMethodBeat.o(135118);
      return;
      i = 0;
      break;
    }
  }

  public final void f(LocalUsageInfo paramLocalUsageInfo)
  {
    AppMethodBeat.i(135116);
    j.p(paramLocalUsageInfo, "dataItem");
    this.iLT = paramLocalUsageInfo;
    String str = com.tencent.mm.plugin.appbrand.appcache.b.no(paramLocalUsageInfo.har);
    paramLocalUsageInfo = (CharSequence)str;
    int i;
    if ((paramLocalUsageInfo == null) || (paramLocalUsageInfo.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label76;
      this.iLQ.setVisibility(8);
    }
    while (true)
    {
      aNf();
      aNe();
      AppMethodBeat.o(135116);
      return;
      i = 0;
      break;
      label76: this.iLQ.setVisibility(0);
      this.iLQ.setText((CharSequence)str);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(135115);
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
      paramView = this.iLO;
      if (paramView != null)
      {
        paramView.aMV();
        AppMethodBeat.o(135115);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135115);
      continue;
      AppMethodBeat.o(135115);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;", "", "onEnter", "", "plugin-appbrand-integration_release"})
  public static abstract interface a
  {
    public abstract void aMV();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.m
 * JD-Core Version:    0.6.2
 */