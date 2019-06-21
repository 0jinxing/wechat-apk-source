package com.tencent.mm.emoji.debug;

import a.f.a.a;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/debug/EmojiDebugUI$ClickItem;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI$AbsItem;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI;", "title", "", "value", "onClick", "Lkotlin/Function0;", "", "(Lcom/tencent/mm/emoji/debug/EmojiDebugUI;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getTitle", "()Ljava/lang/String;", "getValue", "plugin-emojisdk_release"})
public final class EmojiDebugUI$b extends EmojiDebugUI.a
{
  private final a<y> exc;
  private final String title;
  private final String value;

  public EmojiDebugUI$b(String paramString1, String paramString2, a<y> parama)
  {
    super(paramString1);
    AppMethodBeat.i(63116);
    this.title = paramString2;
    this.value = parama;
    Object localObject;
    this.exc = localObject;
    AppMethodBeat.o(63116);
  }

  public final String Op()
  {
    return this.title;
  }

  public final String Oq()
  {
    return this.value;
  }

  public final void onClick()
  {
    AppMethodBeat.i(63115);
    a locala = this.exc;
    if (locala != null)
    {
      locala.invoke();
      AppMethodBeat.o(63115);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63115);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI.b
 * JD-Core Version:    0.6.2
 */