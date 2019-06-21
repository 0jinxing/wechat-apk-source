package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.d;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.x;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import com.tencent.mm.plugin.appbrand.widget.base.a;
import com.tencent.mm.plugin.appbrand.widget.base.b;
import com.tencent.mm.plugin.appbrand.widget.base.e;
import com.tencent.mm.plugin.appbrand.widget.base.e.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class al
  implements com.tencent.mm.plugin.appbrand.page.al
{
  private final u hTn;
  private final g jhh;

  al(u paramu)
  {
    AppMethodBeat.i(123860);
    this.hTn = paramu;
    this.jhh = new g(paramu);
    AppMethodBeat.o(123860);
  }

  public final void a(com.tencent.mm.plugin.appbrand.page.ah paramah)
  {
    AppMethodBeat.i(123862);
    if ((paramah == com.tencent.mm.plugin.appbrand.page.ah.iuT) || (paramah == com.tencent.mm.plugin.appbrand.page.ah.iuU))
      o.v(this.hTn);
    AppMethodBeat.o(123862);
  }

  public final void c(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123865);
    this.jhh.c(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(123865);
  }

  public final ViewGroup getContainer()
  {
    return this.jhh;
  }

  public final void nT(int paramInt)
  {
    AppMethodBeat.i(123863);
    this.jhh.setTranslationY(paramInt);
    AppMethodBeat.o(123863);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(123864);
    this.jhh.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(123864);
  }

  public final void setupWebViewTouchInterceptor(aj paramaj)
  {
    AppMethodBeat.i(123861);
    paramaj = (ViewGroup)paramaj.getContentView();
    final g localg = this.jhh;
    paramaj.setOnTouchListener(new View.OnTouchListener()
    {
      @SuppressLint({"ClickableViewAccessibility"})
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        boolean bool1 = true;
        AppMethodBeat.i(123858);
        if (paramAnonymousMotionEvent.getAction() != 0)
          d.a(localg, paramAnonymousMotionEvent);
        ah localah = this.jhj;
        boolean bool2;
        boolean bool3;
        label48: e locale;
        if (paramAnonymousMotionEvent == null)
        {
          bool2 = false;
          if (bool2)
          {
            AppMethodBeat.o(123858);
            bool3 = bool1;
            return bool3;
          }
        }
        else
        {
          locale = localah.jgO.jdB;
          if (locale.eAl.onFilterTouchEventForSecurity(paramAnonymousMotionEvent))
          {
            Object localObject;
            label118: int i;
            if (paramAnonymousMotionEvent.getActionMasked() == 0)
            {
              paramAnonymousView = new b(locale.eAl);
              if (paramAnonymousMotionEvent.getActionMasked() != 0)
                break label279;
              localObject = new e.a(paramAnonymousMotionEvent.getDownTime(), paramAnonymousMotionEvent.getEventTime(), (byte)0);
              locale.iVl = ((e.a)localObject);
              bool3 = false;
              label128: if (!paramAnonymousView.hasNext())
                break label313;
              localObject = (View)paramAnonymousView.next();
              i = paramAnonymousMotionEvent.getActionIndex();
              if (!locale.eAl.isMotionEventSplittingEnabled())
                break label285;
            }
            label264: label279: label285: for (int j = 1 << paramAnonymousMotionEvent.getPointerId(i); ; j = -1)
            {
              float f1 = paramAnonymousMotionEvent.getX(i);
              float f2 = paramAnonymousMotionEvent.getY(i);
              if (paramAnonymousMotionEvent.getActionMasked() != 0)
                break label291;
              if ((!AppBrandViewMotionCompat.cC((View)localObject)) || (!AppBrandViewMotionCompat.a(locale.eAl, f1, f2, (View)localObject)))
                break label128;
              if (!AppBrandViewMotionCompat.cB((View)localObject))
                break label602;
              if (!AppBrandViewMotionCompat.dispatchTransformedTouchEvent(locale.eAl, paramAnonymousMotionEvent, false, (View)localObject, j))
                break label599;
              locale.iVk.addLast(localObject);
              bool3 |= true;
              break label128;
              paramAnonymousView = locale.iVk.iterator();
              break;
              localObject = null;
              break label118;
            }
            label291: bool3 = AppBrandViewMotionCompat.dispatchTransformedTouchEvent(locale.eAl, paramAnonymousMotionEvent, false, (View)localObject, j) | bool3;
          }
        }
        label313: label454: label599: label602: 
        while (true)
        {
          break label128;
          bool2 = bool3;
          switch (paramAnonymousMotionEvent.getActionMasked())
          {
          default:
            bool2 = bool3;
          case 2:
            a.a("MicroMsg.AppBrand.InputTouchDuplicateDispatcher", "[textscroll] handled | ".concat(String.valueOf(bool2)), paramAnonymousMotionEvent);
            if (2 == paramAnonymousMotionEvent.getActionMasked())
            {
              if ((bool2) && (!localah.jgP))
              {
                paramAnonymousView = (y)localah.jgT.cR(localah.jgO);
                if (paramAnonymousView != null)
                {
                  if (paramAnonymousView.itL)
                    break label518;
                  bool3 = true;
                  localah.jgQ = bool3;
                  paramAnonymousView.setPullDownEnabled(false);
                  paramAnonymousView.requestDisallowInterceptTouchEvent(true);
                  localah.jgP = true;
                }
              }
              if (!bool2)
                break label524;
              localah.jgR = true;
            }
            else
            {
              switch (paramAnonymousMotionEvent.getActionMasked())
              {
              case 2:
              default:
              case 0:
              case 1:
              case 3:
              }
            }
            break;
          case 1:
          case 3:
            while (true)
            {
              label352: bool2 = false;
              break;
              locale.iVk.clear();
              bool2 = bool3;
              break label352;
              bool2 = false;
              break label352;
              bool3 = false;
              break label420;
              if (!localah.jgR)
                break label454;
              localah.jgR = false;
              break label454;
              if (localah.jgP)
              {
                paramAnonymousView = (y)localah.jgT.cR(localah.jgO);
                if (paramAnonymousView != null)
                  paramAnonymousView.setPullDownEnabled(localah.jgQ);
                localah.jgP = false;
              }
            }
            AppMethodBeat.o(123858);
            bool3 = false;
            break label48;
            break label264;
          }
        }
      }
    });
    AppMethodBeat.o(123861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.al
 * JD-Core Version:    0.6.2
 */