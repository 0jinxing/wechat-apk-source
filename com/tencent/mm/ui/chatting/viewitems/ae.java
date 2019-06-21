package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jj.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.ui.chatting.s.e;

public final class ae
{
  public static final class c extends s.e
  {
    public c(com.tencent.mm.ui.chatting.d.a parama)
    {
      super();
    }

    public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33260);
      parambi = ((ay)paramView.getTag()).cKd;
      parama = parambi.field_content;
      int i;
      if (parambi.field_isSend == 0)
      {
        i = 1;
        paramView = "";
        if (i != 0)
          paramView = parambi.field_talker;
        if ((!t.kH(parambi.field_talker)) || (i == 0) || (((com.tencent.mm.ui.chatting.c.b.d)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
          break label500;
        i = bf.ox(parama);
        if (i == -1)
          break label500;
        paramView = parama.substring(0, i).trim();
        parama = parama.substring(i + 1).trim();
      }
      label500: 
      while (true)
      {
        aw.ZK();
        parama = c.XO().Ro(parama);
        if ((!ah.isNullOrNil(paramView)) && (t.kH(paramView)))
          paramView = "";
        while (true)
        {
          Object localObject = new jj();
          ((jj)localObject).cEF.cEA = 1;
          ((jj)localObject).cEF.csG = parambi;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          String str = ((jj)localObject).cEG.cBp;
          if ((ah.isNullOrNil(parama.eUu)) && (!parama.dub()))
          {
            ab.w("MicroMsg.LocationClickListener", "invalid poi: %s, %s", new Object[] { parama.eUu, Boolean.valueOf(parama.dub()) });
            AppMethodBeat.o(33260);
          }
          while (true)
          {
            return;
            i = 0;
            break;
            localObject = new Intent();
            ((Intent)localObject).putExtra("kMsgId", parambi.field_msgId);
            ((Intent)localObject).putExtra("map_view_type", 1);
            ((Intent)localObject).putExtra("kwebmap_slat", parama.nJu);
            ((Intent)localObject).putExtra("kwebmap_lng", parama.nJv);
            ((Intent)localObject).putExtra("kwebmap_scale", parama.cED);
            ((Intent)localObject).putExtra("kPoiName", parama.eUu);
            ((Intent)localObject).putExtra("kisUsername", s.mJ(paramView));
            ((Intent)localObject).putExtra("Kwebmap_locaion", str);
            aw.ZK();
            ((Intent)localObject).putExtra("kimg_path", c.XW());
            ((Intent)localObject).putExtra("map_talker_name", parambi.field_talker);
            ((Intent)localObject).putExtra("view_type_key", 0);
            ((Intent)localObject).putExtra("kwebmap_from_to", true);
            ((Intent)localObject).putExtra("kPoi_url", parama.vaO);
            ((Intent)localObject).putExtra("kPoiid", parama.nJB);
            ((Intent)localObject).putExtra("soso_street_view_url", ah.bc(parambi.field_reserved, ""));
            com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(2), "" });
            com.tencent.mm.bp.d.a(this.yJI.yTv, "location", ".ui.RedirectUI", (Intent)localObject, 2002, new ae.c.1(this));
            AppMethodBeat.o(33260);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ae
 * JD-Core Version:    0.6.2
 */