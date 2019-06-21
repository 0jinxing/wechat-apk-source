package com.tencent.mm.plugin.appbrand.widget.input;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aj;

public final class h
{
  private static final h jdJ;
  private final h.a jdI;

  static
  {
    AppMethodBeat.i(123626);
    jdJ = new h();
    AppMethodBeat.o(123626);
  }

  public h()
  {
    AppMethodBeat.i(123622);
    this.jdI = new h.a((byte)0);
    AppMethodBeat.o(123622);
  }

  public static h aQx()
  {
    return jdJ;
  }

  final void b(aj paramaj)
  {
    AppMethodBeat.i(123623);
    if (paramaj == null)
      AppMethodBeat.o(123623);
    while (true)
    {
      return;
      this.jdI.jdK.delete(paramaj.hashCode());
      try
      {
        paramaj.getWrapperView().setFocusable(true);
        paramaj.getWrapperView().setFocusableInTouchMode(true);
        paramaj.getContentView().setFocusable(true);
        paramaj.getContentView().setFocusableInTouchMode(true);
        AppMethodBeat.o(123623);
      }
      catch (NullPointerException paramaj)
      {
        AppMethodBeat.o(123623);
      }
    }
  }

  public final void c(aj paramaj)
  {
    AppMethodBeat.i(123624);
    if (paramaj == null)
      AppMethodBeat.o(123624);
    while (true)
    {
      return;
      int i = this.jdI.e(paramaj);
      this.jdI.a(paramaj, i + 1);
      try
      {
        paramaj.getWrapperView().setFocusable(false);
        paramaj.getWrapperView().setFocusableInTouchMode(false);
        paramaj.getContentView().setFocusable(false);
        paramaj.getContentView().setFocusableInTouchMode(false);
        if ((paramaj.getWrapperView() instanceof ViewGroup))
          ((ViewGroup)paramaj.getWrapperView()).setDescendantFocusability(393216);
        AppMethodBeat.o(123624);
      }
      catch (NullPointerException paramaj)
      {
        AppMethodBeat.o(123624);
      }
    }
  }

  public final void d(aj paramaj)
  {
    AppMethodBeat.i(123625);
    if (paramaj == null)
      AppMethodBeat.o(123625);
    while (true)
    {
      return;
      int i = this.jdI.e(paramaj) - 1;
      if (i <= 0)
      {
        b(paramaj);
        AppMethodBeat.o(123625);
      }
      else
      {
        this.jdI.a(paramaj, i);
        AppMethodBeat.o(123625);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.h
 * JD-Core Version:    0.6.2
 */