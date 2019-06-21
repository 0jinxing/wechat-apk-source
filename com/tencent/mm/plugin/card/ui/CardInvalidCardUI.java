package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.ui.base.h;

public class CardInvalidCardUI extends CardBaseUI
{
  public final void aZp()
  {
    AppMethodBeat.i(88540);
    setMMTitle(2131297885);
    addTextOptionMenu(0, getString(2131297812), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(88536);
        CardInvalidCardUI.a(CardInvalidCardUI.this);
        AppMethodBeat.o(88536);
        return true;
      }
    });
    if (this.kan.getCount() > 0)
    {
      enableOptionMenu(true);
      AppMethodBeat.o(88540);
    }
    while (true)
    {
      return;
      enableOptionMenu(false);
      AppMethodBeat.o(88540);
    }
  }

  public final n.a aZq()
  {
    return n.a.kdL;
  }

  public final int getLayoutId()
  {
    return 2130968944;
  }

  public final void initView()
  {
    AppMethodBeat.i(138536);
    super.initView();
    AppMethodBeat.o(138536);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88538);
    super.onCreate(paramBundle);
    super.initView();
    AppMethodBeat.o(88538);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(88541);
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof r)))
    {
      if (!this.kar)
        break label62;
      h.bQ(this, getResources().getString(2131297814));
    }
    while (true)
    {
      this.kar = false;
      AppMethodBeat.o(88541);
      return;
      label62: h.bQ(this, getResources().getString(2131297832));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardInvalidCardUI
 * JD-Core Version:    0.6.2
 */