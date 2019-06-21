package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bg.c;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ay.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class k
  implements f, com.tencent.mm.bg.d
{
  private Activity activity;
  private List<String> cFX;
  public c nNA;
  public k.a nNB;
  final ap nNC;
  private boolean nND;
  Button nNm;
  public VolumeMeter nNn;
  RelativeLayout nNo;
  private boolean nNp;
  private String nNq;
  String nNr;
  private String nNs;
  boolean nNt;
  int nNu;
  private long nNv;
  long nNw;
  ap nNx;
  ap nNy;
  private ap nNz;

  public k(Activity paramActivity, Button paramButton)
  {
    AppMethodBeat.i(113538);
    this.nNp = true;
    this.cFX = new LinkedList();
    this.nNt = false;
    this.nNu = 0;
    this.nNv = 500L;
    this.nNw = 0L;
    this.nNx = new ap(new k.1(this), false);
    this.nNy = new ap(new k.2(this), false);
    this.nNz = new ap(new k.3(this), false);
    this.nNC = new ap(new k.5(this), true);
    this.nND = true;
    this.activity = paramActivity;
    this.nNm = paramButton;
    this.nNo = ((RelativeLayout)this.activity.findViewById(2131824678));
    this.nNo.setVisibility(8);
    this.nNn = ((VolumeMeter)this.nNo.findViewById(2131824679));
    this.nNn.setArchView(this.nNm);
    paramActivity = this.nNn;
    if (paramActivity.nOk == null)
      com.tencent.mm.sdk.g.d.a(new VolumeMeter.1(paramActivity), "VolumeMeter_handler", 1).start();
    this.nNA = com.tencent.mm.bg.g.fUt;
    if (this.nNA == null)
      ab.e("MicroMsg.TalkMgr", "cannot get talkroom server");
    AppMethodBeat.o(113538);
  }

  public static void bKb()
  {
    AppMethodBeat.i(113542);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    a.xxA.m(localsz);
    com.tencent.mm.compatible.b.g.KK().setMode(0);
    AppMethodBeat.o(113542);
  }

  public final void aU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(113548);
    ab.i("MicroMsg.TalkMgr", "add %s,  del %s", new Object[] { paramString1, paramString2 });
    if (this.nNp)
      AppMethodBeat.o(113548);
    while (true)
    {
      return;
      AppMethodBeat.o(113548);
    }
  }

  public final void akC()
  {
    AppMethodBeat.i(113543);
    this.nNp = false;
    this.nNm.setEnabled(true);
    bKa();
    AppMethodBeat.o(113543);
  }

  public final void akD()
  {
    AppMethodBeat.i(113545);
    if (this.nNu != 1)
      AppMethodBeat.o(113545);
    while (true)
    {
      return;
      this.nNu = 5;
      if (bo.az(this.nNw) < this.nNv)
      {
        ab.i("MicroMsg.TalkMgr", "onSeizeMicSuccess waiting to execute");
        ap localap = this.nNx;
        long l = this.nNv - bo.az(this.nNw);
        localap.ae(l, l);
        AppMethodBeat.o(113545);
      }
      else
      {
        bJZ();
        AppMethodBeat.o(113545);
      }
    }
  }

  public final void akE()
  {
  }

  public final void akF()
  {
    AppMethodBeat.i(113549);
    bKa();
    AppMethodBeat.o(113549);
  }

  public final void akG()
  {
    AppMethodBeat.i(113550);
    bKa();
    AppMethodBeat.o(113550);
  }

  public final void akH()
  {
  }

  public final void bJY()
  {
    AppMethodBeat.i(113539);
    this.nNs = this.activity.getIntent().getStringExtra("map_talker_name");
    this.nNA.a(this);
    ab.d("MicroMsg.TalkMgr", "talkRoomName %s ", new Object[] { this.nNs });
    String str = this.nNs;
    this.nNq = str;
    List localList;
    if (!bo.isNullOrNil(this.nNq))
    {
      if (!t.kH(str))
        break label153;
      localList = n.my(str);
      if (localList != null)
        break label145;
      ao.a.flu.ai(str, "");
    }
    while (true)
    {
      new ak(Looper.getMainLooper()).post(new k.6(this, str));
      this.nNm.setOnTouchListener(new k.7(this));
      AppMethodBeat.o(113539);
      return;
      label145: this.cFX = localList;
      continue;
      label153: this.cFX.clear();
      this.cFX.add(str);
      this.cFX.add(r.Yz());
    }
  }

  final void bJZ()
  {
    AppMethodBeat.i(113540);
    if (this.nNu != 5)
      AppMethodBeat.o(113540);
    while (true)
    {
      return;
      this.nNx.stopTimer();
      bKa();
      ay.a(ah.getContext(), 2131304017, new ay.a()
      {
        public final void EA()
        {
          AppMethodBeat.i(113533);
          k.this.nNy.stopTimer();
          k.a(k.this);
          AppMethodBeat.o(113533);
        }
      });
      this.nNy.ae(1000L, 1000L);
      AppMethodBeat.o(113540);
    }
  }

  final void bKa()
  {
    AppMethodBeat.i(113541);
    if (this.nNp)
    {
      AppMethodBeat.o(113541);
      return;
    }
    if (com.tencent.mm.bg.g.fUt.akB())
    {
      ab.d("MicroMsg.TalkMgr", "talkRoomServer pausing");
      if (this.nNB != null)
      {
        this.nNB.PY(null);
        this.nNB.bJW();
      }
    }
    switch (this.nNu)
    {
    default:
    case 0:
    case 1:
    case 3:
    case 5:
    case 2:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(113541);
      break;
      ab.d("MicroMsg.TalkMgr", "seize, state_idle, curUsername = %s", new Object[] { this.nNr });
      if (this.nNB != null)
      {
        if (!bo.isNullOrNil(this.nNr))
        {
          this.nNB.PY(this.nNr);
          AppMethodBeat.o(113541);
          break;
        }
        this.nNB.PY(null);
        AppMethodBeat.o(113541);
        break;
        ab.d("MicroMsg.TalkMgr", "seize, state seizing");
        if (this.nNB != null)
        {
          this.nNB.bJX();
          AppMethodBeat.o(113541);
          break;
          ab.d("MicroMsg.TalkMgr", "seize, state success or prepare");
          if (this.nNB != null)
          {
            this.nNB.bJV();
            AppMethodBeat.o(113541);
            break;
            ab.d("MicroMsg.TalkMgr", "seize error, curUsername = %s", new Object[] { this.nNr });
            if ((this.nNB != null) && (!bo.isNullOrNil(this.nNr)))
            {
              this.nNB.PZ(this.nNr);
              AppMethodBeat.o(113541);
              break;
              ab.d("MicroMsg.TalkMgr", "seize time out");
            }
          }
        }
      }
    }
  }

  public final void g(int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void l(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113544);
    ab.f("MicroMsg.TalkMgr", "onInitFailed %s", new Object[] { paramString });
    l.bJy().xC(3);
    this.activity.finish();
    AppMethodBeat.o(113544);
  }

  public final void mk(int paramInt)
  {
    AppMethodBeat.i(113546);
    ab.i("MicroMsg.TalkMgr", "onSeizeMicFailed");
    if (paramInt == 340)
      if (this.nNu != 3)
      {
        AppMethodBeat.o(113546);
        return;
      }
    for (this.nNu = 4; ; this.nNu = 2)
    {
      bKa();
      ay.a(ah.getContext(), null);
      AppMethodBeat.o(113546);
      break;
      if (this.nNu != 1)
      {
        AppMethodBeat.o(113546);
        break;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public final void tO(String paramString)
  {
    AppMethodBeat.i(113547);
    ab.d("MicroMsg.TalkMgr", "onCurMember change %s", new Object[] { paramString });
    this.nNr = paramString;
    bKa();
    if (!bo.isNullOrNil(paramString))
    {
      ay.au(ah.getContext(), 2131304020);
      this.nNC.ae(100L, 100L);
      AppMethodBeat.o(113547);
    }
    while (true)
    {
      return;
      this.nNC.stopTimer();
      AppMethodBeat.o(113547);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.k
 * JD-Core Version:    0.6.2
 */