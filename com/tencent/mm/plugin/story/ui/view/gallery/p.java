package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.f.b.k;
import a.l;
import a.v;
import a.y;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.UUID;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "", "()V", "STORY_VIDEO_VIEW_IDKEY_STAT", "", "TAG", "", "audioFocos", "Lcom/tencent/mm/compatible/util/AudioFocusHelper;", "currVideoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "currentSessionId", "isMute", "", "isPlayingVideoItem", "isRequestAudioFocus", "isVideoPause", "isVideoPlaying", "onlineVideoEventListener", "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$onlineVideoEventListener$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$onlineVideoEventListener$1;", "proxy", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$VideoPlayProxy;", "showLoadingTime", "", "videoView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView;", "videoViewCallback", "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$videoViewCallback$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$videoViewCallback$1;", "attachVideoView", "", "parent", "Landroid/view/ViewGroup;", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "changeVideoItem", "item", "checkDetachVideoView", "newParent", "enableReport", "checkPauseOnProgress", "getPlayStatus", "getVideoView", "initCreateVideoView", "context", "Landroid/content/Context;", "isVideoNotChangeItem", "newVideoViewInstance", "onUIDestroy", "onUIPause", "onUIResume", "pauseVideo", "playVideo", "resetVideo", "sameParent", "setMute", "setNeedShowLoading", "show", "setVideoViewProp", "stopTask", "stopVideo", "detach", "VideoPlayCdnCallback", "VideoPlayProxy", "plugin-story_release"})
public final class p
{
  final String TAG;
  private boolean eif;
  StoryVideoView sqW;
  p.b sqX;
  boolean sqY;
  String sqZ;
  private boolean sra;
  i srb;
  private boolean srd;
  private com.tencent.mm.compatible.util.b sre;
  private boolean srf;
  final long srg;
  int srh;
  private final p.d sri;
  private final p.e srj;

  public p()
  {
    AppMethodBeat.i(111001);
    this.TAG = "MicroMsg.Gallery.StoryVideoViewMgr";
    this.sre = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.srg = 987L;
    this.sri = new p.d(this);
    ab.i(this.TAG, "init create StoryVideoViewMgr " + hashCode());
    com.tencent.mm.sdk.b.a.xxA.c((c)this.sri);
    this.srj = new p.e(this);
    AppMethodBeat.o(111001);
  }

  private final boolean n(i parami)
  {
    AppMethodBeat.i(110988);
    Object localObject;
    boolean bool;
    if (parami.cNE != 0)
    {
      localObject = this.srb;
      if ((localObject != null) && (((i)localObject).cNE == parami.cNE))
      {
        AppMethodBeat.o(110988);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      localObject = (CharSequence)parami.rWj.Url;
      int i;
      if ((localObject == null) || (((CharSequence)localObject).length() == 0))
      {
        i = 1;
        label68: if (i != 0)
          break label131;
        localObject = this.srb;
        if (localObject == null)
          break label126;
        localObject = ((i)localObject).rWj;
        if (localObject == null)
          break label126;
      }
      label126: for (localObject = ((cek)localObject).Url; ; localObject = null)
      {
        if (!j.j(localObject, parami.rWj.Url))
          break label131;
        AppMethodBeat.o(110988);
        bool = true;
        break;
        i = 0;
        break label68;
      }
      label131: AppMethodBeat.o(110988);
      bool = false;
    }
  }

  private final boolean s(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(111000);
    Object localObject = this.sqW;
    if (localObject != null);
    for (localObject = ((StoryVideoView)localObject).getParent(); ; localObject = null)
    {
      boolean bool = j.j(localObject, paramViewGroup);
      AppMethodBeat.o(111000);
      return bool;
    }
  }

  public final void N(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(110992);
    ab.c(this.TAG, "stopVideo, detach: ".concat(String.valueOf(paramBoolean1)), new Object[0]);
    Object localObject;
    if (this.sra)
    {
      this.sqZ = null;
      localObject = this.sqW;
      if (localObject != null)
        ((StoryVideoView)localObject).stop();
      this.sqY = false;
      if (this.srf)
      {
        this.sre.Mm();
        this.srf = false;
      }
      this.sra = false;
    }
    if (paramBoolean1)
    {
      this.srd = false;
      r(null);
      localObject = h.scu;
      h.cAs().bJ(System.currentTimeMillis());
      if (paramBoolean2)
      {
        localObject = h.scu;
        h.cAt();
      }
    }
    AppMethodBeat.o(110992);
  }

  public final void a(ViewGroup paramViewGroup, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(110987);
    j.p(paramViewGroup, "parent");
    this.srh = 0;
    boolean bool = s(paramViewGroup);
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("attachVideoView, parent:").append(paramViewGroup.hashCode()).append(", isVideoPause:").append(this.sqY).append(", currentSessionId:").append(this.sqZ).append(", isPlayingVideoItem:").append(this.sra).append(" videoView ");
    Object localObject = this.sqW;
    if (localObject != null)
    {
      localObject = Integer.valueOf(((StoryVideoView)localObject).hashCode());
      ab.c(str, localObject + " sameParent " + bool + " this:" + hashCode(), new Object[0]);
      r(paramViewGroup);
      if (this.sqW == null)
      {
        localObject = ah.getContext();
        j.o(localObject, "MMApplicationContext.getContext()");
        eX((Context)localObject);
      }
      if (bool)
        break label241;
      if (paramLayoutParams != null)
        break label220;
      paramViewGroup.addView((View)this.sqW);
      AppMethodBeat.o(110987);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label220: paramViewGroup.addView((View)this.sqW, paramLayoutParams);
      AppMethodBeat.o(110987);
      continue;
      label241: if (paramLayoutParams != null)
      {
        paramViewGroup = this.sqW;
        if (paramViewGroup != null)
        {
          paramViewGroup.setLayoutParams(paramLayoutParams);
          AppMethodBeat.o(110987);
        }
      }
      else
      {
        AppMethodBeat.o(110987);
      }
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(110997);
    ab.i(this.TAG, "onUIDestroy " + hashCode());
    this.srd = false;
    r(null);
    this.srb = null;
    this.sqW = null;
    if (this.srf)
    {
      this.sre.Mm();
      this.srf = false;
    }
    com.tencent.mm.sdk.b.a.xxA.d((c)this.sri);
    AppMethodBeat.o(110997);
  }

  public final void akV()
  {
    AppMethodBeat.i(110996);
    ab.i(this.TAG, "onUIPause " + hashCode());
    r(null);
    if (this.srf)
    {
      this.sre.Mm();
      this.srf = false;
    }
    AppMethodBeat.o(110996);
  }

  public final void akW()
  {
    AppMethodBeat.i(110995);
    StoryVideoView localStoryVideoView = this.sqW;
    if (localStoryVideoView != null)
    {
      localStoryVideoView.akW();
      AppMethodBeat.o(110995);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110995);
    }
  }

  public final void cDe()
  {
    AppMethodBeat.i(110990);
    ab.c(this.TAG, "playVideo, " + this.sqY + ' ' + this.srd + ", " + this.srb, new Object[0]);
    cDf();
    this.srd = true;
    Object localObject1 = this.srb;
    if (localObject1 != null)
    {
      boolean bool = this.sqY;
      this.sqY = false;
      if (!bool)
        break label184;
      localObject2 = this.sqW;
      if (localObject2 != null)
        ((StoryVideoView)localObject2).m((i)localObject1);
      this.sqY = false;
      if (((i)localObject1).czf())
        this.sra = true;
      if (!this.srf)
      {
        this.sre.requestFocus();
        this.srf = true;
      }
    }
    localObject1 = h.scu;
    Object localObject2 = h.cAs();
    localObject1 = this.sqW;
    if (localObject1 != null);
    for (localObject1 = ((StoryVideoView)localObject1).getContext(); ; localObject1 = null)
    {
      ((ar)localObject2).bF(at.gC((Context)localObject1));
      AppMethodBeat.o(110990);
      return;
      label184: this.sqZ = UUID.randomUUID().toString();
      localObject2 = this.sqX;
      if (localObject2 != null)
        ((p.b)localObject2).p((i)localObject1);
      localObject2 = this.sqW;
      if (localObject2 == null)
        break;
      ((StoryVideoView)localObject2).a((i)localObject1, this.sqZ);
      break;
    }
  }

  final void cDf()
  {
    AppMethodBeat.i(110991);
    ab.i(this.TAG, "setVideoViewProp, isMute:" + this.eif);
    StoryVideoView localStoryVideoView = this.sqW;
    if (localStoryVideoView != null)
    {
      localStoryVideoView.setMute(this.eif);
      AppMethodBeat.o(110991);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110991);
    }
  }

  final void eX(Context paramContext)
  {
    AppMethodBeat.i(110998);
    this.sqW = new StoryVideoView(paramContext);
    this.sqX = new p.b(this);
    paramContext = this.sqW;
    if (paramContext != null)
      paramContext.setIOnlineVideoProxy((com.tencent.mm.modelvideo.b)this.sqX);
    paramContext = this.sqW;
    if (paramContext != null)
      paramContext.setIMMVideoViewCallback((h.b)this.srj);
    paramContext = this.sqW;
    if (paramContext != null)
      paramContext.setReporter((h.c)new p.c(this));
    this.sra = false;
    AppMethodBeat.o(110998);
  }

  public final void o(i parami)
  {
    AppMethodBeat.i(110989);
    j.p(parami, "item");
    if (!n(parami));
    for (boolean bool = true; ; bool = false)
    {
      ab.c(this.TAG, "change:" + bool + " changeVideoItem: origin: " + this.srb + ", new: " + parami + ", " + this.srd + " change:" + bool + " this:" + hashCode(), new Object[0]);
      if (bool)
      {
        this.srb = parami;
        if (this.srd)
        {
          a(this, false, 2);
          cDe();
        }
      }
      AppMethodBeat.o(110989);
      return;
    }
  }

  final void r(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(110999);
    String str = this.TAG;
    Object localObject1 = new StringBuilder("checkDetachVideoView, videoView:");
    Object localObject2 = this.sqW;
    int i;
    boolean bool;
    if (localObject2 != null)
    {
      i = localObject2.hashCode();
      localObject2 = ((StringBuilder)localObject1).append(i).append(", isPlay:");
      localObject1 = this.sqW;
      if (localObject1 == null)
        break label248;
      bool = ((StoryVideoView)localObject1).isPlaying();
      label69: localObject1 = ((StringBuilder)localObject2).append(bool).append(", parent:");
      localObject2 = this.sqW;
      if (localObject2 == null)
        break label254;
      localObject2 = ((StoryVideoView)localObject2).getParent();
      label101: if (localObject2 == null)
        break label260;
      i = localObject2.hashCode();
      label113: localObject2 = ((StringBuilder)localObject1).append(i).append(", newParent:");
      if (paramViewGroup == null)
        break label266;
      i = paramViewGroup.hashCode();
      label137: ab.c(str, i + ", isPlayingVideoItem:" + this.sra, new Object[0]);
      localObject2 = this.sqW;
      if (localObject2 == null)
        break label272;
      localObject2 = ((StoryVideoView)localObject2).getParent();
      label186: if ((localObject2 == null) || (s(paramViewGroup)))
        break label302;
      a(this, true, 1);
      paramViewGroup = this.sqW;
      if (paramViewGroup == null)
        break label278;
    }
    label260: label266: label272: label278: for (paramViewGroup = paramViewGroup.getParent(); ; paramViewGroup = null)
    {
      if (paramViewGroup != null)
        break label283;
      paramViewGroup = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(110999);
      throw paramViewGroup;
      i = 0;
      break;
      label248: bool = false;
      break label69;
      label254: localObject2 = null;
      break label101;
      i = 0;
      break label113;
      i = 0;
      break label137;
      localObject2 = null;
      break label186;
    }
    label283: ((ViewGroup)paramViewGroup).removeView((View)this.sqW);
    this.srb = null;
    label302: AppMethodBeat.o(110999);
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(110994);
    j.o("", "if(BuildConfig.DEBUG) Ut…tack().toString() else \"\"");
    ab.i(this.TAG, "setMute " + paramBoolean + " ret " + "");
    this.eif = paramBoolean;
    AppMethodBeat.o(110994);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class a$a extends k
    implements a.f.a.a<y>
  {
    a$a(p.a parama, String paramString, int paramInt1, int paramInt2)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class a$b extends k
    implements a.f.a.a<y>
  {
    a$b(p.a parama, String paramString, int paramInt)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class a$d extends k
    implements a.f.a.a<y>
  {
    a$d(p.a parama, String paramString, int paramInt1, int paramInt2)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.p
 * JD-Core Version:    0.6.2
 */