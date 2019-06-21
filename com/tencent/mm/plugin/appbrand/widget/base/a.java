package com.tencent.mm.plugin.appbrand.widget.base;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static String D(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(77395);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
    int i = paramMotionEvent.getPointerCount();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append(", x[").append(j).append("]=").append(paramMotionEvent.getX(j));
      localStringBuilder.append(", y[").append(j).append("]=").append(paramMotionEvent.getY(j));
    }
    localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
    localStringBuilder.append(" }");
    paramMotionEvent = localStringBuilder.toString();
    AppMethodBeat.o(77395);
    return paramMotionEvent;
  }

  public static void a(String paramString1, String paramString2, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(77394);
    if (ab.getLogLevel() > 0)
      AppMethodBeat.o(77394);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString2).append(' ');
      localStringBuilder.append("[apptouch] MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
      int i = paramMotionEvent.getPointerCount();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append(", x[").append(j).append("]=").append(paramMotionEvent.getX(j));
        localStringBuilder.append(", y[").append(j).append("]=").append(paramMotionEvent.getY(j));
      }
      localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
      localStringBuilder.append(" }");
      ab.v(paramString1, localStringBuilder.toString());
      AppMethodBeat.o(77394);
    }
  }

  private static String actionToString(int paramInt)
  {
    AppMethodBeat.i(77396);
    int i;
    String str;
    switch (paramInt)
    {
    case 5:
    case 6:
    default:
      i = (0xFF00 & paramInt) >> 8;
      switch (paramInt & 0xFF)
      {
      default:
        str = Integer.toString(paramInt);
        AppMethodBeat.o(77396);
      case 5:
      case 6:
      }
      break;
    case 0:
    case 1:
    case 3:
    case 4:
    case 2:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      return str;
      str = "ACTION_DOWN";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_UP";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_CANCEL";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_OUTSIDE";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_MOVE";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_HOVER_MOVE";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_SCROLL";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_HOVER_ENTER";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_HOVER_EXIT";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_BUTTON_PRESS";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_BUTTON_RELEASE";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_POINTER_DOWN(" + i + ")";
      AppMethodBeat.o(77396);
      continue;
      str = "ACTION_POINTER_UP(" + i + ")";
      AppMethodBeat.o(77396);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.base.a
 * JD-Core Version:    0.6.2
 */