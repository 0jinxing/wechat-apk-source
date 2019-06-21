package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.d.a.e;
import com.tencent.mm.plugin.story.d.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IView;", "()V", "mPresenter", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IPresenter;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mStoryAlbumAdapter", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;", "mStoryBubblePostFailLayout", "Landroid/widget/LinearLayout;", "mStoryBubblePostFailTv", "Landroid/widget/TextView;", "mStoryFavEntrancePanel", "Landroid/view/View;", "mStoryNoDataTv", "mStoryPostFailLayout", "mStoryPostFailTv", "mUsername", "", "dealContentView", "", "v", "getLayoutId", "", "goDateStoryGallery", "position", "dateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "goFavAlbum", "initActionBar", "initViews", "loadFromDB", "loadFromRemote", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBubbleFail", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onIsAll", "onLoadFinish", "datas", "", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "onStoryPostFail", "list", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "supportNavigationSwipeBack", "", "Companion", "plugin-story_release"})
public final class StoryAlbumUI extends MMFragment
  implements a.f
{
  private static final String TAG = "MicroMsg.StoryAlbumUI";
  public static final StoryAlbumUI.a sgB;
  private RecyclerView aiB;
  private String igi = "";
  private a.e sgA;
  private LinearLayout sgt;
  private LinearLayout sgu;
  private TextView sgv;
  private TextView sgw;
  private TextView sgx;
  private View sgy;
  private a sgz;

  static
  {
    AppMethodBeat.i(110181);
    sgB = new StoryAlbumUI.a((byte)0);
    TAG = "MicroMsg.StoryAlbumUI";
    AppMethodBeat.o(110181);
  }

  private final void loadFromDB()
  {
    AppMethodBeat.i(110173);
    a.e locale = this.sgA;
    if (locale == null)
      j.avw("mPresenter");
    locale.cxo();
    AppMethodBeat.o(110173);
  }

  public final void cxn()
  {
    AppMethodBeat.i(110179);
    a locala = this.sgz;
    if (locala == null)
      j.avw("mStoryAlbumAdapter");
    locala.rFn = true;
    if (!((Collection)locala.mItemList).isEmpty());
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        locala.notifyDataSetChanged();
      AppMethodBeat.o(110179);
      return;
    }
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(110175);
    j.p(paramView, "v");
    super.dealContentView(paramView);
    this.sgA = ((a.e)new com.tencent.mm.plugin.story.f.b((a.f)this));
    Object localObject = getActivity();
    if (localObject != null)
    {
      localObject = ((FragmentActivity)localObject).getIntent();
      if (localObject != null)
      {
        String str = ((Intent)localObject).getStringExtra("username");
        localObject = str;
        if (str != null)
          break label70;
      }
    }
    localObject = "";
    label70: this.igi = ((String)localObject);
    ab.i(TAG, "initViews username=" + this.igi);
    localObject = paramView.findViewById(2131828016);
    j.o(localObject, "v.findViewById(R.id.album_story_recycler)");
    this.aiB = ((RecyclerView)localObject);
    localObject = paramView.findViewById(2131828006);
    j.o(localObject, "v.findViewById(R.id.album_story_send_fail_layout)");
    this.sgt = ((LinearLayout)localObject);
    localObject = paramView.findViewById(2131828010);
    j.o(localObject, "v.findViewById(R.id.album_bubble_send_fail_layout)");
    this.sgu = ((LinearLayout)localObject);
    localObject = paramView.findViewById(2131828009);
    j.o(localObject, "v.findViewById(R.id.album_story_send_fail_tips)");
    this.sgv = ((TextView)localObject);
    localObject = paramView.findViewById(2131828013);
    j.o(localObject, "v.findViewById(R.id.album_bubble_send_fail_tips)");
    this.sgw = ((TextView)localObject);
    localObject = paramView.findViewById(2131828015);
    j.o(localObject, "v.findViewById(R.id.album_story_no_data_tip_tv)");
    this.sgx = ((TextView)localObject);
    paramView = paramView.findViewById(2131828014);
    j.o(paramView, "v.findViewById(R.id.album_story_no_data_fav_panel)");
    this.sgy = paramView;
    this.sgz = new a();
    paramView = this.sgz;
    if (paramView == null)
      j.avw("mStoryAlbumAdapter");
    paramView.sgd = ((a.f.a.b)new StoryAlbumUI.c(this));
    paramView = this.sgz;
    if (paramView == null)
      j.avw("mStoryAlbumAdapter");
    paramView.sge = ((a.f.a.a)new StoryAlbumUI.d(this));
    paramView = this.aiB;
    if (paramView == null)
      j.avw("mRecyclerView");
    localObject = this.sgz;
    if (localObject == null)
      j.avw("mStoryAlbumAdapter");
    paramView.setAdapter((RecyclerView.a)localObject);
    paramView = this.aiB;
    if (paramView == null)
      j.avw("mRecyclerView");
    getActivity();
    paramView.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    paramView = this.aiB;
    if (paramView == null)
      j.avw("mRecyclerView");
    paramView.a((RecyclerView.m)new StoryAlbumUI.e(this));
    paramView = this.sgy;
    if (paramView == null)
      j.avw("mStoryFavEntrancePanel");
    paramView.setOnClickListener((View.OnClickListener)new StoryAlbumUI.f(this));
    paramView = this.sgA;
    if (paramView == null)
      j.avw("mPresenter");
    paramView.onCreate(this.igi);
    loadFromDB();
    paramView = this.sgA;
    if (paramView == null)
      j.avw("mPresenter");
    paramView.cxl();
    AppMethodBeat.o(110175);
  }

  public final void du(List<c> paramList)
  {
    AppMethodBeat.i(110178);
    j.p(paramList, "datas");
    ab.i(TAG, "onLoadFinish datas.size=" + paramList.size());
    a locala = this.sgz;
    if (locala == null)
      j.avw("mStoryAlbumAdapter");
    locala.dJ(paramList);
    if (paramList.isEmpty())
    {
      paramList = this.sgy;
      if (paramList == null)
        j.avw("mStoryFavEntrancePanel");
      paramList.setVisibility(0);
      paramList = this.sgx;
      if (paramList == null)
        j.avw("mStoryNoDataTv");
      paramList.setVisibility(0);
      paramList = this.aiB;
      if (paramList == null)
        j.avw("mRecyclerView");
      paramList.setVisibility(8);
    }
    while (true)
    {
      if (!com.tencent.mm.plugin.story.c.a.a.rQZ.cwU())
      {
        paramList = this.sgy;
        if (paramList == null)
          j.avw("mStoryFavEntrancePanel");
        paramList.setVisibility(8);
      }
      AppMethodBeat.o(110178);
      return;
      paramList = this.sgy;
      if (paramList == null)
        j.avw("mStoryFavEntrancePanel");
      paramList.setVisibility(8);
      paramList = this.sgx;
      if (paramList == null)
        j.avw("mStoryNoDataTv");
      paramList.setVisibility(8);
      paramList = this.aiB;
      if (paramList == null)
        j.avw("mRecyclerView");
      paramList.setVisibility(0);
    }
  }

  public final int getLayoutId()
  {
    return 2130970856;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(110176);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d(TAG, "onActivityResult requestCode=" + paramInt1 + " resultCode=" + paramInt2);
    if (paramInt1 == 1)
      loadFromDB();
    AppMethodBeat.o(110176);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110174);
    super.onCreate(paramBundle);
    setMMTitle(2131296502);
    setBackBtn((MenuItem.OnMenuItemClickListener)new StoryAlbumUI.b(this));
    AppMethodBeat.o(110174);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110177);
    super.onDestroy();
    a.e locale = this.sgA;
    if (locale == null)
      j.avw("mPresenter");
    locale.bMO();
    AppMethodBeat.o(110177);
  }

  public final boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryAlbumUI
 * JD-Core Version:    0.6.2
 */