package com.tencent.mm.plugin.brandservice.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private View iqO;
  private int iqQ;
  private final Set<b> iqR;
  private Context mContext;
  private int mOrientation;

  public a(Context paramContext)
  {
    AppMethodBeat.i(14459);
    this.iqQ = 0;
    this.iqR = Collections.newSetFromMap(new ConcurrentHashMap());
    this.mContext = paramContext;
    AppMethodBeat.o(14459);
  }

  private void aJa()
  {
    AppMethodBeat.i(14464);
    Iterator localIterator = this.iqR.iterator();
    while (localIterator.hasNext())
      localIterator.next();
    AppMethodBeat.o(14464);
  }

  private void aJb()
  {
    AppMethodBeat.i(14465);
    Iterator localIterator = this.iqR.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).aDI();
    AppMethodBeat.o(14465);
  }

  public final void G(View paramView, int paramInt)
  {
    AppMethodBeat.i(14460);
    aIZ();
    this.iqO = paramView;
    Activity localActivity = (Activity)this.mContext;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().getDecorView();
    this.iqQ = localViewGroup.getSystemUiVisibility();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (d.fP(19))
    {
      localViewGroup.setSystemUiVisibility(2);
      localActivity.getWindow().addFlags(1024);
      this.mOrientation = localActivity.getRequestedOrientation();
      switch (paramInt)
      {
      default:
        localActivity.setRequestedOrientation(9);
      case 90:
      case -90:
      case 0:
      }
    }
    while (true)
    {
      aJa();
      AppMethodBeat.o(14460);
      return;
      localViewGroup.setSystemUiVisibility(4102);
      break;
      localActivity.setRequestedOrientation(0);
      continue;
      localActivity.setRequestedOrientation(8);
      continue;
      localActivity.setRequestedOrientation(1);
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(14462);
    this.iqR.add(paramb);
    AppMethodBeat.o(14462);
  }

  public final boolean aIZ()
  {
    AppMethodBeat.i(14461);
    boolean bool;
    if (this.iqO == null)
    {
      bool = false;
      AppMethodBeat.o(14461);
    }
    while (true)
    {
      return bool;
      Activity localActivity = (Activity)this.mContext;
      ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().getDecorView();
      localViewGroup.setSystemUiVisibility(this.iqQ);
      localViewGroup.removeView(this.iqO);
      localActivity.getWindow().clearFlags(1024);
      localActivity.setRequestedOrientation(this.mOrientation);
      this.iqO = null;
      aJb();
      bool = true;
      AppMethodBeat.o(14461);
    }
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(14463);
    this.iqR.remove(paramb);
    AppMethodBeat.o(14463);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.a
 * JD-Core Version:    0.6.2
 */