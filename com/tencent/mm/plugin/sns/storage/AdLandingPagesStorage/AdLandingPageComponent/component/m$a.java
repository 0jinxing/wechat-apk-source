package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.d.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.io.Serializable;

final class m$a extends d
  implements Serializable
{
  c qZR;
  c qZS;
  c qZT;
  c qZU;
  c qZV;
  c qZW;
  c qZX;
  c qZY;
  c qZZ;

  protected m$a(m paramm, String paramString, Looper paramLooper)
  {
    super(paramString, paramLooper);
    AppMethodBeat.i(37141);
    this.qZR = new m.a.c(this);
    this.qZS = new m.a.g(this);
    this.qZT = new m.a.e(this);
    this.qZU = new m.a.h(this);
    this.qZV = new m.a.i(this);
    this.qZW = new m.a.f(this);
    this.qZX = new m.a.b(this);
    this.qZY = new m.a.a(this);
    this.qZZ = new d();
    a(this.qZS);
    a(this.qZR);
    a(this.qZT);
    a(this.qZU);
    a(this.qZV);
    a(this.qZW);
    a(this.qZX);
    a(this.qZY);
    a(this.qZZ);
    b(this.qZZ);
    AppMethodBeat.o(37141);
  }

  final class c$a
    implements AdLandingPagesProxy.a
  {
    private c$a()
    {
    }

    public final void CP(int paramInt)
    {
      AppMethodBeat.i(37115);
      m.a locala = m.a(m.a.this.raa.qZO);
      d.c localc = locala.xCt;
      if (localc != null)
        localc.sendMessage(Message.obtain(locala.xCt, 1, paramInt, 0));
      AppMethodBeat.o(37115);
    }

    public final void cmA()
    {
      AppMethodBeat.i(37116);
      ab.i("LogStateTransitionState", "paused");
      m.a(m.a.this.raa.qZO).sendMessage(7);
      AppMethodBeat.o(37116);
    }

    public final void cmB()
    {
      AppMethodBeat.i(37117);
      m.a(m.a.this.raa.qZO).sendMessage(9);
      AppMethodBeat.o(37117);
    }

    public final void cmC()
    {
      AppMethodBeat.i(37118);
      m.a(m.a.this.raa.qZO).sendMessage(8);
      AppMethodBeat.o(37118);
    }
  }

  final class d extends com.tencent.mm.sdk.d.b
  {
    d()
    {
    }

    public final void enter()
    {
      AppMethodBeat.i(37121);
      super.enter();
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b localb = m.b(m.a.this.qZO);
      int i;
      if ((localb.qVO == 0) || (localb.qVO == 2))
      {
        i = 1;
        if (i == 0)
          break label154;
        if (!AdLandingPagesProxy.getInstance().isApkExist(m.b(m.a.this.qZO).csB))
          break label88;
        m.a.this.b(m.a.this.qZU);
        AppMethodBeat.o(37121);
      }
      label154: 
      while (true)
      {
        return;
        i = 0;
        break;
        label88: if (AdLandingPagesProxy.getInstance().isPkgInstalled(m.b(m.a.this.qZO).Iw))
        {
          m.a.this.b(m.a.this.qZV);
          AppMethodBeat.o(37121);
        }
        else
        {
          m.a.this.b(m.a.this.qZX);
          AppMethodBeat.o(37121);
          continue;
          m.a.this.b(m.a.this.qZY);
          AppMethodBeat.o(37121);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a
 * JD-Core Version:    0.6.2
 */