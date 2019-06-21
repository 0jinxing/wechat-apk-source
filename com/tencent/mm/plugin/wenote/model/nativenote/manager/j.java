package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
  implements Serializable
{
  private static final Pattern uQs;
  int uQt;
  public final ArrayList<n> uQu;

  static
  {
    AppMethodBeat.i(26830);
    uQs = Pattern.compile("\\r\\n|\\r|\\n");
    AppMethodBeat.o(26830);
  }

  public j(Spanned paramSpanned)
  {
    AppMethodBeat.i(26827);
    this.uQt = 0;
    this.uQu = new ArrayList();
    if (paramSpanned != null)
    {
      String str = paramSpanned.toString();
      this.uQt = 1;
      Matcher localMatcher = uQs.matcher(str);
      int i = 0;
      int j;
      boolean bool2;
      if (localMatcher.find())
      {
        j = localMatcher.end();
        if (this.uQt == 1);
        for (bool2 = true; ; bool2 = false)
        {
          paramSpanned = new n(i, j, bool2, false);
          this.uQu.add(paramSpanned);
          i = localMatcher.end();
          this.uQt += 1;
          break;
        }
      }
      if (this.uQu.size() < this.uQt)
      {
        j = str.length();
        bool2 = bool1;
        if (this.uQt == 1)
          bool2 = true;
        paramSpanned = new n(i, j, bool2, true);
        this.uQu.add(paramSpanned);
      }
    }
    AppMethodBeat.o(26827);
  }

  public final int getLineForOffset(int paramInt)
  {
    AppMethodBeat.i(26828);
    for (int i = 0; (i < this.uQt) && (paramInt >= ((n)this.uQu.get(i)).Ls); i++);
    paramInt = Math.min(Math.max(0, i), this.uQu.size() - 1);
    AppMethodBeat.o(26828);
    return paramInt;
  }

  public final String toString()
  {
    AppMethodBeat.i(26829);
    StringBuilder localStringBuilder1 = new StringBuilder();
    Iterator localIterator = this.uQu.iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      localObject = (n)localIterator.next();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(i).append(": ").append(((e)localObject).aqm).append("-").append(((e)localObject).Ls);
      if (((n)localObject).uRZ);
      for (localObject = ""; ; localObject = ", ")
      {
        localStringBuilder2.append((String)localObject);
        i++;
        break;
      }
    }
    Object localObject = localStringBuilder1.toString();
    AppMethodBeat.o(26829);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.j
 * JD-Core Version:    0.6.2
 */