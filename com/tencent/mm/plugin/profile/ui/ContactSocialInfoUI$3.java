package com.tencent.mm.plugin.profile.ui;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ContactSocialInfoUI$3
  implements e.c
{
  ContactSocialInfoUI$3(ContactSocialInfoUI paramContactSocialInfoUI, e parame, String paramString1, String paramString2)
  {
  }

  public final int cr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23442);
    this.frb.ach();
    ab.i("MicroMsg.ContactSocialInfoUI", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      o.acd();
      Bitmap localBitmap = d.qg(this.eiH);
      if (ContactSocialInfoUI.a(this.pmv, this.pmw, localBitmap))
      {
        Toast.makeText(this.pmv.mController.ylL, this.pmv.mController.ylL.getString(2131298658), 0).show();
        AppMethodBeat.o(23442);
      }
    }
    while (true)
    {
      return 0;
      Toast.makeText(this.pmv.mController.ylL, this.pmv.mController.ylL.getString(2131298656), 0).show();
      AppMethodBeat.o(23442);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.3
 * JD-Core Version:    0.6.2
 */