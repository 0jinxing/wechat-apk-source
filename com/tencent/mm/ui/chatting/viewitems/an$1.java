package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.ag;

final class an$1
  implements Runnable
{
  an$1(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33355);
    Object localObject = this.zbG;
    bi localbi = this.fku;
    ag localag = (ag)((com.tencent.mm.ui.chatting.d.a)localObject).aF(ag.class);
    if ((localObject == null) || (localag == null))
    {
      ab.e("MicroMsg.ChattingItemVoice", "alvinluo ui or ui.transformImp null");
      AppMethodBeat.o(33355);
      return;
    }
    int i;
    if (localag.nm(localbi.field_msgId))
      i = 2;
    while (true)
    {
      ab.i("MicroMsg.ChattingItemVoice", "alvinluo TransformText report clickScene: %d, msgId: %d", new Object[] { Integer.valueOf(i), Long.valueOf(localbi.field_msgId) });
      localObject = new ft();
      ((ft)localObject).czK.czL = 1;
      ((ft)localObject).czK.scene = i;
      ((ft)localObject).czK.fileName = localbi.field_imgPath;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      AppMethodBeat.o(33355);
      break;
      if (localag.nj(localbi.field_msgId))
        i = 3;
      else if (!bo.isNullOrNil(localag.C(localbi.field_msgId, localbi.field_imgPath)))
        i = 5;
      else
        i = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an.1
 * JD-Core Version:    0.6.2
 */