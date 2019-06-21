package com.tencent.mm.pluginsdk.f;

import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class g
{
  private static int a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79454);
    if ((paramInt1 + 1 < paramInt2) && (paramSpannableStringBuilder.charAt(paramInt1 + 1) == '\''))
    {
      paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
      paramInt1 = 1;
      AppMethodBeat.o(79454);
      return paramInt1;
    }
    int i = 0;
    paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
    int j = paramInt2 - 1;
    paramInt2 = paramInt1;
    paramInt1 = i;
    while (true)
      if (paramInt2 < j)
      {
        if (paramSpannableStringBuilder.charAt(paramInt2) == '\'')
        {
          if ((paramInt2 + 1 < j) && (paramSpannableStringBuilder.charAt(paramInt2 + 1) == '\''))
          {
            paramSpannableStringBuilder.delete(paramInt2, paramInt2 + 1);
            j--;
            paramInt1++;
            paramInt2++;
            continue;
          }
          paramSpannableStringBuilder.delete(paramInt2, paramInt2 + 1);
        }
      }
      else
      {
        AppMethodBeat.o(79454);
        break;
        paramInt2++;
        paramInt1++;
      }
  }

  public static CharSequence a(CharSequence paramCharSequence, Time paramTime)
  {
    AppMethodBeat.i(79453);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence);
    int i = paramCharSequence.length();
    int j = 0;
    int k;
    int m;
    if (j < i)
    {
      k = 1;
      m = localSpannableStringBuilder.charAt(j);
      if (m == 39)
      {
        k = a(localSpannableStringBuilder, j, i);
        i = localSpannableStringBuilder.length();
      }
    }
    while (true)
    {
      j = k + j;
      break;
      while ((j + k < i) && (localSpannableStringBuilder.charAt(j + k) == m))
        k++;
      switch (m)
      {
      default:
        paramCharSequence = null;
      case 97:
      case 65:
      case 100:
      case 69:
      case 104:
      case 107:
      case 109:
      case 76:
      case 77:
      case 115:
      case 122:
      case 121:
      }
      while (true)
        if (paramCharSequence != null)
        {
          localSpannableStringBuilder.replace(j, j + k, paramCharSequence);
          k = paramCharSequence.length();
          i = localSpannableStringBuilder.length();
          break;
          if (paramTime.hour < 12);
          for (m = 0; ; m = 1)
          {
            paramCharSequence = DateUtils.getAMPMString(m);
            break;
          }
          if (paramTime.hour < 12);
          for (m = 0; ; m = 1)
          {
            paramCharSequence = DateUtils.getAMPMString(m);
            break;
          }
          paramCharSequence = gL(paramTime.monthDay, k);
          continue;
          int n = paramTime.weekDay;
          if (k < 4);
          for (m = 20; ; m = 10)
          {
            paramCharSequence = DateUtils.getDayOfWeekString(n + 1, m);
            break;
          }
          n = paramTime.hour;
          m = n;
          if (n == 0)
            m = 12;
          n = m;
          if (m > 12)
            n = m - 12;
          paramCharSequence = String.valueOf(n);
          continue;
          paramCharSequence = gL(paramTime.hour, k);
          continue;
          paramCharSequence = gL(paramTime.minute, k);
          continue;
          m = paramTime.month;
          if (k >= 4)
          {
            paramCharSequence = DateUtils.getMonthString(m, 10);
          }
          else if (k == 3)
          {
            paramCharSequence = DateUtils.getMonthString(m, 20);
          }
          else
          {
            paramCharSequence = gL(m + 1, k);
            continue;
            paramCharSequence = gL(paramTime.second, k);
            continue;
            paramCharSequence = TimeZone.getDefault();
            paramCharSequence.inDaylightTime(new Date(paramTime.toMillis(false)));
            if (k < 2)
            {
              long l = (paramCharSequence.getRawOffset() + paramTime.gmtoff) / 1000L;
              paramCharSequence = new StringBuilder();
              if (l < 0L)
              {
                paramCharSequence.insert(0, "-");
                l = -l;
              }
              while (true)
              {
                m = (int)(l / 3600L);
                n = (int)(l % 3600L / 60L);
                paramCharSequence.append(gL(m, 2));
                paramCharSequence.append(gL(n, 2));
                paramCharSequence = paramCharSequence.toString();
                break;
                paramCharSequence.insert(0, "+");
              }
            }
            if (paramTime.isDst != 0);
            for (boolean bool = true; ; bool = false)
            {
              paramCharSequence = paramCharSequence.getDisplayName(bool, 0);
              break;
            }
            m = paramTime.year;
            if (k <= 2)
            {
              paramCharSequence = gL(m % 100, 2);
            }
            else
            {
              paramCharSequence = String.format(Locale.getDefault(), "%d", new Object[] { Integer.valueOf(m) });
              continue;
              paramCharSequence = localSpannableStringBuilder.toString();
              AppMethodBeat.o(79453);
              return paramCharSequence;
            }
          }
        }
    }
  }

  private static String gL(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79455);
    String str = String.format(Locale.getDefault(), "%0" + paramInt2 + "d", new Object[] { Integer.valueOf(paramInt1) });
    AppMethodBeat.o(79455);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.g
 * JD-Core Version:    0.6.2
 */