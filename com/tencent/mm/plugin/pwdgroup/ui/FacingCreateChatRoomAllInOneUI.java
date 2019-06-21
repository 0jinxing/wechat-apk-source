package com.tencent.mm.plugin.pwdgroup.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView.a;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView.a;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.aam;
import com.tencent.mm.protocal.protobuf.aan;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMScrollGridView;
import java.util.HashMap;
import java.util.LinkedList;

public class FacingCreateChatRoomAllInOneUI extends MMActivity
  implements f
{
  private b.a ecy;
  private String elr;
  private ProgressDialog gqo;
  private boolean jIN;
  private ak mHandler;
  private boolean nPX;
  private d pqN;
  private boolean pqO;
  private boolean pqP;
  private boolean pqQ;
  private boolean pqR;
  private boolean pqS;
  private Location pqT;
  private String pqU;
  private MMPwdInputView pqV;
  private View pqW;
  private ProgressBar pqX;
  private TextView pqY;
  private MMKeyBoardView pqZ;
  private View.OnClickListener prA;
  public MMKeyBoardView.a prB;
  private ap prC;
  private TextView pra;
  private boolean prb;
  private boolean prc;
  private LinkedList<aan> prd;
  private HashMap<String, aan> pre;
  private LinkedList<aan> prf;
  private a prg;
  private View prh;
  private TextView pri;
  private MMScrollGridView prj;
  private View prk;
  private View prl;
  private Button prm;
  private MMCallBackScrollView prn;
  private TextView pro;
  private boolean prp;
  private al prq;
  private ap prr;
  private com.tencent.mm.plugin.pwdgroup.a.a prs;
  private com.tencent.mm.plugin.pwdgroup.a.a prt;
  private int pru;
  private Animation prv;
  private AnimationSet prw;
  private Animation prx;
  public MenuItem.OnMenuItemClickListener pry;
  public MMPwdInputView.a prz;

  public FacingCreateChatRoomAllInOneUI()
  {
    AppMethodBeat.i(24007);
    this.pqO = false;
    this.pqS = false;
    this.prb = false;
    this.prc = false;
    this.jIN = false;
    this.prd = new LinkedList();
    this.pre = new HashMap();
    this.prf = new LinkedList();
    this.prp = false;
    this.prq = new al();
    this.prr = new ap(new FacingCreateChatRoomAllInOneUI.1(this), false);
    this.mHandler = new FacingCreateChatRoomAllInOneUI.11(this);
    this.pry = new FacingCreateChatRoomAllInOneUI.12(this);
    this.prz = new FacingCreateChatRoomAllInOneUI.13(this);
    this.prA = new FacingCreateChatRoomAllInOneUI.14(this);
    this.prB = new FacingCreateChatRoomAllInOneUI.15(this);
    this.ecy = new b.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        AppMethodBeat.i(24001);
        ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1), Double.valueOf(paramAnonymousDouble2) });
        if (paramAnonymousBoolean)
        {
          Location localLocation = new Location(paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2, paramAnonymousInt, "", "");
          if (!localLocation.dhR())
          {
            FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, localLocation);
            FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this, true);
            FacingCreateChatRoomAllInOneUI.e(FacingCreateChatRoomAllInOneUI.this);
          }
        }
        while (true)
        {
          AppMethodBeat.o(24001);
          return false;
          if ((!FacingCreateChatRoomAllInOneUI.j(FacingCreateChatRoomAllInOneUI.this)) && (!d.agA()))
          {
            FacingCreateChatRoomAllInOneUI.k(FacingCreateChatRoomAllInOneUI.this);
            h.a(FacingCreateChatRoomAllInOneUI.this, FacingCreateChatRoomAllInOneUI.this.getString(2131300421), FacingCreateChatRoomAllInOneUI.this.getString(2131297061), FacingCreateChatRoomAllInOneUI.this.getString(2131300878), FacingCreateChatRoomAllInOneUI.this.getString(2131296868), false, new FacingCreateChatRoomAllInOneUI.16.1(this), null);
          }
          FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this, false);
        }
      }
    };
    this.prC = new ap(new FacingCreateChatRoomAllInOneUI.17(this), false);
    AppMethodBeat.o(24007);
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(24021);
    h.a(this, paramString, "", getString(2131296994), new FacingCreateChatRoomAllInOneUI.6(this));
    AppMethodBeat.o(24021);
  }

  private void a(FacingCreateChatRoomAllInOneUI.a parama)
  {
    AppMethodBeat.i(24019);
    if (this.pqY != null);
    switch (FacingCreateChatRoomAllInOneUI.10.prG[parama.ordinal()])
    {
    default:
      ab.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "unknow statue tip");
      AppMethodBeat.o(24019);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      jU(true);
      this.pqO = false;
      this.pqS = false;
      this.pqX.setVisibility(8);
      this.pqY.setVisibility(8);
      AppMethodBeat.o(24019);
      continue;
      jU(false);
      this.pqY.setText(2131302117);
      this.pqX.setVisibility(0);
      this.pqY.setVisibility(8);
      AppMethodBeat.o(24019);
      continue;
      jU(true);
      this.pqX.setVisibility(8);
      this.pqY.setVisibility(0);
      this.pqY.setText(2131302114);
      cbV();
      AppMethodBeat.o(24019);
      continue;
      jU(true);
      this.pqX.setVisibility(8);
      this.pqY.setVisibility(0);
      this.pqY.setText(2131302116);
      cbV();
      AppMethodBeat.o(24019);
    }
  }

  private void aps()
  {
    AppMethodBeat.i(24009);
    this.pqN = d.agz();
    this.pqN.a(this.ecy, true);
    aw.Rg().a(653, this);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    initView();
    AppMethodBeat.o(24009);
  }

  private void bJc()
  {
    AppMethodBeat.i(24020);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(24020);
  }

  private void cbT()
  {
    AppMethodBeat.i(24022);
    this.jIN = false;
    if (this.prr != null)
      this.prr.ae(0L, 0L);
    AppMethodBeat.o(24022);
  }

  private void cbU()
  {
    AppMethodBeat.i(24023);
    this.jIN = true;
    if (this.prr != null)
      this.prr.stopTimer();
    aw.Rg().c(this.prs);
    AppMethodBeat.o(24023);
  }

  private void cbV()
  {
    AppMethodBeat.i(24024);
    Animation localAnimation1 = AnimationUtils.loadAnimation(this, 2131034126);
    final Animation localAnimation2 = AnimationUtils.loadAnimation(this, 2131034125);
    localAnimation1.setInterpolator(new AccelerateDecelerateInterpolator());
    localAnimation1.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(23990);
        FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).axQ();
        FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).startAnimation(localAnimation2);
        AppMethodBeat.o(23990);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    localAnimation2.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(23991);
        if (FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this) != null)
          FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).setKeyBoardEnable(true);
        AppMethodBeat.o(23991);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    if (this.pqV != null)
      this.pqV.startAnimation(localAnimation1);
    if (this.pqZ != null)
      this.pqZ.setKeyBoardEnable(false);
    AppMethodBeat.o(24024);
  }

  private void jU(boolean paramBoolean)
  {
    AppMethodBeat.i(24018);
    if (this.pqZ != null)
      this.pqZ.setKeyBoardEnable(paramBoolean);
    AppMethodBeat.o(24018);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969489;
  }

  public final void initView()
  {
    AppMethodBeat.i(24015);
    setMMTitle(2131299818);
    setBackBtn(this.pry);
    xE(getResources().getColor(2131690597));
    this.pqW = findViewById(2131823871);
    this.pqX = ((ProgressBar)findViewById(2131823872));
    this.pqY = ((TextView)findViewById(2131823873));
    this.pqZ = ((MMKeyBoardView)findViewById(2131823874));
    this.pra = ((TextView)findViewById(2131823863));
    this.pqV = ((MMPwdInputView)findViewById(2131823867));
    this.pqV.setOnFinishInputListener(this.prz);
    this.pqV.requestFocus();
    this.pqZ.setOnInputDeleteListener(this.prB);
    a(FacingCreateChatRoomAllInOneUI.a.prI);
    this.prh = findViewById(2131823868);
    this.pri = ((TextView)findViewById(2131823869));
    this.prj = ((MMScrollGridView)findViewById(2131823870));
    this.prj.setVisibility(4);
    this.prm = ((Button)findViewById(2131823876));
    this.prm.setOnClickListener(this.prA);
    this.prk = findViewById(2131823865);
    this.prl = findViewById(2131823875);
    this.pri.setText(2131299566);
    this.prn = ((MMCallBackScrollView)findViewById(2131823864));
    this.pro = ((TextView)findViewById(2131823866));
    this.prn.setMMOnScrollListener(new FacingCreateChatRoomAllInOneUI.3(this));
    this.prg = new a(this);
    this.prj.setAdapter(this.prg);
    this.prg.setData(this.prd);
    AppMethodBeat.o(24015);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24014);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 30764)
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
        {
          g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
          com.tencent.mm.pluginsdk.permission.b.b(this, "android.permission.ACCESS_COARSE_LOCATION", 64);
          AppMethodBeat.o(24014);
        }
      }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(24014);
      continue;
      finish();
      AppMethodBeat.o(24014);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(24017);
    super.onBackPressed();
    finish();
    AppMethodBeat.o(24017);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24008);
    this.ylm = true;
    super.onCreate(paramBundle);
    if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
    {
      if (com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.ACCESS_COARSE_LOCATION"))
        break label166;
      if (!((Boolean)g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
      {
        com.tencent.mm.plugin.account.a.b.a.b(this, getString(2131305910, new Object[] { aa.dor() }), 30764, true);
        AppMethodBeat.o(24008);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.permission.b.b(this, "android.permission.ACCESS_COARSE_LOCATION", 64);
      AppMethodBeat.o(24008);
      continue;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      ab.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        AppMethodBeat.o(24008);
      }
      else
      {
        label166: aps();
        AppMethodBeat.o(24008);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24013);
    aw.Rg().b(653, this);
    if (this.pqN != null)
      this.pqN.c(this.ecy);
    if (!this.prc)
    {
      aw.Rg().cancel(653);
      if (this.pqT != null)
      {
        this.prt = new com.tencent.mm.plugin.pwdgroup.a.a(2, this.pqU, "", this.pqT.fBr, this.pqT.fBs, this.pqT.accuracy, this.pqT.cGo, this.pqT.mac, this.pqT.cGq);
        aw.Rg().a(this.prt, 0);
      }
    }
    if (this.prp)
      cbU();
    super.onDestroy();
    AppMethodBeat.o(24013);
  }

  public void onPause()
  {
    AppMethodBeat.i(24012);
    if (this.pqN != null)
      this.pqN.c(this.ecy);
    if (this.prp)
      cbU();
    super.onPause();
    AppMethodBeat.o(24012);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(24010);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(24010);
      return;
    }
    ab.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(24010);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        aps();
        AppMethodBeat.o(24010);
        break;
      }
      h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(24003);
          FacingCreateChatRoomAllInOneUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          FacingCreateChatRoomAllInOneUI.this.finish();
          AppMethodBeat.o(24003);
        }
      }
      , new FacingCreateChatRoomAllInOneUI.2(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(24011);
    if (this.pqN != null)
      this.pqN.a(this.ecy, true);
    if (this.prp)
      cbT();
    super.onResume();
    AppMethodBeat.o(24011);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(24016);
    ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    default:
      ab.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd] unknow scene type");
      AppMethodBeat.o(24016);
    case 653:
    }
    while (true)
    {
      return;
      paramm = (com.tencent.mm.plugin.pwdgroup.a.a)paramm;
      int i = paramm.czW;
      if (i == 0)
      {
        this.pqR = false;
        if (this.prp)
        {
          if (this.prr != null)
            this.prr.ae(3000L, 3000L);
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break;
          paramString = paramm.cbS().vEh;
          this.prq.aa(new FacingCreateChatRoomAllInOneUI.7(this, paramString));
          this.elr = paramm.cbS().wdB;
          AppMethodBeat.o(24016);
          continue;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          a(FacingCreateChatRoomAllInOneUI.a.prI);
          this.pru = this.pra.getHeight();
          ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "mFacingInputMsgViewHeigth:%d", new Object[] { Integer.valueOf(this.pru) });
          this.prv = AnimationUtils.loadAnimation(this, 2131034173);
          this.prx = AnimationUtils.loadAnimation(this, 2131034166);
          this.prw = new AnimationSet(true);
          this.prw.addAnimation(AnimationUtils.loadAnimation(this, 2131034246));
          paramString = new TranslateAnimation(0.0F, 0.0F, 0.0F, -this.pru);
          paramString.setDuration(300L);
          this.prw.addAnimation(paramString);
          this.prv.setDuration(200L);
          this.prw.setDuration(300L);
          this.prx.setDuration(300L);
          this.prv.setInterpolator(new AccelerateDecelerateInterpolator());
          this.prw.setInterpolator(new AccelerateDecelerateInterpolator());
          this.prx.setInterpolator(new AccelerateDecelerateInterpolator());
          this.prw.setFillAfter(true);
          paramString.setFillAfter(true);
          this.prw.setAnimationListener(new FacingCreateChatRoomAllInOneUI.4(this));
          this.pqV.setVisibility(4);
          this.pqV.setAnimation(paramString);
          this.pqZ.startAnimation(this.prv);
          this.pqW.startAnimation(this.prv);
          this.pra.startAnimation(this.prv);
          this.prk.startAnimation(this.prx);
          this.prh.startAnimation(this.prw);
          this.prk.setVisibility(4);
          this.pqZ.setVisibility(8);
          this.pra.setVisibility(8);
          this.prp = true;
          cbT();
          AppMethodBeat.o(24016);
          continue;
        }
        if (paramInt2 == -431)
        {
          this.pqO = true;
          a(FacingCreateChatRoomAllInOneUI.a.prK);
          AppMethodBeat.o(24016);
          continue;
        }
        this.pqO = true;
        a(FacingCreateChatRoomAllInOneUI.a.prL);
        AppMethodBeat.o(24016);
        continue;
      }
      if (i == 3)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break;
        if (paramInt2 == -431)
        {
          a(FacingCreateChatRoomAllInOneUI.a.prK);
          this.pqO = true;
          AppMethodBeat.o(24016);
          continue;
        }
        a(FacingCreateChatRoomAllInOneUI.a.prL);
        AppMethodBeat.o(24016);
        continue;
      }
      if (i == 1)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          bJc();
          paramm = paramm.cbS().vEf;
          ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "ChatRoomName is:%s", new Object[] { String.valueOf(paramm) });
          this.prc = true;
          finish();
          paramString = new Intent();
          paramString.putExtra("Chat_User", paramm);
          com.tencent.mm.plugin.pwdgroup.a.gkE.d(paramString, this);
          AppMethodBeat.o(24016);
          continue;
        }
        if ((paramInt2 == -432) && (!this.prb))
        {
          this.prb = true;
          this.mHandler.sendEmptyMessageDelayed(10002, 3000L);
          AppMethodBeat.o(24016);
          continue;
        }
        if (paramInt2 == -23)
        {
          bJc();
          JN(getString(2131299568));
          if (this.prr == null)
            break;
          this.prr.ae(3000L, 3000L);
          AppMethodBeat.o(24016);
          continue;
        }
        bJc();
        paramString = com.tencent.mm.h.a.jY(paramString);
        if (paramString != null)
          paramString.a(this.mController.ylL, null, null);
        while (true)
        {
          if (this.prr != null)
            this.prr.ae(3000L, 3000L);
          AppMethodBeat.o(24016);
          break;
          JN(getString(2131302116));
        }
      }
      bJc();
      AppMethodBeat.o(24016);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI
 * JD-Core Version:    0.6.2
 */