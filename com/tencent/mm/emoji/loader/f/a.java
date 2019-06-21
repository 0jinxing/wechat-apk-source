package com.tencent.mm.emoji.loader.f;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import com.tencent.tmassistantsdk.util.Base64;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/verify/EmojiFileVerify;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "reportDecrypt", "", "verifyConfig", "Lcom/tencent/mm/emoji/loader/verify/EmojiVerifyConfig;", "success", "", "reportVerify", "verify", "plugin-emojisdk_release"})
public final class a
{
  private final String TAG = "MicroMsg.EmojiLoader.EmojiFileVerify";

  private static void a(b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(63230);
    if (paramBoolean)
    {
      switch (paramb.exR)
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(63230);
        while (true)
        {
          return;
          c.hF(7L);
          AppMethodBeat.o(63230);
        }
        c.hF(11L);
      }
    }
    EmojiInfo localEmojiInfo = paramb.exP;
    switch (paramb.exR)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(63230);
      break;
      c.hF(8L);
      c.a(localEmojiInfo.Aq(), 3, 0, 1, localEmojiInfo.awa(), 1, localEmojiInfo.field_designerID);
      AppMethodBeat.o(63230);
      break;
      c.hF(12L);
      c.a(localEmojiInfo.Aq(), 4, 0, 1, localEmojiInfo.awa(), 1, localEmojiInfo.field_designerID);
    }
  }

  public final boolean a(b paramb)
  {
    boolean bool1 = false;
    AppMethodBeat.i(63229);
    j.p(paramb, "verifyConfig");
    if (paramb.eyq);
    label271: label496: 
    while (true)
    {
      try
      {
        boolean bool2 = com.tencent.mm.a.a.g(Base64.encodeToString(bo.anf(paramb.eyr), 0), paramb.eys, paramb.path);
        e.deleteFile(paramb.eys);
        if (!bool2)
        {
          a(paramb, false);
          AppMethodBeat.o(63229);
          return bool1;
        }
        a(paramb, true);
        Object localObject = e.atg(paramb.path);
        ab.i(this.TAG, "file md5 ".concat(String.valueOf(localObject)));
        if ((bo.isNullOrNil((String)localObject)) || (!m.I((String)localObject, paramb.eyp, true)))
          break label271;
        i = 1;
        localObject = paramb.exP;
        if (i == 0)
          break label370;
        switch (paramb.exR)
        {
        default:
          if ((i == 0) || (!g.RN().QY()))
            break label496;
          localObject = g.M(com.tencent.mm.plugin.emoji.b.d.class);
          j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
          ((com.tencent.mm.plugin.emoji.b.d)localObject).getEmojiMgr().c(paramb.exP, true);
          AppMethodBeat.o(63229);
          bool1 = true;
          continue;
        case 0:
        case 1:
        case 2:
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
        a(paramb, false);
        AppMethodBeat.o(63229);
        continue;
      }
      e.aQ(paramb.eys, paramb.path);
      continue;
      int i = 0;
      continue;
      c.a(localException.Aq(), 4, 0, 0, localException.awa(), 0, localException.field_designerID);
      c.hF(4L);
      continue;
      c.a(localException.Aq(), 2, 0, 0, localException.awa(), 0, localException.field_designerID);
      c.hF(4L);
      continue;
      c.a(localException.Aq(), 4, 0, 0, localException.awa(), 1, localException.field_designerID);
      c.hF(13L);
      continue;
      label370: switch (paramb.exR)
      {
      default:
        break;
      case 0:
        c.a(localException.Aq(), 4, 1, 1, localException.awa(), 1, localException.field_designerID);
        c.hF(5L);
        break;
      case 1:
        c.a(localException.Aq(), 2, 1, 1, localException.awa(), 1, localException.field_designerID);
        c.hF(5L);
        break;
      case 2:
        c.a(localException.Aq(), 4, 1, 1, localException.awa(), 1, localException.field_designerID);
        c.hF(14L);
        continue;
        AppMethodBeat.o(63229);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.f.a
 * JD-Core Version:    0.6.2
 */