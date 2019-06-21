package com.tencent.luggage.d;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.SwipeBackLayout.a;

final class n$1
  implements SwipeBackLayout.a
{
  n$1(n paramn, boolean[] paramArrayOfBoolean)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    return false;
  }

  public final void h(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(90842);
    Object localObject = this.bPS;
    paramInt = ((e)localObject).bPe.xh().indexOf(localObject);
    if (paramInt >= ((e)localObject).bPe.xh().size() - 1)
    {
      localObject = null;
      if (localObject != null)
        break label70;
      AppMethodBeat.o(90842);
    }
    while (true)
    {
      return;
      localObject = (e)((e)localObject).bPe.xh().get(paramInt + 1);
      break;
      label70: if ((Float.compare(1.0F, paramFloat) <= 0) && (this.bPR[0] == 0))
      {
        localObject = ((e)localObject).getContentView();
        ((View)localObject).clearAnimation();
        ((View)localObject).setTranslationX(0.0F);
        this.bPS.bPe.xi().aZ(false);
        this.bPR[0] = true;
      }
      d.i("", "scrollPercent %f", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(90842);
    }
  }

  public final void l(MotionEvent paramMotionEvent)
  {
  }

  public final void xv()
  {
    AppMethodBeat.i(90841);
    if (this.bPS.bPe.xh().size() <= 1)
      this.bPS.bPO.setEnableGesture(false);
    AppMethodBeat.o(90841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.n.1
 * JD-Core Version:    0.6.2
 */