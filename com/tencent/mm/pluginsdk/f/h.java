package com.tencent.mm.pluginsdk.f;

import android.content.Context;
import android.text.format.Time;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class h
{
  private static boolean vdA = false;
  private static long vdz;

  public static String aJ(String paramString, long paramLong)
  {
    AppMethodBeat.i(79458);
    paramString = android.text.format.DateFormat.format(paramString, paramLong).toString();
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(79458);
    }
    while (true)
    {
      return paramString;
      String str = paramString.trim();
      paramString = str;
      if (str.startsWith("0"))
        paramString = str.substring(1);
      AppMethodBeat.o(79458);
    }
  }

  public static String ae(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(79457);
    long l1 = 1000L * paramInt;
    Object localObject1 = new GregorianCalendar();
    if (l1 < 3600000L)
    {
      paramContext = "";
      AppMethodBeat.o(79457);
    }
    while (true)
    {
      return paramContext;
      Object localObject2 = new GregorianCalendar(((GregorianCalendar)localObject1).get(1), ((GregorianCalendar)localObject1).get(2), ((GregorianCalendar)localObject1).get(5));
      long l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
      if ((l2 >= 0L) && (l2 < 86400000L))
      {
        paramContext = r(paramContext, l2) + ";" + aJ(paramContext.getString(2131299963), l1);
        AppMethodBeat.o(79457);
      }
      else
      {
        l2 = l1 - (((GregorianCalendar)localObject2).getTimeInMillis() - 86400000L);
        if ((l2 >= 0L) && (l2 < 86400000L))
        {
          paramContext = paramContext.getString(2131299986) + " " + r(paramContext, l2) + ";" + aJ(paramContext.getString(2131299963), l1);
          AppMethodBeat.o(79457);
        }
        else
        {
          l2 = l1 - (((GregorianCalendar)localObject2).getTimeInMillis() - 172800000L);
          if ((l2 >= 0L) && (l2 < 86400000L))
          {
            paramContext = paramContext.getString(2131299969) + " " + r(paramContext, l2) + ";" + aJ(paramContext.getString(2131299963), l1);
            AppMethodBeat.o(79457);
          }
          else
          {
            l2 = l1 - (((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L);
            if ((l2 >= 0L) && (l2 < 86400000L))
            {
              paramContext = paramContext.getString(2131299978) + " " + r(paramContext, l2) + ";" + aJ(paramContext.getString(2131299963), l1);
              AppMethodBeat.o(79457);
            }
            else
            {
              l2 = l1 - (((GregorianCalendar)localObject2).getTimeInMillis() + 172800000L);
              if ((l2 >= 0L) && (l2 < 86400000L))
              {
                paramContext = paramContext.getString(2131299968) + " " + r(paramContext, l2) + ";" + aJ(paramContext.getString(2131299963), l1);
                AppMethodBeat.o(79457);
              }
              else
              {
                localObject2 = new GregorianCalendar();
                ((GregorianCalendar)localObject2).setTimeInMillis(l1);
                paramInt = ((GregorianCalendar)localObject2).get(11);
                int i;
                if ((((GregorianCalendar)localObject1).get(1) == ((GregorianCalendar)localObject2).get(1)) && (((GregorianCalendar)localObject1).get(3) == ((GregorianCalendar)localObject2).get(3)))
                {
                  i = ((GregorianCalendar)localObject2).get(7);
                  paramContext = af(paramContext, i) + " " + ag(paramContext, paramInt) + ";" + aJ(paramContext.getString(2131299963), l1);
                  AppMethodBeat.o(79457);
                }
                else
                {
                  if ((((GregorianCalendar)localObject1).get(1) == ((GregorianCalendar)localObject2).get(1)) && (((GregorianCalendar)localObject1).get(3) + 1 == ((GregorianCalendar)localObject2).get(3)))
                  {
                    i = ((GregorianCalendar)localObject2).get(7);
                    localObject2 = new StringBuilder();
                    switch (i)
                    {
                    default:
                      localObject1 = "";
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    }
                    while (true)
                    {
                      paramContext = (String)localObject1 + " " + ag(paramContext, paramInt) + ";" + aJ(paramContext.getString(2131299963), l1);
                      AppMethodBeat.o(79457);
                      break;
                      localObject1 = paramContext.getString(2131299973);
                      continue;
                      localObject1 = paramContext.getString(2131299971);
                      continue;
                      localObject1 = paramContext.getString(2131299975);
                      continue;
                      localObject1 = paramContext.getString(2131299976);
                      continue;
                      localObject1 = paramContext.getString(2131299974);
                      continue;
                      localObject1 = paramContext.getString(2131299970);
                      continue;
                      localObject1 = paramContext.getString(2131299972);
                    }
                  }
                  if (((GregorianCalendar)localObject1).get(1) == ((GregorianCalendar)localObject2).get(1))
                  {
                    paramContext = android.text.format.DateFormat.format(paramContext.getString(2131299933), l1) + " " + ag(paramContext, paramInt) + ";" + aJ(paramContext.getString(2131299963), l1);
                    AppMethodBeat.o(79457);
                  }
                  else
                  {
                    paramContext = android.text.format.DateFormat.format(paramContext.getString(2131299952), l1) + " " + ag(paramContext, paramInt) + ";" + aJ(paramContext.getString(2131299963), l1);
                    AppMethodBeat.o(79457);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static String af(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(79459);
    switch (paramInt)
    {
    default:
      paramContext = "";
      AppMethodBeat.o(79459);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131299982);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299980);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299984);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299985);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299983);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299979);
      AppMethodBeat.o(79459);
      continue;
      paramContext = paramContext.getString(2131299981);
      AppMethodBeat.o(79459);
    }
  }

  private static CharSequence ag(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(79462);
    if (paramInt < 0)
    {
      paramContext = "";
      AppMethodBeat.o(79462);
    }
    while (true)
    {
      return paramContext;
      if (paramInt < 6L)
      {
        paramContext = paramContext.getString(2131299937);
        AppMethodBeat.o(79462);
      }
      else if (paramInt < 12L)
      {
        paramContext = paramContext.getString(2131299956);
        AppMethodBeat.o(79462);
      }
      else if (paramInt < 13L)
      {
        paramContext = paramContext.getString(2131299962);
        AppMethodBeat.o(79462);
      }
      else if (paramInt < 18L)
      {
        paramContext = paramContext.getString(2131299923);
        AppMethodBeat.o(79462);
      }
      else
      {
        paramContext = paramContext.getString(2131299944);
        AppMethodBeat.o(79462);
      }
    }
  }

  public static CharSequence c(Context paramContext, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(79465);
    Object localObject1;
    Object localObject2;
    if (!aa.doo())
    {
      localObject1 = aa.amw(aa.dor());
      localObject2 = new GregorianCalendar();
      if (paramLong < 3600000L)
      {
        paramContext = "";
        AppMethodBeat.o(79465);
      }
    }
    while (true)
    {
      return paramContext;
      GregorianCalendar localGregorianCalendar = new GregorianCalendar(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2), ((GregorianCalendar)localObject2).get(5));
      long l = paramLong - localGregorianCalendar.getTimeInMillis();
      if ((l > 0L) && (l <= 86400000L))
      {
        paramContext = java.text.DateFormat.getTimeInstance(3, (Locale)localObject1);
        paramContext = paramContext.format(Long.valueOf(paramLong));
        AppMethodBeat.o(79465);
      }
      else
      {
        l = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
        if ((l > 0L) && (l <= 86400000L))
        {
          if (paramBoolean)
          {
            paramContext = paramContext.getString(2131299986);
            AppMethodBeat.o(79465);
          }
          else
          {
            paramContext = paramContext.getString(2131299986) + " " + java.text.DateFormat.getTimeInstance(3, (Locale)localObject1).format(Long.valueOf(paramLong));
            AppMethodBeat.o(79465);
          }
        }
        else
        {
          paramContext = new GregorianCalendar();
          paramContext.setTimeInMillis(paramLong);
          if ((((GregorianCalendar)localObject2).get(1) == paramContext.get(1)) && (((GregorianCalendar)localObject2).get(3) == paramContext.get(3)))
          {
            paramContext = new SimpleDateFormat("E", (Locale)localObject1);
            paramContext = paramContext.format(Long.valueOf(paramLong));
            if (paramBoolean)
            {
              AppMethodBeat.o(79465);
            }
            else
            {
              paramContext = paramContext + " " + java.text.DateFormat.getTimeInstance(3, (Locale)localObject1).format(Long.valueOf(paramLong));
              AppMethodBeat.o(79465);
            }
          }
          else if (((GregorianCalendar)localObject2).get(1) == paramContext.get(1))
          {
            if (paramBoolean)
            {
              paramContext = java.text.DateFormat.getDateInstance(3, (Locale)localObject1).format(Long.valueOf(paramLong));
              AppMethodBeat.o(79465);
            }
            else
            {
              paramContext = java.text.DateFormat.getDateTimeInstance(3, 3, (Locale)localObject1).format(Long.valueOf(paramLong));
              AppMethodBeat.o(79465);
            }
          }
          else if (paramBoolean)
          {
            paramContext = java.text.DateFormat.getDateInstance(3, (Locale)localObject1).format(Long.valueOf(paramLong));
            AppMethodBeat.o(79465);
          }
          else
          {
            paramContext = java.text.DateFormat.getDateTimeInstance(3, 3, (Locale)localObject1).format(Long.valueOf(paramLong));
            AppMethodBeat.o(79465);
            continue;
            if (paramLong < 3600000L)
            {
              paramContext = "";
              AppMethodBeat.o(79465);
            }
            else
            {
              localObject2 = new Time();
              localObject1 = new Time();
              ((Time)localObject2).set(paramLong);
              ((Time)localObject1).setToNow();
              if ((((Time)localObject2).year == ((Time)localObject1).year) && (((Time)localObject2).yearDay == ((Time)localObject1).yearDay))
              {
                if (dhT())
                {
                  paramContext = g.a(paramContext.getString(2131299964), (Time)localObject2);
                  AppMethodBeat.o(79465);
                }
                else
                {
                  paramContext = ag(paramContext, ((Time)localObject2).hour) + g.a(paramContext.getString(2131299963), (Time)localObject2);
                  AppMethodBeat.o(79465);
                }
              }
              else if ((((Time)localObject2).year == ((Time)localObject1).year) && (((Time)localObject1).yearDay - ((Time)localObject2).yearDay == 1))
              {
                boolean bool = dhT();
                if (paramBoolean)
                {
                  paramContext = paramContext.getString(2131299986);
                  AppMethodBeat.o(79465);
                }
                else
                {
                  localObject1 = new StringBuilder().append(paramContext.getString(2131299986)).append(" ");
                  if (bool);
                  for (paramContext = g.a(paramContext.getString(2131299964), (Time)localObject2); ; paramContext = ag(paramContext, ((Time)localObject2).hour) + g.a(paramContext.getString(2131299963), (Time)localObject2))
                  {
                    paramContext = paramContext;
                    AppMethodBeat.o(79465);
                    break;
                  }
                }
              }
              else if ((((Time)localObject2).year == ((Time)localObject1).year) && (((Time)localObject2).getWeekNumber() == ((Time)localObject1).getWeekNumber()))
              {
                localObject1 = g.a("E ", (Time)localObject2);
                if (paramBoolean)
                {
                  AppMethodBeat.o(79465);
                  paramContext = (Context)localObject1;
                }
                else
                {
                  paramContext = (String)localObject1 + g.a(paramContext.getString(2131299965), (Time)localObject2);
                  AppMethodBeat.o(79465);
                }
              }
              else if (((Time)localObject2).year == ((Time)localObject1).year)
              {
                if (paramBoolean)
                {
                  paramContext = g.a(paramContext.getString(2131299933), (Time)localObject2);
                  AppMethodBeat.o(79465);
                }
                else
                {
                  paramContext = g.a(paramContext.getString(2131299935, new Object[] { r(paramContext, ((Time)localObject2).hour * 3600000L) }).toString(), (Time)localObject2);
                  AppMethodBeat.o(79465);
                }
              }
              else if (paramBoolean)
              {
                paramContext = g.a(paramContext.getString(2131299952), (Time)localObject2);
                AppMethodBeat.o(79465);
              }
              else
              {
                paramContext = g.a(paramContext.getString(2131299954, new Object[] { r(paramContext, ((Time)localObject2).hour * 3600000L) }).toString(), (Time)localObject2);
                AppMethodBeat.o(79465);
              }
            }
          }
        }
      }
    }
  }

  public static boolean dhT()
  {
    AppMethodBeat.i(79464);
    if (System.currentTimeMillis() - vdz > 30000L)
      vdA = android.text.format.DateFormat.is24HourFormat(ah.getContext());
    boolean bool = vdA;
    AppMethodBeat.o(79464);
    return bool;
  }

  public static String formatTime(String paramString, long paramLong)
  {
    AppMethodBeat.i(79456);
    paramString = new SimpleDateFormat(paramString).format(new Date(1000L * paramLong));
    AppMethodBeat.o(79456);
    return paramString;
  }

  public static CharSequence p(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(79460);
    paramContext = paramContext.getString(2131300011) + android.text.format.DateFormat.format(paramContext.getString(2131300010), paramLong);
    AppMethodBeat.o(79460);
    return paramContext;
  }

  public static CharSequence q(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(79461);
    paramContext = paramContext.getString(2131300012) + android.text.format.DateFormat.format(paramContext.getString(2131300010), paramLong);
    AppMethodBeat.o(79461);
    return paramContext;
  }

  public static CharSequence r(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(79463);
    if (paramLong < 0L)
    {
      paramContext = "";
      AppMethodBeat.o(79463);
    }
    while (true)
    {
      return paramContext;
      if (paramLong < 21600000L)
      {
        paramContext = paramContext.getString(2131299937);
        AppMethodBeat.o(79463);
      }
      else if (paramLong < 43200000L)
      {
        paramContext = paramContext.getString(2131299956);
        AppMethodBeat.o(79463);
      }
      else if (paramLong < 46800000L)
      {
        paramContext = paramContext.getString(2131299962);
        AppMethodBeat.o(79463);
      }
      else if (paramLong < 64800000L)
      {
        paramContext = paramContext.getString(2131299923);
        AppMethodBeat.o(79463);
      }
      else
      {
        paramContext = paramContext.getString(2131299944);
        AppMethodBeat.o(79463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.h
 * JD-Core Version:    0.6.2
 */