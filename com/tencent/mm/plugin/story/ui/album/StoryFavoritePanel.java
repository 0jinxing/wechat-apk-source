package com.tencent.mm.plugin.story.ui.album;

import a.f.a.m;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.v;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "VIEW_TYPE_ADD_FAV", "VIEW_TYPE_LOADING", "VIEW_TYPE_NORMAL_FAV", "dp", "", "fromScene", "getFromScene", "()I", "setFromScene", "(I)V", "isSelf", "", "()Z", "setSelf", "(Z)V", "mDatas", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryFavInfo;", "Lkotlin/collections/ArrayList;", "mEmptyTipTv", "Landroid/widget/TextView;", "mFavAdapter", "Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryFavoriteAdapter;", "mFavRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mFavTitleTv", "mIsAll", "getMIsAll", "setMIsAll", "mOnAddItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "storyFavInfo", "", "getMOnAddItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setMOnAddItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "mOnFavItemClickListener", "Lkotlin/Function2;", "position", "getMOnFavItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setMOnFavItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "spanCount", "addOnScrollListener", "listener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "init", "onIsAll", "setup", "showEmptyTip", "tip", "updateFavStory", "favoriteStory", "", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Companion", "StoryAlbumLoadingHolder", "StoryFavInfo", "StoryFavoriteAdapter", "StoryFavoriteAddHolder", "StoryFavoriteNormalHolder", "plugin-story_release"})
public final class StoryFavoritePanel extends RelativeLayout
{
  private static final int sgV = 0;
  private static final int sgW = 1;
  public static final StoryFavoritePanel.a sgX;
  private final String TAG;
  private boolean czr;
  private int fromScene;
  private boolean rFn;
  private final int rUf;
  private final int sgK;
  private final int sgL;
  private TextView sgM;
  private TextView sgN;
  private RecyclerView sgO;
  private d sgP;
  private final ArrayList<StoryFavoritePanel.c> sgQ;
  private final float sgR;
  private final int sgS;
  private m<? super StoryFavoritePanel.c, ? super Integer, y> sgT;
  private a.f.a.b<? super StoryFavoritePanel.c, y> sgU;

  static
  {
    AppMethodBeat.i(138889);
    sgX = new StoryFavoritePanel.a((byte)0);
    sgW = 1;
    AppMethodBeat.o(138889);
  }

  public StoryFavoritePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110207);
    this.TAG = "MicroMsg.StoryFavoritePanel";
    this.sgL = 1;
    this.rUf = 2;
    this.sgP = new d();
    this.sgQ = new ArrayList();
    this.sgR = (com.tencent.mm.bz.a.getDensity(getContext()) * 1.0F);
    this.sgS = 4;
    this.fromScene = sgV;
    init();
    AppMethodBeat.o(110207);
  }

  public StoryFavoritePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110208);
    this.TAG = "MicroMsg.StoryFavoritePanel";
    this.sgL = 1;
    this.rUf = 2;
    this.sgP = new d();
    this.sgQ = new ArrayList();
    this.sgR = (com.tencent.mm.bz.a.getDensity(getContext()) * 1.0F);
    this.sgS = 4;
    this.fromScene = sgV;
    init();
    AppMethodBeat.o(110208);
  }

  private final void init()
  {
    AppMethodBeat.i(110206);
    View.inflate(getContext(), 2130970851, (ViewGroup)this);
    this.sgM = ((TextView)findViewById(2131827993));
    this.sgN = ((TextView)findViewById(2131827994));
    this.sgO = ((RecyclerView)findViewById(2131827995));
    getContext();
    GridLayoutManager localGridLayoutManager = new GridLayoutManager(this.sgS);
    localGridLayoutManager.a((GridLayoutManager.b)new StoryFavoritePanel.g(this));
    RecyclerView localRecyclerView = this.sgO;
    if (localRecyclerView != null)
      localRecyclerView.setLayoutManager((RecyclerView.i)localGridLayoutManager);
    localRecyclerView = this.sgO;
    if (localRecyclerView != null)
      localRecyclerView.setAdapter((RecyclerView.a)this.sgP);
    localRecyclerView = this.sgO;
    if (localRecyclerView != null)
    {
      localRecyclerView.b((RecyclerView.h)new b());
      AppMethodBeat.o(110206);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110206);
    }
  }

  public final void a(RecyclerView.m paramm)
  {
    AppMethodBeat.i(138887);
    a.f.b.j.p(paramm, "listener");
    RecyclerView localRecyclerView = this.sgO;
    if (localRecyclerView != null)
    {
      localRecyclerView.a(paramm);
      AppMethodBeat.o(138887);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138887);
    }
  }

  public final void abd(String paramString)
  {
    AppMethodBeat.i(138886);
    a.f.b.j.p(paramString, "tip");
    Object localObject = this.sgN;
    if (localObject != null)
      ((TextView)localObject).setVisibility(0);
    localObject = this.sgM;
    if (localObject != null)
      ((TextView)localObject).setVisibility(8);
    localObject = this.sgO;
    if (localObject != null)
      ((RecyclerView)localObject).setVisibility(8);
    localObject = this.sgN;
    if (localObject != null)
    {
      ((TextView)localObject).setText((CharSequence)paramString);
      AppMethodBeat.o(138886);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138886);
    }
  }

  public final void cxn()
  {
    AppMethodBeat.i(138888);
    this.rFn = true;
    if (!((Collection)this.sgQ).isEmpty());
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.sgP.notifyDataSetChanged();
      AppMethodBeat.o(138888);
      return;
    }
  }

  public final void g(List<com.tencent.mm.plugin.story.h.j> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(138885);
    a.f.b.j.p(paramList, "favoriteStory");
    ab.i(this.TAG, "updateFavStory " + paramList.size());
    Object localObject = this.sgN;
    if (localObject != null)
      ((TextView)localObject).setVisibility(8);
    localObject = this.sgM;
    if (localObject != null)
      ((TextView)localObject).setVisibility(0);
    localObject = this.sgO;
    if (localObject != null)
      ((RecyclerView)localObject).setVisibility(0);
    this.czr = paramBoolean;
    this.sgQ.clear();
    if ((paramBoolean) && (this.fromScene != sgW))
      this.sgQ.add(new StoryFavoritePanel.c(null, this.sgK));
    paramList = ((Iterable)paramList).iterator();
    while (paramList.hasNext())
    {
      localObject = (com.tencent.mm.plugin.story.h.j)paramList.next();
      this.sgQ.add(new StoryFavoritePanel.c((com.tencent.mm.plugin.story.h.j)localObject, this.sgL));
    }
    this.sgQ.add(new StoryFavoritePanel.c(null, this.rUf));
    this.sgP.notifyDataSetChanged();
    AppMethodBeat.o(138885);
  }

  public final int getFromScene()
  {
    return this.fromScene;
  }

  public final boolean getMIsAll()
  {
    return this.rFn;
  }

  public final a.f.a.b<StoryFavoritePanel.c, y> getMOnAddItemClickListener()
  {
    return this.sgU;
  }

  public final m<StoryFavoritePanel.c, Integer, y> getMOnFavItemClickListener()
  {
    return this.sgT;
  }

  public final void setFromScene(int paramInt)
  {
    this.fromScene = paramInt;
  }

  public final void setMIsAll(boolean paramBoolean)
  {
    this.rFn = paramBoolean;
  }

  public final void setMOnAddItemClickListener(a.f.a.b<? super StoryFavoritePanel.c, y> paramb)
  {
    this.sgU = paramb;
  }

  public final void setMOnFavItemClickListener(m<? super StoryFavoritePanel.c, ? super Integer, y> paramm)
  {
    this.sgT = paramm;
  }

  public final void setSelf(boolean paramBoolean)
  {
    this.czr = paramBoolean;
  }

  public final void setup(int paramInt)
  {
    this.fromScene = paramInt;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryFavoriteAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "plugin-story_release"})
  public final class d extends RecyclerView.a<RecyclerView.v>
  {
    public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
    {
      AppMethodBeat.i(110200);
      a.f.b.j.p(paramViewGroup, "parent");
      Object localObject;
      if (paramInt == StoryFavoritePanel.a(this.sgY))
      {
        paramViewGroup = v.hu(this.sgY.getContext()).inflate(2130970846, paramViewGroup, false);
        localObject = this.sgY;
        a.f.b.j.o(paramViewGroup, "itemView");
        paramViewGroup = (RecyclerView.v)new StoryFavoritePanel.e((StoryFavoritePanel)localObject, paramViewGroup);
        AppMethodBeat.o(110200);
      }
      while (true)
      {
        return paramViewGroup;
        if (paramInt == StoryFavoritePanel.b(this.sgY))
        {
          localObject = this.sgY;
          paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970854, paramViewGroup, false);
          a.f.b.j.o(paramViewGroup, "LayoutInflater.from(pare…ng_layout, parent, false)");
          paramViewGroup = (RecyclerView.v)new StoryFavoritePanel.b((StoryFavoritePanel)localObject, paramViewGroup);
          AppMethodBeat.o(110200);
        }
        else
        {
          localObject = v.hu(this.sgY.getContext()).inflate(2130970847, paramViewGroup, false);
          paramViewGroup = this.sgY;
          a.f.b.j.o(localObject, "itemView");
          paramViewGroup = (RecyclerView.v)new StoryFavoritePanel.f(paramViewGroup, (View)localObject);
          AppMethodBeat.o(110200);
        }
      }
    }

    public final void a(RecyclerView.v paramv, int paramInt)
    {
      Context localContext = null;
      AppMethodBeat.i(110203);
      a.f.b.j.p(paramv, "holder");
      Object localObject1;
      Object localObject2;
      if ((paramv instanceof StoryFavoritePanel.e))
      {
        localObject1 = ((StoryFavoritePanel.e)paramv).iNr;
        localContext = this.sgY.getContext();
        localObject2 = this.sgY.getContext();
        a.f.b.j.o(localObject2, "context");
        ((ImageView)localObject1).setImageDrawable(com.tencent.mm.ui.ah.f(localContext, 2131231432, ((Context)localObject2).getResources().getColor(2131690538)));
        paramv.apJ.setOnClickListener((View.OnClickListener)new StoryFavoritePanel.d.a(this, paramInt));
        AppMethodBeat.o(110203);
      }
      while (true)
      {
        return;
        if ((paramv instanceof StoryFavoritePanel.f))
        {
          ((StoryFavoritePanel.f)paramv).mom.setVisibility(8);
          int i = this.sgY.getFromScene();
          localObject2 = StoryFavoritePanel.sgX;
          if (i == StoryFavoritePanel.cCk())
          {
            localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
            if ((localObject2 == null) || (((com.tencent.mm.plugin.story.h.j)localObject2).cBW() != true))
            {
              localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
              if ((localObject2 != null) && (((com.tencent.mm.plugin.story.h.j)localObject2).cBV() == true))
              {
                localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
                if ((localObject2 == null) || (((com.tencent.mm.plugin.story.h.j)localObject2).cBX()));
              }
            }
            else
            {
              ((StoryFavoritePanel.f)paramv).mom.setVisibility(0);
            }
          }
          paramv.apJ.setOnClickListener((View.OnClickListener)new StoryFavoritePanel.d.b(this, paramInt));
          localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
          if (localObject2 != null)
          {
            localObject2 = ((com.tencent.mm.plugin.story.h.j)localObject2).cBR();
            if (localObject2 != null)
            {
              localObject2 = ((cfb)localObject2).xeA;
              label311: if (localObject2 != null)
              {
                localObject1 = ((cea)localObject2).wbK;
                a.f.b.j.o(localObject1, "obj.MediaObjList");
                if (((Collection)localObject1).isEmpty())
                  break label563;
                i = 1;
                label346: if (i != 0)
                {
                  localObject1 = com.tencent.mm.plugin.story.model.j.rST;
                  localObject1 = j.a.cyc();
                  localObject2 = ((cea)localObject2).wbK.get(0);
                  a.f.b.j.o(localObject2, "obj.MediaObjList[0]");
                  localObject3 = (cek)localObject2;
                  localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
                  if (localObject2 == null)
                    break label569;
                  localObject2 = ((com.tencent.mm.plugin.story.h.j)localObject2).field_userName;
                  localObject4 = az.xYY;
                  a.f.b.j.o(localObject4, "FROM_SCENE.storyalbum");
                  localObject3 = new com.tencent.mm.plugin.story.model.c.d((cek)localObject3, (String)localObject2, (az)localObject4);
                  localObject4 = ((StoryFavoritePanel.f)paramv).sgq;
                  localObject2 = com.tencent.mm.plugin.story.model.j.rST;
                  ((com.tencent.mm.loader.d)localObject1).a(localObject3, (ImageView)localObject4, j.a.a(com.tencent.mm.plugin.story.model.c.a.rVK));
                }
              }
              label417: localObject2 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).rXz;
              if (localObject2 == null)
                break label575;
            }
          }
          label563: label569: label575: for (i = ((com.tencent.mm.plugin.story.h.j)localObject2).field_createTime; ; i = 0)
          {
            localObject2 = com.tencent.mm.plugin.story.e.b.rRO;
            localObject1 = b.a.j(Integer.valueOf(i));
            if ((i != 0) && (!bo.isNullOrNil((String)localObject1)))
              break label581;
            ((StoryFavoritePanel.f)paramv).gnf.setText((CharSequence)"");
            AppMethodBeat.o(110203);
            break;
            localObject2 = null;
            break label311;
            i = 0;
            break label346;
            localObject2 = null;
            break label417;
          }
          label581: com.tencent.mm.ab.b.f(((StoryFavoritePanel.f)paramv).gnf);
          localObject2 = ((StoryFavoritePanel.f)paramv).gnf;
          Object localObject3 = com.tencent.mm.plugin.story.e.b.rRO;
          localObject3 = Integer.valueOf(i);
          Object localObject4 = new SimpleDateFormat(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131305987));
          if (localObject3 != null);
          for (long l = ((Integer)localObject3).intValue(); ; l = 0L)
          {
            localObject3 = ((SimpleDateFormat)localObject4).format(new Date(l * 1000L));
            a.f.b.j.o(localObject3, "simpleDateFormat.format(date)");
            ((TextView)localObject2).setText((CharSequence)localObject3);
            if ((paramInt - 1 < 0) || (((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt - 1)).rXz == null))
              break label867;
            localObject2 = com.tencent.mm.plugin.story.e.b.rRO;
            localObject3 = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt - 1)).rXz;
            localObject2 = localContext;
            if (localObject3 != null)
              localObject2 = Integer.valueOf(((com.tencent.mm.plugin.story.h.j)localObject3).field_createTime);
            if (!bo.isEqual((String)localObject1, b.a.j((Integer)localObject2)))
              break label867;
            ((StoryFavoritePanel.f)paramv).gnf.setText((CharSequence)"");
            AppMethodBeat.o(110203);
            break;
          }
        }
        if ((paramv instanceof StoryFavoritePanel.b))
        {
          if (this.sgY.getMIsAll())
          {
            ((StoryFavoritePanel.b)paramv).sgi.setVisibility(8);
            ((StoryFavoritePanel.b)paramv).sgj.setVisibility(0);
            AppMethodBeat.o(110203);
          }
          else
          {
            ((StoryFavoritePanel.b)paramv).sgi.setVisibility(0);
            ((StoryFavoritePanel.b)paramv).sgj.setVisibility(8);
          }
        }
        else
          label867: AppMethodBeat.o(110203);
      }
    }

    public final int getItemCount()
    {
      AppMethodBeat.i(110202);
      int i = StoryFavoritePanel.c(this.sgY).size();
      AppMethodBeat.o(110202);
      return i;
    }

    public final int getItemViewType(int paramInt)
    {
      AppMethodBeat.i(110201);
      paramInt = ((StoryFavoritePanel.c)StoryFavoritePanel.c(this.sgY).get(paramInt)).type;
      AppMethodBeat.o(110201);
      return paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel
 * JD-Core Version:    0.6.2
 */