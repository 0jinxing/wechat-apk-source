package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.r.l;
import com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public static void a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91079);
    int i = paramViewGroup.getChildCount();
    int j = paramMotionEvent.getActionIndex();
    if (paramViewGroup.isMotionEventSplittingEnabled())
    {
      j = 1 << paramMotionEvent.getPointerId(j);
      i--;
      label33: if (i < 0)
        break label132;
      View localView = paramViewGroup.getChildAt(i);
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((!AppBrandViewMotionCompat.cC(localView)) || (!AppBrandViewMotionCompat.a(paramViewGroup, f1, f2, localView)) || (!localView.isDuplicateParentStateEnabled()))
        break label126;
      a(paramViewGroup, paramMotionEvent, localView, j);
      if ((!(localView instanceof e)) || (!((e)localView).aCH()))
        break label126;
      AppMethodBeat.o(91079);
    }
    while (true)
    {
      return;
      j = -1;
      break;
      label126: i--;
      break label33;
      label132: AppMethodBeat.o(91079);
    }
  }

  private static boolean a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent, View paramView, int paramInt)
  {
    AppMethodBeat.i(91080);
    boolean bool;
    if (paramView == null)
    {
      ab.v("MicroMsg.ViewMotionHelper", "child is null.");
      AppMethodBeat.o(91080);
      bool = false;
    }
    Object localObject;
    while (true)
    {
      return bool;
      int i = paramMotionEvent.getAction();
      if (i == 3)
      {
        paramMotionEvent.setAction(3);
        bool = paramView.dispatchTouchEvent(paramMotionEvent);
        paramMotionEvent.setAction(i);
        AppMethodBeat.o(91080);
      }
      else
      {
        i = ((Integer)l.a(MotionEvent.class, "getPointerIdBits", paramMotionEvent, new Class[0], new Object[0], Integer.valueOf(0))).intValue();
        paramInt = i & paramInt;
        if (paramInt == 0)
        {
          ab.v("MicroMsg.ViewMotionHelper", "newPointerIdBits is 0.");
          AppMethodBeat.o(91080);
          bool = false;
        }
        else
        {
          localObject = Boolean.FALSE;
          bool = ((Boolean)l.a(View.class, "hasIdentityMatrix", paramView, new Class[0], new Object[0], localObject)).booleanValue();
          if (paramInt != i)
            break label296;
          if (!bool)
            break;
          float f1 = paramViewGroup.getScrollX() - paramView.getLeft();
          float f2 = paramViewGroup.getScrollY() - paramView.getTop();
          paramMotionEvent.offsetLocation(f1, f2);
          bool = paramView.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.offsetLocation(-f1, -f2);
          AppMethodBeat.o(91080);
        }
      }
    }
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    while (true)
    {
      paramMotionEvent.offsetLocation(paramViewGroup.getScrollX() - paramView.getLeft(), paramViewGroup.getScrollY() - paramView.getTop());
      if (!bool)
        paramMotionEvent.transform((Matrix)l.a(View.class, "getInverseMatrix", paramView, new Class[0], new Object[0], null));
      bool = paramView.dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.recycle();
      AppMethodBeat.o(91080);
      break;
      label296: localObject = (MotionEvent)l.a("split", paramMotionEvent, new Class[] { Integer.class }, new Object[] { Integer.valueOf(paramInt) });
      if (localObject == null)
        paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
      else
        paramMotionEvent = (MotionEvent)localObject;
    }
  }

  public static f co(View paramView)
  {
    AppMethodBeat.i(91078);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    paramView = new f(0, arrayOfInt[0], arrayOfInt[1]);
    AppMethodBeat.o(91078);
    return paramView;
  }

  public static final class d extends ah
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTouchMove";
  }

  public static final class f
  {
    public int id;
    public float x;
    public float y;

    public f()
    {
    }

    public f(int paramInt, float paramFloat1, float paramFloat2)
    {
      this.id = paramInt;
      this.x = paramFloat1;
      this.y = paramFloat2;
    }

    public final void b(int paramInt, float paramFloat1, float paramFloat2)
    {
      this.id = paramInt;
      this.x = paramFloat1;
      this.y = paramFloat2;
    }

    public final JSONObject toJSONObject()
    {
      AppMethodBeat.i(91076);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("id", this.id);
        localJSONObject.put("x", g.au(this.x));
        localJSONObject.put("y", g.au(this.y));
        label54: AppMethodBeat.o(91076);
        return localJSONObject;
      }
      catch (JSONException localJSONException)
      {
        break label54;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(91077);
      String str = toJSONObject().toString();
      AppMethodBeat.o(91077);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.d
 * JD-Core Version:    0.6.2
 */