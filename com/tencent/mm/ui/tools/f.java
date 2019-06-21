package com.tencent.mm.ui.tools;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
  implements InputFilter
{
  private int jeY;
  private a jeZ;

  public f(int paramInt, a parama)
  {
    this.jeY = paramInt;
    this.jeZ = parama;
  }

  public static int a(String paramString, a parama)
  {
    AppMethodBeat.i(67859);
    int i;
    if (parama == a.zFu)
    {
      i = ash(paramString);
      AppMethodBeat.o(67859);
    }
    while (true)
    {
      return i;
      if (parama == a.zFv)
      {
        i = asg(paramString);
        AppMethodBeat.o(67859);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(67859);
      }
    }
  }

  public static int asg(String paramString)
  {
    AppMethodBeat.i(67860);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(67860);
    }
    while (true)
    {
      return i;
      i = paramString.length() + asi(paramString) + asj(paramString);
      AppMethodBeat.o(67860);
    }
  }

  private static int ash(String paramString)
  {
    AppMethodBeat.i(67861);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(67861);
    }
    while (true)
    {
      return i;
      i = paramString.length();
      AppMethodBeat.o(67861);
    }
  }

  public static int asi(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(67862);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(67862);
    while (true)
    {
      return i;
      paramString = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(paramString);
      i = 0;
      if (paramString.find())
      {
        int j = 0;
        int k = i;
        while (true)
        {
          i = k;
          if (j > paramString.groupCount())
            break;
          k++;
          j++;
        }
      }
      AppMethodBeat.o(67862);
    }
  }

  private static int asj(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(67863);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(67863);
      return i;
    }
    int j = 0;
    i = 0;
    label25: if (j < paramString.length())
    {
      int k = paramString.charAt(j);
      if ((k < 0) || (k > 127))
        break label78;
      i++;
    }
    label78: 
    while (true)
    {
      j++;
      break label25;
      i = paramString.length() - (asi(paramString) + i);
      AppMethodBeat.o(67863);
      break;
    }
  }

  public static int bP(int paramInt, String paramString)
  {
    AppMethodBeat.i(67864);
    if (aa.don())
    {
      paramInt = Math.round((paramInt - Math.round(asg(paramString))) / 2.0F);
      AppMethodBeat.o(67864);
    }
    while (true)
    {
      return paramInt;
      paramInt -= asg(paramString);
      AppMethodBeat.o(67864);
    }
  }

  public static int bQ(int paramInt, String paramString)
  {
    AppMethodBeat.i(67865);
    if (aa.don())
    {
      paramInt = Math.round((Math.round(asg(paramString)) - paramInt) / 2.0F);
      AppMethodBeat.o(67865);
    }
    while (true)
    {
      return paramInt;
      paramInt = asg(paramString) - paramInt;
      AppMethodBeat.o(67865);
    }
  }

  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(67858);
    if (a(paramSpanned.toString(), this.jeZ) + a(paramCharSequence.toString(), this.jeZ) > this.jeY)
    {
      paramCharSequence = "";
      AppMethodBeat.o(67858);
    }
    while (true)
    {
      return paramCharSequence;
      AppMethodBeat.o(67858);
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(67857);
      zFu = new a("MODE_CHINESE_AS_1", 0);
      zFv = new a("MODE_CHINESE_AS_2", 1);
      zFw = new a[] { zFu, zFv };
      AppMethodBeat.o(67857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.f
 * JD-Core Version:    0.6.2
 */