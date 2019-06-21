package com.google.android.exoplayer2.f.g;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.f.d;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class i
  implements d
{
  private final List<e> blz;
  private final long[] bnA;
  private final int boR;
  private final long[] boS;

  public i(List<e> paramList)
  {
    AppMethodBeat.i(95749);
    this.blz = paramList;
    this.boR = paramList.size();
    this.bnA = new long[this.boR * 2];
    for (int i = 0; i < this.boR; i++)
    {
      e locale = (e)paramList.get(i);
      int j = i * 2;
      this.bnA[j] = locale.startTime;
      this.bnA[(j + 1)] = locale.endTime;
    }
    this.boS = Arrays.copyOf(this.bnA, this.bnA.length);
    Arrays.sort(this.boS);
    AppMethodBeat.o(95749);
  }

  public final int aj(long paramLong)
  {
    AppMethodBeat.i(95750);
    int i = v.a(this.boS, paramLong, false, false);
    if (i < this.boS.length)
      AppMethodBeat.o(95750);
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(95750);
    }
  }

  public final List<com.google.android.exoplayer2.f.a> ak(long paramLong)
  {
    AppMethodBeat.i(95752);
    int i = 0;
    SpannableStringBuilder localSpannableStringBuilder = null;
    Object localObject1 = null;
    Object localObject2 = null;
    if (i < this.boR)
    {
      Object localObject3 = localObject2;
      e locale;
      int j;
      if (this.bnA[(i * 2)] <= paramLong)
      {
        localObject3 = localObject2;
        if (paramLong < this.bnA[(i * 2 + 1)])
        {
          localObject3 = localObject2;
          if (localObject2 == null)
            localObject3 = new ArrayList();
          locale = (e)this.blz.get(i);
          if ((locale.bkW == 1.4E-45F) && (locale.bkY == 1.4E-45F))
          {
            j = 1;
            label118: if (j == 0)
              break label216;
            if (localObject1 != null)
              break label148;
            localObject2 = localObject3;
            localObject1 = locale;
          }
        }
      }
      while (true)
      {
        i++;
        break;
        j = 0;
        break label118;
        label148: if (localSpannableStringBuilder == null)
        {
          localSpannableStringBuilder = new SpannableStringBuilder();
          localSpannableStringBuilder.append(localObject1.text).append("\n").append(locale.text);
          localObject2 = localObject3;
        }
        else
        {
          localSpannableStringBuilder.append("\n").append(locale.text);
          localObject2 = localObject3;
          continue;
          label216: ((ArrayList)localObject3).add(locale);
          localObject2 = localObject3;
        }
      }
    }
    if (localSpannableStringBuilder != null)
    {
      ((ArrayList)localObject2).add(new e(localSpannableStringBuilder));
      if (localObject2 == null)
        break label280;
      AppMethodBeat.o(95752);
    }
    while (true)
    {
      return localObject2;
      if (localObject1 == null)
        break;
      ((ArrayList)localObject2).add(localObject1);
      break;
      label280: localObject2 = Collections.emptyList();
      AppMethodBeat.o(95752);
    }
  }

  public final long et(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95751);
    if (paramInt >= 0)
    {
      bool2 = true;
      com.google.android.exoplayer2.i.a.checkArgument(bool2);
      if (paramInt >= this.boS.length)
        break label53;
    }
    label53: for (boolean bool2 = bool1; ; bool2 = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool2);
      long l = this.boS[paramInt];
      AppMethodBeat.o(95751);
      return l;
      bool2 = false;
      break;
    }
  }

  public final int sG()
  {
    return this.boS.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.i
 * JD-Core Version:    0.6.2
 */