package com.google.android.exoplayer2.source.b.a;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.s.a;
import com.google.android.exoplayer2.h.t;
import com.google.android.exoplayer2.h.t.a;
import com.google.android.exoplayer2.source.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public final class e
  implements s.a<t<c>>
{
  public a biH;
  public final d bjb;
  final com.google.android.exoplayer2.source.a.a bjc;
  public final t.a<c> bjk;
  public final Uri bkA;
  public final int bkB;
  public final IdentityHashMap<a.a, e.a> bkC;
  public final Handler bkD;
  final e.e bkE;
  public final List<e.b> bkF;
  public final s bkG;
  public a.a bkH;
  b bkI;
  public boolean bkJ;

  public e(Uri paramUri, d paramd, com.google.android.exoplayer2.source.a.a parama, int paramInt, e.e parame, t.a<c> parama1)
  {
    AppMethodBeat.i(125990);
    this.bkA = paramUri;
    this.bjb = paramd;
    this.bjc = parama;
    this.bkB = paramInt;
    this.bkE = parame;
    this.bjk = parama1;
    this.bkF = new ArrayList();
    this.bkG = new s("HlsPlaylistTracker:MasterPlaylist");
    this.bkC = new IdentityHashMap();
    this.bkD = new Handler();
    AppMethodBeat.o(125990);
  }

  static b.a a(b paramb1, b paramb2)
  {
    AppMethodBeat.i(125995);
    int i = paramb2.bjM - paramb1.bjM;
    paramb1 = paramb1.bjS;
    if (i < paramb1.size())
    {
      paramb1 = (b.a)paramb1.get(i);
      AppMethodBeat.o(125995);
    }
    while (true)
    {
      return paramb1;
      paramb1 = null;
      AppMethodBeat.o(125995);
    }
  }

  private void e(a.a parama)
  {
    AppMethodBeat.i(125993);
    if ((parama == this.bkH) || (!this.biH.bjF.contains(parama)) || ((this.bkI != null) && (this.bkI.bjP)))
      AppMethodBeat.o(125993);
    while (true)
    {
      return;
      this.bkH = parama;
      ((e.a)this.bkC.get(this.bkH)).sD();
      AppMethodBeat.o(125993);
    }
  }

  private void w(List<a.a> paramList)
  {
    AppMethodBeat.i(125994);
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      a.a locala = (a.a)paramList.get(j);
      e.a locala1 = new e.a(this, locala);
      this.bkC.put(locala, locala1);
    }
    AppMethodBeat.o(125994);
  }

  public final b c(a.a parama)
  {
    AppMethodBeat.i(125991);
    b localb = ((e.a)this.bkC.get(parama)).bkN;
    if (localb != null)
      e(parama);
    AppMethodBeat.o(125991);
    return localb;
  }

  public final void d(a.a parama)
  {
    AppMethodBeat.i(125992);
    this.bkC.get(parama);
    AppMethodBeat.o(125992);
  }

  public static final class c extends IOException
  {
    public final String url;

    private c(String paramString)
    {
      this.url = paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.e
 * JD-Core Version:    0.6.2
 */