package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.f;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(19)
public final class a
{
  public static a hSt;
  ResultReceiver JF;
  private int hSj;
  boolean hSk;
  boolean hSl;
  boolean hSm;
  Timer hSn;
  TimerTask hSo;
  ComponentName hSp;
  Activity hSq;
  f hSr;
  private c hSs;
  private final Handler mHandler;

  static
  {
    AppMethodBeat.i(137906);
    hSt = null;
    hSt = new a();
    AppMethodBeat.o(137906);
  }

  public a()
  {
    AppMethodBeat.i(137891);
    this.hSj = 0;
    this.hSk = false;
    this.hSl = false;
    this.hSm = false;
    this.hSs = null;
    this.mHandler = new Handler();
    AppMethodBeat.o(137891);
  }

  private void U(int paramInt, String paramString)
  {
    AppMethodBeat.i(137898);
    Bundle localBundle = new Bundle();
    localBundle.putInt("errCode", paramInt);
    localBundle.putString("errMsg", paramString);
    this.JF.send(10001, localBundle);
    AppMethodBeat.o(137898);
  }

  private void V(int paramInt, String paramString)
  {
    AppMethodBeat.i(137899);
    Bundle localBundle = new Bundle();
    localBundle.putInt("errCode", paramInt);
    localBundle.putString("errMsg", paramString);
    this.JF.send(10001, localBundle);
    if (this.hSq != null)
      this.hSq.finish();
    AppMethodBeat.o(137899);
  }

  private void aDw()
  {
    AppMethodBeat.i(137892);
    if (this.hSr != null)
    {
      this.hSr.dismiss();
      this.hSr = null;
    }
    AppMethodBeat.o(137892);
  }

  @TargetApi(19)
  private void aEv()
  {
    AppMethodBeat.i(137894);
    if (this.hSq == null)
    {
      ab.e("MicroMsg.HCEActivityMgr", "alvinluo checkDefaultNFCApplication mHceActivity is null");
      AppMethodBeat.o(137894);
    }
    while (true)
    {
      return;
      CardEmulation localCardEmulation = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(this.hSq));
      ab.i("MicroMsg.HCEActivityMgr", "alvinluo component name: " + this.hSp);
      if (!localCardEmulation.isDefaultServiceForCategory(this.hSp, "payment"))
      {
        ab.i("MicroMsg.HCEActivityMgr", "alvinluo not NFC Default Application, isAutoSet: %b", new Object[] { Boolean.TRUE });
        b(this.hSp);
        AppMethodBeat.o(137894);
      }
      else
      {
        ab.i("MicroMsg.HCEActivityMgr", "alvinluo now is NFC Default Application");
        V(0, "NFC switch has opened and now is NFC default application");
        AppMethodBeat.o(137894);
      }
    }
  }

  @TargetApi(19)
  private void b(ComponentName paramComponentName)
  {
    AppMethodBeat.i(137895);
    if (this.hSq == null)
    {
      ab.e("MicroMsg.HCEActivityMgr", "alvinluo reuquestSetDefaultNFCApplication mHceActivity is null");
      AppMethodBeat.o(137895);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.HCEActivityMgr", "alvinluo request set default NFC application, hasRequestSetDefault: %b", new Object[] { Boolean.valueOf(this.hSm) });
      if (this.hSm)
      {
        ab.i("MicroMsg.HCEActivityMgr", "alvinluo has request set default NFC application");
        p(13004, "not set default NFC application", this.hSq.getString(2131301249));
        AppMethodBeat.o(137895);
      }
      else
      {
        this.mHandler.postDelayed(new a.5(this, paramComponentName), 200L);
        AppMethodBeat.o(137895);
      }
    }
  }

  private void p(final int paramInt, final String paramString1, String paramString2)
  {
    AppMethodBeat.i(137896);
    dismissDialog();
    if (this.hSq == null)
    {
      ab.e("MicroMsg.HCEActivityMgr", "alvinluo showErrorDialog mHceActivity is null");
      AppMethodBeat.o(137896);
    }
    while (true)
    {
      return;
      c.a locala = new c.a(this.hSq);
      locala.asD("");
      locala.asE(paramString2);
      locala.asJ(this.hSq.getString(2131301234)).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(137890);
          a.a(a.this, paramInt, paramString1);
          AppMethodBeat.o(137890);
        }
      });
      locala.rc(true);
      this.hSs = locala.aMb();
      this.hSs.setCanceledOnTouchOutside(false);
      this.hSs.show();
      AppMethodBeat.o(137896);
    }
  }

  final void aEu()
  {
    AppMethodBeat.i(137893);
    if (!d.aEB())
    {
      U(13000, "not support NFC");
      AppMethodBeat.o(137893);
    }
    while (true)
    {
      return;
      if (!d.aEA())
      {
        U(13002, "not support HCE");
        AppMethodBeat.o(137893);
      }
      else if (!d.aEC())
      {
        if (this.hSq == null)
        {
          ab.e("MicroMsg.HCEActivityMgr", "alvinluo showOpenNFCDialog mHceActivity is null");
          AppMethodBeat.o(137893);
        }
        else if (this.hSk)
        {
          ab.i("MicroMsg.HCEActivityMgr", "alvinluo has shown open NFC dialog");
          p(13001, "system NFC switch not opened", this.hSq.getString(2131301248));
          AppMethodBeat.o(137893);
        }
        else
        {
          c.a locala = new c.a(this.hSq);
          locala.asE(this.hSq.getString(2131301250)).asJ(this.hSq.getString(2131301246)).a(new a.2(this));
          int i;
          if (this.hSq == null)
          {
            ab.e("MicroMsg.HCEActivityMgr", "alvinluo isCanJumpNFCSetting mHceActivity is null");
            i = 0;
            label196: if (i == 0)
              break label408;
            locala.asK(this.hSq.getString(2131301233)).b(new a.3(this));
          }
          while (true)
          {
            locala.f(new a.4(this));
            this.hSs = locala.aMb();
            this.hSs.setCanceledOnTouchOutside(false);
            this.hSs.show();
            this.hSk = true;
            AppMethodBeat.o(137893);
            break;
            Object localObject = new Intent("android.settings.NFC_SETTINGS");
            localObject = this.hSq.getPackageManager().queryIntentActivities((Intent)localObject, 65536);
            if ((localObject != null) && (((List)localObject).size() > 0))
            {
              ab.i("MicroMsg.HCEActivityMgr", "alvinluo NFC activity not null, activities size: " + ((List)localObject).size());
              for (i = 0; i < ((List)localObject).size(); i++)
                ab.i("MicroMsg.HCEActivityMgr", "alvinluo NFC activity: %s", new Object[] { ((ResolveInfo)((List)localObject).get(i)).activityInfo.name });
              i = 1;
              break label196;
            }
            ab.e("MicroMsg.HCEActivityMgr", "alvinluo Cannot jump to NFC setting");
            i = 0;
            break label196;
            label408: locala.asJ(this.hSq.getString(2131301234));
          }
        }
      }
      else
      {
        aEv();
        AppMethodBeat.o(137893);
      }
    }
  }

  public final void dismissDialog()
  {
    AppMethodBeat.i(137897);
    if ((this.hSs != null) && (this.hSs.isShowing()))
    {
      this.hSs.dismiss();
      this.hSs = null;
    }
    aDw();
    AppMethodBeat.o(137897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a
 * JD-Core Version:    0.6.2
 */