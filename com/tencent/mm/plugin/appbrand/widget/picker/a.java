package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends d
{
  private static final int huq = 2131820573;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126685);
    super.setId(huq);
    setBackgroundResource(2131690155);
    setOnClickListener(new a.1(this));
    AppMethodBeat.o(126685);
  }

  public static a cV(View paramView)
  {
    AppMethodBeat.i(126684);
    paramView = (a)paramView.getRootView().findViewById(huq);
    AppMethodBeat.o(126684);
    return paramView;
  }

  public final void hide()
  {
    AppMethodBeat.i(126688);
    super.hide();
    AppMethodBeat.o(126688);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126686);
    int i;
    if (isShown())
      if ((getParent() != null) && ((getParent() instanceof ViewGroup)))
      {
        i = ((ViewGroup)getParent()).getMeasuredHeight();
        if (i <= 0)
          break label66;
        du(paramInt1, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        AppMethodBeat.o(126686);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label66: super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(126686);
    }
  }

  public final void setId(int paramInt)
  {
  }

  public final void show()
  {
    AppMethodBeat.i(126687);
    super.show();
    AppMethodBeat.o(126687);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.a
 * JD-Core Version:    0.6.2
 */