package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.b;

final class g$a extends c.b
{
  public String appId;
  public String desc;
  public int iconRes;
  public int yZy;
  public int yZz = 0;

  public g$a(g paramg, long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    super(paramLong1, paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
  }

  public final boolean arg(String paramString)
  {
    AppMethodBeat.i(32629);
    boolean bool2;
    if (paramString != null)
    {
      boolean bool1 = super.arg(paramString);
      bool2 = bool1;
      if (!bool1)
        bool2 = this.title.contains(paramString);
      AppMethodBeat.o(32629);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      AppMethodBeat.o(32629);
    }
  }

  public final int getType()
  {
    return this.type;
  }

  public final String toString()
  {
    AppMethodBeat.i(32630);
    String str = "PayMediaHistoryListItem{appId='" + this.appId + '\'' + ", desc='" + this.desc + '\'' + ", timestamp=" + this.timestamp + ", type=" + this.type + ", title='" + this.title + '\'' + ", msgId=" + this.cvx + ", username='" + this.username + '\'' + ", nickname='" + this.nickname + '\'' + ", remarkName='" + this.bCv + '\'' + ", nameInRoom='" + this.iQV + '\'' + '}';
    AppMethodBeat.o(32630);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.g.a
 * JD-Core Version:    0.6.2
 */