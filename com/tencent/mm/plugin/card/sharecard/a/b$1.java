package com.tencent.mm.plugin.card.sharecard.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

final class b$1
  implements Runnable
{
  b$1(String paramString, ak paramak)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(87982);
    ab.i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
    Object localObject2 = am.bbe();
    Object localObject3 = this.kfu;
    ab.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append(" where ( status=0) ");
    ((StringBuilder)localObject4).append(" AND (card_tp_id = '" + (String)localObject3 + "' )");
    ((StringBuilder)localObject4).append(" order by share_time desc ");
    localObject4 = "select * from ShareCardInfo" + ((StringBuilder)localObject4).toString();
    localObject4 = ((k)localObject2).bSd.a((String)localObject4, null, 2);
    if (localObject4 == null)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
      ab.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
      if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
      {
        ab.e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
        AppMethodBeat.o(87982);
      }
    }
    else
    {
      label161: localObject2 = new ArrayList();
      localObject3 = new ArrayList();
    }
    label178: label449: 
    while (true)
    {
      ShareCardInfo localShareCardInfo;
      int i;
      if (((Cursor)localObject4).moveToNext())
      {
        localShareCardInfo = new ShareCardInfo();
        localShareCardInfo.d((Cursor)localObject4);
        if (!((ArrayList)localObject3).contains(localShareCardInfo.field_from_username))
        {
          localObject1 = new r();
          ((r)localObject1).kbU = localShareCardInfo.field_card_tp_id;
          ((r)localObject1).kfT = localShareCardInfo.field_from_username;
          ((r)localObject1).kfV = new ArrayList();
          ((r)localObject1).kfV.add(localShareCardInfo.field_card_id);
          ((r)localObject1).kfU = 1;
          ((ArrayList)localObject2).add(localObject1);
          ((ArrayList)localObject3).add(localShareCardInfo.field_from_username);
        }
        else
        {
          i = 0;
          localObject1 = null;
          if (i < ((ArrayList)localObject2).size())
          {
            localObject1 = (r)((ArrayList)localObject2).get(i);
            if ((localShareCardInfo.field_from_username == null) || (!localShareCardInfo.field_from_username.equals(((r)localObject1).kfT)));
          }
        }
      }
      else
      {
        while (true)
        {
          if (localObject1 == null)
            break label449;
          ((r)localObject1).kfV.add(0, localShareCardInfo.field_card_id);
          ((r)localObject1).kfU += 1;
          ((ArrayList)localObject2).set(i, localObject1);
          break label178;
          i++;
          break label295;
          ((Cursor)localObject4).close();
          localObject1 = localObject2;
          break;
          if (((ArrayList)localObject1).get(0) != null)
            ((r)((ArrayList)localObject1).get(0)).kfW = true;
          ab.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
          this.kfv.post(new b.1.1(this, (ArrayList)localObject1));
          AppMethodBeat.o(87982);
          break label161;
          i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.a.b.1
 * JD-Core Version:    0.6.2
 */