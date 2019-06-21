package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

public final class b extends f
{
  private boolean tov;
  private boolean tow;

  public b(com.tencent.mm.plugin.wallet_core.model.s params, Orders paramOrders)
  {
    super(params, paramOrders);
    AppMethodBeat.i(45941);
    this.tov = false;
    cNL();
    AppMethodBeat.o(45941);
  }

  private void cNL()
  {
    AppMethodBeat.i(45942);
    this.tov = false;
    com.tencent.mm.plugin.wallet.a.s.cNC();
    if ((com.tencent.mm.plugin.wallet.a.s.cND().tCZ != null) && (this.tox.pGr != null))
    {
      String str = this.tox.pbn;
      com.tencent.mm.plugin.wallet.a.s.cNC();
      if (str.equals(com.tencent.mm.plugin.wallet.a.s.cND().tCZ.field_bankcardType))
      {
        if ((this.tox.pGr.cIf != 31) && (this.tox.pGr.cIf != 32) && (this.tox.pGr.cIf != 33) && (this.tox.pGr.cIf != 42) && (this.tox.pGr.cIf != 37))
          break label178;
        this.tov = true;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", new Object[] { Boolean.valueOf(this.tov), Boolean.valueOf(this.tow) });
      AppMethodBeat.o(45942);
      return;
      label178: this.tow = true;
    }
  }

  public final int ZU()
  {
    AppMethodBeat.i(45944);
    cNL();
    int i;
    if (this.tov)
    {
      i = 1281;
      AppMethodBeat.o(45944);
    }
    while (true)
    {
      return i;
      if (this.tow)
      {
        i = 1305;
        AppMethodBeat.o(45944);
      }
      else
      {
        i = 1601;
        AppMethodBeat.o(45944);
      }
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(45946);
    if (this.tov)
      h.pYm.a(663L, 26L, 1L, false);
    while (true)
    {
      int i = super.a(parame, paramf);
      AppMethodBeat.o(45946);
      return i;
      if (this.tow)
        h.pYm.a(663L, 22L, 1L, false);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45947);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
      if (this.tov)
      {
        h.pYm.a(663L, 27L, 1L, false);
        AppMethodBeat.o(45947);
      }
    while (true)
    {
      return;
      if (this.tow)
        h.pYm.a(663L, 23L, 1L, false);
      AppMethodBeat.o(45947);
    }
  }

  protected final void aj(Map<String, String> paramMap)
  {
    AppMethodBeat.i(45943);
    cNL();
    if ((this.tov) || (this.tow))
      paramMap.put("busi_scene", this.tox.pbn);
    AppMethodBeat.o(45943);
  }

  public final int bgI()
  {
    return 121;
  }

  public final String getUri()
  {
    AppMethodBeat.i(45945);
    cNL();
    String str;
    if (this.tov)
    {
      str = "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify";
      AppMethodBeat.o(45945);
    }
    while (true)
    {
      return str;
      if (this.tow)
      {
        str = "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify";
        AppMethodBeat.o(45945);
      }
      else
      {
        str = "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
        AppMethodBeat.o(45945);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.d.b
 * JD-Core Version:    0.6.2
 */