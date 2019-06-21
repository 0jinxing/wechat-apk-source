package com.tencent.mm.plugin.voip.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.voip.model.VoipMgr;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.s;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.widget.VoipForegroundService;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import java.lang.ref.WeakReference;

@com.tencent.mm.kernel.i
@com.tencent.mm.ui.base.a(3)
@SuppressLint({"SimpleDateFormat"})
public class VideoActivity extends MMActivity
  implements ServiceConnection, VoipBaseFragment.d, b
{
  private String edV;
  private ak iGP;
  private boolean mIsMute;
  private int mStatus;
  private boolean maH;
  private com.tencent.mm.sdk.b.c oCY;
  private Point qLw;
  private CaptureView sRg;
  private ad sRl;
  private boolean sRm;
  private boolean sRn;
  private int sRr;
  private VoipBaseFragment sVX;
  private WeakReference<c> sVY;
  private long sVZ;
  private long sWa;
  private boolean sWb;
  private int sWc;
  private boolean sWd;
  private boolean sWe;
  private boolean sWf;
  private VideoActivity.ScreenActionReceiver sWg;
  private byte[] sWh;
  private boolean sWi;
  private com.tencent.mm.sdk.b.c sWj;
  private long sWk;

  public VideoActivity()
  {
    AppMethodBeat.i(4803);
    this.sVZ = -1L;
    this.maH = false;
    this.sWa = 0L;
    this.sWb = false;
    this.sRr = 1;
    this.mIsMute = false;
    this.sWc = 1;
    this.sWd = false;
    this.sWe = false;
    this.sWf = false;
    this.sWi = false;
    this.sWj = new VideoActivity.1(this);
    this.oCY = new VideoActivity.9(this);
    AppMethodBeat.o(4803);
  }

  private int bHJ()
  {
    AppMethodBeat.i(4826);
    int i;
    if (com.tencent.mm.compatible.b.g.KK().KP())
    {
      i = com.tencent.mm.compatible.b.g.KK().Lc();
      AppMethodBeat.o(4826);
      return i;
    }
    int j;
    if (!com.tencent.mm.plugin.voip.a.b.GN(this.mStatus))
    {
      j = 2;
      if (this.sRm)
        if (!this.sRn)
        {
          if (com.tencent.mm.compatible.e.q.etd.eqm < 0)
            break label215;
          j = com.tencent.mm.compatible.e.q.etd.eqm;
        }
    }
    while (true)
    {
      label72: i = j;
      if (!com.tencent.mm.compatible.b.g.KK().KP())
      {
        i = j;
        if (com.tencent.mm.compatible.e.q.etd.eqo < 0);
      }
      for (i = com.tencent.mm.compatible.e.q.etd.eqo; ; i = com.tencent.mm.plugin.voip.b.cIj().cIt())
      {
        ab.d("MicroMsg.Voip.VideoActivity", "Current StreamType:%d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(4826);
        break;
        j = 3;
        if (com.tencent.mm.compatible.b.g.KK().KV())
        {
          if (com.tencent.mm.compatible.e.q.etd.eqm < 0)
            break label215;
          j = com.tencent.mm.compatible.e.q.etd.eqm;
          break label72;
        }
        if (com.tencent.mm.compatible.e.q.etd.eqj < 0)
          break label72;
        j = com.tencent.mm.compatible.e.q.etd.eqj;
        break label72;
        if (!com.tencent.mm.compatible.b.g.KK().KV())
          break label72;
        if (com.tencent.mm.compatible.e.q.etd.eqm < 0)
          break label215;
        j = com.tencent.mm.compatible.e.q.etd.eqm;
        break label72;
      }
      label215: j = 0;
    }
  }

  private static boolean bRR()
  {
    AppMethodBeat.i(4806);
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)ah.getContext().getSystemService("phone");
      if (localTelephonyManager != null)
      {
        i = localTelephonyManager.getCallState();
        switch (i)
        {
        default:
          bool = false;
        case 0:
        case 1:
        case 2:
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          int i;
          ab.i("MicroMsg.Voip.VideoActivity", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(4806);
          return bool;
          bool = false;
          continue;
          bool = true;
          continue;
          localException1 = localException1;
          bool = false;
          ab.e("MicroMsg.Voip.VideoActivity", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        boolean bool = false;
      }
    }
  }

  private void cJz()
  {
    AppMethodBeat.i(4807);
    this.iGP.postDelayed(new VideoActivity.7(this), 2000L);
    AppMethodBeat.o(4807);
  }

  private void cKV()
  {
    AppMethodBeat.i(4810);
    if ((this.sVY != null) && (this.sVY.get() != null) && (!this.sRm))
    {
      if (!this.sRn)
        break label91;
      ((c)this.sVY.get()).cJn();
    }
    while (true)
    {
      if ((com.tencent.mm.plugin.voip.b.cIj().con) && (this.sRn))
        ((c)this.sVY.get()).cJv();
      AppMethodBeat.o(4810);
      return;
      label91: ((c)this.sVY.get()).cJq();
    }
  }

  private void cKX()
  {
    AppMethodBeat.i(4816);
    ab.b("MicroMsg.Voip.VideoActivity", "unbindVoiceServiceIfNeed and isBindVoipForegroundService" + this.sWf, new Object[0]);
    try
    {
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (this.sWf))
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setClass(ah.getContext(), VoipForegroundService.class);
        ah.getContext().stopService(localIntent);
        this.sWf = false;
      }
      AppMethodBeat.o(4816);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VideoActivity", localException, "unBind vidoeforeground error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(4816);
      }
    }
  }

  public final void GC(int paramInt)
  {
    AppMethodBeat.i(4827);
    this.sRr = paramInt;
    if (this.sVX != null)
      this.sVX.GC(paramInt);
    AppMethodBeat.o(4827);
  }

  public final void S(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(4837);
    this.sWb = paramBoolean2;
    if (paramBoolean1)
    {
      cJz();
      AppMethodBeat.o(4837);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(4837);
    }
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(4821);
    if (this.sVX != null)
      this.sVX.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.o(4821);
  }

  public final void abY(String paramString)
  {
    AppMethodBeat.i(4824);
    if (this.sVX != null)
      this.iGP.post(new VideoActivity.12(this, paramString));
    AppMethodBeat.o(4824);
  }

  public final void bIK()
  {
    AppMethodBeat.i(4836);
    ab.d("MicroMsg.Voip.VideoActivity", "dismissNetStatusWarning");
    if (this.sVX != null)
      this.sVX.cKY();
    AppMethodBeat.o(4836);
  }

  public final void br(final int paramInt, String paramString)
  {
    AppMethodBeat.i(4823);
    ab.i("MicroMsg.Voip.VideoActivity", "onError, errCode:%d, isVideoCall:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.sRn) });
    this.maH = true;
    if (paramInt == 241)
    {
      com.tencent.mm.ui.base.h.b(this, paramString, null, true);
      AppMethodBeat.o(4823);
    }
    while (true)
    {
      return;
      this.iGP.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(4799);
          VideoActivity.a(VideoActivity.this, paramInt);
          AppMethodBeat.o(4799);
        }
      });
      AppMethodBeat.o(4823);
    }
  }

  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4829);
    if (this.sVX != null)
      this.sVX.c(paramInt1, paramInt2, paramArrayOfInt);
    AppMethodBeat.o(4829);
  }

  public final void cJD()
  {
    AppMethodBeat.i(4830);
    if (this.sVX != null)
      this.sVX.cJD();
    AppMethodBeat.o(4830);
  }

  public final Context cKS()
  {
    return this.mController.ylL;
  }

  public final void cKT()
  {
    AppMethodBeat.i(4839);
    if ((this.sVX instanceof VoipVideoFragment))
      ((VoipVideoFragment)this.sVX).cKT();
    AppMethodBeat.o(4839);
  }

  public final byte[] cKU()
  {
    AppMethodBeat.i(4822);
    if ((this.sVX != null) && (this.sVX.getFilterData() != null))
      this.sVX.getFilterData().a(new VideoActivity.10(this));
    byte[] arrayOfByte = this.sWh;
    AppMethodBeat.o(4822);
    return arrayOfByte;
  }

  public final void cKW()
  {
    AppMethodBeat.i(4815);
    ab.c("MicroMsg.Voip.VideoActivity", "bindVoipForegroundIfNeed and isBindVoipForegroundService" + this.sWf, new Object[0]);
    try
    {
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (!this.sWf))
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("Voip_User", this.sRl.field_username);
        localIntent.putExtra("Voip_VideoCall", this.sRn);
        localIntent.setClass(ah.getContext(), VoipForegroundService.class);
        ah.getContext().startForegroundService(localIntent);
        this.sWf = true;
      }
      AppMethodBeat.o(4815);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VideoActivity", localException, "bindVoipForegroundIfNeed error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(4815);
      }
    }
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(4825);
    ae.h(ae.a(getWindow(), null), this.mController.ylv);
    ((ViewGroup)getWindow().getDecorView()).addView(paramView, 0);
    AppMethodBeat.o(4825);
  }

  public final void fY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4808);
    this.mStatus = paramInt2;
    if ((1 != this.sWc) && (paramInt2 != 8) && (paramInt2 != 262))
    {
      ab.i("MicroMsg.Voip.VideoActivity", "activity is not normal, can't transform");
      AppMethodBeat.o(4808);
    }
    while (true)
    {
      return;
      if (this.sVX != null)
        break;
      ab.i("MicroMsg.Voip.VideoActivity", "mBaseFragment is null ,already close,now return.");
      AppMethodBeat.o(4808);
    }
    this.sVX.fY(paramInt1, paramInt2);
    switch (paramInt2)
    {
    default:
      label148: switch (paramInt1)
      {
      default:
      case 4099:
      case 4100:
      }
      break;
    case 1:
    case 3:
    case 7:
    case 257:
    case 261:
    case 8:
    case 262:
    }
    while (true)
    {
      AppMethodBeat.o(4808);
      break;
      this.sRn = false;
      if ((this.sVX != null) && ((this.sVX instanceof VoipVoiceFragment)))
        break label148;
      if (this.sVX != null)
      {
        this.sVX.uninit();
        getSupportFragmentManager().beginTransaction().a(this.sVX).commit();
        this.sVX = null;
      }
      ab.i("MicroMsg.Voip.VideoActivity", "switch to voice fragment");
      Object localObject = new Bundle();
      ((Bundle)localObject).putString("key_username", this.sRl.field_username);
      ((Bundle)localObject).putBoolean("key_isoutcall", this.sRm);
      ((Bundle)localObject).putInt("key_status", this.mStatus);
      this.sVX = new VoipVoiceFragment();
      this.sVX.setArguments((Bundle)localObject);
      this.sVX.setVoipUIListener((c)this.sVY.get());
      this.sVX.lI(this.sVZ);
      this.sVX.a(this);
      this.sVX.GC(this.sRr);
      this.sVX.setMute(this.mIsMute);
      this.sVX.a(this.sRg);
      getSupportFragmentManager().beginTransaction().b(2131828504, this.sVX).commit();
      break label148;
      switch (paramInt1)
      {
      case 4100:
      case 4101:
      case 4102:
      case 4105:
      case 4108:
      default:
      case 4099:
      case 4106:
      case 4109:
      case 4098:
      case 4103:
      case 4104:
      case 4107:
      }
      while (true)
      {
        cJz();
        break;
        if (this.sRm)
        {
          localObject = this.sVX;
          if (!this.sRn)
            break label511;
        }
        label511: for (paramInt2 = 2131304480; ; paramInt2 = 2131304347)
        {
          ((VoipBaseFragment)localObject).fZ(paramInt2, -1);
          cJz();
          break;
        }
        this.iGP.post(new VideoActivity.13(this));
        continue;
        this.iGP.post(new VideoActivity.2(this));
        continue;
        this.iGP.postDelayed(new VideoActivity.8(this), 50L);
        continue;
        cJz();
        continue;
        finish();
      }
      cKX();
    }
  }

  public void finish()
  {
    AppMethodBeat.i(4814);
    this.sWc = 3;
    ab.i("MicroMsg.Voip.VideoActivity", "finish, finishBczMinimize: %b, status: %s", new Object[] { Boolean.valueOf(this.sWb), com.tencent.mm.plugin.voip.a.b.GK(this.mStatus) });
    Object localObject;
    if ((!this.sWb) && (com.tencent.mm.plugin.voip.a.b.GN(this.mStatus)) && (4 != this.sWc))
    {
      ab.i("MicroMsg.Voip.VideoActivity", "finish VideoActivity, start ChattingUI");
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("Chat_User", this.edV);
      com.tencent.mm.plugin.voip.c.gkE.d((Intent)localObject, this);
    }
    int j;
    if (this.sWi)
    {
      this.sWi = false;
      int i = com.tencent.mm.plugin.voip.b.cIj().cJZ();
      long l = com.tencent.mm.plugin.voip.b.cIj().cKa();
      if (this.sRm)
      {
        j = 0;
        com.tencent.mm.plugin.voip.a.a.c(i, l, j, 5);
        com.tencent.mm.plugin.voip.a.a.GI(1);
      }
    }
    else
    {
      if (this.sVX == null)
        break label314;
      if (this.sVX.sWs != 4105)
        break label308;
      j = 1;
      label185: this.sVX.uninit();
      this.sVX = null;
    }
    while (true)
    {
      this.sVY = null;
      this.sRg = null;
      this.sWe = true;
      super.finish();
      if (j != 0)
      {
        localObject = new iq();
        ((iq)localObject).cDO.cDR = true;
        ((iq)localObject).cDO.cDQ = this.sWk;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      while (true)
      {
        VoipBaseFragment.sWt = -1;
        AppMethodBeat.o(4814);
        return;
        j = 1;
        break;
        localObject = new iq();
        ((iq)localObject).cDO.cDR = false;
        ((iq)localObject).cDO.cDQ = 0L;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      label308: j = 0;
      break label185;
      label314: j = 0;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971030;
  }

  public final void my(boolean paramBoolean)
  {
    AppMethodBeat.i(4835);
    ab.d("MicroMsg.Voip.VideoActivity", "tryShowNetStatusWarning isSelfNetBad".concat(String.valueOf(paramBoolean)));
    if (this.sVX != null)
      this.sVX.mz(paramBoolean);
    AppMethodBeat.o(4835);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(4805);
    super.onConfigurationChanged(paramConfiguration);
    if ((this.qLw != null) && (com.tencent.mm.compatible.util.d.iW(17)))
    {
      paramConfiguration = new Point();
      getWindowManager().getDefaultDisplay().getRealSize(paramConfiguration);
      if ((!paramConfiguration.equals(this.qLw)) && (this.sVX != null))
      {
        this.qLw = paramConfiguration;
        this.sVX.cKZ();
      }
    }
    AppMethodBeat.o(4805);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(4804);
    super.onCreate(paramBundle);
    try
    {
      xE(getResources().getColor(2131690597));
      if (!com.tencent.mm.plugin.voip.a.d.fd(this.mController.ylL))
        com.tencent.mm.plugin.voip.a.d.fe(this.mController.ylL);
      ab.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate start");
      getSupportActionBar().hide();
      getWindow().setSoftInputMode(3);
      getWindow().addFlags(6815872);
      if (com.tencent.mm.kernel.g.RK())
        com.tencent.mm.plugin.voip.b.cIj().Q(false, false);
      com.tencent.mm.compatible.b.g.KK().KM();
      paramBundle = new com/tencent/mm/sdk/platformtools/ak;
      paramBundle.<init>();
      this.iGP = paramBundle;
      PBool localPBool1 = new com/tencent/mm/pointers/PBool;
      localPBool1.<init>();
      PBool localPBool2 = new com/tencent/mm/pointers/PBool;
      localPBool2.<init>();
      Object localObject = new com/tencent/mm/pointers/PString;
      ((PString)localObject).<init>();
      paramBundle = new com/tencent/mm/pointers/PInt;
      paramBundle.<init>();
      ((PString)localObject).value = getIntent().getStringExtra("Voip_User");
      localPBool1.value = getIntent().getBooleanExtra("Voip_Outcall", true);
      localPBool2.value = getIntent().getBooleanExtra("Voip_VideoCall", true);
      this.sWk = getIntent().getLongExtra("Voip_LastPage_Hash", 0L);
      paramBundle.value = com.tencent.mm.plugin.voip.a.b.T(localPBool1.value, localPBool2.value);
      this.sWh = null;
      boolean bool = localPBool1.value;
      if (bool);
      VoipMgr localVoipMgr;
      while (true)
      {
        try
        {
          if ((bRR()) && (!isFinishing()))
          {
            Toast.makeText(this, 2131304427, 0).show();
            ab.i("MicroMsg.Voip.VideoActivity", "this phone is on a call");
            super.finish();
            AppMethodBeat.o(4804);
            return;
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.Voip.VideoActivity", "not ready now!");
        }
        localVoipMgr = com.tencent.mm.plugin.voip.b.cIj().a(this, (PString)localObject, localPBool1, localPBool2, paramBundle);
        if (localVoipMgr != null)
          break;
        ab.e("MicroMsg.Voip.VideoActivity", "unable to init VoipMgr");
        super.finish();
        AppMethodBeat.o(4804);
      }
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(localVoipMgr);
      this.sVY = localWeakReference;
      this.edV = ((PString)localObject).value;
      this.sRn = localPBool2.value;
      this.sRm = localPBool1.value;
      this.mStatus = paramBundle.value;
      this.sRl = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.edV);
      if (!com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
        cKW();
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
      paramBundle.putString("key_username", this.sRl.field_username);
      paramBundle.putBoolean("key_isoutcall", this.sRm);
      paramBundle.putInt("key_status", com.tencent.mm.plugin.voip.a.b.T(this.sRm, this.sRn));
      if (com.tencent.mm.plugin.voip.a.b.GO(this.mStatus))
      {
        localObject = new com/tencent/mm/plugin/voip/ui/VoipVideoFragment;
        ((VoipVideoFragment)localObject).<init>();
      }
      for (this.sVX = ((VoipBaseFragment)localObject); ; this.sVX = ((VoipBaseFragment)localObject))
      {
        this.sVX.setArguments(paramBundle);
        getSupportFragmentManager().beginTransaction().b(2131828504, this.sVX).commit();
        setTitleVisibility(8);
        if ((com.tencent.mm.plugin.voip.a.b.GP(this.mStatus)) && (this.sRm))
        {
          paramBundle = this.iGP;
          localObject = new com/tencent/mm/plugin/voip/ui/VideoActivity$6;
          ((VideoActivity.6)localObject).<init>(this);
          paramBundle.postDelayed((Runnable)localObject, 20000L);
        }
        this.sVX.setVoipUIListener((c)this.sVY.get());
        this.sVX.a(this);
        this.sVX.GC(this.sRr);
        this.sVX.setMute(this.mIsMute);
        if (com.tencent.mm.plugin.voip.b.cIj().sSQ.sRK != null)
          abY(com.tencent.mm.plugin.voip.b.cIj().sSQ.sRK);
        if ((this.sVY != null) && (this.sVY.get() != null))
          ((c)this.sVY.get()).a(this, 1);
        ab.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate end isOutCall:%b isVideoCall:%b username:%s state:%d", new Object[] { Boolean.valueOf(this.sRm), Boolean.valueOf(this.sRn), this.edV, Integer.valueOf(this.mStatus) });
        if (!com.tencent.mm.plugin.voip.a.b.GO(this.mStatus))
          break label1042;
        bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 19, "", "");
        ab.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
        if (!bool)
          ((c)this.sVY.get()).cJo();
        ab.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 19, "", "")), bo.dpG(), this });
        com.tencent.mm.sdk.b.a.xxA.c(this.sWj);
        com.tencent.mm.sdk.b.a.xxA.c(this.oCY);
        if (com.tencent.mm.compatible.util.d.iW(26))
        {
          paramBundle = new com/tencent/mm/plugin/voip/ui/VideoActivity$ScreenActionReceiver;
          paramBundle.<init>(this);
          this.sWg = paramBundle;
          paramBundle = new android/content/IntentFilter;
          paramBundle.<init>();
          paramBundle.addAction("android.intent.action.SCREEN_OFF");
          paramBundle.addAction("android.intent.action.SCREEN_ON");
          ah.getContext().registerReceiver(this.sWg, paramBundle);
        }
        if (com.tencent.mm.compatible.util.d.iW(17))
        {
          paramBundle = new android/graphics/Point;
          paramBundle.<init>();
          this.qLw = paramBundle;
          if (getWindow().getDecorView().getDisplay() != null)
            getWindow().getDecorView().getDisplay().getRealSize(this.qLw);
        }
        AppMethodBeat.o(4804);
        break;
        localObject = new com/tencent/mm/plugin/voip/ui/VoipVoiceFragment;
        ((VoipVoiceFragment)localObject).<init>();
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        com.tencent.mm.plugin.voip.a.a.GI(2);
        ab.printErrStackTrace("MicroMsg.Voip.VideoActivity", paramBundle, "", new Object[0]);
        AppMethodBeat.o(4804);
        continue;
        label1042: ab.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 82, "", "")), bo.dpG(), this });
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(4811);
    this.sWc = 4;
    ab.i("MicroMsg.Voip.VideoActivity", "onDestroy, status: %s", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(this.mStatus) });
    if (!this.sWe)
      finish();
    if ((this.sVY != null) && (this.sVY.get() != null))
      ((c)this.sVY.get()).a(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.sWj);
    com.tencent.mm.sdk.b.a.xxA.d(this.oCY);
    setScreenEnable(true);
    if (!this.sWb)
      cKX();
    if ((com.tencent.mm.compatible.util.d.iW(26)) && (this.sWg != null));
    try
    {
      ah.getContext().unregisterReceiver(this.sWg);
      this.sWg = null;
      super.onDestroy();
      AppMethodBeat.o(4811);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.i("MicroMsg.Voip.VideoActivity", "unregisterBatteryChange err:%s", new Object[] { localException.getMessage() });
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(4809);
    boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      AppMethodBeat.o(4809);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt == 25)
      {
        if ((!com.tencent.mm.plugin.voip.b.cIj().sSP.cKq()) && (!this.sRm))
        {
          com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
          AppMethodBeat.o(4809);
          bool = true;
        }
        else
        {
          if (com.tencent.mm.compatible.b.g.KK().KP());
          for (paramInt = com.tencent.mm.compatible.b.g.KK().Lc(); ; paramInt = bHJ())
          {
            com.tencent.mm.compatible.b.g.KK().iK(paramInt);
            break;
          }
        }
      }
      else if (paramInt == 24)
      {
        if ((!com.tencent.mm.plugin.voip.b.cIj().sSP.cKq()) && (!this.sRm))
        {
          com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
          AppMethodBeat.o(4809);
          bool = true;
        }
        else
        {
          if (com.tencent.mm.compatible.b.g.KK().KP());
          for (paramInt = com.tencent.mm.compatible.b.g.KK().Lc(); ; paramInt = bHJ())
          {
            com.tencent.mm.compatible.b.g.KK().iJ(paramInt);
            break;
          }
        }
      }
      else if ((com.tencent.mm.compatible.e.q.etc.eqV == 1) && (paramInt == 700))
      {
        cKV();
        AppMethodBeat.o(4809);
        bool = true;
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(4809);
      }
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(4818);
    ab.i("MicroMsg.Voip.VideoActivity", "onNewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(4818);
  }

  public void onPause()
  {
    AppMethodBeat.i(4819);
    super.onPause();
    KeyguardManager localKeyguardManager = (KeyguardManager)ah.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)ah.getContext().getSystemService("power");
    boolean bool1 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool2 = hasWindowFocus();
    boolean bool3 = localPowerManager.isScreenOn();
    if (((bool2) || (!bool1)) && (bool3));
    for (boolean bool4 = true; ; bool4 = false)
    {
      this.sWd = bool4;
      ab.i("MicroMsg.Voip.VideoActivity", "onPause, status: %s, screenOn: %b, hasWindowFocus: %s, isScreenLocked: %s, isScreenOn: %s", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(this.mStatus), Boolean.valueOf(this.sWd), Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      o.JV(2);
      AppMethodBeat.o(4819);
      return;
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4840);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.Voip.VideoActivity", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(4840);
      return;
    }
    ab.i("MicroMsg.Voip.VideoActivity", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 19:
    case 82:
    }
    while (true)
    {
      AppMethodBeat.o(4840);
      break;
      if (paramArrayOfInt[0] != 0)
      {
        if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
        for (paramInt = 2131301920; ; paramInt = 2131301928)
        {
          com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131296868), false, new VideoActivity.3(this), new VideoActivity.4(this));
          AppMethodBeat.o(4840);
          break;
        }
        if (paramArrayOfInt[0] != 0)
          com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131296868), false, new VideoActivity.5(this), null);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(4820);
    ab.i("MicroMsg.Voip.VideoActivity", "onResume, status: %s", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(this.mStatus) });
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
    k localk = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl;
    if (localk.sPb)
      localk.sPb = false;
    super.onResume();
    setScreenEnable(true);
    this.sWa = bo.yz();
    if ((this.sRm) && (com.tencent.mm.plugin.voip.a.b.GP(this.mStatus)) && (com.tencent.mm.plugin.voip.b.cIj().sSP.cKq()))
      if (!this.sRn)
        break label184;
    label184: for (int i = 0; ; i = 1)
    {
      com.tencent.mm.plugin.voip.b.cIj().an(i, this.sRm);
      o.JV(1);
      this.sWi = true;
      if ((this.sVY != null) && (this.sVY.get() != null))
        ((c)this.sVY.get()).cJt();
      AppMethodBeat.o(4820);
      return;
    }
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
  }

  public void onStart()
  {
    AppMethodBeat.i(4813);
    super.onStart();
    if (!this.sWe)
    {
      ab.i("MicroMsg.Voip.VideoActivity", "onStart");
      this.sWc = 1;
      fY(4096, this.mStatus);
    }
    AppMethodBeat.o(4813);
  }

  public void onStop()
  {
    AppMethodBeat.i(4812);
    this.sWc = 2;
    ab.i("MicroMsg.Voip.VideoActivity", "onStop, status: %s", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(this.mStatus) });
    super.onStop();
    com.tencent.mm.plugin.report.service.h localh;
    if ((262 != this.mStatus) && (8 != this.mStatus) && (this.sWd) && (!this.sWe) && (this.sVY != null) && (this.sVY.get() != null) && (((c)this.sVY.get()).mv(false)))
    {
      S(false, true);
      if (com.tencent.mm.plugin.voip.a.b.GN(this.mStatus))
      {
        localh = com.tencent.mm.plugin.report.service.h.pYm;
        if (!com.tencent.mm.plugin.voip.a.b.GO(this.mStatus))
          break label170;
      }
    }
    label170: for (int i = 2; ; i = 3)
    {
      localh.e(11618, new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
      AppMethodBeat.o(4812);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setCaptureView(CaptureView paramCaptureView)
  {
    AppMethodBeat.i(4838);
    this.sRg = paramCaptureView;
    if (this.sVX != null)
      this.sVX.a(paramCaptureView);
    AppMethodBeat.o(4838);
  }

  public final void setConnectSec(long paramLong)
  {
    AppMethodBeat.i(4834);
    this.sVZ = paramLong;
    if (this.sVX != null)
      this.sVX.lI(this.sVZ);
    AppMethodBeat.o(4834);
  }

  public final void setHWDecMode(int paramInt)
  {
    AppMethodBeat.i(4832);
    if (this.sVX != null)
      this.sVX.setHWDecMode(paramInt);
    AppMethodBeat.o(4832);
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(4828);
    this.mIsMute = paramBoolean;
    if (this.sVX != null)
      this.sVX.setMute(paramBoolean);
    AppMethodBeat.o(4828);
  }

  public final void setScreenEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(4817);
    super.setScreenEnable(paramBoolean);
    if (this.sVY != null)
      this.sVY.get();
    if ((!paramBoolean) && (!this.sWf))
      cKW();
    AppMethodBeat.o(4817);
  }

  public final void setVoipBeauty(int paramInt)
  {
    AppMethodBeat.i(4831);
    if (this.sVX != null)
      this.sVX.setVoipBeauty(paramInt);
    AppMethodBeat.o(4831);
  }

  public final void uninit()
  {
    AppMethodBeat.i(4833);
    if (this.sVX != null)
      this.sVX.uninit();
    AppMethodBeat.o(4833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity
 * JD-Core Version:    0.6.2
 */