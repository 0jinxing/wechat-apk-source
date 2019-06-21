package com.tencent.mm.emoji.debug;

import a.a.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/debug/EmojiDebugUI$ConfigItem;", "T", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI$AbsItem;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI;", "title", "", "configKey", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "contentArray", "", "valueArray", "(Lcom/tencent/mm/emoji/debug/EmojiDebugUI;Ljava/lang/String;Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;Ljava/util/List;Ljava/util/List;)V", "getConfigKey", "()Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "getContentArray", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getValueArray", "onClick", "", "value", "plugin-emojisdk_release"})
public final class EmojiDebugUI$c<T> extends EmojiDebugUI.a
{
  final ac.a exd;
  private final List<String> exe;
  final List<T> exf;
  private final String title;

  public EmojiDebugUI$c(String paramString, ac.a parama, List<String> paramList, List<? extends T> paramList1)
  {
    super(paramString);
    AppMethodBeat.i(63120);
    this.title = parama;
    this.exd = paramList;
    this.exe = paramList1;
    this.exf = localObject;
    AppMethodBeat.o(63120);
  }

  public final String Op()
  {
    return this.title;
  }

  public final String Oq()
  {
    AppMethodBeat.i(63118);
    int i = this.exf.indexOf(EmojiDebugUI.a(this.exd, this.exf.get(0)));
    String str;
    if ((i >= 0) && (i < this.exe.size()))
    {
      str = (String)this.exe.get(i);
      AppMethodBeat.o(63118);
    }
    while (true)
    {
      return str;
      str = (String)this.exe.get(0);
      AppMethodBeat.o(63118);
    }
  }

  public final void onClick()
  {
    AppMethodBeat.i(63119);
    LinkedList localLinkedList = new LinkedList();
    int i = ((Collection)this.exe).size();
    for (int j = 0; j < i; j++)
      localLinkedList.add(Integer.valueOf(j));
    h.a((Context)this.exb, "", this.exe, j.m((Iterable)j.g((Collection)this.exe)), "", (h.d)new EmojiDebugUI.c.a(this));
    AppMethodBeat.o(63119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI.c
 * JD-Core Version:    0.6.2
 */