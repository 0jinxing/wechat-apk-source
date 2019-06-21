package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.ati;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;

public class HoneyPayCardLayout extends LinearLayout
{
  private ImageView kEn;
  private String nra;
  private TextView nrs;
  private TextView nrt;
  private WalletTextView nru;
  private TextView nrv;
  private CdnImageView nrw;

  public HoneyPayCardLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(41788);
    init();
    AppMethodBeat.o(41788);
  }

  public HoneyPayCardLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(41789);
    init();
    AppMethodBeat.o(41789);
  }

  public HoneyPayCardLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(41790);
    init();
    AppMethodBeat.o(41790);
  }

  private void init()
  {
    AppMethodBeat.i(41791);
    View localView = inflate(getContext(), 2130969822, this);
    this.kEn = ((ImageView)localView.findViewById(2131824868));
    this.nru = ((WalletTextView)localView.findViewById(2131824870));
    this.nrs = ((TextView)localView.findViewById(2131824869));
    this.nrt = ((TextView)localView.findViewById(2131824871));
    this.nrv = ((TextView)localView.findViewById(2131824867));
    this.nrw = ((CdnImageView)localView.findViewById(2131824866));
    this.nru.setPrefix(ae.dOd());
    AppMethodBeat.o(41791);
  }

  public void setCardRecord(ati paramati)
  {
    long l1 = 0L;
    AppMethodBeat.i(41792);
    this.nra = paramati.wpp;
    this.nrv.setText(paramati.kdf);
    if (!bo.isNullOrNil(paramati.cIY))
      this.nrw.eb(paramati.cIY, c.wS(paramati.iAd));
    a.b.a(this.kEn, paramati.vYh, 0.06F, false);
    e.d(this.nrs, paramati.vYh);
    this.nru.setText(c.iR(paramati.wch));
    if (paramati.wxp == 0)
    {
      this.nrt.setTextColor(Color.parseColor("#FA9D3B"));
      this.nrt.setText(2131300600);
      AppMethodBeat.o(41792);
      return;
    }
    long l2;
    if (paramati.wxp == 1)
      if (paramati.wxr == 0L)
      {
        l2 = paramati.wxq;
        if (l2 >= 0L)
          break label287;
        ab.w("MicroMsg.HoneyPayCardLayout", "unused quota wrong: %s", new Object[] { Long.valueOf(l2) });
        l2 = l1;
      }
    label287: 
    while (true)
    {
      this.nrt.setText(getContext().getString(2131300599, new Object[] { ae.dOd() + c.iR(l2) }));
      AppMethodBeat.o(41792);
      break;
      ab.i("MicroMsg.HoneyPayCardLayout", "show check detail");
      this.nrt.setText("");
      AppMethodBeat.o(41792);
      break;
      ab.w("MicroMsg.HoneyPayCardLayout", "unknown rcvd: %s", new Object[] { Integer.valueOf(paramati.wxp) });
      AppMethodBeat.o(41792);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout
 * JD-Core Version:    0.6.2
 */