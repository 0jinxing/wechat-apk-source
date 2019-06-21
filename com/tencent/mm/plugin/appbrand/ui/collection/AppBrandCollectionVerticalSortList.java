package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.l;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionVerticalSortList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "()V", "mAdapter", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter;", "mList", "Lcom/tencent/mm/ui/widget/sortlist/DragSortListView;", "getLayoutId", "", "initView", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "plugin-appbrand-integration_release"})
public final class AppBrandCollectionVerticalSortList extends AppBrandLauncherUI.Fragment
{
  public static final AppBrandCollectionVerticalSortList.a iLr;
  private DragSortListView iLp;
  private c iLq;

  static
  {
    AppMethodBeat.i(135049);
    iLr = new AppBrandCollectionVerticalSortList.a((byte)0);
    AppMethodBeat.o(135049);
  }

  public final int getLayoutId()
  {
    return 2130968668;
  }

  public final void initView()
  {
    AppMethodBeat.i(135047);
    this.iLp = ((DragSortListView)aMg());
    Object localObject1 = this.iLp;
    if (localObject1 != null)
      ((DragSortListView)localObject1).setDropListener((DragSortListView.h)new AppBrandCollectionVerticalSortList.b(this));
    localObject1 = this.iLp;
    if (localObject1 != null)
      ((DragSortListView)localObject1).setRemoveListener((DragSortListView.l)new AppBrandCollectionVerticalSortList.c(this));
    localObject1 = getActivity();
    if (localObject1 == null)
      j.dWJ();
    j.o(localObject1, "activity!!");
    localObject1 = (Context)localObject1;
    Object localObject2 = getArguments();
    if (localObject2 == null)
      j.dWJ();
    localObject2 = ((Bundle)localObject2).getParcelableArrayList("KEY_SORT_DATA_LIST");
    if (localObject2 == null)
      j.dWJ();
    this.iLq = new c((Context)localObject1, (ArrayList)localObject2);
    localObject1 = this.iLq;
    if (localObject1 == null)
      j.dWJ();
    localObject2 = this.iLp;
    if (localObject2 == null)
      j.dWJ();
    j.p(localObject2, "list");
    ((c)localObject1).iLp = ((DragSortListView)localObject2);
    localObject2 = ((c)localObject1).iLp;
    if (localObject2 == null)
      j.dWJ();
    ((DragSortListView)localObject2).setAdapter((ListAdapter)localObject1);
    AppMethodBeat.o(135047);
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(135048);
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    paramBundle = localFragmentActivity;
    if (!(localFragmentActivity instanceof MMActivity))
      paramBundle = null;
    paramBundle = (MMActivity)paramBundle;
    if (paramBundle != null)
      paramBundle.a(0, getString(2131296848), (MenuItem.OnMenuItemClickListener)new AppBrandCollectionVerticalSortList.d(this), q.b.ymw);
    localFragmentActivity = getActivity();
    paramBundle = localFragmentActivity;
    if (!(localFragmentActivity instanceof MMActivity))
      paramBundle = null;
    paramBundle = (MMActivity)paramBundle;
    if (paramBundle != null)
    {
      paramBundle.setBackBtn((MenuItem.OnMenuItemClickListener)new AppBrandCollectionVerticalSortList.e(this), 2131230739);
      AppMethodBeat.o(135048);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135048);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList
 * JD-Core Version:    0.6.2
 */