package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.c;
import com.tencent.mm.bi.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;

public final class a extends LinearLayout
  implements com.tencent.mm.ai.f
{
  private static a.a vqm;
  private Context context;
  private TextView gKl;
  private com.tencent.mm.ui.base.p tipDialog;
  private Button vqn;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(28030);
    this.context = paramContext;
    paramContext = View.inflate(this.context, 2130969583, this);
    this.gKl = ((TextView)paramContext.findViewById(2131824108));
    this.vqn = ((Button)paramContext.findViewById(2131824109));
    this.vqn.setOnClickListener(new a.1(this));
    AppMethodBeat.o(28030);
  }

  private static int ajL(String paramString)
  {
    int i = 6;
    AppMethodBeat.i(28032);
    if (paramString == null)
    {
      ab.d("MicroMsg.FMessageItemView", "getOpCodeFromVerify fail, xml is null");
      AppMethodBeat.o(28032);
    }
    while (true)
    {
      return i;
      switch (bi.d.apF(paramString).cAd)
      {
      case 3:
      case 4:
      default:
        AppMethodBeat.o(28032);
        break;
      case 2:
      case 5:
        AppMethodBeat.o(28032);
        break;
      case 6:
        i = 5;
        AppMethodBeat.o(28032);
      }
    }
  }

  public static void setFMessageArgs(a.a parama)
  {
    vqm = parama;
  }

  public final void detach()
  {
    AppMethodBeat.i(28031);
    aw.Rg().b(30, this);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(28031);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(28035);
    if (paramm.getType() != 30)
    {
      AppMethodBeat.o(28035);
      return;
    }
    ab.d("MicroMsg.FMessageItemView", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramInt1 = ((com.tencent.mm.pluginsdk.model.m)paramm).cAd;
      paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).vbn;
      ab.d("MicroMsg.FMessageItemView", "onSceneEnd, pre insert fmsg, opcode = " + paramInt1 + ", verifyContent = " + paramString);
      ab.d("MicroMsg.FMessageItemView", "onSceneEnd, type = " + vqm.type);
      switch (vqm.type)
      {
      default:
        paramm = new ax();
        paramm.field_createTime = c.q(vqm.talker, 0L);
        paramm.field_isSend = 1;
        paramm.field_msgContent = paramString;
        paramm.field_talker = vqm.talker;
        if (paramInt1 != 5)
          break;
      case 1:
      case 2:
      }
      for (paramInt1 = 2; ; paramInt1 = 3)
      {
        paramm.field_type = paramInt1;
        ab.d("MicroMsg.FMessageItemView", "onSceneEnd, insert fmsg, ret = ".concat(String.valueOf(d.akO().b(paramm))));
        while (true)
        {
          aw.Rg().b(30, this);
          AppMethodBeat.o(28035);
          break;
          paramm = new bf();
          paramm.field_createtime = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOo().QV(vqm.talker);
          paramm.field_isSend = 1;
          paramm.field_content = paramString;
          paramm.field_talker = "fmessage";
          paramm.field_sayhiuser = vqm.talker;
          paramm.field_svrid = System.currentTimeMillis();
          paramm.field_status = 4;
          d.akQ().a(paramm);
          continue;
          paramm = new bt();
          paramm.field_createtime = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOn().QV(vqm.talker);
          paramm.field_isSend = 1;
          paramm.field_content = paramString;
          paramm.field_talker = "fmessage";
          paramm.field_sayhiuser = vqm.talker;
          paramm.field_svrid = System.currentTimeMillis();
          paramm.field_status = 4;
          ab.d("MicroMsg.FMessageItemView", "onSceneEnd, insert shake, ret = ".concat(String.valueOf(d.akR().a(paramm))));
        }
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -34))
      paramm = this.context.getString(2131299915);
    while (true)
    {
      Toast.makeText(this.context, paramm, 1).show();
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
      {
        paramm = this.context.getString(2131299918);
      }
      else if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        paramm = paramString;
        if (!bo.isNullOrNil(paramString));
      }
      else
      {
        paramm = this.context.getString(2131302960);
      }
    }
  }

  public final void setBtnVisibility(int paramInt)
  {
    AppMethodBeat.i(28034);
    if (this.vqn != null)
      this.vqn.setVisibility(paramInt);
    AppMethodBeat.o(28034);
  }

  public final void setContentText(String paramString)
  {
    AppMethodBeat.i(28033);
    if (bo.isNullOrNil(paramString))
    {
      this.gKl.setVisibility(8);
      AppMethodBeat.o(28033);
    }
    while (true)
    {
      return;
      this.gKl.setVisibility(0);
      this.gKl.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, bo.nullAsNil(paramString), this.gKl.getTextSize()));
      AppMethodBeat.o(28033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.a
 * JD-Core Version:    0.6.2
 */