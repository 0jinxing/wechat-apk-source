package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.b.m.a;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public class CardShopUI extends MMActivity
  implements m.a
{
  private ProgressDialog fsh;
  private View.OnClickListener gKK;
  BroadcastReceiver jIA;
  private String kaE;
  private com.tencent.mm.plugin.card.base.b kaS;
  private ArrayList<od> kaY;
  private boolean khx;
  private LinearLayout knA;
  private View knB;
  private TextView knC;
  private String kny;
  private CardShopUI.a knz;
  private ListView mListView;

  public CardShopUI()
  {
    AppMethodBeat.i(88639);
    this.kaY = new ArrayList();
    this.kny = "";
    this.khx = false;
    this.jIA = new CardShopUI.4(this);
    this.gKK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(88633);
        if (paramAnonymousView.getId() == 2131822314)
        {
          paramAnonymousView = (od)paramAnonymousView.getTag();
          if (paramAnonymousView != null)
          {
            com.tencent.mm.plugin.card.d.b.a(CardShopUI.this, paramAnonymousView.cEB, paramAnonymousView.cGm, paramAnonymousView.fBg);
            com.tencent.mm.plugin.report.service.h.pYm.e(11941, new Object[] { Integer.valueOf(5), CardShopUI.c(CardShopUI.this).aZZ(), CardShopUI.c(CardShopUI.this).baa(), "", paramAnonymousView.name });
          }
        }
        AppMethodBeat.o(88633);
      }
    };
    AppMethodBeat.o(88639);
  }

  private void axU()
  {
    AppMethodBeat.i(88646);
    if (am.baZ().a(this.kny, this.kaE, this))
    {
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      getString(2131297061);
      this.fsh = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131297848), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(88631);
          paramAnonymousDialogInterface = am.baZ();
          paramAnonymousDialogInterface.a(CardShopUI.d(CardShopUI.this), CardShopUI.this);
          if (paramAnonymousDialogInterface.kbR != null)
            g.RO().eJo.c(paramAnonymousDialogInterface.kbR);
          AppMethodBeat.o(88631);
        }
      });
      AppMethodBeat.o(88646);
    }
    while (true)
    {
      return;
      com.tencent.mm.ui.base.h.bQ(this, getString(2131297847));
      AppMethodBeat.o(88646);
    }
  }

  private void bdt()
  {
    AppMethodBeat.i(88644);
    ab.i("MicroMsg.CardShopUI", "openLocation");
    registerReceiver();
    if (bdu())
    {
      axU();
      AppMethodBeat.o(88644);
    }
    while (true)
    {
      return;
      d.c(this);
      AppMethodBeat.o(88644);
    }
  }

  private static boolean bdu()
  {
    boolean bool = true;
    AppMethodBeat.i(88645);
    int i;
    if ((!l.agA()) && (!l.agB()))
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(88645);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label37: AppMethodBeat.o(88645);
      bool = false;
    }
  }

  private void registerReceiver()
  {
    AppMethodBeat.i(88647);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.LOCALE_CHANGED");
    registerReceiver(this.jIA, localIntentFilter);
    AppMethodBeat.o(88647);
  }

  public final void a(boolean paramBoolean, ArrayList<od> paramArrayList)
  {
    AppMethodBeat.i(88643);
    if (this.fsh != null)
    {
      this.fsh.dismiss();
      this.fsh = null;
    }
    int i;
    if (paramArrayList == null)
    {
      i = 0;
      ab.d("MicroMsg.CardShopUI", "onGotCardShop, isOk = %b, shop list size = %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
      if (paramBoolean)
        break label80;
      ab.e("MicroMsg.CardShopUI", "onGotCardShop fail");
      AppMethodBeat.o(88643);
    }
    while (true)
    {
      return;
      i = paramArrayList.size();
      break;
      label80: if ((paramArrayList != null) && (paramArrayList.size() != 0))
        break label106;
      ab.e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
      AppMethodBeat.o(88643);
    }
    label106: if (this.kaY != null)
    {
      this.kaY.clear();
      this.kaY.addAll(paramArrayList);
      this.knB.setVisibility(0);
    }
    while (true)
    {
      this.knz.notifyDataSetChanged();
      AppMethodBeat.o(88643);
      break;
      this.knB.setVisibility(8);
    }
  }

  public final int getLayoutId()
  {
    return 2130968980;
  }

  public final void initView()
  {
    AppMethodBeat.i(88641);
    if (!TextUtils.isEmpty(this.kaS.aZV().vUz))
      setMMTitle(this.kaS.aZV().vUz);
    while (true)
    {
      this.mListView = ((ListView)findViewById(2131822316));
      this.knA = ((LinearLayout)View.inflate(getBaseContext(), 2130968951, null));
      this.mListView.addHeaderView(this.knA);
      this.knz = new CardShopUI.a(this, (byte)0);
      this.mListView.setAdapter(this.knz);
      Intent localIntent = getIntent();
      this.mListView.setOnItemClickListener(new CardShopUI.1(this, localIntent));
      setBackBtn(new CardShopUI.2(this));
      this.knB = View.inflate(this, 2130968950, null);
      if (this.knA != null)
        this.knA.addView(this.knB);
      this.knC = ((TextView)this.knB.findViewById(2131822213));
      this.knC.setText(2131297986);
      this.knB.setVisibility(8);
      AppMethodBeat.o(88641);
      return;
      setMMTitle(2131297804);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88640);
    super.onCreate(paramBundle);
    this.kaS = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    String str = getIntent().getStringExtra("KEY_CARD_TP_ID");
    paramBundle = getIntent().getStringExtra("KEY_CARD_ID");
    if (this.kaS != null)
    {
      ab.i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
      this.kny = this.kaS.baa();
      paramBundle = this.kaS.aZZ();
    }
    while (true)
    {
      this.kaE = paramBundle;
      do
      {
        if (TextUtils.isEmpty(this.kny))
        {
          ab.e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
          finish();
        }
        boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
        ab.i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        this.khx = bool;
        if (this.khx)
          bdt();
        initView();
        AppMethodBeat.o(88640);
        return;
      }
      while (TextUtils.isEmpty(str));
      this.kny = str;
      if (TextUtils.isEmpty(paramBundle))
        paramBundle = "";
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88642);
    if (this.khx)
      unregisterReceiver(this.jIA);
    am.baZ().a(this.kny, this);
    super.onDestroy();
    AppMethodBeat.o(88642);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(88648);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.CardShopUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(88648);
      return;
    }
    ab.i("MicroMsg.CardShopUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 69:
    }
    while (true)
    {
      AppMethodBeat.o(88648);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        ab.i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.khx);
        if (!this.khx)
        {
          this.khx = true;
          bdt();
        }
        AppMethodBeat.o(88648);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131298419), false, new CardShopUI.6(this), null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShopUI
 * JD-Core Version:    0.6.2
 */