package com.tencent.mm.ui.widget.sortlist;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends b
  implements Checkable
{
  public c(Context paramContext)
  {
    super(paramContext);
  }

  public final boolean isChecked()
  {
    AppMethodBeat.i(113021);
    View localView = getChildAt(0);
    boolean bool;
    if ((localView instanceof Checkable))
    {
      bool = ((Checkable)localView).isChecked();
      AppMethodBeat.o(113021);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(113021);
      bool = false;
    }
  }

  public final void setChecked(boolean paramBoolean)
  {
    AppMethodBeat.i(113022);
    View localView = getChildAt(0);
    if ((localView instanceof Checkable))
      ((Checkable)localView).setChecked(paramBoolean);
    AppMethodBeat.o(113022);
  }

  public final void toggle()
  {
    AppMethodBeat.i(113023);
    View localView = getChildAt(0);
    if ((localView instanceof Checkable))
      ((Checkable)localView).toggle();
    AppMethodBeat.o(113023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.c
 * JD-Core Version:    0.6.2
 */