package com.tencent.mm.plugin.wallet_index.c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.a;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;

final class m$1 extends c<he>
{
  m$1(m paramm)
  {
    AppMethodBeat.i(48195);
    this.xxI = he.class.getName().hashCode();
    AppMethodBeat.o(48195);
  }

  private boolean a(he paramhe)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(48196);
    this.tRn.tRi = paramhe;
    Object localObject1 = this.tRn.tRi.cBW.result;
    if (this.tRn.tRi.cBW.cBY != null)
      this.tRn.tRh = this.tRn.tRi.cBW.cBY.getInt("pay_channel", 0);
    switch (this.tRn.tRi.cBW.actionCode)
    {
    default:
      AppMethodBeat.o(48196);
    case 12:
    case 10:
    case 11:
    }
    while (true)
    {
      return bool;
      m localm = this.tRn;
      ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "startBind reqKey = ".concat(String.valueOf(localObject1)));
      String[] arrayOfString = ((String)localObject1).replace("http://p.weixin.qq.com?", "").split("&");
      int j = arrayOfString.length;
      Object localObject2 = null;
      paramhe = null;
      localObject1 = null;
      if (i < j)
      {
        String str = arrayOfString[i];
        Object localObject3;
        Object localObject4;
        if (str.startsWith("errcode="))
        {
          localObject3 = str.replace("errcode=", "");
          localObject4 = paramhe;
        }
        while (true)
        {
          i++;
          paramhe = (he)localObject4;
          localObject1 = localObject3;
          break;
          if (str.startsWith("errmsg="))
          {
            localObject4 = str.replace("errmsg=", "");
            localObject3 = localObject1;
          }
          else
          {
            localObject4 = paramhe;
            localObject3 = localObject1;
            if (str.startsWith("importkey="))
            {
              localObject2 = str.replace("importkey=", "");
              localObject4 = paramhe;
              localObject3 = localObject1;
            }
          }
        }
      }
      if (("0".equals(localObject1)) && (!bo.isNullOrNil((String)localObject2)))
      {
        localObject1 = localm.tRi.cBW.context;
        paramhe = new Intent();
        paramhe.putExtra("key_import_key", (String)localObject2);
        paramhe.putExtra("key_bind_scene", 2);
        paramhe.putExtra("key_custom_bind_tips", null);
        d.b((Context)localObject1, "wallet", ".bind.ui.WalletBindUI", paramhe);
        if (localm.tRi.callback != null)
        {
          localm.tRi.cBX.ret = 1;
          localm.tRi.callback.run();
        }
      }
      while (true)
      {
        AppMethodBeat.o(48196);
        bool = true;
        break;
        localObject1 = paramhe;
        if (bo.isNullOrNil(paramhe))
          localObject1 = localm.tRi.cBW.context.getString(2131305389);
        com.tencent.mm.ui.base.h.a(localm.tRi.cBW.context, (String)localObject1, "", new m.6(localm));
      }
      a.xxA.c(this.tRn);
      ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "ReqKey = ".concat(String.valueOf(localObject1)));
      if (localObject1 != null)
      {
        if (((String)localObject1).startsWith("weixin://wxpay"))
          if (bp.dpL())
          {
            ab.i("MicroMsg.WalletGetA8KeyRedirectListener", "go pay test logic");
            localObject2 = new mf();
            ((mf)localObject2).cHZ.url = ((String)localObject1);
            ((mf)localObject2).cHZ.scene = 4;
            ((mf)localObject2).cHZ.cIb = 12;
            ((mf)localObject2).cHZ.cvp = 0;
            ((mf)localObject2).cHZ.source = "";
            ((mf)localObject2).cHZ.context = paramhe.cBW.context;
            m.a(this.tRn, (mf)localObject2);
            Toast.makeText(paramhe.cBW.context, "click to do pay test", 1).show();
          }
        while (true)
        {
          AppMethodBeat.o(48196);
          bool = true;
          break;
          this.tRn.tRg = 4;
          g.RQ();
          g.RO().eJo.a(233, this.tRn);
          paramhe = new com.tencent.mm.modelsimple.h((String)localObject1, this.tRn.tRi.cBW.username, 4, 0, (int)System.currentTimeMillis(), new byte[0]);
          g.RQ();
          g.RO().eJo.a(paramhe, 0);
          this.tRn.tRk = System.currentTimeMillis();
          continue;
          this.tRn.tRg = 1;
          m.a(this.tRn, (String)localObject1, this.tRn.tRh);
        }
      }
      AppMethodBeat.o(48196);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.m.1
 * JD-Core Version:    0.6.2
 */