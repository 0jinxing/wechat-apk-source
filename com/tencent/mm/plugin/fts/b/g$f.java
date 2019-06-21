package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class g$f extends a
{
  private int count;
  private String cuP;

  public g$f(g paramg, int paramInt, String paramString)
  {
    this.count = paramInt;
    this.cuP = paramString;
  }

  private static String D(String[] paramArrayOfString)
  {
    AppMethodBeat.i(136803);
    Random localRandom = new Random();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < 300; i++)
      localStringBuffer.append(paramArrayOfString[localRandom.nextInt(paramArrayOfString.length - 1)]);
    paramArrayOfString = localStringBuffer.toString();
    AppMethodBeat.o(136803);
    return paramArrayOfString;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136802);
    if (this.mGX.mGV == null)
    {
      localObject = e.cy("/sdcard/test_insert_msg_words.txt");
      this.mGX.mGV = ((String)localObject).split(",");
    }
    int i;
    label97: String str;
    bi localbi;
    if (this.mGX.mGW == null)
    {
      this.mGX.mGW = new ArrayList();
      if (!bo.isNullOrNil(this.cuP))
        this.mGX.mGW.add(this.cuP);
    }
    else
    {
      if (this.mGX.mGV == null)
        break label363;
      i = 0;
      if (i >= this.count)
        break label363;
      str = D(this.mGX.mGV);
      localbi = new bi();
      localbi.setType(1);
      localbi.hO(1);
      localbi.setStatus(4);
      localbi.setContent(str);
      localObject = this.mGX.mGW;
      if (((List)localObject).size() <= 1)
        break label349;
    }
    label349: for (Object localObject = (String)((List)localObject).get(new Random().nextInt(((List)localObject).size() - 1)); ; localObject = (String)((List)localObject).get(0))
    {
      localbi.ju((String)localObject);
      localbi.eJ(System.currentTimeMillis() - 250327040L);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(localbi);
      ab.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", new Object[] { Integer.valueOf(this.count), Integer.valueOf(i), Integer.valueOf(str.length()), Long.valueOf(localbi.field_msgId) });
      i++;
      break label97;
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().dss();
      while (((Cursor)localObject).moveToNext())
        this.mGX.mGW.add(((Cursor)localObject).getString(0));
      ((Cursor)localObject).close();
      break;
    }
    label363: AppMethodBeat.o(136802);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g.f
 * JD-Core Version:    0.6.2
 */