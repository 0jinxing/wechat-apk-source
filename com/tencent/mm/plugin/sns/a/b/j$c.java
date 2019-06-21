package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum j$c
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(35773);
    qEZ = new c("Fav", 0, 1);
    qFa = new c("Chat", 1, 2);
    qFb = new c("Chatroom", 2, 3);
    qFc = new c("Sns", 3, 4);
    qFd = new c[] { qEZ, qFa, qFb, qFc };
    AppMethodBeat.o(35773);
  }

  private j$c(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.j.c
 * JD-Core Version:    0.6.2
 */