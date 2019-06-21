package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.ChattingUI;

final class UIEntryStub$3
  implements d.a
{
  UIEntryStub$3(UIEntryStub paramUIEntryStub, Bundle paramBundle, SendMessageToWX.Req paramReq)
  {
  }

  public final void ft(boolean paramBoolean)
  {
    AppMethodBeat.i(18130);
    boolean bool = this.jDu.isFinishing();
    Object localObject = this.cgJ.getString("SendAppMessageWrapper_UserName", "");
    ab.i("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + paramBoolean + ", isFinishing = " + bool + ", username = " + (String)localObject);
    if ((paramBoolean) && (!bool) && (!bo.isNullOrNil((String)localObject)))
    {
      Intent localIntent = new Intent(this.jDu, ChattingUI.class);
      localIntent.putExtras(this.cgJ);
      localIntent.putExtra("finish_direct", false);
      localIntent.putExtra("Chat_User", (String)localObject);
      localIntent.putExtra("SendAppMessageWrapper_Scene", this.jDv.scene);
      if (this.jDv.message.getType() == 45)
        localIntent.putExtra("Select_Send_Card", true);
      this.jDu.startActivity(localIntent);
    }
    while (true)
    {
      new ak().postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(18129);
          UIEntryStub.3.this.jDu.finish();
          AppMethodBeat.o(18129);
        }
      }
      , 1000L);
      AppMethodBeat.o(18130);
      return;
      localObject = ReportUtil.c(this.jDu.getIntent().getExtras(), -3);
      ReportUtil.a(this.jDu, (ReportUtil.ReportArgs)localObject, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.UIEntryStub.3
 * JD-Core Version:    0.6.2
 */