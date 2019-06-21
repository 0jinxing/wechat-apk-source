package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.layout.a;
import com.tencent.neattextview.textview.view.NeatTextView;

public final class b
{
  private static int a(View paramView, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(113168);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label74;
      paramInt = paramView.getOffsetForHorizontal(paramInt, paramFloat);
      AppMethodBeat.o(113168);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getOffsetForHorizontal(paramInt, paramFloat);
          AppMethodBeat.o(113168);
        }
      }
      else
      {
        label74: paramInt = 0;
        AppMethodBeat.o(113168);
      }
    }
  }

  public static void a(View paramView, CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(113163);
    if ((paramView instanceof NeatTextView))
    {
      ((NeatTextView)paramView).a(paramCharSequence, paramBufferType);
      AppMethodBeat.o(113163);
    }
    while (true)
    {
      return;
      if ((paramView instanceof TextView))
        ((TextView)paramView).setText(paramCharSequence, paramBufferType);
      AppMethodBeat.o(113163);
    }
  }

  private static boolean ap(View paramView, int paramInt)
  {
    AppMethodBeat.i(113161);
    boolean bool;
    if ((paramInt > 0) && (ar(paramView, paramInt) == ar(paramView, paramInt - 1) + 1))
    {
      bool = true;
      AppMethodBeat.o(113161);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113161);
    }
  }

  public static int aq(View paramView, int paramInt)
  {
    AppMethodBeat.i(113165);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineBaseline(paramInt);
      AppMethodBeat.o(113165);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineBaseline(paramInt);
          AppMethodBeat.o(113165);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113165);
      }
    }
  }

  public static int ar(View paramView, int paramInt)
  {
    AppMethodBeat.i(113166);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineForOffset(paramInt);
      AppMethodBeat.o(113166);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineForOffset(paramInt);
          AppMethodBeat.o(113166);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113166);
      }
    }
  }

  public static float as(View paramView, int paramInt)
  {
    AppMethodBeat.i(113167);
    float f;
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      f = paramView.getPrimaryHorizontal(paramInt);
      AppMethodBeat.o(113167);
    }
    while (true)
    {
      return f;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          f = paramView.getPrimaryHorizontal(paramInt);
          AppMethodBeat.o(113167);
        }
      }
      else
      {
        label72: f = 0.0F;
        AppMethodBeat.o(113167);
      }
    }
  }

  public static int at(View paramView, int paramInt)
  {
    AppMethodBeat.i(113169);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineTop(paramInt);
      AppMethodBeat.o(113169);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineTop(paramInt);
          AppMethodBeat.o(113169);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113169);
      }
    }
  }

  private static int au(View paramView, int paramInt)
  {
    AppMethodBeat.i(113170);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineBottom(paramInt);
      AppMethodBeat.o(113170);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineBottom(paramInt);
          AppMethodBeat.o(113170);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113170);
      }
    }
  }

  public static float av(View paramView, int paramInt)
  {
    AppMethodBeat.i(113171);
    float f;
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      f = paramView.getLineWidth(paramInt);
      AppMethodBeat.o(113171);
    }
    while (true)
    {
      return f;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          f = paramView.getLineWidth(paramInt);
          AppMethodBeat.o(113171);
        }
      }
      else
      {
        label72: f = 0.0F;
        AppMethodBeat.o(113171);
      }
    }
  }

  public static int aw(View paramView, int paramInt)
  {
    AppMethodBeat.i(113172);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineStart(paramInt);
      AppMethodBeat.o(113172);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineStart(paramInt);
          AppMethodBeat.o(113172);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113172);
      }
    }
  }

  private static int ax(View paramView, int paramInt)
  {
    AppMethodBeat.i(113173);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      paramInt = paramView.getLineForVertical(paramInt);
      AppMethodBeat.o(113173);
    }
    while (true)
    {
      return paramInt;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          paramInt = paramView.getLineForVertical(paramInt);
          AppMethodBeat.o(113173);
        }
      }
      else
      {
        label72: paramInt = 0;
        AppMethodBeat.o(113173);
      }
    }
  }

  private static float ay(View paramView, int paramInt)
  {
    AppMethodBeat.i(113174);
    float f;
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getLayout();
      if (paramView == null)
        break label72;
      f = paramView.getLineRight(paramInt);
      AppMethodBeat.o(113174);
    }
    while (true)
    {
      return f;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getLayout();
        if (paramView != null)
        {
          f = paramView.getLineRight(paramInt);
          AppMethodBeat.o(113174);
        }
      }
      else
      {
        label72: f = 0.0F;
        AppMethodBeat.o(113174);
      }
    }
  }

  public static int d(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(113160);
    int i = ax(paramView, paramInt2);
    int j = paramInt3;
    if (ap(paramView, paramInt3))
    {
      k = (int)as(paramView, paramInt3 - 1);
      m = (int)ay(paramView, i);
      j = paramInt3;
      if (paramInt1 > m - (m - k) / 2)
        j = paramInt3 - 1;
    }
    j = ar(paramView, j);
    int m = at(paramView, j);
    int n = au(paramView, j);
    int k = (n - m) / 2;
    if (i == j + 1)
    {
      paramInt3 = j;
      if (paramInt2 - n < k);
    }
    else
    {
      if ((i != j - 1) || (m - paramInt2 >= k))
        break label215;
    }
    label215: for (paramInt3 = j; ; paramInt3 = i)
    {
      paramInt2 = a(paramView, paramInt3, paramInt1);
      if ((paramInt2 < fs(paramView).length() - 1) && (ap(paramView, paramInt2 + 1)))
      {
        j = (int)as(paramView, paramInt2);
        paramInt3 = (int)ay(paramView, paramInt3);
        if (paramInt1 <= paramInt3 - (paramInt3 - j) / 2);
      }
      for (paramInt1 = paramInt2 + 1; ; paramInt1 = paramInt2)
      {
        AppMethodBeat.o(113160);
        return paramInt1;
      }
    }
  }

  public static CharSequence fs(View paramView)
  {
    AppMethodBeat.i(113162);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).dPr();
      AppMethodBeat.o(113162);
    }
    while (true)
    {
      return paramView;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getText();
        AppMethodBeat.o(113162);
      }
      else
      {
        paramView = "";
        AppMethodBeat.o(113162);
      }
    }
  }

  public static TextPaint ft(View paramView)
  {
    AppMethodBeat.i(113164);
    if ((paramView instanceof NeatTextView))
    {
      paramView = ((NeatTextView)paramView).getPaint();
      AppMethodBeat.o(113164);
    }
    while (true)
    {
      return paramView;
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getPaint();
        AppMethodBeat.o(113164);
      }
      else
      {
        paramView = null;
        AppMethodBeat.o(113164);
      }
    }
  }

  public static int getScreenWidth(Context paramContext)
  {
    AppMethodBeat.i(113159);
    int i = paramContext.getResources().getDisplayMetrics().widthPixels;
    AppMethodBeat.o(113159);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.b
 * JD-Core Version:    0.6.2
 */