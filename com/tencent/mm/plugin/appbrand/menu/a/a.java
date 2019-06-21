package com.tencent.mm.plugin.appbrand.menu.a;

import android.content.Context;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.ui.base.l;

public abstract class a<T extends u>
{
  public final int inj;

  public a(int paramInt)
  {
    this.inj = paramInt;
  }

  public abstract void a(Context paramContext, T paramT, l paraml, String paramString);

  public abstract void a(Context paramContext, T paramT, String paramString, n paramn);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.a.a
 * JD-Core Version:    0.6.2
 */