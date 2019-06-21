package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.a.c.b;

final class a$a extends c.b
{
  public j.b cJM;
  public long cKK;
  public String desc;
  public String fiQ;
  public String iQW;
  public String imagePath;

  public a$a(a parama, long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, j.b paramb, long paramLong3, String paramString7, String paramString8, String paramString9)
  {
    super(paramLong1, paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
    this.fiQ = paramString6;
    this.cJM = paramb;
    this.cKK = paramLong3;
    this.desc = paramString7;
    this.imagePath = paramString8;
    this.iQW = paramString9;
  }

  public final boolean arg(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(32514);
    if (paramString != null)
    {
      paramString = paramString.toLowerCase();
      if (!arh(paramString))
      {
        if ((bo.isNullOrNil(this.desc)) || (!isContains(paramString, this.desc.toLowerCase())))
          break label90;
        AppMethodBeat.o(32514);
      }
    }
    while (true)
    {
      return bool;
      if ((!bo.isNullOrNil(this.desc)) && (this.desc.toLowerCase().contains(paramString)))
      {
        AppMethodBeat.o(32514);
      }
      else
      {
        label90: bool = super.arg(paramString);
        AppMethodBeat.o(32514);
        continue;
        bool = false;
        AppMethodBeat.o(32514);
      }
    }
  }

  public final int getType()
  {
    return 33;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a.a
 * JD-Core Version:    0.6.2
 */