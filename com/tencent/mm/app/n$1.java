package com.tencent.mm.app;

import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.d.a.4;
import com.tencent.mm.model.d.b;
import com.tencent.mm.model.d.b.1;
import com.tencent.mm.model.d.c.1;
import com.tencent.mm.model.d.c.a;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;
import com.tencent.mm.ui.conversation.MainUI;
import com.tencent.mm.ui.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class n$1 extends ak
{
  n$1(n paramn, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(15385);
    super.handleMessage(paramMessage);
    Object localObject;
    if (paramMessage.what == -1999)
    {
      if (this.ceW.ceU)
        break label337;
      paramMessage = LauncherUI.getInstance();
      if ((paramMessage != null) && (paramMessage.yjL))
      {
        paramMessage.yjJ.getMainTabUI().aqG("tab_main");
        localObject = paramMessage.getHomeUI();
        if (((HomeUI)localObject).yiv)
          ((HomeUI)localObject).yix = true;
        localObject = com.tencent.mm.plugin.sns.b.n.qFx;
        if (localObject != null)
          ((f)localObject).cmm();
        localObject = paramMessage.yjJ.getMainTabUI().ynQ.values().iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramMessage = (Fragment)((Iterator)localObject).next();
          if (!(paramMessage instanceof MainUI))
            ((m)paramMessage).dwh();
        }
      }
      System.gc();
      AppMethodBeat.o(15385);
    }
    while (true)
    {
      return;
      if (paramMessage.what == -2999)
      {
        if (this.ceW.ceU)
        {
          AppMethodBeat.o(15385);
        }
        else
        {
          paramMessage = LauncherUI.getInstance();
          if (paramMessage != null)
          {
            paramMessage = paramMessage.yjJ.getMainTabUI();
            if (paramMessage.ynQ.containsKey(Integer.valueOf(0)))
              ((m)paramMessage.ynQ.get(Integer.valueOf(0))).dwh();
          }
          if (g.RN().QY())
          {
            aw.ZE();
            paramMessage = bw.oJ("plugin.emoji");
            if (paramMessage != null)
              paramMessage.iy(0);
            b localb = b.abr();
            localObject = com.tencent.mm.model.d.a.abl();
            paramMessage = com.tencent.mm.model.d.c.abt();
            aw.RS().aa(new b.1(localb));
            d.xDH.ak(new a.4((com.tencent.mm.model.d.a)localObject));
            paramMessage.a(localb);
            paramMessage.a((c.a)localObject);
            aw.RS().aa(new c.1(paramMessage));
          }
          System.gc();
        }
      }
      else
        label337: AppMethodBeat.o(15385);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.n.1
 * JD-Core Version:    0.6.2
 */