package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$2
  implements View.OnTouchListener
{
  float hke;
  float hkf;
  int ozm = -1;
  int ozn = -1;
  int ozo;
  int ozp;

  n$2(n paramn)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(55012);
    if (!n.h(this.ozl))
      AppMethodBeat.o(55012);
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getActionMasked())
      {
      case 4:
      default:
        AppMethodBeat.o(55012);
        break;
      case 2:
        if ((!n.a(this.ozl, true)) && (!n.a(this.ozl, false)))
        {
          AppMethodBeat.o(55012);
        }
        else if (n.i(this.ozl))
        {
          AppMethodBeat.o(55012);
          bool = true;
        }
        else
        {
          this.ozp = 0;
          bool = false;
          if (this.ozp < paramMotionEvent.getPointerCount())
          {
            this.ozo = paramMotionEvent.getPointerId(this.ozp);
            if ((this.ozo == this.ozm) || (this.ozo == this.ozn))
            {
              paramView = this.ozl;
              if (this.ozo != this.ozm)
                break label266;
              bool = true;
              n.a(paramView, bool, paramMotionEvent.getX(this.ozp));
              if (n.j(this.ozl) != null)
              {
                paramView = n.j(this.ozl);
                if (this.ozo != this.ozm)
                  break label271;
              }
            }
            for (bool = true; ; bool = false)
            {
              paramView.iZ(bool);
              bool = true;
              this.ozp += 1;
              break;
              bool = false;
              break label200;
            }
          }
          AppMethodBeat.o(55012);
        }
        break;
      case 1:
      case 3:
      case 6:
        this.ozo = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
        if ((this.ozo != this.ozm) && (this.ozo != this.ozn))
        {
          AppMethodBeat.o(55012);
        }
        else
        {
          if (n.j(this.ozl) != null)
            n.j(this.ozl).bQn();
          paramView = this.ozl;
          if (this.ozo == this.ozm)
          {
            bool = true;
            n.a(paramView, bool, false);
            if (this.ozo != this.ozm)
              break label403;
            this.ozm = -1;
          }
          while (true)
          {
            AppMethodBeat.o(55012);
            bool = true;
            break;
            bool = false;
            break label366;
            this.ozn = -1;
          }
        }
        break;
      case 0:
      case 5:
        label200: label366: this.ozp = paramMotionEvent.getActionIndex();
        label266: label271: label403: this.ozo = paramMotionEvent.getPointerId(this.ozp);
        this.hke = paramMotionEvent.getX(this.ozp);
        this.hkf = paramMotionEvent.getY(this.ozp);
        if (n.a(this.ozl, n.c(this.ozl), this.hke, this.hkf))
        {
          if (n.a(this.ozl, true))
          {
            AppMethodBeat.o(55012);
          }
          else
          {
            if (n.j(this.ozl) != null)
              n.j(this.ozl).bQm();
            this.ozm = this.ozo;
            n.a(this.ozl, n.c(this.ozl).getBounds().left);
            n.a(this.ozl, true, true);
            AppMethodBeat.o(55012);
            bool = true;
          }
        }
        else if (n.a(this.ozl, n.e(this.ozl), this.hke, this.hkf))
        {
          if (n.a(this.ozl, false))
          {
            AppMethodBeat.o(55012);
          }
          else
          {
            if (n.j(this.ozl) != null)
              n.j(this.ozl).bQm();
            this.ozn = this.ozo;
            n.b(this.ozl, n.e(this.ozl).getBounds().right);
            n.a(this.ozl, false, true);
            AppMethodBeat.o(55012);
            bool = true;
          }
        }
        else
          AppMethodBeat.o(55012);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.n.2
 * JD-Core Version:    0.6.2
 */