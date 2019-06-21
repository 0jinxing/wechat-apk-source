package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.plugin.luckymoney.model.ao;
import com.tencent.mm.plugin.luckymoney.model.ar;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.p;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.luckymoney.ui.b;
import com.tencent.mm.plugin.luckymoney.ui.g;
import com.tencent.mm.plugin.luckymoney.ui.h.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public class SnsLuckyMoneyPrepareUI extends LuckyMoneyBaseUI
  implements g
{
  private ap gGo;
  protected Dialog gII;
  private ScrollView hJh;
  protected TextView kGm;
  private TextView kGq;
  protected Button leS;
  protected MyKeyboardWindow mKeyboard;
  private int mType;
  private i nSs;
  protected LuckyMoneyNumInputView nTd;
  protected LuckyMoneyTextInputView nTf;
  protected Button nTg;
  protected View nTi;
  private TextView nTl;
  private b nTn;
  protected LuckyMoneyMoneyInputView obC;
  private View obD;
  private View obE;
  private ViewGroup obF;
  private int obG;
  private String obH;
  private int obI;
  private boolean obJ;
  private String obK;
  private int obL;
  private com.tencent.mm.wallet_core.ui.a obM;

  public SnsLuckyMoneyPrepareUI()
  {
    AppMethodBeat.i(42532);
    this.nTd = null;
    this.obC = null;
    this.nTf = null;
    this.kGm = null;
    this.nTg = null;
    this.leS = null;
    this.gII = null;
    this.nTn = new b();
    this.gGo = null;
    AppMethodBeat.o(42532);
  }

  private int bMh()
  {
    AppMethodBeat.i(42543);
    int i;
    if (this.obJ)
      if (getIntent().getIntExtra("key_chatroom_num", 0) > 0)
      {
        i = 2;
        AppMethodBeat.o(42543);
      }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(42543);
      continue;
      i = 3;
      AppMethodBeat.o(42543);
    }
  }

  protected final void V(View paramView, int paramInt)
  {
    AppMethodBeat.i(42539);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    EditText localEditText = (EditText)paramView.findViewById(2131825536);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nTi == null))
      AppMethodBeat.o(42539);
    while (true)
    {
      return;
      e.setNoSystemInputOnEditText(localEditText);
      localEditText.setOnFocusChangeListener(new SnsLuckyMoneyPrepareUI.10(this, paramInt, localEditText));
      localEditText.setOnClickListener(new SnsLuckyMoneyPrepareUI.12(this, paramInt, localEditText));
      paramView = (TextView)paramView.findViewById(2131825537);
      if (paramView != null)
        paramView.setOnClickListener(new SnsLuckyMoneyPrepareUI.13(this, paramInt, localEditText));
      localView.setOnClickListener(new SnsLuckyMoneyPrepareUI.14(this));
      AppMethodBeat.o(42539);
    }
  }

  protected final void aoB()
  {
    AppMethodBeat.i(42541);
    if ((this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      this.obM.ic(false);
    }
    AppMethodBeat.o(42541);
  }

  public final void bLa()
  {
    AppMethodBeat.i(42542);
    com.tencent.mm.plugin.luckymoney.b.a.bKN();
    this.nSs = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLu();
    int i;
    double d1;
    double d2;
    if ((this.obC.bKW() != 3) && (this.nTd.bKW() != 3))
    {
      i = this.nTd.getInput();
      d1 = this.obC.getInput();
      if (this.mType == 0)
      {
        d1 *= i;
        d2 = this.obC.getInput();
      }
    }
    while (true)
      if (this.nTn.bMy())
      {
        this.nTg.setClickable(false);
        this.nTg.setEnabled(false);
        this.kGm.setText(e.G(d1));
        AppMethodBeat.o(42542);
        return;
        if (i > 0)
          d2 = this.obC.getInput() / i;
      }
      else
      {
        if ((d1 == 0.0D) || (d2 == 0.0D))
          i = 1;
        while (true)
        {
          label155: if (i != 0)
          {
            this.nTg.setClickable(false);
            this.nTg.setEnabled(false);
            break;
            if ((d1 > this.nSs.nRR) && (this.nSs.nRR > 0.0D))
            {
              this.nTn.Dv(getString(2131301210, new Object[] { Math.round(this.nSs.nRR), bo.bc(this.nSs.nRU, "") }));
              i = 1;
              continue;
            }
            if (d2 <= 0.0D)
              break label643;
            if (this.mType == 0)
            {
              if ((d2 <= this.nSs.nRP) || (this.nSs.nRP <= 0.0D))
                break label638;
              this.nTn.Dv(getString(2131301161, new Object[] { Math.round(this.nSs.nRP), bo.bc(this.nSs.nRU, "") }));
              i = 1;
            }
          }
          while (true)
          {
            if (i == 0)
            {
              if (this.mType == 0)
              {
                if (d2 >= this.nSs.nRQ)
                  break label635;
                this.nTn.Dv(getString(2131301163, new Object[] { e.F(this.nSs.nRQ), bo.bc(this.nSs.nRU, "") }));
                i = 1;
                break label155;
                if ((d2 <= this.nSs.nRS) || (this.nSs.nRS <= 0.0D))
                  break label638;
                this.nTn.Dv(getString(2131301161, new Object[] { Math.round(this.nSs.nRS), bo.bc(this.nSs.nRU, "") }));
                this.nTd.onError();
                this.obC.onError();
                i = 1;
                continue;
              }
              if (d2 < 0.01D)
              {
                this.nTn.Dv(getString(2131301163, new Object[] { "0.01", bo.bc(this.nSs.nRU, "") }));
                this.nTd.onError();
                this.obC.onError();
                i = 1;
                break label155;
                this.nTg.setClickable(true);
                this.nTg.setEnabled(true);
                break;
              }
            }
            label635: break label155;
            label638: i = 0;
          }
          label643: i = 0;
        }
        d2 = 0.0D;
        continue;
        d2 = 0.0D;
        d1 = 0.0D;
      }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42537);
    boolean bool;
    if ((paramm instanceof ao))
    {
      if ((this.gII != null) && (this.gII.isShowing()))
        this.gII.hide();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ao)paramm;
        this.obI = paramString.kCd;
        this.obH = paramString.nSX;
        this.obK = paramString.nYY;
        paramm = new PayInfo();
        paramm.czZ = paramString.nYX;
        paramm.cIf = 37;
        paramm.cIb = this.obL;
        com.tencent.mm.pluginsdk.wallet.h.a(this, paramm, 1);
        AppMethodBeat.o(42537);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      if (paramInt2 == 401)
      {
        this.nTg.setEnabled(false);
        this.nTg.setClickable(false);
        this.gGo.ae(5000L, 5000L);
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        AppMethodBeat.o(42537);
        bool = true;
      }
      else
      {
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        AppMethodBeat.o(42537);
        bool = true;
        continue;
        if ((paramm instanceof ar))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if (this.obJ)
            {
              com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
              finish();
            }
            while (true)
            {
              AppMethodBeat.o(42537);
              bool = true;
              break;
              bMq();
              this.obE.postDelayed(new SnsLuckyMoneyPrepareUI.2(this), 1000L);
            }
          }
          if (paramInt2 == 402)
          {
            com.tencent.mm.ui.base.h.d(this.mController.ylL, paramString, "", getString(2131301191), getString(2131296868), new SnsLuckyMoneyPrepareUI.3(this), new SnsLuckyMoneyPrepareUI.4(this));
            AppMethodBeat.o(42537);
            bool = true;
          }
        }
        else
        {
          if ((paramm instanceof ag))
          {
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              paramString = (ag)paramm;
              com.tencent.mm.plugin.luckymoney.b.a.bKN();
              this.nSs = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLu();
              ab.d("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.nSs);
              if (this.mType != 1)
                break label683;
              this.obC.setMaxAmount(this.nSs.nRR);
              label427: this.obC.setMinAmount(this.nSs.nRQ);
              this.nTd.setMaxNum(this.nSs.nRO);
              if ((paramString.nYE) && (this.obJ))
              {
                paramm = (TextView)findViewById(2131825631);
                paramm.setOnClickListener(new SnsLuckyMoneyPrepareUI.5(this));
                com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(8) });
                paramm.setVisibility(0);
              }
              if (bo.isNullOrNil(paramString.kCx))
                break label700;
              ab.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.kCx);
              this.nTl.setText(paramString.kCx);
              if (!bo.isNullOrNil(paramString.nYG))
                this.nTl.setOnClickListener(new SnsLuckyMoneyPrepareUI.6(this, paramString));
              this.nTl.setVisibility(0);
            }
            while (true)
            {
              paramm = new h.c();
              paramm.textColor = getResources().getColor(2131690631);
              com.tencent.mm.plugin.luckymoney.ui.h.a(this, this.obF, paramString.nYI, paramm);
              AppMethodBeat.o(42537);
              bool = true;
              break;
              label683: this.obC.setMaxAmount(this.nSs.nRP);
              break label427;
              label700: this.nTl.setVisibility(8);
            }
          }
          AppMethodBeat.o(42537);
          bool = false;
        }
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(42536);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (this.obD.getVisibility() == 0))
    {
      this.obD.setVisibility(8);
      bMp();
      bool = true;
      AppMethodBeat.o(42536);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(42536);
    }
  }

  public final int getLayoutId()
  {
    return 2130969994;
  }

  public final void initView()
  {
    AppMethodBeat.i(42534);
    getResources().getDrawable(2130839226);
    setBackBtn(new SnsLuckyMoneyPrepareUI.1(this));
    this.obD = findViewById(2131825633);
    this.obE = findViewById(2131825638);
    this.leS = ((Button)findViewById(2131825637));
    this.nTf = ((LuckyMoneyTextInputView)findViewById(2131825621));
    this.nTf.setHintText(getString(2131301090));
    this.nTg = ((Button)findViewById(2131825630));
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    this.kGq = ((TextView)findViewById(2131825618));
    this.nTd = ((LuckyMoneyNumInputView)findViewById(2131825619));
    this.obC = ((LuckyMoneyMoneyInputView)findViewById(2131825617));
    this.kGm = ((TextView)findViewById(2131825629));
    this.obF = ((ViewGroup)findViewById(2131825632));
    this.hJh = ((ScrollView)findViewById(2131825615));
    this.nTl = ((TextView)findViewById(2131825616));
    if (this.mType == 1)
    {
      this.obC.setTitle(getString(2131301211));
      this.obC.setShowGroupIcon(true);
      this.obC.setOnInputValidChangerListener(this);
      this.nTd.setOnInputValidChangerListener(this);
      this.nTf.setOnInputValidChangerListener(this);
      Object localObject1 = (EditText)this.obC.findViewById(2131825536);
      Object localObject2 = (EditText)this.nTd.findViewById(2131825536);
      e.setNoSystemInputOnEditText((EditText)localObject1);
      ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput((View)localObject1, 0);
      ((EditText)localObject1).setOnClickListener(new SnsLuckyMoneyPrepareUI.19(this, (EditText)localObject1, (EditText)localObject2));
      Object localObject3 = (TextView)this.obC.findViewById(2131825537);
      if (localObject3 != null)
        ((TextView)localObject3).setOnClickListener(new SnsLuckyMoneyPrepareUI.20(this, (EditText)localObject1, (EditText)localObject2));
      e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).setOnClickListener(new SnsLuckyMoneyPrepareUI.21(this, (EditText)localObject1, (EditText)localObject2));
      if (this.nSs != null)
      {
        if (this.mType != 1)
          break label1037;
        this.obC.setMaxAmount(this.nSs.nRR);
        label448: this.obC.setMinAmount(this.nSs.nRQ);
      }
      if ((!this.obJ) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1))
        break label1054;
      this.nTd.setNum("1");
      label493: this.nTd.setMaxNum(this.nSs.nRO);
      this.nTd.setMinNum(1);
      ab.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.nTd.getInput());
      this.obC.setMaxLen(12);
      if (!this.obJ)
        break label1079;
      if (getIntent().getIntExtra("key_chatroom_num", 0) <= 0)
        break label1067;
      Object localObject4 = getString(2131301124);
      Object localObject5 = getString(2131301121);
      localObject1 = getString(2131301123);
      String str = getString(2131301122);
      localObject3 = new SpannableString((String)localObject4 + (String)localObject5);
      localObject2 = new com.tencent.mm.plugin.wallet_core.ui.j(this);
      ((SpannableString)localObject3).setSpan(localObject2, ((String)localObject4).length(), ((String)localObject4).length() + ((String)localObject5).length(), 33);
      localObject4 = new SpannableString((String)localObject1 + str);
      localObject5 = new com.tencent.mm.plugin.wallet_core.ui.j(this);
      ((SpannableString)localObject4).setSpan(localObject5, ((String)localObject1).length(), ((String)localObject1).length() + str.length(), 33);
      ((com.tencent.mm.plugin.wallet_core.ui.j)localObject2).tHw = new SnsLuckyMoneyPrepareUI.11(this, (SpannableString)localObject4);
      ((com.tencent.mm.plugin.wallet_core.ui.j)localObject5).tHw = new SnsLuckyMoneyPrepareUI.15(this, (SpannableString)localObject3);
      this.kGq.setMovementMethod(LinkMovementMethod.getInstance());
      this.kGq.setText((CharSequence)localObject3);
      this.kGq.setVisibility(0);
      label783: this.nTg.setOnClickListener(new SnsLuckyMoneyPrepareUI.16(this));
      this.kGm.setText(e.G(0.0D));
      this.nTn.a(this.nTd);
      this.nTn.a(this.obC);
      this.nTn.a(this.nTf);
      localObject3 = (TextView)findViewById(2131825639);
      this.nTn.i((TextView)localObject3);
      if ((this.obJ) && (this.mType == 1))
      {
        localObject3 = (TextView)findViewById(2131825620);
        ((TextView)localObject3).setText(getString(2131301149, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject3).setVisibility(0);
      }
      this.gGo = new ap(new SnsLuckyMoneyPrepareUI.17(this), false);
      if (this.hJh != null)
        this.hJh.setOnTouchListener(new SnsLuckyMoneyPrepareUI.18(this));
      this.obC.setType(this.mType);
      if ((!this.obJ) || (getIntent().getIntExtra("key_chatroom_num", 0) != 0))
        break label1144;
      this.obC.requestFocus();
      AppMethodBeat.o(42534);
    }
    while (true)
    {
      return;
      this.obC.setTitle(getString(2131301212));
      this.obC.setShowGroupIcon(false);
      break;
      label1037: this.obC.setMaxAmount(this.nSs.nRP);
      break label448;
      label1054: this.nTd.setNum("");
      break label493;
      label1067: this.nTd.setVisibility(8);
      break label783;
      label1079: if (this.mType == 1)
      {
        this.kGq.setText(this.nSs.nWH);
        this.kGq.setVisibility(0);
        break label783;
      }
      if (this.mType != 0)
        break label783;
      this.kGq.setText(this.nSs.nWI);
      this.kGq.setVisibility(0);
      break label783;
      label1144: this.nTd.requestFocus();
      AppMethodBeat.o(42534);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42538);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(42538);
      Object localObject1;
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(5) });
        localObject1 = getIntent().getStringExtra("key_username");
        if ((!this.obJ) || (bo.isNullOrNil((String)localObject1)))
          break label266;
        com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
        localObject2 = br.z(this.obK, "msg");
        if (localObject2 != null)
          break label176;
        ab.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
        finish();
        AppMethodBeat.o(42538);
      }
      label176: Object localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
      if (com.tencent.mm.plugin.luckymoney.b.a.bKN().bKQ().Qh((String)localObject2))
      {
        ab.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
        if (!x.E(this.obK, (String)localObject1, 1))
        {
          ab.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
          com.tencent.mm.plugin.luckymoney.b.a.bKN().bKQ().Qi((String)localObject2);
        }
      }
      while (true)
      {
        finish();
        break;
        ab.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
      }
      label266: bMq();
      new ak().postDelayed(new SnsLuckyMoneyPrepareUI.7(this), 200L);
      this.leS.setOnClickListener(new SnsLuckyMoneyPrepareUI.8(this));
      ((ImageView)findViewById(2131825636)).setOnClickListener(new SnsLuckyMoneyPrepareUI.9(this));
      continue;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(7), localObject1 });
        if (!bo.isNullOrNil((String)localObject1))
          n(new ar(((String)localObject1).replaceAll(",", "|"), this.obH, "v1.0"));
        else
          finish();
      }
      else if (paramInt2 == 0)
      {
        localObject1 = new Intent();
        ((Intent)localObject1).setClass(this.mController.ylL, LuckyMoneyMyRecordUI.class);
        ((Intent)localObject1).putExtra("key_type", 1);
        startActivity((Intent)localObject1);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42533);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.obG = getIntent().getIntExtra("key_way", 3);
    if (getIntent().getIntExtra("key_from", 0) == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.obJ = bool;
      this.obL = getIntent().getIntExtra("pay_channel", -1);
      b(new ag("v1.0", 0, (byte)0), false);
      com.tencent.mm.plugin.luckymoney.b.a.bKN();
      this.nSs = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLu();
      ab.d("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.obJ + ", config " + this.nSs);
      initView();
      com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(1) });
      AppMethodBeat.o(42533);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42535);
    super.onDestroy();
    this.nTn.clear();
    this.gGo.doT();
    if ((this.gII != null) && (this.gII.isShowing()))
      this.gII.dismiss();
    AppMethodBeat.o(42535);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(42540);
    boolean bool;
    if ((paramInt == 4) && (this.nTi != null) && (this.nTi.isShown()))
    {
      aoB();
      bool = true;
      AppMethodBeat.o(42540);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(42540);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI
 * JD-Core Version:    0.6.2
 */