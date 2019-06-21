package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder;", "root", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteHandle", "kotlin.jvm.PlatformType", "getDeleteHandle", "()Landroid/view/View;", "rightExtraBottomLine", "getRightExtraBottomLine", "sortHandle", "getSortHandle", "setBottomLineVisibility", "", "visibility", "", "plugin-appbrand-integration_release"})
final class j extends m
{
  private final View iLL;
  final View iLM;
  final View iLN;

  public j(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(135104);
    this.iLL = paramView.findViewById(2131820550);
    this.iLM = paramView.findViewById(2131821154);
    this.iLN = paramView.findViewById(2131821155);
    ViewGroup.LayoutParams localLayoutParams = this.iLR.getLayoutParams();
    paramView = localLayoutParams;
    if (!(localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      paramView = null;
    paramView = (ViewGroup.MarginLayoutParams)paramView;
    if (paramView != null)
      paramView.leftMargin = 0;
    this.iLR.requestLayout();
    AppMethodBeat.o(135104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.j
 * JD-Core Version:    0.6.2
 */