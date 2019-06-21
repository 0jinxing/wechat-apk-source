package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.m;
import a.v;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.an;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.g.b.a.au;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.k.a;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.api.o;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.proxy.c.a;
import com.tencent.mm.plugin.story.ui.view.StoryCommentView;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.widget.listview.PullDownListView;
import java.util.ArrayList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "Lcom/tencent/mm/plugin/story/api/AbsStoryGallery;", "context", "Landroid/content/Context;", "galleryType", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "expectPos", "", "needAction", "", "(Landroid/content/Context;Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;IZ)V", "activePanel", "addReadNumRunnable", "Ljava/lang/Runnable;", "browseUIListener", "Lcom/tencent/mm/plugin/story/api/IStoryBrowseUIListener;", "canDragScale", "value", "", "chatRoom", "getChatRoom", "()Ljava/lang/String;", "setChatRoom", "(Ljava/lang/String;)V", "clickListener", "Lkotlin/Function0;", "commentScrolling", "currentItemView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;", "deleteWhenFirstEmpty", "getDeleteWhenFirstEmpty", "()Z", "setDeleteWhenFirstEmpty", "(Z)V", "dirty", "dragCloseConsumer", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDragCloseConsumer;", "getExpectPos", "()I", "galleryGroupUpdateCallback", "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1;", "galleryGroups", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "Lkotlin/collections/ArrayList;", "galleryScaleListener", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "galleryScrollHelper", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollHelper;", "getGalleryType", "()Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "hRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "hasDispatchCancel", "holderView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "horizontalAdapter", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryAdapter;", "isFirstPost", "setFirstPost", "isForSns", "setForSns", "isMute", "isNeedReset", "setNeedReset", "isSelf", "jumpItemReport", "lastSelectColumn", "mIsActive", "maskView", "Landroid/view/View;", "menuDialog", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog;", "needCancelTouch", "pageIndicator", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "pageSnapHelper", "Landroid/support/v7/widget/PagerSnapHelper;", "postListener", "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$postListener$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$postListener$1;", "presenter", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "pullDownHint", "Landroid/widget/TextView;", "pullDownListView", "scrollUpHintCheck", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck;", "selectedColumn", "selectedRow", "sessionId", "getSessionId", "setSessionId", "tipDialog", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "vRecyclerView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;", "verticalAdapter", "Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalAdapter;", "verticalControlView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView;", "verticalPageSnapHelper", "Lcom/tencent/mm/plugin/story/ui/view/gallery/PageScrollHelper;", "verticalScrollOffset", "", "videoViewMgr", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "videoViewMgrFromPreLoad", "getVideoViewMgrFromPreLoad", "setVideoViewMgrFromPreLoad", "addListeners", "", "addVideoReadNumber", "bindPullDownListView", "wrapperView", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "canScrollHorizontally", "direction", "checkDoPreloadBeforeEnterGallery", "verticalIndex", "horizontalIndex", "checkUpdate", "contentScrollType", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "fadeInMaskView", "fadeOutMaskView", "needVerticalControl", "onBackPressed", "onClosing", "offset", "onDeleteStory", "onDestroy", "onItemSelected", "position", "childView", "onListInnerScroll", "onOpening", "onPause", "onPreImageMode", "onPreVideoMode", "onResume", "onRowSelected", "row", "rowView", "horizontalControlView", "onSetFavoriteStory", "onSetPrivacy", "onStart", "onStop", "onSwitchImageMode", "enableReport", "onSwitchVideoMode", "fromPreCache", "remixItem", "mediaLocalId", "removeListeners", "resendItem", "storyVideoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "reset", "setCanDragScale", "canScale", "setCurrentHItem", "setCurrentVItem", "setDataInternal", "dataSeed", "", "setDataSeed", "setFilterList", "setGalleryScaleListener", "listener", "setStoryBrowseUIListener", "showPullDownHint", "toggleActiveState", "newActive", "Companion", "IOnGalleryScale", "plugin-story_release"})
public final class l extends AbsStoryGallery
{
  private static final String TAG = "MicroMsg.StoryGalleryView";
  public static final l.a spJ;
  private String cvF;
  private boolean czr;
  private boolean dirty;
  private boolean eif;
  private String gpx;
  private View iVh;
  private final int rZE;
  private boolean rZI;
  private int rZb;
  private f shf;
  private boolean shh;
  private boolean shi;
  private boolean shj;
  private final a.f.a.a<Boolean> skn;
  final m.a soE;
  private p soY;
  private l.b soz;
  private final g spA;
  private boolean spB;
  private final l.g spC;
  private int spD;
  private boolean spE;
  private boolean spF;
  private boolean spG;
  private final l.m spH;
  private Runnable spI;
  private boolean spd;
  private boolean spe;
  private View spf;
  final TextView spg;
  private StoryGalleryItemView sph;
  private RecyclerView spi;
  private GalleryHorizontalControlView spj;
  private com.tencent.mm.plugin.story.ui.a.g spk;
  private final an spl;
  private final j spm;
  private int spn;
  private float spo;
  private final r spp;
  private final GalleryRecyclerView spq;
  private final ArrayList<ArrayList<com.tencent.mm.plugin.story.model.d.g>> spr;
  private com.tencent.mm.plugin.story.f.h sps;
  private boolean spt;
  private com.tencent.mm.plugin.story.api.g spu;
  private boolean spv;
  private c spw;
  private final GalleryVerticalControlView spx;
  private a spy;
  private final GalleryHolderView spz;
  private com.tencent.mm.ui.base.p tipDialog;

  static
  {
    AppMethodBeat.i(110849);
    spJ = new l.a((byte)0);
    TAG = "MicroMsg.StoryGalleryView";
    AppMethodBeat.o(110849);
  }

  public l(Context paramContext, m.a parama, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(138953);
    this.soE = parama;
    this.rZE = paramInt;
    this.spm = new j();
    this.rZb = -1;
    this.spn = -1;
    this.dirty = true;
    this.spr = new ArrayList();
    this.spB = true;
    ab.i(TAG, " StoryGalleryView " + this.soE);
    parama = q.srv;
    parama = q.cDg();
    if (parama == null)
    {
      this.soY = new p();
      this.spd = false;
    }
    while (true)
    {
      parama = q.srv;
      q.clean();
      this.spl = ((an)new j());
      this.shf = new f(paramContext);
      View.inflate(paramContext, 2130970889, (ViewGroup)this);
      parama = findViewById(2131828158);
      a.f.b.j.o(parama, "findViewById(R.id.story_gallery_recycler)");
      this.spq = ((GalleryRecyclerView)parama);
      parama = findViewById(2131828159);
      a.f.b.j.o(parama, "findViewById(R.id.story_gallery_mask_view)");
      this.iVh = parama;
      parama = findViewById(2131828162);
      a.f.b.j.o(parama, "findViewById(R.id.story_gallery_holder_layout)");
      this.spz = ((GalleryHolderView)parama);
      parama = findViewById(2131828161);
      a.f.b.j.o(parama, "findViewById(R.id.story_gallery_control_layout)");
      this.spx = ((GalleryVerticalControlView)parama);
      GalleryVerticalControlView.a(this.spx, this.soE);
      parama = this.spx.getLayoutParams();
      if (parama != null)
        break;
      paramContext = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
      AppMethodBeat.o(138953);
      throw paramContext;
      this.spd = true;
      this.soY = parama;
    }
    parama = (RelativeLayout.LayoutParams)parama;
    int i = parama.topMargin;
    paramInt = i;
    if (ae.hD(paramContext))
      paramInt = i + ae.hC(paramContext);
    parama.setMargins(0, paramInt, 0, 0);
    this.spx.setLayoutParams((ViewGroup.LayoutParams)parama);
    parama = findViewById(2131828160);
    a.f.b.j.o(parama, "findViewById(R.id.story_pull_hint)");
    this.spg = ((TextView)parama);
    this.spx.setOnAllFav((a.f.a.a)new l.1(this, paramContext));
    this.spx.a(this.soE, paramBoolean);
    this.spz.setOnClickListener((View.OnClickListener)new l.2(this));
    this.spp = new r();
    this.spq.setAdapter((RecyclerView.a)this.spp);
    this.spq.setFocusable(false);
    this.spq.setOnRowSelected((a.f.a.q)new l.3(this));
    this.spq.setOnScrollCallback((m)new l.4(this));
    this.spp.srw = ((a.f.a.b)new l.5(this));
    this.spx.setOnClose((a.f.a.a)new l.6(this));
    this.spx.setOnMenu((a.f.a.a)new l.7(this, paramContext));
    this.skn = ((a.f.a.a)l.8.spM);
    parama = com.tencent.mm.plugin.story.model.c.rSd;
    com.tencent.mm.plugin.story.model.c.a(this);
    this.spA = new g(this, this.spq, this.spm);
    parama = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAs().bF(at.gC(paramContext));
    this.spC = new l.g(this, paramContext);
    this.spD = -1;
    this.spH = new l.m(this);
    this.spI = ((Runnable)new l.d(this));
    AppMethodBeat.o(138953);
  }

  private final void cCJ()
  {
    AppMethodBeat.i(110824);
    ab.d(TAG, "fadeOutMaskView");
    Object localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAs().bI(System.currentTimeMillis());
    localObject = ObjectAnimator.ofFloat(this.iVh, "alpha", new float[] { 1.0F, 0.0F });
    ((ObjectAnimator)localObject).addListener((Animator.AnimatorListener)new l.f(this));
    ((ObjectAnimator)localObject).start();
    AppMethodBeat.o(110824);
  }

  private final void cCK()
  {
    AppMethodBeat.i(110845);
    if (this.czr)
    {
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().a((com.tencent.mm.plugin.story.api.j)this.spH);
      locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().e((a.f.a.a)new l.c(this));
    }
    AppMethodBeat.o(110845);
  }

  private final void cCL()
  {
    AppMethodBeat.i(110847);
    String str = TAG;
    StringBuilder localStringBuilder = new StringBuilder("addVideoReadNumber ");
    Object localObject = this.sph;
    if (localObject == null)
      a.f.b.j.dWJ();
    localObject = ((StoryGalleryItemView)localObject).getVideoItem();
    if (localObject == null)
      a.f.b.j.dWJ();
    ab.d(str, ((i)localObject).rUJ + "  time:" + System.currentTimeMillis());
    al.af(this.spI);
    al.n(this.spI, 500L);
    AppMethodBeat.o(110847);
  }

  private final void db()
  {
    AppMethodBeat.i(110846);
    if (this.czr)
    {
      ab.i(TAG, "removeListeners");
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().b((com.tencent.mm.plugin.story.api.j)this.spH);
    }
    AppMethodBeat.o(110846);
  }

  private final void lL(boolean paramBoolean)
  {
    AppMethodBeat.i(138952);
    ab.i(TAG, "toggleActiveState ".concat(String.valueOf(paramBoolean)));
    Object localObject = this.sph;
    if (localObject != null)
    {
      localObject = ((StoryGalleryItemView)localObject).getCommentView();
      if (localObject != null)
        ((StoryCommentView)localObject).lL(paramBoolean);
    }
    this.spx.lL(paramBoolean);
    AppMethodBeat.o(138952);
  }

  private void reset()
  {
    AppMethodBeat.i(110841);
    ab.i(TAG, "reset " + bo.dpG() + " isFirstPost : " + this.spG);
    if ((this.spG) && (this.spt))
      lr(false);
    if (this.spG)
    {
      com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(locale, "MMKernel.storage()");
      locale.Ry().set(ac.a.xWM, Boolean.FALSE);
      this.spG = false;
    }
    AppMethodBeat.o(110841);
  }

  private final void setDataInternal(Object paramObject)
  {
    AppMethodBeat.i(110826);
    Object localObject = com.tencent.mm.plugin.story.f.f.rZu;
    this.sps = com.tencent.mm.plugin.story.f.f.a(paramObject, (com.tencent.mm.plugin.story.f.e)this.spC, this.soE, this.gpx, this.rZI);
    localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).ET(this.rZE);
    ab.i(TAG, "presenter " + this.sps + " galleryType " + this.soE);
    localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).czC();
    this.spx.setVisibility(0);
    localObject = this.soE;
    int i;
    switch (m.eQZ[localObject.ordinal()])
    {
    default:
      i = 0;
      if (i != 0)
        if ((paramObject instanceof o))
          this.spx.setUserList(com.tencent.mm.plugin.story.model.d.e.a((o)paramObject));
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
      if ((this.soE == m.a.rQD) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
      {
        localObject = this.spz;
        paramObject = getLayoutParams();
        if (paramObject == null)
        {
          paramObject = new v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          AppMethodBeat.o(110826);
          throw paramObject;
          i = 1;
          break;
          if (!(paramObject instanceof List))
            continue;
          this.spx.setUserList((List)paramObject);
          continue;
          paramObject = this.spx;
          paramObject.sif.setVisibility(0);
          paramObject.soC.setVisibility(8);
          continue;
        }
        ((GalleryHolderView)localObject).setInitMargin(((ViewGroup.MarginLayoutParams)paramObject).topMargin);
      }
    AppMethodBeat.o(110826);
  }

  public final void AW(int paramInt)
  {
    AppMethodBeat.i(110844);
    ab.d(TAG, "onListInnerScroll ".concat(String.valueOf(paramInt)));
    if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
    {
      GalleryHolderView localGalleryHolderView = this.spz;
      float f = 1.0F - Math.min(Math.abs(paramInt) / com.tencent.mm.bz.a.fromDPToPix(localGalleryHolderView.getContext(), 16), 1.0F);
      ab.d(GalleryHolderView.TAG, "onListInnerScroll " + paramInt + ' ' + f);
      localGalleryHolderView.iDT.setAlpha(f);
      localGalleryHolderView.snN = f;
    }
    AppMethodBeat.o(110844);
  }

  public final void EF(int paramInt)
  {
    AppMethodBeat.i(110842);
    ab.d(TAG, "onOpening ".concat(String.valueOf(paramInt)));
    if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
    {
      GalleryHolderView localGalleryHolderView = this.spz;
      float f = Math.min(Math.abs(paramInt) / Math.abs(localGalleryHolderView.snM), 1.0F);
      localGalleryHolderView.snI.setAlpha(f);
      localGalleryHolderView.iDT.setAlpha(1.0F - f);
      localGalleryHolderView.snI.setVisibility(0);
    }
    AppMethodBeat.o(110842);
  }

  public final void EG(int paramInt)
  {
    AppMethodBeat.i(110843);
    ab.d(TAG, "onClosing ".concat(String.valueOf(paramInt)));
    if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
    {
      GalleryHolderView localGalleryHolderView = this.spz;
      float f = Math.min(1.0F, Math.abs(paramInt) / Math.abs(localGalleryHolderView.snM));
      localGalleryHolderView.snI.setAlpha(1.0F - f);
      localGalleryHolderView.iDT.setAlpha(f);
      localGalleryHolderView.snI.setVisibility(0);
    }
    AppMethodBeat.o(110843);
  }

  public final void Fk(int paramInt)
  {
    AppMethodBeat.i(110822);
    if ((this.spr.size() > 0) && (((ArrayList)this.spr.get(0)).size() > paramInt))
    {
      ab.c(TAG, "checkDoPreloadBeforeEnterGallery", new Object[0]);
      if ((((ArrayList)this.spr.get(0)).size() > paramInt) && (!bo.isNullOrNil(((com.tencent.mm.plugin.story.model.d.g)((ArrayList)this.spr.get(0)).get(paramInt)).rVZ.rWj.Url)))
      {
        ab.i(TAG, "checkDoPreloadBeforeEnterGallery, add [0," + paramInt + "] item");
        n localn = n.sqi;
        n.dK((List)a.a.j.U(new i[] { ((com.tencent.mm.plugin.story.model.d.g)((ArrayList)this.spr.get(0)).get(paramInt)).rVZ }));
        AppMethodBeat.o(110822);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110822);
    }
  }

  public final void K(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(110834);
    ab.i(TAG, "LogStory: onSwitchVideoMode isMute:" + paramBoolean1 + " videoViewMgr " + this.soY + " videoViewMgrFromPreLoad " + this.spd);
    this.spt = true;
    this.eif = paramBoolean1;
    Object localObject2 = this.sph;
    if (localObject2 != null)
      ((StoryGalleryItemView)localObject2).setMute(paramBoolean1);
    Object localObject3;
    if ((this.spr.size() > 0) && (this.rZb >= 0) && (this.rZb < this.spr.size()) && (this.spn < ((ArrayList)this.spr.get(this.rZb)).size()) && (this.spn >= 0))
    {
      ab.i(TAG, "help LogStory: onItemSelected " + this.spt);
      localObject2 = ((com.tencent.mm.plugin.story.model.d.g)((ArrayList)this.spr.get(this.rZb)).get(this.spn)).rVZ;
      localObject3 = n.sqi;
      n.e((List)this.spr, this.rZb, this.spn);
      n.sqi.f((i)localObject2);
    }
    localObject2 = this.sph;
    if (localObject2 != null)
      ((StoryGalleryItemView)localObject2).cCI();
    if (this.spd)
    {
      localObject2 = this.soY;
      if (localObject2 != null)
        ((p)localObject2).cDf();
      setEnabled(true);
      localObject2 = this.sps;
      if (localObject2 != null)
        ((com.tencent.mm.plugin.story.f.h)localObject2).EO(1);
      if ((this.soE != m.a.rQI) && (this.soE != m.a.rQH) && (this.soE != m.a.rQK) && (this.soE != m.a.rQL))
        Fk(1);
      if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
        this.spz.cCF();
      if (this.soE != m.a.rQD)
        break label446;
      localObject2 = ac.a.xWE;
    }
    while (true)
    {
      label381: localObject3 = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(localObject3, "storage()");
      ((com.tencent.mm.kernel.e)localObject3).Ry().set((ac.a)localObject2, Boolean.TRUE);
      this.spg.setVisibility(8);
      if (!paramBoolean2)
        AppMethodBeat.o(110834);
      while (true)
      {
        return;
        localObject2 = this.soY;
        if (localObject2 == null)
          break;
        ((p)localObject2).cDe();
        break;
        label446: if (this.soE != m.a.rQF)
          break label1119;
        localObject2 = ac.a.xWF;
        break label381;
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAv();
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        localObject2 = this.sph;
        if (localObject2 != null)
        {
          localObject2 = ((StoryGalleryItemView)localObject2).getVideoItem();
          if (localObject2 != null)
          {
            localObject2 = ((i)localObject2).username;
            label507: if (!com.tencent.mm.plugin.story.g.h.aaP((String)localObject2))
            {
              localObject2 = com.tencent.mm.plugin.story.g.h.scu;
              com.tencent.mm.plugin.story.g.h.cAs().bK(1L);
              localObject2 = this.sph;
              if (localObject2 == null)
                break label849;
              localObject2 = ((StoryGalleryItemView)localObject2).getVideoItem();
              if (localObject2 == null)
                break label849;
              localObject2 = ((i)localObject2).username;
              if (t.mY((String)localObject2))
              {
                localObject2 = com.tencent.mm.plugin.story.g.h.scu;
                com.tencent.mm.plugin.story.g.h.cAs().bL(1L);
              }
            }
            label558: localObject2 = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.cAs().bO(1L);
            localObject2 = this.sph;
            if (localObject2 == null)
              break label855;
            localObject2 = ((StoryGalleryItemView)localObject2).getVideoItem();
            if (localObject2 == null)
              break label855;
            localObject2 = ((i)localObject2).username;
            label622: if (t.mY((String)localObject2))
            {
              localObject2 = com.tencent.mm.plugin.story.g.h.scu;
              com.tencent.mm.plugin.story.g.h.cAs().bP(1L);
            }
            localObject2 = com.tencent.mm.plugin.story.g.h.scu;
            localObject2 = this.sph;
            if (localObject2 == null)
              break label861;
            localObject2 = ((StoryGalleryItemView)localObject2).getVideoItem();
            if (localObject2 == null)
              break label861;
          }
        }
        label849: label855: label861: for (localObject2 = Long.valueOf(((i)localObject2).rUJ); ; localObject2 = null)
        {
          if (!com.tencent.mm.plugin.story.g.h.aaQ(String.valueOf(localObject2)))
          {
            localObject2 = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.cAs().bM(1L);
            localObject3 = this.sph;
            localObject2 = localObject1;
            if (localObject3 != null)
            {
              localObject3 = ((StoryGalleryItemView)localObject3).getVideoItem();
              localObject2 = localObject1;
              if (localObject3 != null)
                localObject2 = ((i)localObject3).username;
            }
            if (t.mY((String)localObject2))
            {
              localObject2 = com.tencent.mm.plugin.story.g.h.scu;
              com.tencent.mm.plugin.story.g.h.cAs().bN(1L);
            }
          }
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAs().bQ(1L);
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAs().bI(System.currentTimeMillis());
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAl();
          if ((this.spr.size() != 1) || (((ArrayList)this.spr.get(0)).size() != 0))
            break label867;
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAu();
          AppMethodBeat.o(110834);
          break;
          localObject2 = null;
          break label507;
          localObject2 = null;
          break label558;
          localObject2 = null;
          break label622;
        }
        label867: if ((this.spr.size() <= this.rZb) || (this.rZb < 0) || (this.spn < 0) || (((ArrayList)this.spr.get(this.rZb)).size() <= this.spn))
        {
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAu();
          AppMethodBeat.o(110834);
        }
        else
        {
          cCL();
          lL(true);
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          localObject1 = com.tencent.mm.plugin.story.g.h.cAG();
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          ((au)localObject1).cg(com.tencent.mm.plugin.story.g.h.cAs().FH());
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          localObject2 = com.tencent.mm.plugin.story.g.h.cAG();
          localObject1 = com.tencent.mm.plugin.story.g.h.scu;
          ((au)localObject2).ce(com.tencent.mm.plugin.story.g.h.cAs().FF());
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          localObject1 = com.tencent.mm.plugin.story.g.h.cAG();
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          ((au)localObject1).cf(com.tencent.mm.plugin.story.g.h.cAs().FG());
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAG().fF(((com.tencent.mm.plugin.story.model.d.g)((ArrayList)this.spr.get(this.rZb)).get(this.spn)).userName);
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAG().fG(String.valueOf(((com.tencent.mm.plugin.story.model.d.g)((ArrayList)this.spr.get(this.rZb)).get(this.spn)).rUJ));
          localObject2 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAH();
          AppMethodBeat.o(110834);
        }
      }
      label1119: localObject2 = null;
    }
  }

  public final void Pb()
  {
    AppMethodBeat.i(110840);
    com.tencent.mm.plugin.story.f.h localh = this.sps;
    if (localh != null)
      localh.czC();
    reset();
    AppMethodBeat.o(110840);
  }

  public final void a(PullDownListView paramPullDownListView)
  {
    AppMethodBeat.i(110827);
    this.spf = ((View)paramPullDownListView);
    this.spw = new c();
    c localc = this.spw;
    if (localc != null)
      localc.snE = ((View)this);
    localc = this.spw;
    if (localc != null)
      localc.snD = paramPullDownListView;
    paramPullDownListView = this.spw;
    if (paramPullDownListView != null)
    {
      this.shf.a((e)paramPullDownListView);
      AppMethodBeat.o(110827);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110827);
    }
  }

  public final boolean canScrollHorizontally(int paramInt)
  {
    return this.spt;
  }

  public final void cwK()
  {
    AppMethodBeat.i(110836);
    cCJ();
    if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
      this.spz.cCE();
    com.tencent.mm.plugin.story.f.h localh = this.sps;
    if (localh != null)
    {
      localh.czE();
      AppMethodBeat.o(110836);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110836);
    }
  }

  public final void cwL()
  {
    AppMethodBeat.i(110837);
    if ((this.spr.size() == 1) && (((ArrayList)this.spr.get(0)).isEmpty()))
      cCJ();
    while (true)
    {
      if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
      {
        GalleryHolderView localGalleryHolderView = this.spz;
        localObject = new AnimatorSet();
        ((AnimatorSet)localObject).playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(localGalleryHolderView.iDT, "alpha", new float[] { localGalleryHolderView.iDT.getAlpha(), localGalleryHolderView.snN }), (Animator)ObjectAnimator.ofFloat(localGalleryHolderView.snI, "alpha", new float[] { localGalleryHolderView.snI.getAlpha(), 0.0F }) });
        ((AnimatorSet)localObject).setDuration(100L);
        ((AnimatorSet)localObject).start();
      }
      AppMethodBeat.o(110837);
      return;
      ab.d(TAG, "fadeInMaskView");
      Object localObject = ObjectAnimator.ofFloat(this.iVh, "alpha", new float[] { 0.0F, 1.0F });
      ((ObjectAnimator)localObject).addListener((Animator.AnimatorListener)new l.e(this));
      ((ObjectAnimator)localObject).start();
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(110823);
    a.f.b.j.p(paramMotionEvent, "ev");
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    boolean bool3;
    if (this.spt)
    {
      localObject1 = this.spA;
      if (((g)localObject1).soj)
      {
        localObject2 = com.tencent.mm.kernel.g.RP();
        a.f.b.j.o(localObject2, "storage()");
        ((com.tencent.mm.kernel.e)localObject2).Ry().set(ac.a.xWC, Boolean.TRUE);
        ((g)localObject1).cCG();
      }
      switch (paramMotionEvent.getActionMasked())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      while (true)
      {
        this.shf.J(paramMotionEvent);
        i = this.shf.sod;
        if ((this.shi) || (this.shh))
          break label346;
        if ((this.rZb >= 0) && (this.rZb < this.spr.size()))
          break;
        j = 0;
        if ((j & i) != 0)
          break label346;
        bool3 = this.shf.dispatchTouchEvent(paramMotionEvent);
        label177: if ((!this.shi) && (!bool3))
          break label399;
        if (!this.shj)
        {
          paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
          a.f.b.j.o(paramMotionEvent, "cancelEvent");
          paramMotionEvent.setAction(3);
          super.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.recycle();
          this.shj = true;
        }
        AppMethodBeat.o(110823);
        bool3 = bool1;
        label237: return bool3;
        this.shj = false;
        this.shi = false;
      }
      if (this.spo <= 0.0F)
        break label497;
    }
    label346: label497: for (int k = 2; ; k = 0)
    {
      j = k;
      if (this.spo < this.spr.size() - 1)
        j = k | 0x1;
      if (this.spn > 0);
      for (k = j | 0x8; ; k = j)
      {
        j = k;
        if (this.spn >= ((ArrayList)this.spr.get(this.rZb)).size() - 1)
          break;
        j = k | 0x4;
        break;
        if (!this.shj)
        {
          localObject2 = MotionEvent.obtain(paramMotionEvent);
          a.f.b.j.o(localObject2, "cancelEvent");
          ((MotionEvent)localObject2).setAction(3);
          this.shf.dispatchTouchEvent((MotionEvent)localObject2);
          ((MotionEvent)localObject2).recycle();
          this.shj = true;
        }
        bool3 = false;
        break label177;
        if (!this.shh)
        {
          localObject2 = this.spq.getLayoutManager();
          localObject1 = f.soh;
          if (((i & 0x4) == 0) && ((i & 0x8) == 0))
            break label472;
        }
        for (j = 1; ; j = 0)
        {
          bool3 = bool2;
          if (j == 0)
            bool3 = true;
          ((com.tencent.mm.plugin.story.ui.b.b)localObject2).shc = bool3;
          bool3 = super.dispatchTouchEvent(paramMotionEvent);
          AppMethodBeat.o(110823);
          break;
        }
        AppMethodBeat.o(110823);
        bool3 = false;
        break label237;
      }
    }
  }

  public final String getChatRoom()
  {
    return this.gpx;
  }

  public final boolean getDeleteWhenFirstEmpty()
  {
    return this.spe;
  }

  public final int getExpectPos()
  {
    return this.rZE;
  }

  public final m.a getGalleryType()
  {
    return this.soE;
  }

  public final String getSessionId()
  {
    return this.cvF;
  }

  public final boolean getVideoViewMgrFromPreLoad()
  {
    return this.spd;
  }

  public final void lr(boolean paramBoolean)
  {
    AppMethodBeat.i(110835);
    ab.i(TAG, "LogStory: onSwitchImageMode videoViewMgr " + this.soY);
    this.spt = false;
    Object localObject = com.tencent.mm.plugin.story.proxy.c.saU;
    c.a.czN().czM();
    if ((this.spF) && (this.czr))
    {
      localObject = this.sps;
      if (localObject != null)
        ((com.tencent.mm.plugin.story.f.h)localObject).czC();
    }
    localObject = this.sph;
    if (localObject != null)
    {
      ((StoryGalleryItemView)localObject).sfS.oE(2);
      ((StoryGalleryItemView)localObject).sfS.hide();
    }
    localObject = this.soY;
    if (localObject != null)
      ((p)localObject).N(true, paramBoolean);
    setEnabled(false);
    localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).EO(0);
    if ((this.soE == m.a.rQD) && (this.spz.getVisibility() == 0))
    {
      localObject = this.spz;
      ((GalleryHolderView)localObject).snI.setVisibility(4);
      ((GalleryHolderView)localObject).iDT.setVisibility(0);
    }
    lL(false);
    AppMethodBeat.o(110835);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110832);
    ab.i(TAG, "LogStory, onDestroy " + hashCode() + " galleryType:" + this.soE + " videoViewMgr " + this.soY);
    Object localObject = com.tencent.mm.plugin.story.model.c.rSd;
    com.tencent.mm.plugin.story.model.c.b(this);
    db();
    localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).destroy();
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    com.tencent.mm.plugin.story.f.l.czJ();
    localObject = this.sph;
    if (localObject != null)
    {
      localObject = ((StoryGalleryItemView)localObject).getCommentView();
      if (localObject != null)
        ((StoryCommentView)localObject).destroy();
    }
    localObject = this.soY;
    if (localObject != null)
      ((p)localObject).aEX();
    localObject = n.sqi;
    n.cCO();
    localObject = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cya().rXL = null;
    localObject = n.sqi;
    int i = n.cCR();
    ab.i(TAG, "onDestroy speed " + i + ' ');
    localObject = com.tencent.mm.plugin.story.g.b.sbw;
    com.tencent.mm.plugin.story.g.b.EW(i);
    this.spA.destroy();
    AppMethodBeat.o(110832);
  }

  public final void onPause()
  {
    AppMethodBeat.i(110830);
    ab.i(TAG, "LogStory: onPause " + hashCode() + " galleryType:" + this.soE + " videoViewMgr " + this.soY);
    this.dirty = true;
    Object localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).pause();
    localObject = this.soY;
    if (localObject != null)
      ((p)localObject).akV();
    localObject = this.sph;
    if ((localObject != null) && (((StoryGalleryItemView)localObject).getCommentView() != null))
      StoryCommentView.pause();
    localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.EX(11);
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.cyZ();
    reset();
    AppMethodBeat.o(110830);
  }

  public final void onResume()
  {
    AppMethodBeat.i(110828);
    ab.i(TAG, "LogStory: onResume " + hashCode() + ", galleryType:" + this.soE + " videoViewMgr " + this.soY);
    this.dirty = true;
    cCK();
    Object localObject = this.sps;
    if (localObject != null)
      ((com.tencent.mm.plugin.story.f.h)localObject).resume();
    localObject = this.soY;
    if (localObject != null)
      ((p)localObject).akW();
    localObject = this.sph;
    if ((localObject != null) && (((StoryGalleryItemView)localObject).getCommentView() != null))
      StoryCommentView.resume();
    localObject = com.tencent.mm.plugin.story.g.c.sbQ;
    com.tencent.mm.plugin.story.g.c.czR();
    localObject = com.tencent.mm.plugin.story.g.b.sbw;
    com.tencent.mm.plugin.story.g.b.czR();
    if (this.spt)
    {
      localObject = this.sph;
      if (localObject != null)
      {
        ((StoryGalleryItemView)localObject).cCI();
        AppMethodBeat.o(110828);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110828);
    }
  }

  public final void onStart()
  {
    AppMethodBeat.i(110829);
    ab.i(TAG, "LogStory, onStart " + hashCode() + " galleryType:" + this.soE);
    AppMethodBeat.o(110829);
  }

  public final void onStop()
  {
    AppMethodBeat.i(110831);
    ab.i(TAG, "LogStory, onStop:" + hashCode());
    AppMethodBeat.o(110831);
  }

  public final void setCanDragScale(boolean paramBoolean)
  {
    this.spv = paramBoolean;
  }

  public final void setChatRoom(String paramString)
  {
    AppMethodBeat.i(110820);
    this.gpx = paramString;
    this.spx.setChatRoom(paramString);
    AppMethodBeat.o(110820);
  }

  public final void setCurrentHItem(int paramInt)
  {
    AppMethodBeat.i(110839);
    if ((this.rZb != -1) && (this.rZb < this.spr.size()) && (paramInt < ((ArrayList)this.spr.get(this.rZb)).size()))
    {
      RecyclerView localRecyclerView = this.spi;
      if (localRecyclerView != null)
      {
        localRecyclerView.post((Runnable)new l.n(this, paramInt));
        AppMethodBeat.o(110839);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110839);
    }
  }

  public final void setCurrentVItem(final int paramInt)
  {
    AppMethodBeat.i(110838);
    if (paramInt < this.spr.size())
    {
      ab.d(TAG, "setCurrentVItem " + paramInt + ", all:" + this.spr.size());
      GalleryRecyclerView localGalleryRecyclerView = this.spq;
      if (localGalleryRecyclerView != null)
      {
        localGalleryRecyclerView.post((Runnable)new o(this, paramInt));
        AppMethodBeat.o(110838);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110838);
    }
  }

  public final void setDataSeed(Object paramObject)
  {
    AppMethodBeat.i(110825);
    if ((paramObject instanceof String))
    {
      localObject = com.tencent.mm.plugin.story.model.j.rST;
      if (a.f.b.j.j(j.a.cnk(), paramObject));
    }
    else
    {
      if ((this.soE != m.a.rQI) && (this.soE != m.a.rQK))
        break label125;
    }
    boolean bool = true;
    this.czr = bool;
    Object localObject = this.gpx;
    if ((localObject != null) && ((paramObject instanceof ArrayList)) && (((ArrayList)paramObject).isEmpty()))
    {
      ab.i(TAG, "setDataSeed: chat room empty user list, fetch again");
      paramObject = new com.tencent.mm.plugin.story.model.f.d((String)localObject);
      paramObject.rXb = ((k.a)new l.p(this, paramObject));
      paramObject.start();
      AppMethodBeat.o(110825);
    }
    while (true)
    {
      return;
      label125: bool = false;
      break;
      setDataInternal(paramObject);
      AppMethodBeat.o(110825);
    }
  }

  public final void setDeleteWhenFirstEmpty(boolean paramBoolean)
  {
    this.spe = paramBoolean;
  }

  public final void setFirstPost(boolean paramBoolean)
  {
    this.spG = paramBoolean;
  }

  public final void setForSns(boolean paramBoolean)
  {
    this.rZI = paramBoolean;
  }

  public final void setGalleryScaleListener(l.b paramb)
  {
    AppMethodBeat.i(110821);
    a.f.b.j.p(paramb, "listener");
    this.soz = paramb;
    if ((this.soE == m.a.rQH) || (this.soE == m.a.rQI) || (this.soE == m.a.rQK) || (this.soE == m.a.rQL))
    {
      d locald = new d();
      locald.seu = ((l)this);
      this.shf.a((e)locald);
    }
    paramb = new h((View)this, paramb);
    this.shf.a((e)paramb);
    AppMethodBeat.o(110821);
  }

  public final void setNeedReset(boolean paramBoolean)
  {
    this.spF = paramBoolean;
  }

  public final void setSessionId(String paramString)
  {
    this.cvF = paramString;
  }

  public final void setStoryBrowseUIListener(com.tencent.mm.plugin.story.api.g paramg)
  {
    if (paramg != null)
      this.spu = paramg;
  }

  public final void setVideoViewMgrFromPreLoad(boolean paramBoolean)
  {
    this.spd = paramBoolean;
  }

  public final boolean wY()
  {
    boolean bool1 = false;
    AppMethodBeat.i(110833);
    Object localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.EX(10);
    localObject = this.sph;
    if (localObject != null)
    {
      localObject = ((StoryGalleryItemView)localObject).getCommentView();
      if (localObject == null);
    }
    for (boolean bool2 = ((StoryCommentView)localObject).Ab(); ; bool2 = false)
    {
      ab.d(TAG, "onBackPressed commentView result:".concat(String.valueOf(bool2)));
      boolean bool3 = bool2;
      if (!bool2)
      {
        bool3 = bool2;
        if (this.spt)
        {
          localObject = this.spu;
          if (localObject != null)
            ((com.tencent.mm.plugin.story.api.g)localObject).caC();
          if (!bool2)
          {
            bool2 = bool1;
            if (!this.spt);
          }
          else
          {
            bool2 = true;
          }
          bool3 = bool2;
        }
      }
      ab.d(TAG, "onBackPressed result:".concat(String.valueOf(bool3)));
      AppMethodBeat.o(110833);
      return bool3;
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class o
    implements Runnable
  {
    o(l paraml, int paramInt)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(110818);
      l.d(this.spK).bY(paramInt);
      AppMethodBeat.o(110818);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l
 * JD-Core Version:    0.6.2
 */