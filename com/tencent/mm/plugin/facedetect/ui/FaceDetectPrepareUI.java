package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.app.a.a;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.facedetect.c.f;
import com.tencent.mm.plugin.facedetect.model.FaceContextData;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.e;
import com.tencent.mm.plugin.facedetect.model.l;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetectlight.Utils.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragmentActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceDetectPrepareUI extends MMFragmentActivity
  implements a.a, f
{
  private boolean eTM = false;
  private boolean eVT = false;
  private String edV;
  private String lSK = null;
  private float lSM;
  private int lSf;
  private com.tencent.mm.plugin.facedetect.b.d lSg = null;
  private int lSq;
  private long lTH;
  private com.tencent.mm.plugin.facedetect.c.a lWT = null;
  private a lWU = null;
  private FaceTutorial lWV = null;
  private boolean lWW;
  private byte[] lWX;
  private boolean lWY = false;
  private boolean lWZ = false;
  private int lWs;
  private FaceDetectPrepareUI.b lXa;
  private boolean lXb = false;
  private boolean lXc = false;
  private String lXd = null;
  private long lXe = -1L;
  private Messenger lXf = null;
  private FaceDetectPrepareUI.a lXg = null;
  private int lXh = -1;
  private boolean lXi = false;
  private com.tencent.mm.plugin.facedetectlight.Utils.a lXj;
  private RelativeLayout lXk;
  private boolean lXl = false;
  private int lXm = -1;
  private boolean lXn = false;
  private float lXo = 0.0F;
  private String mAppId;

  private void a(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, FaceDetectPrepareUI.c paramc)
  {
    AppMethodBeat.i(436);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo showFailJumper showErrMsg: %s", new Object[] { paramString2 });
    Object localObject;
    if (this.lXn)
    {
      localObject = findViewById(2131823828);
      if (localObject != null)
      {
        ab.i("MicroMsg.FaceDetectPrepareUI", "carson: hide tutorialRoot");
        ((View)localObject).setVisibility(8);
      }
      this.lXk.setVisibility(0);
    }
    if (paramBoolean)
    {
      localObject = getResources().getString(2131299514);
      if (!paramBoolean)
        break label204;
    }
    label204: for (String str = getResources().getString(2131296868); ; str = null)
    {
      paramString2 = a.a(2130838637, paramString2, (String)localObject, str, new FaceDetectPrepareUI.2(this, paramBoolean, paramc, paramInt1, paramInt2, paramString1), new FaceDetectPrepareUI.3(this, paramInt1, paramInt2, paramString1));
      paramString2.status = 3;
      paramString1 = getString(2131299469);
      if (this.lSK == null)
        paramString1 = null;
      a.a(paramString2, paramString1, new FaceDetectPrepareUI.4(this, paramInt2));
      al.d(new FaceDetectPrepareUI.5(this, paramString2));
      AppMethodBeat.o(436);
      return;
      localObject = getString(2131299512);
      break;
    }
  }

  private void aDo()
  {
    AppMethodBeat.i(444);
    d(4, 90013, "init lib failed", getString(2131299475));
    AppMethodBeat.o(444);
  }

  private void az(int paramInt, String paramString)
  {
    AppMethodBeat.i(449);
    if (hasError())
      if (this.lWT != null)
        this.lWT.c(this.lXa.errType, this.lXa.errCode, this.lXa.aIm, this.lXa.extras);
    while (true)
    {
      this.eVT = true;
      finish();
      AppMethodBeat.o(449);
      return;
      if (this.lWT != null)
        this.lWT.ax(paramInt, paramString);
    }
  }

  private void btj()
  {
    AppMethodBeat.i(428);
    if (this.lWT != null)
      this.lWT.bsk();
    AppMethodBeat.o(428);
  }

  private void btk()
  {
    AppMethodBeat.i(430);
    switch (this.lWs)
    {
    default:
      this.lXm = 0;
      AppMethodBeat.o(430);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.lXm = 0;
      FaceDetectReporter.bsJ().lUv = 4;
      AppMethodBeat.o(430);
      continue;
      this.lXm = 1;
      FaceDetectReporter.bsJ().lUv = 6;
      AppMethodBeat.o(430);
      continue;
      float f = this.lXj.btS();
      FaceDetectReporter.bsJ().lUw = Math.round(f);
      ab.i("MicroMsg.FaceDetectPrepareUI", "curLux is : ".concat(String.valueOf(f)));
      ab.i("MicroMsg.FaceDetectPrepareUI", "Light threshold is : " + this.lSM);
      if (f < this.lSM)
      {
        this.lXj.stop();
        this.lXm = 1;
        FaceDetectReporter.bsJ().lUv = 6;
        AppMethodBeat.o(430);
      }
      else
      {
        this.lXm = 0;
        FaceDetectReporter.bsJ().lUv = 4;
        AppMethodBeat.o(430);
      }
    }
  }

  private void btl()
  {
    AppMethodBeat.i(431);
    this.lXh = 2;
    if (this.lWT != null)
      this.lWT.vg(0);
    Intent localIntent = new Intent(this, FaceDetectUI.class);
    localIntent.putExtra("k_user_name", this.edV);
    localIntent.putExtra("k_server_scene", this.lSf);
    localIntent.putExtra("k_need_signature", this.lWW);
    localIntent.putExtra("k_bio_id", String.valueOf(this.lTH));
    localIntent.putExtra("k_bio_config", this.lWX);
    localIntent.putExtra("business_tips", this.lXd);
    ab.i("MicroMsg.FaceDetectPrepareUI", "carson logic ");
    ab.i("MicroMsg.FaceDetectPrepareUI", "Config is " + this.lWX);
    ab.i("MicroMsg.FaceDetectPrepareUI", "Carson bioID is " + this.lTH + "  string：" + String.valueOf(this.lTH));
    ab.v("MicroMsg.FaceDetectPrepareUI", "alvinluo FaceDetectReporter info: %s", new Object[] { Long.valueOf(FaceDetectReporter.bsJ().hbj) });
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_parcelable_reporter", FaceDetectReporter.bsJ());
    localIntent.putExtra("key_reporter_bundle", localBundle);
    if (this.lWU != null)
      this.lWU.resetAll();
    startActivityForResult(localIntent, 1);
    AppMethodBeat.o(431);
  }

  private void btm()
  {
    AppMethodBeat.i(433);
    if (this.lWU != null)
      this.lWU.dismiss();
    ab.i("MicroMsg.FaceDetectPrepareUI", "carson init jumper: %b", new Object[] { Boolean.valueOf(this.lXl) });
    if (!this.lXl)
    {
      this.lWU = new a(this);
      this.lWU.create();
      AppMethodBeat.o(433);
    }
    while (true)
    {
      return;
      this.lWU = new b(this);
      this.lWU.create();
      AppMethodBeat.o(433);
    }
  }

  private void btn()
  {
    AppMethodBeat.i(435);
    String str = getString(2131299479);
    c localc = a.b(2130838626, str, null, getString(2131296868), null, new FaceDetectPrepareUI.17(this));
    localc.lYB = true;
    localc.lYD = (str.length() - 3);
    localc.status = 1;
    a(false, true, localc);
    AppMethodBeat.o(435);
  }

  private void bto()
  {
    AppMethodBeat.i(443);
    d(4, 90011, "get image failed", getString(2131299470));
    AppMethodBeat.o(443);
  }

  private void d(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(445);
    ab.i("MicroMsg.FaceDetectPrepareUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1 });
    d(paramInt1, paramInt2, paramString1, null);
    this.lWZ = true;
    a(paramInt1, paramInt2, paramString1, paramString2, false, new FaceDetectPrepareUI.10(this));
    AppMethodBeat.o(445);
  }

  private boolean hasError()
  {
    boolean bool1 = true;
    AppMethodBeat.i(446);
    boolean bool2 = this.lWY;
    if (this.lXa == null)
    {
      bool3 = true;
      ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo hasLastError: %b, lastError == null: %b, hashCode: %d", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Integer.valueOf(hashCode()) });
      if ((!this.lWY) || (this.lXa == null))
        break label87;
      AppMethodBeat.o(446);
    }
    for (boolean bool3 = bool1; ; bool3 = false)
    {
      return bool3;
      bool3 = false;
      break;
      label87: AppMethodBeat.o(446);
    }
  }

  private void m(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(427);
    if (paramBundle != null);
    for (Object localObject = paramBundle.toString(); ; localObject = "null")
    {
      ab.i("MicroMsg.FaceDetectPrepareUI", "hy: sending msg: cmd: %d, data: %s", new Object[] { Integer.valueOf(paramInt), localObject });
      localObject = paramBundle;
      if (paramBundle == null)
        localObject = new Bundle();
      ((Bundle)localObject).putInt("k_cmd", paramInt);
      paramBundle = new Intent(this, FaceDetectProcessService.class);
      paramBundle.putExtras((Bundle)localObject);
      com.tencent.mm.bp.d.j(paramBundle, "tools");
      AppMethodBeat.o(427);
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    int i = 1;
    AppMethodBeat.i(437);
    ab.i("MicroMsg.FaceDetectPrepareUI", "finishWithResult errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramBundle != null)
      paramBundle.putString("k_bio_id", String.valueOf(this.lTH));
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", l.vm(paramInt2));
    localBundle.putString("err_msg", paramString);
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    paramString = new Intent();
    paramString.putExtras(localBundle);
    setResult(-1, paramString);
    if (this.lXb)
    {
      this.lXc = true;
      m(5, this.lWT.bso());
      paramString = FaceDetectReporter.bsJ();
      if (!this.lXb)
        break label176;
    }
    label176: for (paramInt1 = i; ; paramInt1 = 0)
    {
      paramString.lUx = paramInt1;
      finish();
      AppMethodBeat.o(437);
      return;
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, c paramc)
  {
    AppMethodBeat.i(434);
    if (paramBoolean2)
    {
      ab.i("MicroMsg.FaceDetectPrepareUI", "hy: need blur");
      com.tencent.mm.sdk.g.d.post(new FaceDetectPrepareUI.16(this), "face_refresh_background");
    }
    this.lWU.a(paramc);
    AppMethodBeat.o(434);
  }

  public final void bsk()
  {
    AppMethodBeat.i(429);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo startFaceDetect");
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo preparing");
    if (this.lWT != null)
    {
      String str = getIntent().getExtras().getString("k_ticket");
      if (!bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.FaceDetectBaseController", "hy: has prepared ticket. force set");
        com.tencent.mm.plugin.facedetect.b.p.Lp(str);
      }
    }
    ab.i("MicroMsg.FaceDetectPrepareUI", "carson init jumper: %b", new Object[] { Boolean.valueOf(this.lXl) });
    if (!this.lXl)
    {
      ab.i("MicroMsg.FaceDetectPrepareUI", "hy: start show jumper: %b", new Object[] { Boolean.TRUE });
      this.lXe = bo.yz();
      com.tencent.mm.sdk.g.d.post(new FaceDetectPrepareUI.15(this), "face_prepareInit");
    }
    btk();
    int i;
    switch (this.lXm)
    {
    default:
      i = 1;
    case 0:
    case 1:
    }
    while (true)
    {
      if ((this.lSf == 0) || (this.lSf == 1) || (this.lSf == 3) || (this.lSf == 4))
        i = 1;
      this.lSq = i;
      if (this.lWT != null)
      {
        this.lWT.lTf = this.lSq;
        this.lWT.bsj();
      }
      this.lXi = true;
      AppMethodBeat.o(429);
      return;
      i = 1;
      continue;
      i = 2;
    }
  }

  public final void bsm()
  {
  }

  public final void bsp()
  {
    this.lXi = false;
  }

  public final void d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(447);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo saveError errType: %d, errCode: %d, errMsg: %s, hashCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(hashCode()) });
    if (this.lXa == null)
      this.lXa = new FaceDetectPrepareUI.b(this, (byte)0);
    this.lWY = true;
    this.lXa.e(paramInt1, paramInt2, paramString, paramBundle);
    AppMethodBeat.o(447);
  }

  public void finish()
  {
    AppMethodBeat.i(442);
    ab.i("MicroMsg.FaceDetectPrepareUI", "dismissJumper");
    if ((this.lWU != null) && (this.lWU.aFF()))
      this.lWU.dismiss();
    if (this.lWV != null)
      this.lWV.dismiss();
    ab.v("MicroMsg.FaceDetectPrepareUI", "alvinluo: releaseFaceDetect");
    if (this.lWT != null)
      this.lWT.bsm();
    super.finish();
    this.eTM = true;
    AppMethodBeat.o(442);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(432);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 2)
    {
      this.lXh = 1;
      this.lXk.setVisibility(0);
      if (paramIntent == null)
      {
        ab.e("MicroMsg.FaceDetectPrepareUI", "carson onActivityResult data is null");
        a(4, 90018, "system error", getString(2131299490), false, new FaceDetectPrepareUI.11(this));
        AppMethodBeat.o(432);
      }
    }
    String str;
    while (true)
    {
      return;
      localObject = (FaceDetectReporter)paramIntent.getParcelableExtra("key_parcelable_reporter");
      if (localObject != null)
        FaceDetectReporter.bsJ().a((FaceDetectReporter)localObject);
      localObject = FaceDetectReporter.bsJ();
      if (this.lXb);
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        ((FaceDetectReporter)localObject).lUx = paramInt1;
        FaceDetectReporter.bsJ().lUw = Math.round(this.lXo);
        paramInt2 = paramIntent.getIntExtra("err_type", -1);
        paramInt1 = paramIntent.getIntExtra("err_code", -1);
        str = paramIntent.getStringExtra("err_msg");
        if (this.lWT != null)
        {
          localObject = this.lWT;
          paramIntent.getExtras();
          ((com.tencent.mm.plugin.facedetect.c.a)localObject).n(paramInt2, paramInt1, str);
        }
        ab.i("MicroMsg.FaceDetectPrepareUI", "carson onActivityResult errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), str });
        if ((paramInt2 != 0) || (paramInt1 != 0))
          break label281;
        btn();
        m(6, paramIntent.getExtras());
        AppMethodBeat.o(432);
        break;
      }
      label281: if (paramInt2 == 1)
      {
        if ((paramInt1 == 90004) || (paramInt1 == 90025))
        {
          az(paramInt1, str);
          AppMethodBeat.o(432);
        }
      }
      else
      {
        localObject = paramIntent.getStringExtra("show_err_msg");
        if (paramInt1 == 90013)
          paramIntent = getString(2131299475);
        while (true)
        {
          d(paramInt2, paramInt1, str, null);
          if (paramInt1 == 90023)
            bool2 = true;
          a(paramInt2, paramInt1, str, paramIntent, bool2, new FaceDetectPrepareUI.12(this));
          AppMethodBeat.o(432);
          break;
          if ((paramInt1 == 90008) || (paramInt1 == 90010))
          {
            paramIntent = getString(2131301920);
          }
          else if (paramInt1 == 90009)
          {
            paramIntent = getString(2131301928);
          }
          else
          {
            paramIntent = (Intent)localObject;
            if (bo.isNullOrNil((String)localObject))
              paramIntent = getString(2131303873);
          }
        }
        this.lXh = 1;
        if (paramIntent == null)
        {
          ab.e("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult data is null");
          a(4, 90018, "system error", getString(2131299490), false, new FaceDetectPrepareUI.13(this));
          AppMethodBeat.o(432);
        }
        else
        {
          localObject = (FaceDetectReporter)paramIntent.getParcelableExtra("key_parcelable_reporter");
          if (localObject != null)
            FaceDetectReporter.bsJ().a((FaceDetectReporter)localObject);
          paramInt1 = paramIntent.getIntExtra("err_type", -1);
          paramInt2 = paramIntent.getIntExtra("err_code", -1);
          str = paramIntent.getStringExtra("err_msg");
          if (this.lWT != null)
          {
            localObject = this.lWT;
            paramIntent.getExtras();
            ((com.tencent.mm.plugin.facedetect.c.a)localObject).n(paramInt1, paramInt2, str);
          }
          ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            btn();
            m(1, null);
            AppMethodBeat.o(432);
          }
          else
          {
            if (paramInt1 != 1)
              break;
            if ((paramInt2 != 90004) && (paramInt2 != 90025))
              break label743;
            az(paramInt2, str);
            AppMethodBeat.o(432);
          }
        }
      }
    }
    Object localObject = paramIntent.getStringExtra("show_err_msg");
    if (paramInt2 == 90013)
      paramIntent = getString(2131299475);
    while (true)
    {
      d(paramInt1, paramInt2, str, null);
      bool2 = bool1;
      if (paramInt2 == 90023)
        bool2 = true;
      a(paramInt1, paramInt2, str, paramIntent, bool2, new FaceDetectPrepareUI.14(this));
      label743: AppMethodBeat.o(432);
      break;
      if ((paramInt2 == 90008) || (paramInt2 == 90010))
      {
        paramIntent = getString(2131301920);
      }
      else if (paramInt2 == 90009)
      {
        paramIntent = getString(2131301928);
      }
      else
      {
        paramIntent = (Intent)localObject;
        if (bo.isNullOrNil((String)localObject))
          paramIntent = getString(2131303873);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(448);
    if (hasError())
    {
      if (this.lWT == null)
        break label152;
      this.lWT.c(this.lXa.errType, this.lXa.errCode, this.lXa.aIm, this.lXa.extras);
      AppMethodBeat.o(448);
    }
    while (true)
    {
      return;
      if (this.lXh == 1)
      {
        az(90003, "user cancel in init");
        AppMethodBeat.o(448);
      }
      else if (this.lXh == 3)
      {
        az(90005, "user cancel in uploading");
        AppMethodBeat.o(448);
      }
      else if (this.lXh == 0)
      {
        az(90002, "user cancel in tutorial");
        AppMethodBeat.o(448);
      }
      else
      {
        az(90050, "user cancel unknown");
        label152: AppMethodBeat.o(448);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(426);
    super.onCreate(paramBundle);
    setContentView(2130969471);
    this.lXk = ((RelativeLayout)findViewById(2131823789));
    this.lXk.setVisibility(4);
    getWindow().addFlags(2097280);
    this.mAppId = getIntent().getStringExtra("k_app_id");
    this.edV = getIntent().getStringExtra("k_user_name");
    this.lSf = getIntent().getIntExtra("k_server_scene", -1);
    this.lWW = getIntent().getBooleanExtra("k_need_signature", false);
    boolean bool;
    if ((e.bsu()) || (getIntent().getBooleanExtra("key_is_need_video", false)))
    {
      bool = true;
      this.lXb = bool;
      this.lSK = getIntent().getStringExtra("key_feedback_url");
      this.lXd = getIntent().getStringExtra("business_tips");
      this.lWs = getIntent().getIntExtra("check_alive_type_response", -1);
      if (this.lWs == -1)
        this.lWs = getIntent().getIntExtra("check_alive_type", 0);
      this.lSM = getIntent().getFloatExtra("mLight_threshold", -1.0F);
      this.lXj = a.b.btT();
      this.lXj.dM(this);
      ab.i("MicroMsg.FaceDetectPrepareUI", "mIsNeedVideo： " + this.lXb);
      ab.i("MicroMsg.FaceDetectPrepareUI", "check_alive_type is " + this.lWs);
      ab.i("MicroMsg.FaceDetectPrepareUI", "mLight_threshold is " + this.lSM);
      ab.i("MicroMsg.FaceDetectPrepareUI", "mChechLiveFlag is " + this.lSq);
      this.lXg = new FaceDetectPrepareUI.a(this, (byte)0);
      this.lXf = new Messenger(this.lXg);
      paramBundle = new Intent(this, FaceDetectProcessService.class);
      paramBundle.putExtra("k_messenger", this.lXf);
      com.tencent.mm.bp.d.j(paramBundle, "tools");
      FaceContextData.a(new FaceContextData());
      com.tencent.mm.plugin.facedetect.model.p.N(this);
      paramBundle = getIntent().getExtras();
      float f = this.lXj.btS();
      this.lXo = f;
      if (paramBundle != null)
      {
        paramBundle.putFloat("key_current_light", f);
        paramBundle.putBoolean("key_upload_video", this.lXb);
      }
      com.tencent.mm.plugin.facedetect.c.b localb = com.tencent.mm.plugin.facedetect.c.b.lTj;
      this.lWT = com.tencent.mm.plugin.facedetect.c.b.a(this, this, this.lSf, this.lSq, paramBundle);
      if (this.lWT != null)
        break label604;
      aDo();
      label484: if (this.lXa != null)
      {
        paramBundle = this.lXa;
        paramBundle.errType = -1;
        paramBundle.errCode = -1;
        paramBundle.aIm = "";
        if (paramBundle.extras != null)
          paramBundle.extras.clear();
      }
      this.lWY = false;
      this.lXh = 1;
      btm();
      if (!com.tencent.mm.plugin.facedetect.model.p.M(this))
        break label645;
      ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo checkFacePermissionAnd Request true and do init ");
      btj();
    }
    while (true)
    {
      if (this.lXb)
      {
        paramBundle = new Bundle();
        paramBundle.putBoolean("key_is_need_video", this.lXb);
        m(4, paramBundle);
      }
      AppMethodBeat.o(426);
      return;
      bool = false;
      break;
      label604: this.lWT.a(new FaceDetectPrepareUI.6(this));
      this.lSg = new com.tencent.mm.plugin.facedetect.b.d()
      {
        private double lXt = 0.0D;

        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString)
        {
          AppMethodBeat.i(408);
          ab.i("MicroMsg.FaceDetectPrepareUI", "onError scene: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), paramAnonymousString });
          FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, FaceDetectPrepareUI.this.getString(2131303873));
          AppMethodBeat.o(408);
        }

        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
        {
          AppMethodBeat.i(410);
          ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousm.getType()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousInt1 = FaceDetectPrepareUI.vr(paramAnonymousInt1);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
            FaceDetectPrepareUI.this.d(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, null);
          if (FaceDetectPrepareUI.b(FaceDetectPrepareUI.this) != null)
            FaceDetectPrepareUI.b(FaceDetectPrepareUI.this).g(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousm);
          AppMethodBeat.o(410);
        }

        public final void n(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          AppMethodBeat.i(409);
          ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onUploadEnd");
          int i = FaceDetectPrepareUI.vr(0);
          if (i != 0)
            FaceDetectPrepareUI.this.d(i, 0, paramAnonymousString, paramAnonymousBundle);
          if (FaceDetectPrepareUI.b(FaceDetectPrepareUI.this) != null)
            FaceDetectPrepareUI.b(FaceDetectPrepareUI.this).b(i, paramAnonymousString, paramAnonymousBundle);
          AppMethodBeat.o(409);
        }

        public final void w(double paramAnonymousDouble)
        {
          AppMethodBeat.i(407);
          ab.i("MicroMsg.FaceDetectPrepareUI", "hy: reg on process : %f", new Object[] { Double.valueOf(paramAnonymousDouble) });
          this.lXt = (100.0D * paramAnonymousDouble);
          if (FaceDetectPrepareUI.b(FaceDetectPrepareUI.this) != null)
            FaceDetectPrepareUI.b(FaceDetectPrepareUI.this);
          AppMethodBeat.o(407);
        }
      };
      this.lWT.a(this.lSg);
      break label484;
      label645: ab.i("MicroMsg.FaceDetectPrepareUI", "hy: no camera permission. request permission");
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(438);
    ab.i("MicroMsg.FaceDetectPrepareUI", "onDestroy");
    super.onDestroy();
    if (!this.lXc)
      com.tencent.mm.bp.d.l(new Intent(this, FaceDetectProcessService.class), "tools");
    if (this.lXj != null)
      this.lXj.stop();
    AppMethodBeat.o(438);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 90008;
    AppMethodBeat.i(450);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onRequestPermissionsResult");
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
      AppMethodBeat.o(450);
    Object localObject1;
    String str;
    while (true)
    {
      return;
      switch (paramInt)
      {
      default:
        ab.i("MicroMsg.FaceDetectPrepareUI", "carson：finish()");
        AppMethodBeat.o(450);
        break;
      case 23:
        localObject1 = "";
        str = "";
        if (paramArrayOfInt.length != 1)
          break label238;
        if (paramArrayOfInt[0] != 0)
          break label114;
        paramInt = 1;
        label97: if (paramInt == 0)
          break label259;
        btj();
        AppMethodBeat.o(450);
      }
    }
    label114: if (paramArrayOfString[0].equals("android.permission.CAMERA"))
    {
      localObject1 = "camera permission not granted";
      paramArrayOfString = getString(2131301920);
      paramInt = i;
    }
    while (true)
    {
      this.lXk.setVisibility(0);
      ab.i("MicroMsg.FaceDetectPrepareUI", " mFacePrepareLayout, visible: %s", new Object[] { Integer.valueOf(this.lXk.getVisibility()) });
      paramArrayOfInt = findViewById(2131823828);
      if (paramArrayOfInt != null)
        paramArrayOfInt.setVisibility(8);
      d(1, paramInt, (String)localObject1, paramArrayOfString);
      paramInt = 0;
      break label97;
      label259: if (paramArrayOfString[0].equals("android.permission.RECORD_AUDIO"))
      {
        paramInt = 90009;
        localObject1 = "audio permission not granted";
        paramArrayOfString = getString(2131301928);
        continue;
        label238: if (paramArrayOfInt.length == 2)
        {
          if ((paramArrayOfInt[0] == 0) && (paramArrayOfInt[1] == 0))
          {
            paramInt = 1;
            break label97;
            break;
          }
          Object localObject2;
          if (paramArrayOfInt[0] != 0)
          {
            localObject2 = "camera permission not granted";
            str = getString(2131301920);
          }
          while (true)
          {
            if (paramArrayOfInt[1] != 0)
            {
              i = 90009;
              localObject2 = "audio permission not granted";
              str = getString(2131301928);
            }
            paramArrayOfString = str;
            localObject1 = localObject2;
            paramInt = i;
            if (paramArrayOfInt[0] == 0)
              break;
            paramArrayOfString = str;
            localObject1 = localObject2;
            paramInt = i;
            if (paramArrayOfInt[1] == 0)
              break;
            paramInt = 90010;
            localObject1 = "both camera and audio permission not granted";
            paramArrayOfString = getString(2131301920);
            break;
            i = -1;
            localObject2 = localObject1;
          }
        }
      }
      paramInt = -1;
      paramArrayOfString = str;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(440);
    ab.i("MicroMsg.FaceDetectPrepareUI", "onResume");
    super.onResume();
    this.lXi = true;
    AppMethodBeat.o(440);
  }

  public void onStart()
  {
    AppMethodBeat.i(439);
    super.onStart();
    AppMethodBeat.o(439);
  }

  public void onStop()
  {
    AppMethodBeat.i(441);
    super.onStop();
    if (this.lXi)
      if ((!this.eTM) && (hasError()))
      {
        a(this.lXa.errType, this.lXa.errCode, this.lXa.aIm, this.lXa.extras);
        AppMethodBeat.o(441);
      }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(441);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI
 * JD-Core Version:    0.6.2
 */