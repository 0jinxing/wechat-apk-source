package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.j;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.k.1;
import com.tencent.mm.plugin.wenote.model.k.2;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class c$7
  implements View.OnClickListener
{
  c$7(c paramc, com.tencent.mm.plugin.wenote.model.nativenote.b.a parama, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(27121);
    if (c.a(this.uUc) == 3)
    {
      this.uUb.g(true, 50L);
      this.uUb.af(1, 0L);
    }
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().av(-1, false);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.val$context, "android.permission.RECORD_AUDIO", 80, null, null);
    ab.i("MicroMsg.WNNoteFootPannel", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(27121);
    while (true)
    {
      return;
      if (!this.uUc.uTV)
      {
        if (!com.tencent.mm.compatible.util.f.Mn())
        {
          t.hO(this.val$context);
          AppMethodBeat.o(27121);
        }
        else if ((com.tencent.mm.r.a.bJ(this.val$context)) || (com.tencent.mm.r.a.bH(this.val$context)))
        {
          AppMethodBeat.o(27121);
        }
      }
      else
      {
        if (this.uUc.uTV)
          break label876;
        h.pYm.e(14547, new Object[] { Integer.valueOf(3) });
        if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gF(0, 1))
          break;
        this.uUb.ddW();
        AppMethodBeat.o(27121);
      }
    }
    this.uUc.uTP.setImageResource(2131231272);
    if (com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY().buH())
      com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY().stopPlay();
    this.uUc.uTV = true;
    Object localObject1 = new l();
    ((l)localObject1).type = 4;
    ((l)localObject1).uOp = false;
    ((l)localObject1).uOh = Boolean.TRUE;
    ((l)localObject1).uOD = this.val$context.getString(2131299770);
    this.uUc.uNM = "speex";
    ((l)localObject1).cAO = 1;
    ((l)localObject1).uOo = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().des();
    ((l)localObject1).uOf = this.uUc.uNM;
    ((l)localObject1).mnd = com.tencent.mm.plugin.wenote.model.f.agW(localObject1.toString());
    Object localObject2 = new aar();
    ((aar)localObject2).akU(((l)localObject1).mnd);
    ((aar)localObject2).akR(((l)localObject1).uOf);
    paramView = com.tencent.mm.plugin.wenote.model.nativenote.manager.k.deT();
    label407: com.tencent.mm.plugin.wenote.model.k localk;
    int k;
    if (paramView != null)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((com.tencent.mm.plugin.wenote.model.a.c)localObject1, paramView.deW(), false, false, false);
      localk = com.tencent.mm.plugin.wenote.model.k.ddK();
      paramView = this.uUc.uTW;
      localObject2 = com.tencent.mm.plugin.wenote.model.f.o((aar)localObject2);
      localk.uNQ = ((l)localObject1);
      int j = bo.getInt(((l)localObject1).uOo.substring(7), 0);
      localObject1 = ((l)localObject1).uOf;
      k = i;
      if (!localk.miB)
      {
        localk.miB = true;
        localk.mkf = null;
        localk.uNO = j;
        localk.uNP = paramView;
        localk.uNM = ((String)localObject1);
        localk.path = ((String)localObject2);
        if (localk.gar != null)
          localk.gar.requestFocus();
        localk.miC = false;
        if (bo.isNullOrNil(localk.path))
        {
          paramView = an.bvn();
          localObject2 = new com.tencent.mm.vfs.b(paramView);
          if (!((com.tencent.mm.vfs.b)localObject2).exists())
            ((com.tencent.mm.vfs.b)localObject2).mkdirs();
          do
            localObject2 = paramView + "/" + System.currentTimeMillis();
          while (new com.tencent.mm.vfs.b((String)localObject2).exists());
          localk.path = ((String)localObject2);
        }
        if (!bo.isNullOrNil((String)localObject1))
          break label896;
      }
    }
    label896: for (paramView = "amr"; ; paramView = (View)localObject1)
    {
      if (paramView.equals("speex"))
      {
        localk.uNL = new com.tencent.mm.modelvoice.k();
        new k.1(localk);
        label662: localk.miD = -1L;
        paramView = Boolean.FALSE;
        if (!((String)localObject1).equals("speex"))
          break label829;
        paramView = Boolean.valueOf(localk.uNL.el(localk.path));
        label701: if (!paramView.booleanValue())
          break label849;
        localk.ljM = bo.yz();
        localk.miP.ae(200L, 200L);
        label730: if (localk.ljM != 0L)
          break label858;
      }
      for (k = -1; ; k = i)
      {
        if (k < 0)
        {
          this.uUb.ddX();
          this.uUc.a(this.uUb);
        }
        AppMethodBeat.o(27121);
        break;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((com.tencent.mm.plugin.wenote.model.a.c)localObject1, null, false, false, false);
        break label407;
        paramView = c.a.eoR;
        localk.miM = new j();
        localk.miM.crh = new k.2(localk);
        break label662;
        label829: paramView = Boolean.valueOf(localk.miM.en(localk.path));
        break label701;
        label849: localk.ljM = 0L;
        break label730;
        label858: localk.uNR.sendEmptyMessage(4096);
      }
      label876: this.uUc.a(this.uUb);
      AppMethodBeat.o(27121);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.7
 * JD-Core Version:    0.6.2
 */