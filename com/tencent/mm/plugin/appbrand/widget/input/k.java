package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.support.v4.view.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.Reference;
import java.util.Map;

public class k
  implements f.c
{
  private static final android.support.v4.f.a<u, k> jeA;
  private static final k jet;
  private final u jdD;
  private final Runnable jeB;
  private final Runnable jeC;
  final Map<k.a, k> jes;
  private final int jeu;
  private final int jev;
  private int jew;
  private boolean jex;
  private int jey;
  private int jez;

  static
  {
    AppMethodBeat.i(123673);
    jet = new k.1();
    jeA = new android.support.v4.f.a();
    AppMethodBeat.o(123673);
  }

  private k()
  {
    AppMethodBeat.i(123660);
    this.jes = new android.support.v4.f.a();
    this.jev = 5;
    this.jew = 0;
    this.jex = false;
    this.jey = -1;
    this.jez = 0;
    this.jeB = new k.2(this);
    this.jeC = new k.3(this);
    this.jdD = null;
    this.jeu = 0;
    AppMethodBeat.o(123660);
  }

  private k(u paramu)
  {
    AppMethodBeat.i(123661);
    this.jes = new android.support.v4.f.a();
    this.jev = 5;
    this.jew = 0;
    this.jex = false;
    this.jey = -1;
    this.jez = 0;
    this.jeB = new k.2(this);
    this.jeC = new k.3(this);
    this.jdD = paramu;
    this.jdD.a(this);
    Object localObject = paramu.getRuntime();
    if (localObject != null)
    {
      Activity localActivity = ((com.tencent.mm.plugin.appbrand.i)localObject).getContext();
      localObject = localActivity;
      if (localActivity != null);
    }
    else
    {
      localObject = paramu.getContext();
      paramu = (u)localObject;
      if (!(localObject instanceof Activity))
        paramu = null;
      localObject = (Activity)paramu;
    }
    this.jeu = com.tencent.mm.ui.statusbar.a.ay((Activity)localObject);
    AppMethodBeat.o(123661);
  }

  public static k a(Reference<u> paramReference)
  {
    AppMethodBeat.i(123662);
    if (paramReference == null);
    for (paramReference = null; ; paramReference = (u)paramReference.get())
    {
      paramReference = u(paramReference);
      AppMethodBeat.o(123662);
      return paramReference;
    }
  }

  private void fe(boolean paramBoolean)
  {
    AppMethodBeat.i(123664);
    if (paramBoolean)
    {
      this.jew = 0;
      this.jex = false;
    }
    if (!this.jdD.isRunning())
      AppMethodBeat.o(123664);
    while (true)
    {
      return;
      if (this.jex)
      {
        this.jew = 0;
        AppMethodBeat.o(123664);
      }
      else if (this.jew == 0)
      {
        ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] post, attached %B", new Object[] { Boolean.valueOf(s.av(this.jdD.getContentView())) });
        this.jdD.getContentView().post(this.jeC);
        AppMethodBeat.o(123664);
      }
      else
      {
        ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] postOnAnimation, attached %B", new Object[] { Boolean.valueOf(s.av(this.jdD.getContentView())) });
        this.jdD.getContentView().postOnAnimationDelayed(this.jeC, 100L);
        AppMethodBeat.o(123664);
      }
    }
  }

  public static k u(u paramu)
  {
    AppMethodBeat.i(123663);
    Object localObject;
    if ((paramu == null) || (!paramu.isRunning()))
    {
      ab.b("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page ".concat(String.valueOf(paramu)), new Object[0]);
      localObject = jet;
      AppMethodBeat.o(123663);
    }
    while (true)
    {
      return localObject;
      k localk = (k)jeA.get(paramu);
      localObject = localk;
      if (localk == null)
      {
        localObject = new k(paramu);
        jeA.put(paramu, localObject);
      }
      AppMethodBeat.o(123663);
    }
  }

  public final void a(k.a parama)
  {
    AppMethodBeat.i(123659);
    if (parama == null)
      AppMethodBeat.o(123659);
    while (true)
    {
      return;
      this.jes.remove(parama);
      AppMethodBeat.o(123659);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(123667);
    this.jdD.b(this);
    jeA.remove(this.jdD);
    AppMethodBeat.o(123667);
  }

  public void qA(int paramInt)
  {
    AppMethodBeat.i(123665);
    this.jey = paramInt;
    fe(true);
    AppMethodBeat.o(123665);
  }

  public void qB(int paramInt)
  {
    AppMethodBeat.i(123666);
    if (!this.jdD.isRunning())
      AppMethodBeat.o(123666);
    while (true)
    {
      return;
      if (paramInt != this.jey)
      {
        ab.w("MicroMsg.AppBrandInputPageOffsetHelper", "requestScrollDown, skip last-ticket %d, pass-in-ticket %d", new Object[] { Integer.valueOf(this.jey), Integer.valueOf(paramInt) });
        AppMethodBeat.o(123666);
      }
      else
      {
        this.jex = true;
        this.jdD.getContentView().post(this.jeB);
        AppMethodBeat.o(123666);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.k
 * JD-Core Version:    0.6.2
 */