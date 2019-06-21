package com.tencent.mm.plugin.facedetectaction.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.oo;
import com.tencent.mm.g.a.oo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceTransStubUI extends MMActivity
{
  private Context context;

  public FaceTransStubUI()
  {
    AppMethodBeat.i(746);
    this.context = this;
    AppMethodBeat.o(746);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(748);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.FaceTransStubUI", "carson : on activity result in FaceTransStubUI");
    setResult(paramInt2, paramIntent);
    finish();
    AppMethodBeat.o(748);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(747);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.FaceTransStubUI", "carson: start FaceTransStubUI ");
    paramBundle = new oo();
    paramBundle.cKR.scene = getIntent().getIntExtra("scene", 0);
    paramBundle.cKR.packageName = getIntent().getStringExtra("package");
    paramBundle.cKR.cKT = getIntent().getStringExtra("packageSign");
    paramBundle.cKR.cKU = getIntent().getStringExtra("otherVerifyTitle");
    paramBundle.cKR.requestCode = 63;
    if ((this.context instanceof Activity))
      paramBundle.cKR.czX = ((Activity)this.context);
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    ab.i("MicroMsg.FaceTransStubUI", "carson: start face detect event result: %b", new Object[] { Boolean.valueOf(paramBundle.cKS.cKV) });
    if (!paramBundle.cKS.cKV)
    {
      if (paramBundle.cKS.extras == null)
        break label213;
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle.cKS.extras);
      setResult(1, localIntent);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(747);
      return;
      label213: setResult(1);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI
 * JD-Core Version:    0.6.2
 */