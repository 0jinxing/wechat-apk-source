package com.tencent.mm.plugin.story.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.story.d.a.a;
import com.tencent.mm.plugin.story.d.a.b;
import com.tencent.mm.plugin.story.h.a;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.plugin.story.model.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/StoryFavAlbumPresenter;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "view", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumView;", "(Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumView;)V", "loadNpCount", "", "localCachedMinId", "", "localMinId", "mIsAll", "", "mUsername", "", "respMaxId", "getView", "()Lcom/tencent/mm/plugin/story/contract/AlbumContract$IFavAlbumView;", "isAll", "errType", "errCode", "limitId", "loadFavStoryFromDB", "", "loadFpData", "loadNpData", "onCreate", "userName", "onDestory", "onHandleFp", "onHandleNp", "onSceneEnd", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "updateLocalMinId", "lastId", "Companion", "plugin-story_release"})
public final class m
  implements f, a.a
{
  private static final String TAG = "MicroMsg.StoryFavAlbumPresenter";
  public static final m.a sal;
  private String igi;
  private boolean rFn;
  private long rXZ;
  private long rYa;
  private long rYb;
  private int rYc;
  final a.b sak;

  static
  {
    AppMethodBeat.i(138829);
    sal = new m.a((byte)0);
    TAG = "MicroMsg.StoryFavAlbumPresenter";
    AppMethodBeat.o(138829);
  }

  public m(a.b paramb)
  {
    AppMethodBeat.i(138828);
    this.sak = paramb;
    this.igi = "";
    this.rYc = 1;
    AppMethodBeat.o(138828);
  }

  public final void bMO()
  {
    AppMethodBeat.i(138823);
    com.tencent.mm.kernel.b localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(273, (a.a)this);
    localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(764, (a.a)this);
    AppMethodBeat.o(138823);
  }

  public final void cxk()
  {
    AppMethodBeat.i(138824);
    this.rYc -= 1;
    ab.i(TAG, "loadNpData username=" + this.igi + " maxId=" + this.rXZ);
    if (!this.rFn)
    {
      Object localObject1 = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject1, "MMKernel.network()");
      p localp = ((com.tencent.mm.kernel.b)localObject1).Rg();
      localObject1 = this.igi;
      long l = this.rXZ;
      String str = this.igi;
      Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      boolean bool = bo.isEqual(str, j.a.cnk());
      localObject2 = a.sdm;
      localp.d((com.tencent.mm.ai.m)new com.tencent.mm.plugin.story.model.a.j((String)localObject1, l, bool, "", a.cBs()));
    }
    AppMethodBeat.o(138824);
  }

  public final void cxl()
  {
    AppMethodBeat.i(138825);
    ab.i(TAG, "loadFpData username=" + this.igi + " maxId=" + this.rXZ);
    Object localObject1 = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject1, "MMKernel.network()");
    p localp = ((com.tencent.mm.kernel.b)localObject1).Rg();
    localObject1 = this.igi;
    Object localObject2 = this.igi;
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    boolean bool = bo.isEqual((String)localObject2, j.a.cnk());
    localObject2 = a.sdm;
    localp.d((com.tencent.mm.ai.m)new com.tencent.mm.plugin.story.model.a.j((String)localObject1, 0L, bool, "", a.cBs()));
    AppMethodBeat.o(138825);
  }

  public final void cxm()
  {
    AppMethodBeat.i(138826);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new m.b(this));
    AppMethodBeat.o(138826);
  }

  public final void le(long paramLong)
  {
    AppMethodBeat.i(138822);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxT();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cyd();
    this.rYb = ((k)localObject).F(paramLong, o.a.aaC(this.igi));
    localObject = b.rYk;
    ab.d(b.access$getTAG$cp(), "localMinId=" + this.rYb + ", respMaxId=" + this.rXZ);
    AppMethodBeat.o(138822);
  }

  public final void onCreate(String paramString)
  {
    AppMethodBeat.i(138821);
    a.f.b.j.p(paramString, "userName");
    this.igi = paramString;
    le(this.rYa);
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(273, (a.a)this);
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(764, (a.a)this);
    AppMethodBeat.o(138821);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(138827);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.story.model.a.j))
    {
      int i = ((com.tencent.mm.plugin.story.model.a.j)paramm).cvd;
      paramString = a.sdm;
      if (i == a.cBs())
      {
        long l = ((com.tencent.mm.plugin.story.model.a.j)paramm).qKi;
        paramString = a.sdm;
        if (paramInt2 != a.cAW())
        {
          paramString = a.sdm;
          if ((paramInt2 != a.cAX()) && ((paramInt1 != 0) || (paramInt2 != 0) || (l != 0L)))
          {
            paramString = a.sdm;
            if ((paramInt2 != a.cAV()) || (l != 0L))
              break label261;
          }
        }
        bool = true;
        this.rFn = bool;
        if (this.rFn)
          this.sak.cxn();
        this.rXZ = ((com.tencent.mm.plugin.story.model.a.j)paramm).qKi;
        if (((com.tencent.mm.plugin.story.model.a.j)paramm).qIW)
        {
          paramString = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cno().post((Runnable)new m.c(this));
          label171: ab.d(TAG, "onSceneEnd username=" + this.igi + " respMaxId=" + this.rXZ + ' ' + paramInt1 + ' ' + paramInt2 + " isAll:" + this.rFn + " limitId:" + this.rXZ);
          AppMethodBeat.o(138827);
        }
      }
    }
    while (true)
    {
      return;
      label261: bool = false;
      break;
      paramString = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new m.d(this));
      break label171;
      if ((paramm instanceof com.tencent.mm.plugin.story.model.a.g))
      {
        paramString = ((com.tencent.mm.plugin.story.model.a.g)paramm).cyX();
        if (paramString != null)
        {
          if ((paramString instanceof com.tencent.mm.plugin.story.model.a.l))
          {
            Object localObject = b.rYk;
            ab.i(b.access$getTAG$cp(), "onSceneEnd update story favorite: errType " + paramInt1 + ", errcode " + paramInt2 + ", localId " + ((com.tencent.mm.plugin.story.model.a.g)paramm).cNE + ", favorite:" + ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
            if (paramInt2 == 0)
            {
              localObject = n.rTi;
              n.a.fK(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
              cxm();
            }
          }
          AppMethodBeat.o(138827);
        }
      }
      else
      {
        AppMethodBeat.o(138827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.m
 * JD-Core Version:    0.6.2
 */