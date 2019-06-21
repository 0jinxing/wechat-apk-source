package com.tencent.mm.plugin.card.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
  implements b
{
  public final boolean bbn()
  {
    AppMethodBeat.i(87965);
    boolean bool = l.beC();
    AppMethodBeat.o(87965);
    return bool;
  }

  public final boolean bbo()
  {
    AppMethodBeat.i(87966);
    boolean bool = l.beE();
    AppMethodBeat.o(87966);
    return bool;
  }

  public final String bbp()
  {
    AppMethodBeat.i(87967);
    String str = (String)g.RP().Ry().get(ac.a.xKj, null);
    AppMethodBeat.o(87967);
    return str;
  }

  public final int bbq()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(87968);
    Object localObject1 = am.baW();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((c)localObject1).bSd.a((String)localObject2, null, 2);
    if (localObject1 == null);
    while (true)
    {
      ab.i("MicroMsg.CardMgrImpl", "getGiftCardCount:".concat(String.valueOf(j)));
      AppMethodBeat.o(87968);
      return j;
      j = i;
      if (((Cursor)localObject1).moveToFirst())
        j = ((Cursor)localObject1).getInt(0);
      ((Cursor)localObject1).close();
    }
  }

  public final boolean sP(int paramInt)
  {
    AppMethodBeat.i(87969);
    boolean bool = l.sP(paramInt);
    AppMethodBeat.o(87969);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.c.a
 * JD-Core Version:    0.6.2
 */