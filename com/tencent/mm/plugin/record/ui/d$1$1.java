package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.b.g;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.Map;

final class d$1$1
  implements Runnable
{
  d$1$1(d.1 param1, com.tencent.mm.plugin.fav.a.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24195);
    Object localObject1 = (View)com.tencent.mm.plugin.record.ui.b.c.pLf.get(this.pKd.field_dataId);
    boolean bool;
    if (localObject1 == null)
    {
      bool = true;
      ab.d("MicroMsg.FavRecordAdapter", "view is null %s", new Object[] { Boolean.valueOf(bool) });
      if (localObject1 != null)
        break label65;
      AppMethodBeat.o(24195);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label65: Object localObject2 = (b)((View)localObject1).getTag();
      String str = g.a((b)localObject2);
      ab.d("MicroMsg.FavRecordAdapter", "dataItemId: %s", new Object[] { ((b)localObject2).cAv.mnd });
      if (((b)localObject2).cAv.mnd.equals(this.pKd.field_dataId))
      {
        ab.d("MicroMsg.FavRecordAdapter", "change the sight status %s, dataId %s, progress %s cdnInfo %s", new Object[] { Integer.valueOf(this.pKd.field_status), this.pKd.field_dataId, Float.valueOf(this.pKd.getProgress()), Boolean.valueOf(this.pKd.isFinished()) });
        ImageView localImageView = (ImageView)((View)localObject1).findViewById(2131820981);
        localObject2 = (MMPinProgressBtn)((View)localObject1).findViewById(2131821370);
        localObject1 = (a)((View)localObject1).findViewById(2131820629);
        localImageView.setVisibility(8);
        ((MMPinProgressBtn)localObject2).setVisibility(8);
        ab.i("MicroMsg.FavRecordAdapter", "setVideoPath ".concat(String.valueOf(str)));
        ((a)localObject1).setCanPlay(true);
        ((a)localObject1).bf(str, false);
      }
      AppMethodBeat.o(24195);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.d.1.1
 * JD-Core Version:    0.6.2
 */