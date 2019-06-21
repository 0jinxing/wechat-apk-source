package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class as
{
  public static void a(View paramView, Canvas paramCanvas)
  {
    AppMethodBeat.i(91119);
    boolean bool;
    if (paramView.getVisibility() != 0)
    {
      bool = true;
      if (!bool)
        break label55;
      AppMethodBeat.o(91119);
    }
    while (true)
    {
      return;
      if ((paramView instanceof ar))
      {
        bool = ((ar)paramView).g(paramCanvas);
        break;
      }
      paramView.draw(paramCanvas);
      bool = false;
      break;
      label55: if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++)
          a(paramView.getChildAt(i), paramCanvas);
      }
      AppMethodBeat.o(91119);
    }
  }

  public static Bitmap cq(View paramView)
  {
    AppMethodBeat.i(91120);
    if ((paramView.getWidth() < 0) || (paramView.getHeight() < 0))
    {
      paramView = null;
      AppMethodBeat.o(91120);
    }
    while (true)
    {
      return paramView;
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
      a(paramView, new Canvas(localBitmap));
      AppMethodBeat.o(91120);
      paramView = localBitmap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.as
 * JD-Core Version:    0.6.2
 */