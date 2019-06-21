package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;

public final class cn
{
  public static cm a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(100949);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(100949);
    }
    while (true)
    {
      return paramBitmap;
      Bitmap localBitmap = ic.a(paramBitmap);
      paramBitmap = new bl(7);
      paramBitmap.a(localBitmap);
      paramBitmap = new cm(paramBitmap);
      AppMethodBeat.o(100949);
    }
  }

  public static cm a(View paramView)
  {
    Object localObject = null;
    AppMethodBeat.i(100950);
    if (paramView == null)
    {
      AppMethodBeat.o(100950);
      paramView = localObject;
    }
    while (true)
    {
      return paramView;
      try
      {
        paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
        paramView.buildDrawingCache();
        Bitmap localBitmap = paramView.getDrawingCache();
        cm localcm = a(localBitmap);
        if (localBitmap != null)
          localBitmap.recycle();
        paramView.destroyDrawingCache();
        AppMethodBeat.o(100950);
        paramView = localcm;
      }
      catch (Exception paramView)
      {
        AppMethodBeat.o(100950);
        paramView = localObject;
      }
    }
  }

  public static cm a(String paramString)
  {
    AppMethodBeat.i(100948);
    bl localbl = new bl(2);
    localbl.a(paramString);
    paramString = new cm(localbl);
    AppMethodBeat.o(100948);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cn
 * JD-Core Version:    0.6.2
 */