package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.ResendMsgInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;

public final class d
{
  private Context mContext;

  public d(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void a(NetSceneTenpayRemittanceQuery.ResendMsgInfo paramResendMsgInfo, e.c paramc)
  {
    AppMethodBeat.i(44817);
    if (paramResendMsgInfo == null)
    {
      ab.i("MicroMsg.RemindCollectionDialog", "init() resendMsgInfo == null");
      AppMethodBeat.o(44817);
    }
    while (true)
    {
      return;
      Object localObject1 = View.inflate(this.mContext, 2130970503, null);
      Object localObject2 = (ImageView)((View)localObject1).findViewById(2131826962);
      MMNeat7extView localMMNeat7extView = (MMNeat7extView)((View)localObject1).findViewById(2131821019);
      a locala = a.ahv();
      String str = paramResendMsgInfo.pQx;
      c.a locala1 = new c.a();
      locala1.ePT = 2130840022;
      locala.a(str, (ImageView)localObject2, locala1.ahG());
      localMMNeat7extView.ah(paramResendMsgInfo.description);
      localObject2 = new e.a(this.mContext);
      localObject1 = ((e.a)localObject2).al(paramResendMsgInfo.title).fo((View)localObject1);
      ((e.a)localObject1).zQK = paramResendMsgInfo.nZb;
      ((e.a)localObject1).zQJ = paramResendMsgInfo.nZc;
      ((e.a)localObject2).c(new d.1(this, paramc)).show();
      AppMethodBeat.o(44817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.d
 * JD-Core Version:    0.6.2
 */