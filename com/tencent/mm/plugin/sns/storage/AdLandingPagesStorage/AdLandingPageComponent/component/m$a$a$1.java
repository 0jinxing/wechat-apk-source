package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.text.TextUtils;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;

final class m$a$a$1
  implements Runnable
{
  m$a$a$1(m.a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37107);
    m.c(this.rab.raa.qZO).setVisibility(8);
    m.d(this.rab.raa.qZO).setEnabled(false);
    Button localButton = m.d(this.rab.raa.qZO);
    if (!TextUtils.isEmpty(m.b(this.rab.raa.qZO).qVP));
    for (String str = m.b(this.rab.raa.qZO).qVP; ; str = "暂不支持安卓手机")
    {
      localButton.setText(str);
      m.d(this.rab.raa.qZO).setVisibility(0);
      AppMethodBeat.o(37107);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.a.1
 * JD-Core Version:    0.6.2
 */