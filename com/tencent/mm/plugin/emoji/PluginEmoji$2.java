package com.tencent.mm.plugin.emoji;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.f;
import com.tencent.mm.cb.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.ui.e.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PluginEmoji$2
  implements a
{
  PluginEmoji$2(PluginEmoji paramPluginEmoji)
  {
  }

  public final int bV(String paramString, int paramInt)
  {
    AppMethodBeat.i(62321);
    g.dqQ();
    Object localObject = f.dqL();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(62321);
    int i;
    while (true)
    {
      return paramInt;
      i = paramString.length();
      if ((paramInt != 0) && (paramInt != i))
        break;
      AppMethodBeat.o(62321);
    }
    if (f.xGo == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int j = ((f)localObject).xGe.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGe[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      j = ((f)localObject).xGf.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGf[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      j = ((f)localObject).xGg.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGg[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      j = ((f)localObject).xGh.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGh[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      j = ((f)localObject).xGi.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGi[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      j = ((f)localObject).xGj.length;
      for (k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(localObject.xGj[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      if ((((f)localObject).xGk != null) && (!((f)localObject).xGk.isEmpty()))
      {
        localObject = ((f)localObject).xGk.iterator();
        while (((Iterator)localObject).hasNext())
        {
          SmileyInfo localSmileyInfo = (SmileyInfo)((Iterator)localObject).next();
          localStringBuilder.append(Pattern.quote(localSmileyInfo.field_key)).append("|");
          if (!bo.isNullOrNil(localSmileyInfo.field_cnValue))
            localStringBuilder.append(Pattern.quote(localSmileyInfo.field_cnValue)).append("|");
          if (!bo.isNullOrNil(localSmileyInfo.field_enValue))
            localStringBuilder.append(Pattern.quote(localSmileyInfo.field_enValue)).append("|");
          if (!bo.isNullOrNil(localSmileyInfo.field_qqValue))
            localStringBuilder.append(Pattern.quote(localSmileyInfo.field_qqValue)).append("|");
          if (!bo.isNullOrNil(localSmileyInfo.field_twValue))
            localStringBuilder.append(Pattern.quote(localSmileyInfo.field_twValue)).append("|");
          if (!bo.isNullOrNil(localSmileyInfo.field_thValue))
            localStringBuilder.append(Pattern.quote(localSmileyInfo.field_thValue)).append("|");
        }
      }
      f.xGo = Pattern.compile(localStringBuilder.toString());
    }
    if (paramInt < 6)
    {
      k = 0;
      label639: if (paramInt + 6 < i)
        break label732;
      i--;
      label651: paramString = paramString.substring(k, i);
      paramString = f.xGo.matcher(paramString);
      do
        if (!paramString.find())
          break;
      while ((6 <= paramString.start()) || (6 >= paramString.end()));
    }
    for (int k = paramString.start(); ; k = 6)
    {
      if (k - 6 > 0)
        k -= 6;
      while (true)
      {
        paramInt += k;
        AppMethodBeat.o(62321);
        break;
        k = paramInt - 6;
        break label639;
        label732: i = paramInt + 6;
        break label651;
        k = 0;
      }
    }
  }

  public final CharSequence c(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(62320);
    paramContext = g.dqQ().b(paramCharSequence, paramFloat);
    AppMethodBeat.o(62320);
    return paramContext;
  }

  public final CharSequence h(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(62319);
    paramCharSequence = g.dqQ().o(paramCharSequence, paramInt);
    AppMethodBeat.o(62319);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.PluginEmoji.2
 * JD-Core Version:    0.6.2
 */