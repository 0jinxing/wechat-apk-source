package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class c extends j<CardInfo>
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(87828);
    fnj = new String[] { j.a(CardInfo.ccO, "UserCardInfo"), "CREATE INDEX IF NOT EXISTS  stickyIndexIndex ON UserCardInfo ( stickyIndex ) " };
    AppMethodBeat.o(87828);
  }

  public c(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, CardInfo.ccO, "UserCardInfo", null);
    this.bSd = parame;
  }

  public final CardInfo Gu(String paramString)
  {
    AppMethodBeat.i(87826);
    CardInfo localCardInfo = new CardInfo();
    localCardInfo.field_card_id = paramString;
    if (super.b(localCardInfo, new String[0]))
    {
      AppMethodBeat.o(87826);
      paramString = localCardInfo;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(87826);
    }
  }

  public final Cursor a(n.a parama)
  {
    AppMethodBeat.i(87825);
    long l = bo.anT();
    Object localObject = "update UserCardInfo set stickyIndex=0, stickyEndTime=0 where stickyIndex>0 and (" + l + ">stickyEndTime and stickyEndTime<>0)";
    this.bSd.hY("UserCardInfo", (String)localObject);
    localObject = new StringBuilder("select * from UserCardInfo");
    switch (c.1.kdd[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      ((StringBuilder)localObject).append(" order by stickyIndex desc, status asc , updateTime desc");
      if (parama == n.a.kdP)
      {
        int i = ((Integer)g.RP().Ry().get(ac.a.xKE, Integer.valueOf(3))).intValue();
        ((StringBuilder)localObject).append(" LIMIT ").append(i);
      }
      parama = this.bSd.rawQuery(((StringBuilder)localObject).toString(), null);
      AppMethodBeat.o(87825);
      return parama;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) AND card_type=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) AND card_type!=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) AND card_type!=10 AND card_type!=30");
      continue;
      ((StringBuilder)localObject).append(" where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
    }
  }

  public final List<CardInfo> baL()
  {
    AppMethodBeat.i(87827);
    Cursor localCursor = this.bSd.rawQuery("select * from UserCardInfo where is_dynamic=?", new String[] { "1" });
    Object localObject1;
    if (localCursor == null)
    {
      ab.e("MicroMsg.CardInfoStorage", "getCardInfoList by is_dynamic is failure! cu is null!");
      localObject1 = null;
      AppMethodBeat.o(87827);
    }
    while (true)
    {
      return localObject1;
      localObject1 = new ArrayList();
      try
      {
        while (localCursor.moveToNext())
        {
          CardInfo localCardInfo = new com/tencent/mm/plugin/card/model/CardInfo;
          localCardInfo.<init>();
          localCardInfo.d(localCursor);
          ((List)localObject1).add(localCardInfo);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardInfoStorage", "getCardInfoList by is_dynamic is failure! is_dynamic = true", new Object[] { localException.getMessage() });
        localCursor.close();
        while (true)
        {
          AppMethodBeat.o(87827);
          break;
          localCursor.close();
        }
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(87827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.c
 * JD-Core Version:    0.6.2
 */