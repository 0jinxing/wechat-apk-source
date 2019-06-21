package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;

public class h
{
  String hcl;
  Context mContext;
  private int tuT = 500;
  private long tuU = 0L;

  public void a(View paramView, m paramm)
  {
    AppMethodBeat.i(79817);
    if (System.currentTimeMillis() - this.tuU <= this.tuT)
    {
      ab.e("MicroMsg.MMSpanClickListener", "process pass");
      AppMethodBeat.o(79817);
    }
    while (true)
    {
      return;
      this.tuU = System.currentTimeMillis();
      if (paramm == null)
      {
        ab.e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
        AppMethodBeat.o(79817);
      }
      else
      {
        ab.d("MicroMsg.MMSpanClickListener", "MMSpanClickListener.onClick, hrefInfo type = %d", new Object[] { Integer.valueOf(paramm.type) });
        if (this.mContext != null)
          break;
        ab.e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
        AppMethodBeat.o(79817);
      }
    }
    g localg;
    if ((j.vrX != null) && (j.vrX.size() > 0))
    {
      int i = j.vrX.size();
      localg = (g)j.vrX.getLast();
      ab.d("MicroMsg.MMSpanClickListener", "spanCallbackList.size:%d, get the last callback", new Object[] { Integer.valueOf(i) });
    }
    while (true)
    {
      if ((paramView != null) && ((paramView.getTag() instanceof c)))
      {
        bi localbi = ((c)paramView.getTag()).cKd;
        if (localbi != null)
        {
          String str = localbi.field_talker;
          paramView = str;
          if (t.mN(str))
            paramView = bf.oy(localbi.field_content);
        }
      }
      while (true)
      {
        paramm.username = paramView;
        if (!TextUtils.isEmpty(this.hcl))
          paramm.hcl = this.hcl;
        b.a.vrC.a(this.mContext, paramm, localg);
        paramm.hcl = null;
        AppMethodBeat.o(79817);
        break;
        if ((paramView != null) && ((paramView.getTag() instanceof a)))
          paramView = ((a)paramView.getTag()).getUserName();
        else
          paramView = null;
      }
      localg = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.h
 * JD-Core Version:    0.6.2
 */