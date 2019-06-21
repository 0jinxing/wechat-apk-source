package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import com.tencent.mars.comm.NetStatusUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;

final class m$a$e extends com.tencent.mm.sdk.d.b
{
  m$a$e(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37124);
    super.enter();
    al.d(new m.a.e.1(this));
    AppMethodBeat.o(37124);
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(37125);
    ab.i("LogStateTransitionState", hashCode() + "[PauseState] recv msg.what " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(37125);
    case 0:
    case 3:
    case 8:
    case 12:
    }
    while (true)
    {
      return bool;
      if (AdLandingPagesProxy.getInstance().isDownloading(m.b(this.raa.qZO).csB))
        m.a.a(this.raa, this.raa.qZO.context.getString(2131303571));
      while (true)
      {
        AppMethodBeat.o(37125);
        break;
        if (!NetStatusUtil.isWifi(this.raa.qZO.context))
        {
          ab.i("LogStateTransitionState", "download not in wifi!");
          h.a(this.raa.qZO.context, 2131305542, 2131305543, new m.a.e.2(this), null);
        }
        else
        {
          this.raa.sendMessage(12);
        }
      }
      this.raa.b(this.raa.qZV);
      AppMethodBeat.o(37125);
      continue;
      m.a.a(this.raa, this.raa.qZO.context.getString(2131303573));
      this.raa.b(this.raa.qZW);
      AppMethodBeat.o(37125);
      continue;
      this.raa.b(this.raa.qZR);
      AppMethodBeat.o(37125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.e
 * JD-Core Version:    0.6.2
 */