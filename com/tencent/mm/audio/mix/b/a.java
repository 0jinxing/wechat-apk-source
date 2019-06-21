package com.tencent.mm.audio.mix.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class a
{
  private static a ckI;
  private ArrayList<b> ckJ;

  private a()
  {
    AppMethodBeat.i(136979);
    this.ckJ = new ArrayList();
    AppMethodBeat.o(136979);
  }

  public static a Dg()
  {
    AppMethodBeat.i(136980);
    if (ckI == null);
    try
    {
      if (ckI == null)
      {
        locala = new com/tencent/mm/audio/mix/b/a;
        locala.<init>();
        ckI = locala;
      }
      a locala = ckI;
      AppMethodBeat.o(136980);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(136980);
    }
  }

  public final b Dh()
  {
    try
    {
      AppMethodBeat.i(136981);
      b localb;
      if (this.ckJ.size() > 0)
      {
        localb = (b)this.ckJ.remove(this.ckJ.size() - 1);
        AppMethodBeat.o(136981);
      }
      while (true)
      {
        return localb;
        localb = new com/tencent/mm/audio/mix/a/b;
        localb.<init>();
        AppMethodBeat.o(136981);
      }
    }
    finally
    {
    }
  }

  public final void a(b paramb)
  {
    try
    {
      AppMethodBeat.i(136982);
      if ((paramb == null) || (paramb.ckv == null))
        AppMethodBeat.o(136982);
      while (true)
      {
        return;
        paramb.channels = 0;
        paramb.sampleRate = 0;
        paramb.ckw.clear();
        Arrays.fill(paramb.ckv, 0, paramb.ckv.length, (byte)0);
        this.ckJ.add(0, paramb);
        AppMethodBeat.o(136982);
      }
    }
    finally
    {
    }
    throw paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.a
 * JD-Core Version:    0.6.2
 */