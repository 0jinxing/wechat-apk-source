package com.tencent.mm.plugin.wallet_core.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;

public class WalletAwardShakeAnimView extends RelativeLayout
{
  private long mfT;
  private d oOS;
  private View tNB;
  private TextView tNC;
  private boolean tND;
  private boolean tNE;
  private String tNF;
  private int tNG;
  private String tNH;
  private int tNI;
  private ValueAnimator tNJ;
  private WalletAwardShakeAnimView.a tNK;
  private Runnable tNL;

  public WalletAwardShakeAnimView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47893);
    this.tND = false;
    this.tNE = false;
    this.tNG = 0;
    this.tNI = 0;
    this.tNL = new WalletAwardShakeAnimView.1(this);
    init();
    AppMethodBeat.o(47893);
  }

  public WalletAwardShakeAnimView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47894);
    this.tND = false;
    this.tNE = false;
    this.tNG = 0;
    this.tNI = 0;
    this.tNL = new WalletAwardShakeAnimView.1(this);
    init();
    AppMethodBeat.o(47894);
  }

  private void cSx()
  {
    AppMethodBeat.i(47899);
    if (this.tNJ != null)
      this.tNJ.cancel();
    this.tNJ = ValueAnimator.ofFloat(new float[] { -30.0F, 30.0F });
    this.tNJ.setInterpolator(new LinearInterpolator());
    this.tNJ.setRepeatMode(2);
    this.tNJ.setRepeatCount(-1);
    this.tNJ.setDuration(300L);
    this.tNJ.addUpdateListener(new WalletAwardShakeAnimView.4(this));
    this.tNJ.start();
    AppMethodBeat.o(47899);
  }

  private void init()
  {
    AppMethodBeat.i(47895);
    v.hu(getContext()).inflate(2130971045, this);
    findViewById(2131824036).setBackground(getResources().getDrawable(2131232126));
    this.tNB = findViewById(2131828596);
    this.tNC = ((TextView)findViewById(2131828597));
    AppMethodBeat.o(47895);
  }

  public final void cSw()
  {
    AppMethodBeat.i(47898);
    ab.i("MicroMsg.WalletAwardShakeAnimView", "startShake");
    this.oOS = new d(getContext());
    this.oOS.a(new WalletAwardShakeAnimView.2(this));
    this.mfT = bo.yz();
    setOnClickListener(new WalletAwardShakeAnimView.3(this));
    al.af(this.tNL);
    al.n(this.tNL, 3000L);
    AppMethodBeat.o(47898);
  }

  public final void destroy()
  {
    AppMethodBeat.i(47900);
    if (this.oOS != null)
    {
      this.oOS.bgr();
      this.oOS = null;
    }
    this.tNE = false;
    this.tND = false;
    if (this.tNJ != null)
      this.tNJ.cancel();
    this.tNB.setRotation(0.0F);
    if (!bo.isNullOrNil(this.tNF))
    {
      this.tNC.setText(this.tNF);
      if (this.tNG == 0)
        break label130;
      this.tNC.setTextColor(this.tNG);
    }
    while (true)
    {
      al.af(this.tNL);
      AppMethodBeat.o(47900);
      return;
      this.tNC.setText(getResources().getText(2131305368));
      break;
      label130: this.tNC.setTextColor(Color.parseColor("#E24C4C"));
    }
  }

  public void setAfterHintWording(String paramString)
  {
    this.tNH = paramString;
  }

  public void setAfterHintWordingColor(int paramInt)
  {
    this.tNI = paramInt;
  }

  public void setShakeHintWording(String paramString)
  {
    AppMethodBeat.i(47896);
    this.tNF = paramString;
    this.tNC.setText(paramString);
    AppMethodBeat.o(47896);
  }

  public void setShakeHintWordingColor(int paramInt)
  {
    AppMethodBeat.i(47897);
    this.tNG = paramInt;
    this.tNC.setTextColor(paramInt);
    AppMethodBeat.o(47897);
  }

  public void setShakeOrClickCallback(WalletAwardShakeAnimView.a parama)
  {
    this.tNK = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView
 * JD-Core Version:    0.6.2
 */