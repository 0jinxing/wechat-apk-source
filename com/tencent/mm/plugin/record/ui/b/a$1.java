package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.ui.RecordMsgImageUI;
import com.tencent.mm.protocal.protobuf.aar;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24336);
    Object localObject = (com.tencent.mm.plugin.record.ui.a.b)paramView.getTag();
    switch (((com.tencent.mm.plugin.record.ui.a.b)localObject).dataType)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(24336);
      while (true)
      {
        return;
        localIntent = new Intent(paramView.getContext(), RecordMsgImageUI.class);
        localIntent.putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).cvx);
        localIntent.putExtra("record_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).cAv.mnd);
        localIntent.putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject).cKa);
        if (((paramView.getContext() instanceof Activity)) && (((Activity)paramView.getContext()).getIntent() != null))
        {
          localObject = ((Activity)paramView.getContext()).getIntent().getBundleExtra("_stat_obj");
          if (localObject != null)
            localIntent.putExtra("_stat_obj", (Bundle)localObject);
        }
        paramView.getContext().startActivity(localIntent);
        AppMethodBeat.o(24336);
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).mnW.field_localId);
      localIntent.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).cAv.mnd);
      com.tencent.mm.plugin.fav.a.b.a(paramView.getContext(), ".ui.FavImgGalleryUI", localIntent, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a.1
 * JD-Core Version:    0.6.2
 */