package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.b;

final class d$a extends c.b
{
  public String desc;
  public int iconRes;

  public d$a(d paramd, long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    super(paramLong1, paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
  }

  public final boolean arg(String paramString)
  {
    AppMethodBeat.i(32543);
    boolean bool;
    if (paramString != null)
    {
      bool = super.arg(paramString.toLowerCase());
      AppMethodBeat.o(32543);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32543);
    }
  }

  public final int getType()
  {
    return 6;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.d.a
 * JD-Core Version:    0.6.2
 */