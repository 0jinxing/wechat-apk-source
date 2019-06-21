package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.sdk.b.a;

public class SnsAdProxyUI extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38732);
    super.onCreate(paramBundle);
    Object localObject = getIntent();
    if (localObject == null)
    {
      d.e("MicroMsg.SnsAdBlankUI", "intent null!");
      finish();
      AppMethodBeat.o(38732);
    }
    while (true)
    {
      return;
      paramBundle = ((Intent)localObject).getStringExtra("username");
      String str = ((Intent)localObject).getStringExtra("url");
      localObject = ((Intent)localObject).getStringExtra("sceneNote");
      se localse = new se();
      localse.cOf.userName = paramBundle;
      localse.cOf.cOh = str;
      localse.cOf.scene = 1084;
      localse.cOf.cst = ((String)localObject);
      localse.cOf.context = this;
      a.xxA.m(localse);
      finish();
      AppMethodBeat.o(38732);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdProxyUI
 * JD-Core Version:    0.6.2
 */