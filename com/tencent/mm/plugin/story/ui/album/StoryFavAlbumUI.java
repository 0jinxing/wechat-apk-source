package com.tencent.mm.plugin.story.ui.album;

import a.f.a.b;
import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.m;
import android.text.Html;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.d.a.a;
import com.tencent.mm.plugin.story.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavAlbumUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumView;", "()V", "curDataList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lkotlin/collections/ArrayList;", "favPanel", "Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;", "isSelf", "", "mPresenter", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumPresenter;", "mUsername", "", "tipTv", "Landroid/widget/TextView;", "getLayoutId", "", "goFavGallery", "", "position", "dateList", "goFavSelector", "initActionBar", "initViews", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onIsAll", "onLoadFavFinish", "datas", "", "isAllEmpty", "onResume", "Companion", "plugin-story_release"})
public final class StoryFavAlbumUI extends MMActivity
  implements a.b
{
  private static final String TAG = "MicroMsg.StoryFavAlbumUI";
  public static final StoryFavAlbumUI.a sgG;
  private boolean czr;
  private TextView gJE;
  private String igi;
  private ArrayList<com.tencent.mm.plugin.story.h.j> sgD;
  private StoryFavoritePanel sgE;
  private a.a sgF;

  static
  {
    AppMethodBeat.i(138107);
    sgG = new StoryFavAlbumUI.a((byte)0);
    TAG = "MicroMsg.StoryFavAlbumUI";
    AppMethodBeat.o(138107);
  }

  public StoryFavAlbumUI()
  {
    AppMethodBeat.i(138876);
    this.igi = "";
    this.sgD = new ArrayList();
    this.czr = true;
    AppMethodBeat.o(138876);
  }

  public final void cxn()
  {
    AppMethodBeat.i(138875);
    StoryFavoritePanel localStoryFavoritePanel = this.sgE;
    if (localStoryFavoritePanel != null)
    {
      localStoryFavoritePanel.cxn();
      AppMethodBeat.o(138875);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138875);
    }
  }

  public final void f(List<com.tencent.mm.plugin.story.h.j> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(138874);
    a.f.b.j.p(paramList, "datas");
    int i;
    Object localObject;
    if (!((Collection)paramList).isEmpty())
    {
      i = 1;
      if ((i == 0) && (paramBoolean))
        break label92;
      this.sgD.clear();
      this.sgD.addAll((Collection)paramList);
      localObject = this.sgE;
      if (localObject == null)
        break label84;
      ((StoryFavoritePanel)localObject).g(paramList, this.czr);
      AppMethodBeat.o(138874);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label84: AppMethodBeat.o(138874);
      continue;
      label92: this.sgD.clear();
      paramList = this.gJE;
      if (paramList != null)
        paramList.setVisibility(8);
      paramList = this.sgE;
      if (paramList != null)
      {
        localObject = dxU();
        a.f.b.j.o(localObject, "context");
        localObject = ((AppCompatActivity)localObject).getResources().getString(2131305993);
        a.f.b.j.o(localObject, "context.resources.getStr…album_favorite_empty_tip)");
        paramList.abd((String)localObject);
        AppMethodBeat.o(138874);
      }
      else
      {
        AppMethodBeat.o(138874);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970848;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(138871);
    dxR();
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    Object localObject;
    if (paramBundle != null)
    {
      localObject = paramBundle.getStringExtra("username");
      paramBundle = (Bundle)localObject;
      if (localObject != null);
    }
    else
    {
      paramBundle = "";
    }
    this.igi = paramBundle;
    ab.i(TAG, "initViews username=" + this.igi);
    paramBundle = g.RP().Ry().get(2);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type kotlin.String");
      AppMethodBeat.o(138871);
      throw paramBundle;
    }
    this.czr = bo.isEqual((String)paramBundle, this.igi);
    if (this.czr)
    {
      setMMTitle(2131305994);
      setBackBtn((MenuItem.OnMenuItemClickListener)new StoryFavAlbumUI.b(this));
      this.sgF = ((a.a)new com.tencent.mm.plugin.story.f.m((a.b)this));
      paramBundle = this.sgF;
      if (paramBundle == null)
        a.f.b.j.avw("mPresenter");
      paramBundle.onCreate(this.igi);
      this.gJE = ((TextView)findViewById(2131827990));
      if (this.czr)
        break label507;
      paramBundle = this.gJE;
      if (paramBundle != null)
        paramBundle.setVisibility(8);
    }
    while (true)
    {
      this.sgE = ((StoryFavoritePanel)findViewById(2131827991));
      paramBundle = this.sgE;
      if (paramBundle != null)
      {
        localObject = StoryFavoritePanel.sgX;
        paramBundle.setup(StoryFavoritePanel.cCj());
      }
      paramBundle = this.sgE;
      if (paramBundle != null)
        paramBundle.setMOnAddItemClickListener((b)new StoryFavAlbumUI.d(this));
      paramBundle = this.sgE;
      if (paramBundle != null)
        paramBundle.setMOnFavItemClickListener((a.f.a.m)new StoryFavAlbumUI.e(this));
      paramBundle = this.sgE;
      if (paramBundle != null)
        paramBundle.a((RecyclerView.m)new StoryFavAlbumUI.f(this));
      paramBundle = this.sgF;
      if (paramBundle == null)
        a.f.b.j.avw("mPresenter");
      paramBundle.cxl();
      paramBundle = this.sgF;
      if (paramBundle == null)
        a.f.b.j.avw("mPresenter");
      paramBundle.cxm();
      AppMethodBeat.o(138871);
      return;
      paramBundle = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(paramBundle, "MMKernel.service(IMessengerStorage::class.java)");
      paramBundle = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramBundle).XM().aoO(this.igi);
      localObject = (Context)dxU();
      if (paramBundle != null)
      {
        paramBundle = paramBundle.Oj();
        if (paramBundle == null);
      }
      for (paramBundle = (CharSequence)paramBundle; ; paramBundle = (CharSequence)"")
      {
        View localView = findViewById(16908308);
        a.f.b.j.o(localView, "findViewById<TextView>(android.R.id.text1)");
        paramBundle = com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject, paramBundle, ((TextView)localView).getTextSize());
        setMMTitle(paramBundle + getString(2131305995));
        break;
      }
      label507: paramBundle = this.gJE;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.gJE;
      if (paramBundle != null)
        paramBundle.setText((CharSequence)Html.fromHtml(getResources().getString(2131305988)));
      paramBundle = this.gJE;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new c(this));
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(138873);
    super.onDestroy();
    a.a locala = this.sgF;
    if (locala == null)
      a.f.b.j.avw("mPresenter");
    locala.bMO();
    AppMethodBeat.o(138873);
  }

  public final void onResume()
  {
    AppMethodBeat.i(138872);
    super.onResume();
    a.a locala = this.sgF;
    if (locala == null)
      a.f.b.j.avw("mPresenter");
    locala.cxm();
    AppMethodBeat.o(138872);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class c
    implements View.OnClickListener
  {
    c(StoryFavAlbumUI paramStoryFavAlbumUI)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(138867);
      paramView = new Intent();
      paramView.putExtra("Contact_User", StoryFavAlbumUI.a(this.sgH));
      paramView.putExtra("CONTACT_INFO_UI_SOURCE", 12);
      d.b((Context)this.sgH, "profile", ".ui.ContactInfoUI", paramView);
      AppMethodBeat.o(138867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavAlbumUI
 * JD-Core Version:    0.6.2
 */