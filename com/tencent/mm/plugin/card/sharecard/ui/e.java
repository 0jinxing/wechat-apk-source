package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public final class e
{
  private ImageView cDh;
  private MMActivity jiE;
  View kgZ;
  b kha;
  protected LinearLayout khb;
  protected LinearLayout khc;
  private TextView khd;

  public e(MMActivity paramMMActivity)
  {
    this.jiE = paramMMActivity;
  }

  private void bbI()
  {
    AppMethodBeat.i(88151);
    this.khb.setVisibility(8);
    this.khc.setVisibility(8);
    AppMethodBeat.o(88151);
  }

  private void bbL()
  {
    AppMethodBeat.i(88154);
    this.khb.setVisibility(8);
    this.khc.setVisibility(8);
    AppMethodBeat.o(88154);
  }

  public final void bbH()
  {
    AppMethodBeat.i(88150);
    if (this.kgZ == null)
    {
      this.kgZ = View.inflate(this.jiE, 2130968960, null);
      this.cDh = ((ImageView)this.kgZ.findViewById(2131822251));
      this.khd = ((TextView)this.kgZ.findViewById(2131822249));
      this.khb = ((LinearLayout)this.kgZ.findViewById(2131822250));
      this.khc = ((LinearLayout)this.kgZ.findViewById(2131822252));
      this.khb.setVisibility(8);
      this.khc.setVisibility(8);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
      localRotateAnimation.setDuration(1000L);
      localRotateAnimation.setRepeatCount(-1);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      this.cDh.startAnimation(localRotateAnimation);
    }
    cu();
    AppMethodBeat.o(88150);
  }

  public final void bbJ()
  {
    AppMethodBeat.i(88152);
    this.khb.setVisibility(0);
    this.khc.setVisibility(8);
    AppMethodBeat.o(88152);
  }

  public final void bbK()
  {
    AppMethodBeat.i(88153);
    this.khb.setVisibility(8);
    AppMethodBeat.o(88153);
  }

  public final void bbM()
  {
    AppMethodBeat.i(88155);
    bbL();
    this.khd.setVisibility(8);
    AppMethodBeat.o(88155);
  }

  public final void cu()
  {
    AppMethodBeat.i(88156);
    Integer localInteger1 = (Integer)am.bbb().getValue("key_share_card_show_type");
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null)
      localInteger2 = Integer.valueOf(0);
    if ((this.kha != null) && (b.bby()) && ((localInteger2.intValue() == 1) || (localInteger2.intValue() == 4)) && (b.bbv()))
    {
      this.khd.setVisibility(0);
      bbL();
      label75: AppMethodBeat.o(88156);
    }
    while (true)
    {
      return;
      this.khd.setVisibility(8);
      if (this.kha == null)
        break;
      ab.d("MicroMsg.ShareCardFooterController", "updateView isLocalEnd %s isOtherEnd %s ", new Object[] { Boolean.valueOf(b.bby()), Boolean.valueOf(b.bbz()) });
      if ((!b.bby()) || (!b.bbz()))
      {
        bbJ();
        AppMethodBeat.o(88156);
      }
      else
      {
        if ((!b.bby()) || (!b.bbz()))
          break label75;
        bbI();
        AppMethodBeat.o(88156);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.e
 * JD-Core Version:    0.6.2
 */