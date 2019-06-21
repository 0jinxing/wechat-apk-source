package com.tencent.mm.plugin.sns.ui;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class ArtistUI$5
  implements f.a
{
  ArtistUI$5(ArtistUI paramArtistUI)
  {
  }

  public final void a(fq paramfq)
  {
    AppMethodBeat.i(38117);
    if (ArtistUI.c(this.rgS) != null)
    {
      ArtistUI.c(this.rgS).setVisibility(0);
      ArtistUI.c(this.rgS).setUserName(paramfq);
      paramfq = paramfq.Name;
      if ((paramfq != null) && (!paramfq.equals("")))
        ArtistUI.d(this.rgS).edit().putString("artist_name", paramfq).commit();
      if (ArtistUI.a(this.rgS) != null)
        ArtistUI.a(this.rgS).notifyDataSetChanged();
    }
    ArtistUI.e(this.rgS).dismiss();
    AppMethodBeat.o(38117);
  }

  public final void b(fq paramfq)
  {
    AppMethodBeat.i(38118);
    if (ArtistUI.c(this.rgS) != null)
    {
      ArtistUI.c(this.rgS).setVisibility(0);
      ArtistUI.c(this.rgS).setUserName(paramfq);
    }
    AppMethodBeat.o(38118);
  }

  public final void crx()
  {
    AppMethodBeat.i(38119);
    if ((ArtistUI.f(this.rgS) == null) && (ArtistUI.e(this.rgS) != null))
    {
      ab.d("MicroMsg.ArtistUI", "onNothingBgGet");
      a.gkF.bj(true);
    }
    AppMethodBeat.o(38119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI.5
 * JD-Core Version:    0.6.2
 */