package com.tencent.toybrick.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.c.g;
import java.util.LinkedList;

public final class a$a
{
  public LinkedList<g> AGQ;
  public boolean AGR;
  public Drawable AGS;

  public a$a(a parama, Context paramContext)
  {
    AppMethodBeat.i(113224);
    this.AGQ = new LinkedList();
    this.AGR = true;
    this.AGS = new ColorDrawable(paramContext.getResources().getColor(2131690211));
    AppMethodBeat.o(113224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.d.a.a
 * JD-Core Version:    0.6.2
 */