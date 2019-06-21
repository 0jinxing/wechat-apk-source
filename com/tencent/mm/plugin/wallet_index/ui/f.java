package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.protocal.protobuf.aui;
import com.tencent.mm.protocal.protobuf.bid;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.z;
import java.util.ArrayList;

public final class f
  implements b
{
  private c tRr;
  private final int tSp;
  private d tSq;
  private com.tencent.mm.sdk.b.c tSr;

  public f(c paramc, com.tencent.mm.sdk.b.c paramc1)
  {
    AppMethodBeat.i(48313);
    this.tSp = (hashCode() & 0xFFFF);
    this.tSq = null;
    this.tRr = paramc;
    this.tSr = paramc1;
    a.xxA.c(this.tSr);
    AppMethodBeat.o(48313);
  }

  public final int a(MMActivity paramMMActivity, d paramd)
  {
    AppMethodBeat.i(48314);
    ab.i("MicroMsg.WeiXinWallet", "[alex] WeiXinWallet launchPay MiniProgram:%b,taskid:%d", new Object[] { Boolean.valueOf(this.tRr.tRE), Integer.valueOf(paramMMActivity.getTaskId()) });
    z.dNW();
    this.tSq = paramd;
    if (this.tRr.tRE)
      if (this.tRr.tRf != null)
      {
        paramd = new g();
        paramd.appId = this.tRr.tRf.wyt.app_id;
        paramd.timeStamp = this.tRr.tRf.wyt.tyv;
        paramd.nonceStr = this.tRr.tRf.wyt.kmt;
        paramd.packageExt = this.tRr.tRf.wyt.wLu;
        paramd.signType = this.tRr.tRf.wyt.kmr;
        paramd.cId = this.tRr.tRf.wys;
        paramd.cIf = this.tRr.tRf.cIf;
        paramd.vwz = "key_from_scene_appbrandgame";
        h.a(paramMMActivity, paramd, this.tSp, null);
      }
    while (true)
    {
      ab.e("MicroMsg.WeiXinWallet", "launchPay return SIMPLE_PAY:%d", new Object[] { Integer.valueOf(this.tSp) });
      int i = this.tSp;
      AppMethodBeat.o(48314);
      return i;
      ab.e("MicroMsg.WeiXinWallet", "[alex] mIapData.iapWxPayData is null");
      continue;
      paramd = new PayInfo();
      paramd.czZ = this.tRr.tRf.wyq;
      paramd.partnerId = this.tRr.tRf.wyr;
      paramd.cQF = this.tRr.tRf.wys;
      paramd.cIf = 5;
      h.a(paramMMActivity, paramd, this.tSp);
    }
  }

  public final void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(48318);
    if (paramd != null)
      paramd.a(com.tencent.mm.plugin.wallet_index.c.b.bu(0, ""), new com.tencent.mm.plugin.wallet_index.b.a.c(this.tRr.kWz, this.tRr.tRw, this.tRr.tQX, this.tRr.tQY));
    AppMethodBeat.o(48318);
  }

  public final boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48315);
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.WeiXinWallet", "onPayEnd requestCode : %d,payResult : %d, data is null : %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 == this.tSp) && (this.tSq != null))
      {
        if (paramInt2 != -1)
          break label181;
        if ((paramIntent == null) || (paramIntent.getIntExtra("key_jsapi_pay_err_code", 0) != 0))
          break label171;
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(0, "");
      }
    }
    while (true)
    {
      ab.i("MicroMsg.WeiXinWallet", "wxpay result : %s", new Object[] { paramMMActivity });
      paramIntent = new com.tencent.mm.plugin.wallet_index.b.a.c(this.tRr.kWz, this.tRr.tRw, this.tRr.tQX, this.tRr.tQY);
      this.tSq.a(paramMMActivity, paramIntent);
      this.tSq = null;
      AppMethodBeat.o(48315);
      return true;
      bool = false;
      break;
      label171: paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(5, "");
      continue;
      label181: if (paramInt2 == 0)
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(1, "");
      else
        paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(6, "");
    }
  }

  public final void b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(48317);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", 0);
    localIntent.putExtra("key_err_msg", "");
    paramMMActivity.setResult(-1, localIntent);
    paramMMActivity.finish();
    AppMethodBeat.o(48317);
  }

  public final int cSW()
  {
    return 2;
  }

  public final void l(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(48316);
    a.xxA.d(this.tSr);
    AppMethodBeat.o(48316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.f
 * JD-Core Version:    0.6.2
 */