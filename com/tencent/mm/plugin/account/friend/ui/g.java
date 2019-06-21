package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.account.friend.a.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public final class g
  implements f
{
  private Context context;
  private ProgressDialog fsh;
  g.a gyh;
  private boolean gyi = true;
  String gyj = "";

  public g(Context paramContext, g.a parama)
  {
    this.context = paramContext;
    this.gyh = parama;
    this.gyi = true;
  }

  public g(Context paramContext, g.a parama, byte paramByte)
  {
    this.context = paramContext;
    this.gyh = parama;
    this.gyi = false;
  }

  public final void m(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108650);
    com.tencent.mm.kernel.g.Rg().a(116, this);
    paramArrayOfInt = new ah(paramArrayOfInt);
    com.tencent.mm.kernel.g.Rg().a(paramArrayOfInt, 0);
    if (this.gyi)
    {
      Context localContext = this.context;
      this.context.getString(2131300660);
      this.fsh = h.b(localContext, this.context.getString(2131300658), true, new g.1(this, paramArrayOfInt));
    }
    AppMethodBeat.o(108650);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108651);
    if (paramm.getType() != 116)
      AppMethodBeat.o(108651);
    while (true)
    {
      return;
      if (this.fsh != null)
      {
        this.fsh.dismiss();
        this.fsh = null;
      }
      com.tencent.mm.kernel.g.Rg().b(116, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailSuccess");
        if (this.gyi)
        {
          h.a(this.context, 2131300657, 2131297061, new g.2(this));
          AppMethodBeat.o(108651);
        }
        else
        {
          this.gyh.e(true, this.gyj);
          AppMethodBeat.o(108651);
        }
      }
      else
      {
        ab.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailFail");
        this.gyh.e(false, this.gyj);
        AppMethodBeat.o(108651);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.g
 * JD-Core Version:    0.6.2
 */