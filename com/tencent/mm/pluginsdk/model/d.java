package com.tencent.mm.pluginsdk.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.fav.PluginFav;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

public class d
  implements a
{
  public final void callback(Bundle paramBundle)
  {
    AppMethodBeat.i(27236);
    int i = paramBundle.getInt("mm_rpt_fav_id", 0);
    int j = paramBundle.getInt("key_detail_fav_scene", 0);
    int k = paramBundle.getInt("key_detail_fav_sub_scene", 0);
    int m = paramBundle.getInt("key_detail_fav_index", 0);
    long l1 = paramBundle.getLong("key_activity_browse_time", -1L);
    int n;
    int i1;
    int i2;
    if (paramBundle.getBoolean("mm_scroll_bottom"))
    {
      n = 1;
      i1 = paramBundle.getInt("mm_send_friend_count", 0);
      i2 = paramBundle.getInt("mm_share_sns_count", 0);
      if (!paramBundle.getBoolean("mm_del_fav", false))
        break label257;
    }
    int i4;
    String str1;
    String str2;
    String str3;
    label257: for (int i3 = 1; ; i3 = 0)
    {
      i4 = paramBundle.getInt("mm_edit_fav_count", 0);
      str1 = paramBundle.getString("key_detail_fav_query", "");
      str2 = paramBundle.getString("key_detail_fav_sessionid", "");
      str3 = paramBundle.getString("key_detail_fav_tags", "");
      ab.d("MicroMsg.FavWebRptCallback", "FavWebRptCallback uiBrowseTime[%d] isScrollBottom[%b] sendToFriendCount[%d] shareSnsCount[%d]  isDelFav[%b] clickEditFavTagCount[%d] favId[%s]", new Object[] { Long.valueOf(l1), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i) });
      paramBundle = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(i);
      if (paramBundle != null)
        break label263;
      ab.w("MicroMsg.FavWebRptCallback", "fav web rpt but favitem info is null favid[%d]", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(27236);
      return;
      n = 0;
      break;
    }
    label263: if (paramBundle.field_sourceCreateTime != 0L);
    for (long l2 = paramBundle.field_sourceCreateTime / 1000L; ; l2 = paramBundle.field_updateTime / 1000L)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(j).append(",");
      localStringBuffer.append(m).append(",");
      localStringBuffer.append(i).append(",");
      localStringBuffer.append(paramBundle.field_type).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append(paramBundle.field_sourceType).append(",");
      localStringBuffer.append(l2).append(",");
      localStringBuffer.append(l1).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append("0,");
      localStringBuffer.append("0,");
      localStringBuffer.append(i1).append(",");
      localStringBuffer.append(i2).append(",");
      localStringBuffer.append("0,");
      localStringBuffer.append(i4).append(",");
      localStringBuffer.append(i3).append(",");
      localStringBuffer.append(n).append(",");
      localStringBuffer.append(k).append(",");
      localStringBuffer.append(str2).append(",");
      n = ((PluginFav)com.tencent.mm.kernel.g.M(PluginFav.class)).getFavItemInfoStorage().vz(i) + 1;
      localStringBuffer.append(n).append(",");
      localStringBuffer.append(str1).append(",");
      localStringBuffer.append(str3);
      ab.d("MicroMsg.FavWebRptCallback", String.format("lxl, 15098, sid:%s, sourcepos:%s, query:%s, tag:%s", new Object[] { str2, Integer.valueOf(n), str1, str3 }));
      ab.v("MicroMsg.FavWebRptCallback", "FavWebRptCallback rpt id[%d] [%s]", new Object[] { Integer.valueOf(15098), localStringBuffer.toString() });
      e.pXa.X(15098, localStringBuffer.toString());
      AppMethodBeat.o(27236);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.d
 * JD-Core Version:    0.6.2
 */