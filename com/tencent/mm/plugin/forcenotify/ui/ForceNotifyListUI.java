package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.v;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.forcenotify.b.c;
import com.tencent.mm.plugin.forcenotify.c.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "()V", "TAG", "", "adapter", "Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyListAdapter;", "data", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/forcenotify/model/ForceNotifyInfo;", "emptyTipView", "Landroid/view/View;", "loadingView", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "touchLoc", "", "getLayoutId", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "ForceNotifyListAdapter", "ForceNotifyViewHolder", "plugin-force-notify_release"})
public final class ForceNotifyListUI extends MMActivity
  implements k.a
{
  private final String TAG;
  private RecyclerView iJP;
  private View jcv;
  private ForceNotifyListUI.a mtj;
  private View mtk;
  private final ArrayList<b> mtl;
  private final int[] mtm;

  public ForceNotifyListUI()
  {
    AppMethodBeat.i(51083);
    this.TAG = "MicroMsg.ForceNotifyListUI";
    this.mtl = new ArrayList();
    this.mtm = new int[2];
    AppMethodBeat.o(51083);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(51082);
    ab.i(this.TAG, "[onNotifyChange] event:%s", new Object[] { paramString });
    d.xDG.execute((Runnable)new ForceNotifyListUI.e(this));
    AppMethodBeat.o(51082);
  }

  public final int getLayoutId()
  {
    return 2130969587;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(51079);
    super.onBackPressed();
    finish();
    AppMethodBeat.o(51079);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(51080);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.forcenotify.d.a.mth.c((k.a)this);
    setMMTitle(2131300021);
    setBackBtn((MenuItem.OnMenuItemClickListener)new ForceNotifyListUI.c(this));
    this.jcv = findViewById(2131824118);
    this.mtk = findViewById(2131821499);
    this.iJP = ((RecyclerView)findViewById(2131820986));
    paramBundle = this.iJP;
    if (paramBundle == null)
      j.dWJ();
    paramBundle.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.mtj = new ForceNotifyListUI.a(this);
    paramBundle = this.iJP;
    if (paramBundle == null)
      j.dWJ();
    paramBundle.setAdapter((RecyclerView.a)this.mtj);
    d.xDG.execute((Runnable)new ForceNotifyListUI.d(this));
    ((com.tencent.mm.plugin.forcenotify.a.a)g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).e("", 1, cb.aaE() / 1000L);
    AppMethodBeat.o(51080);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(51081);
    super.onDestroy();
    com.tencent.mm.plugin.forcenotify.d.a.mth.d((k.a)this);
    ((com.tencent.mm.plugin.forcenotify.a.a)g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).e("", 2, cb.aaE() / 1000L);
    AppMethodBeat.o(51081);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnCreateContextMenuListener;", "Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "refreshView", "getRefreshView", "()Landroid/view/View;", "resetView", "Landroid/widget/LinearLayout;", "getResetView", "()Landroid/widget/LinearLayout;", "timeView", "Landroid/widget/TextView;", "getTimeView", "()Landroid/widget/TextView;", "titleView", "getTitleView", "username", "", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "onCreateContextMenu", "", "menu", "Landroid/view/ContextMenu;", "v", "menuInfo", "Landroid/view/ContextMenu$ContextMenuInfo;", "onMMMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "index", "", "plugin-force-notify_release"})
  public final class b extends RecyclerView.v
    implements View.OnCreateContextMenuListener, n.d
  {
    final ImageView gvq;
    final TextView mto;
    final LinearLayout mtp;
    final View mtq;
    final TextView titleView;
    String username;

    public b()
    {
      super();
      AppMethodBeat.i(51073);
      this$1 = localObject.findViewById(2131821183);
      if (ForceNotifyListUI.this == null)
        j.dWJ();
      this.gvq = ((ImageView)ForceNotifyListUI.this);
      this$1 = localObject.findViewById(2131821185);
      if (ForceNotifyListUI.this == null)
        j.dWJ();
      this.titleView = ((TextView)ForceNotifyListUI.this);
      this$1 = localObject.findViewById(2131824115);
      if (ForceNotifyListUI.this == null)
        j.dWJ();
      this.mto = ((TextView)ForceNotifyListUI.this);
      this$1 = localObject.findViewById(2131824116);
      if (ForceNotifyListUI.this == null)
        j.dWJ();
      this.mtp = ((LinearLayout)ForceNotifyListUI.this);
      this$1 = localObject.findViewById(2131824117);
      if (ForceNotifyListUI.this == null)
        j.dWJ();
      this.mtq = ForceNotifyListUI.this;
      this$1 = localObject.findViewById(2131821019);
      ForceNotifyListUI.this.setOnTouchListener((View.OnTouchListener)new ForceNotifyListUI.b.1(this));
      ForceNotifyListUI.this.setOnLongClickListener((View.OnLongClickListener)new ForceNotifyListUI.b.2(this));
      this.mtp.setOnClickListener((View.OnClickListener)new ForceNotifyListUI.b.3(this));
      AppMethodBeat.o(51073);
    }

    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      AppMethodBeat.i(51072);
      j.p(paramContextMenu, "menu");
      paramView = ForceNotifyListUI.this.getBaseContext();
      j.o(paramView, "baseContext");
      paramContextMenu.add((CharSequence)paramView.getResources().getString(2131300024));
      AppMethodBeat.o(51072);
    }

    public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
    {
      AppMethodBeat.i(51071);
      if (!at.isNetworkConnected(ah.getContext()))
      {
        Toast.makeText((Context)ForceNotifyListUI.this.dxU(), ForceNotifyListUI.this.getResources().getText(2131299946), 1).show();
        AppMethodBeat.o(51071);
      }
      while (true)
      {
        return;
        ForceNotifyListUI.a(ForceNotifyListUI.this).remove(kj());
        paramMenuItem = ForceNotifyListUI.b(ForceNotifyListUI.this);
        if (paramMenuItem == null)
          j.dWJ();
        paramMenuItem.ci(kj());
        c.mtf.am(this.username, 4);
        if (ForceNotifyListUI.a(ForceNotifyListUI.this).isEmpty())
        {
          paramMenuItem = ForceNotifyListUI.c(ForceNotifyListUI.this);
          if (paramMenuItem == null)
            j.dWJ();
          paramMenuItem.setVisibility(8);
          paramMenuItem = ForceNotifyListUI.d(ForceNotifyListUI.this);
          if (paramMenuItem == null)
            j.dWJ();
          paramMenuItem.setVisibility(0);
        }
        AppMethodBeat.o(51071);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI
 * JD-Core Version:    0.6.2
 */