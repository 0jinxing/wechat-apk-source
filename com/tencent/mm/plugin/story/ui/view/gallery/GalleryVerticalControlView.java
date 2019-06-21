package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import a.v;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.ui.a.b;
import com.tencent.mm.plugin.story.ui.a.c;
import com.tencent.mm.plugin.story.ui.a.d;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allFavBtn", "Landroid/widget/ImageView;", "avatarRecycler", "Landroid/support/v7/widget/RecyclerView;", "value", "", "chatRoom", "getChatRoom", "()Ljava/lang/String;", "setChatRoom", "(Ljava/lang/String;)V", "closeView", "dataAdapter", "Lcom/tencent/mm/plugin/story/ui/adapter/GalleryHeaderAdapter;", "dataLayoutManager", "Lcom/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager;", "galleryType", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "menuBtn", "onAllFav", "Lkotlin/Function0;", "", "getOnAllFav", "()Lkotlin/jvm/functions/Function0;", "setOnAllFav", "(Lkotlin/jvm/functions/Function0;)V", "onClose", "getOnClose", "setOnClose", "onMenu", "getOnMenu", "setOnMenu", "privacyIcon", "snsIcon", "initWithGalleryType", "needAction", "", "relayoutDateRecyclerView", "relayoutProfileRecyclerView", "relayoutSelfFavBtn", "removeUser", "userIndex", "setScrollOffset", "position", "offset", "", "setShowClose", "setUserList", "userList", "", "showFavoriteIcon", "isShow", "showPrivacyIcon", "showSnsIcon", "toggleActiveState", "active", "Companion", "plugin-story_release"})
public final class GalleryVerticalControlView extends RelativeLayout
{
  private static final String TAG = "MicroMsg.GalleryVerticalControlView";
  public static final GalleryVerticalControlView.a soK;
  private String gpx;
  private final ImageView qzh;
  final ImageView sif;
  private final ImageView snq;
  final ImageView soB;
  final RecyclerView soC;
  private final ImageView soD;
  m.a soE;
  d<?> soF;
  com.tencent.mm.plugin.story.ui.b.a soG;
  private a.f.a.a<y> soH;
  private a.f.a.a<y> soI;
  private a.f.a.a<y> soJ;

  static
  {
    AppMethodBeat.i(110759);
    soK = new GalleryVerticalControlView.a((byte)0);
    TAG = "MicroMsg.GalleryVerticalControlView";
    AppMethodBeat.o(110759);
  }

  public GalleryVerticalControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110758);
    AppMethodBeat.o(110758);
  }

  public GalleryVerticalControlView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110757);
    View.inflate(paramContext, 2130970904, (ViewGroup)this);
    paramAttributeSet = findViewById(2131828198);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_close)");
    this.sif = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828202);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_privacy)");
    this.snq = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828201);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_avatar_recycler)");
    this.soC = ((RecyclerView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828199);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_menu)");
    this.qzh = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828203);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_sns)");
    this.soB = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828200);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_all_fav)");
    this.soD = ((ImageView)paramAttributeSet);
    this.soC.setItemAnimator(null);
    this.qzh.setImageDrawable(ah.f(paramContext, 2131231421, -1));
    this.soD.setImageDrawable(ah.f(paramContext, 2131231410, -1));
    this.sif.setOnClickListener((View.OnClickListener)new GalleryVerticalControlView.1(this));
    this.qzh.setOnClickListener((View.OnClickListener)new GalleryVerticalControlView.2(this));
    this.soD.setOnClickListener((View.OnClickListener)new GalleryVerticalControlView.3(this));
    AppMethodBeat.o(110757);
  }

  private final void cCH()
  {
    AppMethodBeat.i(138937);
    Object localObject = this.soC.getLayoutParams();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
      AppMethodBeat.o(138937);
      throw ((Throwable)localObject);
    }
    localObject = (RelativeLayout.LayoutParams)localObject;
    ((RelativeLayout.LayoutParams)localObject).height = com.tencent.mm.bz.a.fromDPToPix(getContext(), 96);
    ((RelativeLayout.LayoutParams)localObject).setMarginStart(0);
    ((RelativeLayout.LayoutParams)localObject).setMarginEnd(0);
    ((RelativeLayout.LayoutParams)localObject).removeRule(17);
    ((RelativeLayout.LayoutParams)localObject).removeRule(21);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    AppMethodBeat.o(138937);
  }

  public final void a(m.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(138938);
    j.p(parama, "galleryType");
    this.soE = parama;
    switch (i.eQZ[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.soC.setLayoutManager((RecyclerView.i)this.soG);
      this.soC.setAdapter((RecyclerView.a)this.soF);
      this.soC.setFocusable(false);
      AppMethodBeat.o(138938);
      return;
      this.soF = ((d)new b());
      parama = getContext();
      j.o(parama, "context");
      this.soG = new com.tencent.mm.plugin.story.ui.b.a(parama);
      this.qzh.setVisibility(8);
      parama = this.soC.getLayoutParams();
      if (parama == null)
      {
        parama = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        AppMethodBeat.o(138938);
        throw parama;
      }
      parama = (RelativeLayout.LayoutParams)parama;
      parama.setMarginStart(com.tencent.mm.bz.a.fromDPToPix(getContext(), 64));
      parama.setMarginEnd(com.tencent.mm.bz.a.fromDPToPix(getContext(), 20));
      parama.addRule(17, this.sif.getId());
      parama.addRule(21);
      continue;
      this.soF = ((d)new c());
      parama = getContext();
      j.o(parama, "context");
      this.soG = new com.tencent.mm.plugin.story.ui.b.a(parama);
      this.qzh.setVisibility(8);
      if (paramBoolean)
        this.soD.setVisibility(0);
      while (true)
      {
        cCH();
        break;
        this.soD.setVisibility(8);
      }
      this.soF = ((d)new c());
      parama = getContext();
      j.o(parama, "context");
      this.soG = new com.tencent.mm.plugin.story.ui.b.a(parama);
      this.qzh.bringToFront();
      if (paramBoolean)
        this.soD.setVisibility(0);
      while (true)
      {
        parama = this.soD.getLayoutParams();
        if (parama != null)
          break;
        parama = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        AppMethodBeat.o(138938);
        throw parama;
        this.soD.setVisibility(8);
      }
      parama = (RelativeLayout.LayoutParams)parama;
      parama.removeRule(21);
      parama.addRule(16, this.qzh.getId());
      parama.setMarginEnd(com.tencent.mm.bz.a.fromDPToPix(getContext(), 4));
      cCH();
      continue;
      this.soF = ((d)new c());
      parama = getContext();
      j.o(parama, "context");
      this.soG = new com.tencent.mm.plugin.story.ui.b.a(parama);
      this.qzh.bringToFront();
      cCH();
      continue;
      this.qzh.setVisibility(8);
    }
  }

  public final String getChatRoom()
  {
    return this.gpx;
  }

  public final a.f.a.a<y> getOnAllFav()
  {
    return this.soJ;
  }

  public final a.f.a.a<y> getOnClose()
  {
    return this.soH;
  }

  public final a.f.a.a<y> getOnMenu()
  {
    return this.soI;
  }

  public final void lL(boolean paramBoolean)
  {
    AppMethodBeat.i(138940);
    if (paramBoolean)
    {
      setVisibility(0);
      AppMethodBeat.o(138940);
    }
    while (true)
    {
      return;
      setVisibility(8);
      AppMethodBeat.o(138940);
    }
  }

  public final void lT(boolean paramBoolean)
  {
    AppMethodBeat.i(110755);
    if (paramBoolean)
    {
      this.snq.setVisibility(0);
      this.snq.setImageDrawable(ah.f(getContext(), 2131231417, getResources().getColor(2131690543)));
      AppMethodBeat.o(110755);
    }
    while (true)
    {
      return;
      this.snq.setVisibility(8);
      AppMethodBeat.o(110755);
    }
  }

  public final void lU(boolean paramBoolean)
  {
    AppMethodBeat.i(110756);
    if ((paramBoolean) && (com.tencent.mm.plugin.story.c.a.a.rQZ.cwU()))
    {
      this.snq.setVisibility(0);
      this.snq.setImageDrawable(ah.f(getContext(), 2131231432, getResources().getColor(2131690543)));
      AppMethodBeat.o(110756);
    }
    while (true)
    {
      return;
      this.snq.setVisibility(8);
      AppMethodBeat.o(110756);
    }
  }

  public final void setChatRoom(String paramString)
  {
    this.gpx = paramString;
    d locald = this.soF;
    Object localObject = locald;
    if (!(locald instanceof b))
      localObject = null;
    localObject = (b)localObject;
    if (localObject != null)
      ((b)localObject).gpx = paramString;
  }

  public final void setOnAllFav(a.f.a.a<y> parama)
  {
    this.soJ = parama;
  }

  public final void setOnClose(a.f.a.a<y> parama)
  {
    this.soH = parama;
  }

  public final void setOnMenu(a.f.a.a<y> parama)
  {
    this.soI = parama;
  }

  public final void setUserList(List<String> paramList)
  {
    AppMethodBeat.i(110754);
    j.p(paramList, "userList");
    d locald = this.soF;
    if (locald != null)
    {
      j.p(paramList, "users");
      locald.iLD.clear();
      locald.iLD.add("");
      locald.iLD.addAll((Collection)paramList);
      locald.iLD.add("");
    }
    paramList = this.soF;
    if (paramList != null)
    {
      paramList.notifyDataSetChanged();
      AppMethodBeat.o(110754);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView
 * JD-Core Version:    0.6.2
 */