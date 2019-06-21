package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.api.t.a;
import com.tencent.mm.g.a.qq;
import com.tencent.mm.g.b.a.aa;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.luckymoney.model.ae;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.plugin.luckymoney.model.ah;
import com.tencent.mm.plugin.luckymoney.model.ao;
import com.tencent.mm.plugin.luckymoney.model.ar;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LuckyMoneyPrepareUI extends LuckyMoneyBaseUI
  implements g
{
  private int cKs;
  private int emC;
  private ap gGo;
  private Dialog gII;
  private TextView kGm;
  private TextView kGq;
  private EmojiInfo kZa;
  private Button leS;
  protected MyKeyboardWindow mKeyboard;
  private int mType;
  private i nSs;
  private LuckyMoneyNumInputView nTd;
  private LuckyMoneyTextInputView nTf;
  private Button nTg;
  protected View nTi;
  private MMScrollView nTk;
  private TextView nTl;
  private b nTn;
  private com.tencent.mm.plugin.luckymoney.model.d nWN;
  private int nYN;
  private LuckyMoneyMoneyInputView obC;
  private View obD;
  private View obE;
  private ViewGroup obF;
  private int obG;
  private String obH;
  private int obI;
  private boolean obJ;
  private String obK;
  private int obL;
  private String ocI;
  private a odS;
  private View odT;
  private ChatFooterPanel odY;
  private ViewGroup oea;
  private aa oec;
  private int oef;
  private int ogb;
  private String ogi;
  private String ogm;
  private long ohA;
  private String ohB;
  private com.tencent.mm.ui.widget.d ohC;
  private boolean ohD;
  private boolean ohE;
  private boolean ohF;
  private boolean ohG;
  private com.tencent.mm.sdk.b.c<qq> ohH;
  private Dialog ohk;
  private Dialog ohl;
  private RelativeLayout ohm;
  private TextView ohn;
  private ImageView oho;
  private TextView ohp;
  private int ohq;
  private String ohr;
  private String ohs;
  private RealnameGuideHelper oht;
  private String ohu;
  private com.tencent.mm.g.b.a.ab ohv;
  private int ohw;
  private String ohx;
  private int ohy;
  private long ohz;

  public LuckyMoneyPrepareUI()
  {
    AppMethodBeat.i(42993);
    this.nTd = null;
    this.obC = null;
    this.nTf = null;
    this.kGm = null;
    this.nTg = null;
    this.leS = null;
    this.gII = null;
    this.ohk = null;
    this.ohl = null;
    this.nTn = new b();
    this.gGo = null;
    this.ohq = 1;
    this.ohr = com.tencent.mm.wallet_core.ui.e.atr("CNY");
    this.ohs = null;
    this.ocI = "";
    this.ogb = 1;
    this.oef = 0;
    this.ohD = false;
    this.ohE = false;
    this.ohF = false;
    this.ohG = false;
    this.ohH = new LuckyMoneyPrepareUI.18(this);
    this.cKs = 0;
    this.ogm = "";
    AppMethodBeat.o(42993);
  }

  private void Qp(String paramString)
  {
    AppMethodBeat.i(43020);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "do business callback");
    b(new ae(this.ocI, paramString, this.ohu), false);
    AppMethodBeat.o(43020);
  }

  private void a(int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, String paramString2)
  {
    AppMethodBeat.i(43001);
    String str1 = "";
    int i = 0;
    if (this.kZa != null)
    {
      str1 = this.kZa.Aq();
      i = this.kZa.field_type;
    }
    String str2 = "";
    if (this.nWN != null)
      str2 = this.nWN.nWv;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "currency is RMB. userConfirmJump:%s lastPayResult:%s mSendId:%s mUniqueId:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.cKs), this.ocI, this.ogi });
    if ((this.obJ) && (!bo.isNullOrNil(paramString1)));
    for (paramString1 = new ao(paramInt2, paramLong1, paramLong2, this.mType, paramString2, x.bLC(), paramString1, x.mI(paramString1), r.Yz(), r.YB(), this.obG, str2, this.ogi, paramInt1, this.cKs, this.ocI, str1, i); ; paramString1 = new ao(paramInt2, paramLong1, paramLong2, this.mType, paramString2, x.bLC(), null, null, r.Yz(), r.YB(), this.obG, str2, this.ogi, paramInt1, this.cKs, this.ocI, str1, i))
    {
      b(paramString1, false);
      if (!bo.isNullOrNil(str2))
        com.tencent.mm.plugin.report.service.h.pYm.k(991L, 11L, 1L);
      bMK();
      AppMethodBeat.o(43001);
      return;
    }
  }

  private void a(atb paramatb)
  {
    AppMethodBeat.i(43003);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "update envelope");
    List localList;
    if ((this.nWN != null) && (paramatb != null) && (this.emC != 2))
    {
      this.ohm.setVisibility(0);
      if ((this.nWN.nWw) && (!bo.isNullOrNil(this.nWN.nWx)))
      {
        localList = bo.hT((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUw, ""), ",");
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.equals(this.nWN.nWu.materialId))
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.LuckyMoneyPrepareUI", "has alert illegal: %s", new Object[] { str });
            AppMethodBeat.o(43003);
          }
        }
      }
    }
    while (true)
    {
      return;
      localList.add(this.nWN.nWu.materialId);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUw, bo.c(localList, ","));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "show alert illegal: %s", new Object[] { this.nWN.nWu.materialId });
      com.tencent.mm.ui.base.h.a(this.mController.ylL, this.nWN.nWx, "", getString(2131305646), new LuckyMoneyPrepareUI.7(this));
      while (true)
      {
        if ((paramatb == null) || (bo.isNullOrNil(paramatb.wwP)))
          break label318;
        this.ohn.setText(paramatb.wwP);
        ((com.tencent.mm.plugin.luckymoney.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).a(this.oho, paramatb);
        AppMethodBeat.o(43003);
        break;
        this.ohm.setVisibility(8);
      }
      label318: this.oho.setImageBitmap(null);
      this.ohn.setText("");
      AppMethodBeat.o(43003);
    }
  }

  private void bMK()
  {
    AppMethodBeat.i(43000);
    if (this.gII != null)
    {
      this.gII.show();
      AppMethodBeat.o(43000);
    }
    while (true)
    {
      return;
      this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, true, new LuckyMoneyPrepareUI.3(this));
      AppMethodBeat.o(43000);
    }
  }

  private boolean bML()
  {
    AppMethodBeat.i(43016);
    boolean bool;
    if ((this.nSs != null) && (!bo.isNullOrNil(this.nSs.nWL)))
    {
      bool = true;
      AppMethodBeat.o(43016);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43016);
    }
  }

  private int bMh()
  {
    AppMethodBeat.i(43018);
    int i;
    if (this.obJ)
      if (getIntent().getIntExtra("key_chatroom_num", 0) > 0)
      {
        i = 2;
        AppMethodBeat.o(43018);
      }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(43018);
      continue;
      i = 3;
      AppMethodBeat.o(43018);
    }
  }

  private void c(double paramDouble, String paramString)
  {
    AppMethodBeat.i(43017);
    if (bo.isNullOrNil(paramString))
    {
      this.kGm.setText(com.tencent.mm.wallet_core.ui.e.G(paramDouble));
      AppMethodBeat.o(43017);
    }
    while (true)
    {
      return;
      this.kGm.setText(paramString + com.tencent.mm.wallet_core.ui.e.F(paramDouble));
      AppMethodBeat.o(43017);
    }
  }

  private void e(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(43010);
    String str1 = getIntent().getStringExtra("key_username");
    String str2 = r.Yz();
    if (paramInt == -1)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode == RESULT_OK");
      this.cKs = 1;
      this.ogm = "";
      paramIntent = new com.tencent.mm.plugin.luckymoney.model.al(this.ocI, this.ogi, 1, str2, bo.nullAsNil(str1));
      com.tencent.mm.kernel.g.RO().eJo.a(paramIntent, 0);
      AppMethodBeat.o(43010);
      return;
    }
    if (paramIntent != null);
    for (this.cKs = paramIntent.getIntExtra("key_pay_reslut_type", 3); ; this.cKs = 3)
    {
      this.ogm = this.ocI;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", new Object[] { Integer.valueOf(this.cKs) });
      paramIntent = new com.tencent.mm.plugin.luckymoney.model.al(this.ocI, this.ogi, this.cKs, str2, bo.nullAsNil(str1));
      break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "doNetSceneLuckyMoneyReport() data == null");
    }
  }

  private void eX(String paramString1, String paramString2)
  {
    AppMethodBeat.i(43009);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "initH5LuckyMoneyView  currencyWording=".concat(String.valueOf(paramString1)));
    TextView localTextView = (TextView)findViewById(2131825537);
    if (!bo.isNullOrNil(paramString1))
    {
      localTextView.setText(paramString1);
      if (bo.isNullOrNil(paramString2))
        break label78;
      c(0.0D, paramString2);
      AppMethodBeat.o(43009);
    }
    while (true)
    {
      return;
      localTextView.setText(getString(2131301078));
      break;
      label78: c(0.0D, com.tencent.mm.wallet_core.ui.e.atr("CNY"));
      AppMethodBeat.o(43009);
    }
  }

  private void iN(boolean paramBoolean)
  {
    AppMethodBeat.i(43005);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "do get config");
    if (paramBoolean)
      this.ohk = x.er(this.mController.ylL);
    this.ohE = true;
    b(new ag("v1.0", ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUv, Integer.valueOf(0))).intValue(), (byte)0), false);
    AppMethodBeat.o(43005);
  }

  private void init()
  {
    AppMethodBeat.i(43002);
    if (this.ohq == 1)
    {
      addIconOptionMenu(0, 2130839555, new LuckyMoneyPrepareUI.4(this));
      AppMethodBeat.o(43002);
    }
    while (true)
    {
      return;
      addIconOptionMenu(0, 2130839305, new LuckyMoneyPrepareUI.5(this));
      AppMethodBeat.o(43002);
    }
  }

  private void yj(int paramInt)
  {
    AppMethodBeat.i(42999);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "doPrePareBtnClick() userConfirmJump:%s", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(4) });
    com.tencent.mm.plugin.report.service.h.pYm.e(15511, new Object[] { Integer.valueOf(this.ohq), Integer.valueOf(2) });
    if (this.obC.bKW() != 0)
    {
      t.makeText(this.mController.ylL, 2131304579, 0).show();
      AppMethodBeat.o(42999);
    }
    int i;
    long l1;
    long l2;
    label193: String str;
    while (true)
    {
      return;
      i = this.nTd.getInput();
      double d = this.obC.getInput();
      l1 = 0L;
      if (this.mType == 1)
      {
        l2 = com.tencent.mm.wallet_core.ui.e.H(d);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(356354, Integer.valueOf(i));
        str = this.nTf.getInput().replace("\r", "").replace("\n", "");
        localObject = str;
        if (bo.isNullOrNil(str))
          if (!bo.isNullOrNil(this.ohs))
            break label335;
      }
      label335: for (localObject = getString(2131301090); ; localObject = this.ohs)
      {
        aoB();
        if (this.emC != 2)
          break label344;
        b(new com.tencent.mm.plugin.luckymoney.f2f.a.d(i, (int)l2, this.mType, (int)l1), false);
        bMK();
        AppMethodBeat.o(42999);
        break;
        l2 = com.tencent.mm.wallet_core.ui.e.H(i * d);
        l1 = com.tencent.mm.wallet_core.ui.e.H(d);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(356353, Integer.valueOf(i));
        break label193;
      }
      label344: str = getIntent().getStringExtra("key_username");
      if (this.ohq != 1)
        break label551;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "doPrePareBtnClick() ifGetConfig=%s mUniqueId=%s waitingGetConfig=%s ifAutoRMBPrePareBtn=%s", new Object[] { Boolean.valueOf(this.ohD), bo.nullAsNil(this.ogi), Boolean.valueOf(this.ohE), Boolean.valueOf(this.ohF) });
      if (!this.ohD)
        break;
      a(paramInt, str, i, l2, l1, (String)localObject);
      AppMethodBeat.o(42999);
    }
    this.ohF = true;
    this.ohw = paramInt;
    this.ohx = str;
    this.ohy = i;
    this.ohz = l2;
    this.ohA = l1;
    this.ohB = ((String)localObject);
    if (this.ohl != null)
      this.ohl.show();
    while (true)
    {
      if (!this.ohE)
        iN(false);
      AppMethodBeat.o(42999);
      break;
      this.ohl = com.tencent.mm.ui.base.h.a(this, 3, 2131493296, getString(2131300968), true, new LuckyMoneyPrepareUI.2(this));
    }
    label551: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "currency=%s userConfiremJump:%s", new Object[] { Integer.valueOf(this.ohq), Integer.valueOf(paramInt) });
    nf(1647);
    if ((this.obJ) && (!bo.isNullOrNil(str)));
    for (Object localObject = new ah(i, l2, l1, this.mType, (String)localObject, str, x.bLC(), r.Yz(), this.ohq); ; localObject = new ah(i, l2, l1, this.mType, (String)localObject, null, x.bLC(), r.Yz(), this.ohq))
    {
      b((m)localObject, false);
      break;
    }
  }

  private void z(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(43008);
    this.nTf.z(paramEmojiInfo);
    if ((this.oef == 0) || (this.oef == 2))
      if (com.tencent.mm.plugin.emoji.h.b.x(paramEmojiInfo))
        this.ogb = 2;
    while (true)
    {
      this.oec = new aa();
      this.oec.cVT = 1L;
      this.oec.ajK();
      AppMethodBeat.o(43008);
      return;
      if (com.tencent.mm.plugin.emoji.h.b.w(paramEmojiInfo))
      {
        this.ogb = 4;
      }
      else
      {
        this.ogb = 3;
        continue;
        if (this.oef == 1)
          this.ogb = 2;
      }
    }
  }

  protected final void V(View paramView, int paramInt)
  {
    AppMethodBeat.i(43012);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    EditText localEditText = (EditText)paramView.findViewById(2131825536);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nTi == null))
      AppMethodBeat.o(43012);
    while (true)
    {
      return;
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
      localEditText.setOnFocusChangeListener(new LuckyMoneyPrepareUI.34(this, paramInt, localEditText));
      localEditText.setOnClickListener(new LuckyMoneyPrepareUI.35(this, paramInt, localEditText));
      TextView localTextView = (TextView)paramView.findViewById(2131825537);
      if (localTextView != null)
        localTextView.setOnClickListener(new LuckyMoneyPrepareUI.36(this, localEditText, paramView, paramInt));
      localView.setOnClickListener(new LuckyMoneyPrepareUI.37(this));
      AppMethodBeat.o(43012);
    }
  }

  protected final void aoB()
  {
    AppMethodBeat.i(43014);
    if ((this.nTi != null) && (this.nTi.isShown()))
      this.nTi.setVisibility(8);
    AppMethodBeat.o(43014);
  }

  public final void bLa()
  {
    AppMethodBeat.i(43015);
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
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "has error");
        this.nTg.setClickable(false);
        this.nTg.setEnabled(false);
        c(d1, this.ohr);
        AppMethodBeat.o(43015);
        return;
        if (i > 0)
          d2 = this.obC.getInput() / i;
      }
      else
      {
        boolean bool1;
        if ((d1 == 0.0D) || (d2 == 0.0D))
          bool1 = true;
        while (true)
        {
          label408: boolean bool2;
          if (bool1)
          {
            this.nTg.setClickable(false);
            this.nTg.setEnabled(false);
            break;
            if ((d1 > this.nSs.nRR) && (this.nSs.nRR > 0.0D))
            {
              this.nTn.Dv(getString(2131301210, new Object[] { Math.round(this.nSs.nRR), bo.bc(this.nSs.nRU, "") }));
              bool1 = true;
              continue;
            }
            if (d2 <= 0.0D)
              break label1034;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "perAmount ".concat(String.valueOf(d2)));
            if (this.mType == 0)
            {
              if ((d2 <= this.nSs.nRP) || (this.nSs.nRP <= 0.0D))
                break label1028;
              if (bML())
              {
                this.nTn.Dv(getString(2131301162, new Object[] { this.nSs.nWL, Math.round(this.nSs.nRP), bo.bc(this.nSs.nRU, "") }));
                bool2 = true;
              }
            }
          }
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool2 + " for max value");
            bool1 = bool2;
            if (!bool2)
            {
              if (this.mType != 0)
                break label878;
              bool1 = bool2;
              if (d2 < this.nSs.nRQ)
              {
                if (!bML())
                  break label829;
                this.nTn.Dv(getString(2131301164, new Object[] { this.nSs.nWL, com.tencent.mm.wallet_core.ui.e.F(this.nSs.nRQ), bo.bc(this.nSs.nRU, "") }));
                label536: bool1 = true;
              }
            }
            label829: label878: 
            do
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool1 + " for min value");
              break;
              this.nTn.Dv(getString(2131301161, new Object[] { Math.round(this.nSs.nRP), bo.bc(this.nSs.nRU, "") }));
              break label408;
              if ((d2 <= this.nSs.nRS) || (this.nSs.nRS <= 0.0D))
                break label1028;
              if ((this.nSs != null) && (!bo.isNullOrNil(this.nSs.nWL)))
                this.nTn.Dv(getString(2131301162, new Object[] { this.nSs.nWL, Math.round(this.nSs.nRS), bo.bc(this.nSs.nRU, "") }));
              while (true)
              {
                this.nTd.onError();
                this.obC.onError();
                bool2 = true;
                break;
                this.nTn.Dv(getString(2131301161, new Object[] { Math.round(this.nSs.nRS), bo.bc(this.nSs.nRU, "") }));
              }
              this.nTn.Dv(getString(2131301163, new Object[] { com.tencent.mm.wallet_core.ui.e.F(this.nSs.nRQ), bo.bc(this.nSs.nRU, "") }));
              break label536;
              bool1 = bool2;
            }
            while (d2 >= 0.01D);
            if (bML())
              this.nTn.Dv(getString(2131301164, new Object[] { this.nSs.nWL, "0.01", bo.bc(this.nSs.nRU, "") }));
            while (true)
            {
              this.nTd.onError();
              this.obC.onError();
              bool1 = true;
              break;
              this.nTn.Dv(getString(2131301163, new Object[] { "0.01", bo.bc(this.nSs.nRU, "") }));
            }
            this.nTg.setClickable(true);
            this.nTg.setEnabled(true);
            break;
            label1028: bool2 = false;
          }
          label1034: bool1 = false;
        }
        d2 = 0.0D;
        continue;
        d2 = 0.0D;
        d1 = 0.0D;
      }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43007);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " scenetype:" + paramm.getType());
    boolean bool;
    if ((paramm instanceof ao))
    {
      if ((this.gII != null) && (this.gII.isShowing()))
        this.gII.dismiss();
      if (this.ohG)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "has show alert return");
        bool = true;
        AppMethodBeat.o(43007);
      }
    }
    while (true)
    {
      return bool;
      ao localao = (ao)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.obI = localao.kCd;
        this.obH = localao.nSX;
        this.obK = localao.nYY;
        this.ocI = localao.nSX;
        this.ohu = localao.nZe;
        if (((ao)paramm).bLD())
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() NetScenePrepareLuckyMoney show JumpRemind Alert");
          ((ao)paramm).nYe.a(this, new LuckyMoneyPrepareUI.19(this));
          bool = true;
          AppMethodBeat.o(43007);
        }
        else
        {
          paramString = new PayInfo();
          paramString.czZ = localao.nYX;
          paramString.cIf = 37;
          paramString.cIb = this.obL;
          com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 1);
          bool = true;
          AppMethodBeat.o(43007);
        }
      }
      else if (paramInt2 == 401)
      {
        this.nTg.setEnabled(false);
        this.nTg.setClickable(false);
        this.gGo.ae(5000L, 5000L);
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        bool = true;
        AppMethodBeat.o(43007);
      }
      else if (paramInt2 == 268502454)
      {
        com.tencent.mm.ui.base.h.a(this, paramString, "", new LuckyMoneyPrepareUI.20(this, paramm));
        bool = true;
        AppMethodBeat.o(43007);
      }
      else
      {
        this.cKs = 2;
        paramm = paramString;
        if (TextUtils.isEmpty(paramString))
          paramm = getString(2131305389);
        com.tencent.mm.ui.base.h.a(this, paramm, null, false, new LuckyMoneyPrepareUI.17(this));
        bool = true;
        AppMethodBeat.o(43007);
        continue;
        if ((paramm instanceof ar))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if (this.obJ)
            {
              com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
              com.tencent.mm.sdk.platformtools.al.n(new LuckyMoneyPrepareUI.21(this), 1800L);
            }
            while (true)
            {
              bool = true;
              AppMethodBeat.o(43007);
              break;
              bMq();
              this.obE.setVisibility(0);
              this.obE.postDelayed(new LuckyMoneyPrepareUI.23(this), 1000L);
            }
          }
          if (paramInt2 == 402)
          {
            com.tencent.mm.ui.base.h.d(this.mController.ylL, paramString, "", getString(2131301191), getString(2131296868), new LuckyMoneyPrepareUI.24(this), new LuckyMoneyPrepareUI.25(this));
            bool = true;
            AppMethodBeat.o(43007);
          }
        }
        else
        {
          if ((paramm instanceof ag))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig resp,errType=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString);
            if ((this.ohk != null) && (this.ohk.isShowing()))
              this.ohk.dismiss();
            if ((this.ohl != null) && (this.ohl.isShowing()))
              this.ohl.dismiss();
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              paramString = (ag)paramm;
              this.ohD = true;
              this.nYN = paramString.nYN;
              if (!bo.gW(paramString.nYO, 1))
              {
                this.nTf.iO(true);
                label728: com.tencent.mm.plugin.luckymoney.b.a.bKN();
                this.nSs = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLu();
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.nSs);
                if (this.mType != 1)
                  break label1361;
                this.obC.setMaxAmount(this.nSs.nRR);
                label789: this.obC.setMinAmount(this.nSs.nRQ);
                this.nTd.setMaxNum(this.nSs.nRO);
                this.ohr = paramString.nRT;
                this.ohq = paramString.kCv;
                this.ohs = paramString.nSd;
                if (bo.isNullOrNil(this.ogi))
                  this.ogi = paramString.few;
                if ((!bo.isNullOrNil(this.ohs)) && (this.nTf != null))
                  com.tencent.mm.sdk.platformtools.al.d(new LuckyMoneyPrepareUI.27(this));
                if ((paramString.nYE) && (this.obJ))
                {
                  paramm = (TextView)findViewById(2131825631);
                  paramm.setOnClickListener(new LuckyMoneyPrepareUI.28(this));
                  com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(8) });
                  paramm.setVisibility(8);
                }
                if (bo.isNullOrNil(paramString.kCx))
                  break label1378;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.kCx);
                this.nTl.setText(paramString.kCx);
                if (!bo.isNullOrNil(paramString.nYG))
                  this.nTl.setOnClickListener(new LuckyMoneyPrepareUI.29(this, paramString));
                this.nTl.setVisibility(0);
                label1065: paramm = new h.c();
                if ((paramString.nYI == null) || (bo.isNullOrNil(paramString.nYI.content)))
                  break label1390;
                paramm.textColor = getResources().getColor(2131690631);
                label1109: this.obF.removeAllViews();
                h.a(this, this.obF, paramString.nYI, paramm);
                eX(paramString.nRU, paramString.nRT);
                c(this.obC.getInput(), this.ohr);
                com.tencent.mm.plugin.luckymoney.b.a.bKN();
                this.nWN = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLv();
                init();
                if (this.nWN == null)
                  break label1408;
                a(this.nWN.nWu);
                com.tencent.mm.plugin.report.service.h.pYm.k(991L, 10L, 1L);
                label1206: if (this.ohF)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "doRMBPrePareBtnClick()");
                  a(this.ohw, this.ohx, this.ohy, this.ohz, this.ohA, this.ohB);
                }
              }
            }
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig waitingGetConfig:%s ifAutoRMBPrePareBtn:%s", new Object[] { Boolean.valueOf(this.ohE), Boolean.valueOf(this.ohF) });
              this.ohE = false;
              this.ohF = false;
              bool = true;
              AppMethodBeat.o(43007);
              break;
              this.nTf.iO(false);
              if ((this.kZa != null) && (!bo.isNullOrNil(this.kZa.Aq())))
                this.nTf.z(this.kZa);
              this.nTf.setmOnEmojiSelectClickListener(new LuckyMoneyPrepareUI.26(this, paramString));
              break label728;
              label1361: this.obC.setMaxAmount(this.nSs.nRP);
              break label789;
              label1378: this.nTl.setVisibility(8);
              break label1065;
              label1390: paramm.textColor = getResources().getColor(2131690155);
              break label1109;
              label1408: a(null);
              break label1206;
              if (this.ohF)
              {
                paramm = paramString;
                if (bo.isNullOrNil(paramString))
                  paramm = getString(2131296906);
                t.makeText(this, paramm, 0).show();
              }
            }
          }
          if ((paramm instanceof ah))
          {
            ng(1647);
            if ((this.gII != null) && (this.gII.isShowing()))
              this.gII.hide();
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              paramm = ((ah)paramm).kCI;
              if (!bo.isNullOrNil(paramm))
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "payUrl is not null");
                paramString = new Intent();
                paramString.putExtra("rawUrl", paramm);
                paramString.putExtra("showShare", false);
                com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramString, 3);
              }
              while (true)
              {
                bool = true;
                AppMethodBeat.o(43007);
                break;
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "payUrl is null");
              }
            }
          }
          else
          {
            if ((paramm instanceof com.tencent.mm.plugin.luckymoney.f2f.a.d))
            {
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                if (this.gII != null)
                  this.gII.dismiss();
                this.ocI = ((com.tencent.mm.plugin.luckymoney.f2f.a.d)paramm).nSX;
                this.ohu = ((com.tencent.mm.plugin.luckymoney.f2f.a.d)paramm).nUo;
                paramString = new PayInfo();
                paramString.czZ = ((com.tencent.mm.plugin.luckymoney.f2f.a.d)paramm).czZ;
                paramString.cIf = 37;
                ad.o(37, paramString.czZ, paramInt2);
                com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 4);
              }
              while (true)
              {
                bool = true;
                AppMethodBeat.o(43007);
                break;
                ad.o(37, "", paramInt2);
                if (!bo.isNullOrNil(paramString))
                  com.tencent.mm.ui.base.h.b(this, paramString, getString(2131301080), true);
                this.gII.dismiss();
              }
            }
            if ((paramm instanceof com.tencent.mm.plugin.luckymoney.model.al))
            {
              bool = true;
              AppMethodBeat.o(43007);
              continue;
            }
          }
          bool = false;
          AppMethodBeat.o(43007);
        }
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43006);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (this.obD.getVisibility() == 0))
    {
      this.obD.setVisibility(8);
      bMp();
      bool = true;
      AppMethodBeat.o(43006);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(43006);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(43019);
    if (this.oht != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_realname_guide_helper", this.oht);
      com.tencent.mm.bp.d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", localIntent);
    }
    super.finish();
    AppMethodBeat.o(43019);
  }

  public final int getLayoutId()
  {
    return 2130969994;
  }

  public final void initView()
  {
    AppMethodBeat.i(42997);
    setBackBtn(new LuckyMoneyPrepareUI.1(this));
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
    this.nTk = ((MMScrollView)findViewById(2131825615));
    this.nTl = ((TextView)findViewById(2131825616));
    this.ohm = ((RelativeLayout)findViewById(2131825622));
    this.ohn = ((TextView)findViewById(2131825628));
    this.oho = ((ImageView)findViewById(2131825624));
    this.ohp = ((TextView)findViewById(2131825626));
    this.odS = new a(this);
    this.odT = getLayoutInflater().inflate(2130969978, null);
    this.odS.setContentView(this.odT, new ViewGroup.LayoutParams(-1, -1));
    this.odT.findViewById(2131825497).setOnClickListener(new LuckyMoneyPrepareUI.12(this));
    this.odS.obT = new LuckyMoneyPrepareUI.22(this);
    this.oea = ((ViewGroup)this.odT.findViewById(2131825499));
    this.odY = com.tencent.mm.pluginsdk.ui.chat.e.vom.dF(this.mController.ylL);
    com.tencent.mm.plugin.luckymoney.ui.a.a.a(this.odY);
    Object localObject1;
    Object localObject2;
    label504: Object localObject3;
    label798: label873: label1014: int i;
    if (this.mType == 1)
    {
      setMMTitle(2131301118);
      this.obC.setTitle(getString(2131301211));
      this.obC.setShowGroupIcon(true);
      localObject1 = new LinearLayout.LayoutParams(-1, -1);
      localObject2 = new LinearLayout.LayoutParams(-1, com.tencent.mm.bz.a.al(this, 2131428500));
      if (this.mType != 1)
        break label1275;
      ((LinearLayout.LayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 13);
      ((LinearLayout.LayoutParams)localObject2).topMargin = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 13);
      this.nTf.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.ohm.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.obC.setOnInputValidChangerListener(this);
      this.obC.setHint(getString(2131301134));
      this.nTd.setOnInputValidChangerListener(this);
      this.nTd.setHint(getString(2131301150));
      this.nTf.setOnInputValidChangerListener(this);
      localObject2 = (EditText)this.obC.findViewById(2131825536);
      localObject3 = (EditText)this.nTd.findViewById(2131825536);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).addTextChangedListener(new LuckyMoneyPrepareUI.10(this, (EditText)localObject2));
      ((EditText)localObject3).addTextChangedListener(new LuckyMoneyPrepareUI.11(this, (EditText)localObject3));
      ((EditText)localObject2).setOnClickListener(new LuckyMoneyPrepareUI.13(this, (EditText)localObject2, (EditText)localObject3));
      ((EditText)localObject2).requestFocus();
      localObject1 = (TextView)this.obC.findViewById(2131825537);
      if (localObject1 != null)
        ((TextView)localObject1).setOnClickListener(new LuckyMoneyPrepareUI.14(this, (EditText)localObject2, (EditText)localObject3));
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject3);
      ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).showSoftInput((View)localObject3, 0);
      ((EditText)localObject3).setOnClickListener(new LuckyMoneyPrepareUI.15(this, (EditText)localObject2, (EditText)localObject3));
      ((MMEditText)this.nTf.findViewById(2131825665)).setOnFocusChangeListener(new LuckyMoneyPrepareUI.16(this, (EditText)localObject2, (EditText)localObject3));
      if (this.nSs != null)
      {
        if (this.mType != 1)
          break label1310;
        this.obC.setMaxAmount(this.nSs.nRR);
        this.obC.setMinAmount(this.nSs.nRQ);
        if (this.nSs.kCv != 1)
          eX(this.nSs.nRU, this.nSs.nRT);
      }
      if ((!this.obJ) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1))
        break label1327;
      this.nTd.setNum("1");
      this.nTd.setMaxNum(this.nSs.nRO);
      this.nTd.setMinNum(1);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.nTd.getInput());
      this.obC.setMaxLen(12);
      if (bML())
        this.nTg.setText(getString(2131301171, new Object[] { this.nSs.nWL }));
      if ((!this.obJ) && (this.emC != 2))
        break label1772;
      if (!bML())
        break label1339;
      setMMTitle(getString(2131301209, new Object[] { this.nSs.nWL }));
      i = getIntent().getIntExtra("key_chatroom_num", 0);
      if ((!this.obJ) || (i != 0))
        break label1349;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "single hb");
      this.nTd.setVisibility(8);
    }
    while (true)
    {
      this.nTg.setOnClickListener(new LuckyMoneyPrepareUI.40(this));
      this.nTn.a(this.nTd);
      this.nTn.a(this.obC);
      this.nTn.a(this.nTf);
      localObject2 = (TextView)findViewById(2131825639);
      this.nTn.i((TextView)localObject2);
      this.gGo = new ap(new LuckyMoneyPrepareUI.41(this), false);
      if (this.nTk != null)
        this.nTk.setOnTouchListener(new LuckyMoneyPrepareUI.42(this));
      this.obC.setType(this.mType);
      init();
      this.ohm.setOnClickListener(new LuckyMoneyPrepareUI.6(this));
      if (com.tencent.mm.x.c.PK().a(ac.a.xUs, ac.a.xUu))
        this.ohp.setVisibility(0);
      if (this.nWN != null)
        a(this.nWN.nWu);
      AppMethodBeat.o(42997);
      return;
      setMMTitle(2131301148);
      this.obC.setTitle(getString(2131301212));
      this.obC.setShowGroupIcon(false);
      break;
      label1275: ((LinearLayout.LayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 16);
      ((LinearLayout.LayoutParams)localObject2).topMargin = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 16);
      break label504;
      label1310: this.obC.setMaxAmount(this.nSs.nRP);
      break label798;
      label1327: this.nTd.setNum("");
      break label873;
      label1339: setMMTitle(2131301208);
      break label1014;
      label1349: localObject1 = getString(2131301106);
      Object localObject4 = getString(2131301121);
      localObject2 = getString(2131301100);
      localObject3 = getString(2131301122);
      Object localObject5;
      if ((this.obJ) && (i > 0))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "group hb,%d people", new Object[] { Integer.valueOf(i) });
        localObject1 = getString(2131301124);
        localObject2 = getString(2131301123);
        localObject5 = (TextView)findViewById(2131825620);
        ((TextView)localObject5).setText(getString(2131301149, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject5).setVisibility(0);
      }
      while (true)
      {
        localObject5 = new com.tencent.mm.plugin.wallet_core.ui.j(this);
        ((com.tencent.mm.plugin.wallet_core.ui.j)localObject5).mColor = getResources().getColor(2131690253);
        SpannableString localSpannableString = new SpannableString((String)localObject1 + (String)localObject4);
        localSpannableString.setSpan(localObject5, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject4).length(), 33);
        localObject4 = new SpannableString((String)localObject2 + (String)localObject3);
        localObject1 = new com.tencent.mm.plugin.wallet_core.ui.j(this);
        ((com.tencent.mm.plugin.wallet_core.ui.j)localObject1).mColor = getResources().getColor(2131690253);
        ((SpannableString)localObject4).setSpan(localObject1, ((String)localObject2).length(), ((String)localObject2).length() + ((String)localObject3).length(), 33);
        this.obC.setGroupIconIv(2130839303);
        ((com.tencent.mm.plugin.wallet_core.ui.j)localObject5).tHw = new LuckyMoneyPrepareUI.33(this, (SpannableString)localObject4);
        ((com.tencent.mm.plugin.wallet_core.ui.j)localObject1).tHw = new LuckyMoneyPrepareUI.38(this, localSpannableString);
        this.kGq.setMovementMethod(LinkMovementMethod.getInstance());
        if (a.a.dzk().dzj())
          this.kGq.setOnClickListener(new LuckyMoneyPrepareUI.39(this, localSpannableString, (com.tencent.mm.plugin.wallet_core.ui.j)localObject5, (com.tencent.mm.plugin.wallet_core.ui.j)localObject1));
        this.kGq.setTextColor(getResources().getColor(2131689764));
        this.kGq.setText(localSpannableString);
        this.kGq.setVisibility(0);
        break;
        if (this.emC == 2)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "f2f hb");
          this.nTf.setVisibility(8);
        }
      }
      label1772: if (this.mType == 1)
      {
        this.kGq.setText(this.nSs.nWH);
        this.kGq.setVisibility(0);
      }
      else if (this.mType == 0)
      {
        this.kGq.setText(this.nSs.nWI);
        this.kGq.setVisibility(0);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43011);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 1111:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(43011);
      Object localObject1;
      Object localObject2;
      while (true)
      {
        return;
        if ((paramIntent != null) && (paramIntent.hasExtra("key_realname_guide_helper")))
          this.oht = ((RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper"));
        if (paramInt2 == -1)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(5) });
          localObject1 = getIntent().getStringExtra("key_username");
          if ((this.obJ) && (!bo.isNullOrNil((String)localObject1)))
          {
            localObject2 = br.z(this.obK, "msg");
            if (localObject2 == null)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
              finish();
              AppMethodBeat.o(43011);
            }
            else
            {
              localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
              if (com.tencent.mm.plugin.luckymoney.b.a.bKN().bKQ().Qh((String)localObject2))
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                if (!x.E(this.obK, (String)localObject1, 1))
                {
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                  com.tencent.mm.plugin.luckymoney.b.a.bKN().bKQ().Qi((String)localObject2);
                }
                label296: e(paramInt2, paramIntent);
                this.ohv = new com.tencent.mm.g.b.a.ab();
                this.ohv.cYk = this.ogb;
                localObject2 = this.ohv;
                if (this.kZa != null)
                  break label399;
                localObject1 = "";
                label342: ((com.tencent.mm.g.b.a.ab)localObject2).eW((String)localObject1);
                this.ohv.ajK();
                finish();
              }
            }
          }
          else
          {
            while (true)
            {
              localObject1 = "";
              if (paramIntent != null)
                localObject1 = paramIntent.getStringExtra("key_trans_id");
              Qp((String)localObject1);
              break;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
              break label296;
              label399: localObject1 = this.kZa.Aq();
              break label342;
              bMq();
              localObject1 = findViewById(2131825634);
              this.obD.setVisibility(0);
              x.a((View)localObject1, null);
              this.leS.setOnClickListener(new LuckyMoneyPrepareUI.31(this));
              ((ImageView)findViewById(2131825636)).setOnClickListener(new LuckyMoneyPrepareUI.32(this));
              e(paramInt2, paramIntent);
            }
          }
        }
        else if (com.tencent.mm.plugin.wallet_core.utils.c.aw(paramIntent))
        {
          finish();
          AppMethodBeat.o(43011);
        }
        else
        {
          if (!com.tencent.mm.plugin.wallet_core.utils.c.ax(paramIntent))
            break label519;
          AppMethodBeat.o(43011);
        }
      }
      label519: e(paramInt2, paramIntent);
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
        continue;
        if ((paramIntent != null) && (paramIntent.hasExtra("result_data")))
        {
          localObject1 = paramIntent.getBundleExtra("result_data");
          if (localObject1 != null)
          {
            int i = bo.getInt(((Bundle)localObject1).getString("payState", "2"), 0);
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + i + ";STATE_H5_PAY_SUCC=0");
            if (i == 0)
              finish();
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
            continue;
            if (paramInt2 == -1)
            {
              localObject1 = "";
              if (paramIntent != null)
                localObject1 = paramIntent.getStringExtra("key_trans_id");
              Qp((String)localObject1);
            }
            finish();
            continue;
            if (paramInt2 == -1)
            {
              this.obF.removeAllViews();
              iN(true);
              if (paramIntent != null)
              {
                localObject2 = paramIntent.getByteArrayExtra(e.f.yfX);
                if (localObject2 != null)
                {
                  localObject1 = new atb();
                  try
                  {
                    ((atb)localObject1).parseFrom((byte[])localObject2);
                    a((atb)localObject1);
                  }
                  catch (IOException localIOException)
                  {
                    com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.LuckyMoneyPrepareUI", localIOException, "", new Object[0]);
                  }
                }
              }
            }
            else
            {
              iN(false);
              com.tencent.mm.plugin.report.service.h.pYm.e(16822, new Object[] { Integer.valueOf(2) });
              continue;
              if (paramInt2 == -1)
              {
                String str = "";
                if (paramIntent != null)
                  str = paramIntent.getStringExtra("gif_md5");
                if (!bo.isNullOrNil(str))
                {
                  this.kZa = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(str);
                  z(this.kZa);
                }
                else
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "md5 == null go emoji capture failed!");
                }
              }
              else
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "go emoji capture failed!");
              }
            }
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42998);
    finish();
    AppMethodBeat.o(42998);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42994);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690242));
    Nc(-16777216);
    dyb();
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.obG = getIntent().getIntExtra("key_way", 3);
    this.emC = getIntent().getIntExtra("key_from", 0);
    if (this.emC == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.obJ = bool;
      this.obL = getIntent().getIntExtra("pay_channel", -1);
      iN(false);
      com.tencent.mm.plugin.luckymoney.b.a.bKN();
      this.nSs = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLu();
      com.tencent.mm.plugin.luckymoney.b.a.bKN();
      this.nWN = com.tencent.mm.plugin.luckymoney.b.a.bKO().bLv();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "mInWay:" + this.obG + "mChannel:" + this.obL);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.obJ + ", config " + this.nSs);
      initView();
      com.tencent.mm.sdk.b.a.xxA.b(this.ohH);
      com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bMh()), Integer.valueOf(1) });
      AppMethodBeat.o(42994);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43004);
    super.onDestroy();
    this.nTn.clear();
    this.gGo.doT();
    if ((this.gII != null) && (this.gII.isShowing()))
      this.gII.dismiss();
    if (this.odY != null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyPrepareUI", "commentfooter release");
      this.odY.onPause();
      this.odY.AC();
      this.odY.destroy();
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.ohH);
    AppMethodBeat.o(43004);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43013);
    boolean bool;
    if ((paramInt == 4) && (this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      bool = true;
      AppMethodBeat.o(43013);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(43013);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(42995);
    super.onResume();
    nf(1970);
    AppMethodBeat.o(42995);
  }

  public void onStop()
  {
    AppMethodBeat.i(42996);
    super.onStop();
    ng(1970);
    AppMethodBeat.o(42996);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI
 * JD-Core Version:    0.6.2
 */