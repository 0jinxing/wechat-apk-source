package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.luckymoney.ui.b;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(19)
public class WxaLuckyMoneyPrepareUI extends WxaLuckyMoneyBaseUI
  implements c, com.tencent.mm.plugin.luckymoney.ui.g
{
  private TextView kGm;
  private TextView kGq;
  protected MyKeyboardWindow mKeyboard;
  private h.a nSv;
  private a nTc;
  private LuckyMoneyNumInputView nTd;
  private WxaLuckyMoneyMoneyInputView nTe;
  private LuckyMoneyTextInputView nTf;
  private Button nTg;
  private LinearLayout nTh;
  protected View nTi;
  private TextView nTj;
  private MMScrollView nTk;
  private TextView nTl;
  private int nTm;
  private b nTn;

  public WxaLuckyMoneyPrepareUI()
  {
    AppMethodBeat.i(42074);
    this.nTc = null;
    this.nSv = h.a.nRX;
    this.nTd = null;
    this.nTe = null;
    this.nTf = null;
    this.kGm = null;
    this.nTg = null;
    this.nTm = 0;
    this.nTn = new b();
    AppMethodBeat.o(42074);
  }

  private void a(com.tencent.mm.plugin.luckymoney.appbrand.a.g paramg)
  {
    AppMethodBeat.i(42078);
    if (this.nSv == h.a.nRX)
      this.nTe.setMaxAmount(paramg.nRR);
    while (true)
    {
      this.nTe.setMinAmount(paramg.nRQ);
      this.nTd.setMaxNum(paramg.nRO);
      paramg = h.a.nRX;
      this.nTd.setMinNum(1);
      AppMethodBeat.o(42078);
      return;
      this.nTe.setMaxAmount(paramg.nRP);
    }
  }

  private void bKX()
  {
    AppMethodBeat.i(42079);
    Object localObject1 = getString(2131301106);
    Object localObject2 = getString(2131301121);
    String str1 = getString(2131301100);
    String str2 = getString(2131301122);
    j localj = new j(this);
    SpannableString localSpannableString = new SpannableString((String)localObject1 + (String)localObject2);
    localSpannableString.setSpan(localj, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject2).length(), 33);
    localObject1 = new SpannableString(str1 + str2);
    localObject2 = new j(this);
    ((SpannableString)localObject1).setSpan(localObject2, str1.length(), str1.length() + str2.length(), 33);
    localj.tHw = new WxaLuckyMoneyPrepareUI.14(this, (SpannableString)localObject1);
    ((j)localObject2).tHw = new WxaLuckyMoneyPrepareUI.15(this, localSpannableString);
    this.kGq.setMovementMethod(LinkMovementMethod.getInstance());
    this.kGq.setText(localSpannableString);
    this.kGq.setVisibility(0);
    AppMethodBeat.o(42079);
  }

  private void bKY()
  {
    AppMethodBeat.i(42080);
    int i = getIntent().getIntExtra("range", 0);
    ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initRange range = %d", new Object[] { Integer.valueOf(i) });
    this.nTh.setVisibility(8);
    if (i == 0)
    {
      this.nTm = 0;
      AppMethodBeat.o(42080);
    }
    while (true)
    {
      return;
      if (i == 1)
      {
        this.nTm = 1;
        AppMethodBeat.o(42080);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(getString(2131305740));
        localArrayList.add(getString(2131305741));
        this.nTh.setVisibility(0);
        this.nTj.setText((CharSequence)localArrayList.get(this.nTm));
        this.nTh.setOnClickListener(new WxaLuckyMoneyPrepareUI.16(this, localArrayList));
        AppMethodBeat.o(42080);
      }
    }
  }

  private void bKZ()
  {
    AppMethodBeat.i(42083);
    EditText localEditText1 = (EditText)this.nTe.findViewById(2131825536);
    EditText localEditText2 = (EditText)this.nTd.findViewById(2131825536);
    e.setNoSystemInputOnEditText(localEditText1);
    ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput(localEditText1, 0);
    localEditText1.addTextChangedListener(new WxaLuckyMoneyPrepareUI.17(this));
    localEditText1.setOnClickListener(new WxaLuckyMoneyPrepareUI.2(this, localEditText1, localEditText2));
    localEditText1.requestFocus();
    TextView localTextView = (TextView)this.nTe.findViewById(2131825537);
    if (localTextView != null)
      localTextView.setOnClickListener(new WxaLuckyMoneyPrepareUI.3(this, localEditText1, localEditText2));
    e.setNoSystemInputOnEditText(localEditText2);
    ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput(localEditText2, 0);
    localEditText2.setOnClickListener(new WxaLuckyMoneyPrepareUI.4(this, localEditText1, localEditText2));
    ((MMEditText)this.nTf.findViewById(2131825665)).setOnFocusChangeListener(new WxaLuckyMoneyPrepareUI.5(this, localEditText1, localEditText2));
    AppMethodBeat.o(42083);
  }

  public final void Qf(String paramString)
  {
    AppMethodBeat.i(42076);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131305389);
    h.a(this, str, null, false, new WxaLuckyMoneyPrepareUI.1(this));
    AppMethodBeat.o(42076);
  }

  protected final void V(View paramView, int paramInt)
  {
    AppMethodBeat.i(42084);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    EditText localEditText = (EditText)paramView.findViewById(2131825536);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nTi == null))
      AppMethodBeat.o(42084);
    while (true)
    {
      return;
      e.setNoSystemInputOnEditText(localEditText);
      localEditText.setOnFocusChangeListener(new WxaLuckyMoneyPrepareUI.6(this, paramInt, localEditText));
      localEditText.setOnClickListener(new WxaLuckyMoneyPrepareUI.7(this, paramInt, localEditText));
      TextView localTextView = (TextView)paramView.findViewById(2131825537);
      if (localTextView != null)
        localTextView.setOnClickListener(new WxaLuckyMoneyPrepareUI.8(this, localEditText, paramView, paramInt));
      localView.setOnClickListener(new WxaLuckyMoneyPrepareUI.9(this));
      AppMethodBeat.o(42084);
    }
  }

  protected final void aoB()
  {
    AppMethodBeat.i(42086);
    if ((this.nTi != null) && (this.nTi.isShown()))
      this.nTi.setVisibility(8);
    AppMethodBeat.o(42086);
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public final void bKV()
  {
  }

  public final void bLa()
  {
    AppMethodBeat.i(42087);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = d2;
    double d4 = d1;
    int i;
    if (this.nTe.bKW() != 3)
    {
      d3 = d2;
      d4 = d1;
      if (this.nTd.bKW() != 3)
      {
        i = this.nTd.getInput();
        d1 = this.nTe.getInput();
        if (this.nSv != h.a.nRY)
          break label164;
        d4 = d1 * i;
        d3 = this.nTe.getInput();
      }
    }
    boolean bool1 = this.nTn.bMy();
    Object localObject = com.tencent.mm.plugin.luckymoney.appbrand.a.g.nRN;
    if (bool1)
    {
      ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "has error");
      this.nTg.setClickable(false);
      this.nTg.setEnabled(false);
      label130: localObject = ((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRT;
      if (!bo.isNullOrNil((String)localObject))
        break label781;
      this.kGm.setText(e.G(d4));
      AppMethodBeat.o(42087);
    }
    while (true)
    {
      return;
      label164: d3 = d2;
      d4 = d1;
      if (i <= 0)
        break;
      d3 = this.nTe.getInput() / i;
      d4 = d1;
      break;
      boolean bool2 = false;
      boolean bool3 = false;
      if ((d4 == 0.0D) || (d3 == 0.0D))
        bool3 = true;
      while (true)
        if (bool3)
        {
          this.nTg.setClickable(false);
          this.nTg.setEnabled(false);
          break;
          if ((d4 > ((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRR) && (((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRR > 0.0D))
          {
            this.nTn.Dv(getString(2131301210, new Object[] { Math.round(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRR), bo.bc(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRU, "") }));
            bool3 = true;
          }
          else if (d3 > 0.0D)
          {
            ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "perAmount ".concat(String.valueOf(d3)));
            if (this.nSv == h.a.nRY)
            {
              bool1 = bool2;
              if (d3 > ((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRP)
              {
                bool1 = bool2;
                if (((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRP > 0.0D)
                {
                  this.nTn.Dv(getString(2131301161, new Object[] { Math.round(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRP), bo.bc(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRU, "") }));
                  bool1 = true;
                }
              }
              label445: ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool1 + " for max value");
              bool3 = bool1;
              if (!bool1)
              {
                if (this.nSv != h.a.nRY)
                  break label691;
                bool3 = bool1;
                if (d3 < ((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRQ)
                {
                  this.nTn.Dv(getString(2131301163, new Object[] { e.F(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRQ), bo.bc(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRU, "") }));
                  bool3 = true;
                }
              }
            }
            while (true)
            {
              ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool3 + " for min value");
              break;
              bool1 = bool2;
              if (d3 <= ((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRS)
                break label445;
              bool1 = bool2;
              if (((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRS <= 0.0D)
                break label445;
              this.nTn.Dv(getString(2131301161, new Object[] { Math.round(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRS), bo.bc(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRU, "") }));
              bool1 = true;
              this.nTd.onError();
              this.nTe.onError();
              break label445;
              label691: bool3 = bool1;
              if (d3 < 0.01D)
              {
                this.nTn.Dv(getString(2131301163, new Object[] { "0.01", bo.bc(((com.tencent.mm.plugin.luckymoney.appbrand.a.g)localObject).nRU, "") }));
                bool3 = true;
                this.nTd.onError();
                this.nTe.onError();
              }
            }
          }
        }
      this.nTg.setClickable(true);
      this.nTg.setEnabled(true);
      break label130;
      label781: this.kGm.setText((String)localObject + e.F(d4));
      AppMethodBeat.o(42087);
    }
  }

  public final int getLayoutId()
  {
    return 2130971245;
  }

  public final void initView()
  {
    AppMethodBeat.i(42077);
    setBackBtn(new WxaLuckyMoneyPrepareUI.10(this));
    this.nTf = ((LuckyMoneyTextInputView)findViewById(2131825621));
    this.nTf.setHintText(getString(2131301090));
    Object localObject = getIntent().getStringExtra("defaultWishingWord");
    ab.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initView defaultWishingWord = %s", new Object[] { localObject });
    if (!bo.isNullOrNil((String)localObject))
      this.nTf.setHintText((String)localObject);
    this.nTg = ((Button)findViewById(2131825630));
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    this.kGq = ((TextView)findViewById(2131825618));
    this.nTd = ((LuckyMoneyNumInputView)findViewById(2131825619));
    this.nTe = ((WxaLuckyMoneyMoneyInputView)findViewById(2131825617));
    this.kGm = ((TextView)findViewById(2131825629));
    this.nTk = ((MMScrollView)findViewById(2131825615));
    this.nTl = ((TextView)findViewById(2131825616));
    this.nTh = ((LinearLayout)findViewById(2131829235));
    this.nTj = ((TextView)findViewById(2131829237));
    setMMTitle(2131301208);
    if (this.nSv == h.a.nRX)
    {
      this.nTe.setTitle(getString(2131301211));
      this.nTe.setShowGroupIcon(true);
    }
    while (true)
    {
      this.nTe.setOnInputValidChangerListener(this);
      this.nTe.setHint(getString(2131301134));
      this.nTd.setOnInputValidChangerListener(this);
      this.nTd.setHint(getString(2131301150));
      this.nTd.setNum("");
      this.nTf.setOnInputValidChangerListener(this);
      bKZ();
      a(com.tencent.mm.plugin.luckymoney.appbrand.a.g.nRN);
      this.nTe.setMaxLen(12);
      bKX();
      this.nTg.setClickable(false);
      this.nTg.setEnabled(false);
      this.nTg.setOnClickListener(new WxaLuckyMoneyPrepareUI.11(this, (String)localObject));
      this.nTn.a(this.nTd);
      this.nTn.a(this.nTe);
      this.nTn.a(this.nTf);
      localObject = (TextView)findViewById(2131825639);
      this.nTn.i((TextView)localObject);
      if (this.nTk != null)
        this.nTk.setOnTouchListener(new WxaLuckyMoneyPrepareUI.12(this));
      this.nTe.setType(this.nSv);
      addIconOptionMenu(0, 2130839305, new WxaLuckyMoneyPrepareUI.13(this));
      bKY();
      AppMethodBeat.o(42077);
      return;
      this.nTe.setTitle(getString(2131301212));
      this.nTe.setShowGroupIcon(false);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42081);
    setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
    finish();
    AppMethodBeat.o(42081);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42075);
    super.onCreate(paramBundle);
    initView();
    this.nTc = new d();
    this.nTc.a(this, getIntent());
    AppMethodBeat.o(42075);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42082);
    super.onDestroy();
    this.nTn.clear();
    if (this.nTc != null)
      this.nTc.onDestroy();
    AppMethodBeat.o(42082);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(42085);
    boolean bool;
    if ((paramInt == 4) && (this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      bool = true;
      AppMethodBeat.o(42085);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(42085);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI
 * JD-Core Version:    0.6.2
 */