package com.tencent.mm.plugin.remittance.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.a;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.ResendMsgInfo;
import com.tencent.mm.plugin.remittance.ui.d;
import com.tencent.mm.ui.widget.a.e.c;

public final class b
  implements a
{
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, e.c paramc)
  {
    AppMethodBeat.i(44425);
    paramContext = new d(paramContext);
    NetSceneTenpayRemittanceQuery.ResendMsgInfo localResendMsgInfo = new NetSceneTenpayRemittanceQuery.ResendMsgInfo();
    localResendMsgInfo.title = paramString1;
    localResendMsgInfo.pQx = paramString2;
    localResendMsgInfo.description = paramString3;
    localResendMsgInfo.nZb = paramString4;
    localResendMsgInfo.nZc = paramString5;
    paramContext.a(localResendMsgInfo, paramc);
    AppMethodBeat.o(44425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.a.b
 * JD-Core Version:    0.6.2
 */