package com.tencent.mm.view.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.br.b;

public final class c extends a
{
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  protected final boolean dML()
  {
    return false;
  }

  public final boolean dMM()
  {
    return false;
  }

  public final Rect getAliveRect()
  {
    AppMethodBeat.i(116421);
    Rect localRect;
    if (super.getAliveRect().isEmpty())
    {
      localRect = getBoardRect();
      AppMethodBeat.o(116421);
    }
    while (true)
    {
      return localRect;
      localRect = super.getAliveRect();
      AppMethodBeat.o(116421);
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116422);
    paramCanvas.drawColor(0);
    paramCanvas.setMatrix(this.cjd);
    getPresenter().onDraw(paramCanvas);
    AppMethodBeat.o(116422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.b.c
 * JD-Core Version:    0.6.2
 */