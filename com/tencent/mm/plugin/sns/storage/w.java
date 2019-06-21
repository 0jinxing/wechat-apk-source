package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.FileSystem.a;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

public final class w
{
  public boolean rfK = false;

  public static void Zq(String paramString)
  {
    AppMethodBeat.i(38031);
    Object localObject = e.cl(paramString, false);
    if (localObject == null)
      AppMethodBeat.o(38031);
    while (true)
    {
      return;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (FileSystem.a)localIterator.next();
        if (((FileSystem.a)localObject).name.startsWith("SnsMicroMsg.dberr"))
        {
          ab.i("MicroMsg.TrimSnsDb", "find error %s", new Object[] { paramString + ((FileSystem.a)localObject).name });
          ((FileSystem.a)localObject).delete();
        }
      }
      AppMethodBeat.o(38031);
    }
  }

  public static int a(h paramh1, h paramh2, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(38030);
    paramString = paramh1.a(" select sql from sqlite_master where tbl_name=\"" + paramString + "\" and type = \"table\"", null, 0);
    paramh1 = localObject1;
    if (paramString != null)
    {
      paramh1 = localObject2;
      if (paramString.getCount() == 1)
      {
        paramString.moveToFirst();
        paramh1 = paramString.getString(0);
      }
      paramString.close();
    }
    int i;
    if (paramh1 == null)
    {
      ab.w("MicroMsg.TrimSnsDb", "diskDB has not this table !");
      i = -1;
      AppMethodBeat.o(38030);
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.TrimSnsDb", "create sql %s", new Object[] { paramh1 });
      ab.i("MicroMsg.TrimSnsDb", "create result ".concat(String.valueOf(paramh2.hY("", paramh1))));
      AppMethodBeat.o(38030);
      i = 1;
    }
  }

  public static boolean a(h paramh1, h paramh2)
  {
    boolean bool = true;
    AppMethodBeat.i(38029);
    try
    {
      StringBuilder localStringBuilder;
      if (bo.isNullOrNil(paramh1.getKey()))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("ATTACH DATABASE '");
        paramh2.hY("", paramh1.getPath() + "' AS old ");
      }
      while (true)
      {
        paramh2 = new java/lang/StringBuilder;
        paramh2.<init>("ATTACH DATABASE ");
        ab.i("MicroMsg.TrimSnsDb", paramh1.getKey());
        AppMethodBeat.o(38029);
        return bool;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("ATTACH DATABASE '");
        paramh2.hY("", paramh1.getPath() + "' AS old KEY '" + paramh1.getKey() + "'");
      }
    }
    catch (Exception paramh1)
    {
      while (true)
      {
        ab.e("MicroMsg.TrimSnsDb", "ERROR : attach disk db [%s] , will do again !", new Object[] { paramh1.getMessage() });
        ab.printErrStackTrace("MicroMsg.TrimSnsDb", paramh1, "", new Object[0]);
        AppMethodBeat.o(38029);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.w
 * JD-Core Version:    0.6.2
 */