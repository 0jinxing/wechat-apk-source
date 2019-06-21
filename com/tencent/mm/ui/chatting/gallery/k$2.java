package com.tencent.mm.ui.chatting.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.a;
import com.tencent.mm.ui.chatting.a.a;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.q;

final class k$2
  implements View.OnClickListener
{
  k$2(k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32383);
    s locals;
    cfh localcfh;
    Object localObject;
    int i;
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof bi)))
    {
      bi localbi = (bi)paramView.getTag();
      a.a(a.a.yFu, localbi);
      locals = u.ut(localbi.field_imgPath);
      localcfh = locals.fXm;
      if ((localcfh != null) && (!ah.isNullOrNil(localcfh.fiG)))
      {
        o.all();
        paramView = com.tencent.mm.modelvideo.t.ui(localbi.field_imgPath);
        Intent localIntent = new Intent();
        localIntent.putExtra("IsAd", false);
        localIntent.putExtra("KStremVideoUrl", localcfh.fiG);
        localIntent.putExtra("KThumUrl", localcfh.fiL);
        localIntent.putExtra("KThumbPath", paramView);
        localIntent.putExtra("KMediaId", "fakeid_" + localbi.field_msgId);
        localIntent.putExtra("KMediaVideoTime", localcfh.wid);
        localIntent.putExtra("KMediaTitle", localcfh.fiI);
        localIntent.putExtra("StreamWording", localcfh.fiJ);
        localIntent.putExtra("StremWebUrl", localcfh.fiK);
        localObject = localbi.field_talker;
        boolean bool = com.tencent.mm.model.t.kH((String)localObject);
        if (bool)
        {
          paramView = bf.oy(localbi.field_content);
          localIntent.putExtra("KSta_StremVideoAduxInfo", localcfh.fiM);
          localIntent.putExtra("KSta_StremVideoPublishId", localcfh.fiN);
          localIntent.putExtra("KSta_SourceType", 1);
          if (!bool)
            break label395;
          i = a.b.yFD.value;
          label286: localIntent.putExtra("KSta_Scene", i);
          localIntent.putExtra("KSta_FromUserName", paramView);
          localIntent.putExtra("KSta_ChatName", (String)localObject);
          localIntent.putExtra("KSta_MsgId", localbi.field_msgSvrId);
          localIntent.putExtra("KSta_SnsStatExtStr", locals.cMn);
          if (bool)
            localIntent.putExtra("KSta_ChatroomMembercount", n.mA((String)localObject));
          d.b(this.yXH.yUe.yTI.mController.ylL, "sns", ".ui.VideoAdPlayerUI", localIntent);
          AppMethodBeat.o(32383);
        }
      }
    }
    while (true)
    {
      return;
      paramView = (View)localObject;
      break;
      label395: i = a.b.yFC.value;
      break label286;
      if ((localcfh != null) && (!bo.isNullOrNil(localcfh.fiJ)) && (!bo.isNullOrNil(localcfh.fiK)))
      {
        ab.i("MicroMsg.ImageGalleryViewHolder", "moreBtn click,opening " + localcfh.fiK);
        localObject = new Intent();
        paramView = new Bundle();
        paramView.putString("key_snsad_statextstr", locals.cMn);
        ((Intent)localObject).putExtra("jsapiargs", paramView);
        ((Intent)localObject).putExtra("rawUrl", localcfh.fiK);
        ((Intent)localObject).putExtra("useJs", true);
        new ak(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(32382);
            d.b(k.2.this.yXH.yUe.yTI.mController.ylL, "webview", ".ui.tools.WebViewUI", this.val$intent);
            AppMethodBeat.o(32382);
          }
        });
      }
      AppMethodBeat.o(32383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.2
 * JD-Core Version:    0.6.2
 */