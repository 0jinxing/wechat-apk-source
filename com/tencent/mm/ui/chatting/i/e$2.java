package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.List;

final class e$2
  implements Runnable
{
  e$2(e parame, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32557);
    int i = e.fi(this.ibp);
    if (this.ibp.size() == i)
    {
      e.d(this.yZo).post(new e.2.1(this));
      AppMethodBeat.o(32557);
    }
    while (true)
    {
      return;
      Object localObject1 = this.yZo;
      if (i > 0);
      for (boolean bool = true; ; bool = false)
      {
        e.a((e)localObject1, bool);
        localObject2 = e.b(this.yZo, this.ibp);
        localObject1 = e.c(this.yZo, this.ibp);
        ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[innerHandleSave] needDownloadImageList size:%s needDownloadVideoList:%s", new Object[] { Integer.valueOf(((List)localObject2).size()), Integer.valueOf(((List)localObject1).size()) });
        e.a(this.yZo, ((List)localObject2).size() + ((List)localObject1).size());
        if ((at.isWifi(ah.getContext())) || (e.e(this.yZo) != this.ibp.size()))
          break label214;
        e.d(this.yZo).post(new e.2.2(this));
        AppMethodBeat.o(32557);
        break;
      }
      label214: Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (bi)localIterator.next();
        e.a(this.yZo, (bi)localObject2, com.tencent.mm.ui.chatting.gallery.e.d((bi)localObject2));
      }
      Object localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (bi)((Iterator)localObject2).next();
        e.a(this.yZo, (bi)localObject1);
      }
      if (e.f(this.yZo))
        e.d(this.yZo).post(new e.2.3(this));
      if ((e.g(this.yZo)) && (!e.f(this.yZo)))
        e.d(this.yZo).post(new e.2.4(this));
      AppMethodBeat.o(32557);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.2
 * JD-Core Version:    0.6.2
 */