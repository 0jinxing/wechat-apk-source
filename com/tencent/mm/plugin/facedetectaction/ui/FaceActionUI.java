package com.tencent.mm.plugin.facedetectaction.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.facedetectaction.b.a.a;
import com.tencent.mm.plugin.facedetectaction.b.d;
import com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout;
import com.tencent.mm.plugin.facedetectlight.ui.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.ui.base.a;

@a(3)
public class FaceActionUI extends MMActivity
{
  int cvG;
  private long endTime;
  RelativeLayout lYg;
  RelativeLayout lYh;
  RelativeLayout lYi;
  ImageView lYj;
  ImageView lYk;
  ImageView lYl;
  private int mbW;
  private String mbX;
  RelativeLayout mcN;
  private PreviewFrameLayout mcO;
  private FaceActionMask mcP;
  private MMTextureView mcQ;
  ImageView mcR;
  private TextView mcS;
  private TextView mcT;
  private ImageView mcU;
  private Button mcV;
  private Button mcW;
  private TextView mcX;
  public boolean mcY = false;
  b mcZ;
  private a.a mca;
  private int mda;
  private int mdb;
  private String mdc;
  private int mdd;
  private int scene;
  private long startTime;

  private void btQ()
  {
    AppMethodBeat.i(735);
    this.mcN = ((RelativeLayout)findViewById(2131823755));
    this.mcO = ((PreviewFrameLayout)findViewById(2131823756));
    this.mcQ = ((MMTextureView)findViewById(2131823757));
    this.mcQ.setVisibility(4);
    this.mcP = ((FaceActionMask)findViewById(2131823760));
    this.mcU = ((ImageView)findViewById(2131823759));
    this.mcU.post(new FaceActionUI.3(this));
    this.mcS = ((TextView)findViewById(2131823761));
    this.mcS.post(new FaceActionUI.4(this));
    this.mcT = ((TextView)findViewById(2131823762));
    this.mcT.setOnClickListener(new FaceActionUI.5(this));
    AppMethodBeat.o(735);
  }

  private void btR()
  {
    AppMethodBeat.i(741);
    ab.i("MicroMsg.FaceActionUI", "preview");
    if (this.mcZ != null)
    {
      this.mcZ.mdx = true;
      ab.i("MicroMsg.FaceActionUI", "mCamera ！= null");
    }
    this.mcS.setText(2131299505);
    AppMethodBeat.o(741);
  }

  private void btj()
  {
    AppMethodBeat.i(729);
    this.mca = new FaceActionUI.1(this);
    d.mcq.mcw = new FaceActionUI.2(this);
    d.mcq.crP = this;
    d.mcq.a(this);
    AppMethodBeat.o(729);
  }

  private void c(String paramString, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(738);
    paramBundle = d(paramString, paramInt, paramBundle);
    switch (paramString.hashCode())
    {
    default:
      paramInt = -1;
      switch (paramInt)
      {
      default:
        label54: setResult(-1, paramBundle);
        AppMethodBeat.o(738);
      case 0:
      case 1:
      case 2:
      }
      break;
    case 3548:
    case 3135262:
    case -1367724422:
    }
    while (true)
    {
      return;
      if (!paramString.equals("ok"))
        break;
      paramInt = 0;
      break label54;
      if (!paramString.equals("fail"))
        break;
      paramInt = 1;
      break label54;
      if (!paramString.equals("cancel"))
        break;
      paramInt = 2;
      break label54;
      setResult(-1, paramBundle);
      AppMethodBeat.o(738);
      continue;
      setResult(1, paramBundle);
      AppMethodBeat.o(738);
      continue;
      setResult(0, paramBundle);
      AppMethodBeat.o(738);
    }
  }

  private Intent d(String paramString, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(739);
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", paramInt);
    localBundle.putString("err_msg", paramString);
    localBundle.putInt("scene", this.scene);
    localBundle.putInt("countFace", this.mdd);
    localBundle.putInt("err_type", this.cvG);
    this.endTime = bo.yz();
    ab.i("MicroMsg.FaceActionUI", "endTime：" + this.endTime);
    ab.i("MicroMsg.FaceActionUI", "startTime：" + this.startTime);
    localBundle.putLong("totalTime", this.endTime - this.startTime);
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    paramString = new Intent();
    paramString.putExtras(localBundle);
    AppMethodBeat.o(739);
    return paramString;
  }

  public final void a(String paramString, int paramInt, Bundle paramBundle, Boolean paramBoolean)
  {
    AppMethodBeat.i(737);
    ab.i("MicroMsg.FaceActionUI", "finishWithResult errMsg: %s, errCode: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramBoolean.booleanValue());
    for (paramBoolean = "yes"; ; paramBoolean = "no")
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("click_other_verify_btn", paramBoolean);
      if (paramBundle != null)
        localBundle.putAll(paramBundle);
      c(paramString, paramInt, localBundle);
      new ak().postDelayed(new FaceActionUI.9(this), 1500L);
      AppMethodBeat.o(737);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130969457;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(740);
    d.mcq.onBackPressed();
    AppMethodBeat.o(740);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(728);
    ab.d("MicroMsg.FaceActionUI", "start VerifyActivity");
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    getWindow().addFlags(2097280);
    this.scene = getIntent().getIntExtra("scene", 0);
    this.mdd = 0;
    this.startTime = bo.yz();
    this.cvG = 4;
    ab.d("MicroMsg.FaceActionUI", "initLayout");
    this.mcR = ((ImageView)findViewById(2131823758));
    btQ();
    this.lYg = ((RelativeLayout)findViewById(2131823751));
    this.lYh = ((RelativeLayout)findViewById(2131823747));
    this.lYi = ((RelativeLayout)findViewById(2131823742));
    this.lYg.setVisibility(4);
    this.lYh.setVisibility(4);
    this.lYi.setVisibility(4);
    this.lYj = ((ImageView)findViewById(2131823753));
    this.lYk = ((ImageView)findViewById(2131823752));
    this.lYl = ((ImageView)findViewById(2131823749));
    this.mcX = ((TextView)findViewById(2131823744));
    this.mcV = ((Button)findViewById(2131823745));
    this.mcW = ((Button)findViewById(2131823746));
    if (!bo.isNullOrNil(d.mcq.cKU))
    {
      this.mcW.setText(d.mcq.cKU);
      this.mcW.setOnClickListener(new FaceActionUI.6(this));
      if (!p.M(this))
        break label328;
      ab.i("MicroMsg.FaceActionUI", "carson: checkFacePermissionAnd Request true and do init ");
      btj();
      AppMethodBeat.o(728);
    }
    while (true)
    {
      return;
      this.mcW.setVisibility(8);
      break;
      label328: ab.i("MicroMsg.FaceActionUI", "carson: no camera permission. request permission");
      AppMethodBeat.o(728);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(734);
    super.onDestroy();
    ab.i("MicroMsg.FaceActionUI", "onDestroy");
    d.mcq.release(true);
    AppMethodBeat.o(734);
  }

  public void onPause()
  {
    AppMethodBeat.i(732);
    ab.d("MicroMsg.FaceActionUI", "onPause");
    super.onPause();
    AppMethodBeat.o(732);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(742);
    ab.i("MicroMsg.FaceActionUI", "carson onRequestPermissionsResult");
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      AppMethodBeat.o(742);
      return;
    }
    switch (paramInt)
    {
    default:
    case 23:
    }
    String str1;
    String str2;
    while (true)
    {
      AppMethodBeat.o(742);
      break;
      str1 = "";
      str2 = "";
      if (paramArrayOfInt.length != 1)
        break label275;
      if (paramArrayOfInt[0] != 0)
        break label92;
      paramInt = 1;
      label81: if (paramInt == 0)
        break label304;
      btj();
    }
    label92: Object localObject;
    String str3;
    if (paramArrayOfString[0].equals("android.permission.CAMERA"))
    {
      localObject = "camera permission not granted";
      str3 = getString(2131301920);
    }
    while (true)
    {
      ab.i("MicroMsg.FaceActionUI", "carson PermissionsResult:errMsg".concat(String.valueOf(localObject)));
      ab.i("MicroMsg.FaceActionUI", "carson PermissionsResult:showErrMsg".concat(String.valueOf(str3)));
      ab.i("MicroMsg.FaceActionUI", "checkPermissionFailedAnimation");
      this.mcX.setText(str3);
      this.mcV.setText(2131299512);
      this.mcV.setOnClickListener(new FaceActionUI.8(this));
      this.mcN.setVisibility(8);
      this.lYi.setVisibility(0);
      this.lYk.clearAnimation();
      this.mcR.setVisibility(0);
      this.lYg.setVisibility(8);
      paramInt = 0;
      break label81;
      str3 = str2;
      localObject = str1;
      if (paramArrayOfString[0].equals("android.permission.RECORD_AUDIO"))
      {
        localObject = "audio permission not granted";
        str3 = getString(2131301928);
        continue;
        label275: str3 = str2;
        localObject = str1;
        if (paramArrayOfInt.length == 2)
        {
          if ((paramArrayOfInt[0] == 0) && (paramArrayOfInt[1] == 0))
          {
            paramInt = 1;
            break label81;
            label304: break;
          }
          paramArrayOfString = str1;
          if (paramArrayOfInt[0] != 0)
          {
            paramArrayOfString = "camera permission not granted";
            str2 = getString(2131301920);
          }
          if (paramArrayOfInt[1] != 0)
          {
            paramArrayOfString = "audio permission not granted";
            str2 = getString(2131301928);
          }
          str3 = str2;
          localObject = paramArrayOfString;
          if (paramArrayOfInt[0] != 0)
          {
            str3 = str2;
            localObject = paramArrayOfString;
            if (paramArrayOfInt[1] != 0)
            {
              localObject = "both camera and audio permission not granted";
              str3 = getString(2131301920);
            }
          }
        }
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(731);
    super.onResume();
    ab.d("MicroMsg.FaceActionUI", "onResume");
    btR();
    AppMethodBeat.o(731);
  }

  public void onStart()
  {
    AppMethodBeat.i(730);
    ab.d("MicroMsg.FaceActionUI", "onStart");
    super.onStart();
    if (this.mcZ != null)
    {
      this.mcZ.a(this.mcQ);
      this.mcZ.btX();
    }
    AppMethodBeat.o(730);
  }

  public void onStop()
  {
    AppMethodBeat.i(733);
    ab.i("MicroMsg.FaceActionUI", "onStop");
    super.onStop();
    if (this.mcZ != null)
      this.mcZ.lXB = false;
    AppMethodBeat.o(733);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void s(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(736);
    ab.i("MicroMsg.FaceActionUI", "callbackDetectFailed（）");
    Bundle localBundle = new Bundle();
    localBundle.putString("token", paramString2);
    a(paramString1, paramInt, localBundle, Boolean.valueOf(this.mcY));
    AppMethodBeat.o(736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI
 * JD-Core Version:    0.6.2
 */