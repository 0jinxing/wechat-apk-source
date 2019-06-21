package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.AbsStoryPreference;
import com.tencent.mm.plugin.story.api.o;
import com.tencent.mm.plugin.story.api.o.b;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.ui.StoryBrowseUI;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryPreference;", "Lcom/tencent/mm/plugin/story/api/AbsStoryPreference;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCallback", "Lcom/tencent/mm/plugin/story/api/ILoadFavStoryCallback;", "mCoverView", "Landroid/view/View;", "mStoryFavList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lkotlin/collections/ArrayList;", "mStoryIconView1", "Landroid/widget/ImageView;", "mStoryIconView2", "mStoryIconView3", "mStoryView1", "Lcom/tencent/mm/plugin/story/ui/view/StoryRoundImageView;", "mStoryView2", "mStoryView3", "mStoryViewGroup1", "Landroid/view/ViewGroup;", "mStoryViewGroup2", "mStoryViewGroup3", "mTitleView", "Landroid/widget/TextView;", "mUsername", "", "mView", "getDateList", "", "goFavGallery", "", "position", "handleEvent", "loadStory", "onBindView", "view", "onCreate", "username", "onCreateView", "parent", "onDestroy", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "setLoadCallback", "callback", "updateFavStory", "plugin-story_release"})
public final class StoryPreference extends AbsStoryPreference
  implements f
{
  private TextView TF;
  private String igi;
  private View mView;
  private View omq;
  private StoryRoundImageView ska;
  private StoryRoundImageView skb;
  private StoryRoundImageView skc;
  private ImageView skd;
  private ImageView ske;
  private ImageView skf;
  private ViewGroup skg;
  private ViewGroup skh;
  private ViewGroup ski;
  private ArrayList<com.tencent.mm.plugin.story.h.j> skj;
  private com.tencent.mm.plugin.story.api.d skk;

  public StoryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110463);
    AppMethodBeat.o(110463);
  }

  public StoryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110464);
    paramContext = View.inflate(getContext(), 2130970899, null);
    a.f.b.j.o(paramContext, "View.inflate(context, R.…e_fav_panel_layout, null)");
    this.mView = paramContext;
    this.skj = new ArrayList();
    this.igi = "";
    paramContext = this.mView.findViewById(2131828179);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.mm_preference_story_title)");
    this.TF = ((TextView)paramContext);
    paramContext = this.mView.findViewById(2131828181);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…eference_story_image_iv1)");
    this.ska = ((StoryRoundImageView)paramContext);
    paramContext = this.mView.findViewById(2131828184);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…eference_story_image_iv2)");
    this.skb = ((StoryRoundImageView)paramContext);
    paramContext = this.mView.findViewById(2131828187);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…eference_story_image_iv3)");
    this.skc = ((StoryRoundImageView)paramContext);
    paramContext = this.mView.findViewById(2131828182);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…erence_story_image_icon1)");
    this.skd = ((ImageView)paramContext);
    paramContext = this.mView.findViewById(2131828185);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…erence_story_image_icon2)");
    this.ske = ((ImageView)paramContext);
    paramContext = this.mView.findViewById(2131828188);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…erence_story_image_icon3)");
    this.skf = ((ImageView)paramContext);
    paramContext = this.mView.findViewById(2131828180);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…ce_story_image_iv1_group)");
    this.skg = ((ViewGroup)paramContext);
    paramContext = this.mView.findViewById(2131828183);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…ce_story_image_iv2_group)");
    this.skh = ((ViewGroup)paramContext);
    paramContext = this.mView.findViewById(2131828186);
    a.f.b.j.o(paramContext, "mView.findViewById(R.id.…ce_story_image_iv3_group)");
    this.ski = ((ViewGroup)paramContext);
    paramInt = com.tencent.mm.bz.a.fromDPToPix(getContext(), 8);
    this.ska.setRound(paramInt);
    this.skb.setRound(paramInt);
    this.skc.setRound(paramInt);
    paramContext = ah.f(getContext(), 2131231426, -1);
    this.skd.setImageDrawable(paramContext);
    this.ske.setImageDrawable(paramContext);
    this.skf.setImageDrawable(paramContext);
    this.ska.setOnClickListener((View.OnClickListener)new StoryPreference.1(this));
    this.skb.setOnClickListener((View.OnClickListener)new StoryPreference.2(this));
    this.skc.setOnClickListener((View.OnClickListener)new StoryPreference.3(this));
    AppMethodBeat.o(110464);
  }

  private final void Fi(int paramInt)
  {
    AppMethodBeat.i(110454);
    Object localObject = new ArrayList();
    Iterator localIterator = ((Iterable)this.skj).iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.story.h.j localj = (com.tencent.mm.plugin.story.h.j)localIterator.next();
      b.a locala = com.tencent.mm.plugin.story.e.b.rRO;
      ((ArrayList)localObject).add(b.a.j(Integer.valueOf(localj.field_createTime)));
    }
    localObject = (List)localObject;
    long l = o.rQN.i((List)localObject, this.igi);
    localObject = new Intent(getContext(), StoryBrowseUI.class);
    ((Intent)localObject).putExtra("username", this.igi);
    ((Intent)localObject).putExtra("data_seed_key", l);
    ((Intent)localObject).putExtra("v_position", paramInt);
    ((Intent)localObject).putExtra("gallery_story_need_action", true);
    getContext().startActivity((Intent)localObject);
    localObject = h.scu;
    h.cAs().bG(14L);
    AppMethodBeat.o(110454);
  }

  public final void a(com.tencent.mm.plugin.story.api.d paramd)
  {
    this.skk = paramd;
  }

  public final void cwO()
  {
    AppMethodBeat.i(110456);
    Object localObject1 = n.rTi;
    localObject1 = this.igi;
    a.f.b.j.p(localObject1, "username");
    Object localObject2 = g.RO();
    a.f.b.j.o(localObject2, "MMKernel.network()");
    localObject2 = ((com.tencent.mm.kernel.b)localObject2).Rg();
    Object localObject3 = com.tencent.mm.plugin.story.model.j.rST;
    boolean bool = bo.isEqual((String)localObject1, j.a.cnk());
    localObject3 = com.tencent.mm.plugin.story.h.a.sdm;
    ((p)localObject2).d((m)new com.tencent.mm.plugin.story.model.a.j((String)localObject1, 0L, bool, "", com.tencent.mm.plugin.story.h.a.cBs()));
    AppMethodBeat.o(110456);
  }

  public final void cwP()
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(110457);
    Object localObject1 = this.TF;
    Object localObject2 = getContext();
    a.f.b.j.o(localObject2, "context");
    ((TextView)localObject1).setText((CharSequence)((Context)localObject2).getResources().getString(2131305863));
    localObject2 = this.TF.getLayoutParams();
    if (localObject2 != null)
      ((ViewGroup.LayoutParams)localObject2).width = com.tencent.mm.bz.a.al(getContext(), 2131427668);
    this.TF.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    this.skj.clear();
    localObject2 = this.skj;
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    Object localObject3 = j.a.cxT();
    String str = this.igi;
    Object localObject4 = this.igi;
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    ((ArrayList)localObject2).addAll((Collection)((k)localObject3).a(str, bo.isEqual((String)localObject4, j.a.cnk()), 0L, 3));
    this.TF.setVisibility(8);
    this.skg.setVisibility(8);
    this.skh.setVisibility(8);
    this.ski.setVisibility(8);
    if (this.skj.size() == 1)
    {
      this.TF.setVisibility(0);
      this.skg.setVisibility(0);
      localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).cBR().xeA;
      if (localObject1 != null)
      {
        localObject2 = ((cea)localObject1).wbK;
        a.f.b.j.o(localObject2, "obj.MediaObjList");
        if (((Collection)localObject2).isEmpty())
          break label409;
        if (j != 0)
        {
          localObject2 = com.tencent.mm.plugin.story.model.j.rST;
          localObject2 = j.a.cyc();
          localObject1 = ((cea)localObject1).wbK.get(0);
          a.f.b.j.o(localObject1, "obj.MediaObjList[0]");
          localObject4 = (cek)localObject1;
          localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
          localObject3 = az.xYY;
          a.f.b.j.o(localObject3, "FROM_SCENE.storyalbum");
          localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject4, (String)localObject1, (az)localObject3);
          localObject3 = this.ska;
          if (localObject3 == null)
            a.f.b.j.dWJ();
          localObject4 = (ImageView)localObject3;
          localObject3 = com.tencent.mm.plugin.story.model.j.rST;
          ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject4, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
        }
      }
      label377: localObject2 = this.skk;
      if (localObject2 == null)
        break label1362;
      ((com.tencent.mm.plugin.story.api.d)localObject2).cA((List)this.skj);
      AppMethodBeat.o(110457);
    }
    while (true)
    {
      return;
      label409: j = 0;
      break;
      if (this.skj.size() == 2)
      {
        this.TF.setVisibility(0);
        this.skg.setVisibility(0);
        this.skh.setVisibility(0);
        localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).cBR().xeA;
        if (localObject1 != null)
        {
          localObject2 = ((cea)localObject1).wbK;
          a.f.b.j.o(localObject2, "obj1.MediaObjList");
          if (((Collection)localObject2).isEmpty())
            break label787;
          j = 1;
          label500: if (j != 0)
          {
            localObject2 = com.tencent.mm.plugin.story.model.j.rST;
            localObject2 = j.a.cyc();
            localObject1 = ((cea)localObject1).wbK.get(0);
            a.f.b.j.o(localObject1, "obj1.MediaObjList[0]");
            localObject3 = (cek)localObject1;
            localObject4 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
            localObject1 = az.xYY;
            a.f.b.j.o(localObject1, "FROM_SCENE.storyalbum");
            localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject3, (String)localObject4, (az)localObject1);
            localObject3 = this.ska;
            if (localObject3 == null)
              a.f.b.j.dWJ();
            localObject3 = (ImageView)localObject3;
            localObject4 = com.tencent.mm.plugin.story.model.j.rST;
            ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject3, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
          }
        }
        localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(1)).cBR().xeA;
        if (localObject1 == null)
          break label377;
        localObject2 = ((cea)localObject1).wbK;
        a.f.b.j.o(localObject2, "obj2.MediaObjList");
        if (!((Collection)localObject2).isEmpty());
        for (j = i; ; j = 0)
        {
          if (j == 0)
            break label795;
          localObject2 = com.tencent.mm.plugin.story.model.j.rST;
          localObject2 = j.a.cyc();
          localObject1 = ((cea)localObject1).wbK.get(0);
          a.f.b.j.o(localObject1, "obj2.MediaObjList[0]");
          localObject4 = (cek)localObject1;
          localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
          localObject3 = az.xYY;
          a.f.b.j.o(localObject3, "FROM_SCENE.storyalbum");
          localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject4, (String)localObject1, (az)localObject3);
          localObject3 = this.skb;
          if (localObject3 == null)
            a.f.b.j.dWJ();
          localObject4 = (ImageView)localObject3;
          localObject3 = com.tencent.mm.plugin.story.model.j.rST;
          ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject4, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
          break;
          label787: j = 0;
          break label500;
        }
        label795: break label377;
      }
      if (this.skj.size() < 3)
        break label377;
      this.TF.setVisibility(0);
      this.skg.setVisibility(0);
      this.skh.setVisibility(0);
      this.ski.setVisibility(0);
      localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).cBR().xeA;
      if (localObject1 != null)
      {
        localObject2 = ((cea)localObject1).wbK;
        a.f.b.j.o(localObject2, "obj1.MediaObjList");
        if (((Collection)localObject2).isEmpty())
          break label1347;
        j = 1;
        label891: if (j != 0)
        {
          localObject2 = com.tencent.mm.plugin.story.model.j.rST;
          localObject2 = j.a.cyc();
          localObject1 = ((cea)localObject1).wbK.get(0);
          a.f.b.j.o(localObject1, "obj1.MediaObjList[0]");
          localObject1 = (cek)localObject1;
          localObject4 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
          localObject3 = az.xYY;
          a.f.b.j.o(localObject3, "FROM_SCENE.storyalbum");
          localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject1, (String)localObject4, (az)localObject3);
          localObject3 = this.ska;
          if (localObject3 == null)
            a.f.b.j.dWJ();
          localObject3 = (ImageView)localObject3;
          localObject4 = com.tencent.mm.plugin.story.model.j.rST;
          ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject3, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
        }
      }
      localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(1)).cBR().xeA;
      if (localObject1 != null)
      {
        localObject2 = ((cea)localObject1).wbK;
        a.f.b.j.o(localObject2, "obj2.MediaObjList");
        if (((Collection)localObject2).isEmpty())
          break label1352;
        j = 1;
        label1059: if (j != 0)
        {
          localObject2 = com.tencent.mm.plugin.story.model.j.rST;
          localObject2 = j.a.cyc();
          localObject1 = ((cea)localObject1).wbK.get(0);
          a.f.b.j.o(localObject1, "obj2.MediaObjList[0]");
          localObject1 = (cek)localObject1;
          localObject4 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
          localObject3 = az.xYY;
          a.f.b.j.o(localObject3, "FROM_SCENE.storyalbum");
          localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject1, (String)localObject4, (az)localObject3);
          localObject3 = this.skb;
          if (localObject3 == null)
            a.f.b.j.dWJ();
          localObject4 = (ImageView)localObject3;
          localObject3 = com.tencent.mm.plugin.story.model.j.rST;
          ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject4, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
        }
      }
      localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(2)).cBR().xeA;
      if (localObject1 == null)
        break label377;
      localObject2 = ((cea)localObject1).wbK;
      a.f.b.j.o(localObject2, "obj3.MediaObjList");
      if (!((Collection)localObject2).isEmpty());
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label1360;
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        localObject2 = j.a.cyc();
        localObject1 = ((cea)localObject1).wbK.get(0);
        a.f.b.j.o(localObject1, "obj3.MediaObjList[0]");
        localObject3 = (cek)localObject1;
        localObject1 = ((com.tencent.mm.plugin.story.h.j)this.skj.get(0)).field_userName;
        localObject4 = az.xYY;
        a.f.b.j.o(localObject4, "FROM_SCENE.storyalbum");
        localObject1 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject3, (String)localObject1, (az)localObject4);
        localObject3 = this.skc;
        if (localObject3 == null)
          a.f.b.j.dWJ();
        localObject4 = (ImageView)localObject3;
        localObject3 = com.tencent.mm.plugin.story.model.j.rST;
        ((com.tencent.mm.loader.d)localObject2).a(localObject1, (ImageView)localObject4, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVI));
        break;
        label1347: j = 0;
        break label891;
        label1352: j = 0;
        break label1059;
      }
      label1360: break label377;
      label1362: AppMethodBeat.o(110457);
    }
  }

  public final void cwQ()
  {
    AppMethodBeat.i(110458);
    if (!((Collection)this.skj).isEmpty());
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        Fi(0);
      AppMethodBeat.o(110458);
      return;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(110462);
    a.f.b.j.p(paramView, "view");
    super.onBindView(paramView);
    cwP();
    AppMethodBeat.o(110462);
  }

  public final void onCreate(String paramString)
  {
    AppMethodBeat.i(110455);
    String str = paramString;
    if (paramString == null)
      str = "";
    this.igi = str;
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(273, (f)this);
    AppMethodBeat.o(110455);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(110461);
    a.f.b.j.p(paramViewGroup, "parent");
    if (this.omq == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
      Object localObject = localView.findViewById(2131821517);
      if (localObject != null)
        ((View)localObject).setVisibility(8);
      paramViewGroup.removeAllViews();
      this.mView.setId(2131820982);
      localObject = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.mView, (ViewGroup.LayoutParams)localObject);
      this.omq = localView;
    }
    paramViewGroup = this.omq;
    if (paramViewGroup == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(110461);
    return paramViewGroup;
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110459);
    this.skk = null;
    com.tencent.mm.kernel.b localb = g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(273, (f)this);
    AppMethodBeat.o(110459);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(110460);
    if ((paramm instanceof com.tencent.mm.plugin.story.model.a.j))
    {
      paramInt2 = ((com.tencent.mm.plugin.story.model.a.j)paramm).cvd;
      paramString = com.tencent.mm.plugin.story.h.a.sdm;
      if ((paramInt2 == com.tencent.mm.plugin.story.h.a.cBs()) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.j)paramm).userName, this.igi)) && (paramInt1 == 0))
        cwP();
    }
    AppMethodBeat.o(110460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryPreference
 * JD-Core Version:    0.6.2
 */