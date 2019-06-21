package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class g$g extends a
{
  private g$g(g paramg)
  {
  }

  private static String D(String[] paramArrayOfString)
  {
    AppMethodBeat.i(136805);
    Random localRandom = new Random();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < 300; i++)
      localStringBuffer.append(paramArrayOfString[localRandom.nextInt(paramArrayOfString.length - 1)]);
    paramArrayOfString = localStringBuffer.toString();
    AppMethodBeat.o(136805);
    return paramArrayOfString;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136804);
    Object localObject;
    if (this.mGX.mGV == null)
    {
      localObject = e.cy("/sdcard/test_insert_msg_words.txt");
      this.mGX.mGV = ((String)localObject).split(",");
    }
    if (this.mGX.mGW == null)
    {
      this.mGX.mGW = new ArrayList();
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().dss();
      while (((Cursor)localObject).moveToNext())
        this.mGX.mGW.add(((Cursor)localObject).getString(0));
      ((Cursor)localObject).close();
    }
    if (this.mGX.mGV != null)
    {
      localObject = new int[7];
      Object tmp131_130 = localObject;
      tmp131_130[0] = 1000;
      Object tmp137_131 = tmp131_130;
      tmp137_131[1] = 2000;
      Object tmp143_137 = tmp137_131;
      tmp143_137[2] = 5000;
      Object tmp149_143 = tmp143_137;
      tmp149_143[3] = 10000;
      Object tmp155_149 = tmp149_143;
      tmp155_149[4] = 20000;
      Object tmp161_155 = tmp155_149;
      tmp161_155[5] = 50000;
      Object tmp166_161 = tmp161_155;
      tmp166_161[6] = 100000;
      tmp166_161;
      for (int i = 0; i < 7; i++)
        for (int j = 0; j < localObject[i]; j++)
        {
          String str = D(this.mGX.mGV);
          bi localbi = new bi();
          localbi.setType(1);
          localbi.hO(1);
          localbi.setStatus(4);
          localbi.setContent(str);
          localbi.ju((String)this.mGX.mGW.get(i));
          localbi.eJ(System.currentTimeMillis());
          ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(localbi);
          ab.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(localObject[i]), Integer.valueOf(str.length()), Long.valueOf(localbi.field_msgId) });
        }
    }
    AppMethodBeat.o(136804);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g.g
 * JD-Core Version:    0.6.2
 */