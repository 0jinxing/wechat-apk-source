package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.a.c;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;

@e(c.class)
public abstract interface d extends a
{
  public abstract com.tencent.mm.plugin.appbrand.widget.header.b a(Context paramContext, ListView paramListView, HeaderContainer paramHeaderContainer);

  public abstract AppBrandRecentView a(Context paramContext, d.b paramb, d.a parama);

  public abstract void aOC();

  public abstract b aOD();

  public abstract void aOE();

  public abstract boolean aOF();

  public abstract HeaderContainer df(Context paramContext);

  public abstract View dg(Context paramContext);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.d
 * JD-Core Version:    0.6.2
 */