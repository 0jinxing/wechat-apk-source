package com.tencent.mm.pluginsdk.ui.e;

import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.StaticTextView;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
{
  public static boolean a(View paramView, Spanned paramSpanned)
  {
    boolean bool = true;
    AppMethodBeat.i(79811);
    int i;
    if ((paramView != null) && (paramSpanned != null) && (((paramView instanceof TextView)) || ((paramView instanceof StaticTextView))))
    {
      i = ey(paramView);
      if ((i == 1) && (paramSpanned.length() > 500))
      {
        ab.e("MicroMsg.InvalidTextCheck", "error black dot");
        AppMethodBeat.o(79811);
      }
    }
    while (true)
    {
      return bool;
      for (int j = 1; ; j++)
      {
        if (j >= i)
          break label116;
        if (ag(paramView, j) - ag(paramView, j - 1) > 500)
        {
          ab.e("MicroMsg.InvalidTextCheck", "error black dot");
          AppMethodBeat.o(79811);
          break;
        }
      }
      label116: bool = false;
      AppMethodBeat.o(79811);
    }
  }

  private static int ag(View paramView, int paramInt)
  {
    AppMethodBeat.i(79810);
    if ((paramView instanceof TextView))
      if (((TextView)paramView).getLayout() == null)
      {
        AppMethodBeat.o(79810);
        paramInt = 0;
      }
    while (true)
    {
      return paramInt;
      paramInt = ((TextView)paramView).getLayout().getLineEnd(paramInt);
      AppMethodBeat.o(79810);
      continue;
      if ((paramView instanceof StaticTextView))
      {
        if (((StaticTextView)paramView).getTvLayout() == null)
        {
          AppMethodBeat.o(79810);
          paramInt = 0;
        }
        else
        {
          paramInt = ((StaticTextView)paramView).getTvLayout().getLineEnd(paramInt);
          AppMethodBeat.o(79810);
        }
      }
      else
      {
        AppMethodBeat.o(79810);
        paramInt = 0;
      }
    }
  }

  private static int ey(View paramView)
  {
    AppMethodBeat.i(79809);
    int i = 0;
    if ((paramView instanceof TextView))
      i = ((TextView)paramView).getLineCount();
    while (true)
    {
      AppMethodBeat.o(79809);
      return i;
      if ((paramView instanceof StaticTextView))
        i = ((StaticTextView)paramView).getLineCount();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.e
 * JD-Core Version:    0.6.2
 */