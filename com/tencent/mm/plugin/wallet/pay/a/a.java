package com.tencent.mm.plugin.wallet.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.l;
import com.tencent.mm.plugin.wallet.pay.a.a.m;
import com.tencent.mm.plugin.wallet.pay.a.a.n;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static b a(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    AppMethodBeat.i(45907);
    if ((paramAuthen == null) || (paramOrders == null))
    {
      ab.i("MicroMsg.CgiManager", "empty authen or orders");
      paramAuthen = null;
      AppMethodBeat.o(45907);
    }
    while (true)
    {
      return paramAuthen;
      PayInfo localPayInfo = paramAuthen.pGr;
      String str1 = "";
      if (localPayInfo != null)
      {
        ab.i("MicroMsg.CgiManager", "get reqKey from payInfo");
        str1 = localPayInfo.czZ;
      }
      String str2 = str1;
      if (bo.isNullOrNil(str1))
      {
        str2 = str1;
        if (paramOrders != null)
        {
          ab.i("MicroMsg.CgiManager", "get reqKey from orders");
          str2 = paramOrders.czZ;
        }
      }
      if (bo.isNullOrNil(str2))
      {
        ab.i("MicroMsg.CgiManager", "empty reqKey!");
        paramAuthen = new b(paramAuthen, paramOrders, paramBoolean);
        AppMethodBeat.o(45907);
      }
      else
      {
        ab.i("MicroMsg.CgiManager", "authen reqKey: %s", new Object[] { str2 });
        if ((localPayInfo != null) && (paramOrders != null))
          ab.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.czZ, paramOrders.czZ });
        ab.i("MicroMsg.CgiManager", "authen go new split cgi");
        if (str2.startsWith("sns_aa_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.a(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("sns_tf_"))
        {
          paramAuthen = new m(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("sns_ff_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.e(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("ts_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.g(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("sns_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.j(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("offline_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.h(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("up_"))
        {
          paramAuthen = new n(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("seb_ff_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.i(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("tax_"))
        {
          paramAuthen = new l(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else if (str2.startsWith("dc_"))
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.d(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
        else
        {
          paramAuthen = new b(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45907);
        }
      }
    }
  }

  public static com.tencent.mm.plugin.wallet.pay.a.d.f a(com.tencent.mm.plugin.wallet_core.model.s params, Orders paramOrders)
  {
    AppMethodBeat.i(45908);
    if ((params == null) || (paramOrders == null))
    {
      ab.e("MicroMsg.CgiManager", "empty verify or orders");
      params = null;
      AppMethodBeat.o(45908);
    }
    while (true)
    {
      return params;
      PayInfo localPayInfo = params.pGr;
      String str1 = "";
      if (localPayInfo != null)
      {
        ab.i("MicroMsg.CgiManager", "get reqKey from payInfo");
        str1 = localPayInfo.czZ;
      }
      String str2 = str1;
      if (bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.CgiManager", "get reqKey from orders");
        str2 = paramOrders.czZ;
      }
      if (bo.isNullOrNil(str2))
      {
        ab.i("MicroMsg.CgiManager", "empty reqKey!");
        params = new com.tencent.mm.plugin.wallet.pay.a.d.f(params, paramOrders);
        AppMethodBeat.o(45908);
      }
      else
      {
        if (localPayInfo != null)
          ab.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.czZ, paramOrders.czZ });
        ab.i("MicroMsg.CgiManager", "verify reqKey: %s", new Object[] { str2 });
        ab.i("MicroMsg.CgiManager", "verify go new split cgi");
        if (str2.startsWith("sns_aa_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.a(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("sns_tf_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.j(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("sns_ff_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.d(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("ts_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.e(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("sns_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.h(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("up_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.k(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("seb_ff_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.g(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("tax_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.i(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else if (str2.startsWith("dc_"))
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.c(params, paramOrders);
          AppMethodBeat.o(45908);
        }
        else
        {
          params = new com.tencent.mm.plugin.wallet.pay.a.d.f(params, paramOrders);
          AppMethodBeat.o(45908);
        }
      }
    }
  }

  public static com.tencent.mm.plugin.wallet.pay.a.a.c b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    AppMethodBeat.i(45909);
    com.tencent.mm.plugin.wallet.a.s.cNC();
    boolean bool1;
    boolean bool2;
    if ((com.tencent.mm.plugin.wallet.a.s.cND().tCZ != null) && (paramAuthen.pGr != null) && (!paramBoolean))
      if ((paramAuthen.pGr.cIf == 31) || (paramAuthen.pGr.cIf == 32) || (paramAuthen.pGr.cIf == 33) || (paramAuthen.pGr.cIf == 42) || (paramAuthen.pGr.cIf == 37))
      {
        bool1 = false;
        bool2 = true;
      }
    while (true)
    {
      ab.i("MicroMsg.CgiManager", "isLqtSns: %s, isLqtTs: %s, isBalance: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(paramBoolean) });
      if (bool2)
      {
        paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.k(paramAuthen, paramOrders, paramBoolean);
        AppMethodBeat.o(45909);
      }
      while (true)
      {
        return paramAuthen;
        bool1 = true;
        bool2 = false;
        break;
        if (bool1)
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.f(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45909);
        }
        else
        {
          paramAuthen = new com.tencent.mm.plugin.wallet.pay.a.a.c(paramAuthen, paramOrders, paramBoolean);
          AppMethodBeat.o(45909);
        }
      }
      bool1 = false;
      bool2 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.a
 * JD-Core Version:    0.6.2
 */