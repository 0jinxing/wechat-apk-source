package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.record.b.s;
import com.tencent.mm.plugin.record.b.s.a;
import com.tencent.mm.plugin.record.ui.RecordVoiceBaseView;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class e
  implements h.b
{
  private s pKR;
  RecordVoiceBaseView pLj;

  public e()
  {
    AppMethodBeat.i(24374);
    this.pKR = new s();
    AppMethodBeat.o(24374);
  }

  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    AppMethodBeat.i(24376);
    Object localObject = paramView.findViewById(2131826912);
    this.pLj = ((RecordVoiceBaseView)paramView.findViewById(2131824006));
    if (paramb.dataType == 0)
    {
      this.pLj.setVisibility(8);
      ((View)localObject).setVisibility(0);
      AppMethodBeat.o(24376);
      return;
    }
    int i;
    if (paramb.dataType == 1)
    {
      ((View)localObject).setVisibility(8);
      this.pLj.setVisibility(0);
      paramView = com.tencent.mm.plugin.record.b.g.a(paramb);
      gh localgh = new gh();
      localgh.cAH.type = 17;
      localgh.cAH.cAJ = paramb.cAv;
      a.xxA.m(localgh);
      i = localgh.cAI.ret;
      if (!com.tencent.mm.a.e.ct(paramView))
      {
        if (!bo.isNullOrNil(paramb.cAv.wfZ))
          break label254;
        ((View)localObject).setVisibility(0);
        this.pLj.setVisibility(8);
      }
    }
    while (true)
    {
      localObject = this.pLj;
      paramInt = paramb.cAv.duration;
      ((RecordVoiceBaseView)localObject).path = bo.bc(paramView, "");
      ((RecordVoiceBaseView)localObject).cAO = i;
      if (((RecordVoiceBaseView)localObject).duration != paramInt)
      {
        ((RecordVoiceBaseView)localObject).duration = paramInt;
        ((RecordVoiceBaseView)localObject).setText((int)q.fY(paramInt) + "''");
      }
      AppMethodBeat.o(24376);
      break;
      label254: ab.d("MicroMsg.VoiceViewWrapper", "restart voice %s, url %s", new Object[] { Long.valueOf(paramb.mnW.field_localId), paramb.cAv.wfZ });
      localObject = new gh();
      ((gh)localObject).cAH.type = 16;
      ((gh)localObject).cAH.cvv = paramb.mnW.field_localId;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(24377);
    s locals = this.pKR;
    locals.stopPlay();
    locals.buK();
    s.mfW = null;
    locals.callbacks.clear();
    AppMethodBeat.o(24377);
  }

  public final View eK(Context paramContext)
  {
    AppMethodBeat.i(24375);
    paramContext = View.inflate(paramContext, 2130970485, null);
    ((RecordVoiceBaseView)paramContext.findViewById(2131824006)).setVoiceHelper(this.pKR);
    AppMethodBeat.o(24375);
    return paramContext;
  }

  public final void pause()
  {
    AppMethodBeat.i(24378);
    if ((this.pKR != null) && (this.pKR.callbacks.size() > 0))
    {
      Iterator localIterator = this.pKR.callbacks.iterator();
      while (localIterator.hasNext())
        ((s.a)localIterator.next()).onFinish();
    }
    AppMethodBeat.o(24378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.e
 * JD-Core Version:    0.6.2
 */