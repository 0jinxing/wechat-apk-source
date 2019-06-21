package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public static int a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(40341);
    int i = paramViewGroup.getChildCount() - 1;
    if (i >= 0)
      if (d(paramViewGroup.getChildAt(i), paramFloat1, paramFloat2))
        AppMethodBeat.o(40341);
    while (true)
    {
      return i;
      i--;
      break;
      i = -1;
      AppMethodBeat.o(40341);
    }
  }

  public static boolean d(View paramView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(40342);
    boolean bool;
    if ((paramFloat1 >= paramView.getLeft()) && (paramFloat1 <= paramView.getRight()) && (paramFloat2 >= paramView.getTop()) && (paramFloat2 <= paramView.getBottom()))
    {
      bool = true;
      AppMethodBeat.o(40342);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40342);
    }
  }

  public static float dS(View paramView)
  {
    AppMethodBeat.i(40339);
    float f = Math.abs((paramView.getRight() - paramView.getLeft()) / 2);
    AppMethodBeat.o(40339);
    return f;
  }

  public static float dT(View paramView)
  {
    AppMethodBeat.i(40340);
    float f = Math.abs((paramView.getBottom() - paramView.getTop()) / 2);
    AppMethodBeat.o(40340);
    return f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.f
 * JD-Core Version:    0.6.2
 */