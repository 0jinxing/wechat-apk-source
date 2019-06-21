package com.tencent.mm.plugin.music.model;

import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.music.e.f;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.e.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public class e
  implements at
{
  private c gRa;
  private c<com.tencent.mm.g.a.d> mGU;
  private c oMA;
  private com.tencent.mm.plugin.music.model.e.b oMx;
  private ClipboardManager oMy;
  private com.tencent.mm.plugin.music.model.e.d oMz;

  public e()
  {
    AppMethodBeat.i(104898);
    this.oMA = new f();
    this.gRa = new e.3(this);
    this.mGU = new e.4(this);
    AppMethodBeat.o(104898);
  }

  private static e bUj()
  {
    AppMethodBeat.i(104899);
    e locale = (e)q.Y(e.class);
    AppMethodBeat.o(104899);
    return locale;
  }

  public static com.tencent.mm.plugin.music.model.e.b bUk()
  {
    AppMethodBeat.i(104901);
    if (bUj().oMx == null)
      bUj().oMx = new com.tencent.mm.plugin.music.model.e.b(g.RP().eJN);
    com.tencent.mm.plugin.music.model.e.b localb = bUj().oMx;
    AppMethodBeat.o(104901);
    return localb;
  }

  public static ClipboardManager bUl()
  {
    AppMethodBeat.i(104902);
    if (bUj().oMy == null)
      bUj().oMy = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    ClipboardManager localClipboardManager = bUj().oMy;
    AppMethodBeat.o(104902);
    return localClipboardManager;
  }

  public static com.tencent.mm.plugin.music.model.e.d bUm()
  {
    AppMethodBeat.i(104903);
    if (bUj().oMz == null)
      bUj().oMz = new com.tencent.mm.plugin.music.model.e.d(g.RP().eJN);
    com.tencent.mm.plugin.music.model.e.d locald = bUj().oMz;
    AppMethodBeat.o(104903);
    return locald;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    AppMethodBeat.i(104900);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("Music".hashCode()), new e.1(this));
    localHashMap.put(Integer.valueOf("PieceMusicInfo".hashCode()), new e.2(this));
    AppMethodBeat.o(104900);
    return localHashMap;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(104904);
    this.mGU.dnU();
    this.oMA.dnU();
    this.gRa.dnU();
    m localm = new m();
    k.a(localm);
    com.tencent.mm.plugin.music.f.c.b.a(com.tencent.mm.plugin.music.e.e.class, localm);
    com.tencent.mm.plugin.music.f.c.b.a(com.tencent.mm.plugin.music.e.d.class, new com.tencent.mm.plugin.music.model.d.e());
    AppMethodBeat.o(104904);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(104905);
    k.bUg();
    com.tencent.mm.plugin.music.f.c.b.L(com.tencent.mm.plugin.music.e.e.class);
    this.oMx = null;
    this.oMy = null;
    this.oMz = null;
    a.xxA.d(this.oMA);
    this.oMA.dead();
    this.gRa.dead();
    this.mGU.dead();
    AppMethodBeat.o(104905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.e
 * JD-Core Version:    0.6.2
 */