package com.tencent.mm.plugin.appbrand.page.a;

import android.content.res.Resources.NotFoundException;
import android.support.v4.content.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public abstract class f extends a
{
  public final LinkedList<f.a> ivn = new f.1(this);

  public final c.a aKh()
  {
    f.a locala = new f.a(this);
    this.ivn.addFirst(locala);
    return locala;
  }

  public final void destroy()
  {
    this.ivn.clear();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.f
 * JD-Core Version:    0.6.2
 */