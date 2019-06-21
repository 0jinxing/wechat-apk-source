package com.google.android.exoplayer2.f.e;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class b
{
  public final long bif;
  public final long big;
  public final boolean bnL;
  public final d bnM;
  public final String bnN;
  private final String[] bnO;
  private final HashMap<String, Integer> bnP;
  private final HashMap<String, Integer> bnQ;
  private List<b> bnR;
  public final String tag;
  public final String text;

  b(String paramString1, String paramString2, long paramLong1, long paramLong2, d paramd, String[] paramArrayOfString, String paramString3)
  {
    AppMethodBeat.i(95680);
    this.tag = paramString1;
    this.text = paramString2;
    this.bnM = paramd;
    this.bnO = paramArrayOfString;
    if (paramString2 != null);
    for (boolean bool = true; ; bool = false)
    {
      this.bnL = bool;
      this.bif = paramLong1;
      this.big = paramLong2;
      this.bnN = ((String)a.checkNotNull(paramString3));
      this.bnP = new HashMap();
      this.bnQ = new HashMap();
      AppMethodBeat.o(95680);
      return;
    }
  }

  static SpannableStringBuilder a(SpannableStringBuilder paramSpannableStringBuilder)
  {
    AppMethodBeat.i(95689);
    int i = paramSpannableStringBuilder.length();
    int j = 0;
    int k;
    if (j < i)
    {
      if (paramSpannableStringBuilder.charAt(j) != ' ')
        break label298;
      for (k = j + 1; (k < paramSpannableStringBuilder.length()) && (paramSpannableStringBuilder.charAt(k) == ' '); k++);
      k -= j + 1;
      if (k <= 0)
        break label298;
      paramSpannableStringBuilder.delete(j, j + k);
      i -= k;
    }
    label298: 
    while (true)
    {
      j++;
      break;
      j = i;
      if (i > 0)
      {
        j = i;
        if (paramSpannableStringBuilder.charAt(0) == ' ')
        {
          paramSpannableStringBuilder.delete(0, 1);
          j = i - 1;
        }
      }
      k = 0;
      i = j;
      j = k;
      while (j < i - 1)
      {
        k = i;
        if (paramSpannableStringBuilder.charAt(j) == '\n')
        {
          k = i;
          if (paramSpannableStringBuilder.charAt(j + 1) == ' ')
          {
            paramSpannableStringBuilder.delete(j + 1, j + 2);
            k = i - 1;
          }
        }
        j++;
        i = k;
      }
      j = i;
      if (i > 0)
      {
        j = i;
        if (paramSpannableStringBuilder.charAt(i - 1) == ' ')
        {
          paramSpannableStringBuilder.delete(i - 1, i);
          j = i - 1;
        }
      }
      i = 0;
      for (k = j; i < k - 1; k = j)
      {
        j = k;
        if (paramSpannableStringBuilder.charAt(i) == ' ')
        {
          j = k;
          if (paramSpannableStringBuilder.charAt(i + 1) == '\n')
          {
            paramSpannableStringBuilder.delete(i, i + 1);
            j = k - 1;
          }
        }
        i++;
      }
      if ((k > 0) && (paramSpannableStringBuilder.charAt(k - 1) == '\n'))
        paramSpannableStringBuilder.delete(k - 1, k);
      AppMethodBeat.o(95689);
      return paramSpannableStringBuilder;
    }
  }

  private void a(TreeSet<Long> paramTreeSet, boolean paramBoolean)
  {
    AppMethodBeat.i(95685);
    boolean bool1 = "p".equals(this.tag);
    if ((paramBoolean) || (bool1))
    {
      if (this.bif != -9223372036854775807L)
        paramTreeSet.add(Long.valueOf(this.bif));
      if (this.big != -9223372036854775807L)
        paramTreeSet.add(Long.valueOf(this.big));
    }
    if (this.bnR == null)
      AppMethodBeat.o(95685);
    while (true)
    {
      return;
      int i = 0;
      if (i < this.bnR.size())
      {
        b localb = (b)this.bnR.get(i);
        if ((paramBoolean) || (bool1));
        for (boolean bool2 = true; ; bool2 = false)
        {
          localb.a(paramTreeSet, bool2);
          i++;
          break;
        }
      }
      AppMethodBeat.o(95685);
    }
  }

  private static SpannableStringBuilder b(String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    AppMethodBeat.i(95687);
    if (!paramMap.containsKey(paramString))
      paramMap.put(paramString, new SpannableStringBuilder());
    paramString = (SpannableStringBuilder)paramMap.get(paramString);
    AppMethodBeat.o(95687);
    return paramString;
  }

  private b eD(int paramInt)
  {
    AppMethodBeat.i(95682);
    if (this.bnR == null)
    {
      localObject = new IndexOutOfBoundsException();
      AppMethodBeat.o(95682);
      throw ((Throwable)localObject);
    }
    Object localObject = (b)this.bnR.get(paramInt);
    AppMethodBeat.o(95682);
    return localObject;
  }

  private int getChildCount()
  {
    AppMethodBeat.i(95683);
    int i;
    if (this.bnR == null)
    {
      i = 0;
      AppMethodBeat.o(95683);
    }
    while (true)
    {
      return i;
      i = this.bnR.size();
      AppMethodBeat.o(95683);
    }
  }

  final void a(long paramLong, boolean paramBoolean, String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    AppMethodBeat.i(95686);
    this.bnP.clear();
    this.bnQ.clear();
    Object localObject1 = this.bnN;
    Object localObject2 = localObject1;
    if ("".equals(localObject1))
      localObject2 = paramString;
    if ((this.bnL) && (paramBoolean))
    {
      b((String)localObject2, paramMap).append(this.text);
      AppMethodBeat.o(95686);
    }
    while (true)
    {
      return;
      if (("br".equals(this.tag)) && (paramBoolean))
      {
        b((String)localObject2, paramMap).append('\n');
        AppMethodBeat.o(95686);
      }
      else
      {
        if (!"metadata".equals(this.tag))
        {
          int i;
          if (((this.bif == -9223372036854775807L) && (this.big == -9223372036854775807L)) || ((this.bif <= paramLong) && (this.big == -9223372036854775807L)) || ((this.bif == -9223372036854775807L) && (paramLong < this.big)) || ((this.bif <= paramLong) && (paramLong < this.big)))
            i = 1;
          while (i != 0)
          {
            boolean bool1 = "p".equals(this.tag);
            paramString = paramMap.entrySet().iterator();
            while (true)
              if (paramString.hasNext())
              {
                localObject1 = (Map.Entry)paramString.next();
                this.bnP.put(((Map.Entry)localObject1).getKey(), Integer.valueOf(((SpannableStringBuilder)((Map.Entry)localObject1).getValue()).length()));
                continue;
                i = 0;
                break;
              }
            i = 0;
            if (i < getChildCount())
            {
              paramString = eD(i);
              if ((paramBoolean) || (bool1));
              for (boolean bool2 = true; ; bool2 = false)
              {
                paramString.a(paramLong, bool2, (String)localObject2, paramMap);
                i++;
                break;
              }
            }
            if (bool1)
            {
              paramString = b((String)localObject2, paramMap);
              for (i = paramString.length() - 1; (i >= 0) && (paramString.charAt(i) == ' '); i--);
              if ((i >= 0) && (paramString.charAt(i) != '\n'))
                paramString.append('\n');
            }
            paramString = paramMap.entrySet().iterator();
            while (paramString.hasNext())
            {
              paramMap = (Map.Entry)paramString.next();
              this.bnQ.put(paramMap.getKey(), Integer.valueOf(((SpannableStringBuilder)paramMap.getValue()).length()));
            }
          }
        }
        AppMethodBeat.o(95686);
      }
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(95681);
    if (this.bnR == null)
      this.bnR = new ArrayList();
    this.bnR.add(paramb);
    AppMethodBeat.o(95681);
  }

  final void b(Map<String, d> paramMap, Map<String, SpannableStringBuilder> paramMap1)
  {
    AppMethodBeat.i(95688);
    Iterator localIterator = this.bnQ.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      int i;
      SpannableStringBuilder localSpannableStringBuilder;
      int j;
      String[] arrayOfString;
      if (this.bnP.containsKey(localObject2))
      {
        i = ((Integer)this.bnP.get(localObject2)).intValue();
        localSpannableStringBuilder = (SpannableStringBuilder)paramMap1.get(localObject2);
        j = ((Integer)((Map.Entry)localObject1).getValue()).intValue();
        if (i == j)
          break label680;
        localObject2 = this.bnM;
        arrayOfString = this.bnO;
        if ((localObject2 != null) || (arrayOfString != null))
          break label286;
        localObject1 = null;
        label139: if (localObject1 == null)
          break label680;
        if (((d)localObject1).getStyle() != -1)
          localSpannableStringBuilder.setSpan(new StyleSpan(((d)localObject1).getStyle()), i, j, 33);
        if (((d)localObject1).bnW != 1)
          break label496;
        k = 1;
        label188: if (k != 0)
          localSpannableStringBuilder.setSpan(new StrikethroughSpan(), i, j, 33);
        if (((d)localObject1).bnX != 1)
          break label502;
      }
      label286: label496: label502: for (int k = 1; ; k = 0)
      {
        if (k != 0)
          localSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
        if (!((d)localObject1).bnU)
          break label531;
        if (((d)localObject1).bnU)
          break label508;
        paramMap = new IllegalStateException("Font color has not been defined.");
        AppMethodBeat.o(95688);
        throw paramMap;
        i = 0;
        break;
        if ((localObject2 == null) && (arrayOfString.length == 1))
        {
          localObject1 = (d)paramMap.get(arrayOfString[0]);
          break label139;
        }
        if ((localObject2 == null) && (arrayOfString.length > 1))
        {
          localObject2 = new d();
          m = arrayOfString.length;
          for (k = 0; ; k++)
          {
            localObject1 = localObject2;
            if (k >= m)
              break;
            ((d)localObject2).b((d)paramMap.get(arrayOfString[k]));
          }
        }
        if ((localObject2 != null) && (arrayOfString != null) && (arrayOfString.length == 1))
        {
          localObject1 = ((d)localObject2).b((d)paramMap.get(arrayOfString[0]));
          break label139;
        }
        localObject1 = localObject2;
        if (localObject2 == null)
          break label139;
        localObject1 = localObject2;
        if (arrayOfString == null)
          break label139;
        localObject1 = localObject2;
        if (arrayOfString.length <= 1)
          break label139;
        int m = arrayOfString.length;
        for (k = 0; ; k++)
        {
          localObject1 = localObject2;
          if (k >= m)
            break;
          ((d)localObject2).b((d)paramMap.get(arrayOfString[k]));
        }
        k = 0;
        break label188;
      }
      label508: localSpannableStringBuilder.setSpan(new ForegroundColorSpan(((d)localObject1).bnT), i, j, 33);
      label531: if (((d)localObject1).bnV)
      {
        if (!((d)localObject1).bnV)
        {
          paramMap = new IllegalStateException("Background color has not been defined.");
          AppMethodBeat.o(95688);
          throw paramMap;
        }
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(((d)localObject1).backgroundColor), i, j, 33);
      }
      if (((d)localObject1).bnS != null)
        localSpannableStringBuilder.setSpan(new TypefaceSpan(((d)localObject1).bnS), i, j, 33);
      if (((d)localObject1).boc != null)
        localSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(((d)localObject1).boc), i, j, 33);
      switch (((d)localObject1).boa)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        label680: for (i = 0; i < getChildCount(); i++)
          eD(i).b(paramMap, paramMap1);
        localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)((d)localObject1).fontSize, true), i, j, 33);
        continue;
        localSpannableStringBuilder.setSpan(new RelativeSizeSpan(((d)localObject1).fontSize), i, j, 33);
        continue;
        localSpannableStringBuilder.setSpan(new RelativeSizeSpan(((d)localObject1).fontSize / 100.0F), i, j, 33);
      }
    }
    AppMethodBeat.o(95688);
  }

  public final long[] tb()
  {
    AppMethodBeat.i(95684);
    Object localObject = new TreeSet();
    a((TreeSet)localObject, false);
    long[] arrayOfLong = new long[((TreeSet)localObject).size()];
    localObject = ((TreeSet)localObject).iterator();
    for (int i = 0; ((Iterator)localObject).hasNext(); i++)
      arrayOfLong[i] = ((Long)((Iterator)localObject).next()).longValue();
    AppMethodBeat.o(95684);
    return arrayOfLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.e.b
 * JD-Core Version:    0.6.2
 */