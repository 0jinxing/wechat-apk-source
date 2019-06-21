package com.tencent.mm.plugin.nearlife.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;

final class BaseLifeUI$5
  implements o.b
{
  BaseLifeUI$5(BaseLifeUI paramBaseLifeUI)
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(22943);
    ab.d("MicroMsg.BaseLifeUI", "search helper onQuitSearch");
    this.oRY.gxV = false;
    this.oRY.nPi.setAdapter(BaseLifeUI.f(this.oRY));
    BaseLifeUI.f(this.oRY).notifyDataSetChanged();
    BaseLifeUI.g(this.oRY).Af(BaseLifeUI.f(this.oRY).oRv);
    if ((!BaseLifeUI.f(this.oRY).bVl()) && (BaseLifeUI.h(this.oRY) != null))
      BaseLifeUI.h(this.oRY).setVisibility(0);
    this.oRY.nPi.setOnTouchListener(null);
    BaseLifeUI.e(this.oRY);
    BaseLifeUI.a(this.oRY, BaseLifeUI.f(this.oRY));
    AppMethodBeat.o(22943);
  }

  public final void app()
  {
    AppMethodBeat.i(22944);
    ab.d("MicroMsg.BaseLifeUI", "search helper onEnterSearch");
    this.oRY.oRQ = true;
    BaseLifeUI.i(this.oRY).setHint(this.oRY.getString(2131301611));
    this.oRY.gxV = true;
    BaseLifeUI.b(this.oRY).bVj();
    this.oRY.nPi.setAdapter(BaseLifeUI.b(this.oRY));
    BaseLifeUI.b(this.oRY).notifyDataSetChanged();
    this.oRY.nPi.dzO();
    BaseLifeUI.g(this.oRY).Af(BaseLifeUI.b(this.oRY).oRv);
    if (BaseLifeUI.h(this.oRY) != null)
      BaseLifeUI.h(this.oRY).setVisibility(8);
    this.oRY.nPi.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(22940);
        BaseLifeUI.5.this.oRY.aqX();
        AppMethodBeat.o(22940);
        return false;
      }
    });
    BaseLifeUI.a(this.oRY, BaseLifeUI.b(this.oRY));
    AppMethodBeat.o(22944);
  }

  public final void apq()
  {
    AppMethodBeat.i(22941);
    ab.d("MicroMsg.BaseLifeUI", "click clear");
    if (BaseLifeUI.c(this.oRY) != null)
    {
      aw.Rg().c(BaseLifeUI.c(this.oRY));
      BaseLifeUI.d(this.oRY);
    }
    BaseLifeUI.b(this.oRY).bVj();
    BaseLifeUI.e(this.oRY);
    AppMethodBeat.o(22941);
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(22945);
    ab.d("MicroMsg.BaseLifeUI", "search key click");
    BaseLifeUI.b(this.oRY, paramString);
    AppMethodBeat.o(22945);
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(22942);
    ab.d("MicroMsg.BaseLifeUI", "onSearchBarChange  %s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      apq();
      AppMethodBeat.o(22942);
    }
    while (true)
    {
      return;
      BaseLifeUI.a(this.oRY, paramString);
      AppMethodBeat.o(22942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.5
 * JD-Core Version:    0.6.2
 */