package com.tencent.mm.plugin.facedetectlight.ui.container;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.facedetect.c.f;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.facedetectlight.ui.FaceReflectMask;
import com.tencent.mm.plugin.facedetectlight.ui.a.a.1;
import com.tencent.mm.plugin.facedetectlight.ui.c.a;
import com.tencent.mm.plugin.facedetectlight.ui.d;
import com.tencent.mm.plugin.facedetectlight.ui.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.youtu.ytcommon.YTCommonExInterface;

@com.tencent.mm.ui.base.a(3)
public class FaceReflectContainerUI extends MMActivity
  implements View.OnClickListener, f, a
{
  private String edV;
  private byte[] lWX;
  private String lXd;
  private String mAppId;
  private String mdC;
  private com.tencent.mm.plugin.facedetectlight.ui.a.a mea;
  private d meb;
  private e mec;
  private TextView med;

  static
  {
    AppMethodBeat.i(822);
    k.a("YTCommonEx", FaceReflectContainerUI.class.getClassLoader());
    k.a("YTFaceTrace", FaceReflectContainerUI.class.getClassLoader());
    k.a("YTNextCV", FaceReflectContainerUI.class.getClassLoader());
    k.a("YTAGReflectLiveCheck", FaceReflectContainerUI.class.getClassLoader());
    YTCommonExInterface.setBusinessCode(1);
    AppMethodBeat.o(822);
  }

  private void btZ()
  {
    AppMethodBeat.i(812);
    ab.d("MicroMsg.FaceReflectContainerUI", "initLayout");
    this.med = ((TextView)findViewById(2131823781));
    this.med.setOnClickListener(this);
    this.mea = new com.tencent.mm.plugin.facedetectlight.ui.a.a((ViewGroup)findViewById(2131823755), this);
    this.meb = new d((ViewGroup)findViewById(2131823780), this);
    this.mec = new e((ViewGroup)findViewById(2131823751), this);
    this.mea.setBusinessTip(this.lXd);
    AppMethodBeat.o(812);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(817);
    ab.i("MicroMsg.FaceReflectContainerUI", "finishWithResult errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0) && (com.tencent.mm.plugin.facedetect.e.a.btw().isStarted()) && (com.tencent.mm.plugin.facedetect.e.a.btw().lZc))
      com.tencent.mm.plugin.facedetect.e.a.btw().bty();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_parcelable_reporter", FaceDetectReporter.bsJ());
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    paramBundle = new Bundle();
    paramBundle.putInt("err_type", paramInt1);
    paramBundle.putInt("err_code", paramInt2);
    paramBundle.putString("err_msg", paramString);
    paramBundle.putString("k_bio_id", this.mdC);
    paramBundle.putAll(localBundle);
    paramString = new Intent();
    paramString.putExtras(paramBundle);
    setResult(-1, paramString);
    finish();
    AppMethodBeat.o(817);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, com.tencent.mm.plugin.facedetect.ui.c paramc)
  {
  }

  public final void bsk()
  {
    AppMethodBeat.i(811);
    this.mea.bsk();
    AppMethodBeat.o(811);
  }

  public final void bsm()
  {
    AppMethodBeat.i(138377);
    c.a.btY().release();
    AppMethodBeat.o(138377);
  }

  public final void bsp()
  {
  }

  public final void d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public final int getLayoutId()
  {
    return 2130969465;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(818);
    super.onBackPressed();
    c.a.btY().onBackPressed();
    AppMethodBeat.o(818);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(821);
    c.a.btY().onBackPressed();
    finish();
    AppMethodBeat.o(821);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(810);
    ab.d("MicroMsg.FaceReflectContainerUI", "start VerifyActivity");
    super.onCreate(paramBundle);
    YTCommonExInterface.setIsEnabledLog(true);
    YTCommonExInterface.setIsEnabledNativeLog(true);
    getWindow().addFlags(2097280);
    ab.d("MicroMsg.FaceReflectContainerUI", "getData");
    this.mAppId = getIntent().getStringExtra("k_app_id");
    this.edV = getIntent().getStringExtra("k_user_name");
    this.lWX = getIntent().getByteArrayExtra("k_bio_config");
    this.mdC = getIntent().getStringExtra("k_bio_id");
    this.lXd = getIntent().getStringExtra("business_tips");
    ab.i("MicroMsg.FaceReflectContainerUI", "mConfig " + this.lWX);
    ab.i("MicroMsg.FaceReflectContainerUI", "mBioID is %s", new Object[] { this.mdC });
    ab.i("MicroMsg.FaceReflectContainerUI", "mAppID is %s", new Object[] { this.mAppId });
    ab.i("MicroMsg.FaceReflectContainerUI", "mBusinessTip is %s", new Object[] { this.lXd });
    paramBundle = (FaceDetectReporter)getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
    if (paramBundle != null)
      FaceDetectReporter.bsJ().a(paramBundle);
    FaceDetectReporter.bsJ().appId = this.mAppId;
    FaceDetectReporter.bsJ().lUv = 6;
    if (p.M(this))
    {
      ab.i("MicroMsg.FaceReflectContainerUI", "carson: checkFacePermissionAnd Request true and do init ");
      btZ();
      bsk();
      AppMethodBeat.o(810);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FaceReflectContainerUI", "carson: no camera permission. request permission");
      AppMethodBeat.o(810);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(815);
    super.onDestroy();
    ab.i("MicroMsg.FaceReflectContainerUI", "onDestroy");
    c.a.btY().release();
    AppMethodBeat.o(815);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(820);
    ab.i("MicroMsg.FaceReflectContainerUI", "carson onRequestPermissionsResult");
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      AppMethodBeat.o(820);
      return;
    }
    switch (paramInt)
    {
    default:
    case 23:
    }
    while (true)
    {
      AppMethodBeat.o(820);
      break;
      btZ();
      this.mea.bsk();
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(813);
    super.onResume();
    if (this.mea != null)
      this.mea.resume();
    AppMethodBeat.o(813);
  }

  public void onStop()
  {
    AppMethodBeat.i(814);
    super.onStop();
    if (this.mea != null)
    {
      com.tencent.mm.plugin.facedetectlight.ui.a.a locala = this.mea;
      ab.i(locala.TAG, " FaceReflect Preview UI pause");
      if (locala.mcZ != null)
        locala.mcZ.lXB = false;
    }
    AppMethodBeat.o(814);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void startPreview()
  {
    AppMethodBeat.i(816);
    this.med.setTextColor(-1);
    com.tencent.mm.plugin.facedetectlight.ui.a.a locala = this.mea;
    locala.a(this.lWX, this.mdC, this.mAppId, this.edV);
    locala.mdz.setVisibility(0);
    locala.mee.setVisibility(4);
    locala.mee.post(new a.1(locala));
    locala.resume();
    locala.mcS.setVisibility(0);
    FaceDetectReporter.bsJ().H(0, System.currentTimeMillis());
    AppMethodBeat.o(816);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.container.FaceReflectContainerUI
 * JD-Core Version:    0.6.2
 */