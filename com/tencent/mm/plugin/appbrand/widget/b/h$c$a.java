package com.tencent.mm.plugin.appbrand.widget.b;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$ItemAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "items", "", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Item;", "(Landroid/view/View;Ljava/util/List;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "getItems", "()Ljava/util/List;", "selected", "subTitle", "Landroid/widget/TextView;", "title", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "applyData", "", "item", "position", "", "checkStateChange", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/ParameterName;", "name", "posChanged", "refreshCheckView", "check", "", "luggage-wechat-full-sdk_release"})
public final class h$c$a extends RecyclerView.v
{
  final TextView gsf;
  ImageView iNr;
  final List<h.b> items;
  final TextView jcI;
  private final ImageView jcJ;
  View view;

  public h$c$a(View paramView, List<h.b> paramList)
  {
    super(paramView);
    AppMethodBeat.i(102485);
    this.view = paramView;
    this.items = paramList;
    paramView = this.view.findViewById(2131820915);
    j.o(paramView, "view.findViewById(R.id.icon)");
    this.iNr = ((ImageView)paramView);
    paramView = this.view.findViewById(2131820678);
    j.o(paramView, "view.findViewById(R.id.title)");
    this.gsf = ((TextView)paramView);
    paramView = this.view.findViewById(2131821245);
    j.o(paramView, "view.findViewById(R.id.sub_title)");
    this.jcI = ((TextView)paramView);
    paramView = this.view.findViewById(2131821246);
    j.o(paramView, "view.findViewById(R.id.selected)");
    this.jcJ = ((ImageView)paramView);
    AppMethodBeat.o(102485);
  }

  final void eZ(boolean paramBoolean)
  {
    AppMethodBeat.i(102484);
    if (this.items.size() == 1)
    {
      this.jcJ.setVisibility(0);
      AppMethodBeat.o(102484);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.jcJ.setVisibility(0);
        AppMethodBeat.o(102484);
      }
      else
      {
        this.jcJ.setVisibility(8);
        AppMethodBeat.o(102484);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h.c.a
 * JD-Core Version:    0.6.2
 */