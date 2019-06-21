package com.tencent.mm.emoji.sync;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/sync/EmojiSyncManager$SyncState;", "", "(Ljava/lang/String;I)V", "Init", "Syncing", "Wait", "WaitOffline", "End", "plugin-emojisdk_release"})
public enum EmojiSyncManager$b
{
  static
  {
    AppMethodBeat.i(63262);
    b localb1 = new b("Init", 0);
    ezB = localb1;
    b localb2 = new b("Syncing", 1);
    ezC = localb2;
    b localb3 = new b("Wait", 2);
    ezD = localb3;
    b localb4 = new b("WaitOffline", 3);
    ezE = localb4;
    b localb5 = new b("End", 4);
    ezF = localb5;
    ezG = new b[] { localb1, localb2, localb3, localb4, localb5 };
    AppMethodBeat.o(63262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.EmojiSyncManager.b
 * JD-Core Version:    0.6.2
 */