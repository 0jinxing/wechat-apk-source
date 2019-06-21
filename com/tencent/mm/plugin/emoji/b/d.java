package com.tencent.mm.plugin.emoji.b;

import com.tencent.mm.kernel.b.a;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.at;

public abstract interface d extends a
{
  public abstract aq getEmojiDescMgr();

  public abstract com.tencent.mm.pluginsdk.a.d getEmojiMgr();

  public abstract at getEmojiStorageMgr();

  public abstract e getProvider();

  public abstract void removeEmojiMgr();

  public abstract void setEmojiMgr();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.b.d
 * JD-Core Version:    0.6.2
 */