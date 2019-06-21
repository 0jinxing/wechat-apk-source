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

final class o$5
  implements Runnable
{
  o$5(o paramo, m paramm, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125254);
    this.gEM.elr = ((s)this.crb).ajw();
    av.fly.ak("login_user_name", this.gEB);
    com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.compatible.util.e.euY + "temp.avatar");
    Object localObject;
    if ((this.gEO != null) && (this.gEO.contains("0")))
    {
      com.tencent.mm.plugin.b.a.wA("R300_100_phone");
      if (!this.gEP)
      {
        localObject = new Intent(this.gEM.gEE, FindMContactIntroUI.class);
        ((Intent)localObject).addFlags(67108864);
        ((Intent)localObject).putExtra("regsetinfo_ticket", this.gEM.elr);
        ((Intent)localObject).putExtra("regsetinfo_NextStep", this.gEO);
        ((Intent)localObject).putExtra("regsetinfo_NextStyle", this.gES);
        Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEM.gEE);
        localIntent.addFlags(67108864);
        MMWizardActivity.b(this.gEM.gEE, (Intent)localObject, localIntent);
        this.gEM.gEE.finish();
        AppMethodBeat.o(125254);
      }
    }
    while (true)
    {
      return;
      localObject = new Intent(this.gEM.gEE, FindMContactAlertUI.class);
      ((Intent)localObject).putExtra("alert_title", this.gEQ);
      ((Intent)localObject).putExtra("alert_message", this.gER);
      break;
      localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEM.gEE);
      ((Intent)localObject).addFlags(67108864);
      this.gEM.gEE.startActivity((Intent)localObject);
      localObject = new StringBuilder();
      g.RN();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gEM.gEE.getClass().getName()).append(",R200_900_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_900_phone") + ",4");
      this.gEM.gEE.finish();
      AppMethodBeat.o(125254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.o.5
 * JD-Core Version:    0.6.2
 */