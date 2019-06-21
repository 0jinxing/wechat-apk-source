package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.or;
import com.tencent.mm.g.a.or.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceTransparentStubUI extends MMActivity
{
  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(515);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
    setResult(paramInt2, paramIntent);
    finish();
    AppMethodBeat.o(515);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(514);
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
    Object localObject = getIntent().getBundleExtra("KEY_EXTRAS");
    if (!((Bundle)localObject).containsKey("k_user_name"))
    {
      g.RN();
      if (com.tencent.mm.kernel.a.QX())
        ((Bundle)localObject).putString("k_user_name", r.YC());
    }
    paramBundle = new or();
    paramBundle.cLd.context = this;
    paramBundle.cLd.cKY = i;
    paramBundle.cLd.extras = ((Bundle)localObject);
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    ab.i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", new Object[] { Boolean.valueOf(paramBundle.cLe.cKV) });
    if (!paramBundle.cLe.cKV)
    {
      if (paramBundle.cLe.extras == null)
        break label183;
      localObject = new Intent();
      ((Intent)localObject).putExtras(paramBundle.cLe.extras);
      setResult(1, (Intent)localObject);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(514);
      return;
      label183: setResult(1);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI
 * JD-Core Version:    0.6.2
 */