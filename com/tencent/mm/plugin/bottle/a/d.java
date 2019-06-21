package com.tencent.mm.plugin.bottle.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import java.util.HashMap;

public final class d
  implements com.tencent.mm.model.at
{
  private static HashMap<Integer, h.d> eaA;
  private be.a flN;
  private b jJM;

  static
  {
    AppMethodBeat.i(18543);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("THROWBOTTLEINFO_TABLE".hashCode()), new d.1());
    AppMethodBeat.o(18543);
  }

  public d()
  {
    AppMethodBeat.i(18538);
    this.flN = new be.a()
    {
      public final void a(ak paramAnonymousak, be paramAnonymousbe)
      {
        AppMethodBeat.i(18537);
        if (paramAnonymousak == null)
          AppMethodBeat.o(18537);
        while (true)
        {
          return;
          if ("_USER_FOR_THROWBOTTLE_".equals(paramAnonymousak.field_username))
          {
            paramAnonymousak.setUsername("");
            AppMethodBeat.o(18537);
          }
          else
          {
            if ((1 != paramAnonymousak.field_isSend) && (ad.mR(paramAnonymousak.field_username)) && (!paramAnonymousbe.MV(paramAnonymousak.field_username)))
              c.FA(paramAnonymousak.field_username);
            AppMethodBeat.o(18537);
          }
        }
      }
    };
    AppMethodBeat.o(18538);
  }

  private static d aVL()
  {
    AppMethodBeat.i(18539);
    aw.ZE();
    d locald1 = (d)bw.oJ("plugin.bottle");
    d locald2 = locald1;
    if (locald1 == null)
    {
      locald2 = new d();
      aw.ZE().a("plugin.bottle", locald2);
    }
    AppMethodBeat.o(18539);
    return locald2;
  }

  public static b aVM()
  {
    AppMethodBeat.i(18540);
    g.RN().QU();
    if (aVL().jJM == null)
    {
      localObject = aVL();
      aw.ZK();
      ((d)localObject).jJM = new b(com.tencent.mm.model.c.Ru());
    }
    Object localObject = aVL().jJM;
    AppMethodBeat.o(18540);
    return localObject;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(18542);
    c.aVK();
    aw.ZK();
    com.tencent.mm.model.c.XR().c(this.flN);
    AppMethodBeat.o(18542);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(18541);
    aw.ZK();
    com.tencent.mm.model.c.XR().d(this.flN);
    AppMethodBeat.o(18541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.a.d
 * JD-Core Version:    0.6.2
 */