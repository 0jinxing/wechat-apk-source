package com.tencent.mm.plugin.expt.roomexpt;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
  implements Comparable<c>
{
  String cuP;
  float lOE;
  String nickname;

  public final String toString()
  {
    AppMethodBeat.i(73588);
    String str = String.format("chatroom[%s %s] score[%f]", new Object[] { this.cuP, this.nickname, Float.valueOf(this.lOE) });
    AppMethodBeat.o(73588);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.c
 * JD-Core Version:    0.6.2
 */