package com.tencent.mm.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a$1
  implements Runnable
{
  e$a$1(e.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116183);
    ab.d("MicroMsg.EmojiAndTextArtist", "cancel focus!");
    if (this.ckq.ckp.CI() == null)
      AppMethodBeat.o(116183);
    while (true)
    {
      return;
      com.tencent.mm.y.c localc = ((com.tencent.mm.cache.c)this.ckq.ckp.CI()).Ji();
      if ((localc != null) && (localc.ejw))
      {
        localc.setSelected(false);
        e.a.a(this.ckq).bk(false);
        e.a.a(this.ckq).CP();
      }
      AppMethodBeat.o(116183);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.e.a.1
 * JD-Core Version:    0.6.2
 */