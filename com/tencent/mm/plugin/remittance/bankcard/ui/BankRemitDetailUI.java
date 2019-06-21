package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.l;
import com.tencent.mm.protocal.protobuf.bnw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(19)
public class BankRemitDetailUI extends BankRemitBaseUI
{
  private int gqq;
  private int mState;
  private Button nsJ;
  private LinearLayout nsy;
  private ImageView pNb;
  private ImageView pNc;
  private ImageView pNd;
  private TextView pNe;
  private TextView pNf;
  private TextView pNg;
  private TextView pNh;
  private TextView pNi;
  private TextView pNj;
  private View pNk;
  private View pNl;
  private ViewGroup pNm;
  private String pNn;

  protected final void bFY()
  {
    AppMethodBeat.i(44601);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690691)));
    View localView = getSupportActionBar().getCustomView();
    Object localObject;
    if (localView != null)
    {
      localObject = localView.findViewById(2131821128);
      if (localObject != null)
        ((View)localObject).setBackgroundColor(getResources().getColor(2131690157));
      localObject = localView.findViewById(16908308);
      if ((localObject != null) && ((localObject instanceof TextView)))
        ((TextView)localObject).setTextColor(getResources().getColor(2131689761));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(-2147483648);
      ((Window)localObject).setStatusBarColor(getResources().getColor(2131690691));
    }
    BankRemitBaseUI.Y(this);
    this.mController.contentView.setFitsSystemWindows(true);
    AppMethodBeat.o(44601);
  }

  public final boolean c(int paramInt1, int paramInt2, final String paramString, m paramm)
  {
    AppMethodBeat.i(44602);
    if ((paramm instanceof l))
    {
      paramString = (l)paramm;
      paramString.a(new BankRemitDetailUI.5(this, paramString)).b(new p.a()
      {
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
        {
          AppMethodBeat.i(44597);
          ab.e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", new Object[] { Integer.valueOf(paramString.pLD.kCl), paramString.pLD.kCm });
          if (!bo.isNullOrNil(paramString.pLD.kCm))
          {
            Toast.makeText(BankRemitDetailUI.this, paramString.pLD.kCm, 1).show();
            AppMethodBeat.o(44597);
          }
          while (true)
          {
            return;
            Toast.makeText(BankRemitDetailUI.this, 2131297446, 1).show();
            AppMethodBeat.o(44597);
          }
        }
      }).c(new BankRemitDetailUI.3(this));
    }
    AppMethodBeat.o(44602);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130968816;
  }

  public final void initView()
  {
    AppMethodBeat.i(44600);
    this.pNb = ((ImageView)findViewById(2131821647));
    this.pNc = ((ImageView)findViewById(2131821651));
    this.pNd = ((ImageView)findViewById(2131821655));
    this.pNe = ((TextView)findViewById(2131821648));
    this.pNf = ((TextView)findViewById(2131821652));
    this.pNg = ((TextView)findViewById(2131821656));
    this.pNh = ((TextView)findViewById(2131821649));
    this.pNi = ((TextView)findViewById(2131821653));
    this.pNj = ((TextView)findViewById(2131821657));
    this.pNk = findViewById(2131821644);
    this.pNl = findViewById(2131821645);
    this.nsy = ((LinearLayout)findViewById(2131821660));
    this.pNm = ((ViewGroup)findViewById(2131821642));
    if (this.gqq == 1)
    {
      findViewById(2131821662).setVisibility(8);
      AppMethodBeat.o(44600);
    }
    while (true)
    {
      return;
      this.nsJ = ((Button)findViewById(2131821663));
      this.nsJ.setOnClickListener(new BankRemitDetailUI.2(this));
      AppMethodBeat.o(44600);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44599);
    super.onCreate(paramBundle);
    nf(1579);
    this.pNn = getIntent().getStringExtra("key_transfer_bill_id");
    this.gqq = getIntent().getIntExtra("key_enter_scene", 0);
    ab.i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", new Object[] { this.pNn, Integer.valueOf(this.gqq) });
    initView();
    ab.i("MicroMsg.BankRemitDetailUI", "do query detail");
    a(new l(this.pNn), true, true);
    if (this.gqq == 0)
    {
      showHomeBtn(false);
      enableBackMenu(false);
      setMMTitle(2131297460);
    }
    while (true)
    {
      setBackBtn(new BankRemitDetailUI.1(this));
      AppMethodBeat.o(44599);
      return;
      showHomeBtn(true);
      enableBackMenu(true);
      setMMTitle(2131297459);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44603);
    super.onDestroy();
    ng(1579);
    AppMethodBeat.o(44603);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI
 * JD-Core Version:    0.6.2
 */