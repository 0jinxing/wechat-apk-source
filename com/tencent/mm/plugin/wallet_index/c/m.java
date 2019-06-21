package com.tencent.mm.plugin.wallet_index.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.a;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.g.a.mf.a;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.csj;
import com.tencent.mm.protocal.protobuf.nb;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.tenpay.model.o;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class m extends c<uv>
  implements f
{
  int tRg;
  int tRh;
  he tRi;
  mf tRj;
  long tRk;
  public c tRl;
  public c<mf> tRm;

  public m()
  {
    AppMethodBeat.i(48205);
    this.tRh = 0;
    this.tRl = new m.1(this);
    this.tRm = new m.2(this);
    this.xxI = uv.class.getName().hashCode();
    AppMethodBeat.o(48205);
  }

  private void du(String paramString, int paramInt)
  {
    AppMethodBeat.i(48207);
    ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay reqKey = ".concat(String.valueOf(paramString)));
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.cIf = this.tRg;
    String[] arrayOfString = paramString.replace("http://p.qq.com?", "").split("&");
    int i = arrayOfString.length;
    int j = 0;
    paramString = null;
    Object localObject1 = null;
    String str2;
    if (j < i)
    {
      String str1 = arrayOfString[j];
      Object localObject2;
      if (str1.startsWith("errcode="))
      {
        localObject2 = str1.replace("errcode=", "");
        str2 = paramString;
      }
      while (true)
      {
        j++;
        paramString = str2;
        localObject1 = localObject2;
        break;
        if (str1.startsWith("errmsg="))
        {
          str2 = str1.replace("errmsg=", "");
          localObject2 = localObject1;
        }
        else if (str1.startsWith("reqkey="))
        {
          localPayInfo.czZ = str1.replace("reqkey=", "");
          str2 = paramString;
          localObject2 = localObject1;
        }
        else if (str1.startsWith("uuid="))
        {
          localPayInfo.eCq = str1.replace("uuid=", "");
          str2 = paramString;
          localObject2 = localObject1;
        }
        else if (str1.startsWith("appid="))
        {
          localPayInfo.appId = str1.replace("appid=", "");
          str2 = paramString;
          localObject2 = localObject1;
        }
        else if (str1.startsWith("appsource="))
        {
          localPayInfo.tRb = str1.replace("appsource=", "");
          str2 = paramString;
          localObject2 = localObject1;
        }
        else
        {
          str2 = paramString;
          localObject2 = localObject1;
          if (str1.startsWith("productid="))
          {
            localPayInfo.cwg = str1.replace("productid=", "");
            str2 = paramString;
            localObject2 = localObject1;
          }
        }
      }
    }
    localPayInfo.cIb = paramInt;
    if ("0".equals(localObject1))
    {
      com.tencent.mm.pluginsdk.wallet.h.a(this.tRi.cBW.context, localPayInfo, 0);
      if (this.tRi.callback != null)
      {
        this.tRi.cBX.ret = 1;
        this.tRi.callback.run();
      }
    }
    while (true)
    {
      if ((!TextUtils.isEmpty(localObject1)) && (Pattern.compile("[0-9]*").matcher(localObject1).matches()))
        i(0, Integer.valueOf(localObject1).intValue(), 0L);
      AppMethodBeat.o(48207);
      return;
      str2 = paramString;
      if (bo.isNullOrNil(paramString))
        str2 = this.tRi.cBW.context.getString(2131305389);
      com.tencent.mm.ui.base.h.a(this.tRi.cBW.context, str2, "", new m.5(this));
    }
  }

  private void i(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(48208);
    int i = 132;
    if (this.tRg == 1)
      i = 163;
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(i);
    localIDKey1.SetValue(1L);
    localIDKey1.SetKey(26);
    localArrayList.add(localIDKey1);
    IDKey localIDKey2;
    IDKey localIDKey3;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue(1L);
      localIDKey2.SetKey(8);
      if (paramInt2 < 0)
        localIDKey1.SetKey(9);
    }
    else if ((this.tRg == 4) && (paramLong > 0L))
    {
      localIDKey3 = new IDKey();
      localIDKey3.SetID(i);
      localIDKey3.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue((int)paramLong);
      localIDKey3.SetKey(0);
      if (paramLong > 1000L)
        break label302;
      localIDKey2.SetKey(1);
      localIDKey1.SetKey(4);
    }
    while (true)
    {
      localArrayList.add(localIDKey3);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey1);
      com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, true);
      AppMethodBeat.o(48208);
      return;
      if (paramInt2 <= 0)
        break;
      localIDKey1.SetKey(10);
      break;
      label302: if ((paramLong > 1000L) && (paramLong <= 3000L))
      {
        localIDKey2.SetKey(2);
        localIDKey1.SetKey(5);
      }
      else if (paramLong > 3000L)
      {
        localIDKey2.SetKey(3);
        localIDKey1.SetKey(6);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(48206);
    if ((paramm instanceof com.tencent.mm.modelsimple.h))
    {
      long l = System.currentTimeMillis() - this.tRk;
      com.tencent.mm.plugin.report.service.h.pYm.e(11170, new Object[] { Integer.valueOf(233), Integer.valueOf(0), Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(at.getNetType(ah.getContext())), "" });
      i(paramInt1, paramInt2, l);
      ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
      g.RQ();
      g.RO().eJo.b(233, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = this.tRi.cBW.context.getString(2131305389);
        com.tencent.mm.ui.base.h.a(this.tRi.cBW.context, paramm, "", new m.3(this));
        AppMethodBeat.o(48206);
      }
    }
    while (true)
    {
      return;
      du(((com.tencent.mm.modelsimple.h)paramm).aiT(), this.tRh);
      AppMethodBeat.o(48206);
      continue;
      if ((paramm instanceof o))
      {
        ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "native auth, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        g.RQ();
        g.RO().eJo.b(385, this);
        if ((paramInt1 != 0) || (paramInt2 != 0) || (!"0".equals(((o)paramm).AgN)))
        {
          if (this.tRj.callback != null)
            this.tRj.cIa.ret = 1;
          if (!bo.isNullOrNil(paramString));
          while (true)
          {
            ad.o(this.tRg, "", paramInt2);
            com.tencent.mm.ui.base.h.a(this.tRj.cHZ.context, paramString, "", new m.4(this));
            AppMethodBeat.o(48206);
            break;
            if (!bo.isNullOrNil(((o)paramm).hwA))
              paramString = ((o)paramm).hwA;
            else
              paramString = this.tRj.cHZ.context.getString(2131305389);
          }
        }
        if (this.tRj.callback != null)
        {
          this.tRj.cIa.ret = 2;
          this.tRj.callback.run();
        }
        ad.o(this.tRg, ((o)paramm).czZ, paramInt2);
        paramString = ((o)paramm).tRc;
        if ((paramString != null) && (!bo.isNullOrNil(paramString.xpI)))
        {
          paramm = (o)paramm;
          paramString = new Intent();
          paramString.putExtra("prepayId", paramm.czZ);
          paramString.putExtra("is_jsapi_offline_pay", false);
          paramm = paramm.tRc;
          paramString.putExtra("pay_gate_url", paramm.xpI);
          paramString.putExtra("need_dialog", paramm.xpK);
          paramString.putExtra("dialog_text", paramm.xpL);
          paramString.putExtra("max_count", paramm.xpJ.vRG);
          paramString.putExtra("inteval_time", paramm.xpJ.vRF);
          paramString.putExtra("default_wording", paramm.xpJ.vRH);
          d.c((Activity)this.tRj.cHZ.context, "wallet_core", ".ui.WalletMixOrderInfoUI", paramString);
          if (this.tRj.callback != null)
          {
            this.tRj.cIa.ret = 2;
            this.tRj.callback.run();
          }
          ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "mAuthNativeEvent.data.context: %s", new Object[] { this.tRj.cHZ.context });
          AppMethodBeat.o(48206);
        }
        else
        {
          paramString = (o)paramm;
          paramm = new PayInfo();
          paramm.cIf = this.tRg;
          paramm.czZ = paramString.czZ;
          paramm.appId = paramString.appId;
          paramm.tRb = paramString.tRb;
          paramm.cwg = paramString.cwg;
          paramm.cIb = paramString.cIb;
          ab.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay native, payInfo: %s", new Object[] { paramm.toString() });
          com.tencent.mm.pluginsdk.wallet.h.a(this.tRj.cHZ.context, paramm, 0);
          if (this.tRj.callback != null)
          {
            this.tRj.cIa.ret = 2;
            this.tRj.callback.run();
          }
          AppMethodBeat.o(48206);
        }
      }
      else
      {
        ab.i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
        AppMethodBeat.o(48206);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.m
 * JD-Core Version:    0.6.2
 */