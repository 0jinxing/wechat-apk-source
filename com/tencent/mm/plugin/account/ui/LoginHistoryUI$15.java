package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class LoginHistoryUI$15
  implements DialogInterface.OnClickListener
{
  LoginHistoryUI$15(LoginHistoryUI paramLoginHistoryUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(124925);
    ab.d("MicroMsg.LoginHistoryUI", "imgSid:" + this.gCv.gBT.guh + " img len" + this.gCv.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    int j = this.crc;
    if (this.gCv.gCk == null)
    {
      paramInt = -1;
      paramDialogInterface = bo.anv(this.gCv.gCk);
      if (this.gCv.gBT.guf != null)
        break label381;
    }
    while (true)
    {
      ab.d("MicroMsg.LoginHistoryUI", "summervoice errType:%d, mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), paramDialogInterface, Integer.valueOf(i), bo.anv(this.gCv.gBT.guf) });
      q localq = new q(this.gCv.gBT.account, this.gCv.gBT.guf, this.gCv.gBT.gCL, LoginHistoryUI.i(this.gCv).getSecImgCode(), LoginHistoryUI.i(this.gCv).getSecImgSid(), LoginHistoryUI.i(this.gCv).getSecImgEncryptKey(), 0, "", false, false);
      if ((bo.isNullOrNil(this.gCv.gBT.guf)) && (!bo.isNullOrNil(this.gCv.gCk)))
      {
        ab.i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", new Object[] { bo.anv(this.gCv.gCk) });
        localq.tr(this.gCv.gCk);
      }
      com.tencent.mm.kernel.g.Rg().a(localq, 0);
      paramDialogInterface = this.gCv;
      LoginHistoryUI localLoginHistoryUI = this.gCv;
      this.gCv.getString(2131297061);
      paramDialogInterface.ehJ = h.b(localLoginHistoryUI, this.gCv.getString(2131301031), true, new LoginHistoryUI.15.1(this, localq));
      AppMethodBeat.o(124925);
      return;
      paramInt = this.gCv.gCk.length();
      break;
      label381: i = this.gCv.gBT.guf.length();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.15
 * JD-Core Version:    0.6.2
 */