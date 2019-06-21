package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(14)
public final class au
{
  public static void a(Canvas paramCanvas, View paramView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(91121);
    if (paramView.getVisibility() != 0)
      AppMethodBeat.o(91121);
    while (true)
    {
      return;
      if ((paramView instanceof TextureView))
      {
        paramView = ((TextureView)paramView).getBitmap(paramView.getWidth(), paramView.getHeight());
        if ((paramView != null) && (!paramView.isRecycled()))
          paramCanvas.drawBitmap(paramView, paramFloat1, paramFloat2, null);
        AppMethodBeat.o(91121);
      }
      else if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++)
        {
          View localView = paramView.getChildAt(i);
          a(paramCanvas, localView, localView.getX() + paramFloat1, localView.getY() + paramFloat2);
        }
        AppMethodBeat.o(91121);
      }
      else
      {
        paramCanvas.save();
        paramCanvas.translate(paramFloat1, paramFloat2);
        paramView.draw(paramCanvas);
        paramCanvas.restore();
        AppMethodBeat.o(91121);
      }
    }
  }

  public static boolean i(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(91122);
    boolean bool1;
    if ((paramViewGroup == null) || (paramViewGroup.getChildCount() == 0))
    {
      AppMethodBeat.o(91122);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      int i = paramViewGroup.getChildCount();
      int j = 0;
      boolean bool2 = false;
      while (true)
      {
        bool1 = bool2;
        if (j >= i)
          break;
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof TextureView))
          bool2 = true;
        if ((localView instanceof ViewGroup))
          bool2 = i((ViewGroup)localView);
        bool1 = bool2;
        if (bool2)
          break;
        j++;
      }
      AppMethodBeat.o(91122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.au
 * JD-Core Version:    0.6.2
 */