package com.tencent.mm.plugin.appbrand.page;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private View iqO;
  WebChromeClient.CustomViewCallback iqP;
  private int iqQ;
  final Set<ai> iqR;
  private Context mContext;
  private int mOrientation;

  c(Context paramContext)
  {
    AppMethodBeat.i(91081);
    this.iqQ = 0;
    this.iqR = Collections.newSetFromMap(new ConcurrentHashMap());
    this.mContext = paramContext;
    AppMethodBeat.o(91081);
  }

  private void aJa()
  {
    AppMethodBeat.i(91085);
    Iterator localIterator = this.iqR.iterator();
    while (localIterator.hasNext())
      ((ai)localIterator.next()).aJY();
    AppMethodBeat.o(91085);
  }

  private void aJb()
  {
    AppMethodBeat.i(91086);
    Iterator localIterator = this.iqR.iterator();
    while (localIterator.hasNext())
      ((ai)localIterator.next()).aDI();
    AppMethodBeat.o(91086);
  }

  final void G(View paramView, int paramInt)
  {
    AppMethodBeat.i(91082);
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
      AppMethodBeat.o(91082);
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

  final void a(ai paramai)
  {
    AppMethodBeat.i(91084);
    this.iqR.add(paramai);
    AppMethodBeat.o(91084);
  }

  final boolean aIZ()
  {
    AppMethodBeat.i(91083);
    boolean bool;
    if (this.iqO == null)
    {
      bool = false;
      AppMethodBeat.o(91083);
    }
    while (true)
    {
      return bool;
      if (this.iqP != null)
        this.iqP.onCustomViewHidden();
      Activity localActivity = (Activity)this.mContext;
      ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().getDecorView();
      localViewGroup.setSystemUiVisibility(this.iqQ);
      localViewGroup.removeView(this.iqO);
      localActivity.getWindow().clearFlags(1024);
      localActivity.setRequestedOrientation(this.mOrientation);
      this.iqO = null;
      this.iqP = null;
      aJb();
      bool = true;
      AppMethodBeat.o(91083);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.c
 * JD-Core Version:    0.6.2
 */