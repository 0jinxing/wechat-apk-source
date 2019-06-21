package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ah;

public class MallWalletSectionCellView extends LinearLayout
{
  static final int koS;
  public View iym;
  public View kiH;
  public TextView onA;
  public TextView onB;
  public CdnImageView onC;
  public TextView onD;
  public ImageView onE;
  public TextView onF;
  public TextView onG;
  public ViewGroup onH;
  public TextView onI;
  public CdnImageView onz;

  static
  {
    AppMethodBeat.i(43258);
    koS = a.fromDPToPix(ah.getContext(), 16);
    AppMethodBeat.o(43258);
  }

  public MallWalletSectionCellView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43251);
    init(paramContext);
    AppMethodBeat.o(43251);
  }

  public MallWalletSectionCellView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43252);
    init(paramContext);
    AppMethodBeat.o(43252);
  }

  public MallWalletSectionCellView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(43253);
    init(paramContext);
    AppMethodBeat.o(43253);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(43254);
    this.iym = LayoutInflater.from(paramContext).inflate(2130970064, this, true);
    this.onz = ((CdnImageView)this.iym.findViewById(2131825900));
    this.onA = ((TextView)this.iym.findViewById(2131825901));
    this.onB = ((TextView)this.iym.findViewById(2131825906));
    this.onC = ((CdnImageView)this.iym.findViewById(2131825908));
    this.onD = ((TextView)this.iym.findViewById(2131825907));
    this.onE = ((ImageView)this.iym.findViewById(2131825903));
    this.onF = ((TextView)this.iym.findViewById(2131825904));
    this.onG = ((TextView)this.iym.findViewById(2131825905));
    this.kiH = this.iym.findViewById(2131825909);
    this.onH = ((ViewGroup)this.iym.findViewById(2131825899));
    this.onI = ((TextView)this.iym.findViewById(2131825902));
    AppMethodBeat.o(43254);
  }

  final int aN(float paramFloat)
  {
    AppMethodBeat.i(43255);
    int i = a.fromDPToPix(getContext(), (int)paramFloat);
    AppMethodBeat.o(43255);
    return i;
  }

  final void bNs()
  {
    AppMethodBeat.i(43256);
    this.onF.setVisibility(8);
    this.onE.setVisibility(8);
    this.onG.setVisibility(8);
    AppMethodBeat.o(43256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView
 * JD-Core Version:    0.6.2
 */