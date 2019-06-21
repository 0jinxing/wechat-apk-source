package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class j
  implements b.a, e
{
  ImageView eks;
  private String gHT;
  private TextView gnh;
  private String nCh;
  private String nCi;
  private String nCj;
  private String nCk;
  private int nCl;
  private int nCm;
  private ImageButton nGA;
  public TextView nGB;
  public View nGC;
  private ImageButton nGD;
  private int nGE;
  String nGF;
  IPCallTalkUI nGG;
  com.tencent.mm.plugin.ipcall.c nGH;
  j.a nGI;
  private long nGJ;
  long nGK;
  boolean nGL;
  boolean nGM;
  private AudioManager nGN;
  private boolean nGO;
  private boolean nGP;
  private boolean nGQ;
  Bitmap nGl;
  EditText nGu;
  TextView nGv;
  ImageView nGw;
  private IPCallFuncButton nGx;
  private IPCallFuncButton nGy;
  private IPCallFuncButton nGz;
  DialPad nzR;

  public j(IPCallTalkUI paramIPCallTalkUI)
  {
    AppMethodBeat.i(22411);
    this.nGE = -1;
    this.nGK = -1L;
    this.nGL = false;
    this.nGM = false;
    this.nGN = null;
    this.nGO = false;
    this.nGP = true;
    this.nGQ = false;
    this.nGG = paramIPCallTalkUI;
    this.nGH = i.bHv();
    this.nGH.nuX = this;
    AppMethodBeat.o(22411);
  }

  private void bIA()
  {
    AppMethodBeat.i(22415);
    if ((!bo.isNullOrNil(this.nCj)) && (!com.tencent.mm.plugin.ipcall.b.a.Pu(this.nCh)))
    {
      this.nGF = (this.nCj + this.nCh);
      if (this.nGF.startsWith("+"))
        break label104;
      this.nGF = ("+" + this.nGF);
      AppMethodBeat.o(22415);
    }
    while (true)
    {
      return;
      this.nGF = this.nCh;
      label104: AppMethodBeat.o(22415);
    }
  }

  private void bIB()
  {
    AppMethodBeat.i(22416);
    i.bHt().crP = this.nGG;
    i.bHt().bHI();
    i.bHt().nxk = this;
    i.bHt().a(this);
    AppMethodBeat.o(22416);
  }

  private void bIC()
  {
    AppMethodBeat.i(22417);
    this.nGu.setKeyListener(null);
    this.nGu.setHorizontallyScrolling(true);
    this.nzR.setVisibility(4);
    this.nzR.setTalkUIMode(true);
    bID();
    bIE();
    AppMethodBeat.o(22417);
  }

  private void bID()
  {
    AppMethodBeat.i(22419);
    if (!bo.isNullOrNil(this.nGF))
      Pm(this.nGF);
    if (d.iW(16))
    {
      this.nGu.setTypeface(Typeface.create("sans-serif-light", 0));
      this.nGv.setTypeface(Typeface.create("sans-serif-light", 0));
    }
    if (!bo.isNullOrNil(this.nCi))
      this.nGl = com.tencent.mm.plugin.ipcall.b.a.g(this.nGG, this.nCi, true);
    if ((this.nGl == null) && (!bo.isNullOrNil(this.nCh)) && (com.tencent.mm.plugin.ipcall.b.a.apV()))
      this.nGl = com.tencent.mm.plugin.ipcall.b.a.aI(this.nGG, this.nCh);
    if ((this.nGl == null) && (!bo.isNullOrNil(this.nCk)))
      this.nGl = com.tencent.mm.ah.b.d(this.nCk, 480, 480, 4);
    if (this.nGl == null)
    {
      this.nGw.setVisibility(0);
      this.eks.setVisibility(8);
    }
    if (this.nGl != null)
    {
      this.nGw.setVisibility(8);
      this.eks.setVisibility(0);
      this.eks.setImageBitmap(this.nGl);
    }
    this.nGD.setOnClickListener(new j.8(this));
    this.nGz.setClickCallback(new j.9(this));
    this.nGx.setClickCallback(new j.10(this));
    this.nGy.setClickCallback(new j.11(this));
    this.nGA.setOnClickListener(new j.12(this));
    AppMethodBeat.o(22419);
  }

  private void bIE()
  {
    AppMethodBeat.i(22420);
    this.nzR.setDialButtonClickListener(new DialPad.a()
    {
      public final void OX(String paramAnonymousString)
      {
        AppMethodBeat.i(22400);
        String str1 = j.this.nGu.getText().toString();
        if (bo.isNullOrNil(str1))
          j.this.nGK = System.currentTimeMillis();
        long l = System.currentTimeMillis();
        String str2 = str1;
        if (l - j.this.nGK >= 3000L)
          str2 = str1 + " ";
        str2 = str2 + paramAnonymousString;
        j.this.nGK = l;
        j.this.eN(str2, "");
        com.tencent.mm.plugin.ipcall.c.OL(paramAnonymousString);
        com.tencent.mm.plugin.report.service.h.pYm.e(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        AppMethodBeat.o(22400);
      }

      public final void OY(String paramAnonymousString)
      {
      }
    });
    AppMethodBeat.o(22420);
  }

  private void bIF()
  {
    AppMethodBeat.i(22422);
    this.nGE = com.tencent.mm.plugin.ipcall.b.a.eO(this.nCi, this.nCh);
    xw(1);
    this.nGH.a(this.gHT, this.nCh, this.nCk, this.nGF, this.nCi, this.nGE, this.nCl, this.nCm);
    ab.i("MicroMsg.TalkUIController", "startLaunchTalk, callNumber: %s", new Object[] { this.nGF });
    i.bHs().setCountryCode(this.nCj);
    AppMethodBeat.o(22422);
  }

  private void bIG()
  {
    AppMethodBeat.i(22423);
    if (i.bHq().nvN != null)
    {
      this.gHT = i.bHq().nvN.nickname;
      this.nGF = i.bHq().nvN.nwW;
      this.nCk = i.bHq().nvN.cMr;
      this.nCi = i.bHq().nvN.cOz;
      this.nCh = i.bHq().nvN.nwV;
      this.nGE = i.bHq().nvN.nwY;
      ab.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", new Object[] { this.gHT, this.nGF, this.nCk, this.nCi, this.nCh, Integer.valueOf(this.nGE) });
    }
    AppMethodBeat.o(22423);
  }

  private void bIH()
  {
    AppMethodBeat.i(22424);
    i.bHu();
    ab.i("MicroMsg.TalkUIController", f.stateToString(i.bHu().mCurrentState));
    xw(i.bHu().mCurrentState);
    bIJ();
    bII();
    AppMethodBeat.o(22424);
  }

  private void bII()
  {
    AppMethodBeat.i(22425);
    if (i.bHu().bHl())
    {
      IPCallFuncButton localIPCallFuncButton = this.nGz;
      i.bHt();
      localIPCallFuncButton.setChecked(com.tencent.mm.plugin.ipcall.a.b.a.KU());
      this.nGx.setChecked(i.bHt().nxg.eif);
    }
    AppMethodBeat.o(22425);
  }

  private void bIJ()
  {
    AppMethodBeat.i(22426);
    String str1 = i.bHq().nvN.nwW;
    String str2 = i.bHq().nvN.nwX;
    if (!bo.isNullOrNil(str2))
    {
      Pm(str2);
      this.nGv.setText(com.tencent.mm.plugin.ipcall.b.a.Pw(str2));
      AppMethodBeat.o(22426);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(str1))
      {
        Pm(str1);
        this.nGv.setText(com.tencent.mm.plugin.ipcall.b.a.Pw(str1));
      }
      AppMethodBeat.o(22426);
    }
  }

  private void bIz()
  {
    AppMethodBeat.i(22413);
    com.tencent.mm.plugin.report.service.h.pYm.X(12058, this.nCj);
    com.tencent.mm.ui.base.h.a(this.nGG, this.nGG.getString(2131297768), this.nGG.getString(2131297769), false, new j.6(this));
    AppMethodBeat.o(22413);
  }

  private void c(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(22414);
    bIK();
    if (!bo.isNullOrNil(paramString1));
    while (true)
    {
      if ((2 == paramInt) && (paramString2 != null))
      {
        this.gnh.setText(paramString2);
        AppMethodBeat.o(22414);
      }
      while (true)
      {
        return;
        if (!bo.isNullOrNil(paramString3))
          break label110;
        paramString1 = this.nGG.getString(2131300714);
        break;
        if ((1 == paramInt) && (paramString2 != null))
          com.tencent.mm.ui.base.h.a(this.nGG, paramString2, paramString1, this.nGG.getString(2131300715), false, new j.7(this));
        AppMethodBeat.o(22414);
      }
      label110: paramString1 = paramString3;
    }
  }

  private void xw(int paramInt)
  {
    AppMethodBeat.i(22427);
    switch (paramInt)
    {
    case 2:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
    case 1:
    case 3:
    case 4:
    case 5:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(22427);
      while (true)
      {
        return;
        AppMethodBeat.o(22427);
        continue;
        String str1 = com.tencent.mm.plugin.ipcall.b.c.xz(i.bHq().nvN.nwK);
        if (this.nGE != -1)
        {
          String str2 = com.tencent.mm.plugin.ipcall.b.a.xx(this.nGE);
          this.gnh.setText(str1 + this.nGG.getString(2131300779, new Object[] { str2 }));
          AppMethodBeat.o(22427);
        }
        else
        {
          this.gnh.setText(str1 + this.nGG.getString(2131300778));
          AppMethodBeat.o(22427);
          continue;
          AppMethodBeat.o(22427);
          continue;
          this.gnh.setText(String.format("%02d:%02d", new Object[] { Long.valueOf(this.nGJ / 60L), Long.valueOf(this.nGJ % 60L) }));
          AppMethodBeat.o(22427);
        }
      }
      this.gnh.setText(2131300782);
    }
  }

  final void Pm(String paramString)
  {
    AppMethodBeat.i(22418);
    if (!bo.isNullOrNil(this.gHT))
    {
      eN(this.gHT, com.tencent.mm.plugin.ipcall.b.a.Pw(paramString));
      AppMethodBeat.o(22418);
    }
    while (true)
    {
      return;
      eN(com.tencent.mm.plugin.ipcall.b.a.Pw(paramString), "");
      AppMethodBeat.o(22418);
    }
  }

  public final void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22412);
    this.nGO = this.nGG.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
    ab.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, Boolean.valueOf(this.nGO) });
    this.nGw = ((ImageView)this.nGG.findViewById(2131825098));
    this.eks = ((ImageView)this.nGG.findViewById(2131825099));
    this.nGu = ((EditText)this.nGG.findViewById(2131825091));
    this.gnh = ((TextView)this.nGG.findViewById(2131825088));
    this.nGv = ((TextView)this.nGG.findViewById(2131825096));
    this.nGx = ((IPCallFuncButton)this.nGG.findViewById(2131825093));
    this.nGy = ((IPCallFuncButton)this.nGG.findViewById(2131825094));
    this.nGz = ((IPCallFuncButton)this.nGG.findViewById(2131825095));
    this.nGA = ((ImageButton)this.nGG.findViewById(2131825100));
    this.nGD = ((ImageButton)this.nGG.findViewById(2131825101));
    this.nGB = ((TextView)this.nGG.findViewById(2131825090));
    this.nGC = this.nGG.findViewById(2131825089);
    this.nzR = ((DialPad)this.nGG.findViewById(2131825087));
    if (this.nGO)
    {
      bIG();
      bIB();
      bIC();
      bIH();
      AppMethodBeat.o(22412);
    }
    while (true)
    {
      return;
      if (i.bHu().bHk())
      {
        com.tencent.mm.ui.base.h.a(this.nGG, 2131300619, 2131297061, false, new j.1(this));
        AppMethodBeat.o(22412);
      }
      else
      {
        bIB();
        this.gHT = paramString1;
        this.nCh = paramString2;
        this.nCi = paramString3;
        this.nCj = paramString4;
        this.nCl = paramInt1;
        this.nCm = paramInt2;
        if (!bo.isNullOrNil(this.nCh))
          this.nCh = com.tencent.mm.plugin.ipcall.b.c.PA(this.nCh);
        if (bo.isNullOrNil(this.nCj))
          if (com.tencent.mm.plugin.ipcall.b.a.Pu(this.nCh))
          {
            paramString1 = com.tencent.mm.plugin.ipcall.b.a.Ps(this.nCh);
            if (!bo.isNullOrNil(paramString1))
              break label585;
            this.nCh = com.tencent.mm.plugin.ipcall.b.a.Pv(this.nCh);
          }
        for (this.nCj = com.tencent.mm.plugin.ipcall.b.c.bIR(); ; this.nCj = paramString1)
        {
          ab.i("MicroMsg.TalkUIController", "final mCountryCode: %s", new Object[] { this.nCj });
          com.tencent.mm.plugin.ipcall.a.c.bHc().ON(this.nCj);
          if (bo.isNullOrNil(this.gHT))
            this.gHT = com.tencent.mm.plugin.ipcall.b.a.aF(this.nGG, this.nCh);
          this.nCk = paramString5;
          bIA();
          ab.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", new Object[] { this.nGF });
          if (!com.tencent.mm.plugin.ipcall.a.c.bHc().xf(bo.getInt(this.nCj, -1)))
            break label604;
          bIz();
          AppMethodBeat.o(22412);
          break;
          label585: this.nCh = com.tencent.mm.plugin.ipcall.b.a.Px(this.nCh);
        }
        label604: if (!at.isNetworkConnected(this.nGG))
        {
          Toast.makeText(this.nGG, 2131304445, 1).show();
          this.nGG.finish();
          AppMethodBeat.o(22412);
        }
        else
        {
          long l1 = this.nGG.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
          long l2 = System.currentTimeMillis();
          if ((l1 > l2) && (l1 != -1L))
          {
            ab.i("MicroMsg.TalkUIController", "onDisasterHappen");
            com.tencent.mm.ui.base.h.a(this.nGG, this.nGG.getString(2131300724, new Object[] { String.valueOf((l1 - l2) / 1000L + 1L) }), this.nGG.getString(2131300714), this.nGG.getString(2131300715), false, new j.5(this));
            AppMethodBeat.o(22412);
          }
          else
          {
            bIC();
            if ((!this.nGO) || (!i.bHu().bHk()))
              bIF();
            this.nGQ = false;
            AppMethodBeat.o(22412);
          }
        }
      }
    }
  }

  public final void bGJ()
  {
    int i = 0;
    AppMethodBeat.i(22428);
    ab.i("MicroMsg.TalkUIController", "onInviteSuccess");
    String str1 = i.bHq().nvN.nwW;
    String str2 = i.bHq().nvN.nwX;
    if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)) && (!str1.equals(str2)))
    {
      ab.i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", new Object[] { str1, str2 });
      Pm(str2);
    }
    ab.i("MicroMsg.TalkUIController", "callFlag:" + i.bHq().nvN.nwK);
    int j = i.bHq().nvN.nwK;
    int k = i;
    if ((j & 0x1) > 0)
    {
      k = i;
      if ((j & 0x2) > 0)
      {
        k = i;
        if ((j & 0x8) <= 0)
          k = 1;
      }
    }
    if (k != 0)
    {
      ab.i("MicroMsg.TalkUIController", "isNotFree");
      com.tencent.mm.ui.base.h.a(this.nGG, 2131300794, 2131300795, 2131300793, 2131300792, true, null, new j.3(this));
    }
    xw(3);
    AppMethodBeat.o(22428);
  }

  public final void bGK()
  {
    AppMethodBeat.i(22429);
    ab.d("MicroMsg.TalkUIController", "onStartRing");
    if (i.bHu().bHl())
    {
      this.nGL = this.nGz.isChecked();
      this.nGM = this.nGz.isChecked();
      i.bHt().io(this.nGz.isChecked());
    }
    AppMethodBeat.o(22429);
  }

  public final void bGX()
  {
    AppMethodBeat.i(22430);
    ab.d("MicroMsg.TalkUIController", "onUserAccept");
    if (i.bHu().bHl())
    {
      this.nGL = this.nGz.isChecked();
      this.nGM = this.nGz.isChecked();
      i.bHt().io(this.nGz.isChecked());
    }
    if (i.bHu().bHm())
      i.bHt().nxg.setMute(this.nGx.isChecked());
    AppMethodBeat.o(22430);
  }

  public final void bGY()
  {
    AppMethodBeat.i(22431);
    ab.d("MicroMsg.TalkUIController", "onOthersideShutdown");
    bIK();
    xw(10);
    aw.getNotification().cancel(42);
    if (this.nGI != null)
      this.nGI.ix(true);
    AppMethodBeat.o(22431);
  }

  public final void bGZ()
  {
    AppMethodBeat.i(22436);
    this.nGG.finish();
    AppMethodBeat.o(22436);
  }

  public final void bHa()
  {
    AppMethodBeat.i(22435);
    this.nGJ = i.bHv().bGU();
    xw(5);
    AppMethodBeat.o(22435);
  }

  public final void bIK()
  {
    AppMethodBeat.i(22437);
    if (this.nGB != null)
      this.nGB.setVisibility(4);
    if (this.nGC != null)
      this.nGC.setVisibility(4);
    AppMethodBeat.o(22437);
  }

  public final void d(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(22432);
    ab.d("MicroMsg.TalkUIController", "onError, error: %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt2 == 1)
      this.nGP = false;
    if (paramInt1 == 8)
      if (paramInt2 == 1)
      {
        if (!bo.isNullOrNil(paramString1))
          break label173;
        paramString1 = this.nGG.getString(2131300714);
      }
    label173: 
    while (true)
    {
      com.tencent.mm.ui.base.h.a(this.nGG, paramString2, paramString1, this.nGG.getString(2131300715), false, new j.4(this));
      while (true)
      {
        aw.getNotification().cancel(42);
        if ((this.nGI != null) && (!this.nGQ))
          this.nGI.ix(this.nGP);
        AppMethodBeat.o(22432);
        return;
        c(paramString1, paramString2, paramInt2, this.nGG.getString(2131300713));
        continue;
        c(paramString1, paramString2, paramInt2, null);
      }
    }
  }

  final void eN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22421);
    this.nGu.setText(paramString1);
    if (!bo.isNullOrNil(paramString1))
      this.nGu.setSelection(this.nGu.getText().length() - 1);
    this.nGv.setText(paramString2);
    AppMethodBeat.o(22421);
  }

  public final void ir(boolean paramBoolean)
  {
    AppMethodBeat.i(22433);
    ab.d("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.bHu().bHl())
      if (paramBoolean)
      {
        i.bHt();
        this.nGL = com.tencent.mm.plugin.ipcall.a.b.a.KU();
        i.bHt().io(false);
        this.nGz.setEnable(false);
        AppMethodBeat.o(22433);
      }
    while (true)
    {
      return;
      i.bHt().io(this.nGL);
      this.nGz.setEnable(true);
      this.nGz.setChecked(this.nGL);
      AppMethodBeat.o(22433);
    }
  }

  public final void is(boolean paramBoolean)
  {
    AppMethodBeat.i(22434);
    ab.d("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.bHu().bHl())
      if (paramBoolean)
      {
        i.bHt();
        this.nGM = com.tencent.mm.plugin.ipcall.a.b.a.KU();
        i.bHt().io(false);
        this.nGz.setEnable(false);
        AppMethodBeat.o(22434);
      }
    while (true)
    {
      return;
      i.bHt().io(this.nGM);
      this.nGz.setEnable(true);
      this.nGz.setChecked(this.nGM);
      AppMethodBeat.o(22434);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.j
 * JD-Core Version:    0.6.2
 */