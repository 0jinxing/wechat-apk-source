package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ck;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class c extends ck
{
  public static c.a ccO;
  public ArrayList<String> nzx;

  static
  {
    AppMethodBeat.i(21922);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wechatUsername";
    locala.xDd.put("wechatUsername", "TEXT");
    localStringBuilder.append(" wechatUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "systemAddressBookUsername";
    locala.xDd.put("systemAddressBookUsername", "TEXT");
    localStringBuilder.append(" systemAddressBookUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactId";
    locala.xDd.put("contactId", "TEXT");
    localStringBuilder.append(" contactId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sortKey";
    locala.xDd.put("sortKey", "TEXT");
    localStringBuilder.append(" sortKey TEXT");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(21922);
  }

  public static boolean eJ(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(21921);
    if ((paramString1 == null) && (paramString2 != null))
      AppMethodBeat.o(21921);
    while (true)
    {
      return bool;
      if ((paramString1 != null) && (!paramString1.equals(paramString2)))
      {
        AppMethodBeat.o(21921);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(21921);
      }
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.c
 * JD-Core Version:    0.6.2
 */