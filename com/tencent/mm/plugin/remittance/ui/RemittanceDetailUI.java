package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.g.a.od;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.a;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.b;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.d;
import com.tencent.mm.plugin.remittance.model.u;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class RemittanceDetailUI extends WalletBaseUI
{
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private n.d lCi;
  private View.OnTouchListener mlU;
  private View.OnLongClickListener mlV;
  protected TextView ocV;
  private int pRA;
  protected String pRG;
  private LinearLayout pRn;
  private String pRz;
  protected TextView pUA;
  protected TextView pUB;
  protected TextView pUC;
  protected Button pUD;
  protected LinearLayout pUE;
  private LinearLayout pUF;
  private LinearLayout pUG;
  private LinearLayout pUH;
  private TextView pUI;
  private TextView pUJ;
  private TextView pUK;
  private TextView pUL;
  private TextView pUM;
  protected RelativeLayout pUN;
  protected ImageView pUO;
  protected TextView pUP;
  protected TextView pUQ;
  protected ImageView pUR;
  protected Button pUS;
  protected TextView pUT;
  protected View pUU;
  protected View pUV;
  protected View pUW;
  protected Button pUX;
  protected TextView pUY;
  protected LinearLayout pUZ;
  protected ImageView pUy;
  protected TextView pUz;
  private LinearLayout pVa;
  private LinearLayout pVb;
  private LinearLayout pVc;
  private LinearLayout pVd;
  private TextView pVe;
  private TextView pVf;
  private TextView pVg;
  private TextView pVh;
  private TextView pVi;
  protected int pVj;
  protected int pVk;
  public String pVl;
  public String pVm;
  protected String pVn;
  protected int pVo;
  protected boolean pVp;
  protected int pVq;
  private int pVr;
  private u pVs;
  private c<od> pVt;
  private c<oc> pVu;
  private int pVv;
  private String pcA;
  private String pcH;

  public RemittanceDetailUI()
  {
    AppMethodBeat.i(45027);
    this.pUy = null;
    this.pUz = null;
    this.pUA = null;
    this.pUB = null;
    this.pUC = null;
    this.pUD = null;
    this.ocV = null;
    this.pUX = null;
    this.pUY = null;
    this.pVl = null;
    this.pVm = null;
    this.pRG = null;
    this.pVn = null;
    this.pRz = null;
    this.pVo = 3;
    this.pVp = false;
    this.pVt = new RemittanceDetailUI.1(this);
    this.pVu = new RemittanceDetailUI.12(this);
    this.jMO = null;
    this.pVv = 0;
    this.lCi = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(45006);
        ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
        paramAnonymousMenuItem = "";
        if (bo.gW(RemittanceDetailUI.n(RemittanceDetailUI.this), 2131827031))
          paramAnonymousMenuItem = RemittanceDetailUI.o(RemittanceDetailUI.this).getText().toString().trim();
        do
          while (true)
          {
            localClipboardManager.setPrimaryClip(ClipData.newPlainText(null, paramAnonymousMenuItem));
            com.tencent.mm.ui.base.h.bQ(RemittanceDetailUI.this, RemittanceDetailUI.this.getString(2131296876));
            AppMethodBeat.o(45006);
            return;
            if (bo.gW(RemittanceDetailUI.n(RemittanceDetailUI.this), 2131827034))
            {
              paramAnonymousMenuItem = new StringBuilder();
              paramAnonymousMenuItem.append(RemittanceDetailUI.p(RemittanceDetailUI.this).getText().toString().trim() + " ");
              str = RemittanceDetailUI.l(RemittanceDetailUI.this).getText().toString().trim();
              if (str.endsWith(RemittanceDetailUI.this.getString(2131296805)))
                paramAnonymousMenuItem.append(str.substring(0, str.length() - 4));
              while (true)
              {
                paramAnonymousMenuItem = paramAnonymousMenuItem.toString();
                break;
                paramAnonymousMenuItem.append(str);
              }
            }
            if (!bo.gW(RemittanceDetailUI.n(RemittanceDetailUI.this), 2131827049))
              break;
            paramAnonymousMenuItem = RemittanceDetailUI.q(RemittanceDetailUI.this).getText().toString().trim();
          }
        while (!bo.gW(RemittanceDetailUI.n(RemittanceDetailUI.this), 2131827052));
        paramAnonymousMenuItem = new StringBuilder();
        paramAnonymousMenuItem.append(RemittanceDetailUI.r(RemittanceDetailUI.this).getText().toString().trim() + " ");
        String str = RemittanceDetailUI.f(RemittanceDetailUI.this).getText().toString().trim();
        if (str.endsWith(RemittanceDetailUI.this.getString(2131296805)))
          paramAnonymousMenuItem.append(str.substring(0, str.length() - 4));
        while (true)
        {
          paramAnonymousMenuItem = paramAnonymousMenuItem.toString();
          break;
          paramAnonymousMenuItem.append(str);
        }
      }
    };
    this.mlU = new RemittanceDetailUI.11(this);
    this.mlV = new RemittanceDetailUI.13(this);
    AppMethodBeat.o(45027);
  }

  private void a(Dialog paramDialog)
  {
    AppMethodBeat.i(45038);
    if (paramDialog != null)
      paramDialog.dismiss();
    paramDialog = new Intent(this, WalletLqtDetailUI.class);
    paramDialog.putExtra("key_account_type", 0);
    startActivityForResult(paramDialog, 2);
    AppMethodBeat.o(45038);
  }

  private void a(u paramu)
  {
    AppMethodBeat.i(45042);
    if ("confirm".equals(paramu.pPk))
    {
      BK(1);
      AppMethodBeat.o(45042);
    }
    while (true)
    {
      return;
      aZ(0, getResources().getString(2131302393));
      AppMethodBeat.o(45042);
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, final NetSceneTenpayRemittanceQuery paramNetSceneTenpayRemittanceQuery)
  {
    AppMethodBeat.i(45037);
    if (paramBoolean1)
    {
      this.pUE.setVisibility(8);
      this.pUZ.setVisibility(0);
      if (!bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQm.pQs))
      {
        this.pVa.setVisibility(0);
        if (!bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.desc))
        {
          this.pVb.setVisibility(0);
          this.pVf.setText(paramNetSceneTenpayRemittanceQuery.desc);
          this.pVf.setOnLongClickListener(this.mlV);
          this.pVf.setOnTouchListener(this.mlU);
          if (bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQm.pQs))
            break label415;
          this.pVc.setVisibility(0);
          this.pVg.setText(paramNetSceneTenpayRemittanceQuery.pQm.pQs + "  " + paramNetSceneTenpayRemittanceQuery.pQm.gyD);
          this.pVe.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(45026);
              int i = RemittanceResultNewUI.n(RemittanceDetailUI.this, paramNetSceneTenpayRemittanceQuery.pQm.fBg, RemittanceDetailUI.d(RemittanceDetailUI.this).getWidth());
              if (!bo.gW(i, paramNetSceneTenpayRemittanceQuery.pQm.fBg.length()))
              {
                Object localObject1 = RemittanceDetailUI.this.getString(2131296809);
                String str = paramNetSceneTenpayRemittanceQuery.pQm.fBg.substring(0, i) + "... ";
                Object localObject2 = new SpannableString(str + (String)localObject1);
                Object localObject3 = new com.tencent.mm.plugin.order.c.a(RemittanceDetailUI.this);
                ((com.tencent.mm.plugin.order.c.a)localObject3).peT = new RemittanceDetailUI.23.1(this);
                ((SpannableString)localObject2).setSpan(localObject3, str.length(), str.length() + ((String)localObject1).length(), 33);
                RemittanceDetailUI.e(RemittanceDetailUI.this).setOnTouchListener(a.cfs());
                RemittanceDetailUI.e(RemittanceDetailUI.this).setText((CharSequence)localObject2);
                localObject2 = RemittanceDetailUI.this.getString(2131296805);
                str = paramNetSceneTenpayRemittanceQuery.pQm.fBg + "  ";
                localObject3 = new SpannableString(str + (String)localObject2);
                localObject1 = new com.tencent.mm.plugin.order.c.a(RemittanceDetailUI.this);
                ((com.tencent.mm.plugin.order.c.a)localObject1).peT = new RemittanceDetailUI.23.2(this);
                int j = str.length();
                i = str.length();
                ((SpannableString)localObject3).setSpan(localObject1, j, ((String)localObject2).length() + i, 33);
                RemittanceDetailUI.f(RemittanceDetailUI.this).setOnTouchListener(a.cfs());
                RemittanceDetailUI.f(RemittanceDetailUI.this).setText((CharSequence)localObject3);
              }
              while (true)
              {
                RemittanceDetailUI.e(RemittanceDetailUI.this).setVisibility(0);
                RemittanceDetailUI.f(RemittanceDetailUI.this).setVisibility(8);
                RemittanceDetailUI.h(RemittanceDetailUI.this).setOnLongClickListener(RemittanceDetailUI.g(RemittanceDetailUI.this));
                RemittanceDetailUI.h(RemittanceDetailUI.this).setOnTouchListener(RemittanceDetailUI.i(RemittanceDetailUI.this));
                AppMethodBeat.o(45026);
                return;
                RemittanceDetailUI.e(RemittanceDetailUI.this).setText(paramNetSceneTenpayRemittanceQuery.pQm.fBg);
                RemittanceDetailUI.f(RemittanceDetailUI.this).setText(paramNetSceneTenpayRemittanceQuery.pQm.fBg);
              }
            }
          });
          label180: if ((!paramBoolean2) || (bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQn.cIY)))
            break label736;
          this.pUE.setVisibility(0);
          this.pUF.setVisibility(0);
          this.pUW.setVisibility(0);
          this.pUN.setVisibility(0);
          this.pUU.setVisibility(0);
          com.tencent.mm.at.a.a.ahv().a(paramNetSceneTenpayRemittanceQuery.pQn.cIY, this.pUO);
          this.pUP.setText(paramNetSceneTenpayRemittanceQuery.pQn.name);
          this.pUQ.setText(paramNetSceneTenpayRemittanceQuery.pQn.cEh);
          if (paramNetSceneTenpayRemittanceQuery.pQn.pQt <= 0)
            break label684;
          this.pUS.setText(paramNetSceneTenpayRemittanceQuery.pQn.pQu);
          this.pUR.setVisibility(8);
          this.pUS.setVisibility(0);
          this.pUS.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(44998);
              RemittanceDetailUI.a(RemittanceDetailUI.this, paramNetSceneTenpayRemittanceQuery.pQn.pQv, paramNetSceneTenpayRemittanceQuery, 11);
              AppMethodBeat.o(44998);
            }
          });
          label339: if (!bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQo.cEh))
            break label766;
          this.pUT.setVisibility(8);
        }
      }
    }
    while (true)
    {
      com.tencent.mm.ui.tools.m.a(this, (ScrollView)findViewById(2131820884), findViewById(2131827020), findViewById(2131827024), findViewById(2131827058));
      AppMethodBeat.o(45037);
      return;
      this.pVb.setVisibility(8);
      break;
      label415: this.pVc.setVisibility(8);
      break label180;
      this.pVa.setVisibility(8);
      break label180;
      this.pUE.setVisibility(0);
      this.pUZ.setVisibility(8);
      if (!bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQm.pQs))
      {
        this.pUF.setVisibility(0);
        if (!bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.desc))
        {
          this.pUG.setVisibility(0);
          this.pUJ.setText(paramNetSceneTenpayRemittanceQuery.desc);
          this.pUJ.setOnLongClickListener(this.mlV);
          this.pUJ.setOnTouchListener(this.mlU);
        }
        while (true)
        {
          if (bo.isNullOrNil(paramNetSceneTenpayRemittanceQuery.pQm.pQs))
            break label624;
          this.pRn.setVisibility(0);
          this.pUK.setText(paramNetSceneTenpayRemittanceQuery.pQm.pQs + "  " + paramNetSceneTenpayRemittanceQuery.pQm.gyD);
          this.pUI.post(new RemittanceDetailUI.2(this, paramNetSceneTenpayRemittanceQuery));
          break;
          this.pUG.setVisibility(8);
        }
        label624: this.pRn.setVisibility(8);
        break label180;
      }
      this.pUV.setVisibility(8);
      this.pUG.setVisibility(8);
      this.pRn.setVisibility(8);
      this.pUW.setVisibility(8);
      this.pUF.setVisibility(8);
      break label180;
      label684: this.pUR.setVisibility(0);
      this.pUS.setVisibility(8);
      this.pUR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(44999);
          RemittanceDetailUI.a(RemittanceDetailUI.this, paramNetSceneTenpayRemittanceQuery.pQn.pQv, paramNetSceneTenpayRemittanceQuery, 11);
          AppMethodBeat.o(44999);
        }
      });
      this.pUN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(45000);
          RemittanceDetailUI.a(RemittanceDetailUI.this, paramNetSceneTenpayRemittanceQuery.pQn.pQv, paramNetSceneTenpayRemittanceQuery, 11);
          AppMethodBeat.o(45000);
        }
      });
      break label339;
      label736: this.pUW.setVisibility(8);
      this.pUN.setVisibility(8);
      this.pUU.setVisibility(8);
      break label339;
      label766: this.pUT.setText(paramNetSceneTenpayRemittanceQuery.pQo.cEh);
      this.pUT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(45001);
          RemittanceDetailUI.a(RemittanceDetailUI.this, paramNetSceneTenpayRemittanceQuery.pQo.pQv, paramNetSceneTenpayRemittanceQuery, 12);
          AppMethodBeat.o(45001);
        }
      });
      this.pUT.setVisibility(0);
    }
  }

  public static String bc(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(45045);
    String str = com.tencent.mm.wallet_core.ui.e.mJ(paramString);
    if (str == null)
    {
      paramString = "";
      AppMethodBeat.o(45045);
    }
    while (true)
    {
      return paramString;
      paramString = str;
      if (str.length() > 10)
      {
        paramString = str;
        if (paramBoolean)
          paramString = str.substring(0, 8) + "...";
      }
      AppMethodBeat.o(45045);
    }
  }

  private void cfE()
  {
    AppMethodBeat.i(45040);
    if ((this.pVr != 0) && (this.pRA == 1) && (!bo.isNullOrNil(this.pRz)))
    {
      addIconOptionMenu(0, 2130840734, new RemittanceDetailUI.14(this));
      AppMethodBeat.o(45040);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.RemittanceDetailUI", "flag: %d, descUrl empty: %B", new Object[] { Integer.valueOf(this.pVr), Boolean.valueOf(bo.isNullOrNil(this.pRz)) });
      this.mController.removeAllOptionMenu();
      AppMethodBeat.o(45040);
    }
  }

  protected void BK(int paramInt)
  {
    AppMethodBeat.i(45031);
    a(new NetSceneTenpayRemittanceQuery(paramInt, this.pVl, this.pRG, this.pVj), true, false);
    AppMethodBeat.o(45031);
  }

  protected void BL(int paramInt)
  {
    AppMethodBeat.i(45033);
    if (!getIntent().getBooleanExtra("is_sender", false));
    for (com.tencent.mm.plugin.order.model.h localh = new com.tencent.mm.plugin.order.model.h(this.pRG, this.pVn, paramInt); ; localh = new com.tencent.mm.plugin.order.model.h(this.pVl, this.pVn, paramInt))
    {
      localh.eHT = "RemittanceProcess";
      a(localh, true, true);
      AppMethodBeat.o(45033);
      return;
    }
  }

  protected final void aZ(int paramInt, String paramString)
  {
    AppMethodBeat.i(45043);
    Intent localIntent = new Intent();
    localIntent.putExtra("result_msg", paramString);
    setResult(paramInt, localIntent);
    finish();
    AppMethodBeat.o(45043);
  }

  protected void an(Intent paramIntent)
  {
    AppMethodBeat.i(45034);
    d.b(this, "remittance", ".ui.RemittanceResendMsgUI", paramIntent);
    AppMethodBeat.o(45034);
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(45041);
    final NetSceneTenpayRemittanceQuery localNetSceneTenpayRemittanceQuery;
    final boolean bool;
    Object localObject1;
    if ((paramm instanceof NetSceneTenpayRemittanceQuery))
    {
      localNetSceneTenpayRemittanceQuery = (NetSceneTenpayRemittanceQuery)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label3470;
      if (localNetSceneTenpayRemittanceQuery != null)
      {
        if (localNetSceneTenpayRemittanceQuery.nsL)
        {
          this.pcH = r.Yz();
          this.pcA = this.pVm;
          bool = r.Yz().equals(this.pcA);
          this.pUD.setVisibility(8);
          this.pUA.setText(com.tencent.mm.wallet_core.ui.e.e(localNetSceneTenpayRemittanceQuery.kCJ, localNetSceneTenpayRemittanceQuery.pcl));
          paramm = localNetSceneTenpayRemittanceQuery.pQj;
          paramString = paramm;
          if (!bo.isNullOrNil(paramm))
          {
            paramString = paramm;
            if (paramm.contains("%s"))
              paramString = paramm.trim().replace("%s", bc(this.pcA, true));
          }
          localObject1 = localNetSceneTenpayRemittanceQuery.pQk;
          paramm = new Bundle();
          paramm.putString("transaction_id", this.pVl);
          paramm.putString("receiver_name", this.pcA);
          paramm.putString("transfer_id", this.pRG);
          paramm.putInt("total_fee", this.pVq);
          paramm.putString("sender_name", this.pVm);
          paramm.putInt("invalid_time", this.pVj);
          paramm.putParcelable("resend_msg_info", localNetSceneTenpayRemittanceQuery.pQp);
          this.ocV.setClickable(true);
          this.pUz.setClickable(true);
          this.pUY.setClickable(true);
          paramInt1 = localNetSceneTenpayRemittanceQuery.status;
          ab.d("MicroMsg.RemittanceDetailUI", "status: %d", new Object[] { Integer.valueOf(paramInt1) });
        }
      }
      else
        switch (paramInt1)
        {
        default:
          finish();
          label344: if (!bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQq))
            com.tencent.mm.wallet_core.ui.e.a((TextView)findViewById(2131821634), "7", localNetSceneTenpayRemittanceQuery.pQq, localNetSceneTenpayRemittanceQuery.pQr);
          this.pVr = localNetSceneTenpayRemittanceQuery.pQl;
          g.RQ();
          this.pRz = ((String)g.RP().Ry().get(ac.a.xPP, ""));
          g.RQ();
          this.pRA = ((Integer)g.RP().Ry().get(ac.a.xPQ, Integer.valueOf(0))).intValue();
          if (bo.isNullOrNil(this.pRz))
          {
            ae.a(true, this.Ahr);
            label465: cfE();
            if (localNetSceneTenpayRemittanceQuery.pcT == 1)
            {
              g.RQ();
              if (!((String)g.RP().Ry().get(327729, "0")).equals("0"))
                break label3211;
              paramString = this.mController.ylL;
              if (!r.YM())
                break label3204;
              paramInt1 = 2131298125;
              label527: com.tencent.mm.ui.base.h.a(paramString, paramInt1, 2131305294, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(45013);
                  com.tencent.mm.ui.base.h.bQ(RemittanceDetailUI.this.mController.ylL, RemittanceDetailUI.this.getString(2131302392));
                  AppMethodBeat.o(45013);
                }
              });
              g.RQ();
              g.RP().Ry().set(327729, "1");
            }
            label563: bool = true;
            AppMethodBeat.o(45041);
          }
          break;
        case 2000:
        case 2001:
        case 2002:
        case 2003:
        case 2004:
        case 2005:
        }
    }
    while (true)
    {
      return bool;
      this.pcH = this.pVm;
      this.pcA = r.Yz();
      break;
      if (!bool)
        if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil((String)localObject1)))
        {
          this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
          this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
          this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          label686: a(false, false, localNetSceneTenpayRemittanceQuery);
        }
      Object localObject2;
      while (true)
      {
        this.pUy.setImageResource(2131231871);
        this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQf) }));
        this.pUB.setVisibility(0);
        this.pUC.setVisibility(8);
        break;
        paramString = getString(2131302411, new Object[] { bc(this.pcA, true) });
        this.pUz.setText(j.b(this, paramString, this.pUz.getTextSize()));
        localObject2 = getString(2131302417, new Object[] { Integer.valueOf(this.pVo) });
        paramString = getString(2131305950);
        localObject1 = new SpannableString((String)localObject2 + paramString);
        paramm = new com.tencent.mm.plugin.order.c.a(this);
        paramm.peT = new RemittanceDetailUI.17(this, localNetSceneTenpayRemittanceQuery);
        ((SpannableString)localObject1).setSpan(paramm, ((String)localObject2).length(), ((String)localObject2).length() + paramString.length(), 33);
        this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
        this.ocV.setText((CharSequence)localObject1);
        break label686;
        this.pUy.setImageResource(2131231871);
        this.pUX.setVisibility(0);
        this.pUX.setOnClickListener(new RemittanceDetailUI.18(this));
        if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil((String)localObject1)))
          break label1057;
        this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
        this.pUY.setText(j.a(this, (CharSequence)localObject1, (int)this.pUY.getTextSize(), paramm));
        this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        this.pUY.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        a(true, false, localNetSceneTenpayRemittanceQuery);
      }
      label1057: this.pUz.setText(2131302410);
      if (localNetSceneTenpayRemittanceQuery.pQl != 0)
        if (!bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQk))
          paramString = localNetSceneTenpayRemittanceQuery.pQk;
      while (true)
      {
        localObject2 = getString(2131302402);
        paramm = new SpannableString(paramString + (String)localObject2);
        localObject1 = new com.tencent.mm.plugin.order.c.a(this);
        ((com.tencent.mm.plugin.order.c.a)localObject1).peT = new a.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(45020);
            com.tencent.mm.ui.base.h.d(RemittanceDetailUI.this, RemittanceDetailUI.this.getString(2131302398, new Object[] { RemittanceDetailUI.bc(localNetSceneTenpayRemittanceQuery.pQh, false) }), RemittanceDetailUI.this.getString(2131297031), RemittanceDetailUI.this.getString(2131302403), RemittanceDetailUI.this.getString(2131296868), new RemittanceDetailUI.19.1(this), new RemittanceDetailUI.19.2(this));
            AppMethodBeat.o(45020);
          }
        };
        paramm.setSpan(localObject1, paramString.length(), paramString.length() + ((String)localObject2).length(), 33);
        this.pUY.setMovementMethod(LinkMovementMethod.getInstance());
        this.pUY.setText(paramm);
        break;
        ab.i("MicroMsg.RemittanceDetailUI", "use hardcode wording");
        if (localNetSceneTenpayRemittanceQuery.pQl == 1);
        for (paramString = "24"; ; paramString = "2")
        {
          paramm = getString(2131302412, new Object[] { paramString });
          paramString = getString(2131302413, new Object[] { Integer.valueOf(this.pVo) });
          paramString = paramm + paramString;
          break;
        }
        paramString = getString(2131302413, new Object[] { Integer.valueOf(this.pVo) });
      }
      this.pUy.setImageResource(2131231868);
      if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil((String)localObject1)))
      {
        this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
        this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
        this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        label1412: if (!bool)
          break label1669;
        a(false, true, localNetSceneTenpayRemittanceQuery);
      }
      while (true)
      {
        this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQf) }));
        this.pUB.setVisibility(0);
        this.pUC.setText(getString(2131302394, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQi) }));
        this.pUC.setVisibility(0);
        break;
        if (bool)
        {
          this.pUz.setText(2131302405);
          paramString = new SpannableStringBuilder(getString(2131302386));
          paramm = new com.tencent.mm.plugin.order.c.a(this);
          paramm.peT = new RemittanceDetailUI.20(this);
          paramString.setSpan(paramm, 0, paramString.length(), 18);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText(paramString);
          this.ocV.setVisibility(0);
          break label1412;
        }
        paramString = bc(this.pcA, true) + getString(2131302405);
        this.pUz.setText(j.b(this, paramString, this.pUz.getTextSize()));
        this.ocV.setText(2131302416);
        this.ocV.setVisibility(0);
        break label1412;
        label1669: a(false, false, localNetSceneTenpayRemittanceQuery);
      }
      if ((paramInt1 == 2003) && (!bool))
      {
        this.pUy.setImageResource(2131231870);
        if (!bo.isNullOrNil(paramString))
        {
          this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
          this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          label1745: if (bool)
            break label2235;
          if (bo.isNullOrNil((String)localObject1))
            break label2029;
          this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
          this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          label1795: this.ocV.setVisibility(0);
        }
      }
      while (true)
      {
        a(false, false, localNetSceneTenpayRemittanceQuery);
        this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQf) }));
        this.pUB.setVisibility(0);
        this.pUC.setText(getString(2131302397, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQi) }));
        this.pUC.setVisibility(0);
        break;
        this.pUz.setText(2131302409);
        break label1745;
        this.pUy.setImageResource(2131231869);
        if (!bo.isNullOrNil(paramString))
        {
          this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
          this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          break label1745;
        }
        if (bool)
        {
          this.pUz.setText(2131302407);
          break label1745;
        }
        paramString = bc(this.pcA, true) + getString(2131302407);
        this.pUz.setText(j.b(this, paramString, this.pUz.getTextSize()));
        break label1745;
        label2029: if (("CFT".equals(localNetSceneTenpayRemittanceQuery.pcJ)) || ("LQT".equals(localNetSceneTenpayRemittanceQuery.pcJ)))
        {
          bool = "LQT".equals(localNetSceneTenpayRemittanceQuery.pcJ);
          if (bool)
          {
            paramString = getString(2131302401);
            if (!bool)
              break label2210;
          }
          for (paramm = getString(2131302389); ; paramm = getString(2131302386))
          {
            localObject1 = new SpannableString(paramString + paramm);
            localObject2 = new com.tencent.mm.plugin.order.c.a(this);
            ((com.tencent.mm.plugin.order.c.a)localObject2).peT = new RemittanceDetailUI.21(this, bool);
            paramInt2 = paramString.length();
            paramInt1 = paramString.length();
            ((SpannableString)localObject1).setSpan(localObject2, paramInt2, paramm.length() + paramInt1, 33);
            this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
            this.ocV.setText((CharSequence)localObject1);
            break;
            paramString = getString(2131302399);
            break label2083;
          }
        }
        label2083: this.ocV.setText(2131302400);
        label2210: break label1795;
        label2235: this.ocV.setVisibility(8);
      }
      if (bool)
      {
        this.pUy.setImageResource(2131231871);
        if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil((String)localObject1)))
        {
          this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
          this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
          this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        }
      }
      while (true)
      {
        a(false, false, localNetSceneTenpayRemittanceQuery);
        this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQf) }));
        this.pUB.setVisibility(0);
        this.pUC.setText(getString(2131302394, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQi) }));
        this.pUC.setVisibility(0);
        break;
        if (!bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQj))
          this.pUz.setText(localNetSceneTenpayRemittanceQuery.pQj);
        while (true)
        {
          if (bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQk))
            break label2497;
          this.ocV.setText(localNetSceneTenpayRemittanceQuery.pQk);
          break;
          this.pUz.setText(2131302406);
        }
        label2497: this.ocV.setText(2131302396);
        continue;
        this.pUy.setImageResource(2131231871);
        if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil((String)localObject1)))
        {
          this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
          this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
          this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        }
        else
        {
          if (!bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQj));
          while (true)
          {
            try
            {
              this.pUz.setText(String.format(localNetSceneTenpayRemittanceQuery.pQj, new Object[] { bc(this.pcA, true) }));
              if (bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQk))
                break label2724;
              this.ocV.setText(localNetSceneTenpayRemittanceQuery.pQk);
            }
            catch (Exception paramString)
            {
              ab.printErrStackTrace("MicroMsg.RemittanceDetailUI", paramString, "", new Object[0]);
            }
            this.pUz.setText(getString(2131302408, new Object[] { bc(this.pcA, true) }));
          }
          label2724: this.ocV.setText("");
        }
      }
      this.pUy.setImageResource(2131231867);
      if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil((String)localObject1)))
      {
        this.pUz.setText(j.a(this, paramString, (int)this.pUz.getTextSize(), paramm));
        this.ocV.setText(j.a(this, (CharSequence)localObject1, (int)this.ocV.getTextSize(), paramm));
        this.pUz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
        this.ocV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
      }
      while (true)
      {
        a(false, false, localNetSceneTenpayRemittanceQuery);
        this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQf) }));
        this.pUB.setVisibility(0);
        if (localNetSceneTenpayRemittanceQuery.pQi <= 0)
          break label3180;
        this.pUC.setText(getString(2131302385, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(localNetSceneTenpayRemittanceQuery.pQi) }));
        this.pUC.setVisibility(0);
        break;
        if (!bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQj))
        {
          this.pUz.setText(localNetSceneTenpayRemittanceQuery.pQj);
          label2951: if (bo.isNullOrNil(localNetSceneTenpayRemittanceQuery.pQk))
            break label3149;
          if ((!"CFT".equals(localNetSceneTenpayRemittanceQuery.pcJ)) && (!"LQT".equals(localNetSceneTenpayRemittanceQuery.pcJ)))
            break label3134;
          bool = "LQT".equals(localNetSceneTenpayRemittanceQuery.pcJ);
          paramm = localNetSceneTenpayRemittanceQuery.pQk;
          if (!bool)
            break label3123;
        }
        label3123: for (paramString = getString(2131302389); ; paramString = getString(2131302386))
        {
          localObject1 = new SpannableStringBuilder();
          ((SpannableStringBuilder)localObject1).append(paramm);
          ((SpannableStringBuilder)localObject1).append(paramString);
          paramString = new com.tencent.mm.plugin.order.c.a(this);
          paramString.peT = new a.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(45023);
              if (bool)
              {
                d.H(RemittanceDetailUI.this, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
                AppMethodBeat.o(45023);
              }
              while (true)
              {
                return;
                com.tencent.mm.pluginsdk.wallet.h.ak(RemittanceDetailUI.this, 0);
                AppMethodBeat.o(45023);
              }
            }
          };
          ((SpannableStringBuilder)localObject1).setSpan(paramString, paramm.length(), ((SpannableStringBuilder)localObject1).length(), 18);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText((CharSequence)localObject1);
          break;
          this.pUz.setText(2131302404);
          break label2951;
        }
        label3134: this.ocV.setText(localNetSceneTenpayRemittanceQuery.pQk);
        continue;
        label3149: if (bool)
          this.ocV.setText(2131302395);
        else
          this.ocV.setText(2131302415);
      }
      label3180: this.pUC.setVisibility(8);
      break label344;
      ae.a(false, this.Ahr);
      break label465;
      label3204: paramInt1 = 2131305293;
      break label527;
      label3211: if (this.pVr != 0)
        break label563;
      com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131302392));
      break label563;
      if ((paramm instanceof u))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.pVs = ((u)paramm);
          if ((this.pVs.bLD()) && (this.pVs.nYe.a(this, new RemittanceDetailUI.16(this))))
          {
            bool = true;
            AppMethodBeat.o(45041);
          }
          else
          {
            a(this.pVs);
            bool = true;
            AppMethodBeat.o(45041);
          }
        }
        else if (paramInt2 == 416)
        {
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_plugin", "remittance");
          paramString.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramInt2, paramm, paramString, 1008);
          AppMethodBeat.o(45041);
        }
        else
        {
          aZ(paramInt2, paramString);
          bool = true;
          AppMethodBeat.o(45041);
        }
      }
      else
      {
        if ((paramm instanceof ae))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            this.pRz = ((ae)paramm).tuE;
            this.pRA = ((ae)paramm).tuF;
            cfE();
          }
          while (true)
          {
            bool = true;
            AppMethodBeat.o(45041);
            break;
            ab.i("MicroMsg.RemittanceDetailUI", "net error");
          }
        }
        label3470: if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.e))
        {
          bool = true;
          AppMethodBeat.o(45041);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(45041);
        }
      }
    }
  }

  protected void cfV()
  {
    AppMethodBeat.i(45035);
    u localu = new u(this.pVl, this.pRG, this.pVq, "confirm", this.pVm, this.pVj);
    localu.eHT = "RemittanceProcess";
    a(localu, true, true);
    AppMethodBeat.o(45035);
  }

  protected void cfW()
  {
    AppMethodBeat.i(45036);
    u localu = new u(this.pVl, this.pRG, this.pVq, "refuse", this.pVm, this.pVj);
    localu.eHT = "RemittanceProcess";
    a(localu, true, true);
    AppMethodBeat.o(45036);
  }

  public void finish()
  {
    AppMethodBeat.i(45044);
    Bundle localBundle = new Bundle();
    localBundle.putString("realname_verify_process_jump_plugin", "remittance");
    localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
    if ((this.pVs != null) && (com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, this.pVs, localBundle, true, 1008)))
    {
      this.pVs = null;
      AppMethodBeat.o(45044);
    }
    while (true)
    {
      return;
      super.finish();
      AppMethodBeat.o(45044);
    }
  }

  public final int getLayoutId()
  {
    return 2130970510;
  }

  public final void initView()
  {
    AppMethodBeat.i(45032);
    setMMTitle("");
    dyb();
    xE(getResources().getColor(2131689613));
    this.pUy = ((ImageView)findViewById(2131827021));
    this.pUz = ((TextView)findViewById(2131827022));
    this.pUA = ((TextView)findViewById(2131827023));
    this.pUD = ((Button)findViewById(2131827026));
    this.ocV = ((TextView)findViewById(2131827027));
    this.pUE = ((LinearLayout)findViewById(2131827025));
    this.pUF = ((LinearLayout)findViewById(2131827028));
    this.pUG = ((LinearLayout)findViewById(2131822843));
    this.pRn = ((LinearLayout)findViewById(2131827032));
    this.pUH = ((LinearLayout)findViewById(2131827034));
    this.pUI = ((TextView)findViewById(2131827030));
    this.pUJ = ((TextView)findViewById(2131827031));
    this.pUK = ((TextView)findViewById(2131827035));
    this.pUL = ((TextView)findViewById(2131827036));
    this.pUM = ((TextView)findViewById(2131827037));
    this.pUN = ((RelativeLayout)findViewById(2131827039));
    this.pUO = ((ImageView)findViewById(2131827040));
    this.pUP = ((TextView)findViewById(2131827041));
    this.pUQ = ((TextView)findViewById(2131827042));
    this.pUR = ((ImageView)findViewById(2131827043));
    this.pUS = ((Button)findViewById(2131822846));
    this.pUT = ((TextView)findViewById(2131827059));
    this.pUU = findViewById(2131827044);
    this.pUV = findViewById(2131827029);
    this.pUW = findViewById(2131827038);
    this.pUX = ((Button)findViewById(2131827056));
    this.pUY = ((TextView)findViewById(2131827057));
    this.pUZ = ((LinearLayout)findViewById(2131827045));
    this.pVa = ((LinearLayout)findViewById(2131827046));
    this.pVb = ((LinearLayout)findViewById(2131827047));
    this.pVc = ((LinearLayout)findViewById(2131827050));
    this.pVd = ((LinearLayout)findViewById(2131827052));
    this.pVe = ((TextView)findViewById(2131827048));
    this.pVf = ((TextView)findViewById(2131827049));
    this.pVg = ((TextView)findViewById(2131827053));
    this.pVh = ((TextView)findViewById(2131827054));
    this.pVi = ((TextView)findViewById(2131827055));
    this.pUB = ((TextView)findViewById(2131827060));
    this.pUC = ((TextView)findViewById(2131827061));
    AppMethodBeat.o(45032);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45030);
    ab.i("MicroMsg.RemittanceDetailUI", "onActivityResult %s %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 2)
      BK(0);
    AppMethodBeat.o(45030);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45028);
    super.onCreate(paramBundle);
    this.pVj = getIntent().getIntExtra("invalid_time", 0);
    this.pVk = getIntent().getIntExtra("appmsg_type", 0);
    this.pVl = getIntent().getStringExtra("transaction_id");
    this.pVn = getIntent().getStringExtra("bill_id");
    this.pRG = getIntent().getStringExtra("transfer_id");
    this.pVm = getIntent().getStringExtra("sender_name");
    this.pVo = getIntent().getIntExtra("effective_date", 3);
    this.pVp = getIntent().getBooleanExtra("is_sender", false);
    this.pVq = getIntent().getIntExtra("total_fee", 0);
    initView();
    BK(0);
    getIntent();
    com.tencent.mm.sdk.b.a.xxA.c(this.pVt);
    this.pVu.dnU();
    AppMethodBeat.o(45028);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(45039);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 0, 0, getString(2131296875));
    AppMethodBeat.o(45039);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45029);
    com.tencent.mm.sdk.b.a.xxA.d(this.pVt);
    if (this.pVu != null)
      this.pVu.dead();
    super.onDestroy();
    AppMethodBeat.o(45029);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI
 * JD-Core Version:    0.6.2
 */