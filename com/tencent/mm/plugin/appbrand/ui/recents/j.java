package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.l;
import com.tencent.mm.plugin.appbrand.appusage.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Set;

final class j extends a
  implements l.b, h.b
{
  Activity gNy;
  private View.OnClickListener iOA;
  private j.a iOx;
  h iOy;
  private boolean iOz;
  volatile boolean mFinished;

  j(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133473);
    this.iOx = new j.a((byte)0);
    this.mFinished = false;
    this.iOz = false;
    this.iOA = null;
    this.iOy = new h(paramViewGroup);
    this.iOy.iNP = this;
    this.gNy = paramActivity;
    AppMethodBeat.o(133473);
  }

  private static Integer Ea(String paramString)
  {
    AppMethodBeat.i(133477);
    try
    {
      int i = Color.parseColor(paramString);
      paramString = Integer.valueOf(i);
      AppMethodBeat.o(133477);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(133477);
      }
    }
  }

  public final void a(h.c paramc, View paramView)
  {
    AppMethodBeat.i(133478);
    if ((paramc == null) || (paramc == h.c.iNY) || (paramc == h.c.iNX))
    {
      ab.v("MicroMsg.AppBrandListRecentsListWAGameHeader", "onClick ");
      AppMethodBeat.o(133478);
    }
    while (true)
    {
      return;
      if (paramc == h.c.iOa)
      {
        this.iOy.aNt();
        l.axj().refresh();
        AppMethodBeat.o(133478);
      }
      else
      {
        if ((paramc == h.c.iNZ) && (this.iOA != null))
        {
          this.iOA.onClick(paramView);
          if (this.iOz)
          {
            paramc = this.iOy;
            if (paramc.iNR.iOf != null)
              paramc.iNR.iOf.animate().alpha(0.0F).setDuration(200L).start();
          }
        }
        AppMethodBeat.o(133478);
      }
    }
  }

  public final void aNh()
  {
    AppMethodBeat.i(133474);
    l locall = l.axj();
    eG(l.enabled());
    if (!l.enabled())
      AppMethodBeat.o(133474);
    while (true)
    {
      return;
      synchronized (locall.mLock)
      {
        locall.gZl.add(this);
        locall.refresh();
        this.iOy.aNt();
        this.mFinished = false;
        AppMethodBeat.o(133474);
      }
    }
  }

  public final View aNi()
  {
    return this.iOy.iNR.apJ;
  }

  public final void axk()
  {
    AppMethodBeat.i(133476);
    ab.i("MicroMsg.AppBrandListRecentsListWAGameHeader", "AppBrandListRecentsListWAGameHeader.onWAGameDataUpdate");
    l.axj();
    if (!l.enabled())
      AppMethodBeat.o(133476);
    while (true)
    {
      return;
      if (this.mFinished)
      {
        AppMethodBeat.o(133476);
      }
      else
      {
        View localView = this.iOy.iNR.apJ;
        if (localView == null)
        {
          AppMethodBeat.o(133476);
        }
        else
        {
          localView.post(new j.1(this));
          AppMethodBeat.o(133476);
        }
      }
    }
  }

  public final void eH(boolean paramBoolean)
  {
  }

  public final void onDetached()
  {
    AppMethodBeat.i(133475);
    this.mFinished = true;
    l locall = l.axj();
    synchronized (locall.mLock)
    {
      locall.gZl.remove(this);
      AppMethodBeat.o(133475);
      return;
    }
  }

  public final void onResume()
  {
  }

  public final void pS(int paramInt)
  {
    AppMethodBeat.i(133479);
    if (this.iOy != null)
    {
      h localh = this.iOy;
      if ((localh.iNR != null) && (localh.iNR.iOh != null))
        localh.iNR.iOh.setVisibility(paramInt);
    }
    AppMethodBeat.o(133479);
  }

  public final void pT(int paramInt)
  {
    AppMethodBeat.i(133480);
    h localh = this.iOy;
    if ((localh.iNR != null) && (localh.iNR.apJ != null))
      localh.iNR.apJ.setBackgroundResource(paramInt);
    AppMethodBeat.o(133480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.j
 * JD-Core Version:    0.6.2
 */