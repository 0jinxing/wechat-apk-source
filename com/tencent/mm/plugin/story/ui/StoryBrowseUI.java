package com.tencent.mm.plugin.story.ui;

import a.f.b.u.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.api.o;
import com.tencent.mm.plugin.story.api.o.a;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.ui.view.gallery.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StoryBrowseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/story/api/IStoryBrowseUIListener;", "()V", "galleryBg", "Landroid/widget/ImageView;", "galleryView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "hPosition", "", "vPosition", "finishWithResult", "", "result", "getForceOrientation", "getLayoutId", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "storyUIBackPressed", "storyUIHasStory", "storyUINoStory", "Companion", "plugin-story_release"})
@com.tencent.mm.ui.base.a(3)
public final class StoryBrowseUI extends MMActivity
  implements com.tencent.mm.plugin.story.api.g
{
  private static final String TAG = "MicroMsg.StoryBrowseUI";
  public static final StoryBrowseUI.a sev;
  private ImageView mmX;
  private int ses;
  private int set;
  private com.tencent.mm.plugin.story.ui.view.gallery.l seu;

  static
  {
    AppMethodBeat.i(110000);
    sev = new StoryBrowseUI.a((byte)0);
    TAG = "MicroMsg.StoryBrowseUI";
    AppMethodBeat.o(110000);
  }

  private final void cCf()
  {
    AppMethodBeat.i(109999);
    Object localObject = h.scu;
    h.cAs().bF(at.gC((Context)dxU()));
    localObject = h.scu;
    h.cAs().bJ(System.currentTimeMillis());
    localObject = h.scu;
    h.cAt();
    localObject = com.tencent.mm.plugin.story.g.c.sbQ;
    com.tencent.mm.plugin.story.g.c.onDestroy();
    setResult(-1);
    finish();
    AppMethodBeat.o(109999);
  }

  public final void caA()
  {
    AppMethodBeat.i(109997);
    cCf();
    AppMethodBeat.o(109997);
  }

  public final void caB()
  {
  }

  public final void caC()
  {
    AppMethodBeat.i(109998);
    cCf();
    AppMethodBeat.o(109998);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(109996);
    com.tencent.mm.plugin.story.ui.view.gallery.l locall = this.seu;
    if ((locall == null) || (locall.wY() != true))
      cCf();
    AppMethodBeat.o(109996);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(109992);
    ab.i(TAG, "StoryBrowseUI create ".concat(String.valueOf(this)));
    supportRequestWindowFeature(1);
    dxS();
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.plugin.story.g.c.sbQ;
    com.tencent.mm.plugin.story.g.c.czS();
    paramBundle = com.tencent.mm.plugin.story.g.b.sbw;
    com.tencent.mm.plugin.story.g.b.czS();
    Ne(8);
    getWindow().addFlags(2097280);
    getWindow().setFlags(201327616, 201327616);
    d.iV(true);
    RelativeLayout localRelativeLayout = new RelativeLayout((Context)dxU());
    localRelativeLayout.setBackgroundColor(0);
    paramBundle = new ImageView((Context)dxU());
    paramBundle.setBackgroundColor(-16777216);
    this.mmX = paramBundle;
    this.set = getIntent().getIntExtra("h_position", 0);
    this.ses = getIntent().getIntExtra("v_position", 0);
    final String str1 = getIntent().getStringExtra("username");
    final u.c localc = new u.c();
    localc.AVE = getIntent().getStringArrayListExtra("user_list");
    paramBundle = getIntent().getStringArrayListExtra("user_date_list");
    boolean bool1 = getIntent().getBooleanExtra("delete_when_first_empty", false);
    String str2 = getIntent().getStringExtra("gallery_chat_room");
    long l = getIntent().getLongExtra("data_seed_key", 0L);
    Object localObject = h.scu;
    String str3 = h.cAs().getSessionId();
    boolean bool2 = getIntent().getBooleanExtra("gallery_is_for_sns", false);
    boolean bool3 = getIntent().getBooleanExtra("gallery_story_need_action", false);
    ab.i(TAG, "vPosition " + this.ses);
    localObject = h.scu;
    h.cAv();
    localObject = h.scu;
    h.cAs().bF(at.gC((Context)dxU()));
    localObject = h.scu;
    h.cAs().bK(0L);
    localObject = h.scu;
    h.cAs().bM(0L);
    localObject = new u.c();
    ((u.c)localObject).AVE = o.a.cxg().kW(l);
    j.a locala;
    if ((((u.c)localObject).AVE != null) && ((((u.c)localObject).AVE instanceof o)))
    {
      paramBundle = (o)((u.c)localObject).AVE;
      a.f.b.j.p(paramBundle, "dataSeed");
      if ((!(paramBundle instanceof com.tencent.mm.plugin.story.model.d.b)) && (!(paramBundle instanceof com.tencent.mm.plugin.story.model.d.a)) && ((paramBundle instanceof com.tencent.mm.plugin.story.model.d.c)))
      {
        locala = com.tencent.mm.plugin.story.model.j.rST;
        if (bo.isEqual(j.a.cnk(), ((com.tencent.mm.plugin.story.model.d.c)paramBundle).username))
        {
          paramBundle = m.a.rQK;
          this.seu = new com.tencent.mm.plugin.story.ui.view.gallery.l((Context)this, paramBundle, this.ses, bool3);
          label485: paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setDeleteWhenFirstEmpty(bool1);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setChatRoom(str2);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setSessionId(str3);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setForSns(bool2);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setDataSeed(((u.c)localObject).AVE);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setStoryBrowseUIListener((com.tencent.mm.plugin.story.api.g)this);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setCurrentVItem(this.ses);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setCanDragScale(true);
          paramBundle = this.seu;
          if (paramBundle != null)
            paramBundle.setGalleryScaleListener((l.b)new StoryBrowseUI.b(this));
          localRelativeLayout.addView((View)this.mmX, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
          localRelativeLayout.addView((View)this.seu, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
          setContentView((View)localRelativeLayout);
          paramBundle = this.seu;
          if (paramBundle == null)
            break label929;
          paramBundle.post((Runnable)new c(this, localc, str1, (u.c)localObject));
          AppMethodBeat.o(109992);
        }
      }
    }
    while (true)
    {
      return;
      paramBundle = m.a.rQL;
      break;
      paramBundle = m.a.rQH;
      break;
      if (!bo.isNullOrNil(str1))
      {
        locala = com.tencent.mm.plugin.story.model.j.rST;
        if (bo.isEqual(str1, j.a.cnk()))
        {
          if ((paramBundle != null) && (!paramBundle.isEmpty()))
          {
            this.seu = new com.tencent.mm.plugin.story.ui.view.gallery.l((Context)this, m.a.rQI);
            ((u.c)localObject).AVE = paramBundle;
            break label485;
          }
          this.seu = new com.tencent.mm.plugin.story.ui.view.gallery.l((Context)this, m.a.rQE);
          ((u.c)localObject).AVE = str1;
          break label485;
        }
      }
      if (!bo.isNullOrNil(str1))
      {
        paramBundle = com.tencent.mm.plugin.story.model.j.rST;
        if (!bo.isEqual(str1, j.a.cnk()))
        {
          this.seu = new com.tencent.mm.plugin.story.ui.view.gallery.l((Context)this, m.a.rQG);
          ((u.c)localObject).AVE = str1;
          break label485;
        }
      }
      if ((ArrayList)localc.AVE == null)
        break label485;
      this.seu = new com.tencent.mm.plugin.story.ui.view.gallery.l((Context)this, m.a.rQH);
      ((u.c)localObject).AVE = new ArrayList((Collection)localc.AVE);
      break label485;
      label929: AppMethodBeat.o(109992);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(109995);
    ab.i(TAG, "onDestroy ".concat(String.valueOf(this)));
    super.onDestroy();
    Object localObject = this.seu;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.ui.view.gallery.l)localObject).onDestroy();
    localObject = com.tencent.mm.plugin.story.g.c.sbQ;
    com.tencent.mm.plugin.story.g.c.onDestroy();
    AppMethodBeat.o(109995);
  }

  public final void onPause()
  {
    AppMethodBeat.i(109994);
    ab.i(TAG, "onPause ".concat(String.valueOf(this)));
    super.onPause();
    com.tencent.mm.plugin.story.ui.view.gallery.l locall = this.seu;
    if (locall != null)
    {
      locall.onPause();
      AppMethodBeat.o(109994);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109994);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(109993);
    ab.i(TAG, "onResume ".concat(String.valueOf(this)));
    super.onResume();
    com.tencent.mm.plugin.story.ui.view.gallery.l locall = this.seu;
    if (locall != null)
      locall.onResume();
    locall = this.seu;
    if (locall != null)
    {
      locall.cwK();
      AppMethodBeat.o(109993);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109993);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class c
    implements Runnable
  {
    c(StoryBrowseUI paramStoryBrowseUI, u.c paramc1, String paramString, u.c paramc2)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(109991);
      Object localObject1 = StoryBrowseUI.b(this.sew);
      if (localObject1 != null)
      {
        ((com.tencent.mm.plugin.story.ui.view.gallery.l)localObject1).getVideoViewMgrFromPreLoad();
        ((com.tencent.mm.plugin.story.ui.view.gallery.l)localObject1).K(false, true);
        ((com.tencent.mm.plugin.story.ui.view.gallery.l)localObject1).setVideoViewMgrFromPreLoad(false);
        ((com.tencent.mm.plugin.story.ui.view.gallery.l)localObject1).setCurrentHItem(StoryBrowseUI.d(this.sew));
      }
      localObject1 = h.scu;
      e locale;
      Object localObject2;
      if (h.cAs().FF() != 4L)
      {
        localObject1 = h.scu;
        if (h.cAs().FF() != 6L);
      }
      else
      {
        locale = (e)com.tencent.mm.kernel.g.M(e.class);
        localObject1 = (List)localc.AVE;
        localObject2 = h.scu;
        locale.reportWaitPlayList((List)localObject1, h.cAs().FF());
        AppMethodBeat.o(109991);
      }
      while (true)
      {
        return;
        localObject1 = h.scu;
        if (h.cAs().FF() == 5L)
        {
          locale = (e)com.tencent.mm.kernel.g.M(e.class);
          localObject2 = (List)a.a.j.U(new String[] { str1 });
          localObject1 = h.scu;
          locale.reportWaitPlayList((List)localObject2, h.cAs().FF());
          AppMethodBeat.o(109991);
        }
        else
        {
          localObject1 = h.scu;
          if (h.cAs().FF() != 12L)
          {
            localObject1 = h.scu;
            if (h.cAs().FF() != 13L);
          }
          else if ((this.seA.AVE != null) && ((this.seA.AVE instanceof com.tencent.mm.plugin.story.model.d.a)))
          {
            locale = (e)com.tencent.mm.kernel.g.M(e.class);
            localObject1 = ((com.tencent.mm.plugin.story.model.d.a)this.seA.AVE).fxt;
            localObject2 = h.scu;
            locale.reportWaitPlayList((List)localObject1, h.cAs().FF());
          }
          AppMethodBeat.o(109991);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryBrowseUI
 * JD-Core Version:    0.6.2
 */