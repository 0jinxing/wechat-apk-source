package com.tencent.mm.plugin.collect.reward.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.b;
import com.tencent.mm.plugin.collect.reward.a.h;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.pt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Map;

public class QrRewardMainUI extends QrRewardBaseUI
{
  private int cIZ;
  private String cQY;
  private String desc;
  private String hHN;
  private boolean kEA;
  private final int kEg;
  private RelativeLayout kEh;
  private Button kEi;
  private ViewGroup kEj;
  private ViewGroup kEk;
  private RelativeLayout kEl;
  private CdnImageView kEm;
  private ImageView kEn;
  private ImageView kEo;
  private MMEditText kEp;
  private TextView kEq;
  private TextView kEr;
  private TextView kEs;
  private TextView kEt;
  private ScrollView kEu;
  private String kEv;
  private String kEw;
  private String kEx;
  private int kEy;
  private boolean kEz;
  private boolean mIsOpen;
  private String username;

  public QrRewardMainUI()
  {
    AppMethodBeat.i(41102);
    this.kEg = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 200);
    this.mIsOpen = false;
    AppMethodBeat.o(41102);
  }

  private void bgX()
  {
    AppMethodBeat.i(41110);
    if (com.tencent.mm.plugin.collect.reward.b.a.bgS().bgT())
    {
      this.kEm.am(com.tencent.mm.plugin.collect.reward.b.a.bgS().bgV(), this.kEg, this.kEg);
      this.kEl.setVisibility(0);
      AppMethodBeat.o(41110);
    }
    while (true)
    {
      return;
      this.kEl.setVisibility(4);
      AppMethodBeat.o(41110);
    }
  }

  private void bgY()
  {
    AppMethodBeat.i(41111);
    int i = Math.round(this.kEg * (this.cIZ * 1.0F / this.kEy));
    int j = i;
    if (i <= 0)
      j = 248;
    ViewGroup.LayoutParams localLayoutParams = this.kEo.getLayoutParams();
    localLayoutParams.width = j;
    localLayoutParams.height = j;
    this.kEo.setLayoutParams(localLayoutParams);
    localLayoutParams = this.kEn.getLayoutParams();
    localLayoutParams.width = j;
    localLayoutParams.height = j;
    this.kEn.setLayoutParams(localLayoutParams);
    localLayoutParams = this.kEp.getLayoutParams();
    localLayoutParams.width = (j - 30);
    localLayoutParams.height = (j - 30);
    this.kEp.setLayoutParams(localLayoutParams);
    this.kEp.setTextSize(0, j * 2 / 3);
    this.kEk.requestLayout();
    AppMethodBeat.o(41111);
  }

  private void bgZ()
  {
    AppMethodBeat.i(41112);
    if (!bo.isNullOrNil(this.desc))
    {
      this.kEq.setText(j.b(this, getString(2131302086, new Object[] { this.desc }), this.kEq.getTextSize()));
      AppMethodBeat.o(41112);
    }
    while (true)
    {
      return;
      this.kEq.setText("");
      AppMethodBeat.o(41112);
    }
  }

  private void bha()
  {
    AppMethodBeat.i(41113);
    bgY();
    bgZ();
    fV(bo.isNullOrNil(this.kEv));
    AppMethodBeat.o(41113);
  }

  private void bhb()
  {
    AppMethodBeat.i(41114);
    if (!bo.isNullOrNil(this.kEw))
    {
      this.kEs.setClickable(true);
      this.kEs.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
      o localo = new o(new QrRewardMainUI.7(this));
      SpannableString localSpannableString = new SpannableString(this.kEw);
      localSpannableString.setSpan(localo, 0, localSpannableString.length(), 18);
      this.kEs.setText(localSpannableString);
      this.kEs.setVisibility(0);
      AppMethodBeat.o(41114);
    }
    while (true)
    {
      return;
      this.kEs.setVisibility(8);
      AppMethodBeat.o(41114);
    }
  }

  private void bhc()
  {
    AppMethodBeat.i(41116);
    if (!bo.isNullOrNil(this.kEv))
    {
      this.kEp.setText(j.b(this.mController.ylL, this.kEv, this.kEp.getTextSize()));
      this.kEp.setSelection(this.kEv.length());
    }
    AppMethodBeat.o(41116);
  }

  private void bhd()
  {
    AppMethodBeat.i(41117);
    ab.i("MicroMsg.QrRewardMainUI", "do set photo word");
    h localh = new h(this.kEv);
    localh.z(this);
    a(localh, true, false);
    AppMethodBeat.o(41117);
  }

  private void fV(boolean paramBoolean)
  {
    AppMethodBeat.i(41115);
    ab.i("MicroMsg.QrRewardMainUI", "switch mode: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kEn.setVisibility(0);
      this.kEp.setVisibility(4);
      a.b.a(this.kEn, this.username, 0.03F, true);
      AppMethodBeat.o(41115);
    }
    while (true)
    {
      return;
      this.kEn.setVisibility(4);
      this.kEp.setVisibility(0);
      AppMethodBeat.o(41115);
    }
  }

  private void n(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(41109);
    if ((this.hHN != null) && (this.hHN.equals(paramString1)));
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.plugin.collect.reward.b.a.bgS().bgT();
      ab.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramBoolean) || (!bool1) || (!bool2))
        com.tencent.mm.plugin.collect.reward.b.a.bgS().a(paramString1, paramString2, new QrRewardMainUI.6(this));
      AppMethodBeat.o(41109);
      return;
    }
  }

  public final boolean aoE()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41105);
    if ((paramm instanceof b))
    {
      paramString = (b)paramm;
      paramString.a(new QrRewardMainUI.16(this, paramString)).b(new QrRewardMainUI.15(this, paramString)).c(new QrRewardMainUI.14(this, paramString));
      AppMethodBeat.o(41105);
    }
    while (true)
    {
      return true;
      if ((paramm instanceof h))
      {
        paramString = (h)paramm;
        paramString.a(new QrRewardMainUI.3(this, paramString)).b(new a.a()
        {
          public final void j(com.tencent.mm.ai.m paramAnonymousm)
          {
            AppMethodBeat.i(41084);
            ab.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", new Object[] { Integer.valueOf(paramString.kDB.kCl), paramString.kDB.kCm });
            QrRewardMainUI.a(QrRewardMainUI.this, (String)g.RP().Ry().get(ac.a.xTx, ""));
            QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.l(QrRewardMainUI.this));
            QrRewardMainUI.m(QrRewardMainUI.this).setText("");
            QrRewardMainUI.j(QrRewardMainUI.this);
            if (!bo.isNullOrNil(paramString.kDB.kCm))
              Toast.makeText(QrRewardMainUI.this, paramString.kDB.kCm, 0).show();
            AppMethodBeat.o(41084);
          }
        }).c(new QrRewardMainUI.17(this));
        this.kEp.clearFocus();
        this.kEp.setCursorVisible(false);
      }
      AppMethodBeat.o(41105);
    }
  }

  public final int getLayoutId()
  {
    return 2130970431;
  }

  public final void initView()
  {
    AppMethodBeat.i(41104);
    this.kEh = ((RelativeLayout)findViewById(2131826741));
    this.kEi = ((Button)findViewById(2131826744));
    this.kEj = ((ViewGroup)findViewById(2131826743));
    this.kEk = ((ViewGroup)findViewById(2131826745));
    this.kEm = ((CdnImageView)findViewById(2131826747));
    this.kEq = ((TextView)findViewById(2131826751));
    this.kEn = ((ImageView)findViewById(2131826748));
    this.kEo = ((ImageView)findViewById(2131826750));
    this.kEl = ((RelativeLayout)findViewById(2131826746));
    this.kEp = ((MMEditText)findViewById(2131826749));
    this.kEr = ((TextView)findViewById(2131826753));
    this.kEt = ((TextView)findViewById(2131826754));
    this.kEs = ((TextView)findViewById(2131826755));
    a.b.a(this.kEn, this.username, 0.03F, true);
    try
    {
      this.kEp.setText(j.b(this.mController.ylL, this.kEv, this.kEp.getTextSize()));
      this.kEp.setSelection(this.kEv.length());
      this.kEp.addTextChangedListener(new QrRewardMainUI.1(this));
      this.kEp.setOnEditorActionListener(new QrRewardMainUI.10(this));
      this.kEo.setOnClickListener(new QrRewardMainUI.11(this));
      this.kEr.setClickable(true);
      this.kEr.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
      Object localObject1 = new o(new QrRewardMainUI.12(this));
      Object localObject2 = new SpannableString(getString(2131302073));
      ((SpannableString)localObject2).setSpan(localObject1, 0, ((SpannableString)localObject2).length(), 18);
      this.kEr.setText((CharSequence)localObject2);
      this.kEt.setClickable(true);
      this.kEt.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
      localObject2 = new o(new QrRewardMainUI.13(this));
      localObject1 = new SpannableString(getString(2131302083));
      ((SpannableString)localObject1).setSpan(localObject2, 0, ((SpannableString)localObject1).length(), 18);
      this.kEt.setText((CharSequence)localObject1);
      bgX();
      bha();
      bhc();
      bhb();
      AppMethodBeat.o(41104);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.QrRewardMainUI", localException, "", new Object[0]);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41107);
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1)
        break label159;
      this.desc = paramIntent.getStringExtra("key_desc");
      this.kEy = paramIntent.getIntExtra("key_photo_width", 900);
      this.cIZ = paramIntent.getIntExtra("key_icon_width", 343);
      boolean bool = paramIntent.getBooleanExtra("key_return_from_first", true);
      ab.i("MicroMsg.QrRewardMainUI", "return from first: %s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        this.kEk.setVisibility(0);
        this.kEj.setVisibility(8);
      }
      this.kEA = true;
      bha();
      String str = paramIntent.getStringExtra("key_photo_url");
      n(str, paramIntent.getStringExtra("key_photo_aeskey"), true);
      this.hHN = str;
      AppMethodBeat.o(41107);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      label159: AppMethodBeat.o(41107);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41103);
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    nf(1323);
    nf(1649);
    this.kEy = ((Integer)g.RP().Ry().get(ac.a.xTv, Integer.valueOf(900))).intValue();
    this.cIZ = ((Integer)g.RP().Ry().get(ac.a.xTw, Integer.valueOf(343))).intValue();
    this.desc = ((String)g.RP().Ry().get(ac.a.xTy, ""));
    this.kEv = ((String)g.RP().Ry().get(ac.a.xTx, ""));
    this.kEw = ((String)g.RP().Ry().get(ac.a.xTC, ""));
    this.kEx = ((String)g.RP().Ry().get(ac.a.xTD, ""));
    this.hHN = ((String)g.RP().Ry().get(ac.a.xTE, ""));
    if (!bo.isNullOrNil((String)g.RP().Ry().get(ac.a.xTB, "")))
      this.kEA = true;
    this.username = r.Yz();
    setMMTitle(2131302068);
    initView();
    boolean bool;
    if ((com.tencent.mm.plugin.collect.reward.b.a.bgS().bgT()) && (this.kEA))
    {
      bool = true;
      ab.i("MicroMsg.QrRewardMainUI", "do get code: %s", new Object[] { Boolean.valueOf(bool) });
      paramBundle = new b(bool);
      paramBundle.z(this);
      if (!bool)
        break label346;
      a(paramBundle, false, false);
      AppMethodBeat.o(41103);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label346: a(paramBundle, true, false);
      AppMethodBeat.o(41103);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41108);
    super.onDestroy();
    ng(1323);
    ng(1649);
    com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.bgS();
    ab.d("MicroMsg.QrRewardCdnDownloadHelper", "do clear callback");
    if (locala.jxd != null)
    {
      ab.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", new Object[] { Integer.valueOf(locala.jxd.size()) });
      locala.jxd.clear();
    }
    AppMethodBeat.o(41108);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(41106);
    super.onKeyboardStateChanged();
    ab.i("MicroMsg.QrRewardMainUI", "key board changed: %s", new Object[] { Integer.valueOf(this.mController.ymc) });
    if (this.mController.ymc == 2)
    {
      this.kEv = this.kEp.getText().toString();
      bhd();
      if (bo.isNullOrNil(this.kEv))
        fV(true);
    }
    AppMethodBeat.o(41106);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI
 * JD-Core Version:    0.6.2
 */