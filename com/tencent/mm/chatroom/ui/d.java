package com.tencent.mm.chatroom.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public final class d extends TouchDelegate
{
  private static final Rect eoc;
  ArrayList<TouchDelegate> eod;
  TouchDelegate eoe;

  static
  {
    AppMethodBeat.i(104461);
    eoc = new Rect();
    AppMethodBeat.o(104461);
  }

  public d(View paramView)
  {
    super(eoc, paramView);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(104460);
    Object localObject;
    label42: boolean bool;
    switch (paramMotionEvent.getAction())
    {
    default:
      localObject = null;
      if (localObject == null)
      {
        bool = false;
        AppMethodBeat.o(104460);
      }
      break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return bool;
      if (this.eod == null)
        break;
      localObject = this.eod.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          TouchDelegate localTouchDelegate = (TouchDelegate)((Iterator)localObject).next();
          if ((localTouchDelegate != null) && (localTouchDelegate.onTouchEvent(paramMotionEvent)))
          {
            this.eoe = localTouchDelegate;
            bool = true;
            AppMethodBeat.o(104460);
            break;
          }
        }
      localObject = null;
      break label42;
      localObject = this.eoe;
      break label42;
      localObject = this.eoe;
      this.eoe = null;
      break label42;
      bool = ((TouchDelegate)localObject).onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(104460);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.d
 * JD-Core Version:    0.6.2
 */