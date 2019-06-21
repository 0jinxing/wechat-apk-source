package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.df;
import com.tencent.mm.plugin.game.d.k;
import com.tencent.mm.plugin.game.model.ag;
import com.tencent.mm.plugin.game.model.av;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c.a;

public final class t
  implements View.OnClickListener, f
{
  private Context mContext;
  private com.tencent.mm.plugin.game.model.c mVZ = null;
  int mXC;
  DialogInterface.OnClickListener nmX = null;

  public t(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112214);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      ab.e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
      AppMethodBeat.o(112214);
    }
    while (true)
    {
      return;
      this.mVZ = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
      ab.i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.mVZ.field_appId);
      g.Rg().a(1219, this);
      paramView = aa.dor();
      paramView = new av(this.mVZ.field_appId, paramView, this.mVZ.ctu, this.mVZ.mVw);
      g.Rg().a(paramView, 0);
      AppMethodBeat.o(112214);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, final m paramm)
  {
    AppMethodBeat.i(112215);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramm.getType() == 1219))
    {
      g.Rg().b(1219, this);
      paramm = new ag(((av)paramm).lty.fsH.fsP);
      paramString = new t.b();
      paramString.nnb = Boolean.valueOf(paramm.mYl.mZy);
      paramString.title = paramm.mYl.Title;
      paramString.content = paramm.mYl.mZR;
      if (paramm.mYl.ndD != null)
      {
        paramString.nnc = new t.a();
        paramString.nnc.message = paramm.mYl.ndD.mZR;
        paramString.nnc.nmZ = paramm.mYl.ndD.mZS;
        paramString.nnc.nna = paramm.mYl.ndD.mZT;
        paramString.nnc.url = paramm.mYl.ndD.Url;
      }
      this.mVZ.mVo = paramString.nnb.booleanValue();
      if (bo.isNullOrNil(paramString.title))
        AppMethodBeat.o(112215);
    }
    while (true)
    {
      return;
      if (paramString.nnc != null)
      {
        paramm = paramString.nnc.url;
        c.a locala = new c.a(this.mContext);
        locala.asD(paramString.title);
        locala.asE(paramString.nnc.message);
        locala.rc(false);
        locala.asJ(paramString.nnc.nmZ).a(true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(112213);
            com.tencent.mm.plugin.game.f.c.ax(t.a(t.this), paramm);
            com.tencent.mm.plugin.game.e.b.a(t.a(t.this), t.b(t.this).scene, t.b(t.this).cKG, t.b(t.this).position, 17, t.b(t.this).field_appId, t.c(t.this), t.b(t.this).ctu, t.b(t.this).mVB);
            AppMethodBeat.o(112213);
          }
        });
        locala.asK(paramString.nnc.nna).b(this.nmX);
        locala.aMb().show();
        AppMethodBeat.o(112215);
      }
      else if (bo.isNullOrNil(paramString.content))
      {
        AppMethodBeat.o(112215);
      }
      else
      {
        paramm = new c.a(this.mContext);
        paramm.asD(paramString.title);
        paramm.asE(paramString.content);
        paramm.rc(false);
        paramm.Qc(2131300354).a(this.nmX);
        paramm.aMb().show();
        AppMethodBeat.o(112215);
        continue;
        paramString = new c.a(this.mContext);
        paramString.PZ(2131300355);
        paramString.Qc(2131300354);
        paramString.aMb().show();
        AppMethodBeat.o(112215);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.t
 * JD-Core Version:    0.6.2
 */