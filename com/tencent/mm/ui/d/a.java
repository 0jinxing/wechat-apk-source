package com.tencent.mm.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends com.tencent.mm.pluginsdk.ui.b.b
{
  String mUrl;
  private String nER;
  private boolean ysf;
  private b.b ysg;
  private String ysh;

  public a(Context paramContext, b.b paramb)
  {
    super(paramContext);
    AppMethodBeat.i(29991);
    this.nER = null;
    this.mUrl = null;
    this.ysf = false;
    this.ysg = null;
    this.ysh = "";
    this.ysg = paramb;
    refresh();
    AppMethodBeat.o(29991);
  }

  private void refresh()
  {
    AppMethodBeat.i(29992);
    aw.ZK().Ym();
    Object localObject;
    ImageView localImageView;
    if (com.tencent.mm.model.b.b.a(this.ysg))
    {
      ab.i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", new Object[] { this.ysg, this.nER, this.mUrl, Boolean.valueOf(this.ysf) });
      if (this.ysg == b.b.foi)
      {
        aw.ZK().Ym();
        this.nER = com.tencent.mm.model.b.b.aaQ();
        aw.ZK().Ym();
        this.mUrl = com.tencent.mm.model.b.b.aaR();
        aw.ZK().Ym();
        this.ysf = com.tencent.mm.model.b.b.aaS();
        localObject = (TextView)getView().findViewById(2131822693);
        localImageView = (ImageView)getView().findViewById(2131822694);
        if (bo.isNullOrNil(this.nER))
          break label359;
        ((TextView)localObject).setText(this.nER);
        label161: ((TextView)localObject).setSelected(true);
        if (bo.isNullOrNil(this.mUrl))
          break label368;
        getView().findViewById(2131822692).setBackgroundResource(2130840456);
        localImageView.setImageResource(2130839603);
        ((TextView)localObject).setTextColor(ah.getContext().getResources().getColor(2131690581));
        label211: getView().setOnClickListener(new a.1(this));
        if (getView().getVisibility() != 0)
        {
          localObject = new StringBuilder();
          g.RN();
          this.ysh = (com.tencent.mm.kernel.a.QF() + "_" + System.currentTimeMillis());
          Nx(0);
        }
        setVisibility(0);
        if (!this.ysf)
          break label406;
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new a.2(this));
        AppMethodBeat.o(29992);
      }
    }
    while (true)
    {
      return;
      aw.ZK().Ym();
      this.nER = com.tencent.mm.model.b.b.aaN();
      aw.ZK().Ym();
      this.mUrl = com.tencent.mm.model.b.b.aaO();
      aw.ZK().Ym();
      this.ysf = com.tencent.mm.model.b.b.aaP();
      break;
      label359: ((TextView)localObject).setText(2131297086);
      break label161;
      label368: getView().findViewById(2131822692).setBackgroundResource(2131690575);
      localImageView.setImageResource(2130839602);
      ((TextView)localObject).setTextColor(ah.getContext().getResources().getColor(2131690691));
      break label211;
      label406: localImageView.setVisibility(8);
      AppMethodBeat.o(29992);
      continue;
      ab.i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
      setVisibility(8);
      AppMethodBeat.o(29992);
    }
  }

  final void Nx(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(29995);
    h localh = h.pYm;
    String str = this.ysh;
    if (this.ysg == b.b.foh)
      i = 0;
    localh.e(14439, new Object[] { str, Integer.valueOf(paramInt), Integer.valueOf(i) });
    h.pYm.a(633L, paramInt, 1L, false);
    AppMethodBeat.o(29995);
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(29994);
    refresh();
    boolean bool = super.aMN();
    AppMethodBeat.o(29994);
    return bool;
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130969118;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(29993);
    super.setVisibility(paramInt);
    getView().findViewById(2131822692).setVisibility(paramInt);
    AppMethodBeat.o(29993);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d.a
 * JD-Core Version:    0.6.2
 */