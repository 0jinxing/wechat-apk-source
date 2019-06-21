package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

final class FriendPreference$2
  implements e.c
{
  FriendPreference$2(FriendPreference paramFriendPreference, e parame, String paramString1, String paramString2)
  {
  }

  public final int cr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23621);
    this.frb.ach();
    ab.i("MicroMsg.FriendPreference", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      o.acd();
      Bitmap localBitmap = d.qg(this.eiH);
      if (FriendPreference.a(this.pnC, this.pmw, localBitmap))
      {
        Toast.makeText(this.pnC.mContext, this.pnC.mContext.getString(2131298658), 0).show();
        AppMethodBeat.o(23621);
      }
    }
    while (true)
    {
      return 0;
      Toast.makeText(this.pnC.mContext, this.pnC.mContext.getString(2131298656), 0).show();
      AppMethodBeat.o(23621);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.FriendPreference.2
 * JD-Core Version:    0.6.2
 */