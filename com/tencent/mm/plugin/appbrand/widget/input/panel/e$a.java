package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
  implements e
{
  int jeI;
  boolean mInLayout;
  private View mView;

  public e$a(Context paramContext)
  {
    AppMethodBeat.i(123949);
    this.mView = new e.a.1(this, paramContext);
    AppMethodBeat.o(123949);
  }

  public final boolean aQV()
  {
    return true;
  }

  public final boolean aQZ()
  {
    AppMethodBeat.i(123952);
    boolean bool;
    if (Build.VERSION.SDK_INT >= 18)
    {
      bool = this.mView.isInLayout();
      AppMethodBeat.o(123952);
    }
    while (true)
    {
      return bool;
      bool = this.mInLayout;
      AppMethodBeat.o(123952);
    }
  }

  public final void aRD()
  {
    AppMethodBeat.i(123950);
    this.mView.setVisibility(0);
    AppMethodBeat.o(123950);
  }

  public final void aRE()
  {
    AppMethodBeat.i(123951);
    this.mView.setVisibility(4);
    AppMethodBeat.o(123951);
  }

  public final View getPanelView()
  {
    return this.mView;
  }

  public final void onDestroy()
  {
  }

  public final boolean qD(int paramInt)
  {
    if ((paramInt > 0) && (this.jeI != paramInt))
      this.jeI = paramInt;
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setOnTextOperationListener(f paramf)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.e.a
 * JD-Core Version:    0.6.2
 */