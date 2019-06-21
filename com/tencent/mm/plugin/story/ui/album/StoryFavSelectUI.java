package com.tencent.mm.plugin.story.ui.album;

import a.f.a.m;
import a.l;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.m;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.d.a.c;
import com.tencent.mm.plugin.story.d.a.d;
import com.tencent.mm.plugin.story.f.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavSelectUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectView;", "()V", "TAG", "", "favPanel", "Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;", "mPresenter", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectPresenter;", "dealContentView", "", "v", "Landroid/view/View;", "getLayoutId", "", "initActionBar", "initViews", "loadDatas", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onIsAll", "onLoadFinish", "datas", "", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "onSelectedFav", "storyInfo", "parseIntent", "plugin-story_release"})
public final class StoryFavSelectUI extends MMActivity
  implements a.d
{
  private final String TAG;
  private StoryFavoritePanel sgE;
  private a.c sgI;

  public StoryFavSelectUI()
  {
    AppMethodBeat.i(110196);
    this.TAG = "MicroMsg.StoryFavSelectUI";
    AppMethodBeat.o(110196);
  }

  public final void cxn()
  {
    AppMethodBeat.i(110195);
    StoryFavoritePanel localStoryFavoritePanel = this.sgE;
    if (localStoryFavoritePanel == null)
      a.f.b.j.avw("favPanel");
    localStoryFavoritePanel.cxn();
    AppMethodBeat.o(110195);
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(110193);
    super.dealContentView(paramView);
    paramView = findViewById(2131827991);
    a.f.b.j.o(paramView, "findViewById(R.id.album_story_favorite_panel)");
    this.sgE = ((StoryFavoritePanel)paramView);
    StoryFavoritePanel localStoryFavoritePanel = this.sgE;
    if (localStoryFavoritePanel == null)
      a.f.b.j.avw("favPanel");
    paramView = StoryFavoritePanel.sgX;
    localStoryFavoritePanel.setup(StoryFavoritePanel.cCk());
    paramView = this.sgE;
    if (paramView == null)
      a.f.b.j.avw("favPanel");
    paramView.setMOnFavItemClickListener((m)new StoryFavSelectUI.b(this));
    paramView = this.sgE;
    if (paramView == null)
      a.f.b.j.avw("favPanel");
    paramView.a((RecyclerView.m)new StoryFavSelectUI.c(this));
    paramView = this.sgI;
    if (paramView == null)
      a.f.b.j.avw("mPresenter");
    paramView.cxo();
    paramView = this.sgI;
    if (paramView == null)
      a.f.b.j.avw("mPresenter");
    paramView.cxl();
    AppMethodBeat.o(110193);
  }

  public final void du(List<com.tencent.mm.plugin.story.h.j> paramList)
  {
    AppMethodBeat.i(110194);
    a.f.b.j.p(paramList, "datas");
    new StringBuilder("onLoadFinish datas.size").append(paramList.size());
    h.dQI();
    Object localObject;
    if (paramList.isEmpty())
    {
      paramList = this.sgE;
      if (paramList == null)
        a.f.b.j.avw("favPanel");
      localObject = dxU();
      a.f.b.j.o(localObject, "context");
      localObject = ((AppCompatActivity)localObject).getResources().getString(2131305996);
      a.f.b.j.o(localObject, "context.resources.getStr…elect_favorite_empty_tip)");
      paramList.abd((String)localObject);
      AppMethodBeat.o(110194);
    }
    while (true)
    {
      return;
      localObject = this.sgE;
      if (localObject == null)
        a.f.b.j.avw("favPanel");
      ((StoryFavoritePanel)localObject).g(paramList, true);
      AppMethodBeat.o(110194);
    }
  }

  public final int getLayoutId()
  {
    return 2130970850;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110191);
    this.sgI = ((a.c)new a((a.d)this));
    a.c localc = this.sgI;
    if (localc == null)
      a.f.b.j.avw("mPresenter");
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    localc.onCreate(j.a.cnk());
    super.onCreate(paramBundle);
    setMMTitle(2131306015);
    setBackBtn((MenuItem.OnMenuItemClickListener)new StoryFavSelectUI.a(this));
    AppMethodBeat.o(110191);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110192);
    super.onDestroy();
    a.c localc = this.sgI;
    if (localc == null)
      a.f.b.j.avw("mPresenter");
    localc.bMO();
    AppMethodBeat.o(110192);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavSelectUI
 * JD-Core Version:    0.6.2
 */