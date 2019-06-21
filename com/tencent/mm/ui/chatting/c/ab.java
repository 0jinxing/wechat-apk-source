package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.w;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.u.a;

@com.tencent.mm.ui.chatting.c.a.a(dFp=w.class)
public class ab extends a
  implements f, w
{
  private void ba(bi parambi)
  {
    AppMethodBeat.i(31601);
    com.tencent.mm.ui.chatting.view.b localb = new com.tencent.mm.ui.chatting.view.b(this.cgL.yTx.getContext());
    localb.zaY = new ab.2(this, localb, parambi);
    localb.show();
    com.tencent.mm.plugin.report.service.h.pYm.a(795L, 0L, 1L, false);
    AppMethodBeat.o(31601);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31599);
    super.dDh();
    aw.Rg().b(525, this);
    AppMethodBeat.o(31599);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31598);
    aw.Rg().b(525, this);
    AppMethodBeat.o(31598);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31597);
    aw.Rg().a(525, this);
    AppMethodBeat.o(31597);
  }

  public final void j(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(31600);
    bi localbi = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ou(paramMenuItem.getGroupId());
    if (localbi == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.MsgRemindComponent", "context item select failed, null msg");
      AppMethodBeat.o(31600);
      return;
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 134:
    }
    while (true)
    {
      AppMethodBeat.o(31600);
      break;
      aw.ZK();
      if (((Boolean)c.Ry().get(ac.a.xKG, Boolean.TRUE)).booleanValue())
      {
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131302354), this.cgL.yTx.getMMResources().getString(2131302355), new ab.1(this, localbi));
        aw.ZK();
        c.Ry().set(ac.a.xKG, Boolean.FALSE);
        AppMethodBeat.o(31600);
        break;
      }
      ba(localbi);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31602);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramm.getType());
    this.cgL.dismissDialog();
    if (!this.cgL.caA)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd fragment not foreground, return");
      AppMethodBeat.o(31602);
    }
    while (true)
    {
      return;
      if (!bo.cv(this.cgL.yTx.getContext()))
      {
        AppMethodBeat.o(31602);
      }
      else
      {
        Activity localActivity = this.cgL.yTx.getContext();
        int i;
        if (u.a.a(localActivity, paramInt1, paramInt2, paramString, 7))
          i = 1;
        while (true)
        {
          if (i == 0)
            break label219;
          AppMethodBeat.o(31602);
          break;
          if (u.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
            i = 1;
          else
            i = 0;
        }
        label219: if ((paramInt1 == 0) && (paramInt2 == 0));
        switch (paramm.getType())
        {
        default:
          AppMethodBeat.o(31602);
          break;
        case 525:
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.MsgRemindComponent", "set msg remind!");
          com.tencent.mm.ui.widget.snackbar.b.a(this.cgL.yTx.getContext(), this.cgL.yTx.getView(), this.cgL.yTx.getMMResources().getString(2131300518), "");
          AppMethodBeat.o(31602);
          continue;
          if (paramm.getType() == 525)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.MsgRemindComponent", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", new Object[] { Integer.valueOf(525), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), bo.nullAsNil(paramString) });
            localActivity = this.cgL.yTx.getContext();
            paramm = paramString;
            if (bo.isNullOrNil(paramString))
              paramm = this.cgL.yTx.getMMResources().getString(2131302350);
            com.tencent.mm.ui.base.h.b(localActivity, paramm, this.cgL.yTx.getMMResources().getString(2131302351), true);
            com.tencent.mm.plugin.report.service.h.pYm.a(795L, 4L, 1L, false);
          }
          AppMethodBeat.o(31602);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ab
 * JD-Core Version:    0.6.2
 */