package com.tencent.mm.plugin.fav.ui.gallery;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class f$d$2
  implements View.OnClickListener
{
  f$d$2(f.d paramd, f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74570);
    f.c localc = this.mor.moe.vG(((Integer)paramView.getTag(2131820604)).intValue());
    if (localc == null)
      AppMethodBeat.o(74570);
    f localf;
    Intent localIntent;
    while (true)
    {
      return;
      localf = this.mor.moe;
      localIntent = new Intent();
      if (localc == null)
      {
        ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
        AppMethodBeat.o(74570);
      }
      else
      {
        paramView = localc.mof;
        if (paramView != null)
          break;
        ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
        AppMethodBeat.o(74570);
      }
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject = localf.iJL.iterator();
    int i = 0;
    label121: if (((Iterator)localObject).hasNext())
    {
      long l = ((f.c)((Iterator)localObject).next()).mof.mnW.field_localId;
      if (localArrayList.contains(Long.valueOf(l)))
        break label466;
      localArrayList.add(Long.valueOf(l));
      if (l != localc.mof.mnW.field_localId)
        break label466;
    }
    label297: label309: label466: for (int j = localArrayList.size() - 1; ; j = i)
    {
      i = j;
      break label121;
      localObject = new long[localArrayList.size()];
      if (i - 20 > 0)
      {
        j = i - 20;
        if (i + 20 >= localArrayList.size())
          break label297;
        i += 20;
      }
      while (true)
      {
        if (j >= i)
          break label309;
        localObject[j] = ((Long)localArrayList.get(j)).longValue();
        j++;
        continue;
        j = 0;
        break;
        i = localArrayList.size();
      }
      localIntent.addFlags(536870912);
      localIntent.putExtra("KEY_MEDIA_FAVID_LIST", (long[])localObject).putExtra("key_detail_info_id", paramView.mnW.field_localId).putExtra("key_detail_data_id", paramView.cAJ.mnd);
      localIntent.putExtra("key_detail_fav_scene", localf.mnG.scene);
      localIntent.putExtra("key_detail_fav_sub_scene", localf.mnG.jSW);
      localIntent.putExtra("key_detail_fav_index", 0);
      localIntent.putExtra("key_detail_fav_query", localf.mnG.query);
      localIntent.putExtra("key_detail_fav_sessionid", localf.mnG.cvF);
      localIntent.putExtra("key_detail_fav_tags", localf.mnG.mfg);
      b.b(localf.mContext, ".ui.gallery.FavMediaGalleryUI", localIntent);
      ((Activity)localf.mContext).overridePendingTransition(0, 0);
      AppMethodBeat.o(74570);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d.2
 * JD-Core Version:    0.6.2
 */