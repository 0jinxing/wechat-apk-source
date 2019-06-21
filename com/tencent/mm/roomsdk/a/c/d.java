package com.tencent.mm.roomsdk.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  private f fur;
  protected com.tencent.mm.roomsdk.a.b.a xuY;
  protected com.tencent.mm.roomsdk.a.b.a xuZ;
  protected com.tencent.mm.roomsdk.a.b.a xva;
  private int xvi;

  public d()
  {
    AppMethodBeat.i(80271);
    this.fur = new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(80270);
        if ((paramAnonymousm instanceof com.tencent.mm.roomsdk.a.a))
          ((com.tencent.mm.roomsdk.a.a)paramAnonymousm).a(d.this.xva);
        if (d.this.xva != null)
          d.this.xva.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, d.this.xva);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          if (d.this.xuY == null)
            break label139;
          d.this.xuY.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, d.this.xuY);
          AppMethodBeat.o(80270);
        }
        while (true)
        {
          return;
          if (d.this.xuZ != null)
            d.this.xuZ.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, d.this.xuZ);
          label139: AppMethodBeat.o(80270);
        }
      }
    };
    this.xvi = 700;
    AppMethodBeat.o(80271);
  }

  public final void dead()
  {
    AppMethodBeat.i(80273);
    ab.i("MicroMsg.RoomWatchCallbackFactory", "dead");
    g.RQ();
    g.RO().eJo.b(this.xvi, this.fur);
    AppMethodBeat.o(80273);
  }

  public final d dmY()
  {
    AppMethodBeat.i(80272);
    ab.i("MicroMsg.RoomWatchCallbackFactory", "alive");
    g.RQ();
    g.RO().eJo.a(this.xvi, this.fur);
    AppMethodBeat.o(80272);
    return this;
  }

  public final d e(com.tencent.mm.roomsdk.a.b.a parama)
  {
    this.xuY = parama;
    return this;
  }

  public final d f(com.tencent.mm.roomsdk.a.b.a parama)
  {
    this.xuZ = parama;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.d
 * JD-Core Version:    0.6.2
 */