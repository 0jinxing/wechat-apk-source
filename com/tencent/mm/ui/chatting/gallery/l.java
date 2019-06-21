package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashSet;

public final class l
  implements d.a
{
  private static l yXL;
  HashSet<Long> yXM;
  d.a yXN;

  private l()
  {
    AppMethodBeat.i(32399);
    this.yXM = new HashSet();
    AppMethodBeat.o(32399);
  }

  public static l dGI()
  {
    AppMethodBeat.i(32400);
    if (yXL == null)
      yXL = new l();
    l locall = yXL;
    AppMethodBeat.o(32400);
    return locall;
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(32404);
    if (this.yXN != null)
      this.yXN.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject);
    this.yXM.remove(Long.valueOf(paramLong2));
    AppMethodBeat.o(32404);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
    AppMethodBeat.i(32402);
    if (this.yXN != null)
      this.yXN.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paramm);
    AppMethodBeat.o(32402);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(32403);
    if (this.yXN != null)
      this.yXN.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paramString, paramm);
    while (true)
    {
      this.yXM.remove(Long.valueOf(paramLong2));
      AppMethodBeat.o(32403);
      return;
      aw.ZK();
      paramObject = com.tencent.mm.model.c.XO().jf(paramLong2);
      ab.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", new Object[] { Long.valueOf(paramObject.field_msgId) });
      c.b(ah.getContext(), paramObject, false);
    }
  }

  public final boolean nr(long paramLong)
  {
    AppMethodBeat.i(32401);
    boolean bool = this.yXM.contains(Long.valueOf(paramLong));
    AppMethodBeat.o(32401);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.l
 * JD-Core Version:    0.6.2
 */