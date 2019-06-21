package com.tencent.mm.plugin.soter.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.soter.c.c.a;
import com.tencent.mm.plugin.soter.d.j;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.soter.a.a.1;
import com.tencent.soter.a.b.d;
import com.tencent.soter.a.g.e;
import com.tencent.soter.a.g.e.a;
import com.tencent.soter.a.g.f;
import com.tencent.soter.a.g.g;

@com.tencent.mm.ui.base.a(7)
public class SoterAuthenticationUI extends AppCompatActivity
{
  private static android.support.v7.app.b rNO = null;
  public static SoterAuthenticationUI.a rOu = null;
  private ResultReceiver JF;
  private String appId;
  private int fromScene;
  private ProgressDialog kvA;
  private c.a rOe;
  private c rOr;
  private boolean rOs;
  private com.tencent.soter.core.c.i rOt;
  private com.tencent.soter.a.b.b<d> rOv;
  private int scene;

  public SoterAuthenticationUI()
  {
    AppMethodBeat.i(73900);
    this.rOr = null;
    this.kvA = null;
    this.fromScene = -1;
    this.scene = -1;
    this.rOs = false;
    this.rOt = null;
    this.appId = null;
    this.rOe = new SoterAuthenticationUI.1(this);
    this.rOv = new SoterAuthenticationUI.2(this);
    AppMethodBeat.o(73900);
  }

  private void a(k paramk)
  {
    AppMethodBeat.i(73904);
    this.JF.send(1, b(paramk));
    c(paramk);
    finish();
    AppMethodBeat.o(73904);
  }

  private static Bundle b(k paramk)
  {
    AppMethodBeat.i(73905);
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", paramk.errCode);
    localBundle.putString("err_msg", paramk.aIm);
    localBundle.putByte("use_mode", paramk.rOj);
    localBundle.putString("result_json", paramk.cLO);
    localBundle.putString("result_json_signature", paramk.rOk);
    ab.d("MicroMsg.SoterAuthenticationUI", "hy: dump mp soter result: %s", new Object[] { localBundle.toString() });
    AppMethodBeat.o(73905);
    return localBundle;
  }

  private void c(k paramk)
  {
    AppMethodBeat.i(73906);
    if (paramk == null)
      AppMethodBeat.o(73906);
    while (true)
    {
      return;
      if (this.fromScene == 1)
      {
        int i = zS(paramk.errCode);
        com.tencent.mm.plugin.soter.d.i.ai(this.appId, paramk.errCode, i);
      }
      AppMethodBeat.o(73906);
    }
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

  @TargetApi(23)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(73901);
    super.onCreate(paramBundle);
    this.JF = ((ResultReceiver)getIntent().getParcelableExtra("Soter_Result_Receiver"));
    if (rOu != null)
      SoterAuthenticationUI.a.a(rOu);
    rOu = new SoterAuthenticationUI.a(this, (byte)0);
    paramBundle = new j();
    Object localObject1 = new k();
    Object localObject2 = getIntent().getStringExtra("auth_mode");
    if (bo.isNullOrNil((String)localObject2))
    {
      ab.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode : null");
      ((k)localObject1).errCode = 90003;
      ((k)localObject1).aIm = "authen mode is null";
    }
    while (true)
    {
      if (((k)localObject1).errCode != 0)
      {
        a((k)localObject1);
        AppMethodBeat.o(73901);
        label122: return;
      }
      try
      {
        paramBundle.rOi = Byte.parseByte(bo.bc(((String)localObject2).substring(2), "00"), 16);
        paramBundle.msn = getIntent().getStringExtra("challenge");
        paramBundle.content = getIntent().getStringExtra("auth_content");
        if (!com.tencent.soter.core.a.dQN())
        {
          ab.e("MicroMsg.SoterAuthenticationUI", "hy: not support soter");
          ((k)localObject1).errCode = 90001;
          ((k)localObject1).aIm = "not support soter";
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        ab.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode format: %s", new Object[] { localObject2 });
        ((k)localObject1).errCode = 90003;
        ((k)localObject1).aIm = "authen mode is illegal: number format error. found: ".concat(String.valueOf(localObject2));
        continue;
        if (paramBundle.rOi <= 0)
        {
          ab.e("MicroMsg.SoterAuthenticationUI", "hy: param error: request mode illegal");
          ((k)localObject1).errCode = 90003;
          ((k)localObject1).aIm = "resp model error";
          continue;
        }
        if (bo.isNullOrNil(paramBundle.msn))
        {
          ab.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge null");
          ((k)localObject1).errCode = 90004;
          ((k)localObject1).aIm = "challenge is null";
          continue;
        }
        if (paramBundle.msn.length() >= 512)
        {
          ab.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge too long");
          ((k)localObject1).errCode = 90004;
          ((k)localObject1).aIm = "challenge is too long. 512 chars at most";
          continue;
        }
        if (bo.isNullOrNil(paramBundle.content))
        {
          paramBundle.content = getString(2131303861);
          continue;
        }
        if (paramBundle.content.length() <= 42)
          continue;
        ab.e("MicroMsg.SoterAuthenticationUI", "hy: param error: content too long. use default");
        paramBundle.content = getString(2131303861);
        continue;
        this.fromScene = getIntent().getIntExtra("key_soter_fp_luggage_fromscene", 1);
        this.scene = getIntent().getIntExtra("key_soter_fp_luggage_scene", 2048);
        localObject2 = com.tencent.mm.plugin.soter.c.a.rNL;
        this.rOr = com.tencent.mm.plugin.soter.c.a.a(this, paramBundle, (k)localObject1, rOu);
        if (this.rOr == null)
        {
          ab.e("MicroMsg.SoterAuthenticationUI", "hy: no corresponding authen mode");
          ((k)localObject1).errCode = 90003;
          ((k)localObject1).aIm = "no corresponding mode";
          a((k)localObject1);
          AppMethodBeat.o(73901);
          break label122;
        }
        this.rOr.rOd = null;
        this.rOr.rOc = null;
        this.rOr.gOW = this.scene;
        this.rOr.rOe = this.rOe;
        boolean bool = com.tencent.soter.a.c.a.dRe().isInit();
        ab.i("MicroMsg.SoterAuthenticationUI", "hy: isInit:".concat(String.valueOf(bool)));
        if (!bool)
        {
          ab.i("MicroMsg.SoterAuthenticationUI", "hy: init scene:" + this.rOr.gOW);
          localObject1 = new e.a().E(new int[] { this.rOr.gOW }).Awt;
          localObject2 = getApplicationContext();
          paramBundle = this.rOv;
          g.dRq().R(new a.1((Context)localObject2, (e)localObject1, paramBundle));
          this.rOs = true;
        }
        this.appId = getIntent().getStringExtra("key_app_id");
        this.rOr.fj();
        AppMethodBeat.o(73901);
        break label122;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        label204: break label204;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(73908);
    super.onDestroy();
    if ((this.kvA != null) && (this.kvA.isShowing()))
    {
      ab.i("MicroMsg.SoterAuthenticationUI", "onDestroy mProgressDialog dismiss!");
      this.kvA.dismiss();
    }
    if ((rNO != null) && (rNO.isShowing()))
    {
      ab.i("MicroMsg.SoterAuthenticationUI", "onDestroy mAuthenDialog dismiss!");
      rNO.dismiss();
    }
    SoterAuthenticationUI.a.a(rOu);
    com.tencent.soter.a.c.a locala;
    if (this.rOs)
    {
      f.dRn().dRo();
      locala = com.tencent.soter.a.c.a.dRe();
    }
    while (true)
    {
      try
      {
        locala.bZi = false;
        locala.cul = false;
        SparseArray localSparseArray = new android/util/SparseArray;
        localSparseArray.<init>(10);
        locala.AvO = localSparseArray;
        locala.AvP = null;
        return;
      }
      finally
      {
        AppMethodBeat.o(73908);
      }
      AppMethodBeat.o(73908);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(73903);
    super.onPause();
    if (this.rOr != null)
      this.rOr.onPause();
    AppMethodBeat.o(73903);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(73907);
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if (this.rOr != null)
      this.rOr.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    AppMethodBeat.o(73907);
  }

  public void onResume()
  {
    AppMethodBeat.i(73902);
    super.onResume();
    if (this.rOr != null)
      this.rOr.onResume();
    AppMethodBeat.o(73902);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI
 * JD-Core Version:    0.6.2
 */