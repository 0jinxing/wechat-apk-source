package com.tencent.mm.am;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends ai
{
  public final String getTag()
  {
    return "MicroMsg.App.SyncTopConversation";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 620758015));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16436);
    ab.d("MicroMsg.App.SyncTopConversation", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.service.h.pYm.k(336L, 15L, 1L);
    aw.ZK();
    Object localObject1 = c.Ru();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("select username from rconversation");
    ((StringBuilder)localObject2).append(" where flag & 4611686018427387904 != 0");
    ab.d("MicroMsg.App.SyncTopConversation", "sql:%s", new Object[] { localObject2 });
    localObject1 = ((com.tencent.mm.cd.h)localObject1).a(((StringBuilder)localObject2).toString(), null, 2);
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = ((Cursor)localObject1).getString(0);
        ab.v("MicroMsg.App.SyncTopConversation", "userName %s", new Object[] { localObject2 });
        t.w((String)localObject2, false);
      }
      ((Cursor)localObject1).close();
    }
    AppMethodBeat.o(16436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.h
 * JD-Core Version:    0.6.2
 */