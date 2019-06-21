package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;

final class UIEntryStub$2
  implements d.a
{
  UIEntryStub$2(UIEntryStub paramUIEntryStub, Bundle paramBundle, SendMessageToWX.Req paramReq)
  {
  }

  public final void ft(boolean paramBoolean)
  {
    AppMethodBeat.i(18128);
    boolean bool = this.jDu.isFinishing();
    ab.d("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + paramBoolean + ", isFinishing = " + bool);
    Object localObject;
    if ((paramBoolean) && (!bool))
    {
      localObject = new Intent(this.jDu, SendAppMessageWrapperUI.class);
      ((Intent)localObject).putExtras(this.cgJ);
      ((Intent)localObject).putExtra("Select_Conv_User", "weixinfile");
      ((Intent)localObject).putExtra("SendAppMessageWrapper_Scene", this.jDv.scene);
      this.jDu.startActivity((Intent)localObject);
    }
    while (true)
    {
      new ak().postDelayed(new UIEntryStub.2.1(this), 1000L);
      AppMethodBeat.o(18128);
      return;
      localObject = ReportUtil.c(this.jDu.getIntent().getExtras(), -3);
      ReportUtil.a(this.jDu, (ReportUtil.ReportArgs)localObject, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.UIEntryStub.2
 * JD-Core Version:    0.6.2
 */