package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;

final class m$a$e$2
  implements DialogInterface.OnClickListener
{
  m$a$e$2(m.a.e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(37123);
    this.rae.raa.sendMessage(12);
    d.b(10, "AdLandingPageDownloadApkBtnComp_PAUSE_MSG_BTN_CLICK", this.rae.hashCode());
    AppMethodBeat.o(37123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.e.2
 * JD-Core Version:    0.6.2
 */