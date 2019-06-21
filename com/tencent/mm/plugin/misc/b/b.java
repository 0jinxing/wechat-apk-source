package com.tencent.mm.plugin.misc.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.model.bj;
import com.tencent.mm.network.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements f, c, com.tencent.mm.plugin.misc.a.a
{
  private static ap che = null;
  private static String oro = "";
  private static String orp = "";
  private int fmQ;
  private int fmR;
  private n fyJ;
  private boolean orl;
  private long orm;
  private long orn;
  private final Map<Integer, Set<Object>> orq;
  private int type;

  public b()
  {
    AppMethodBeat.i(50514);
    this.orl = false;
    this.fmQ = 0;
    this.fmR = 0;
    this.type = 0;
    this.orm = 0L;
    this.orn = 60L;
    this.orq = new HashMap();
    this.fyJ = new b.2(this);
    AppMethodBeat.o(50514);
  }

  private static boolean bON()
  {
    boolean bool = false;
    AppMethodBeat.i(50522);
    if (!at.isMobile(ah.getContext()))
      AppMethodBeat.o(50522);
    while (true)
    {
      return bool;
      int i = at.getISPCode(ah.getContext());
      ab.i("MicroMsg.SimcardService", "isUnicomNetwork ispcode[%d]", new Object[] { Integer.valueOf(i) });
      if ((i == 46001) || (i == 46006) || (i == 46009))
      {
        AppMethodBeat.o(50522);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(50522);
      }
    }
  }

  private static String bOO()
  {
    AppMethodBeat.i(50523);
    try
    {
      Object localObject1;
      InetAddress localInetAddress;
      do
      {
        localObject1 = NetworkInterface.getNetworkInterfaces();
        Object localObject2;
        while (!((Enumeration)localObject2).hasMoreElements())
        {
          do
          {
            if (!((Enumeration)localObject1).hasMoreElements())
              break;
            localObject2 = (NetworkInterface)((Enumeration)localObject1).nextElement();
          }
          while (localObject2 == null);
          localObject2 = ((NetworkInterface)localObject2).getInetAddresses();
        }
        localInetAddress = (InetAddress)((Enumeration)localObject2).nextElement();
      }
      while ((localInetAddress == null) || (localInetAddress.isLoopbackAddress()) || (!(localInetAddress instanceof Inet4Address)));
      if (bo.isNullOrNil(localInetAddress.getHostAddress()))
      {
        localObject1 = "127.0.0.1";
        AppMethodBeat.o(50523);
      }
      while (true)
      {
        return localObject1;
        localObject1 = localInetAddress.getHostAddress();
        AppMethodBeat.o(50523);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "127.0.0.1";
        AppMethodBeat.o(50523);
      }
    }
  }

  private void yz(int paramInt)
  {
    AppMethodBeat.i(50521);
    ab.i("MicroMsg.SimcardService", "NotifySimTypeChange flag[%d]", new Object[] { Integer.valueOf(paramInt) });
    if (this.orq == null)
      AppMethodBeat.o(50521);
    while (true)
    {
      return;
      Iterator localIterator = this.orq.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        ((Integer)((Map.Entry)localObject).getKey()).intValue();
        localObject = ((Set)((Map.Entry)localObject).getValue()).iterator();
        while (((Iterator)localObject).hasNext())
          ((Iterator)localObject).next();
      }
      AppMethodBeat.o(50521);
    }
  }

  public final int bOK()
  {
    int i = 2;
    AppMethodBeat.i(50518);
    if (!bON())
      AppMethodBeat.o(50518);
    while (true)
    {
      return i;
      yy(1);
      if (2 == this.type)
      {
        AppMethodBeat.o(50518);
        i = 0;
      }
      else if (this.orl)
      {
        if ((this.fmQ & 0x2) == 0)
        {
          AppMethodBeat.o(50518);
        }
        else
        {
          AppMethodBeat.o(50518);
          i = 1;
        }
      }
      else
      {
        AppMethodBeat.o(50518);
        i = 0;
      }
    }
  }

  public final int bOL()
  {
    AppMethodBeat.i(50519);
    int i;
    if (!bON())
    {
      i = 0;
      AppMethodBeat.o(50519);
    }
    while (true)
    {
      return i;
      i = this.fmR;
      AppMethodBeat.o(50519);
    }
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(50515);
    if (che == null)
    {
      paramc = new ap(new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(50512);
          if (!g.RN().QY())
          {
            ab.w("MicroMsg.SimcardService", "account not init.");
            AppMethodBeat.o(50512);
            return true;
          }
          ab.i("MicroMsg.SimcardService", "CheckMobileSIMType Timer");
          if (b.a(b.this) == 0L)
            b.this.yy(0);
          while (true)
          {
            AppMethodBeat.o(50512);
            break;
            b.this.yy(3);
          }
        }
      }
      , true);
      che = paramc;
      paramc.ae(30000L, 30000L);
    }
    g.Rg().a(813, this);
    g.RO().a(this.fyJ);
    AppMethodBeat.o(50515);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(50516);
    g.Rg().b(813, this);
    AppMethodBeat.o(50516);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(50517);
    che.stopTimer();
    che.ae(86400000L, 86400000L);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.orn = 60L;
      ab.e("MicroMsg.SimcardService", "CheckMobileSimType error:(" + paramInt1 + "," + paramInt2 + ")");
      yz(this.fmQ);
      AppMethodBeat.o(50517);
      return;
    }
    paramString = (bj)paramm;
    this.orl = true;
    this.fmR = paramString.fmR;
    this.type = paramString.type;
    this.fmQ = paramString.fmQ;
    if ((paramString.fmS < 60L) || (paramString.fmS > 86400L));
    for (this.orn = 28800L; ; this.orn = paramString.fmS)
    {
      ab.i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", new Object[] { Integer.valueOf(this.type), Integer.valueOf(this.fmR), Integer.valueOf(this.fmQ), Integer.valueOf(paramString.fmS) });
      yz(this.fmQ);
      AppMethodBeat.o(50517);
      break;
    }
  }

  public final void yy(int paramInt)
  {
    AppMethodBeat.i(50520);
    if (!bON())
      AppMethodBeat.o(50520);
    while (true)
    {
      return;
      if (this.orm != 0L)
      {
        long l1 = bo.anT();
        ab.i("MicroMsg.SimcardService", "CheckMobileSIMType scene[%d] cacheExpiredTime[%d] lastCheckMobileSIMTypeTime[%d] now[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.orn), Long.valueOf(this.orm), Long.valueOf(l1) });
        if (paramInt != 2)
        {
          long l2 = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("NetInfoCheckMobileSimTypeCacheTime", 28800);
          long l3 = l2;
          if (l2 > this.orn)
            l3 = this.orn;
          if (l1 - this.orm < l3)
            AppMethodBeat.o(50520);
        }
        else if (l1 - this.orm < 60L)
        {
          AppMethodBeat.o(50520);
        }
      }
      else
      {
        this.orm = bo.anT();
        oro = q.LX();
        orp = bOO();
        ab.i("MicroMsg.SimcardService", "CheckMobileSIMType start");
        bj localbj = new bj(paramInt, orp, q.LK(), oro);
        g.Rg().a(localbj, 0);
        AppMethodBeat.o(50520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.misc.b.b
 * JD-Core Version:    0.6.2
 */