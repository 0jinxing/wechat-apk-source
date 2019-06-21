package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.xt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class n extends h
{
  public n(g paramg, MMActivity paramMMActivity)
  {
    super(paramg, paramMMActivity);
  }

  private void a(Button paramButton, b paramb)
  {
    AppMethodBeat.i(88771);
    paramb = paramb.aZV().color;
    if (!bo.isNullOrNil(paramb))
    {
      int i = com.tencent.mm.plugin.card.d.l.Hn(paramb);
      paramButton.setText(this.jiE.getResources().getString(2131297817));
      paramButton.setTextColor(i);
      paramb = new GradientDrawable();
      paramb.setColor(this.jiE.getResources().getColor(2131689826));
      paramb.setStroke(2, i);
      paramb.setCornerRadius(8.0F);
      paramButton.setBackground(paramb);
    }
    AppMethodBeat.o(88771);
  }

  public final void a(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(88769);
    am.bbm().bao();
    paramViewGroup.findViewById(2131821964).setVisibility(0);
    paramViewGroup.findViewById(2131821963).setVisibility(8);
    tm localtm = paramb.aZW().vSp;
    if (localtm != null)
    {
      paramViewGroup.findViewById(2131821965).setVisibility(0);
      if (!bo.isNullOrNil(localtm.title))
      {
        Button localButton = (Button)paramViewGroup.findViewById(2131821968);
        localButton.setText(localtm.title);
        localButton.setVisibility(0);
        a(localButton, paramb);
        localButton.setOnClickListener(new n.2(this, localtm, paramb));
        if (!bo.isNullOrNil(localtm.kbW))
          ((TextView)paramViewGroup.findViewById(2131821966)).setText(localtm.kbW);
        paramViewGroup = (TextView)paramViewGroup.findViewById(2131821967);
        if (!bo.isNullOrNil(localtm.kbX))
        {
          paramViewGroup.setText(localtm.kbX);
          paramViewGroup.setVisibility(0);
          AppMethodBeat.o(88769);
        }
      }
    }
    while (true)
    {
      return;
      paramViewGroup.setVisibility(8);
      AppMethodBeat.o(88769);
    }
  }

  public final void b(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(88770);
    ab.i("MicroMsg.CardDynamicQrCodeController", "onScreenShot! ");
    View localView1 = paramViewGroup.findViewById(2131821964);
    if (localView1.getVisibility() == 0)
    {
      ab.e("MicroMsg.CardDynamicQrCodeController", "code_qr_disable_layout is visible! do not show hint!");
      AppMethodBeat.o(88770);
      return;
    }
    localView1.setVisibility(0);
    View localView2 = paramViewGroup.findViewById(2131821960);
    if (localView2.getVisibility() == 0)
      localView2.setVisibility(8);
    ImageView localImageView = (ImageView)paramViewGroup.findViewById(2131821963);
    localImageView.setVisibility(8);
    localView2 = paramViewGroup.findViewById(2131821965);
    localView2.setVisibility(0);
    ((TextView)paramViewGroup.findViewById(2131821966)).setText(this.jiE.getResources().getString(2131297816));
    Button localButton = (Button)paramViewGroup.findViewById(2131821968);
    localButton.setVisibility(0);
    a(localButton, paramb);
    com.tencent.mm.plugin.card.b.g localg = am.bbm();
    if (paramb == null)
      ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport do nothing return !cardInfo is null!");
    while (true)
    {
      localButton.setOnClickListener(new n.3(this, localView1, localView2, localImageView, localButton, paramViewGroup, paramb));
      AppMethodBeat.o(88770);
      break;
      localg.bao();
      k localk = am.bbk().Gy(paramb.aZZ());
      if (localk != null)
      {
        ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport currentCode cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
        if (am.bbk().dm(paramb.aZZ(), localk.field_code_id))
          localg.a(paramb.aZZ(), localk.field_code_id, c.krD);
        else
          ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport delete failue! do not report! cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
      }
      else
      {
        ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport  failue! currentCode is null!");
      }
    }
  }

  public final boolean bet()
  {
    return false;
  }

  public final boolean beu()
  {
    return true;
  }

  public final void c(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(88767);
    super.c(paramViewGroup, paramb);
    d(paramViewGroup, paramb);
    AppMethodBeat.o(88767);
  }

  final void d(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(88768);
    xt localxt = paramb.aZV().vUB;
    paramb = paramViewGroup.findViewById(2131821960);
    if ((localxt != null) && (localxt.wdv))
    {
      paramb.setVisibility(0);
      if (bo.isNullOrNil(localxt.wdw))
        break label101;
      ((TextView)paramViewGroup.findViewById(2131821961)).setText(localxt.wdw);
      ((ImageView)paramViewGroup.findViewById(2131821962)).setOnClickListener(new n.1(this, paramViewGroup));
      AppMethodBeat.o(88768);
    }
    while (true)
    {
      return;
      paramb.setVisibility(8);
      label101: AppMethodBeat.o(88768);
    }
  }

  public final boolean g(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(88765);
    if (!paramb.aZW().vSq)
    {
      ab.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : is_commom_card false!ban card show!");
      AppMethodBeat.o(88765);
    }
    while (true)
    {
      return bool;
      paramb = paramb.aZW().vSp;
      if ((paramb != null) && (!bo.isNullOrNil(paramb.title)))
      {
        ab.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : unavailable_qrcode_field is not null  !ban card show!");
        AppMethodBeat.o(88765);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(88765);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968901;
  }

  public final void l(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88766);
    paramViewGroup.findViewById(2131821964).setVisibility(8);
    paramViewGroup.findViewById(2131821963).setVisibility(0);
    AppMethodBeat.o(88766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.n
 * JD-Core Version:    0.6.2
 */