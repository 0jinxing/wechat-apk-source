package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class l extends j<k>
  implements g.a
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(62861);
    fnj = new String[] { j.a(k.ccO, "EmotionRewardInfo") };
    AppMethodBeat.o(62861);
  }

  public l(e parame)
  {
    super(parame, k.ccO, "EmotionRewardInfo", null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final GetEmotionRewardResponse aqq(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    AppMethodBeat.i(62860);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
      AppMethodBeat.o(62860);
      paramString = localCursor;
    }
    while (true)
    {
      return paramString;
      localCursor = this.bSd.a("EmotionRewardInfo", new String[] { "content" }, "productID=?", new String[] { paramString }, null, null, null, 2);
      paramString = localObject;
      if (localCursor != null)
      {
        paramString = localObject;
        if (!localCursor.moveToFirst());
      }
      try
      {
        paramString = new com/tencent/mm/protocal/protobuf/GetEmotionRewardResponse;
        paramString.<init>();
        paramString.parseFrom(localCursor.getBlob(0));
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(62860);
      }
      catch (IOException paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", new Object[] { bo.l(paramString) });
          paramString = localObject;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.l
 * JD-Core Version:    0.6.2
 */