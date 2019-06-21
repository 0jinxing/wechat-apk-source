package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.a.b;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.f;
import com.tencent.mm.network.h;
import com.tencent.mm.network.i;
import com.tencent.mm.network.l;
import com.tencent.mm.network.o;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class r
  implements e
{
  public final f ftR;
  private q ftS;

  public r(f paramf)
  {
    this.ftR = paramf;
  }

  public final int a(com.tencent.mm.network.r paramr, l paraml)
  {
    AppMethodBeat.i(58228);
    try
    {
      i = this.ftR.a(paramr, paraml);
      AppMethodBeat.o(58228);
      return i;
    }
    catch (Exception paramr)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", new Object[] { paramr });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramr) });
        int i = -1;
        AppMethodBeat.o(58228);
      }
    }
  }

  public final int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    AppMethodBeat.i(58242);
    try
    {
      i = this.ftR.a(paramString, paramBoolean, paramList);
      AppMethodBeat.o(58242);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        int i = -1;
        AppMethodBeat.o(58242);
      }
    }
  }

  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(58244);
    try
    {
      this.ftR.a(paramInt1, paramString, paramInt2, paramBoolean);
      AppMethodBeat.o(58244);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58244);
      }
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(58235);
    try
    {
      this.ftR.a(paramb);
      AppMethodBeat.o(58235);
      return;
    }
    catch (Exception paramb)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramb) });
        AppMethodBeat.o(58235);
      }
    }
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(58256);
    try
    {
      this.ftR.a(paramh);
      AppMethodBeat.o(58256);
      return;
    }
    catch (Exception paramh)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramh) });
        AppMethodBeat.o(58256);
      }
    }
  }

  public final void a(o paramo)
  {
    AppMethodBeat.i(58249);
    try
    {
      this.ftR.a(paramo);
      AppMethodBeat.o(58249);
      return;
    }
    catch (Exception paramo)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramo) });
        AppMethodBeat.o(58249);
      }
    }
  }

  public final void a(y paramy)
  {
    AppMethodBeat.i(58239);
    try
    {
      this.ftR.a(paramy);
      AppMethodBeat.o(58239);
      return;
    }
    catch (Exception paramy)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramy) });
        AppMethodBeat.o(58239);
      }
    }
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(58233);
    try
    {
      this.ftR.a(paramBoolean, paramString1, paramString2, paramArrayOfInt1, paramArrayOfInt2, paramInt1, paramInt2, paramString3, paramString4);
      AppMethodBeat.o(58233);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", new Object[] { paramString1 });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString1) });
        AppMethodBeat.o(58233);
      }
    }
  }

  public final boolean acT()
  {
    boolean bool1 = true;
    AppMethodBeat.i(58237);
    try
    {
      boolean bool2 = this.ftR.acT();
      bool1 = bool2;
      AppMethodBeat.o(58237);
      return bool1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58237);
      }
    }
  }

  public final c adg()
  {
    AppMethodBeat.i(58234);
    try
    {
      if (this.ftS == null)
      {
        localq = new com/tencent/mm/ai/q;
        localq.<init>(this.ftR.amM());
        this.ftS = localq;
      }
      q localq = this.ftS;
      AppMethodBeat.o(58234);
      return localq;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58234);
      }
    }
  }

  public final i adh()
  {
    AppMethodBeat.i(58238);
    try
    {
      i locali = this.ftR.amO();
      AppMethodBeat.o(58238);
      return locali;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58238);
      }
    }
  }

  public final void adi()
  {
    AppMethodBeat.i(58255);
    try
    {
      this.ftR.adi();
      AppMethodBeat.o(58255);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58255);
      }
    }
  }

  public final void adj()
  {
    AppMethodBeat.i(58257);
    try
    {
      this.ftR.adj();
      AppMethodBeat.o(58257);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58257);
      }
    }
  }

  public final void cF(boolean paramBoolean)
  {
    AppMethodBeat.i(58236);
    try
    {
      this.ftR.cF(paramBoolean);
      AppMethodBeat.o(58236);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58236);
      }
    }
  }

  public final void cG(boolean paramBoolean)
  {
    AppMethodBeat.i(58252);
    try
    {
      this.ftR.cG(paramBoolean);
      AppMethodBeat.o(58252);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58252);
      }
    }
  }

  public final void cH(boolean paramBoolean)
  {
    AppMethodBeat.i(58253);
    try
    {
      this.ftR.cH(paramBoolean);
      AppMethodBeat.o(58253);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58253);
      }
    }
  }

  public final void cI(boolean paramBoolean)
  {
    AppMethodBeat.i(58254);
    try
    {
      this.ftR.cI(paramBoolean);
      AppMethodBeat.o(58254);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58254);
      }
    }
  }

  public final void cancel(int paramInt)
  {
    AppMethodBeat.i(58231);
    try
    {
      this.ftR.cancel(paramInt);
      AppMethodBeat.o(58231);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", new Object[] { Integer.valueOf(paramInt), localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58231);
      }
    }
  }

  public final int getHostByName(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(58241);
    try
    {
      i = this.ftR.getHostByName(paramString, paramList);
      AppMethodBeat.o(58241);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        int i = -1;
        AppMethodBeat.o(58241);
      }
    }
  }

  public final String[] getIPsString(boolean paramBoolean)
  {
    AppMethodBeat.i(58230);
    try
    {
      String[] arrayOfString = this.ftR.getIPsString(paramBoolean);
      AppMethodBeat.o(58230);
      return arrayOfString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58230);
      }
    }
  }

  public final String getIspId()
  {
    AppMethodBeat.i(58245);
    try
    {
      String str = this.ftR.getIspId();
      AppMethodBeat.o(58245);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58245);
      }
    }
  }

  public final String getNetworkServerIp()
  {
    AppMethodBeat.i(58229);
    try
    {
      String str = this.ftR.getNetworkServerIp();
      AppMethodBeat.o(58229);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58229);
      }
    }
  }

  public final void keepSignalling()
  {
    AppMethodBeat.i(58247);
    try
    {
      this.ftR.keepSignalling();
      AppMethodBeat.o(58247);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58247);
      }
    }
  }

  public final void qs(String paramString)
  {
    AppMethodBeat.i(58240);
    try
    {
      this.ftR.qs(paramString);
      AppMethodBeat.o(58240);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", new Object[] { paramString });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58240);
      }
    }
  }

  public final void qt(String paramString)
  {
    AppMethodBeat.i(58251);
    try
    {
      this.ftR.qt(paramString);
      AppMethodBeat.o(58251);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58251);
      }
    }
  }

  public final void reportFailIp(String paramString)
  {
    AppMethodBeat.i(58250);
    try
    {
      this.ftR.reportFailIp(paramString);
      AppMethodBeat.o(58250);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58250);
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(58232);
    try
    {
      this.ftR.reset();
      AppMethodBeat.o(58232);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "reset failed, core service down, %s", new Object[] { localException });
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58232);
      }
    }
  }

  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(58243);
    try
    {
      this.ftR.setHostInfo(paramArrayOfString1, paramArrayOfString2, paramArrayOfInt);
      AppMethodBeat.o(58243);
      return;
    }
    catch (Exception paramArrayOfString1)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(paramArrayOfString1) });
        AppMethodBeat.o(58243);
      }
    }
  }

  public final void setSignallingStrategy(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(58246);
    try
    {
      this.ftR.setSignallingStrategy(paramLong1, paramLong2);
      AppMethodBeat.o(58246);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58246);
      }
    }
  }

  public final void stopSignalling()
  {
    AppMethodBeat.i(58248);
    try
    {
      this.ftR.stopSignalling();
      AppMethodBeat.o(58248);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58248);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.r
 * JD-Core Version:    0.6.2
 */