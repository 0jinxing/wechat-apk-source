package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.protocal.protobuf.bod;
import com.tencent.mm.protocal.protobuf.clu;
import com.tencent.mm.protocal.protobuf.cof;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.cc;
import com.tencent.mm.storage.cd;
import com.tencent.mm.ui.MMActivity;

public class VoiceTransTextUI extends MMActivity
  implements View.OnClickListener, f
{
  private int AL;
  private final String TAG;
  private long edW;
  private ScrollView hJh;
  private int itR;
  private View kRR;
  private bi kua;
  private Button lWE;
  private ak mHandler;
  private int mTouchSlop;
  private long pDz;
  private cc srD;
  private a srJ;
  private c srK;
  private b srL;
  private com.tencent.mm.modelvoice.b srM;
  private volatile boolean srO;
  private boolean srP;
  private ap srQ;
  private View svW;
  private View svX;
  private LinearLayout svY;
  private TextView svZ;
  private int swa;
  private boolean swb;
  private com.tencent.mm.modelvoice.p swc;
  private com.tencent.mm.sdk.b.c swd;
  private boolean swe;
  private boolean swf;
  private int swg;
  private View.OnTouchListener swh;
  private View.OnClickListener swi;
  private ClipboardManager swj;
  private View.OnLongClickListener swk;

  public VoiceTransTextUI()
  {
    AppMethodBeat.i(25609);
    this.TAG = "MicroMsg.VoiceTransTextUI";
    this.kRR = null;
    this.svW = null;
    this.svX = null;
    this.svY = null;
    this.svZ = null;
    this.lWE = null;
    this.hJh = null;
    this.srO = false;
    this.swa = 6;
    this.srP = false;
    this.swb = false;
    this.swe = false;
    this.swf = false;
    this.pDz = 0L;
    this.swi = new VoiceTransTextUI.1(this);
    this.swk = new VoiceTransTextUI.2(this);
    this.mHandler = new VoiceTransTextUI.6(this);
    AppMethodBeat.o(25609);
  }

  private long HB()
  {
    if (this.swc == null);
    for (long l = -1L; ; l = this.swc.cKK)
      return l;
  }

  private void a(VoiceTransTextUI.a parama)
  {
    AppMethodBeat.i(25612);
    cDU();
    switch (VoiceTransTextUI.9.swp[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(25612);
      while (true)
      {
        label54: return;
        ab.i("MicroMsg.VoiceTransTextUI", "net check");
        if (HB() > 0L)
          ab.i("MicroMsg.VoiceTransTextUI", "has msg svr id: %d", new Object[] { Long.valueOf(HB()) });
        for (this.srJ = new a(cDV(), cDW(), cDX().getFormat(), HB(), getFileName()); ; this.srJ = new a(cDV(), cDW(), getFileName()))
        {
          aw.Rg().a(this.srJ, 0);
          aw.Rg().a(this.srJ.getType(), this);
          if (this.swd != null)
            break;
          cDY();
          AppMethodBeat.o(25612);
          break label54;
          ab.i("MicroMsg.VoiceTransTextUI", "not existex msg svr id: %d", new Object[] { Long.valueOf(HB()) });
        }
        ab.i("MicroMsg.VoiceTransTextUI", "net upload");
        if (this.srJ == null)
        {
          ab.d("MicroMsg.VoiceTransTextUI", "request upload must after check!");
          AppMethodBeat.o(25612);
        }
        else if (cDX() == null)
        {
          ab.d("MicroMsg.VoiceTransTextUI", "can't get FileOperator!");
          AppMethodBeat.o(25612);
        }
        else
        {
          this.srK = new c(cDV(), this.srJ.svS, cDX().getFormat(), getFileName());
          aw.Rg().a(this.srK, 0);
          aw.Rg().a(this.srK.getType(), this);
          AppMethodBeat.o(25612);
          continue;
          ab.i("MicroMsg.VoiceTransTextUI", "net upload more");
          if (this.srK == null)
          {
            ab.d("MicroMsg.VoiceTransTextUI", "upload more need has upload netScene!");
            AppMethodBeat.o(25612);
          }
          else
          {
            this.srK = new c(this.srK);
            aw.Rg().a(this.srK, 0);
            aw.Rg().a(this.srK.getType(), this);
            AppMethodBeat.o(25612);
            continue;
            this.swb = false;
            if (this.srO)
            {
              ab.i("MicroMsg.VoiceTransTextUI", "pulling so pass");
              AppMethodBeat.o(25612);
            }
            else
            {
              ab.i("MicroMsg.VoiceTransTextUI", "net get");
              if (this.srJ != null)
                break label487;
              ab.d("MicroMsg.VoiceTransTextUI", "request get must after check!");
              AppMethodBeat.o(25612);
            }
          }
        }
      }
      label487: this.srO = true;
      this.srL = new b(cDV());
      aw.Rg().a(this.srL, 0);
      aw.Rg().a(this.srL.getType(), this);
    }
  }

  private void a(b paramb, String paramString)
  {
    AppMethodBeat.i(25613);
    switch (VoiceTransTextUI.9.swq[paramb.ordinal()])
    {
    default:
      label40: if ((paramb == b.sww) || (paramb == b.swy))
      {
        this.hJh.setOnTouchListener(this.swh);
        this.kRR.setOnClickListener(this.swi);
        AppMethodBeat.o(25613);
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        paramb = b.swy;
        paramString = null;
        break;
      }
      this.svY.setVisibility(0);
      this.svW.setVisibility(8);
      this.lWE.setVisibility(4);
      this.svX.setVisibility(8);
      this.svZ.setText(paramString);
      lZ(true);
      break label40;
      this.svY.setVisibility(0);
      this.svW.setVisibility(0);
      this.lWE.setVisibility(0);
      if (paramString == null)
        break label40;
      this.svZ.setText(paramString);
      lZ(false);
      break label40;
      this.svY.setVisibility(8);
      this.svW.setVisibility(8);
      this.lWE.setHeight(0);
      this.lWE.setVisibility(8);
      this.svX.setVisibility(0);
      break label40;
      this.hJh.setOnTouchListener(null);
      this.kRR.setOnClickListener(null);
      AppMethodBeat.o(25613);
    }
  }

  private cc abi(String paramString)
  {
    AppMethodBeat.i(25616);
    cc localcc = new cc();
    localcc.field_msgId = this.edW;
    localcc.aqa(cDV());
    localcc.field_content = paramString;
    AppMethodBeat.o(25616);
    return localcc;
  }

  private void abs(String paramString)
  {
    AppMethodBeat.i(25620);
    this.srP = true;
    if (!bo.isNullOrNil(paramString))
      com.tencent.mm.modelvoice.m.amb().a(abi(paramString));
    a(b.sww, paramString);
    AppMethodBeat.o(25620);
  }

  private void cDU()
  {
    AppMethodBeat.i(25614);
    ab.d("MicroMsg.VoiceTransTextUI", "cancel all net");
    if (this.srJ != null)
    {
      aw.Rg().c(this.srJ);
      aw.Rg().b(this.srJ.getType(), this);
    }
    if (this.srK != null)
    {
      aw.Rg().c(this.srK);
      aw.Rg().b(this.srK.getType(), this);
    }
    if (this.srL != null)
    {
      aw.Rg().c(this.srL);
      aw.Rg().b(this.srL.getType(), this);
    }
    AppMethodBeat.o(25614);
  }

  private String cDV()
  {
    AppMethodBeat.i(25615);
    String str;
    if (this.swc != null)
    {
      str = this.swc.clientId;
      AppMethodBeat.o(25615);
    }
    while (true)
    {
      return str;
      str = this.kua.field_talker + this.kua.field_msgId + "T" + this.kua.field_createTime;
      AppMethodBeat.o(25615);
    }
  }

  private int cDW()
  {
    AppMethodBeat.i(25617);
    int i;
    if (this.swc != null)
    {
      i = this.swc.frO;
      AppMethodBeat.o(25617);
    }
    while (true)
    {
      return i;
      i = o.uj(this.kua.field_imgPath);
      AppMethodBeat.o(25617);
    }
  }

  private com.tencent.mm.modelvoice.b cDX()
  {
    AppMethodBeat.i(25618);
    if (this.srM == null)
    {
      if (this.swc == null)
        break label47;
      this.srM = com.tencent.mm.modelvoice.q.uN(this.swc.fileName);
    }
    while (true)
    {
      com.tencent.mm.modelvoice.b localb = this.srM;
      AppMethodBeat.o(25618);
      return localb;
      label47: if (this.kua != null)
        this.srM = com.tencent.mm.modelvoice.q.uN(this.kua.field_imgPath);
      else
        ab.d("MicroMsg.VoiceTransTextUI", "error why get fileOperator, already has transContent. ");
    }
  }

  private void cDY()
  {
    AppMethodBeat.i(25622);
    if (this.swd == null)
      this.swd = new VoiceTransTextUI.5(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.swd);
    AppMethodBeat.o(25622);
  }

  private String getFileName()
  {
    if (this.swc != null);
    for (String str = this.swc.fileName; ; str = this.kua.field_imgPath)
      return str;
  }

  private void lZ(boolean paramBoolean)
  {
    AppMethodBeat.i(25624);
    if ((this.hJh == null) || (this.svY == null))
      AppMethodBeat.o(25624);
    while (true)
    {
      return;
      this.mHandler.postDelayed(new VoiceTransTextUI.7(this, paramBoolean), 5L);
      AppMethodBeat.o(25624);
    }
  }

  public final int getLayoutId()
  {
    return 2130971028;
  }

  public final void initView()
  {
    AppMethodBeat.i(25611);
    setMMTitle(2131304336);
    this.lWE.setOnClickListener(this);
    int i;
    if ((this.srD != null) && (!bo.isNullOrNil(this.srD.field_content)))
    {
      a(b.sww, this.srD.field_content);
      if ((this.hJh == null) || (this.svY == null))
      {
        i = 1;
        label71: if (i == 0)
          break label109;
        AppMethodBeat.o(25611);
      }
    }
    while (true)
    {
      return;
      this.mHandler.postDelayed(new VoiceTransTextUI.8(this), 5L);
      break;
      i = 0;
      break label71;
      label109: a(b.swx, null);
      a(VoiceTransTextUI.a.swr);
      AppMethodBeat.o(25611);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(25623);
    finish();
    AppMethodBeat.o(25623);
  }

  public void onCreate(Bundle paramBundle)
  {
    Cursor localCursor = null;
    AppMethodBeat.i(25610);
    super.onCreate(paramBundle);
    this.mTouchSlop = ViewConfiguration.get(this.mController.ylL).getScaledTouchSlop();
    this.swj = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    this.kRR = findViewById(2131828481);
    this.svW = findViewById(2131828486);
    this.svX = findViewById(2131828488);
    this.svZ = ((TextView)findViewById(2131828485));
    this.lWE = ((Button)findViewById(2131828483));
    this.svY = ((LinearLayout)findViewById(2131828482));
    this.hJh = ((ScrollView)findViewById(2131822634));
    this.swh = new VoiceTransTextUI.3(this);
    this.svZ.setOnLongClickListener(this.swk);
    this.svZ.setOnClickListener(this.swi);
    this.edW = getIntent().getExtras().getLong("voice_trans_text_msg_id", -1L);
    int i;
    if (this.edW < 0L)
      i = 0;
    while (true)
    {
      if (i == 0)
      {
        ab.d("MicroMsg.VoiceTransTextUI", "error invalid msgId");
        AppMethodBeat.o(25610);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.VoiceTransTextUI", "msg Id:%d", new Object[] { Long.valueOf(this.edW) });
        cd localcd = com.tencent.mm.modelvoice.m.amb();
        long l = this.edW;
        if (l < 0L)
          paramBundle = localCursor;
        while (true)
        {
          this.srD = paramBundle;
          if ((this.srD == null) || (bo.isNullOrNil(this.srD.field_content)))
            break label364;
          ab.i("MicroMsg.VoiceTransTextUI", "get voiceTransText");
          i = 1;
          break;
          paramBundle = new cc();
          localCursor = localcd.bSd.a("VoiceTransText", null, "msgId=?", new String[] { String.valueOf(l) }, null, null, null, 2);
          if (localCursor.moveToFirst())
            paramBundle.d(localCursor);
          localCursor.close();
        }
        label364: paramBundle = getIntent().getExtras().getString("voice_trans_text_img_path");
        if (bo.isNullOrNil(paramBundle))
        {
          i = 0;
          break;
        }
        this.swc = com.tencent.mm.modelvoice.m.ama().uZ(paramBundle);
        if (this.swc != null)
        {
          ab.i("MicroMsg.VoiceTransTextUI", "get voiceInfo");
          i = 1;
          break;
        }
        aw.ZK();
        this.kua = com.tencent.mm.model.c.XO().jf(this.edW);
        if (this.kua == null)
          break label487;
        ab.i("MicroMsg.VoiceTransTextUI", "get MsgInfo");
        i = 1;
        break;
        paramBundle = getSupportActionBar();
        if (paramBundle != null)
          paramBundle.hide();
        initView();
        AppMethodBeat.o(25610);
      }
      label487: i = 0;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25621);
    cDU();
    if (this.srQ != null)
      this.srQ.stopTimer();
    if (this.swd != null)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.swd);
      this.swd = null;
    }
    super.onDestroy();
    AppMethodBeat.o(25621);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    paramString = null;
    Object localObject = null;
    AppMethodBeat.i(25619);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(25619);
      case 546:
      case 547:
      case 548:
      }
    while (true)
    {
      return;
      if (this.srJ.mState == a.svQ)
      {
        ab.i("MicroMsg.VoiceTransTextUI", "check result: done");
        paramString = localObject;
        if (this.srJ.cDR())
          paramString = this.srJ.svR.xlH;
        abs(paramString);
        AppMethodBeat.o(25619);
      }
      else if (this.srJ.mState == a.svP)
      {
        if ((this.srJ.svR != null) && (bo.isNullOrNil(this.srJ.svR.xlH)))
          a(b.swx, this.srJ.svR.xlH);
        ab.i("MicroMsg.VoiceTransTextUI", "check result: processing");
        a(VoiceTransTextUI.a.swu);
        AppMethodBeat.o(25619);
      }
      else if (this.srJ.mState == a.svO)
      {
        ab.i("MicroMsg.VoiceTransTextUI", "check result: not exist");
        a(VoiceTransTextUI.a.sws);
        AppMethodBeat.o(25619);
      }
      else if (this.srJ.svT != null)
      {
        this.swa = this.srJ.svT.wRe;
        AppMethodBeat.o(25619);
        continue;
        if (this.srK.cDT())
        {
          ab.i("MicroMsg.VoiceTransTextUI", "succeed upload");
          a(VoiceTransTextUI.a.swu);
          AppMethodBeat.o(25619);
        }
        else
        {
          ab.d("MicroMsg.VoiceTransTextUI", "start upload more: start:%d, len:%d", new Object[] { Integer.valueOf(this.srK.svS.ptx), Integer.valueOf(this.srK.svS.pty) });
          a(VoiceTransTextUI.a.swt);
          AppMethodBeat.o(25619);
          continue;
          this.swa = this.srL.svV;
          this.srO = false;
          if ((!this.srL.isComplete()) && (this.srL.cDR()))
          {
            paramm = this.srL.svR.xlH;
            a(b.swx, paramm);
            ab.d("MicroMsg.VoiceTransTextUI", "result valid:%s", new Object[] { this.srL.svR.xlH });
          }
          while (true)
          {
            if (!this.srL.isComplete())
              break label518;
            ab.i("MicroMsg.VoiceTransTextUI", "succeed get");
            if (this.srL.cDR())
              paramString = this.srL.svR.xlH;
            abs(paramString);
            AppMethodBeat.o(25619);
            break;
            if (!this.srL.cDR())
              ab.d("MicroMsg.VoiceTransTextUI", "result not valid");
          }
          label518: if (this.swb)
          {
            ab.i("MicroMsg.VoiceTransTextUI", "do get now! --- Notify new result");
            a(VoiceTransTextUI.a.swu);
            AppMethodBeat.o(25619);
          }
          else
          {
            ab.i("MicroMsg.VoiceTransTextUI", "do get again after:%ds", new Object[] { Integer.valueOf(this.swa) });
            paramInt1 = this.swa;
            if (!this.srP)
            {
              if (this.srQ == null)
                this.srQ = new ap(new VoiceTransTextUI.4(this, paramInt1), false);
              paramString = this.srQ;
              long l = paramInt1 * 1000;
              paramString.ae(l, l);
            }
            AppMethodBeat.o(25619);
            continue;
            this.srP = true;
            a(b.swy, null);
          }
        }
      }
      else
      {
        AppMethodBeat.o(25619);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static enum b
  {
    static
    {
      AppMethodBeat.i(25608);
      sww = new b("done", 0);
      swx = new b("loading", 1);
      swy = new b("fail", 2);
      swz = new b[] { sww, swx, swy };
      AppMethodBeat.o(25608);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI
 * JD-Core Version:    0.6.2
 */