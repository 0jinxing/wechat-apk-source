package com.tencent.mm.plugin.appbrand.page;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.a.f;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.LinkedList;

public class a extends f
{
  private static final a iqA;
  private static final HashMap<i, a> iqB;
  private final i hrt;
  private Drawable iqC;
  private CharSequence iqD;

  static
  {
    AppMethodBeat.i(87036);
    iqA = new a.1();
    iqB = new HashMap();
    AppMethodBeat.o(87036);
  }

  private a(final i parami)
  {
    AppMethodBeat.i(87029);
    this.hrt = parami;
    if (parami == null)
      AppMethodBeat.o(87029);
    while (true)
    {
      return;
      g.a(parami.mAppId, new g.c()
      {
        public final void onDestroy()
        {
          AppMethodBeat.i(87023);
          a locala = (a)a.Nx().remove(parami);
          if (locala != null)
            locala.ivn.clear();
          AppMethodBeat.o(87023);
        }
      });
      AppMethodBeat.o(87029);
    }
  }

  private static void a(Drawable paramDrawable, u paramu)
  {
    AppMethodBeat.i(87032);
    if (paramu == null)
      AppMethodBeat.o(87032);
    while (true)
    {
      return;
      paramu.getActionBar().getCapsuleBar().aKh().setLogo(paramDrawable);
      AppMethodBeat.o(87032);
    }
  }

  private static void a(CharSequence paramCharSequence, u paramu)
  {
    AppMethodBeat.i(87034);
    if (paramu == null)
      AppMethodBeat.o(87034);
    while (true)
    {
      return;
      paramu.z(paramCharSequence);
      AppMethodBeat.o(87034);
    }
  }

  static void b(u paramu)
  {
    AppMethodBeat.i(87027);
    a locala = z(paramu.getRuntime());
    a(locala.iqC, paramu);
    a(locala.iqD, paramu);
    AppMethodBeat.o(87027);
  }

  public static a z(i parami)
  {
    AppMethodBeat.i(87028);
    Object localObject;
    if ((parami == null) || (parami.mFinished))
    {
      localObject = iqA;
      AppMethodBeat.o(87028);
    }
    while (true)
    {
      return localObject;
      a locala = (a)iqB.get(parami);
      localObject = locala;
      if (locala == null)
      {
        localObject = new a(parami);
        iqB.put(parami, localObject);
      }
      AppMethodBeat.o(87028);
    }
  }

  public c.a a(a.a parama)
  {
    AppMethodBeat.i(87035);
    int i = parama.iqK;
    int j = parama.iqL;
    parama = super.aKh();
    parama.setLogo(j);
    parama.pE(i);
    AppMethodBeat.o(87035);
    return parama;
  }

  public Context getContext()
  {
    AppMethodBeat.i(87030);
    Activity localActivity = this.hrt.getContext();
    AppMethodBeat.o(87030);
    return localActivity;
  }

  public final void q(Drawable paramDrawable)
  {
    AppMethodBeat.i(87031);
    this.iqC = paramDrawable;
    a(this.iqC, this.hrt.xT().getCurrentPageView());
    AppMethodBeat.o(87031);
  }

  public final void y(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(87033);
    this.iqD = paramCharSequence;
    a(this.iqD, this.hrt.xT().getCurrentPageView());
    AppMethodBeat.o(87033);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a
 * JD-Core Version:    0.6.2
 */