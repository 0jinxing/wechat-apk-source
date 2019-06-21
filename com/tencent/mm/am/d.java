package com.tencent.mm.am;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends ai
{
  public final String getTag()
  {
    return "MicroMsg.DataTransfer.BlackListConvDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 620757033));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16432);
    ab.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 620757033))
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(336L, 13L, 1L);
      Object localObject1 = new LinkedList();
      aw.ZK();
      Object localObject2 = c.XM().d("@black.android", "", null);
      Object localObject3;
      if (localObject2 != null)
      {
        ((Cursor)localObject2).moveToFirst();
        while (!((Cursor)localObject2).isAfterLast())
        {
          localObject3 = new ad();
          ((ad)localObject3).d((Cursor)localObject2);
          ((List)localObject1).add(((ap)localObject3).field_username);
          ((Cursor)localObject2).moveToNext();
        }
        ((Cursor)localObject2).close();
      }
      if (((List)localObject1).size() > 0)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Update rconversation");
        ((StringBuilder)localObject3).append(" set parentRef = '@blacklist' where 1 != 1 ");
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (String)((Iterator)localObject2).next();
          ((StringBuilder)localObject3).append(" or username = '").append((String)localObject1).append("'");
        }
        localObject1 = ((StringBuilder)localObject3).toString();
        ab.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "update sql: %s", new Object[] { localObject1 });
        aw.ZK();
        c.Ru().hY("rconversation", (String)localObject1);
      }
    }
    AppMethodBeat.o(16432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.d
 * JD-Core Version:    0.6.2
 */