package com.tencent.mm.bi;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import java.util.ArrayList;

public final class a
{
  public static ArrayList<String> tS(String paramString)
  {
    AppMethodBeat.i(16613);
    ArrayList localArrayList = new ArrayList();
    paramString = d.akQ().er(paramString, 10);
    if (paramString != null)
    {
      int i = paramString.length;
      for (int j = 0; j < i; j++)
        localArrayList.add(paramString[j].field_sayhicontent);
    }
    ab.d("MicroMsg.ExposeDataLogic", "get lbs sayhi msg content");
    AppMethodBeat.o(16613);
    return localArrayList;
  }

  public static ArrayList<String> tT(String paramString)
  {
    AppMethodBeat.i(16614);
    ArrayList localArrayList = new ArrayList();
    paramString = d.akR().et(paramString, 10);
    if (paramString != null)
    {
      int i = paramString.length;
      for (int j = 0; j < i; j++)
        localArrayList.add(paramString[j].field_sayhicontent);
    }
    ab.d("MicroMsg.ExposeDataLogic", "get shake sayhi msg content");
    AppMethodBeat.o(16614);
    return localArrayList;
  }

  public static ArrayList<String> tU(String paramString)
  {
    AppMethodBeat.i(16615);
    ArrayList localArrayList = new ArrayList();
    aw.ZK();
    paramString = c.XO().Rj(paramString);
    int i;
    if ((paramString != null) && (paramString.getCount() != 0))
      if (paramString.moveToFirst())
      {
        i = 0;
        if (!paramString.isAfterLast())
        {
          bi localbi = new bi();
          localbi.d(paramString);
          paramString.moveToNext();
          if (!localbi.isText())
            break label126;
          localArrayList.add(localbi.field_content);
        }
      }
    while (true)
    {
      int j = i + 1;
      i = j;
      if (j != 10)
        break;
      paramString.close();
      AppMethodBeat.o(16615);
      return localArrayList;
      label126: localArrayList.add("");
    }
  }

  public static ArrayList<String> z(int paramInt, String paramString)
  {
    AppMethodBeat.i(16616);
    ArrayList localArrayList = new ArrayList();
    ax[] arrayOfax = d.akO().eq(paramString, 10);
    if (arrayOfax != null)
    {
      int i = arrayOfax.length;
      for (int j = 0; j < i; j++)
      {
        paramString = arrayOfax[j];
        if (paramString.field_type == 1)
          localArrayList.add(bo.nullAsNil(bi.d.apF(paramString.field_msgContent).content));
      }
    }
    ab.d("MicroMsg.ExposeDataLogic", "getFMessageContent,scene:%d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(16616);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.a
 * JD-Core Version:    0.6.2
 */