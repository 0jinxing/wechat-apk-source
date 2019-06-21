package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.io;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainer;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.MenuAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements com.tencent.mm.plugin.appbrand.widget.recentview.d
{
  public final com.tencent.mm.plugin.appbrand.widget.header.b a(Context paramContext, ListView paramListView, HeaderContainer paramHeaderContainer)
  {
    AppMethodBeat.i(133650);
    paramContext = new com.tencent.mm.plugin.appbrand.widget.desktop.a(paramContext, paramListView, paramHeaderContainer);
    AppMethodBeat.o(133650);
    return paramContext;
  }

  public final AppBrandRecentView a(Context paramContext, d.b paramb, d.a parama)
  {
    AppMethodBeat.i(133646);
    if (paramb == d.b.jod)
    {
      paramb = new ConversationAppBrandRecentView(paramContext);
      paramb.setSceneFactory(parama);
      parama = new FrameLayout.LayoutParams(-1, (int)paramContext.getResources().getDimension(2131428062));
      paramb.setPadding(0, (int)paramContext.getResources().getDimension(2131428064), 0, 0);
      paramb.setLayoutParams(parama);
      AppMethodBeat.o(133646);
      paramContext = paramb;
    }
    while (true)
    {
      return paramContext;
      if (paramb == d.b.joc)
      {
        paramb = new MenuAppBrandRecentView(paramContext);
        paramb.setSceneFactory(parama);
        parama = new FrameLayout.LayoutParams(-1, (int)paramContext.getResources().getDimension(2131428062));
        paramb.setPadding(0, (int)paramContext.getResources().getDimension(2131428064), 0, 0);
        paramb.setLayoutParams(parama);
        AppMethodBeat.o(133646);
        paramContext = paramb;
      }
      else
      {
        paramContext = null;
        AppMethodBeat.o(133646);
      }
    }
  }

  public final void aOC()
  {
    AppMethodBeat.i(133647);
    ab.i("MicroMsg.AppBrandRecentViewService", "[hideAppBrandRecentView] delay:%s type:%s", new Object[] { Integer.valueOf(300), Integer.valueOf(8) });
    if (((h)g.RM().Rn()).SG())
    {
      io localio = new io();
      localio.cDH.delay = 300;
      localio.cDH.type = 8;
      com.tencent.mm.sdk.b.a.xxA.m(localio);
    }
    AppMethodBeat.o(133647);
  }

  public final com.tencent.mm.plugin.appbrand.widget.recentview.b aOD()
  {
    AppMethodBeat.i(133648);
    com.tencent.mm.plugin.appbrand.widget.recentview.b localb = new com.tencent.mm.plugin.appbrand.widget.recentview.b();
    AppMethodBeat.o(133648);
    return localb;
  }

  public final void aOE()
  {
    AppMethodBeat.i(133651);
    com.tencent.mm.plugin.appbrand.widget.desktop.b.aPg();
    AppMethodBeat.o(133651);
  }

  public final boolean aOF()
  {
    AppMethodBeat.i(133652);
    boolean bool = com.tencent.mm.plugin.appbrand.widget.desktop.b.aPe();
    AppMethodBeat.o(133652);
    return bool;
  }

  public final HeaderContainer df(Context paramContext)
  {
    AppMethodBeat.i(133649);
    paramContext = new AppBrandDesktopContainer(paramContext);
    AppMethodBeat.o(133649);
    return paramContext;
  }

  public final View dg(Context paramContext)
  {
    AppMethodBeat.i(133653);
    paramContext = new DynamicBackgroundGLSurfaceView(paramContext, (byte)0);
    AppMethodBeat.o(133653);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b
 * JD-Core Version:    0.6.2
 */