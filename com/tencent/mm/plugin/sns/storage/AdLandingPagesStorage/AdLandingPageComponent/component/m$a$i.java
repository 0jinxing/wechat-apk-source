package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class m$a$i extends com.tencent.mm.sdk.d.b
{
  m$a$i(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37139);
    super.enter();
    if (AdLandingPagesProxy.getInstance().isPkgInstalled(m.b(this.raa.qZO).Iw))
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(37138);
          m.c(m.a.i.this.raa.qZO).setVisibility(8);
          m.d(m.a.i.this.raa.qZO).setVisibility(0);
          m.d(m.a.i.this.raa.qZO).setText(2131303576);
          AppMethodBeat.o(37138);
        }
      });
      AppMethodBeat.o(37139);
    }
    while (true)
    {
      return;
      this.raa.b(this.raa.qZU);
      AppMethodBeat.o(37139);
    }
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(37140);
    ab.i("LogStateTransitionState", hashCode() + "[ToOpenState] recv msg.what " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(37140);
    case 0:
    case 4:
    }
    while (true)
    {
      return bool;
      if (this.raa.qZO.cpK())
      {
        AppMethodBeat.o(37140);
      }
      else
      {
        m.a.a(this.raa, this.raa.qZO.context.getString(2131303577));
        this.raa.b(this.raa.qZV);
        AppMethodBeat.o(37140);
        continue;
        this.raa.b(this.raa.qZS);
        AppMethodBeat.o(37140);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.i
 * JD-Core Version:    0.6.2
 */