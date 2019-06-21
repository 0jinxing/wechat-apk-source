package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.d.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class u
  implements a
{
  private static Integer jfu = null;
  private int jfo;
  private final int[] jfp;
  private final Rect jfq;
  private boolean jfr;
  private View jfs;
  u.b jft;
  private final Set<u.c> jfv;

  public u()
  {
    AppMethodBeat.i(77430);
    this.jfo = 0;
    this.jfp = new int[2];
    this.jfq = new Rect();
    this.jfr = false;
    this.jfv = new LinkedHashSet();
    AppMethodBeat.o(77430);
  }

  private void a(u.a parama)
  {
    AppMethodBeat.i(77435);
    Iterator localIterator = this.jfv.iterator();
    while (localIterator.hasNext())
      parama.c((u.c)localIterator.next());
    AppMethodBeat.o(77435);
  }

  private Context getContext()
  {
    AppMethodBeat.i(77432);
    Context localContext;
    if (this.jfs == null)
    {
      localContext = ah.getContext();
      AppMethodBeat.o(77432);
    }
    while (true)
    {
      return localContext;
      localContext = this.jfs.getContext();
      AppMethodBeat.o(77432);
    }
  }

  private int getFrameHeight()
  {
    AppMethodBeat.i(77433);
    if (this.jfs == null);
    for (Object localObject = null; localObject == null; localObject = this.jfs.getRootView())
    {
      i = 0;
      AppMethodBeat.o(77433);
      return i;
    }
    localObject = this.jfq;
    getWindowVisibleDisplayFrame((Rect)localObject);
    if (s.as(this.jfs));
    for (int i = this.jfs.getMeasuredHeight(); ; i = getContext().getResources().getDisplayMetrics().heightPixels)
    {
      i -= ((Rect)localObject).top;
      AppMethodBeat.o(77433);
      break;
    }
  }

  private void getWindowVisibleDisplayFrame(Rect paramRect)
  {
    AppMethodBeat.i(77431);
    if (this.jfs != null)
    {
      this.jfs.getWindowVisibleDisplayFrame(paramRect);
      this.jfs.getLocationInWindow(this.jfp);
      paramRect.top = this.jfp[1];
    }
    AppMethodBeat.o(77431);
  }

  public final void a(u.c paramc)
  {
    AppMethodBeat.i(77436);
    if (paramc != null)
      this.jfv.add(paramc);
    AppMethodBeat.o(77436);
  }

  public final void b(u.c paramc)
  {
    AppMethodBeat.i(77437);
    if (paramc != null)
      this.jfv.remove(paramc);
    AppMethodBeat.o(77437);
  }

  public final void cK(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(77434);
    this.jfs = paramView;
    paramView = this.jfq;
    getWindowVisibleDisplayFrame(paramView);
    int j = paramView.height();
    boolean bool;
    if (this.jfo == 0)
    {
      this.jfo = j;
      if (getFrameHeight() <= j)
        break label242;
      bool = true;
      label50: if (this.jfr == bool)
        break label248;
    }
    label242: label248: for (int k = i; ; k = 0)
    {
      if (k != 0)
      {
        if (this.jft != null)
          this.jft.et(bool);
        a(new u.2(this, bool));
      }
      this.jfr = bool;
      this.jfo = j;
      this.jfs = null;
      AppMethodBeat.o(77434);
      return;
      int m = getFrameHeight() - j;
      if (m <= 0)
        break;
      paramView = getContext();
      if (m > 0)
      {
        if (jfu == null)
          jfu = Integer.valueOf(x.gs(paramView));
        if (jfu.intValue() != m)
          jfu = Integer.valueOf(m);
      }
      for (k = 1; ; k = 0)
      {
        a(new u.1(this, m));
        if ((this.jft == null) || ((k == 0) && (this.jft.getHeight() == m)))
          break;
        this.jft.oD(m);
        break;
      }
      bool = false;
      break label50;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.u
 * JD-Core Version:    0.6.2
 */