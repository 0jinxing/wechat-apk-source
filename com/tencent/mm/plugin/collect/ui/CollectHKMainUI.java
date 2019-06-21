package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.d.i;

public class CollectHKMainUI extends CollectMainUI
{
  private boolean kGg = false;

  protected final void bho()
  {
    AppMethodBeat.i(41248);
    g.RQ();
    this.kGD = ((String)g.RP().Ry().get(ac.a.xRU, ""));
    com.tencent.mm.plugin.collect.model.m localm = new com.tencent.mm.plugin.collect.model.m(r.YG());
    if (!bo.isNullOrNil(this.kGD))
    {
      dOM().a(localm, false, 1);
      AppMethodBeat.o(41248);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CollectHKMainUI", "force load payurl");
      this.kGg = true;
      dOM().a(localm, true, 1);
      AppMethodBeat.o(41248);
    }
  }

  protected final String bhp()
  {
    return this.kGE;
  }

  protected final String bhq()
  {
    AppMethodBeat.i(41249);
    if (bo.isNullOrNil(this.kGF))
      this.kGF = ae.dOd();
    String str = this.kGF;
    AppMethodBeat.o(41249);
    return str;
  }

  protected final void bhr()
  {
    AppMethodBeat.i(41251);
    ImageView localImageView1 = (ImageView)this.kEu.findViewById(2131822880);
    ImageView localImageView2 = (ImageView)this.kEu.findViewById(2131822888);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localImageView2.getLayoutParams();
    localLayoutParams.topMargin = 0;
    localLayoutParams.bottomMargin = 0;
    localLayoutParams.addRule(13);
    localImageView2.setLayoutParams(localLayoutParams);
    if (aa.dor().equals("zh_HK"))
    {
      localImageView1.setImageResource(2131231133);
      localImageView2.setImageResource(2131231129);
      AppMethodBeat.o(41251);
    }
    while (true)
    {
      return;
      localImageView1.setImageResource(2131231132);
      localImageView2.setImageResource(2131231128);
      AppMethodBeat.o(41251);
    }
  }

  protected final void bhs()
  {
    AppMethodBeat.i(41252);
    super.bhs();
    if (this.kGL)
    {
      findViewById(2131822857).setVisibility(8);
      AppMethodBeat.o(41252);
    }
    while (true)
    {
      return;
      findViewById(2131822857).setVisibility(0);
      AppMethodBeat.o(41252);
    }
  }

  public final boolean f(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41250);
    label152: boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.collect.model.m))
    {
      paramString = (com.tencent.mm.plugin.collect.model.m)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.kCl != 0)
          break label203;
        this.kGD = paramString.kCn;
        this.kGE = paramString.kCz;
        this.kGF = paramString.kCw;
        refreshView();
        if (!bo.isNullOrNil(paramString.kCt))
        {
          this.kGY.setText(paramString.kCt);
          this.kHb.setOnClickListener(new CollectHKMainUI.2(this, paramString));
          this.kHb.setVisibility(0);
          if (bo.isNullOrNil(paramString.kCx))
            break label175;
          this.kGA.setText(paramString.kCx);
          this.kGA.setOnClickListener(new CollectHKMainUI.3(this, paramString));
          this.kGA.setVisibility(0);
          AppMethodBeat.o(41250);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      this.kHb.setVisibility(8);
      break;
      label175: this.kGA.setVisibility(8);
      break label152;
      ab.e("MicroMsg.CollectHKMainUI", "net error: %s", new Object[] { paramm });
      label203: if (!this.kGg)
      {
        AppMethodBeat.o(41250);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(41250);
        bool = false;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41246);
    super.onCreate(paramBundle);
    this.kHb.setVisibility(8);
    findViewById(2131822857).setVisibility(0);
    findViewById(2131822855).setVisibility(8);
    dOM().nf(1335);
    addIconOptionMenu(0, 2130840734, new CollectHKMainUI.1(this));
    AppMethodBeat.o(41246);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41247);
    super.onDestroy();
    dOM().ng(1335);
    AppMethodBeat.o(41247);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectHKMainUI
 * JD-Core Version:    0.6.2
 */