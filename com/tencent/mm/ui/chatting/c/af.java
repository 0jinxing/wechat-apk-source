package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.t;
import com.tencent.mm.protocal.protobuf.btj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.al;
import com.tencent.mm.ui.chatting.al.a;
import com.tencent.mm.ui.chatting.c.b.y;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.u.a;

@com.tencent.mm.ui.chatting.c.a.a(dFp=y.class)
public class af extends a
  implements f, y
{
  private final com.tencent.mm.sdk.b.c edy;
  private com.tencent.mm.ui.widget.a.c yRn;

  public af()
  {
    AppMethodBeat.i(31635);
    this.edy = new al(al.a.yMd, null);
    this.yRn = null;
    AppMethodBeat.o(31635);
  }

  public final void bj(final bi parambi)
  {
    AppMethodBeat.i(31641);
    final t localt = new t(parambi, this.cgL.yTx.getMMResources().getString(2131298222));
    this.cgL.c(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131298221), new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(31631);
        ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "cancel revoke msg:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
        aw.Rg().c(localt);
        AppMethodBeat.o(31631);
      }
    });
    aw.Rg().a(localt, 0);
    AppMethodBeat.o(31641);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31640);
    super.dDh();
    com.tencent.mm.sdk.b.a.xxA.d(this.edy);
    aw.Rg().b(594, this);
    AppMethodBeat.o(31640);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31637);
    if (!com.tencent.mm.sdk.b.a.xxA.e(this.edy))
      com.tencent.mm.sdk.b.a.xxA.c(this.edy);
    AppMethodBeat.o(31637);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31638);
    com.tencent.mm.sdk.b.a.xxA.d(this.edy);
    AppMethodBeat.o(31638);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31639);
    aw.Rg().b(594, this);
    AppMethodBeat.o(31639);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31636);
    aw.Rg().a(594, this);
    AppMethodBeat.o(31636);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31642);
    ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramm.getType());
    this.cgL.dismissDialog();
    if (this.yRn != null)
    {
      this.yRn.dismiss();
      this.yRn = null;
    }
    if (!this.cgL.caA)
    {
      ab.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd fragment not foreground, return");
      AppMethodBeat.o(31642);
    }
    while (true)
    {
      return;
      if (!bo.cv(this.cgL.yTx.getContext()))
      {
        AppMethodBeat.o(31642);
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
            break label229;
          AppMethodBeat.o(31642);
          break;
          if (u.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
            i = 1;
          else
            i = 0;
        }
        label229: if ((paramInt1 == 0) && (paramInt2 == 0));
        switch (paramm.getType())
        {
        default:
          AppMethodBeat.o(31642);
          break;
        case 594:
          paramString = ((t)paramm).ajB();
          if (!bo.isNullOrNil(paramString.wVs))
          {
            h.a(this.cgL.yTx.getContext(), paramString.wVs, "", this.cgL.yTx.getMMResources().getString(2131298219), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                AppMethodBeat.i(31632);
                if (paramAnonymousDialogInterface != null)
                  paramAnonymousDialogInterface.dismiss();
                AppMethodBeat.o(31632);
              }
            });
            AppMethodBeat.o(31642);
            continue;
            if (paramm.getType() == 594)
            {
              paramString = ((t)paramm).ajB();
              ab.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsgTimeout] sysWording:%s", new Object[] { paramString.wVt });
              if ((paramInt2 != 0) && (!bo.isNullOrNil(paramString.wVt)));
              for (paramInt1 = 0; ; paramInt1 = 1)
              {
                if (paramInt1 != 0)
                  break label477;
                ab.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsg] sysWording:%s", new Object[] { paramString.wVt });
                this.yRn = h.a(this.cgL.yTx.getContext(), paramString.wVt, "", this.cgL.yTx.getMMResources().getString(2131298219), new af.3(this));
                AppMethodBeat.o(31642);
                break;
              }
              label477: ab.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsg] errorCode:%s,sysWording:%s", new Object[] { Integer.valueOf(paramInt2), paramString.wVt });
              this.yRn = h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131298220), "", this.cgL.yTx.getMMResources().getString(2131298219), new af.4(this));
            }
          }
          else
          {
            AppMethodBeat.o(31642);
          }
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.af
 * JD-Core Version:    0.6.2
 */