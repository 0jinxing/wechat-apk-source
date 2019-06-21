package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;
import com.tencent.mm.ui.u.a;

public final class c
  implements View.OnClickListener, f, com.tencent.mm.pluginsdk.model.app.t
{
  private ProgressDialog ehJ;
  private a yGF;

  public c(a parama)
  {
    this.yGF = parama;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(30384);
    ab.d("MicroMsg.AppSpamClickListener", "appsettings errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    am.bYM().b(2, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bQ(this.yGF.yTx.getContext(), this.yGF.yTx.getMMResources().getString(2131300336));
      AppMethodBeat.o(30384);
    }
    while (true)
    {
      return;
      if (u.a.a(this.yGF.yTx.getContext(), paramInt1, paramInt2, paramString, 4))
      {
        AppMethodBeat.o(30384);
      }
      else
      {
        Toast.makeText(this.yGF.yTx.getContext(), this.yGF.yTx.getMMResources().getString(2131300282, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(30384);
      }
    }
  }

  public final void onClick(View paramView)
  {
    boolean bool = true;
    int i = 0;
    AppMethodBeat.i(30383);
    if (paramView.getTag() == null)
    {
      ab.e("MicroMsg.AppSpamClickListener", "onClick tag is null");
      AppMethodBeat.o(30383);
    }
    Object localObject1;
    while (true)
    {
      return;
      if (!(paramView.getTag() instanceof ay))
        break label303;
      localObject1 = (ay)paramView.getTag();
      if (localObject1 != null)
        break;
      ab.e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
      AppMethodBeat.o(30383);
    }
    paramView = ((ay)localObject1).cJM.appId;
    if (bo.isNullOrNil(paramView))
      ab.e("MicroMsg.AppSpamClickListener", "appId is null or nil");
    while (true)
    {
      if (i != 0)
        break label137;
      AppMethodBeat.o(30383);
      break;
      if (g.bT(paramView, false) == null)
        ab.e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = ".concat(String.valueOf(paramView)));
      else
        i = 1;
    }
    label137: am.bYM().a(2, this);
    if (this.yGF.dFx())
    {
      i = 2;
      label157: paramView = this.yGF.getTalkerUserName();
      if (!com.tencent.mm.model.t.kH(paramView))
        break label521;
      paramView = bf.oy(((ay)localObject1).cKd.field_content);
    }
    label521: 
    while (true)
    {
      localObject1 = ((ay)localObject1).cJM;
      h.d(this.yGF.yTx.getContext(), this.yGF.yTx.getMMResources().getString(2131296971), this.yGF.yTx.getMMResources().getString(2131296972), this.yGF.yTx.getMMResources().getString(2131296381), this.yGF.yTx.getMMResources().getString(2131302216), new c.2(this, (j.b)localObject1, paramView, i), new c.3(this, (j.b)localObject1, paramView, i));
      AppMethodBeat.o(30383);
      break;
      i = 1;
      break label157;
      label303: if ((paramView.getTag() instanceof s.o))
      {
        Object localObject2 = (s.o)paramView.getTag();
        if (localObject2 == null)
        {
          ab.e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
          AppMethodBeat.o(30383);
          break;
        }
        if ((localObject2 == null) || (bo.isNullOrNil(((s.o)localObject2).fhu)) || (((s.o)localObject2).cKd == null))
        {
          if (localObject2 == null);
          while (true)
          {
            ab.e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", new Object[] { Boolean.valueOf(bool) });
            AppMethodBeat.o(30383);
            break;
            bool = false;
          }
        }
        paramView = this.yGF.yTx.getMMResources().getString(2131304034);
        localObject1 = this.yGF.yTx.getMMResources().getString(2131304035);
        String str = this.yGF.yTx.getMMResources().getString(2131296868);
        Activity localActivity = this.yGF.yTx.getContext();
        localObject2 = new c.1(this, (s.o)localObject2);
        h.a(localActivity, null, new String[] { paramView, localObject1, str }, null, true, (h.c)localObject2);
      }
      AppMethodBeat.o(30383);
      break;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(30385);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    aw.Rg().b(1030, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bQ(this.yGF.yTx.getContext(), this.yGF.yTx.getMMResources().getString(2131300336));
      AppMethodBeat.o(30385);
    }
    while (true)
    {
      return;
      Toast.makeText(this.yGF.yTx.getContext(), this.yGF.yTx.getMMResources().getString(2131304036, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(30385);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c
 * JD-Core Version:    0.6.2
 */