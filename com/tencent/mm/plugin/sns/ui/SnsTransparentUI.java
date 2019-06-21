package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.e.c;
import com.tencent.mm.pluginsdk.ui.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.Map;

@a(7)
public class SnsTransparentUI extends MMActivity
{
  private Map<String, Bitmap> rao;

  public SnsTransparentUI()
  {
    AppMethodBeat.i(39635);
    this.rao = new HashMap();
    AppMethodBeat.o(39635);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39636);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    Object localObject = getIntent();
    if (localObject != null)
      switch (((Intent)localObject).getIntExtra("op", -1))
      {
      case 3:
      default:
      case 2:
      case 4:
      }
    while (true)
    {
      AppMethodBeat.o(39636);
      while (true)
      {
        return;
        String str1 = ((Intent)localObject).getStringExtra("adlandingXml");
        String str2 = ((Intent)localObject).getStringExtra("shareTitle");
        String str3 = ((Intent)localObject).getStringExtra("shareThumbUrl");
        paramBundle = ((Intent)localObject).getStringExtra("shareDesc");
        String str4 = ((Intent)localObject).getStringExtra("shareUrl");
        localObject = ((Intent)localObject).getStringExtra("statExtStr");
        ab.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
        Intent localIntent = new Intent();
        localIntent.putExtra("Select_Conv_Type", 259);
        localIntent.putExtra("select_is_ret", true);
        d.a(this, ".ui.transmit.SelectConversationUI", localIntent, 0, new SnsTransparentUI.1(this, str1, str2, str3, paramBundle, str4, (String)localObject));
        AppMethodBeat.o(39636);
      }
      paramBundle = ((Intent)localObject).getStringExtra("phoneNum");
      c.a.vrD.a(this, paramBundle, new SnsTransparentUI.2(this), new Bundle());
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTransparentUI
 * JD-Core Version:    0.6.2
 */