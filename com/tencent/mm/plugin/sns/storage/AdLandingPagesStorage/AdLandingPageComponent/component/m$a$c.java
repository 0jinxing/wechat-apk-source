package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class m$a$c extends com.tencent.mm.sdk.d.b
{
  AdLandingPagesProxy.a rac;

  m$a$c(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37119);
    super.enter();
    al.d(new m.a.c.1(this));
    if ((AdLandingPagesProxy.getInstance().isPaused(m.b(this.raa.qZO).csB)) || (AdLandingPagesProxy.getInstance().isDownloading(m.b(this.raa.qZO).csB)))
    {
      if (this.rac == null)
        this.rac = new m.a.c.a(this, (byte)0);
      al.d(new m.a.c.2(this));
      if (AdLandingPagesProxy.getInstance().resumeTask(m.b(this.raa.qZO).csB, this.rac, this.raa.qZO.cpC().qTL, this.raa.qZO.cpC().hcx))
        break label429;
      AdLandingPagesProxy.getInstance().stopTask(m.b(this.raa.qZO).csB);
      this.raa.b(this.raa.qZR);
      AppMethodBeat.o(37119);
    }
    while (true)
    {
      return;
      if (TextUtils.isEmpty(m.b(this.raa.qZO).downloadUrl))
      {
        this.raa.b(this.raa.qZX);
        AppMethodBeat.o(37119);
      }
      else if (AdLandingPagesProxy.getInstance().isApkExist(m.b(this.raa.qZO).csB))
      {
        al.d(new m.a.c.3(this));
        this.raa.b(this.raa.qZU);
        AppMethodBeat.o(37119);
      }
      else
      {
        AdLandingPagesProxy.getInstance().stopTask(m.b(this.raa.qZO).csB);
        this.rac = new m.a.c.a(this, (byte)0);
        AdLandingPagesProxy.getInstance().startDownload(m.b(this.raa.qZO).csB, m.b(this.raa.qZO).Iw, m.b(this.raa.qZO).cvZ, m.b(this.raa.qZO).downloadUrl, m.b(this.raa.qZO).qVM, m.b(this.raa.qZO).qVN, this.rac, this.raa.qZO.cpC().qTL, this.raa.qZO.cpC().hcx);
        label429: AppMethodBeat.o(37119);
      }
    }
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(37120);
    ab.i("LogStateTransitionState", hashCode() + "[DownloadingState] recv msg.what " + paramMessage.what);
    switch (paramMessage.what)
    {
    case 2:
    case 4:
    case 5:
    case 6:
    default:
      bool = false;
      AppMethodBeat.o(37120);
    case 0:
    case 1:
    case 3:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return bool;
      if ((AdLandingPagesProxy.getInstance().pauseTask(m.b(this.raa.qZO).csB)) && (AdLandingPagesProxy.getInstance().isPaused(m.b(this.raa.qZO).csB)))
        this.raa.b(this.raa.qZT);
      AppMethodBeat.o(37120);
      continue;
      al.d(new m.a.c.4(this, paramMessage.arg1));
      AppMethodBeat.o(37120);
      continue;
      this.raa.b(this.raa.qZV);
      AppMethodBeat.o(37120);
      continue;
      this.raa.b(this.raa.qZT);
      AppMethodBeat.o(37120);
      continue;
      m.a.a(this.raa, this.raa.qZO.context.getString(2131303573));
      this.raa.b(this.raa.qZW);
      AppMethodBeat.o(37120);
      continue;
      this.raa.qZO.cpL();
      this.raa.b(this.raa.qZU);
      AppMethodBeat.o(37120);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.c
 * JD-Core Version:    0.6.2
 */