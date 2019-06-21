package com.tencent.mm.plugin.fav.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class FavVideoView$a
  implements p, d
{
  private FavVideoView$a(FavVideoView paramFavVideoView)
  {
  }

  private void a(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(74723);
    ab.d("MicroMsg.FavVideoView", "onCdnStatusChanged status:%s, offset:%s, totalLength:%s, path:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (((paramInt1 == 3) || (paramInt1 == 2)) && (com.tencent.mm.vfs.e.ct(paramString)))
    {
      FavVideoView.a(this.mqn).stop();
      FavVideoView.g(this.mqn);
      FavVideoView.a(this.mqn, paramString);
      al.d(new FavVideoView.a.1(this));
      AppMethodBeat.o(74723);
    }
    while (true)
    {
      return;
      FavVideoView.a(this.mqn, paramInt2, paramInt3);
      AppMethodBeat.o(74723);
    }
  }

  public final void a(int paramInt, i parami)
  {
    AppMethodBeat.i(74722);
    if (parami == null)
      AppMethodBeat.o(74722);
    while (true)
    {
      return;
      if (!parami.field_dataId.equals(FavVideoView.f(this.mqn)))
      {
        AppMethodBeat.o(74722);
      }
      else
      {
        a(parami.field_status, parami.field_path, parami.field_offset, parami.field_totalLen);
        AppMethodBeat.o(74722);
      }
    }
  }

  public final void d(c paramc)
  {
    AppMethodBeat.i(74721);
    if (paramc == null)
      AppMethodBeat.o(74721);
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramc.field_dataId)) || (!paramc.field_dataId.equals(FavVideoView.f(this.mqn))))
      {
        AppMethodBeat.o(74721);
      }
      else
      {
        a(paramc.field_status, paramc.field_path, paramc.field_offset, paramc.field_totalLen);
        AppMethodBeat.o(74721);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.a
 * JD-Core Version:    0.6.2
 */