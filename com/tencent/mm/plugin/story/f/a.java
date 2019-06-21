package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.d.a.d;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/AlbumFavPresenter;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "view", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectView;", "(Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectView;)V", "TAG", "", "loadNpCount", "", "localCachedMinId", "", "localMinId", "mIsAll", "", "mUsername", "respMaxId", "getView", "()Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavSelectView;", "isAll", "errType", "errCode", "limitId", "loadDBData", "", "loadFpData", "loadNpData", "onCreate", "userName", "onDestory", "onHandleFp", "onHandleNp", "onSceneEnd", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "setFavorite", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "favorite", "replaced", "updateLocalMinId", "lastId", "plugin-story_release"})
public final class a
  implements f, com.tencent.mm.plugin.story.d.a.c
{
  final String TAG;
  private String igi;
  private boolean rFn;
  private long rXZ;
  long rYa;
  long rYb;
  int rYc;
  final a.d rYd;

  public a(a.d paramd)
  {
    AppMethodBeat.i(109497);
    this.rYd = paramd;
    this.TAG = "MicroMsg.AlbumFavPresenter";
    this.igi = "";
    AppMethodBeat.o(109497);
  }

  public final void a(com.tencent.mm.plugin.story.h.j paramj)
  {
    AppMethodBeat.i(138798);
    a.f.b.j.p(paramj, "storyInfo");
    ab.i(this.TAG, "LogStory: setFavorite storyId:" + paramj.field_storyID + " localid:" + (int)paramj.xDa + " targetFavorite:true replacedStory:" + null);
    Object localObject = n.rTi;
    n.a.h(paramj.field_storyID, (int)paramj.xDa, true);
    localObject = h.scu;
    h.a(1L, String.valueOf(paramj.field_storyID), 0L, 0L, 1L);
    AppMethodBeat.o(138798);
  }

  public final void bMO()
  {
    AppMethodBeat.i(109491);
    b localb = g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(273, (com.tencent.mm.plugin.story.d.a.c)this);
    AppMethodBeat.o(109491);
  }

  public final void cxk()
  {
    AppMethodBeat.i(109493);
    this.rYc -= 1;
    ab.i(this.TAG, "loadNpData username=" + this.igi + " maxId=" + this.rXZ);
    if (!this.rFn)
    {
      Object localObject1 = g.RO();
      a.f.b.j.o(localObject1, "MMKernel.network()");
      p localp = ((b)localObject1).Rg();
      localObject1 = this.igi;
      long l = this.rXZ;
      Object localObject2 = this.igi;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      boolean bool = bo.isEqual((String)localObject2, j.a.cnk());
      localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
      localp.d((m)new com.tencent.mm.plugin.story.model.a.j((String)localObject1, l, bool, "", com.tencent.mm.plugin.story.h.a.cBr()));
    }
    AppMethodBeat.o(109493);
  }

  public final void cxl()
  {
    AppMethodBeat.i(109494);
    ab.i(this.TAG, "loadFpData username=" + this.igi + " maxId=" + this.rXZ);
    Object localObject1 = g.RO();
    a.f.b.j.o(localObject1, "MMKernel.network()");
    localObject1 = ((b)localObject1).Rg();
    String str = this.igi;
    Object localObject2 = this.igi;
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    boolean bool = bo.isEqual((String)localObject2, j.a.cnk());
    localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
    ((p)localObject1).d((m)new com.tencent.mm.plugin.story.model.a.j(str, 0L, bool, "", com.tencent.mm.plugin.story.h.a.cBr()));
    AppMethodBeat.o(109494);
  }

  public final void cxo()
  {
    AppMethodBeat.i(109492);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new a.a(this));
    AppMethodBeat.o(109492);
  }

  final void le(long paramLong)
  {
    AppMethodBeat.i(109489);
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxT();
    Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cyd();
    a.f.b.j.p(this.igi, "userName");
    localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
    int i = com.tencent.mm.plugin.story.h.a.cAR();
    localObject2 = this.igi;
    String str = this.igi;
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    this.rYb = ((k)localObject1).b(paramLong, i, (String)localObject2, bo.isEqual(str, j.a.cnk()));
    if (this.rXZ != 0L)
      if (this.rYb >= this.rXZ)
        break label159;
    label159: for (paramLong = this.rYb; ; paramLong = this.rXZ)
    {
      this.rYb = paramLong;
      ab.d(this.TAG, "localMinId=" + this.rYb + ", respMaxId=" + this.rXZ);
      AppMethodBeat.o(109489);
      return;
    }
  }

  public final void onCreate(String paramString)
  {
    AppMethodBeat.i(109490);
    a.f.b.j.p(paramString, "userName");
    this.igi = paramString;
    le(this.rYa);
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(273, (com.tencent.mm.plugin.story.d.a.c)this);
    AppMethodBeat.o(109490);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(109495);
    ab.i(this.TAG, "LogStory: " + paramInt1 + ' ' + paramInt2 + ' ' + paramString + ' ' + paramm);
    boolean bool;
    if (((paramm instanceof com.tencent.mm.plugin.story.model.a.j)) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.j)paramm).userName, this.igi)))
    {
      int i = ((com.tencent.mm.plugin.story.model.a.j)paramm).cvd;
      paramString = com.tencent.mm.plugin.story.h.a.sdm;
      if (i == com.tencent.mm.plugin.story.h.a.cBr())
      {
        ab.d(this.TAG, "onSceneEnd username=" + this.igi + " respMaxId=" + this.rXZ + ' ' + paramInt1 + ' ' + paramInt2 + ' ' + ((com.tencent.mm.plugin.story.model.a.j)paramm).qKi);
        long l = ((com.tencent.mm.plugin.story.model.a.j)paramm).qKi;
        paramString = com.tencent.mm.plugin.story.h.a.sdm;
        if (paramInt2 != com.tencent.mm.plugin.story.h.a.cAW())
        {
          paramString = com.tencent.mm.plugin.story.h.a.sdm;
          if ((paramInt2 != com.tencent.mm.plugin.story.h.a.cAX()) && ((paramInt1 != 0) || (paramInt2 != 0) || (l != 0L)))
          {
            paramString = com.tencent.mm.plugin.story.h.a.sdm;
            if ((paramInt2 != com.tencent.mm.plugin.story.h.a.cAV()) || (l != 0L))
              break label406;
          }
        }
        bool = true;
        this.rFn = bool;
        if (this.rFn)
          this.rYd.cxn();
        this.rXZ = ((com.tencent.mm.plugin.story.model.a.j)paramm).qKi;
        if (!((com.tencent.mm.plugin.story.model.a.j)paramm).qIW)
          break label412;
        paramString = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new a.b(this));
      }
    }
    while (true)
    {
      ab.d(this.TAG, "onSceneEnd username=" + this.igi + " respMaxId=" + this.rXZ + ' ' + paramInt1 + ' ' + paramInt2 + " isAll:" + this.rFn + " limitId:" + this.rXZ);
      AppMethodBeat.o(109495);
      return;
      label406: bool = false;
      break;
      label412: paramString = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new a.c(this));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.a
 * JD-Core Version:    0.6.2
 */