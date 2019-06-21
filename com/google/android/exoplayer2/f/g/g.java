package com.google.android.exoplayer2.f.g;

import android.text.TextUtils;
import com.google.android.exoplayer2.f.b;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class g extends b
{
  private final f boK;
  private final l boL;
  private final e.a boM;
  private final a boN;
  private final List<d> boO;

  public g()
  {
    super("WebvttDecoder");
    AppMethodBeat.i(95740);
    this.boK = new f();
    this.boL = new l();
    this.boM = new e.a();
    this.boN = new a();
    this.boO = new ArrayList();
    AppMethodBeat.o(95740);
  }

  private static int G(l paraml)
  {
    AppMethodBeat.i(95741);
    int i = 0;
    int j = -1;
    while (j == -1)
    {
      i = paraml.position;
      String str = paraml.readLine();
      if (str == null)
        j = 0;
      else if ("STYLE".equals(str))
        j = 2;
      else if ("NOTE".startsWith(str))
        j = 1;
      else
        j = 3;
    }
    paraml.setPosition(i);
    AppMethodBeat.o(95741);
    return j;
  }

  private static void H(l paraml)
  {
    AppMethodBeat.i(95742);
    while (!TextUtils.isEmpty(paraml.readLine()));
    AppMethodBeat.o(95742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.g
 * JD-Core Version:    0.6.2
 */