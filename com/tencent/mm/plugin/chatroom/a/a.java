package com.tencent.mm.plugin.chatroom.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public final int gag;
  public final String ktN;
  public final int ktO;
  public final int ktP;
  public final int ktQ;

  public a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ktN = paramString;
    this.ktO = paramInt1;
    this.gag = paramInt2;
    this.ktP = paramInt3;
    this.ktQ = paramInt4;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(128346);
    if (hashCode() == paramObject.hashCode())
      AppMethodBeat.o(128346);
    while (true)
    {
      return bool;
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((this.ktO == paramObject.ktO) && (this.gag == paramObject.gag) && (this.ktP == paramObject.ktP) && (this.ktQ == paramObject.ktQ) && (this.ktN.equals(paramObject.ktN)))
        {
          AppMethodBeat.o(128346);
        }
        else
        {
          AppMethodBeat.o(128346);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(128346);
        bool = false;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(128347);
    String str = "GetChatRoomMsgInfo chatroomId[" + this.ktN + "], filterSeq[" + this.ktO + "], msgSeq[" + this.gag + "], needCount[" + this.ktP + "], upDownFlag[" + this.ktQ + "], hash[" + hashCode() + "]";
    AppMethodBeat.o(128347);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.chatroom.a.a
 * JD-Core Version:    0.6.2
 */