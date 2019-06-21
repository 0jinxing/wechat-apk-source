package com.tencent.mm.emoji.loader.d;

import a.l;
import com.tencent.mm.emoji.loader.a;
import com.tencent.mm.emoji.loader.e.c;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/Request;", "T", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "task", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "getTask", "()Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "setTask", "(Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;)V", "cancel", "", "createTask", "onLoad", "success", "", "reload", "start", "Callback", "plugin-emojisdk_release"})
public abstract class h<T>
{
  final EmojiInfo exP;
  private c eyh;

  public h(EmojiInfo paramEmojiInfo)
  {
    this.exP = paramEmojiInfo;
  }

  protected c Oy()
  {
    a locala = a.exs;
    return a.a(this.exP);
  }

  public abstract void bX(boolean paramBoolean);

  public void cancel()
  {
    c localc = this.eyh;
    if (localc != null)
      localc.b(this);
  }

  protected final void reload()
  {
    c localc = this.eyh;
    if (localc != null)
      localc.b(this);
    this.eyh = Oy();
    localc = this.eyh;
    if (localc != null)
      localc.a(this);
    localc = this.eyh;
    if (localc != null)
      localc.start();
  }

  public void start()
  {
    reload();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.h
 * JD-Core Version:    0.6.2
 */