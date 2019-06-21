package com.tencent.mm.am;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;

public final class e extends ai
{
  public final String getTag()
  {
    return "MicroMsg.VerifyFlagDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 604176383));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16433);
    ab.d("MicroMsg.VerifyFlagDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if (!kw(paramInt))
    {
      ab.w("MicroMsg.VerifyFlagDataTransfer", "do not need transfer");
      AppMethodBeat.o(16433);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.k(336L, 10L, 1L);
      long l = System.currentTimeMillis();
      aw.ZK();
      if (bo.h((Integer)c.Ry().get(86017, null)) == 3)
      {
        ab.w("MicroMsg.VerifyFlagDataTransfer", "check old contact not exist");
        AppMethodBeat.o(16433);
      }
      else
      {
        aw.ZK();
        c.Ru().hY("rcontact", "update rcontact set verifyflag=0 where verifyflag is null;");
        aw.ZK();
        Cursor localCursor = c.XM().c("@all.weixin.android", "", null);
        localCursor.moveToFirst();
        while (!localCursor.isAfterLast())
        {
          ad localad = new ad();
          localad.d(localCursor);
          aw.ZK();
          c.XM().d(localad.field_username, localad);
          localCursor.moveToNext();
        }
        localCursor.close();
        ab.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag from the beginning to update finish use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        aw.ZK();
        c.Ry().set(86017, Integer.valueOf(3));
        ab.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag use time " + (System.currentTimeMillis() - l) + " ms");
        AppMethodBeat.o(16433);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.e
 * JD-Core Version:    0.6.2
 */