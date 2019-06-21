package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.protocal.protobuf.arg;
import com.tencent.mm.protocal.protobuf.jd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class WxaBindBizInfoUI$3$1
  implements w.a
{
  WxaBindBizInfoUI$3$1(WxaBindBizInfoUI.3 param3)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(133191);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.WxaBindBizInfoUI", "onResp, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(133191);
    }
    while (true)
    {
      return 0;
      paramString = (arg)paramb.fsH.fsP;
      paramb = paramString.wvi;
      boolean bool = paramString.wvj;
      WxaBindBizInfoUI.a(this.iJK.iJJ, paramString.wvh);
      if (bool)
      {
        WxaBindBizInfoUI.c(this.iJK.iJJ).fh(false);
        WxaBindBizInfoUI.d(this.iJK.iJJ).dKT();
        this.iJK.iJJ.iJG.iJM = true;
        WxaBindBizInfoUI.e(this.iJK.iJJ).setVisibility(0);
      }
      if ((paramb != null) && (!paramb.isEmpty()))
      {
        paramString = new LinkedList();
        paramb = paramb.iterator();
        while (paramb.hasNext())
        {
          jd localjd = (jd)paramb.next();
          if (localjd != null)
          {
            paramm = new WxaAttributes.WxaEntryInfo();
            paramm.title = localjd.nickname;
            paramm.iconUrl = localjd.kKZ;
            paramm.username = localjd.username;
            paramString.add(paramm);
          }
        }
        this.iJK.iJJ.iJG.aN(paramString);
      }
      AppMethodBeat.o(133191);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.WxaBindBizInfoUI.3.1
 * JD-Core Version:    0.6.2
 */