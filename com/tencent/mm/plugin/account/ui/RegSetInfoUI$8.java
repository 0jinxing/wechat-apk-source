package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI;
import com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMWizardActivity;

final class RegSetInfoUI$8
  implements Runnable
{
  RegSetInfoUI$8(RegSetInfoUI paramRegSetInfoUI, m paramm, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125513);
    RegSetInfoUI.b(this.gHM, ((s)this.crb).ajw());
    av.fly.ak("login_user_name", this.gEB);
    com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.compatible.util.e.euY + "temp.avatar");
    Object localObject;
    if ((this.gEO != null) && (this.gEO.contains("0")))
    {
      com.tencent.mm.plugin.b.a.wA("R300_100_phone");
      if (!this.gEP)
      {
        localObject = new Intent(this.gHM, FindMContactIntroUI.class);
        ((Intent)localObject).addFlags(67108864);
        ((Intent)localObject).putExtra("regsetinfo_ticket", RegSetInfoUI.g(this.gHM));
        ((Intent)localObject).putExtra("regsetinfo_NextStep", this.gEO);
        ((Intent)localObject).putExtra("regsetinfo_NextStyle", this.gES);
        Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gHM);
        localIntent.addFlags(67108864);
        MMWizardActivity.b(this.gHM, (Intent)localObject, localIntent);
        this.gHM.finish();
        AppMethodBeat.o(125513);
      }
    }
    while (true)
    {
      return;
      localObject = new Intent(this.gHM, FindMContactAlertUI.class);
      ((Intent)localObject).putExtra("alert_title", this.gEQ);
      ((Intent)localObject).putExtra("alert_message", this.gER);
      break;
      localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gHM);
      ((Intent)localObject).addFlags(67108864);
      this.gHM.startActivity((Intent)localObject);
      localObject = new StringBuilder();
      g.RN();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gHM.getClass().getName()).append(",R200_900_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_900_phone") + ",4");
      this.gHM.finish();
      AppMethodBeat.o(125513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.8
 * JD-Core Version:    0.6.2
 */