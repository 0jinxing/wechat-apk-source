package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class j extends com.tencent.mm.sdk.e.j<i>
  implements g.a
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(62858);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(i.ccO, "EmotionDetailInfo") };
    AppMethodBeat.o(62858);
  }

  public j(e parame)
  {
    super(parame, i.ccO, "EmotionDetailInfo", null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final i aqp(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62857);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
      AppMethodBeat.o(62857);
    }
    while (true)
    {
      return localObject2;
      Cursor localCursor = this.bSd.a("EmotionDetailInfo", new String[] { "content", "lan" }, "productID=?", new String[] { paramString }, null, null, null, 2);
      localObject2 = localObject1;
      if (localCursor != null)
      {
        localObject2 = localObject1;
        if (localCursor.moveToFirst())
        {
          localObject2 = new i();
          ((i)localObject2).field_content = localCursor.getBlob(0);
          ((i)localObject2).field_lan = localCursor.getString(1);
          ((i)localObject2).field_productID = paramString;
        }
      }
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(62857);
    }
  }

  public final String getTableName()
  {
    return "EmotionDetailInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.j
 * JD-Core Version:    0.6.2
 */