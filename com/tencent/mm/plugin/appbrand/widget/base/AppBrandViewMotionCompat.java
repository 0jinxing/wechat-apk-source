package com.tencent.mm.plugin.appbrand.widget.base;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.support.annotation.Keep;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandViewMotionCompat
{
  @TargetApi(11)
  public static boolean a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2, View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(91198);
    float[] arrayOfFloat = new float[2];
    float[] tmp15_13 = arrayOfFloat;
    tmp15_13[0] = 0.0F;
    float[] tmp19_15 = tmp15_13;
    tmp19_15[1] = 0.0F;
    tmp19_15;
    arrayOfFloat[0] = (paramViewGroup.getScrollX() - paramView.getLeft() + paramFloat1);
    arrayOfFloat[1] = (paramViewGroup.getScrollY() - paramView.getTop() + paramFloat2);
    paramViewGroup = paramView.getMatrix();
    if (!paramViewGroup.isIdentity())
    {
      paramViewGroup.invert(paramViewGroup);
      paramViewGroup.mapPoints(arrayOfFloat);
    }
    if ((arrayOfFloat[0] >= 0.0F) && (arrayOfFloat[1] >= 0.0F) && (arrayOfFloat[0] < paramView.getRight() - paramView.getLeft()) && (arrayOfFloat[1] < paramView.getBottom() - paramView.getTop()))
      AppMethodBeat.o(91198);
    while (true)
    {
      return bool;
      AppMethodBeat.o(91198);
      bool = false;
    }
  }

  public static boolean cB(View paramView)
  {
    AppMethodBeat.i(91196);
    boolean bool;
    if ((paramView != null) && ((paramView instanceof c)) && (((c)paramView).aOQ()))
    {
      bool = true;
      AppMethodBeat.o(91196);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91196);
    }
  }

  public static boolean cC(View paramView)
  {
    AppMethodBeat.i(91197);
    boolean bool;
    if ((paramView.getVisibility() == 0) || (paramView.getAnimation() != null))
    {
      bool = true;
      AppMethodBeat.o(91197);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91197);
    }
  }

  @TargetApi(11)
  @Keep
  public static boolean dispatchTransformedTouchEvent(ViewGroup paramViewGroup, MotionEvent paramMotionEvent, boolean paramBoolean, View paramView, int paramInt)
  {
    AppMethodBeat.i(91199);
    if ((paramViewGroup == null) || (paramMotionEvent == null))
    {
      paramBoolean = false;
      AppMethodBeat.o(91199);
    }
    while (true)
    {
      return paramBoolean;
      int i = paramMotionEvent.getAction();
      if ((paramBoolean) || (i == 3))
      {
        paramMotionEvent.setAction(3);
        if (paramView == null)
        {
          paramBoolean = false;
          AppMethodBeat.o(91199);
        }
        else
        {
          paramBoolean = paramView.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(i);
          AppMethodBeat.o(91199);
        }
      }
      else
      {
        i = 0;
        int j = paramMotionEvent.getPointerCount();
        for (int k = 0; k < j; k++)
          i |= 1 << paramMotionEvent.getPointerId(k);
        int m = i & paramInt;
        if (m == 0)
        {
          paramBoolean = false;
          AppMethodBeat.o(91199);
        }
        else if (m == i)
        {
          if ((paramView == null) || (paramView.getMatrix().isIdentity()))
          {
            if (paramView == null)
            {
              paramBoolean = false;
              AppMethodBeat.o(91199);
              continue;
            }
            float f1 = paramViewGroup.getScrollX() - paramView.getLeft();
            float f2 = paramViewGroup.getScrollY() - paramView.getTop();
            paramMotionEvent.offsetLocation(f1, f2);
            paramBoolean = paramView.dispatchTouchEvent(paramMotionEvent);
            paramMotionEvent.offsetLocation(-f1, -f2);
            AppMethodBeat.o(91199);
          }
        }
        else
        {
          label437: MotionEvent localMotionEvent;
          for (paramMotionEvent = MotionEvent.obtain(paramMotionEvent); ; paramMotionEvent = localMotionEvent)
          {
            if (paramView != null)
              break label686;
            paramBoolean = false;
            AppMethodBeat.o(91199);
            break;
            MotionEvent.PointerProperties[] arrayOfPointerProperties;
            MotionEvent.PointerCoords[] arrayOfPointerCoords;
            int[] arrayOfInt;
            int i2;
            int i3;
            try
            {
              int n = paramMotionEvent.getPointerCount();
              arrayOfPointerProperties = new MotionEvent.PointerProperties[n];
              arrayOfPointerCoords = new MotionEvent.PointerCoords[n];
              arrayOfInt = new int[n];
              i1 = paramMotionEvent.getAction();
              i2 = i1 & 0xFF;
              k = -1;
              i = 0;
              paramInt = 0;
              while (paramInt < n)
              {
                paramMotionEvent.getPointerProperties(paramInt, arrayOfPointerProperties[i]);
                i3 = k;
                j = i;
                if ((1 << arrayOfPointerProperties[i].id & m) != 0)
                {
                  if (paramInt == (0xFF00 & i1) >> 8)
                    k = i;
                  arrayOfInt[i] = paramInt;
                  j = i + 1;
                  i3 = k;
                }
                paramInt++;
                k = i3;
                i = j;
              }
              if (i != 0)
                break label437;
              paramViewGroup = new java/lang/IllegalArgumentException;
              paramViewGroup.<init>("idBits did not match any ids in the event");
              AppMethodBeat.o(91199);
              throw paramViewGroup;
            }
            catch (IllegalArgumentException paramViewGroup)
            {
              d.w("MicroMsg.AppBrandViewMotionCompat", "dispatchTransformedTouchEvent e=%s", new Object[] { paramViewGroup.getMessage() });
              paramBoolean = false;
              AppMethodBeat.o(91199);
            }
            break;
            if (i2 != 5)
            {
              paramInt = i1;
              if (i2 != 6);
            }
            else
            {
              if (k >= 0)
                break label524;
              paramInt = 2;
            }
            localMotionEvent = null;
            int i1 = paramMotionEvent.getHistorySize();
            k = 0;
            if (k <= i1)
            {
              if (k == i1);
              for (j = -2147483648; ; j = k)
              {
                for (i3 = 0; i3 < i; i3++)
                  paramMotionEvent.getHistoricalPointerCoords(arrayOfInt[i3], j, arrayOfPointerCoords[i3]);
                label524: if (i == 1)
                {
                  if (i2 == 5);
                  for (paramInt = 0; ; paramInt = 1)
                    break;
                }
                paramInt = i2 | k << 8;
                break;
              }
              long l = paramMotionEvent.getHistoricalEventTime(j);
              if (k == 0)
              {
                localMotionEvent = MotionEvent.obtain(paramMotionEvent.getDownTime(), paramMotionEvent.getEventTime(), paramInt, i, arrayOfPointerProperties, arrayOfPointerCoords, paramMotionEvent.getMetaState(), paramMotionEvent.getButtonState(), paramMotionEvent.getXPrecision(), paramMotionEvent.getYPrecision(), paramMotionEvent.getDeviceId(), paramMotionEvent.getEdgeFlags(), paramMotionEvent.getSource(), paramMotionEvent.getFlags());
                localMotionEvent.offsetLocation(localMotionEvent.getX() - localMotionEvent.getRawX(), localMotionEvent.getY() - localMotionEvent.getRawY());
              }
              while (true)
              {
                k++;
                break;
                localMotionEvent.addBatch(l, arrayOfPointerCoords, 0);
              }
            }
          }
          label686: paramMotionEvent.offsetLocation(paramViewGroup.getScrollX() - paramView.getLeft(), paramViewGroup.getScrollY() - paramView.getTop());
          if (!paramView.getMatrix().isIdentity())
          {
            paramViewGroup = paramView.getMatrix();
            paramViewGroup.invert(paramViewGroup);
            paramMotionEvent.transform(paramViewGroup);
          }
          paramBoolean = paramView.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.recycle();
          AppMethodBeat.o(91199);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat
 * JD-Core Version:    0.6.2
 */