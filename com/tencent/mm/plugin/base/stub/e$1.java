package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.net.URLDecoder;

final class e$1
  implements f
{
  e$1(Activity paramActivity, Runnable paramRunnable)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(18158);
    aw.Rg().b(1200, this);
    ab.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult translateLink: errType = %d; errCode = %d; errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: translate failed");
      e.y(this.val$activity);
      AppMethodBeat.o(18158);
    }
    while (true)
    {
      return;
      paramString = ((z)paramm).ajD();
      ab.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult respUriStr=%s", new Object[] { paramString });
      try
      {
        paramString = Uri.parse(paramString);
        if (paramString != null)
          break label162;
        ab.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri null");
        e.y(this.val$activity);
        AppMethodBeat.o(18158);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri parse exp=%s", new Object[] { paramString });
        e.y(this.val$activity);
        AppMethodBeat.o(18158);
      }
      continue;
      label162: paramm = paramString.getQueryParameter("result");
      if (paramm != null)
      {
        String str = URLDecoder.decode(paramm);
        ab.d("MicroMsg.WXBizLogic", "dealWithHandleScanResult: result=%s", new Object[] { str });
        paramm = new cf();
        paramm.cvm.activity = this.val$activity;
        paramm.cvm.ctB = str;
        paramm.cvm.cvn = 19;
        paramm.cvm.from = 3;
        paramm.cvm.cvq = paramString.getQueryParameter("appid");
        paramm.cvm.cvs = this.val$activity.getIntent().getBundleExtra("_stat_obj");
        a.xxA.m(paramm);
        if (this.jDJ != null)
          this.jDJ.run();
        al.n(new e.1.1(this), 100L);
      }
      AppMethodBeat.o(18158);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.e.1
 * JD-Core Version:    0.6.2
 */