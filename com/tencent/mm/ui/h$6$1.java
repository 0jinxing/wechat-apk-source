package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.bind.ui.BindMobileUI;

final class h$6$1
  implements DialogInterface.OnClickListener
{
  h$6$1(h.6 param6, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29313);
    Intent localIntent = new Intent();
    localIntent.setClass(this.yil.yih.yhZ, BindMobileUI.class);
    localIntent.putExtra("kstyle_bind_wording", new BindWordingContent(this.hCG, ""));
    MMWizardActivity.J(this.yil.yih.yhZ, localIntent);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(29313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.6.1
 * JD-Core Version:    0.6.2
 */