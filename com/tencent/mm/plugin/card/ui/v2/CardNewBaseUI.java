package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "latitude", "", "getLatitude", "()F", "setLatitude", "(F)V", "locationPermissionGrant", "", "getLocationPermissionGrant", "()Z", "setLocationPermissionGrant", "(Z)V", "longitude", "getLongitude", "setLongitude", "onLocationGet", "Lcom/tencent/mm/modelgeo/IGetLocation$IOnLocationGet;", "getOnLocationGet", "()Lcom/tencent/mm/modelgeo/IGetLocation$IOnLocationGet;", "setOnLocationGet", "(Lcom/tencent/mm/modelgeo/IGetLocation$IOnLocationGet;)V", "overtimeTask", "Ljava/lang/Runnable;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishLocationThings", "ret", "isLocationOk", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocation", "showGpsAlert", "stopLocation", "Companion", "plugin-card_release"})
public abstract class CardNewBaseUI extends MMActivity
{
  public static final CardNewBaseUI.a kpU = new CardNewBaseUI.a((byte)0);
  float cEB = -85.0F;
  float cGm = -1000.0F;
  boolean kpR;
  private b.a kpS = (b.a)new CardNewBaseUI.b(this);
  private final Runnable kpT = (Runnable)new CardNewBaseUI.d(this);

  private void beo()
  {
    ab.i("MicroMsg.CardNewBaseUI", "request location: %s", new Object[] { Boolean.valueOf(this.kpR) });
    if (this.kpR)
    {
      d.agz().a(this.kpS, false);
      al.n(this.kpT, 4000L);
    }
  }

  public abstract void P(int paramInt, boolean paramBoolean);

  public final void bep()
  {
    ab.i("MicroMsg.CardNewBaseUI", "stop location");
    d.agz().c(this.kpS);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ab.i("MicroMsg.CardNewBaseUI", "requestCode: %s, resultCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    case 563:
    case 564:
    }
    while (true)
    {
      return;
      beo();
      continue;
      this.kpR = b.j((Context)dxU(), "android.permission.ACCESS_COARSE_LOCATION", false);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kpR = b.a((Activity)this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    if (this.kpR)
      beo();
  }

  public void onDestroy()
  {
    super.onDestroy();
    al.af(this.kpT);
    bep();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    j.p(paramArrayOfString, "permissions");
    j.p(paramArrayOfInt, "grantResults");
    if (paramInt == 69)
      if (paramArrayOfInt.length == 0)
      {
        paramInt = 1;
        if (paramInt != 0)
          break label56;
        paramInt = 1;
        label31: if ((paramInt == 0) || (paramArrayOfInt[0] != 0))
          break label61;
        this.kpR = true;
        beo();
      }
    while (true)
    {
      return;
      paramInt = 0;
      break;
      label56: paramInt = 0;
      break label31;
      label61: this.kpR = false;
      h.a((Context)this, getString(2131305852), getString(2131301936), getString(2131300878), getString(2131298419), false, (DialogInterface.OnClickListener)new c(this), null);
      P(-2, false);
      continue;
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
  static final class c
    implements DialogInterface.OnClickListener
  {
    c(CardNewBaseUI paramCardNewBaseUI)
    {
    }

    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      AppMethodBeat.i(89285);
      this.kpV.startActivityForResult(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"), 564);
      AppMethodBeat.o(89285);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
 * JD-Core Version:    0.6.2
 */