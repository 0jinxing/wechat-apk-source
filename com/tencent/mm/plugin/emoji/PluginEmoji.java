package com.tencent.mm.plugin.emoji;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiUpdateReceiver;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.emoji.b.b.a;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.e.d.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.at;

public class PluginEmoji extends f
  implements com.tencent.mm.plugin.emoji.b.d
{
  private com.tencent.mm.pluginsdk.a.d kRs;
  com.tencent.mm.pluginsdk.a.e kRt;

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(62327);
    d.a.a(com.tencent.mm.cb.g.dqQ());
    com.tencent.mm.cb.b.dqD();
    h.dhT();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.emoji.b.c.class, d.biX());
    AppMethodBeat.o(62327);
  }

  public void dependency()
  {
    AppMethodBeat.i(62326);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    AppMethodBeat.o(62326);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(62328);
    if (paramg.SG())
    {
      pin(e.bjc());
      if (paramg.SG())
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.emoji.b.a.class, new com.tencent.mm.kernel.c.e(new a()));
    }
    while (true)
    {
      com.tencent.mm.ui.e.b.c.a(new PluginEmoji.1(this));
      com.tencent.mm.ui.e.c.b.a(new PluginEmoji.2(this));
      com.tencent.mm.api.u.cda = new PluginEmoji.3(this);
      AppMethodBeat.o(62328);
      return;
      if (paramg.lQ(":tools"))
      {
        paramg = new IntentFilter(EmojiUpdateReceiver.ACTION);
        ah.getContext().registerReceiver(new EmojiUpdateReceiver(), paramg);
      }
    }
  }

  public aq getEmojiDescMgr()
  {
    AppMethodBeat.i(62333);
    aq localaq = b.a.kTl.getEmojiDescMgr();
    AppMethodBeat.o(62333);
    return localaq;
  }

  public com.tencent.mm.pluginsdk.a.d getEmojiMgr()
  {
    AppMethodBeat.i(62330);
    setEmojiMgr();
    com.tencent.mm.pluginsdk.a.d locald = this.kRs;
    AppMethodBeat.o(62330);
    return locald;
  }

  public at getEmojiStorageMgr()
  {
    AppMethodBeat.i(62332);
    at localat = b.a.kTl.getEmojiStorageMgr();
    AppMethodBeat.o(62332);
    return localat;
  }

  public com.tencent.mm.pluginsdk.a.e getProvider()
  {
    AppMethodBeat.i(62331);
    if (this.kRt == null)
      this.kRt = new com.tencent.mm.by.a();
    com.tencent.mm.pluginsdk.a.e locale = this.kRt;
    AppMethodBeat.o(62331);
    return locale;
  }

  public void installed()
  {
    AppMethodBeat.i(62325);
    alias(com.tencent.mm.plugin.emoji.b.d.class);
    AppMethodBeat.o(62325);
  }

  public String name()
  {
    return "plugin-emoji";
  }

  public void removeEmojiMgr()
  {
    this.kRs = null;
  }

  public void setEmojiMgr()
  {
    AppMethodBeat.i(62329);
    if (this.kRs == null)
      this.kRs = b.a.kTl.getEmojiMgr();
    AppMethodBeat.o(62329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.PluginEmoji
 * JD-Core Version:    0.6.2
 */