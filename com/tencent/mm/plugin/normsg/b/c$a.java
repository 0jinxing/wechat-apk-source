package com.tencent.mm.plugin.normsg.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class c$a
  implements View.OnClickListener
{
  private final View.OnClickListener oUZ;

  c$a(View.OnClickListener paramOnClickListener)
  {
    this.oUZ = paramOnClickListener;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(10432);
    synchronized (c.aEd())
    {
      if (!c.aEd().containsKey(paramView))
      {
        if (this.oUZ != null)
          this.oUZ.onClick(paramView);
        AppMethodBeat.o(10432);
        return;
      }
    }
    while (true)
    {
      synchronized (c.aje())
      {
        while (true)
          if (!c.aje().containsKey(paramView))
          {
            Class localClass = (Class)c.aEd().get(paramView);
            if (localClass != null);
            try
            {
              a.xxA.m((b)localClass.newInstance());
              break;
              paramView = finally;
              AppMethodBeat.o(10432);
              throw paramView;
            }
            catch (Throwable localThrowable)
            {
              while (true)
              {
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>("failure to instantiate event class: ");
                ab.printErrStackTrace("MicroMsg.CBCH", localThrowable, localClass.getName(), new Object[0]);
              }
            }
          }
      }
      c.aje().remove(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.c.a
 * JD-Core Version:    0.6.2
 */