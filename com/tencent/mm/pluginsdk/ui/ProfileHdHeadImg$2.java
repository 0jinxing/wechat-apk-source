package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;

final class ProfileHdHeadImg$2
  implements e.c
{
  ProfileHdHeadImg$2(ProfileHdHeadImg paramProfileHdHeadImg, Bitmap paramBitmap)
  {
  }

  public final int cr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27525);
    ProfileHdHeadImg.a(this.viv).ach();
    ab.i("MicroMsg.ProfileHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      o.acd();
      Bitmap localBitmap = d.qg(ProfileHdHeadImg.b(this.viv));
      if (localBitmap != null)
      {
        ProfileHdHeadImg localProfileHdHeadImg = this.viv;
        o.acd();
        ProfileHdHeadImg.a(localProfileHdHeadImg, localBitmap, d.C(ProfileHdHeadImg.b(this.viv), true));
        AppMethodBeat.o(27525);
      }
    }
    while (true)
    {
      return 0;
      ProfileHdHeadImg.a(this.viv, this.qlq, null);
      break;
      ProfileHdHeadImg.a(this.viv, this.qlq, null);
      AppMethodBeat.o(27525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.2
 * JD-Core Version:    0.6.2
 */