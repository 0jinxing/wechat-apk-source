package com.tencent.mm.plugin.soter.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.b.e;
import com.tencent.mm.plugin.soter.b.f;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.soter.d.j;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.plugin.soter.d.l;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.soter.a.b.d;

@com.tencent.mm.ui.base.a(7)
public class SoterAuthenticationUIWC extends MMActivity
{
  private static android.support.v7.app.b rNO = null;
  public static SoterAuthenticationUIWC.a rOx = null;
  private String appId;
  private int fromScene;
  private ProgressDialog kvA;
  private c rOr;
  private com.tencent.soter.a.b.b<d> rOv;

  public SoterAuthenticationUIWC()
  {
    AppMethodBeat.i(59365);
    this.rOr = null;
    this.kvA = null;
    this.fromScene = -1;
    this.appId = null;
    this.rOv = new com.tencent.soter.a.b.b()
    {
    };
    AppMethodBeat.o(59365);
  }

  private void a(k paramk)
  {
    AppMethodBeat.i(59369);
    setResult(1, d(paramk));
    c(paramk);
    finish();
    AppMethodBeat.o(59369);
  }

  private void c(k paramk)
  {
    AppMethodBeat.i(59371);
    if (paramk == null)
      AppMethodBeat.o(59371);
    while (true)
    {
      return;
      if (this.fromScene == 0)
      {
        int i = zS(paramk.errCode);
        l locall = l.rOl;
        l.l("requireSoterBiometricAuthentication", this.appId, i, paramk.errCode);
      }
      AppMethodBeat.o(59371);
    }
  }

  private static Intent d(k paramk)
  {
    AppMethodBeat.i(59370);
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", paramk.errCode);
    localBundle.putString("err_msg", paramk.aIm);
    localBundle.putByte("use_mode", paramk.rOj);
    localBundle.putString("result_json", paramk.cLO);
    localBundle.putString("result_json_signature", paramk.rOk);
    ab.d("MicroMsg.SoterAuthenticationUIWC", "hy: dump mp soter result: %s", new Object[] { localBundle.toString() });
    paramk = new Intent();
    paramk.putExtras(localBundle);
    AppMethodBeat.o(59370);
    return paramk;
  }

  private static int zS(int paramInt)
  {
    int i = -1;
    switch (paramInt)
    {
    default:
      paramInt = i;
    case 0:
    case 90001:
    case 90002:
    case 90003:
    case 90004:
    case 90006:
    case 90007:
    case 90011:
    case 90008:
    case 90009:
    case 90010:
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  @TargetApi(23)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(59366);
    super.onCreate(paramBundle);
    if (rOx != null)
      SoterAuthenticationUIWC.a.a(rOx);
    rOx = new SoterAuthenticationUIWC.a(this, (byte)0);
    j localj = new j();
    paramBundle = new k();
    Object localObject = getIntent().getStringExtra("auth_mode");
    if (bo.isNullOrNil((String)localObject))
    {
      ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode : null");
      paramBundle.errCode = 90003;
      paramBundle.aIm = "authen mode is null";
    }
    while (true)
    {
      if (paramBundle.errCode != 0)
      {
        a(paramBundle);
        AppMethodBeat.o(59366);
        label103: return;
      }
      try
      {
        localj.rOi = Byte.parseByte(bo.bc(((String)localObject).substring(2), "00"), 16);
        localj.msn = getIntent().getStringExtra("challenge");
        localj.content = getIntent().getStringExtra("auth_content");
        if (!m.cvU())
        {
          ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: not support soter");
          paramBundle.errCode = 90001;
          paramBundle.aIm = "not support soter";
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode format: %s", new Object[] { localObject });
        paramBundle.errCode = 90003;
        paramBundle.aIm = "authen mode is illegal: number format error. found: ".concat(String.valueOf(localObject));
        continue;
        if (localj.rOi <= 0)
        {
          ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: request mode illegal");
          paramBundle.errCode = 90003;
          paramBundle.aIm = "resp model error";
          continue;
        }
        if (bo.isNullOrNil(localj.msn))
        {
          ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge null");
          paramBundle.errCode = 90004;
          paramBundle.aIm = "challenge is null";
          continue;
        }
        if (localj.msn.length() >= 512)
        {
          ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge too long");
          paramBundle.errCode = 90004;
          paramBundle.aIm = "challenge is too long. 512 chars at most";
          continue;
        }
        if (bo.isNullOrNil(localj.content))
        {
          localj.content = getString(2131303861);
          continue;
        }
        if (localj.content.length() <= 42)
          continue;
        ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: content too long. use default");
        localj.content = getString(2131303861);
        continue;
        this.fromScene = getIntent().getIntExtra("key_soter_fp_mp_scene", 0);
        localObject = com.tencent.mm.plugin.soter.c.a.rNL;
        this.rOr = com.tencent.mm.plugin.soter.c.a.a(this, localj, paramBundle, rOx);
        if (this.rOr == null)
        {
          ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: no corresponding authen mode");
          paramBundle.errCode = 90003;
          paramBundle.aIm = "no corresponding mode";
          a(paramBundle);
          AppMethodBeat.o(59366);
          break label103;
        }
        this.rOr.rOd = new f();
        this.rOr.rOc = new e();
        this.rOr.gOW = 2;
        this.appId = getIntent().getStringExtra("key_app_id");
        this.rOr.fj();
        AppMethodBeat.o(59366);
        break label103;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        label184: break label184;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(59373);
    super.onDestroy();
    if ((this.kvA != null) && (this.kvA.isShowing()))
    {
      ab.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mProgressDialog dismiss!");
      this.kvA.dismiss();
    }
    if ((rNO != null) && (rNO.isShowing()))
    {
      ab.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mAuthenDialog dismiss!");
      rNO.dismiss();
    }
    SoterAuthenticationUIWC.a.a(rOx);
    AppMethodBeat.o(59373);
  }

  public void onPause()
  {
    AppMethodBeat.i(59368);
    super.onPause();
    if (this.rOr != null)
      this.rOr.onPause();
    AppMethodBeat.o(59368);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(59372);
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if (this.rOr != null)
      this.rOr.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    AppMethodBeat.o(59372);
  }

  public void onResume()
  {
    AppMethodBeat.i(59367);
    super.onResume();
    if (this.rOr != null)
      this.rOr.onResume();
    AppMethodBeat.o(59367);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC
 * JD-Core Version:    0.6.2
 */