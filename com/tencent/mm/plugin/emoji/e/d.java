package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.ui.widget.a.e.c;
import java.util.ArrayList;

public class d
{
  public static d kTE;
  public ArrayList<String> kTF;
  public boolean kTG;
  public boolean kTH;

  public d()
  {
    AppMethodBeat.i(52852);
    this.kTF = new ArrayList();
    this.kTG = true;
    this.kTH = false;
    AppMethodBeat.o(52852);
  }

  public static void a(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(52854);
    if (paramEmojiInfo != null)
    {
      paramEmojiInfo.field_reserved4 = 0;
      j.getEmojiStorageMgr().xYn.H(paramEmojiInfo);
      j.bkh().s(paramEmojiInfo);
      if (paramBoolean)
      {
        h.pYm.a(231L, 0L, 1L, false);
        AppMethodBeat.o(52854);
      }
    }
    while (true)
    {
      return;
      h.pYm.a(231L, 1L, 1L, false);
      AppMethodBeat.o(52854);
    }
  }

  private void b(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(52855);
    if (this.kTF == null)
      this.kTF = new ArrayList();
    this.kTF.add(paramEmojiInfo.field_groupId);
    paramEmojiInfo = new com.tencent.mm.plugin.emoji.f.g(paramEmojiInfo.field_groupId);
    com.tencent.mm.kernel.g.RO().eJo.a(paramEmojiInfo, 0);
    if (paramBoolean)
    {
      h.pYm.a(231L, 3L, 1L, false);
      AppMethodBeat.o(52855);
    }
    while (true)
    {
      return;
      h.pYm.a(231L, 2L, 1L, false);
      AppMethodBeat.o(52855);
    }
  }

  public static d bjH()
  {
    AppMethodBeat.i(52853);
    if (kTE == null);
    try
    {
      d locald = new com/tencent/mm/plugin/emoji/e/d;
      locald.<init>();
      kTE = locald;
      locald = kTE;
      AppMethodBeat.o(52853);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(52853);
    }
  }

  private static boolean bjI()
  {
    AppMethodBeat.i(52856);
    boolean bool;
    if ((com.tencent.mm.sdk.platformtools.at.is3G(ah.getContext())) || (com.tencent.mm.sdk.platformtools.at.is4G(ah.getContext())) || (com.tencent.mm.sdk.platformtools.at.is2G(ah.getContext())))
    {
      bool = true;
      AppMethodBeat.o(52856);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52856);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.d
 * JD-Core Version:    0.6.2
 */