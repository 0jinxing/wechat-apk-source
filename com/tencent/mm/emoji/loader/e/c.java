package com.tencent.mm.emoji.loader.e;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.mm.emoji.loader.a;
import com.tencent.mm.emoji.loader.d.h;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "Ljava/lang/Runnable;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "requests", "", "Lcom/tencent/mm/emoji/loader/request/Request;", "kotlin.jvm.PlatformType", "", "running", "", "started", "addRequest", "", "request", "getTaskKey", "", "onResult", "success", "removeRequest", "run", "start", "plugin-emojisdk_release"})
public abstract class c
  implements Runnable
{
  final EmojiInfo exP;
  private final List<h<?>> requests;
  private boolean running;
  private boolean started;

  public c(EmojiInfo paramEmojiInfo)
  {
    this.exP = paramEmojiInfo;
    this.requests = Collections.synchronizedList((List)new LinkedList());
  }

  public abstract String OA();

  public final void a(h<?> paramh)
  {
    j.p(paramh, "request");
    if (!this.requests.contains(paramh))
      this.requests.add(paramh);
  }

  public final void b(h<?> paramh)
  {
    j.p(paramh, "request");
    this.requests.remove(paramh);
    if (this.requests.size() == 0)
    {
      ab.i(d.Ow(), "cancel " + OA() + ", " + this.running);
      if (!this.running)
      {
        com.tencent.mm.sdk.g.d.xDG.remove((Runnable)this);
        bV(false);
      }
    }
  }

  public void bV(boolean paramBoolean)
  {
    Object localObject1 = a.exs;
    a.kP(OA());
    LinkedList localLinkedList = new LinkedList();
    localObject1 = this.requests;
    j.o(localObject1, "requests");
    try
    {
      localLinkedList.addAll((Collection)this.requests);
      this.requests.clear();
      y localy = y.AUy;
      localObject1 = ((Iterable)localLinkedList).iterator();
      if (((Iterator)localObject1).hasNext())
        ((h)((Iterator)localObject1).next()).bX(paramBoolean);
    }
    finally
    {
    }
  }

  public void run()
  {
    this.running = true;
  }

  public final void start()
  {
    if (!this.started)
    {
      this.started = true;
      a locala = a.exs;
      a.a(OA(), this);
      com.tencent.mm.sdk.g.d.xDG.execute((Runnable)this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.e.c
 * JD-Core Version:    0.6.2
 */