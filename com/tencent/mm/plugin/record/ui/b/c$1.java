package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.record.ui.RecordMsgFileUI;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24362);
    com.tencent.mm.plugin.record.ui.a.b localb = (com.tencent.mm.plugin.record.ui.a.b)paramView.getTag();
    Object localObject;
    if (localb.dataType == 0)
      if (n.d(localb.cAv, localb.cvx))
      {
        ab.i("MicroMsg.SightViewWrapper", "onclick: play sight");
        localObject = new Intent(paramView.getContext(), RecordMsgFileUI.class);
        ((Intent)localObject).putExtra("message_id", localb.cvx);
        ((Intent)localObject).putExtra("record_xml", localb.cKa);
        ((Intent)localObject).putExtra("record_data_id", localb.cAv.mnd);
        paramView.getContext().startActivity((Intent)localObject);
        AppMethodBeat.o(24362);
      }
    label263: label670: 
    while (true)
    {
      return;
      localObject = n.h(localb.cAv.mnd, localb.cvx, true);
      i locali = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH((String)localObject);
      if (locali == null);
      for (localObject = "null"; ; localObject = Integer.valueOf(locali.field_status))
      {
        ab.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", new Object[] { localObject });
        if ((locali == null) || (2 == locali.field_status) || (3 == locali.field_status))
          break label263;
        if (4 != locali.field_status)
          break label237;
        h.bQ(paramView.getContext(), paramView.getResources().getString(2131299712));
        AppMethodBeat.o(24362);
        break;
      }
      label237: if ((locali.field_status == 0) || (1 == locali.field_status))
      {
        AppMethodBeat.o(24362);
      }
      else
      {
        n.b(localb.cAv, localb.cvx, true);
        AppMethodBeat.o(24362);
        continue;
        if (localb.dataType == 1)
        {
          ab.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(localb.mnW.field_id), Long.valueOf(localb.mnW.field_localId), Integer.valueOf(localb.mnW.field_itemStatus) });
          if (localb.mnW.isDone())
          {
            localObject = new gh();
            ((gh)localObject).cAH.type = 14;
            ((gh)localObject).cAH.cAJ = localb.cAv;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
            ab.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", new Object[] { Integer.valueOf(((gh)localObject).cAI.ret) });
            if (((gh)localObject).cAI.ret == 1)
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("key_detail_info_id", localb.mnW.field_localId);
              ((Intent)localObject).putExtra("key_detail_data_id", localb.cAv.mnd);
              ((Intent)localObject).putExtra("key_detail_can_delete", false);
              com.tencent.mm.plugin.fav.a.b.a(paramView.getContext(), ".ui.detail.FavoriteFileDetailUI", (Intent)localObject, 1);
              AppMethodBeat.o(24362);
            }
            else if (bo.isNullOrNil(localb.cAv.wfZ))
            {
              ab.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
              AppMethodBeat.o(24362);
            }
            else
            {
              ab.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
            }
          }
          else
          {
            while (true)
            {
              paramView = new gh();
              paramView.cAH.cvv = localb.mnW.field_localId;
              if (!localb.mnW.bux())
                break label670;
              ab.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
              paramView.cAH.type = 15;
              com.tencent.mm.sdk.b.a.xxA.m(paramView);
              AppMethodBeat.o(24362);
              break;
              if ((localb.mnW.buy()) || (localb.mnW.bux()))
              {
                ab.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
              }
              else
              {
                if ((localb.mnW.isDownloading()) || (localb.mnW.buw()))
                {
                  ab.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                  AppMethodBeat.o(24362);
                  break;
                }
                ab.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
              }
            }
            ab.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
            paramView.cAH.type = 16;
            com.tencent.mm.sdk.b.a.xxA.m(paramView);
          }
        }
        else
        {
          AppMethodBeat.o(24362);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.c.1
 * JD-Core Version:    0.6.2
 */