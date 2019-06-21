package com.tencent.mm.plugin.music.b.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  static void r(ArrayList<IDKey> paramArrayList)
  {
    AppMethodBeat.i(104815);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("idkeyGroupStat:  id:688");
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = (IDKey)localIterator.next();
      localStringBuilder.append(", key:" + paramArrayList.GetKey() + " value:" + paramArrayList.GetValue());
    }
    com.tencent.mm.audio.mix.h.b.d("MicroMsg.Audio.AudioPlayIdKeyReport", localStringBuilder.toString());
    AppMethodBeat.o(104815);
  }

  public static int zn(int paramInt)
  {
    AppMethodBeat.i(104814);
    ab.i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
      paramInt = 115;
      AppMethodBeat.o(104814);
    case 702:
    case 703:
    case 704:
    case 705:
    case 706:
    case 707:
    case 708:
    case 709:
    case 710:
    case 711:
    case 712:
    case 713:
    case 714:
    case 715:
    }
    while (true)
    {
      return paramInt;
      paramInt = 98;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 99;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 100;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 101;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 102;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 103;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 104;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 105;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 106;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 107;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 108;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 119;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 120;
      AppMethodBeat.o(104814);
      continue;
      paramInt = 109;
      AppMethodBeat.o(104814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a.b
 * JD-Core Version:    0.6.2
 */