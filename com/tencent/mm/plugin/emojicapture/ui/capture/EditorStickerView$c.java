package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.f.a.m;
import a.f.b.j;
import a.f.b.u.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$stickerCallback$1", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerMgr$StickerResCallback;", "notifyUpdate", "", "onItemChange", "position", "", "update", "items", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "plugin-emojicapture_release"})
public final class EditorStickerView$c
  implements c.a
{
  public final void S(LinkedList<com.tencent.mm.plugin.emojicapture.model.a.b> paramLinkedList)
  {
    AppMethodBeat.i(3008);
    j.p(paramLinkedList, "items");
    ab.i(EditorStickerView.d(this.lmQ), "update: " + paramLinkedList.size());
    Object localObject = EditorStickerView.b(this.lmQ);
    List localList = (List)paramLinkedList;
    j.p(localList, "audios");
    ab.i(com.tencent.mm.plugin.emojicapture.ui.a.a.TAG, "update: " + localList.size());
    ((com.tencent.mm.plugin.emojicapture.ui.a.a)localObject).llT.clear();
    ((com.tencent.mm.plugin.emojicapture.ui.a.a)localObject).llT.addAll((Collection)localList);
    int i;
    if (EditorStickerView.a(this.lmQ) < 0)
    {
      localObject = new u.b();
      paramLinkedList = ((List)paramLinkedList).iterator();
      i = 0;
      if (!paramLinkedList.hasNext())
        break label244;
      if (!j.j(((com.tencent.mm.plugin.emojicapture.model.a.b)paramLinkedList.next()).lgY, EditorStickerView.e(this.lmQ)))
        break label238;
      label171: ((u.b)localObject).AVD = i;
      if (EditorStickerView.e(this.lmQ) != null)
        break label250;
      ((u.b)localObject).AVD = 1;
    }
    while (true)
    {
      EditorStickerView.f(this.lmQ).lqs = ((m)new EditorStickerView.c.a(this));
      com.tencent.mm.ab.b.a(200L, (a.f.a.a)new EditorStickerView.c.b(this, (u.b)localObject));
      AppMethodBeat.o(3008);
      return;
      label238: i++;
      break;
      label244: i = -1;
      break label171;
      label250: if (((u.b)localObject).AVD < 0)
        ((u.b)localObject).AVD = 0;
    }
  }

  public final void bny()
  {
    AppMethodBeat.i(3009);
    ab.i(EditorStickerView.d(this.lmQ), "notifyUpdate: ");
    EditorStickerView.b(this.lmQ).notifyDataSetChanged();
    AppMethodBeat.o(3009);
  }

  public final void uv(int paramInt)
  {
    AppMethodBeat.i(3010);
    ab.i(EditorStickerView.d(this.lmQ), "onItemChange: ".concat(String.valueOf(paramInt)));
    EditorStickerView.b(this.lmQ).cg(paramInt);
    AppMethodBeat.o(3010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView.c
 * JD-Core Version:    0.6.2
 */