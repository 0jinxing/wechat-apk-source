package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.luckymoney.f2f.a.c;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import java.io.IOException;

@a(3)
public class LuckyMoneyF2FReceiveUI extends LuckyMoneyBaseUI
{
  private DisplayMetrics ghw;
  private String lvz;
  private String nSX;
  private ImageView nUG;
  private TextView nUH;
  private String nUe;
  private int nUf;
  private String nUk;
  private View nVH;
  private TextView nVI;
  private ImageView nVJ;
  private ValueAnimator nVK;
  private ValueAnimator nVL;
  private Intent nVM;
  private boolean nVN = false;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42222);
    ab.i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!(paramm instanceof c))
      AppMethodBeat.o(42222);
    while (true)
    {
      return true;
      c localc = (c)paramm;
      paramInt2 = localc.cRU;
      paramInt1 = localc.nUd;
      this.nUf = localc.nUf;
      int i = localc.nUh;
      Object localObject1 = localc.nUi;
      Object localObject2 = localc.nUj;
      ab.i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", new Object[] { Integer.valueOf(localc.cRU), Integer.valueOf(localc.nUd), Integer.valueOf(localc.cvG) });
      if (paramInt1 == 2)
      {
        if (paramInt2 == 5)
          com.tencent.mm.ui.base.h.a(this, getString(2131301101), "", new LuckyMoneyF2FReceiveUI.5(this));
        while (true)
        {
          AppMethodBeat.o(42222);
          break;
          this.nSX = localc.nSX;
          this.nUe = localc.nUe;
          this.nUk = localc.nUk;
          this.nVM = new Intent();
          if ((!bo.isNullOrNil(this.nUe)) && (!t.mY(this.nUe)))
          {
            paramString = new com.tencent.mm.ah.h();
            paramString.username = this.nUe;
            o.act().b(paramString);
          }
          x.b(this.nUG, null, this.nUe);
          paramString = new com.tencent.mm.plugin.luckymoney.model.k();
          paramString.cSh = this.nUf;
          paramString.nSX = this.nSX;
          paramString.cRU = paramInt2;
          paramString.cRV = paramInt1;
          paramString.nUj = ((String)localObject2);
          paramString.nUh = i;
          paramString.nXl = this.nUe;
          paramString.nUi = ((String)localObject1);
          paramString.nWQ = x.mI(this.nUe);
          paramString.nUk = this.nUk;
          paramString.cRT = 2;
          ab.i("LuckyMoneyF2FReceiveUI", "is most lucky %d", new Object[] { Integer.valueOf(localc.nUl) });
          if (localc.nUl > 0)
            paramString.nWP = getString(2131301130);
          paramString.nWR = x.Qj(this.nUe);
          try
          {
            this.nVM.putExtra("key_detail_info", paramString.toByteArray());
            paramString = localc.nUg;
            if (paramString != null)
            {
              localObject2 = new com/tencent/mm/plugin/wallet_core/id_verify/util/RealnameGuideHelper;
              ((RealnameGuideHelper)localObject2).<init>();
              ((RealnameGuideHelper)localObject2).a(String.valueOf(paramString.vAF), paramString.nZa, paramString.nZb, paramString.nZc, paramString.nZd, paramm.getType());
              this.nVM.putExtra("key_realname_guide_helper", (Parcelable)localObject2);
            }
            if (!bo.Q(new String[] { this.nSX, this.nUe }))
            {
              x.a(this, this.nUH, x.mI(this.nUe));
              x.a(this, this.nVI, this.nUk);
              this.nVK.start();
              this.mController.contentView.setVisibility(0);
            }
          }
          catch (IOException paramString)
          {
            while (true)
              ab.e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + paramString.getMessage());
          }
        }
      }
      if (localc.nUg != null)
      {
        ab.i("LuckyMoneyF2FReceiveUI", "need real name verify");
        localObject1 = localc.nUg;
        localObject2 = new RealnameGuideHelper();
        ((RealnameGuideHelper)localObject2).a(String.valueOf(((bpt)localObject1).vAF), ((bpt)localObject1).nZa, ((bpt)localObject1).nZb, ((bpt)localObject1).nZc, ((bpt)localObject1).nZd, paramm.getType());
        paramm = new Bundle();
        paramm.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
        paramm.putString("realname_verify_process_jump_plugin", "luckymoney");
        if (((RealnameGuideHelper)localObject2).a(this, paramm, new LuckyMoneyF2FReceiveUI.6(this), new LuckyMoneyF2FReceiveUI.7(this), false))
        {
          this.nVN = true;
          AppMethodBeat.o(42222);
        }
      }
      else
      {
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = getString(2131301107);
        com.tencent.mm.ui.base.h.a(this, paramm, "", new LuckyMoneyF2FReceiveUI.8(this));
        AppMethodBeat.o(42222);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969981;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42219);
    super.onCreate(paramBundle);
    this.nVH = findViewById(2131825520);
    this.nUG = ((ImageView)findViewById(2131825516));
    this.nUH = ((TextView)findViewById(2131825517));
    this.nVI = ((TextView)findViewById(2131825522));
    this.nVJ = ((ImageView)findViewById(2131825524));
    this.nVJ.setOnClickListener(new LuckyMoneyF2FReceiveUI.1(this));
    this.mController.contentView.setVisibility(8);
    this.lvz = getIntent().getStringExtra("key_share_url");
    com.tencent.mm.plugin.wallet_core.model.k.Hp(6);
    b(new c(this.lvz), true);
    this.ghw = getResources().getDisplayMetrics();
    this.nVK = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F }).setDuration(300L);
    this.nVL = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(300L);
    this.nVL.setStartDelay(1000L);
    this.nVK.addUpdateListener(new LuckyMoneyF2FReceiveUI.2(this));
    this.nVK.addListener(new LuckyMoneyF2FReceiveUI.3(this));
    this.nVL.addListener(new LuckyMoneyF2FReceiveUI.4(this));
    AppMethodBeat.o(42219);
  }

  public void onResume()
  {
    AppMethodBeat.i(42220);
    super.onResume();
    nf(1997);
    if (this.nVN)
      finish();
    AppMethodBeat.o(42220);
  }

  public void onStop()
  {
    AppMethodBeat.i(42221);
    super.onStop();
    ng(1997);
    AppMethodBeat.o(42221);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI
 * JD-Core Version:    0.6.2
 */