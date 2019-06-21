package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.view.s;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.s.w;
import com.tencent.mm.sdk.platformtools.al;

final class k$3
  implements Runnable
{
  k$3(k paramk)
  {
  }

  private int aQK()
  {
    AppMethodBeat.i(123657);
    View localView = k.b(this.jeD);
    int i;
    if (localView != null)
    {
      i = localView.getScrollY();
      AppMethodBeat.o(123657);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(123657);
    }
  }

  private void b(final aa paramaa, final int paramInt)
  {
    AppMethodBeat.i(123656);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(123654);
        paramaa.qx(paramInt);
        AppMethodBeat.o(123654);
      }
    });
    AppMethodBeat.o(123656);
  }

  private void qC(int paramInt)
  {
    AppMethodBeat.i(123658);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", new Object[] { Integer.valueOf(paramInt) });
    View localView = k.b(this.jeD);
    if (localView != null)
    {
      localView.scrollTo(0, paramInt);
      k.k(this.jeD);
    }
    AppMethodBeat.o(123658);
  }

  public final void run()
  {
    AppMethodBeat.i(123655);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
    Object localObject1 = o.x(k.a(this.jeD));
    if (localObject1 == null)
      AppMethodBeat.o(123655);
    EditText localEditText;
    Object localObject2;
    while (true)
    {
      return;
      if (!k.a(this.jeD).isRunning())
      {
        AppMethodBeat.o(123655);
      }
      else
      {
        k.a(this.jeD, 0);
        if ((((aa)localObject1).getInputPanel() == null) || (((aa)localObject1).aQo() == null))
        {
          AppMethodBeat.o(123655);
        }
        else
        {
          localEditText = ((aa)localObject1).aQo();
          localObject2 = ((aa)localObject1).getInputPanel();
          if (w.ct(localEditText))
          {
            b((aa)localObject1, 0);
            AppMethodBeat.o(123655);
          }
          else if (!((ac)localObject2).aQV())
          {
            com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", new Object[] { Integer.valueOf(((View)localObject2).getHeight()), Integer.valueOf(k.e(this.jeD)) });
            if (k.f(this.jeD) < 5)
            {
              k.g(this.jeD);
              AppMethodBeat.o(123655);
            }
          }
          else
          {
            k.h(this.jeD);
            com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", new Object[] { Integer.valueOf(((View)localObject2).getHeight()) });
            b((aa)localObject1, ((View)localObject2).getHeight());
            if (((aa)localObject1).aQr())
              break;
            com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, no need adjust position, notify height %d", new Object[] { Integer.valueOf(((View)localObject2).getHeight()) });
            AppMethodBeat.o(123655);
          }
        }
      }
    }
    int[] arrayOfInt = new int[2];
    localEditText.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", new Object[] { Integer.valueOf(localEditText.getHeight()), Integer.valueOf(i), Boolean.valueOf(s.av(localEditText)) });
    k.i(this.jeD);
    int j = localEditText.getHeight() + i;
    ((View)localObject2).getLocationOnScreen(arrayOfInt);
    int k = arrayOfInt[1];
    int m;
    int n;
    if ((((ab)localEditText).aQP()) && (localEditText.getLayout() != null))
    {
      m = i + ((ab)localEditText).qI(localEditText.getLayout().getLineForOffset(localEditText.getSelectionStart()));
      n = i + ((ab)localEditText).qI(localEditText.getLayout().getLineForOffset(localEditText.getSelectionStart()) + 1);
      if (m - i >= localEditText.getHeight())
      {
        m = j - localEditText.getLineHeight();
        label449: if (n - i < localEditText.getHeight());
      }
    }
    while (true)
    {
      i = j;
      if (!k.a(this.jeD).aJQ())
        i = j + ((aa)localObject1).aQs();
      if (k != i)
      {
        if (m < k.j(this.jeD))
        {
          localObject1 = k.a(this.jeD).aJz();
          if (localObject1 != null)
          {
            localObject2 = ((aj)localObject1).getContentView();
            if ((localObject2 != null) && (localEditText != null));
          }
          else
          {
            AppMethodBeat.o(123655);
            break;
          }
          j = -(((aj)localObject1).getWebScrollY() - localEditText.getTop());
          ((View)localObject2).scrollBy(((View)localObject2).getScrollX(), j);
          AppMethodBeat.o(123655);
          break;
        }
        j = Math.max(-aQK(), Math.min(i - k, m - k.j(this.jeD)));
        localObject2 = k.a(this.jeD).aJz();
        if (localObject2 != null)
        {
          localObject1 = ((aj)localObject2).getContentView();
          if ((localObject1 != null) && (localEditText != null));
        }
        else
        {
          AppMethodBeat.o(123655);
          break;
        }
        if (((ab)localEditText).aQT())
        {
          qC(aQK() + j);
          AppMethodBeat.o(123655);
          break;
        }
        m = ((aj)localObject2).getHeight();
        i = ((aj)localObject2).getWebScrollY();
        k = g.qb(((aj)localObject2).getContentHeight());
        n = localEditText.getHeight();
        localEditText.getTop();
        if ((!((ab)localEditText).aQP()) && (localEditText.getTop() + n - i <= m))
        {
          qC(aQK() + j);
          AppMethodBeat.o(123655);
          break;
        }
        m = Math.max(0, Math.min(k - i - m, j));
        ((View)localObject1).scrollBy(((View)localObject1).getScrollX(), m);
        k.a(this.jeD, m);
        qC(j - m + aQK());
      }
      AppMethodBeat.o(123655);
      break;
      j = n;
      continue;
      break label449;
      m = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.k.3
 * JD-Core Version:    0.6.2
 */