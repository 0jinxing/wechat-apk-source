package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.List;

public final class g
{
  private static final boolean ZG(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(105203);
    String[] arrayOfString = t.fkY;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (paramString.equals(arrayOfString[j]))
        AppMethodBeat.o(105203);
    while (true)
    {
      return bool;
      j++;
      break;
      if (t.kH(paramString))
      {
        AppMethodBeat.o(105203);
      }
      else if (t.mZ(paramString))
      {
        AppMethodBeat.o(105203);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(105203);
      }
    }
  }

  public static final Cursor fm(List<String> paramList)
  {
    AppMethodBeat.i(105201);
    paramList = fn(paramList);
    if (paramList.size() == 0)
    {
      com.tencent.mm.kernel.g.RQ();
      paramList = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().dsF();
      AppMethodBeat.o(105201);
    }
    while (true)
    {
      return paramList;
      com.tencent.mm.kernel.g.RQ();
      paramList = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().ew(paramList);
      AppMethodBeat.o(105201);
    }
  }

  private static final List<String> fn(List<String> paramList)
  {
    AppMethodBeat.i(105202);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().a(t.fkP, paramList, true, null);
    if (localCursor.moveToFirst())
    {
      int i = 0;
      do
      {
        paramList = new ak();
        paramList.d(localCursor);
        int j = i;
        if (ZG(paramList.field_username))
        {
          localArrayList.add(paramList.field_username);
          j = i + 1;
          if (j >= 4)
            break;
        }
        i = j;
      }
      while (localCursor.moveToNext());
    }
    localCursor.close();
    AppMethodBeat.o(105202);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.g
 * JD-Core Version:    0.6.2
 */