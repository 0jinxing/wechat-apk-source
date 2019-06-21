package com.tencent.mm.am;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends ai
{
  public final String getTag()
  {
    return "MicroMsg.App.BizInfoDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 604372991));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16429);
    ab.d("MicroMsg.App.BizInfoDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(336L, 12L, 1L);
      aw.ZK();
      Object localObject1 = c.Ru();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("select BizInfo.username, BizInfo.extInfo");
      localStringBuilder.append(" from rcontact , BizInfo");
      localStringBuilder.append(" where rcontact.username = BizInfo.username");
      localStringBuilder.append(" and (rcontact.type & 1 ) != 0 ");
      localStringBuilder.append(" and ( rcontact.verifyFlag & 8 ) != 0 ");
      Object localObject2 = localStringBuilder.toString();
      Object localObject3 = new ArrayList();
      ab.d("MicroMsg.App.BizInfoDataTransfer", "sql %s", new Object[] { localObject2 });
      localObject1 = ((com.tencent.mm.cd.h)localObject1).a(localStringBuilder.toString(), null, 2);
      if (localObject1 != null)
      {
        while (((Cursor)localObject1).moveToNext())
        {
          localObject2 = new d();
          ((d)localObject2).d((Cursor)localObject1);
          if (((d)localObject2).cJ(false).getServiceType() == 1)
            ((List)localObject3).add(((d)localObject2).field_username);
        }
        ((Cursor)localObject1).close();
      }
      if (((List)localObject3).size() > 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Update BizInfo set type = 1 where 1 !=1 ");
        localObject1 = ((List)localObject3).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          ((StringBuilder)localObject2).append(" or username = '").append((String)localObject3).append("'");
        }
        localObject3 = ((StringBuilder)localObject2).toString();
        ab.d("MicroMsg.App.BizInfoDataTransfer", "update sql %s", new Object[] { localObject3 });
        z.aeR().hY("BizInfo", (String)localObject3);
      }
    }
    AppMethodBeat.o(16429);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.a
 * JD-Core Version:    0.6.2
 */