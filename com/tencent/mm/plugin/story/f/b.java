package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.d.a.e;
import com.tencent.mm.plugin.story.d.a.f;
import com.tencent.mm.plugin.story.h.a;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/AlbumPresenter;", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "view", "Lcom/tencent/mm/plugin/story/contract/AlbumContract$IView;", "(Lcom/tencent/mm/plugin/story/contract/AlbumContract$IView;)V", "localCachedMinId", "", "localMinId", "mIsAll", "", "mMap", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "Lkotlin/collections/ArrayList;", "mNpLoopCount", "", "mUsername", "respMaxId", "getView", "()Lcom/tencent/mm/plugin/story/contract/AlbumContract$IView;", "assembleRealData", "", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "infos", "checkStoryPost", "", "isAll", "errCode", "loadDBData", "loadFpData", "loadNpData", "needLoopFetch", "onCreate", "userName", "onDestory", "onHandleFp", "onHandleNp", "onSceneEnd", "errType", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "updateLocalMinId", "lastId", "Companion", "plugin-story_release"})
public final class b
  implements com.tencent.mm.ai.f, a.e
{
  private static final String TAG = "MicroMsg.AlbumPresenter";
  public static final b.a rYk;
  private String igi;
  private boolean rFn;
  private long rXZ;
  private long rYa;
  private long rYb;
  private final LinkedHashMap<String, ArrayList<h>> rYh;
  private int rYi;
  final a.f rYj;

  static
  {
    AppMethodBeat.i(109516);
    rYk = new b.a((byte)0);
    TAG = "MicroMsg.AlbumPresenter";
    AppMethodBeat.o(109516);
  }

  public b(a.f paramf)
  {
    AppMethodBeat.i(109515);
    this.rYj = paramf;
    this.igi = "";
    this.rYh = new LinkedHashMap();
    AppMethodBeat.o(109515);
  }

  public final void bMO()
  {
    AppMethodBeat.i(109508);
    com.tencent.mm.kernel.b localb = g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(191, (a.e)this);
    localb = g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(3926, (a.e)this);
    localb = g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(764, (a.e)this);
    AppMethodBeat.o(109508);
  }

  public final void cxk()
  {
    AppMethodBeat.i(109511);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new b.d(this));
    AppMethodBeat.o(109511);
  }

  public final void cxl()
  {
    AppMethodBeat.i(109510);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new b.c(this));
    AppMethodBeat.o(109510);
  }

  public final void cxo()
  {
    AppMethodBeat.i(109509);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new b.b(this));
    AppMethodBeat.o(109509);
  }

  public final void le(long paramLong)
  {
    AppMethodBeat.i(109506);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxT();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cyd();
    this.rYb = ((k)localObject).E(paramLong, o.a.aaC(this.igi));
    if (this.rXZ != 0L)
      if (this.rYb >= this.rXZ)
        break label116;
    label116: for (paramLong = this.rYb; ; paramLong = this.rXZ)
    {
      this.rYb = paramLong;
      ab.d(TAG, "localMinId=" + this.rYb + ", respMaxId=" + this.rXZ);
      AppMethodBeat.o(109506);
      return;
    }
  }

  public final void onCreate(String paramString)
  {
    AppMethodBeat.i(109507);
    a.f.b.j.p(paramString, "userName");
    this.igi = paramString;
    le(this.rYa);
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(191, (a.e)this);
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(3926, (a.e)this);
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(764, (a.e)this);
    AppMethodBeat.o(109507);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(109512);
    boolean bool;
    if (((paramm instanceof com.tencent.mm.plugin.story.model.a.f)) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.f)paramm).userName, this.igi)))
    {
      paramString = a.sdm;
      if (paramInt2 != a.cAW())
      {
        paramString = a.sdm;
        if (paramInt2 != a.cAX())
          break label188;
      }
      bool = true;
      this.rFn = bool;
      if (this.rFn)
        this.rYj.cxn();
      if (!((com.tencent.mm.plugin.story.model.a.f)paramm).qIW)
        break label194;
      paramString = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new b.e(this));
    }
    while (true)
    {
      this.rXZ = ((com.tencent.mm.plugin.story.model.a.f)paramm).qKi;
      ab.d(TAG, "onSceneEnd username=" + this.igi + " respMaxId=" + this.rXZ + ' ' + paramInt1 + ' ' + paramInt2);
      AppMethodBeat.o(109512);
      return;
      label188: bool = false;
      break;
      label194: this.rYi = 0;
      paramString = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new b.f(this));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.b
 * JD-Core Version:    0.6.2
 */