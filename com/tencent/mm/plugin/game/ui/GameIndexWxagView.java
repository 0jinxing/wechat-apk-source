package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.game.d.dr;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.sdk.platformtools.ab;

public class GameIndexWxagView extends LinearLayout
  implements View.OnClickListener
{
  ViewGroup mContainer;
  LayoutInflater mInflater;
  int mXC;

  public GameIndexWxagView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111989);
    setOrientation(1);
    this.mInflater = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    this.mContainer = this;
    AppMethodBeat.o(111989);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111991);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof GameIndexWxagView.a)))
      AppMethodBeat.o(111991);
    while (true)
    {
      return;
      paramView = (GameIndexWxagView.a)paramView.getTag();
      if (paramView.njp == null)
      {
        AppMethodBeat.o(111991);
      }
      else
      {
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1079;
        ((e)g.K(e.class)).a(getContext(), paramView.njp.jBB, paramView.njp.fKh, paramView.njp.ndQ, 0, paramView.njp.ndP, localAppBrandStatObject);
        b.a(getContext(), 10, 1025, paramView.mYy, 30, paramView.njp.fKh, this.mXC, null);
        AppMethodBeat.o(111991);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111990);
    super.onFinishInflate();
    ab.i("MicroMsg.GameIndexWxagView", "initView finished");
    AppMethodBeat.o(111990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexWxagView
 * JD-Core Version:    0.6.2
 */