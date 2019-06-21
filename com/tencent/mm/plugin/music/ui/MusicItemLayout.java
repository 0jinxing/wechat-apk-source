package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MusicItemLayout extends LinearLayout
{
  private GestureDetector lCs;

  public MusicItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105067);
    initView();
    AppMethodBeat.o(105067);
  }

  public MusicItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105068);
    initView();
    AppMethodBeat.o(105068);
  }

  private void initView()
  {
    AppMethodBeat.i(105069);
    this.lCs = new GestureDetector(getContext(), new MusicItemLayout.a(this, (byte)0));
    AppMethodBeat.o(105069);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105070);
    b.a locala = (b.a)getTag();
    int i;
    if (!locala.bUM())
    {
      if ((locala.oOE.getX() <= paramMotionEvent.getX()) && (paramMotionEvent.getX() <= locala.oOE.getX() + locala.oOE.getMeasuredWidth()) && (locala.oOE.getY() <= paramMotionEvent.getY()))
      {
        float f1 = paramMotionEvent.getY();
        float f2 = locala.oOE.getY();
        if (f1 <= locala.oOE.getMeasuredHeight() + f2)
        {
          i = 1;
          if (i == 0)
            break label129;
        }
      }
    }
    else
      AppMethodBeat.o(105070);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      i = 0;
      break;
      label129: AppMethodBeat.o(105070);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105071);
    this.lCs.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(105071);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicItemLayout
 * JD-Core Version:    0.6.2
 */