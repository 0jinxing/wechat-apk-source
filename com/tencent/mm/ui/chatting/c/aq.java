package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.u.a;
import java.util.List;

public class aq extends a
  implements f, k.a, n.b, v
{
  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(31845);
    if (!this.cgL.caA)
    {
      ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange fragment not foreground, return");
      AppMethodBeat.o(31845);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange ".concat(String.valueOf(paramInt)));
      aw.ZK();
      paramn = c.XM().aoO(this.cgL.getTalkerUserName());
      if ((paramn != null) && ((int)paramn.ewQ != 0))
      {
        if (bo.isNullOrNil(paramn.field_nickname))
          paramn.iB(this.cgL.sRl.field_nickname);
        this.cgL.af(paramn);
        ((r)this.cgL.aF(r.class)).dEm();
        ((r)this.cgL.aF(r.class)).qr(true);
        this.cgL.aWv();
      }
      AppMethodBeat.o(31845);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    label0: break label0;
  }

  public final void dDh()
  {
    AppMethodBeat.i(31843);
    super.dDh();
    aw.Rg().b(137, this);
    if (aw.RK())
    {
      aw.ZK();
      c.XM().b(this);
    }
    AppMethodBeat.o(31843);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31842);
    aw.Rg().b(137, this);
    if (aw.RK())
    {
      aw.ZK();
      c.XM().b(this);
    }
    AppMethodBeat.o(31842);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31841);
    aw.Rg().a(137, this);
    aw.ZK();
    c.XM().a(this);
    AppMethodBeat.o(31841);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = 1;
    AppMethodBeat.i(31844);
    ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramm.getType());
    this.cgL.dismissDialog();
    if (!this.cgL.caA)
    {
      ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd fragment not foreground, return");
      AppMethodBeat.o(31844);
    }
    while (true)
    {
      return;
      if (bo.cv(this.cgL.yTx.getContext()))
        break;
      AppMethodBeat.o(31844);
    }
    Object localObject = this.cgL.yTx.getContext();
    if (u.a.a((Context)localObject, paramInt1, paramInt2, paramString, 7));
    while (true)
    {
      if (i == 0)
        break label204;
      AppMethodBeat.o(31844);
      break;
      if (!u.a((Activity)localObject, paramInt1, paramInt2, new Intent().setClass((Context)localObject, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
        i = 0;
    }
    label204: if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
      case 137:
      }
    label398: 
    while (true)
    {
      AppMethodBeat.o(31844);
      break;
      paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).vbm;
      if ((paramString == null) || (paramString.contains(this.cgL.sRl.field_username)))
      {
        localObject = this.cgL.sRl;
        aw.ZK();
        paramm = c.XM().aoO(((ap)localObject).field_username);
        if (paramm != null)
        {
          paramString = paramm;
          if ((int)paramm.ewQ != 0);
        }
        else
        {
          aw.ZK();
          if (c.XM().Y((ad)localObject))
            break label379;
          ab.e("MicroMsg.ChattingUI.ChattingLogic", "insert contact failed, username = " + ((ap)localObject).field_username);
        }
        for (paramString = null; ; paramString = c.XM().aoO(((ap)localObject).field_username))
        {
          if (paramString == null)
            break label398;
          t.q(paramString);
          break;
          label379: aw.ZK();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.aq
 * JD-Core Version:    0.6.2
 */