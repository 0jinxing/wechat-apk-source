package com.tencent.mm.emoji.sync;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/sync/EmojiSyncManager$Companion;", "", "()V", "captureSyncMgr", "Lcom/tencent/mm/emoji/sync/EmojiSyncManager;", "customSyncMgr", "getCaptureSyncMgr", "getCustomSyncMgr", "plugin-emojisdk_release"})
public final class EmojiSyncManager$a
{
  public static EmojiSyncManager Pg()
  {
    AppMethodBeat.i(63259);
    EmojiSyncManager localEmojiSyncManager1 = EmojiSyncManager.Pe();
    EmojiSyncManager localEmojiSyncManager2 = localEmojiSyncManager1;
    if (localEmojiSyncManager1 == null)
    {
      localEmojiSyncManager2 = new EmojiSyncManager(0);
      EmojiSyncManager.a(localEmojiSyncManager2);
    }
    AppMethodBeat.o(63259);
    return localEmojiSyncManager2;
  }

  public static EmojiSyncManager Ph()
  {
    AppMethodBeat.i(63260);
    EmojiSyncManager localEmojiSyncManager1 = EmojiSyncManager.Pf();
    EmojiSyncManager localEmojiSyncManager2 = localEmojiSyncManager1;
    if (localEmojiSyncManager1 == null)
    {
      localEmojiSyncManager2 = new EmojiSyncManager(1);
      EmojiSyncManager.i(localEmojiSyncManager2);
    }
    AppMethodBeat.o(63260);
    return localEmojiSyncManager2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.EmojiSyncManager.a
 * JD-Core Version:    0.6.2
 */