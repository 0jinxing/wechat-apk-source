package com.tencent.mm.plugin.emojicapture.ui;

import a.a.e;
import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"DEFAULT_STROKE_COLOR", "", "DEFAULT_TEXT_COLOR", "STROKE_COLORS", "", "getSTROKE_COLORS", "()[I", "TEXT_COLORS", "getTEXT_COLORS", "findStrokeColor", "textColor", "findTextColor", "isRedPackageScene", "", "scene", "waitUploading", "waitingMixing", "getIconNorColor", "Landroid/view/View;", "getIconSelColor", "getTextColor", "setSvgDrawable", "", "Landroid/widget/ImageView;", "resId", "color", "plugin-emojicapture_release"})
public final class a
{
  private static final int[] lln = { -1, -16777216, -314573, -12493, -4920114, -4724993, -144437 };
  private static final int[] llo = { -16777216, -1, -15616, -2724096, -16339626, -15954996, -298125 };

  public static final void a(ImageView paramImageView, int paramInt)
  {
    AppMethodBeat.i(2893);
    j.p(paramImageView, "receiver$0");
    paramImageView.setImageDrawable(ah.f(paramImageView.getContext(), 2131231476, paramInt));
    AppMethodBeat.o(2893);
  }

  public static final int[] bnQ()
  {
    return lln;
  }

  public static final int[] bnR()
  {
    return llo;
  }

  public static final int dg(View paramView)
  {
    AppMethodBeat.i(2891);
    j.p(paramView, "receiver$0");
    Context localContext = paramView.getContext();
    j.o(localContext, "context");
    int i = localContext.getResources().getColor(com.tencent.mm.emoji.e.a.y(paramView.getContext(), 2130772203));
    AppMethodBeat.o(2891);
    return i;
  }

  public static final int dh(View paramView)
  {
    AppMethodBeat.i(2892);
    j.p(paramView, "receiver$0");
    paramView = paramView.getContext();
    j.o(paramView, "context");
    int i = paramView.getResources().getColor(2131689481);
    AppMethodBeat.o(2892);
    return i;
  }

  public static final int uA(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(2889);
    Object localObject = lln;
    int j;
    if (localObject.length == 0)
    {
      j = 1;
      if (j == 0)
        break label47;
      localObject = null;
      label25: if (localObject == null)
        break label234;
      paramInt = ((Integer)localObject).intValue();
      AppMethodBeat.o(2889);
    }
    while (true)
    {
      return paramInt;
      j = 0;
      break;
      label47: j = localObject[0];
      int k = Color.red(paramInt) - Color.red(j);
      int m = Color.green(paramInt) - Color.green(j);
      int n = Color.blue(paramInt) - Color.blue(j);
      double d1 = Math.sqrt(k * k + m * m + n * n);
      k = e.J((int[])localObject);
      n = j;
      if (k > 0)
        while (true)
        {
          n = localObject[i];
          int i1 = Color.red(paramInt) - Color.red(n);
          int i2 = Color.green(paramInt) - Color.green(n);
          m = Color.blue(paramInt) - Color.blue(n);
          double d2 = Math.sqrt(i1 * i1 + i2 * i2 + m * m);
          double d3 = d1;
          if (Double.compare(d1, d2) > 0)
          {
            d3 = d2;
            j = n;
          }
          n = j;
          if (i == k)
            break;
          i++;
          d1 = d3;
        }
      localObject = Integer.valueOf(n);
      break label25;
      label234: paramInt = -1;
      AppMethodBeat.o(2889);
    }
  }

  public static final int uB(int paramInt)
  {
    AppMethodBeat.i(2890);
    paramInt = e.k(lln, paramInt);
    if (paramInt < 0)
    {
      paramInt = -16777216;
      AppMethodBeat.o(2890);
    }
    while (true)
    {
      return paramInt;
      paramInt = llo[paramInt];
      AppMethodBeat.o(2890);
    }
  }

  public static final boolean uC(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 5:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static final boolean uD(int paramInt)
  {
    AppMethodBeat.i(2894);
    boolean bool;
    if ((uC(paramInt)) && ((paramInt == 4) || (paramInt == 5)))
    {
      bool = true;
      AppMethodBeat.o(2894);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2894);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.a
 * JD-Core Version:    0.6.2
 */