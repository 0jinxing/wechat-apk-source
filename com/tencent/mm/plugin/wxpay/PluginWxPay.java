package com.tencent.mm.plugin.wxpay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.ci.h;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.mall.a.j;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.wallet_core.c.y;
import java.util.HashMap;

public class PluginWxPay extends f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.plugin.wxpay.a.a
{
  private h<y> uZH;
  private com.tencent.mm.sdk.b.c<lm> uZI;

  public PluginWxPay()
  {
    AppMethodBeat.i(48758);
    this.uZH = new h(new PluginWxPay.1(this));
    this.uZI = new PluginWxPay.2(this);
    AppMethodBeat.o(48758);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(48764);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("WALLET_CACHE".hashCode()), new PluginWxPay.3(this));
    AppMethodBeat.o(48764);
    return localHashMap;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(48761);
    if (paramg.SG())
    {
      pin(new q(com.tencent.mm.plugin.aa.b.class));
      pin(new q(com.tencent.mm.plugin.collect.a.a.class));
      pin(new q(com.tencent.mm.plugin.luckymoney.b.a.class));
      pin(new q(j.class));
      pin(new q(k.class));
      pin(new q(com.tencent.mm.plugin.order.a.b.class));
      pin(new q(com.tencent.mm.plugin.product.a.a.class));
      pin(new q(com.tencent.mm.plugin.recharge.a.a.class));
      pin(new q(com.tencent.mm.plugin.remittance.a.c.class));
      pin(new q(s.class));
      pin(new q(r.class));
      pin(new q(com.tencent.mm.plugin.wallet_index.a.a.class));
      pin(new q(com.tencent.mm.plugin.wallet_payu.a.d.class));
      pin(new q(com.tencent.mm.plugin.wxcredit.a.class));
      pin(new q(com.tencent.mm.plugin.fingerprint.a.class));
      pin(new q(com.tencent.mm.plugin.wallet_ecard.a.class));
      pin(new q(com.tencent.mm.plugin.honey_pay.a.class));
    }
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.luckymoney.appbrand.a.class, new e(new com.tencent.mm.plugin.luckymoney.appbrand.b()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.luckymoney.a.a.class, new e(new com.tencent.mm.plugin.luckymoney.model.l()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.remittance.a.class, new e(new com.tencent.mm.plugin.remittance.a.b()));
    AppMethodBeat.o(48761);
  }

  public void dependency()
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(48762);
    if (paramg.SG())
    {
      com.tencent.mm.bp.c.aks("wallet");
      com.tencent.mm.bp.c.aks("mall");
      com.tencent.mm.bp.c.aks("wxcredit");
      com.tencent.mm.bp.c.aks("offline");
      com.tencent.mm.bp.c.aks("recharge");
      com.tencent.mm.bp.c.aks("wallet_index");
      com.tencent.mm.bp.c.aks("order");
      com.tencent.mm.bp.c.aks("product");
      com.tencent.mm.bp.c.aks("remittance");
      com.tencent.mm.bp.c.aks("collect");
      com.tencent.mm.bp.c.aks("wallet_payu");
      com.tencent.mm.bp.c.aks("luckymoney");
      com.tencent.mm.bp.c.aks("fingerprint");
    }
    AppMethodBeat.o(48762);
  }

  public y getWalletCacheStg()
  {
    AppMethodBeat.i(48763);
    if (!com.tencent.mm.kernel.g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(48763);
      throw ((Throwable)localObject);
    }
    Object localObject = (y)this.uZH.get();
    AppMethodBeat.o(48763);
    return localObject;
  }

  public void installed()
  {
    AppMethodBeat.i(48759);
    alias(com.tencent.mm.plugin.wxpay.a.a.class);
    com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.l.class, new com.tencent.mm.plugin.fingerprint.b.d());
    this.uZI.dnU();
    AppMethodBeat.o(48759);
  }

  public String name()
  {
    return "plugin-wxpay";
  }

  public void uninstalled()
  {
    AppMethodBeat.i(48760);
    super.uninstalled();
    this.uZI.dead();
    AppMethodBeat.o(48760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxpay.PluginWxPay
 * JD-Core Version:    0.6.2
 */