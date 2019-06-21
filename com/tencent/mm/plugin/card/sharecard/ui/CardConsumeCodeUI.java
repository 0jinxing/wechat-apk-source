package com.tencent.mm.plugin.card.sharecard.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.c.a;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class CardConsumeCodeUI extends MMActivity
  implements View.OnClickListener, c.a, d.a
{
  private final String TAG = "MicroMsg.CardConsumeCodeUI";
  private int emC = 3;
  private com.tencent.mm.plugin.card.base.b kaS;
  private Vibrator kgA;
  private boolean kgB = false;
  private String kgm;
  private int kgn = 3;
  private int kgo = 0;
  private a kgp;
  private TextView kgq;
  private TextView kgr;
  private LinearLayout kgs;
  private ImageView kgt;
  private View kgu;
  private LinearLayout kgv;
  private View kgw;
  private TextView kgx;
  private TextView kgy;
  private TextView kgz;

  private void bbC()
  {
    AppMethodBeat.i(88102);
    if (this.kaS.aZD())
      if (!TextUtils.isEmpty(this.kaS.aZV().kdf))
      {
        setMMTitle(getString(2131297823, new Object[] { this.kaS.aZV().kdf }));
        AppMethodBeat.o(88102);
      }
    while (true)
    {
      return;
      setMMTitle(getString(2131297823, new Object[] { getString(2131297919) }));
      AppMethodBeat.o(88102);
    }
  }

  private void bbD()
  {
    AppMethodBeat.i(88103);
    am.bbh().a(this);
    if (this.kaS.aZQ())
    {
      am.bbj().a(this);
      if (!am.bbj().isEmpty())
      {
        am.bbj().ban();
        AppMethodBeat.o(88103);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
      am.bbj().Gk(this.kaS.aZZ());
      AppMethodBeat.o(88103);
    }
  }

  private void cu()
  {
    AppMethodBeat.i(88107);
    int i;
    if (this.kaS.aZD())
    {
      findViewById(2131821974).setBackgroundColor(getResources().getColor(2131689822));
      m.d(this);
      if ((!this.kaS.aZD()) || (TextUtils.isEmpty(this.kaS.aZV().kbV)))
        break label218;
      this.kgs.setVisibility(0);
      this.kgq.setVisibility(8);
      this.kgr.setVisibility(8);
      this.kgu.setVisibility(8);
      i = getResources().getDimensionPixelSize(2131428158);
      m.a(this.kgt, this.kaS.aZV().kbV, i, 2130839644, true);
    }
    tm localtm;
    label218: Object localObject;
    while (true)
      if (this.kaS.aZV().vUA != null)
      {
        localtm = this.kaS.aZV().vUA;
        if (TextUtils.isEmpty(localtm.title))
        {
          AppMethodBeat.o(88107);
          return;
          i = com.tencent.mm.plugin.card.d.l.Hn(this.kaS.aZV().color);
          findViewById(2131821974).setBackgroundColor(i);
          m.a(this, this.kaS);
          break;
          this.kgq.setText(this.kaS.aZV().kdg);
          this.kgr.setText(this.kaS.aZV().title);
          continue;
        }
        if (this.kgw == null)
          this.kgw = ((ViewStub)findViewById(2131821989)).inflate();
        this.kgw.setOnClickListener(this);
        this.kgx = ((TextView)this.kgw.findViewById(2131822254));
        this.kgy = ((TextView)this.kgw.findViewById(2131822253));
        this.kgz = ((TextView)this.kgw.findViewById(2131822255));
        this.kgx.setVisibility(0);
        this.kgx.setText(localtm.title);
        localObject = getResources().getDrawable(2130838062);
        ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getMinimumWidth(), ((Drawable)localObject).getMinimumHeight());
        ((Drawable)localObject).setColorFilter(com.tencent.mm.plugin.card.d.l.Hn(this.kaS.aZV().color), PorterDuff.Mode.SRC_IN);
        this.kgx.setCompoundDrawables(null, null, (Drawable)localObject, null);
        this.kgx.setTextColor(com.tencent.mm.plugin.card.d.l.Hn(this.kaS.aZV().color));
        this.kgx.setOnClickListener(this);
        if (TextUtils.isEmpty(localtm.kbW))
          break label648;
        this.kgy.setVisibility(0);
        this.kgy.setText(localtm.kbW);
      }
    while (true)
    {
      if (!TextUtils.isEmpty(localtm.kbX))
      {
        this.kgz.setVisibility(0);
        this.kgz.setText(localtm.kbX);
      }
      localObject = this.kgt.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = getResources().getDimensionPixelSize(2131428159);
      ((ViewGroup.LayoutParams)localObject).width = getResources().getDimensionPixelSize(2131428159);
      this.kgt.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = this.kgs.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.fromDPToPix(this, 54);
      ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.bz.a.fromDPToPix(this, 54);
      this.kgs.setLayoutParams((ViewGroup.LayoutParams)localObject);
      i = getResources().getDimensionPixelSize(2131428159);
      m.a(this.kgt, this.kaS.aZV().kbV, i, 2130839644, true);
      this.kgv.setPadding(0, com.tencent.mm.bz.a.fromDPToPix(this, 10), 0, com.tencent.mm.bz.a.fromDPToPix(this, 30));
      AppMethodBeat.o(88107);
      break;
      label648: this.kgy.setVisibility(0);
      this.kgy.setText(getString(2131297920));
    }
  }

  public final void Gj(String paramString)
  {
    AppMethodBeat.i(88114);
    com.tencent.mm.plugin.card.d.d.a(this, paramString, true);
    AppMethodBeat.o(88114);
  }

  public final void Gm(String paramString)
  {
    AppMethodBeat.i(88112);
    ab.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
    if (this.kgB)
    {
      ab.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
      AppMethodBeat.o(88112);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
      this.kgB = true;
      Intent localIntent = new Intent(this, CardConsumeSuccessUI.class);
      localIntent.putExtra("KEY_CARD_ID", this.kaS.aZZ());
      localIntent.putExtra("KEY_CARD_CONSUMED_JSON", paramString);
      localIntent.putExtra("KEY_CARD_COLOR", this.kaS.aZV().color);
      localIntent.putExtra("key_stastic_scene", this.emC);
      localIntent.putExtra("key_from_scene", 0);
      startActivity(localIntent);
      AppMethodBeat.o(88112);
    }
  }

  public final void bap()
  {
    AppMethodBeat.i(88113);
    this.kgp.bbB();
    AppMethodBeat.o(88113);
  }

  public final void bau()
  {
    AppMethodBeat.i(88110);
    this.kgA.vibrate(300L);
    AppMethodBeat.o(88110);
  }

  public final void bav()
  {
    AppMethodBeat.i(88111);
    ab.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
    finish();
    AppMethodBeat.o(88111);
  }

  public final void d(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88109);
    ab.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
    if ((paramb != null) && (paramb.aZZ() != null) && (paramb.aZZ().equals(this.kaS.aZZ())))
    {
      this.kaS = paramb;
      this.kgp.kaS = this.kaS;
      this.kgp.bbB();
    }
    AppMethodBeat.o(88109);
  }

  public final int getLayoutId()
  {
    return 2130968907;
  }

  public final void initView()
  {
    AppMethodBeat.i(88101);
    bbC();
    setBackBtn(new CardConsumeCodeUI.1(this));
    if (this.kgp == null)
    {
      this.kgp = new a(this, this.mController.contentView);
      this.kgp.onCreate();
      this.kgp.initView();
      this.kgp.kgi = new CardConsumeCodeUI.2(this);
    }
    this.kgp.kaS = this.kaS;
    this.kgp.kgh = true;
    if (this.kaS.aZC())
      this.kgp.GL(this.kgm);
    this.kgA = ((Vibrator)getSystemService("vibrator"));
    this.kgq = ((TextView)findViewById(2131821976));
    this.kgr = ((TextView)findViewById(2131820678));
    this.kgs = ((LinearLayout)findViewById(2131821977));
    this.kgt = ((ImageView)findViewById(2131821978));
    this.kgu = findViewById(2131821979);
    this.kgv = ((LinearLayout)findViewById(2131821980));
    cu();
    bbD();
    AppMethodBeat.o(88101);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(88116);
    if ((paramView.getId() == 2131822254) || (paramView.getId() == 2131821990))
    {
      if (!this.kaS.aZP())
        break label73;
      paramView = new j.b();
      com.tencent.mm.plugin.card.d.b.a(this, paramView.kbK, paramView.kbL, false, this.kaS);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(88116);
      return;
      label73: paramView = this.kaS.aZV().vUA;
      if ((!com.tencent.mm.plugin.card.d.b.a(this.kaS.aZZ(), paramView, this.kgn, this.kgo)) && (paramView != null) && (!TextUtils.isEmpty(paramView.url)))
      {
        com.tencent.mm.plugin.card.d.b.a(this, com.tencent.mm.plugin.card.d.l.A(paramView.url, paramView.vUW), 1);
        h.pYm.e(11941, new Object[] { Integer.valueOf(9), this.kaS.aZZ(), this.kaS.baa(), "", paramView.title });
        if (com.tencent.mm.plugin.card.d.l.a(paramView, this.kaS.aZZ()))
        {
          com.tencent.mm.plugin.card.d.l.Hs(this.kaS.aZZ());
          com.tencent.mm.plugin.card.d.b.b(this, this.kaS.aZV().kdg);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88100);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
    setResult(0);
    this.kaS = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    this.emC = getIntent().getIntExtra("key_from_scene", 3);
    this.kgn = getIntent().getIntExtra("key_previous_scene", 3);
    this.kgm = getIntent().getStringExtra("key_mark_user");
    this.kgo = getIntent().getIntExtra("key_from_appbrand_type", 0);
    if ((this.kaS == null) || (this.kaS.aZV() == null) || (this.kaS.aZW() == null))
    {
      ab.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      AppMethodBeat.o(88100);
    }
    while (true)
    {
      return;
      initView();
      am.bbc().s("", "", 3);
      AppMethodBeat.o(88100);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88106);
    a locala = this.kgp;
    locala.ay(locala.kgj);
    com.tencent.mm.plugin.card.d.l.K(locala.gKF);
    com.tencent.mm.plugin.card.d.l.K(locala.kgb);
    locala.kgi = null;
    locala.jiE = null;
    am.bbh().c(this);
    am.bbh().b(this);
    if (this.kaS.aZQ())
    {
      am.bbj().b(this);
      am.bbj().bao();
    }
    this.kgA.cancel();
    super.onDestroy();
    AppMethodBeat.o(88106);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88108);
    if (paramInt == 4)
    {
      ab.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
      setResult(-1);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88108);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(88105);
    am.bbh().a(this, false);
    super.onPause();
    AppMethodBeat.o(88105);
  }

  public void onResume()
  {
    AppMethodBeat.i(88104);
    this.kgp.bbB();
    am.bbh().a(this, true);
    super.onResume();
    AppMethodBeat.o(88104);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(88115);
    this.kgp.bbB();
    AppMethodBeat.o(88115);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI
 * JD-Core Version:    0.6.2
 */