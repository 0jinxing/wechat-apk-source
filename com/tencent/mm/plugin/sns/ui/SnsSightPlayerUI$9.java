package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsSightPlayerUI$9
  implements e.a
{
  SnsSightPlayerUI$9(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(39262);
    ab.d("MicroMsg.SnsSightPlayerUI", "on completion");
    if (!SnsSightPlayerUI.j(this.rwT))
      SnsSightPlayerUI.k(this.rwT).post(new SnsSightPlayerUI.9.2(this));
    SnsSightPlayerUI.g(this.rwT).setLoop(true);
    com.tencent.mm.plugin.sns.a.b.a.a locala = SnsSightPlayerUI.l(this.rwT).qEs;
    locala.qFp += 1;
    SnsSightPlayerUI.a(this.rwT, false);
    AppMethodBeat.o(39262);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39261);
    ab.e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    SnsSightPlayerUI.g(this.rwT).stop();
    if (SnsSightPlayerUI.h(this.rwT))
      AppMethodBeat.o(39261);
    while (true)
    {
      return;
      SnsSightPlayerUI.i(this.rwT);
      b.A(Base64.encodeToString((d.ckW() + "[SnsSightPlayerUI] on play video error, what " + paramInt1 + " extra " + paramInt2 + ", path=" + bo.bc(SnsSightPlayerUI.e(this.rwT), "")).getBytes(), 2), "FullScreenPlaySight");
      final String str = SnsSightPlayerUI.e(this.rwT);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(39258);
          Object localObject = (ImageView)SnsSightPlayerUI.9.this.rwT.findViewById(2131823993);
          if (localObject != null)
          {
            ((ImageView)localObject).setImageBitmap(this.pKM);
            ((ImageView)localObject).setVisibility(0);
          }
          localObject = new Intent();
          ((Intent)localObject).setAction("android.intent.action.VIEW");
          k.a(SnsSightPlayerUI.9.this.rwT.mController.ylL, (Intent)localObject, com.tencent.mm.vfs.e.asY(str), "video/*");
          try
          {
            SnsSightPlayerUI.9.this.rwT.mController.ylL.startActivity(Intent.createChooser((Intent)localObject, SnsSightPlayerUI.9.this.rwT.mController.ylL.getString(2131299761)));
            AppMethodBeat.o(39258);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
              com.tencent.mm.ui.base.h.g(SnsSightPlayerUI.9.this.rwT.mController.ylL, 2131299668, 2131299669);
              AppMethodBeat.o(39258);
            }
          }
        }
      });
      AppMethodBeat.o(39261);
    }
  }

  public final void pL()
  {
    AppMethodBeat.i(39260);
    ab.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.Mp() + " onPrepared");
    SnsSightPlayerUI.a(this.rwT, true);
    AppMethodBeat.o(39260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.9
 * JD-Core Version:    0.6.2
 */