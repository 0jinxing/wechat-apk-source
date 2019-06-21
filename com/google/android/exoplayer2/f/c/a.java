package com.google.android.exoplayer2.f.c;

import android.text.TextUtils;
import com.google.android.exoplayer2.f.b;
import com.google.android.exoplayer2.i.g;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends b
{
  private static final Pattern bnt;
  private final boolean bnu;
  private int bnv;
  private int bnw;
  private int bnx;
  private int bny;

  static
  {
    AppMethodBeat.i(95642);
    bnt = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    AppMethodBeat.o(95642);
  }

  public a()
  {
    this(null);
  }

  public a(List<byte[]> paramList)
  {
    super("SsaDecoder");
    AppMethodBeat.i(95636);
    if (paramList != null)
    {
      this.bnu = true;
      String str = new String((byte[])paramList.get(0));
      com.google.android.exoplayer2.i.a.checkArgument(str.startsWith("Format: "));
      aA(str);
      B(new l((byte[])paramList.get(1)));
      AppMethodBeat.o(95636);
    }
    while (true)
    {
      return;
      this.bnu = false;
      AppMethodBeat.o(95636);
    }
  }

  private static void B(l paraml)
  {
    AppMethodBeat.i(95637);
    String str;
    do
    {
      str = paraml.readLine();
      if (str == null)
        break;
    }
    while (!str.startsWith("[Events]"));
    AppMethodBeat.o(95637);
    while (true)
    {
      return;
      AppMethodBeat.o(95637);
    }
  }

  private void a(l paraml, List<com.google.android.exoplayer2.f.a> paramList, g paramg)
  {
    AppMethodBeat.i(95638);
    Object localObject;
    long l1;
    long l2;
    do
    {
      do
      {
        do
          while (true)
          {
            localObject = paraml.readLine();
            if (localObject == null)
              break label208;
            if ((this.bnu) || (!((String)localObject).startsWith("Format: ")))
              break;
            aA((String)localObject);
          }
        while ((!((String)localObject).startsWith("Dialogue: ")) || (this.bnv == 0));
        localObject = ((String)localObject).substring(10).split(",", this.bnv);
        l1 = aB(localObject[this.bnw]);
      }
      while (l1 == -9223372036854775807L);
      String str = localObject[this.bnx];
      if (str.trim().isEmpty())
        break label214;
      l2 = aB(str);
    }
    while (l2 == -9223372036854775807L);
    while (true)
    {
      paramList.add(new com.google.android.exoplayer2.f.a(localObject[this.bny].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
      paramg.add(l1);
      if (l2 == -9223372036854775807L)
        break;
      paramList.add(null);
      paramg.add(l2);
      break;
      label208: AppMethodBeat.o(95638);
      return;
      label214: l2 = -9223372036854775807L;
    }
  }

  private void aA(String paramString)
  {
    AppMethodBeat.i(95639);
    String[] arrayOfString = TextUtils.split(paramString.substring(8), ",");
    this.bnv = arrayOfString.length;
    this.bnw = -1;
    this.bnx = -1;
    this.bny = -1;
    int i = 0;
    if (i < this.bnv)
    {
      paramString = v.aR(arrayOfString[i].trim());
      label96: int j;
      switch (paramString.hashCode())
      {
      default:
        j = -1;
        label99: switch (j)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
        break;
      case 109757538:
      case 100571:
      case 3556653:
      }
      while (true)
      {
        i++;
        break;
        if (!paramString.equals("start"))
          break label96;
        j = 0;
        break label99;
        if (!paramString.equals("end"))
          break label96;
        j = 1;
        break label99;
        if (!paramString.equals("text"))
          break label96;
        j = 2;
        break label99;
        this.bnw = i;
        continue;
        this.bnx = i;
        continue;
        this.bny = i;
      }
    }
    AppMethodBeat.o(95639);
  }

  private static long aB(String paramString)
  {
    AppMethodBeat.i(95640);
    paramString = bnt.matcher(paramString);
    long l1;
    if (!paramString.matches())
    {
      l1 = -9223372036854775807L;
      AppMethodBeat.o(95640);
    }
    while (true)
    {
      return l1;
      long l2 = Long.parseLong(paramString.group(1));
      long l3 = Long.parseLong(paramString.group(2));
      l1 = Long.parseLong(paramString.group(3));
      l1 = Long.parseLong(paramString.group(4)) * 10000L + (l2 * 60L * 60L * 1000000L + l3 * 60L * 1000000L + l1 * 1000000L);
      AppMethodBeat.o(95640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.c.a
 * JD-Core Version:    0.6.2
 */