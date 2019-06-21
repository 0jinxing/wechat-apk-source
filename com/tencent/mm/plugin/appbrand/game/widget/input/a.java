package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import com.tencent.mm.plugin.appbrand.widget.input.u;
import com.tencent.mm.plugin.appbrand.widget.input.w;

public final class a extends w
{
  private static final int huq = 2131820555;
  public a.a hur;
  private WAGamePanelInputEditText hus;
  private View.OnClickListener hut;

  private a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(130346);
    qE(huq);
    AppMethodBeat.o(130346);
  }

  public static a ck(View paramView)
  {
    AppMethodBeat.i(130347);
    paramView = (a)paramView.getRootView().findViewById(huq);
    AppMethodBeat.o(130347);
    return paramView;
  }

  public static a cl(View paramView)
  {
    AppMethodBeat.i(130348);
    n localn = n.cG(paramView);
    if ((localn.getOnLayoutListener() == null) || (!(localn.getOnLayoutListener() instanceof u)))
      localn.setOnLayoutListener(new u());
    a locala1 = ck(paramView);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a(paramView.getContext());
      localn.cH(locala2);
    }
    AppMethodBeat.o(130348);
    return locala2;
  }

  public final void aBJ()
  {
    AppMethodBeat.i(130349);
    this.hur.setIsHide(false);
    AppMethodBeat.o(130349);
  }

  public final void aBK()
  {
    int i = 0;
    AppMethodBeat.i(130350);
    View localView;
    if ((this.hus.getInputType() & 0x20000) > 0)
    {
      j = 1;
      localView = this.hur.getConfirmButton();
      if (j == 0)
        break label52;
    }
    label52: for (int j = i; ; j = 8)
    {
      localView.setVisibility(j);
      AppMethodBeat.o(130350);
      return;
      j = 0;
      break;
    }
  }

  public final WAGamePanelInputEditText getAttachedEditText()
  {
    AppMethodBeat.i(130351);
    WAGamePanelInputEditText localWAGamePanelInputEditText = (WAGamePanelInputEditText)super.getAttachedEditText();
    AppMethodBeat.o(130351);
    return localWAGamePanelInputEditText;
  }

  public final void setOnConfirmClickListener(View.OnClickListener paramOnClickListener)
  {
    this.hut = paramOnClickListener;
  }

  public final void show()
  {
    AppMethodBeat.i(130352);
    this.jfW = this.hus;
    this.hus.requestFocus();
    super.show();
    AppMethodBeat.o(130352);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.a
 * JD-Core Version:    0.6.2
 */