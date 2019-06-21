package com.tencent.mm;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.n;
import com.tencent.mm.api.p;
import com.tencent.mm.api.s;
import com.tencent.mm.api.s.a;
import com.tencent.mm.api.s.c;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.ArtistCacheManager.1;
import com.tencent.mm.cache.ArtistCacheManager.a;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class a extends s
{
  private com.tencent.mm.view.a cbM;
  private p cbN;

  public final boolean Ab()
  {
    AppMethodBeat.i(116130);
    boolean bool = this.cbM.getPresenter().Ab();
    AppMethodBeat.o(116130);
    return bool;
  }

  public final p Ac()
  {
    AppMethodBeat.i(116133);
    if (this.cbN == null)
      this.cbN = new com.tencent.mm.bx.c(this.cbM.getPresenter());
    p localp = this.cbN;
    AppMethodBeat.o(116133);
    return localp;
  }

  public final void Ad()
  {
    AppMethodBeat.i(116134);
    ArtistCacheManager.Jc().Jd();
    AppMethodBeat.o(116134);
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(116129);
    com.tencent.mm.br.b localb = this.cbM.getPresenter();
    if (!Ac().Ay());
    for (boolean bool = true; ; bool = false)
    {
      localb.a(paramn, bool);
      AppMethodBeat.o(116129);
      return;
    }
  }

  public final void a(s.a parama)
  {
    AppMethodBeat.i(116131);
    super.a(parama);
    ArtistCacheManager localArtistCacheManager = ArtistCacheManager.Jc();
    parama = bo.bc(this.ccP.path, "MicroMsg.MMPhotoEditorImpl");
    localArtistCacheManager.efl = parama;
    if (!ArtistCacheManager.efj.containsKey(parama))
      ArtistCacheManager.efj.put(parama, new ArtistCacheManager.a(localArtistCacheManager));
    AppMethodBeat.o(116131);
  }

  public final com.tencent.mm.api.c aQ(Context paramContext)
  {
    AppMethodBeat.i(116128);
    if (this.cbM == null)
    {
      if (this.ccP.ccR != s.c.ccW)
        break label53;
      this.cbM = new com.tencent.mm.view.d(paramContext, this.ccP);
    }
    while (true)
    {
      paramContext = this.cbM;
      AppMethodBeat.o(116128);
      return paramContext;
      label53: if (this.ccP.ccR == s.c.ccX)
        this.cbM = new com.tencent.mm.view.b(paramContext, this.ccP);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116132);
    if (!this.ccP.ccS)
    {
      ArtistCacheManager localArtistCacheManager = ArtistCacheManager.Jc();
      String str = bo.bc(this.ccP.path, "MicroMsg.MMPhotoEditorImpl");
      localArtistCacheManager.efl = null;
      if (ArtistCacheManager.efj.containsKey(str))
      {
        ((ArtistCacheManager.a)ArtistCacheManager.efj.get(str)).clearAll();
        ArtistCacheManager.efj.remove(str);
      }
      com.tencent.mm.sdk.g.d.post(new ArtistCacheManager.1(localArtistCacheManager), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }
    if (this.cbM != null)
      this.cbM.getPresenter().onDestroy();
    try
    {
      this.cbM.getChatFooterPanel().destroy();
      AppMethodBeat.o(116132);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMPhotoEditorImpl", "[onDestroy] may be has destory!");
        AppMethodBeat.o(116132);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a
 * JD-Core Version:    0.6.2
 */