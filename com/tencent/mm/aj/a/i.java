package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;

public final class i
{
  private static void aI(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11591);
    long l = e.ry(paramString1);
    if (l == -1L)
    {
      ab.i("MicroMsg.BizChatStatusNotifyService", "qy_status_notify bizLocalId == -1,%s", new Object[] { paramString1 });
      AppMethodBeat.o(11591);
    }
    while (true)
    {
      return;
      int i = z.aeU().fv(l).field_newUnReadCount;
      z.aeU().fx(l);
      c localc = z.aeT().aK(l);
      paramString1 = ((j)g.K(j.class)).XR().aoZ(paramString2);
      if (paramString1 == null)
      {
        ab.w("MicroMsg.BizChatStatusNotifyService", "qy_status_notify cvs == null:%s", new Object[] { paramString2 });
        AppMethodBeat.o(11591);
      }
      else if (localc.lc(1))
      {
        if (paramString1.field_unReadMuteCount <= i)
        {
          paramString1.hS(0);
          ((j)g.K(j.class)).XR().a(paramString1, paramString2);
          ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
          AppMethodBeat.o(11591);
        }
        else
        {
          paramString1.hS(paramString1.field_unReadMuteCount - i);
          ((j)g.K(j.class)).XR().a(paramString1, paramString2);
          AppMethodBeat.o(11591);
        }
      }
      else if (paramString1.field_unReadCount <= i)
      {
        ((j)g.K(j.class)).XR().apb(paramString2);
        ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
        AppMethodBeat.o(11591);
      }
      else
      {
        paramString1.hR(0);
        paramString1.hM(paramString1.field_unReadCount - i);
        ((j)g.K(j.class)).XR().a(paramString1, paramString2);
        AppMethodBeat.o(11591);
      }
    }
  }

  public static void h(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(11590);
    if (!"EnterpriseChatStatus".equals(paramString1))
      AppMethodBeat.o(11590);
    while (true)
    {
      return;
      String[] arrayOfString = paramString2.split(";");
      paramString1 = arrayOfString[0];
      paramString2 = arrayOfString[1];
      bo.getInt(arrayOfString[2], 0);
      if (paramInt == 7)
      {
        aI(paramString2, paramString1);
        AppMethodBeat.o(11590);
      }
      else if (paramInt == 8)
      {
        aI(paramString2, paramString1);
        AppMethodBeat.o(11590);
      }
      else
      {
        if (paramInt == 9)
          aI(paramString2, paramString1);
        AppMethodBeat.o(11590);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.i
 * JD-Core Version:    0.6.2
 */