package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.m.3;
import com.tencent.mm.plugin.card.model.ag;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class CardGiftAcceptUI extends MMActivity
  implements View.OnClickListener, f
{
  private final String TAG = "MicroMsg.CardGiftAcceptUI";
  private String cFZ;
  private String cKE;
  private int fhF;
  private String fhG;
  private RelativeLayout kjT;
  private RelativeLayout kjU;
  private ImageView kjV;
  private TextView kjW;
  private TextView kjX;
  private ImageView kjY;
  private Button kjZ;
  private LinearLayout kka;
  private TextView kkb;
  private LinearLayout kkc;
  private TextView kkd;
  private ImageView kke;
  private ImageView kkf;
  private RelativeLayout kkg;
  private ag kkh;
  private com.tencent.mm.plugin.card.model.q kki;
  private com.tencent.mm.ui.base.p tipDialog = null;

  private static Drawable b(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    AppMethodBeat.i(88386);
    paramDrawable = android.support.v4.a.a.a.f(paramDrawable);
    android.support.v4.a.a.a.a(paramDrawable, paramColorStateList);
    AppMethodBeat.o(88386);
    return paramDrawable;
  }

  private void bcU()
  {
    AppMethodBeat.i(88390);
    ag localag = new ag(this.fhF, this.fhG, this.cFZ);
    g.RO().eJo.a(localag, 0);
    if (this.tipDialog != null)
      this.tipDialog.show();
    AppMethodBeat.o(88390);
  }

  private void bcV()
  {
    AppMethodBeat.i(88391);
    com.tencent.mm.plugin.card.model.q localq = new com.tencent.mm.plugin.card.model.q(this.fhF, this.fhG, this.cFZ, Boolean.FALSE);
    g.RO().eJo.a(localq, 0);
    if (this.tipDialog != null)
      this.tipDialog.show();
    AppMethodBeat.o(88391);
  }

  private void dF(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88387);
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(paramInt2);
    localGradientDrawable.setStroke(2, paramInt1);
    localGradientDrawable.setCornerRadius(6.0F);
    this.kjZ.setBackground(localGradientDrawable);
    AppMethodBeat.o(88387);
  }

  public final int getLayoutId()
  {
    return 2130968919;
  }

  public final void initView()
  {
    AppMethodBeat.i(88385);
    this.kjT = ((RelativeLayout)findViewById(2131822058));
    this.kjU = ((RelativeLayout)findViewById(2131822052));
    this.kjV = ((ImageView)findViewById(2131822053));
    this.kjW = ((TextView)findViewById(2131822054));
    this.kjX = ((TextView)findViewById(2131822055));
    this.kjY = ((ImageView)findViewById(2131822059));
    this.kjZ = ((Button)findViewById(2131822056));
    this.kkb = ((TextView)findViewById(2131822064));
    this.kkd = ((TextView)findViewById(2131822061));
    this.kkg = ((RelativeLayout)findViewById(2131822057));
    this.kke = ((ImageView)findViewById(2131822065));
    this.kkf = ((ImageView)findViewById(2131822062));
    this.kka = ((LinearLayout)findViewById(2131822063));
    this.kkc = ((LinearLayout)findViewById(2131822060));
    this.kkg.setOnClickListener(this);
    this.kjT.setOnClickListener(this);
    this.kjU.setOnClickListener(this);
    this.kka.setOnClickListener(this);
    this.kkc.setOnClickListener(this);
    this.mController.contentView.setVisibility(8);
    this.tipDialog = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131300968), true, new CardGiftAcceptUI.1(this));
    bcU();
    AppMethodBeat.o(88385);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(88388);
    if ((paramView.getId() == 2131822056) || (paramView.getId() == 2131822063))
    {
      if (this.kjZ.getVisibility() == 0)
      {
        int i = bo.bS(this.kkh.ker, getResources().getColor(2131689835));
        dF(i, i);
        this.kjZ.setTextColor(getResources().getColor(2131690691));
      }
      bcV();
      if (bo.isNullOrNil(this.cKE))
        break label241;
      com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(2), this.fhG, com.tencent.mm.a.p.getString(this.fhF), this.cKE });
      AppMethodBeat.o(88388);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131822057)
      {
        finish();
        AppMethodBeat.o(88388);
      }
      else if (paramView.getId() == 2131822058)
      {
        finish();
        AppMethodBeat.o(88388);
      }
      else
      {
        if (paramView.getId() == 2131822060)
        {
          paramView = new com.tencent.mm.plugin.card.model.q(this.fhF, this.fhG, this.cFZ, Boolean.TRUE);
          g.RO().eJo.a(paramView, 0);
          if (this.tipDialog != null)
            this.tipDialog.show();
        }
        label241: AppMethodBeat.o(88388);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88383);
    super.onCreate(paramBundle);
    this.fhG = getIntent().getStringExtra("key_order_id");
    this.fhF = getIntent().getIntExtra("key_biz_uin", -1);
    this.cKE = getIntent().getStringExtra("key_from_user_name");
    this.cFZ = getIntent().getStringExtra("key_chatroom_name");
    ab.i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", new Object[] { this.fhG, Integer.valueOf(this.fhF), this.cKE });
    if (this.fhF == -1)
    {
      ab.e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
      d.a(this, "", true);
      AppMethodBeat.o(88383);
    }
    while (true)
    {
      return;
      if (this.fhG == null)
      {
        ab.e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
        d.a(this, "", true);
        AppMethodBeat.o(88383);
      }
      else
      {
        if (!bo.isNullOrNil(this.cKE))
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(1), this.fhG, com.tencent.mm.a.p.getString(this.fhF), this.cKE });
        initView();
        g.RO().eJo.a(1171, this);
        g.RO().eJo.a(1136, this);
        AppMethodBeat.o(88383);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88384);
    super.onDestroy();
    g.RO().eJo.b(1171, this);
    g.RO().eJo.b(1136, this);
    AppMethodBeat.o(88384);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88392);
    if (paramInt == 4)
    {
      ab.e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.dismiss();
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88392);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88389);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof ag))
      {
        this.kkh = ((ag)paramm);
        ab.i("MicroMsg.CardGiftAcceptUI", "ignore:%b", new Object[] { Boolean.valueOf(this.kkh.kep) });
        if (!this.kkh.kep)
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.dismiss();
          if (this.kkh == null)
          {
            ab.e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
            paramm = this.kjU;
            paramString = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
            paramString.setDuration(300L);
            paramString.setInterpolator(new OvershootInterpolator());
            paramString.setFillAfter(true);
            ScaleAnimation localScaleAnimation = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation.setDuration(100L);
            localScaleAnimation.setFillAfter(true);
            paramString.setAnimationListener(new m.3(paramm, localScaleAnimation));
            if (paramm != null)
              paramm.startAnimation(paramString);
            this.mController.contentView.setVisibility(0);
            AppMethodBeat.o(88389);
          }
        }
      }
    while (true)
    {
      return;
      this.kjX.setText(this.kkh.content);
      this.kjW.setText(j.b(this, this.kkh.cKE, this.kjW.getTextSize()));
      if (this.kkh.status == 0)
        if (!bo.isNullOrNil(this.kkh.keo))
        {
          this.kjZ.setVisibility(0);
          this.kjZ.setText(this.kkh.keo);
          this.kjZ.setOnClickListener(this);
        }
      while (true)
      {
        if (!bo.isNullOrNil(this.kkh.kes))
        {
          this.kjZ.setVisibility(8);
          this.kkc.setVisibility(8);
          this.kka.setVisibility(0);
          this.kkb.setText(this.kkh.kes);
        }
        if (!bo.isNullOrNil(this.kkh.ket))
        {
          this.kka.setVisibility(8);
          this.kkc.setVisibility(0);
          this.kkd.setText(this.kkh.ket);
        }
        if (!bo.isNullOrNil(this.kkh.ken))
        {
          paramInt1 = com.tencent.mm.bz.a.fromDPToPix(this, 15);
          paramString = new c.a();
          paramString.ePK = e.eSn;
          o.ahq();
          paramString.ePY = null;
          paramString.ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkh.ken);
          paramString.ePH = true;
          paramString.eQf = true;
          paramString.eQg = paramInt1;
          paramString.ePF = true;
          paramString.ePT = 2130839644;
          paramString = paramString.ahG();
          o.ahp().a(this.kkh.ken, this.kjV, paramString);
        }
        if (!bo.isNullOrNil(this.kkh.keq))
          o.ahp().a(this.kkh.keq, this.kjY);
        if ((!bo.isNullOrNil(this.kkh.ker)) && (this.kjZ.getVisibility() == 0))
        {
          paramInt1 = bo.bS(this.kkh.ker, getResources().getColor(2131689835));
          dF(paramInt1, getResources().getColor(2131689834));
          this.kjZ.setTextColor(paramInt1);
        }
        if ((!bo.isNullOrNil(this.kkh.ker)) && (this.kkb.getVisibility() == 0))
        {
          paramInt1 = bo.bS(this.kkh.ker, getResources().getColor(2131689835));
          this.kkb.setTextColor(paramInt1);
          paramInt2 = getResources().getColor(2131689835);
          paramInt1 = paramInt2;
          if (!bo.isNullOrNil(this.kkh.ker))
            paramInt1 = bo.bS(this.kkh.ker, paramInt2);
          this.kke.setImageDrawable(b(this.kke.getDrawable(), ColorStateList.valueOf(paramInt1)));
        }
        if ((!bo.isNullOrNil(this.kkh.ker)) && (this.kkd.getVisibility() == 0))
        {
          paramInt1 = bo.bS(this.kkh.ker, getResources().getColor(2131689835));
          this.kkd.setTextColor(paramInt1);
          paramInt2 = getResources().getColor(2131689835);
          paramInt1 = paramInt2;
          if (!bo.isNullOrNil(this.kkh.ker))
            paramInt1 = bo.bS(this.kkh.ker, paramInt2);
          this.kkf.setImageDrawable(b(this.kkf.getDrawable(), ColorStateList.valueOf(paramInt1)));
          paramString = (ViewGroup.MarginLayoutParams)this.kjZ.getLayoutParams();
          paramString.topMargin -= com.tencent.mm.bz.a.fromDPToPix(this, 20);
          this.kjZ.setLayoutParams(paramString);
        }
        if ((this.kjZ.getVisibility() != 0) || (this.kkc.getVisibility() != 8))
          break;
        paramString = (ViewGroup.MarginLayoutParams)this.kjZ.getLayoutParams();
        paramString.bottomMargin += com.tencent.mm.bz.a.fromDPToPix(this, 28);
        this.kjZ.setLayoutParams(paramString);
        break;
        this.kjZ.setVisibility(0);
        this.kjZ.setText(getResources().getString(2131297851));
        this.kjZ.setOnClickListener(this);
        continue;
        if ((this.kkh.status != 1) && (this.kkh.status == 2))
        {
          if (!bo.isNullOrNil(this.kkh.keo))
          {
            this.kjZ.setVisibility(0);
            this.kjZ.setBackgroundDrawable(null);
            this.kjZ.setText(this.kkh.keo);
            this.kjZ.setTextColor(getResources().getColor(2131689761));
            this.kjZ.setTextSize(1, 17.0F);
            this.kjZ.setOnClickListener(null);
          }
          else
          {
            this.kjZ.setVisibility(8);
            this.kjZ.setOnClickListener(null);
          }
        }
        else
        {
          this.kjZ.setVisibility(8);
          this.kjZ.setOnClickListener(null);
        }
      }
      ab.i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
      bcV();
      AppMethodBeat.o(88389);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.card.model.q))
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
          this.tipDialog.dismiss();
        ab.i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
        this.kki = ((com.tencent.mm.plugin.card.model.q)paramm);
        paramString = new Intent(this, CardGiftReceiveUI.class);
        paramString.putExtra("key_order_id", this.fhG);
        paramString.putExtra("key_biz_uin", this.fhF);
        paramString.putExtra("key_gift_into", this.kki.kdV);
        if (!bo.isNullOrNil(this.cFZ));
        for (boolean bool = true; ; bool = false)
        {
          paramString.putExtra("key_from_group_chat_room", bool);
          startActivity(paramString);
          finish();
          AppMethodBeat.o(88389);
          break;
        }
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
          this.tipDialog.dismiss();
        if ((paramm instanceof ag))
        {
          ab.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          d.a(this, paramString, true);
          AppMethodBeat.o(88389);
        }
        else if ((paramm instanceof com.tencent.mm.plugin.card.model.q))
        {
          ab.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          d.a(this, paramString, true);
        }
      }
      else
      {
        AppMethodBeat.o(88389);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftAcceptUI
 * JD-Core Version:    0.6.2
 */