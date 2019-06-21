package com.tencent.mm.plugin.talkroom.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.me;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.talkroom.model.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TalkRoomUI extends MMBaseActivity
  implements f, d
{
  private List<String> cFX;
  private com.tencent.mm.ui.base.p eir;
  private TextView gne;
  private TextView nDX;
  private final ap nNC;
  private boolean nND;
  private Chronometer nNI;
  private int nNJ;
  private boolean nNp;
  private String nNq;
  private String nNr;
  private boolean nNt;
  private int nNu;
  private long nNv;
  private long nNw;
  private ap nNx;
  private ap nNy;
  private ap nNz;
  private float radius;
  private AlphaAnimation szA;
  private AlphaAnimation szB;
  private float szC;
  private float szD;
  private TextView szp;
  private ImageButton szq;
  private Button szr;
  private ImageView szs;
  private TalkRoomVolumeMeter szt;
  private TalkRoomAvatarsFrame szu;
  private a szv;
  private boolean szw;
  private int szx;
  private AlphaAnimation szy;
  private AlphaAnimation szz;
  private PowerManager.WakeLock wakeLock;

  public TalkRoomUI()
  {
    AppMethodBeat.i(25925);
    this.nND = true;
    this.cFX = new LinkedList();
    this.nNu = 0;
    this.nNp = true;
    this.nNy = new ap(new TalkRoomUI.1(this), false);
    this.szw = true;
    this.szx = 0;
    this.nNC = new ap(new TalkRoomUI.10(this), true);
    this.radius = -1.0F;
    this.szC = -1.0F;
    this.szD = -1.0F;
    this.nNt = false;
    this.nNv = 500L;
    this.nNw = 0L;
    this.nNx = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(25910);
        ab.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess expired to execute");
        TalkRoomUI.q(TalkRoomUI.this);
        AppMethodBeat.o(25910);
        return false;
      }
    }
    , false);
    this.nNz = new ap(new TalkRoomUI.9(this), false);
    this.nNJ = 0;
    AppMethodBeat.o(25925);
  }

  private void Fw(int paramInt)
  {
    AppMethodBeat.i(25952);
    if ((paramInt != 0) && (this.nNJ == paramInt))
      AppMethodBeat.o(25952);
    while (true)
    {
      return;
      this.nNI.setVisibility(0);
      this.nNI.startAnimation(this.szy);
      this.nNI.setBase(bo.yz());
      this.nNI.start();
      this.nNJ = paramInt;
      AppMethodBeat.o(25952);
    }
  }

  private void abv(String paramString)
  {
    AppMethodBeat.i(25940);
    if (!this.nND)
    {
      ab.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
      AppMethodBeat.o(25940);
    }
    while (true)
    {
      return;
      this.nND = false;
      com.tencent.mm.plugin.talkroom.model.b.cEh().cEw();
      String str = paramString;
      if (bo.isNullOrNil(paramString))
        if (at.isConnected(getApplication()))
          break label80;
      label80: for (str = getString(2131304005); ; str = getString(2131304004))
      {
        if (!isFinishing())
          break label90;
        AppMethodBeat.o(25940);
        break;
      }
      label90: com.tencent.mm.ui.base.h.a(this, str, "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(25912);
          TalkRoomUI.this.finish();
          AppMethodBeat.o(25912);
        }
      });
      AppMethodBeat.o(25940);
    }
  }

  private void abw(String paramString)
  {
    AppMethodBeat.i(25950);
    m(j.b(this, paramString, this.szp.getTextSize()), 2131690558);
    AppMethodBeat.o(25950);
  }

  private void bJZ()
  {
    AppMethodBeat.i(25937);
    if (this.nNu != 5)
      AppMethodBeat.o(25937);
    while (true)
    {
      return;
      this.nNx.stopTimer();
      bKa();
      cEH();
      ay.a(ah.getContext(), 2131304017, new TalkRoomUI.6(this));
      this.nNy.ae(1000L, 1000L);
      AppMethodBeat.o(25937);
    }
  }

  private void bKa()
  {
    AppMethodBeat.i(25948);
    if (this.nNp)
      AppMethodBeat.o(25948);
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.talkroom.model.b.cEh().syR)
        break;
      m(getString(2131304006), 2131690559);
      this.szu.setCurMemeber(null);
      this.szs.setImageResource(2130840397);
      cEK();
      AppMethodBeat.o(25948);
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
      AppMethodBeat.o(25948);
      break;
      if (!bo.isNullOrNil(this.nNr))
      {
        abw(s.mJ(this.nNr));
        this.szu.setCurMemeber(this.nNr);
        this.szs.setImageResource(2130840397);
        Fw(1);
        AppMethodBeat.o(25948);
        break;
      }
      if (com.tencent.mm.plugin.talkroom.model.b.cEh().bJF().size() == 1);
      for (String str = getString(2131304015); ; str = "")
      {
        m(str, 2131690558);
        this.szu.setCurMemeber(null);
        this.szs.setImageResource(2130840397);
        cEK();
        AppMethodBeat.o(25948);
        break;
      }
      m(getString(2131303993), 2131690558);
      this.szs.setImageResource(2130840400);
      AppMethodBeat.o(25948);
      break;
      m(getString(2131304010), 2131690558);
      this.szu.setCurMemeber(r.Yz());
      this.szs.setImageResource(2130840398);
      Fw(2);
      AppMethodBeat.o(25948);
      break;
      m(getString(2131304009), 2131690559);
      this.szs.setImageResource(2130840399);
      AppMethodBeat.o(25948);
      break;
      m(getString(2131304012), 2131690559);
      this.szs.setImageResource(2130840399);
      cEK();
    }
  }

  private void cEH()
  {
    AppMethodBeat.i(25926);
    if ((this.nNu == 3) || (this.nNu == 5))
    {
      this.szt.setShowFlame(true);
      AppMethodBeat.o(25926);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.nNr))
      {
        this.szt.setShowFlame(true);
        AppMethodBeat.o(25926);
      }
      else
      {
        this.szt.setShowFlame(false);
        AppMethodBeat.o(25926);
      }
    }
  }

  private void cEI()
  {
    AppMethodBeat.i(25946);
    Object localObject = com.tencent.mm.plugin.talkroom.model.b.cEh().bJF();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      localLinkedList.add(((cgm)((Iterator)localObject).next()).jBB);
    this.szu.setMembersList(localLinkedList);
    AppMethodBeat.o(25946);
  }

  private void cEJ()
  {
    AppMethodBeat.i(25949);
    int i = com.tencent.mm.plugin.talkroom.model.b.cEh().bJF().size();
    ab.i("MicroMsg.TalkRoomUI", "displayCount %d", new Object[] { Integer.valueOf(i) });
    this.nDX.setText(String.valueOf(i));
    AppMethodBeat.o(25949);
  }

  private void cEK()
  {
    AppMethodBeat.i(25953);
    if (this.nNJ == 0)
      AppMethodBeat.o(25953);
    while (true)
    {
      return;
      this.nNI.stop();
      this.nNJ = 0;
      this.nNI.startAnimation(this.szz);
      AppMethodBeat.o(25953);
    }
  }

  private void m(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(25951);
    if (bo.isNullOrNil(paramCharSequence.toString()))
    {
      this.szp.startAnimation(this.szB);
      AppMethodBeat.o(25951);
    }
    while (true)
    {
      return;
      this.szp.setTextColor(getResources().getColor(paramInt));
      this.szp.setText(paramCharSequence);
      this.szp.startAnimation(this.szA);
      AppMethodBeat.o(25951);
    }
  }

  public final void aU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(25947);
    ab.i("MicroMsg.TalkRoomUI", "add %s,  del %s", new Object[] { paramString1, paramString2 });
    cEI();
    if (this.nNp)
      AppMethodBeat.o(25947);
    while (true)
    {
      return;
      cEJ();
      if (!bo.isNullOrNil(paramString1))
      {
        abw(getString(2131303994, new Object[] { s.mJ(paramString1) }));
        this.nNz.ae(3000L, 3000L);
      }
      if (!bo.isNullOrNil(paramString2))
      {
        abw(getString(2131303999, new Object[] { s.mJ(paramString2) }));
        this.nNz.ae(3000L, 3000L);
      }
      AppMethodBeat.o(25947);
    }
  }

  public final void akC()
  {
    AppMethodBeat.i(25933);
    this.nNp = false;
    this.szq.setEnabled(true);
    this.szq.setImageResource(2130840401);
    this.szr.setVisibility(0);
    bKa();
    cEJ();
    cEI();
    AppMethodBeat.o(25933);
  }

  public final void akD()
  {
    AppMethodBeat.i(25936);
    ab.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess");
    if (this.nNu != 1)
      AppMethodBeat.o(25936);
    while (true)
    {
      return;
      this.nNu = 5;
      if (bo.az(this.nNw) < this.nNv)
      {
        ab.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess waiting to execute");
        ap localap = this.nNx;
        long l = this.nNv - bo.az(this.nNw);
        localap.ae(l, l);
        AppMethodBeat.o(25936);
      }
      else
      {
        bJZ();
        AppMethodBeat.o(25936);
      }
    }
  }

  public final void akE()
  {
    AppMethodBeat.i(25942);
    if (!this.nND)
    {
      ab.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
      AppMethodBeat.o(25942);
    }
    while (true)
    {
      return;
      this.nND = false;
      finish();
      AppMethodBeat.o(25942);
    }
  }

  public final void akF()
  {
    AppMethodBeat.i(25943);
    bKa();
    AppMethodBeat.o(25943);
  }

  public final void akG()
  {
    AppMethodBeat.i(25944);
    bKa();
    AppMethodBeat.o(25944);
  }

  public final void akH()
  {
    AppMethodBeat.i(25945);
    m(getString(2131304008), 2131690559);
    AppMethodBeat.o(25945);
  }

  public void finish()
  {
    AppMethodBeat.i(25931);
    super.finish();
    AppMethodBeat.o(25931);
  }

  public final void g(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(25938);
    ab.f("MicroMsg.TalkRoomUI", "errType %d, errCode %d, errInfo %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    abv("");
    AppMethodBeat.o(25938);
  }

  public final void l(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(25934);
    ab.f("MicroMsg.TalkRoomUI", "onInitFailed %s", new Object[] { paramString });
    paramString = "";
    if (paramInt1 == 4)
      if (paramInt2 != -1)
      {
        this.nND = false;
        finish();
        AppMethodBeat.o(25934);
      }
    while (true)
    {
      return;
      paramString = getString(2131304004);
      abv(paramString);
      AppMethodBeat.o(25934);
    }
  }

  public final void mk(int paramInt)
  {
    AppMethodBeat.i(25935);
    ab.i("MicroMsg.TalkRoomUI", "onSeizeMicFailed");
    if (paramInt == 340)
      if (this.nNu != 3)
      {
        AppMethodBeat.o(25935);
        return;
      }
    for (this.nNu = 4; ; this.nNu = 2)
    {
      cEH();
      bKa();
      ay.a(ah.getContext(), new TalkRoomUI.4(this));
      AppMethodBeat.o(25935);
      break;
      if (this.nNu != 1)
      {
        AppMethodBeat.o(25935);
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25927);
    ab.d("MicroMsg.TalkRoomUI", "onCreate");
    super.onCreate(paramBundle);
    String str = getIntent().getStringExtra("enter_room_username");
    ab.i("MicroMsg.TalkRoomUI", "onCreate talkRoomName : %s", new Object[] { str });
    ab.d("MicroMsg.TalkRoomUI", "talkRoomName %s ", new Object[] { str });
    this.nNq = str;
    if (bo.isNullOrNil(this.nNq))
    {
      abv("");
      ab.d("MicroMsg.TalkRoomUI", "onCreate before initView");
      setContentView(v.hu(ah.getContext()).inflate(2130970914, null));
      this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(26, "TalkRoomUI Lock");
      this.gne = ((TextView)findViewById(2131821185));
      this.szp = ((TextView)findViewById(2131828212));
      this.nDX = ((TextView)findViewById(2131823158));
      this.szr = ((Button)findViewById(2131828208));
      this.nNI = ((Chronometer)findViewById(2131826443));
      this.szs = ((ImageView)findViewById(2131828213));
      this.szv = new a(this);
      this.szr.setOnClickListener(new TalkRoomUI.11(this));
      findViewById(2131828209).setOnClickListener(new TalkRoomUI.12(this));
      this.szq = ((ImageButton)findViewById(2131828214));
      this.szq.setEnabled(false);
      this.szq.setImageResource(2130840403);
      this.szq.setOnTouchListener(new TalkRoomUI.13(this));
      this.szt = ((TalkRoomVolumeMeter)findViewById(2131824679));
      paramBundle = new TalkRoomUI.14(this);
      findViewById(2131828207).setOnTouchListener(new TalkRoomUI.15(this, paramBundle));
      this.szu = ((TalkRoomAvatarsFrame)findViewById(2131828210));
      this.gne.setOnClickListener(new TalkRoomUI.16(this));
      this.szy = new AlphaAnimation(0.0F, 1.0F);
      this.szy.setDuration(300L);
      this.szy.setFillAfter(true);
      this.szz = new AlphaAnimation(1.0F, 0.0F);
      this.szz.setDuration(300L);
      this.szz.setFillAfter(true);
      this.szA = new AlphaAnimation(0.0F, 1.0F);
      this.szA.setDuration(300L);
      this.szA.setFillAfter(true);
      this.szB = new AlphaAnimation(1.0F, 0.0F);
      this.szB.setDuration(300L);
      this.szB.setFillAfter(true);
      aw.Rg().a(364, this);
      ab.d("MicroMsg.TalkRoomUI", "onCreate before getServer");
      com.tencent.mm.plugin.talkroom.model.b.cEh().a(this);
      ab.d("MicroMsg.TalkRoomUI", "onCreate end");
      AppMethodBeat.o(25927);
      return;
    }
    if (t.kH(str))
    {
      paramBundle = n.my(str);
      if (paramBundle == null)
        ao.a.flu.ai(str, "");
    }
    while (true)
    {
      new ak(Looper.getMainLooper()).post(new TalkRoomUI.3(this, str));
      break;
      this.cFX = paramBundle;
      continue;
      this.cFX.clear();
      this.cFX.add(str);
      this.cFX.add(r.Yz());
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25930);
    com.tencent.mm.plugin.talkroom.model.b.cEh().b(this);
    aw.Rg().b(364, this);
    if ((this.eir != null) && (this.eir.isShowing()))
      this.eir.cancel();
    super.onDestroy();
    AppMethodBeat.o(25930);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(25932);
    if (paramInt == 25)
    {
      aw.ZL().iK(3);
      AppMethodBeat.o(25932);
    }
    while (true)
    {
      return bool;
      if (paramInt == 24)
      {
        aw.ZL().iJ(3);
        AppMethodBeat.o(25932);
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(25932);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(25929);
    super.onPause();
    sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
    this.wakeLock.release();
    this.nNC.stopTimer();
    com.tencent.mm.plugin.talkroom.model.b.cEg().sxK.sxP = false;
    com.tencent.mm.plugin.talkroom.model.b.cEg();
    Object localObject = com.tencent.mm.plugin.talkroom.model.b.cEg().sxK;
    if (((c)localObject).nNp)
      ((c)localObject).abt(ah.getContext().getString(2131304007));
    while (true)
    {
      localObject = new me();
      ((me)localObject).cHX.cHY = false;
      com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, getMainLooper());
      ab.d("MicroMsg.TalkRoomUI", "TalkRoom cancel pause auto download logic");
      AppMethodBeat.o(25929);
      return;
      if (!bo.isNullOrNil(((c)localObject).nMN))
      {
        String str = ah.getContext().getString(2131304013, new Object[] { s.mJ(((c)localObject).nMN) });
        c.cEo();
        ((c)localObject).abt(str);
      }
      else
      {
        ((c)localObject).abt(com.tencent.mm.plugin.talkroom.model.h.aU(ah.getContext(), com.tencent.mm.plugin.talkroom.model.b.cEh().syD));
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(25928);
    super.onResume();
    sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("isTalkroom", true).putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
    this.wakeLock.acquire();
    Object localObject = j.b(this, com.tencent.mm.plugin.talkroom.model.h.aU(this, this.nNq), this.gne.getTextSize());
    this.gne.setText((CharSequence)localObject);
    com.tencent.mm.plugin.talkroom.model.b.cEg().sxK.sxP = true;
    com.tencent.mm.plugin.talkroom.model.b.cEg();
    ab.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    com.tencent.mm.plugin.talkroom.model.b.cEg();
    c.cEo();
    localObject = new me();
    ((me)localObject).cHX.cHY = true;
    com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, getMainLooper());
    ab.d("MicroMsg.TalkRoomUI", "TalkRoom req pause auto download logic");
    AppMethodBeat.o(25928);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25939);
    if ((paramm.getType() == 364) && (this.eir != null) && (this.eir.isShowing()))
      this.eir.cancel();
    AppMethodBeat.o(25939);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void tO(String paramString)
  {
    AppMethodBeat.i(25941);
    ab.d("MicroMsg.TalkRoomUI", "onCurMember %s", new Object[] { paramString });
    this.nNr = paramString;
    cEH();
    bKa();
    if (!bo.isNullOrNil(paramString))
    {
      ay.a(ah.getContext(), 2131304020, new TalkRoomUI.8(this));
      this.nNC.ae(100L, 100L);
      AppMethodBeat.o(25941);
    }
    while (true)
    {
      return;
      this.nNC.stopTimer();
      AppMethodBeat.o(25941);
    }
  }

  abstract class a
  {
    float hke;
    float hkf;
    long szJ;

    private a()
    {
    }

    public abstract void cEL();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI
 * JD-Core Version:    0.6.2
 */