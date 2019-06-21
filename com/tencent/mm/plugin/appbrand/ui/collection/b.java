package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import a.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.c;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.e;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.f;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionDragFeatureView;", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView;", "context", "Landroid/content/Context;", "recyclerView", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionRecyclerView;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionRecyclerView;)V", "mFloatViewHolder", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionViewHolder;", "getRecyclerView", "()Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionRecyclerView;", "animateFloatViewHolderAppearance", "", "floatHolder", "attachDragCallback", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemDragCallback;", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "createFloatViewForCallback", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "holder", "getOffsetOfFloatAnimation", "", "onBindFloatViewHolder", "originHolder", "onCreateFloatViewHolder", "Landroid/view/ViewGroup;", "onListMayChanged", "onListMayChanged$plugin_appbrand_integration_release", "onViewAdded", "child", "resetFloatViewHolder", "setRubbishViewVisible", "visibility", "", "plugin-appbrand-integration_release"})
@SuppressLint({"ViewConstructor"})
public class b extends DragFeatureView
{
  private n iLE;
  private final i iLF;

  public b(Context paramContext, i parami)
  {
    super(paramContext);
    AppMethodBeat.i(135086);
    this.iLF = parami;
    AppMethodBeat.o(135086);
  }

  public final c<?> N(RecyclerView.v paramv)
  {
    AppMethodBeat.i(135083);
    if ((paramv != null) && (paramv.kk() == 1))
    {
      paramv = (FrameLayout)this;
      RecyclerView.a locala = this.iLF.getAdapter();
      if (locala == null)
      {
        paramv = new v("null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.collection.CollectionAdapter");
        AppMethodBeat.o(135083);
        throw paramv;
      }
      paramv = new e(paramv, (List)((a)locala).iLD, (f)new b.b());
      paramv.a((com.tencent.mm.plugin.appbrand.widget.desktop.a.a)new b.a(this));
      paramv = (c)paramv;
      AppMethodBeat.o(135083);
    }
    while (true)
    {
      return paramv;
      paramv = null;
      AppMethodBeat.o(135083);
    }
  }

  public void aMZ()
  {
  }

  public final i getRecyclerView()
  {
    return this.iLF;
  }

  public final void onViewAdded(View paramView)
  {
    AppMethodBeat.i(135085);
    super.onViewAdded(paramView);
    Object localObject = this.iLE;
    n localn;
    ViewPropertyAnimator localViewPropertyAnimator;
    float f1;
    float f2;
    if (localObject != null)
    {
      localObject = ((n)localObject).apJ;
      if (j.j(paramView, localObject))
      {
        localn = this.iLE;
        if (localn == null)
          j.dWJ();
        localViewPropertyAnimator = localn.apJ.animate();
        paramView = localn.apJ;
        j.o(paramView, "floatHolder.itemView");
        f1 = paramView.getTranslationY();
        TextView localTextView = localn.iLP;
        localObject = localTextView.getLayoutParams();
        paramView = (View)localObject;
        if (!(localObject instanceof RelativeLayout.LayoutParams))
          paramView = null;
        paramView = (RelativeLayout.LayoutParams)paramView;
        f2 = localTextView.getHeight();
        if (paramView == null)
          break label225;
        int i = paramView.topMargin;
        f2 = paramView.bottomMargin + i + f2;
      }
    }
    label225: 
    while (true)
    {
      localViewPropertyAnimator.translationY(f2 / 2.0F + f1).setDuration(1L).start();
      localn.apJ.animate().scaleX(1.3F).scaleY(1.3F).setDuration(200L).setListener(null).setUpdateListener(null).start();
      localn.apJ.animate().alpha(0.6F).setDuration(200L).setListener(null).setUpdateListener(null).start();
      AppMethodBeat.o(135085);
      return;
      localObject = null;
      break;
    }
  }

  public final void setRubbishViewVisible(int paramInt)
  {
    AppMethodBeat.i(135084);
    super.setRubbishViewVisible(paramInt);
    AppMethodBeat.o(135084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.b
 * JD-Core Version:    0.6.2
 */