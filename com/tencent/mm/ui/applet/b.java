package com.tencent.mm.ui.applet;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class b
{
  int direction;
  private MessageQueue.IdleHandler jQs;
  private GestureDetector lCs;
  private int yrA;
  private b.c yrB;
  LinkedList<String> yrC;
  b.a yrD;

  public b(b.a parama)
  {
    AppMethodBeat.i(106227);
    this.direction = 0;
    this.lCs = new GestureDetector(new b.2(this));
    this.yrD = parama;
    this.yrA = 15;
    this.yrB = new b.c(this);
    this.yrC = new LinkedList();
    this.jQs = new b.1(this);
    Looper.myQueue().addIdleHandler(this.jQs);
    AppMethodBeat.o(106227);
  }

  public final void a(int paramInt, b.b paramb)
  {
    AppMethodBeat.i(106228);
    if (paramb == null)
    {
      ab.e("MicroMsg.EarlyGetHeadImg", "earlyGet, getter is null, no early get headimg will be performed");
      AppMethodBeat.o(106228);
    }
    while (true)
    {
      return;
      if (this.yrA <= 0)
      {
        ab.e("MicroMsg.EarlyGetHeadImg", "earlyGet fail, threshold is invalid");
        AppMethodBeat.o(106228);
      }
      else
      {
        int i = paramb.apO();
        int j = 1;
        label54: if (j <= this.yrA)
        {
          String str;
          if (this.direction == 1)
          {
            if (paramInt - j < 0)
            {
              AppMethodBeat.o(106228);
            }
            else
            {
              str = paramb.mW(paramInt - j);
              if ((str != null) && (str.length() != 0) && (!this.yrB.contains(str)))
              {
                this.yrB.wy(str);
                this.yrC.add(str);
              }
            }
          }
          else
            while (true)
            {
              j++;
              break label54;
              if (paramInt + j >= i)
              {
                AppMethodBeat.o(106228);
                break;
              }
              str = paramb.mW(paramInt + j);
              if ((str != null) && (str.length() != 0) && (!this.yrB.contains(str)))
              {
                this.yrB.wy(str);
                this.yrC.add(str);
              }
            }
        }
        else
        {
          AppMethodBeat.o(106228);
        }
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(106230);
    if (this.jQs != null)
      Looper.myQueue().removeIdleHandler(this.jQs);
    AppMethodBeat.o(106230);
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106229);
    if (this.lCs != null)
      this.lCs.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(106229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.b
 * JD-Core Version:    0.6.2
 */