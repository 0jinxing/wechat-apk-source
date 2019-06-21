package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import junit.framework.Assert;

public final class i
{
  public static int a(String paramString, final long paramLong, bf.a parama)
  {
    AppMethodBeat.i(11229);
    ab.d("MicroMsg.BizConversationLogic", "deleteMsgByBizChatId %s", new Object[] { Long.valueOf(paramLong) });
    g.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(11226);
        Cursor localCursor = ((com.tencent.mm.aj.o)g.K(com.tencent.mm.aj.o.class)).XP().aP(this.ewn, paramLong);
        if (localCursor.moveToFirst())
          while ((!localCursor.isAfterLast()) && ((this.fkF == null) || (!this.fkF.JU())))
          {
            bi localbi = new bi();
            localbi.d(localCursor);
            bf.m(localbi);
            localCursor.moveToNext();
          }
        localCursor.close();
        ((com.tencent.mm.aj.o)g.K(com.tencent.mm.aj.o.class)).XP().aO(this.ewn, paramLong);
        al.d(new i.1.1(this));
        AppMethodBeat.o(11226);
      }

      public final String toString()
      {
        AppMethodBeat.i(11227);
        String str = super.toString() + "|deleteMsgByTalker";
        AppMethodBeat.o(11227);
        return str;
      }
    });
    AppMethodBeat.o(11229);
    return 0;
  }

  public static void mn(String paramString)
  {
    AppMethodBeat.i(11228);
    if (!bo.isNullOrNil(paramString));
    Object localObject;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      localObject = ((j)g.K(j.class)).XM().aoO(paramString);
      if ((localObject != null) && (!bo.isNullOrNil(((ap)localObject).field_username)))
        break;
      AppMethodBeat.o(11228);
      return;
    }
    ((ad)localObject).setType(((ap)localObject).field_type | 0x800);
    t.u((ad)localObject);
    if ((((j)g.K(j.class)).XR().aoZ(paramString) == null) && (((ad)localObject).dsf()))
    {
      if (!f.qZ(paramString))
        break label259;
      if (((j)g.K(j.class)).XR().aoZ("officialaccounts") == null)
      {
        localObject = new ak("officialaccounts");
        ((ak)localObject).dsI();
        ((j)g.K(j.class)).XR().d((ak)localObject);
      }
      localObject = new ak(paramString);
      ((ak)localObject).eD(System.currentTimeMillis());
      ((ak)localObject).jj("officialaccounts");
      ((j)g.K(j.class)).XR().d((ak)localObject);
    }
    while (true)
    {
      ab.i("MicroMsg.BizConversationLogic", "setPlacedTop username = ".concat(String.valueOf(paramString)));
      ((j)g.K(j.class)).XR().apf(paramString);
      AppMethodBeat.o(11228);
      break;
      label259: if ((f.rb(paramString)) && (!f.kq(paramString)))
      {
        localObject = f.qX(paramString);
        if (((j)g.K(j.class)).XR().aoZ(((d)localObject).field_enterpriseFather) == null)
        {
          localak = new ak(((d)localObject).field_enterpriseFather);
          localak.dsI();
          ((j)g.K(j.class)).XR().d(localak);
        }
        ak localak = new ak(paramString);
        localak.eD(System.currentTimeMillis());
        localak.jj(((d)localObject).adX());
        ((j)g.K(j.class)).XR().d(localak);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.i
 * JD-Core Version:    0.6.2
 */