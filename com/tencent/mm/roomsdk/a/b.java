package com.tencent.mm.roomsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class b
{
  private static b xuV;
  private HashMap<String, a> xuU;

  static
  {
    AppMethodBeat.i(80241);
    xuV = new b();
    AppMethodBeat.o(80241);
  }

  public b()
  {
    AppMethodBeat.i(80238);
    this.xuU = new HashMap();
    AppMethodBeat.o(80238);
  }

  public static void a(String paramString, a parama)
  {
    AppMethodBeat.i(80240);
    int i = paramString.indexOf("@");
    if (i < 0);
    while (true)
    {
      b localb = xuV;
      if (!localb.xuU.containsKey(paramString))
        localb.xuU.put(paramString, parama);
      AppMethodBeat.o(80240);
      return;
      paramString = paramString.substring(i);
    }
  }

  public static a alY(String paramString)
  {
    AppMethodBeat.i(80239);
    int i = paramString.indexOf("@");
    if (i < 0)
    {
      ab.e("MicroMsg.RoomServiceFactory", "get NotNullChatRoom %s", new Object[] { paramString });
      paramString = new com.tencent.mm.roomsdk.a.a.b();
      AppMethodBeat.o(80239);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.substring(i);
      b localb = xuV;
      if (localb.xuU.containsKey(paramString));
      for (paramString = (a)localb.xuU.get(paramString); ; paramString = null)
      {
        if (paramString != null)
          break label104;
        paramString = new com.tencent.mm.roomsdk.a.a.b();
        AppMethodBeat.o(80239);
        break;
      }
      label104: AppMethodBeat.o(80239);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.b
 * JD-Core Version:    0.6.2
 */