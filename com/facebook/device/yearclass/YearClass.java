package com.facebook.device.yearclass;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;

public class YearClass
{
  public static final int CLASS_2008 = 2008;
  public static final int CLASS_2009 = 2009;
  public static final int CLASS_2010 = 2010;
  public static final int CLASS_2011 = 2011;
  public static final int CLASS_2012 = 2012;
  public static final int CLASS_2013 = 2013;
  public static final int CLASS_2014 = 2014;
  public static final int CLASS_2015 = 2015;
  public static final int CLASS_2016 = 2016;
  public static final int CLASS_UNKNOWN = -1;
  private static final long MB = 1048576L;
  private static final int MHZ_IN_KHZ = 1000;
  private static volatile Integer mYearCategory;

  private static int categorizeByYear2014Method(Context paramContext)
  {
    AppMethodBeat.i(114638);
    ArrayList localArrayList = new ArrayList();
    conditionallyAdd(localArrayList, getNumCoresYear());
    conditionallyAdd(localArrayList, getClockSpeedYear());
    conditionallyAdd(localArrayList, getRamYear(paramContext));
    int i;
    if (localArrayList.isEmpty())
    {
      i = -1;
      AppMethodBeat.o(114638);
    }
    while (true)
    {
      return i;
      Collections.sort(localArrayList);
      if ((localArrayList.size() & 0x1) == 1)
      {
        i = ((Integer)localArrayList.get(localArrayList.size() / 2)).intValue();
        AppMethodBeat.o(114638);
      }
      else
      {
        i = localArrayList.size() / 2 - 1;
        int j = ((Integer)localArrayList.get(i)).intValue();
        i = (((Integer)localArrayList.get(i + 1)).intValue() - ((Integer)localArrayList.get(i)).intValue()) / 2 + j;
        AppMethodBeat.o(114638);
      }
    }
  }

  private static int categorizeByYear2016Method(Context paramContext)
  {
    int i = 2012;
    AppMethodBeat.i(114637);
    long l = DeviceInfo.getTotalMemory(paramContext);
    if (l == -1L)
    {
      i = categorizeByYear2014Method(paramContext);
      AppMethodBeat.o(114637);
    }
    while (true)
    {
      return i;
      if (l <= 805306368L)
      {
        if (DeviceInfo.getNumberOfCPUCores() <= 1)
        {
          i = 2009;
          AppMethodBeat.o(114637);
        }
        else
        {
          i = 2010;
          AppMethodBeat.o(114637);
        }
      }
      else if (l <= 1073741824L)
      {
        if (DeviceInfo.getCPUMaxFreqKHz() < 1300000)
        {
          i = 2011;
          AppMethodBeat.o(114637);
        }
        else
        {
          AppMethodBeat.o(114637);
        }
      }
      else if (l <= 1610612736L)
      {
        if (DeviceInfo.getCPUMaxFreqKHz() < 1800000)
        {
          AppMethodBeat.o(114637);
        }
        else
        {
          AppMethodBeat.o(114637);
          i = 2013;
        }
      }
      else if (l <= 2147483648L)
      {
        AppMethodBeat.o(114637);
        i = 2013;
      }
      else if (l <= 3221225472L)
      {
        i = 2014;
        AppMethodBeat.o(114637);
      }
      else if (l <= 5368709120L)
      {
        i = 2015;
        AppMethodBeat.o(114637);
      }
      else
      {
        i = 2016;
        AppMethodBeat.o(114637);
      }
    }
  }

  private static void conditionallyAdd(ArrayList<Integer> paramArrayList, int paramInt)
  {
    AppMethodBeat.i(114636);
    if (paramInt != -1)
      paramArrayList.add(Integer.valueOf(paramInt));
    AppMethodBeat.o(114636);
  }

  public static int get(Context paramContext)
  {
    AppMethodBeat.i(114635);
    if (mYearCategory == null);
    try
    {
      if (mYearCategory == null)
        mYearCategory = Integer.valueOf(categorizeByYear2016Method(paramContext));
      int i = mYearCategory.intValue();
      AppMethodBeat.o(114635);
      return i;
    }
    finally
    {
      AppMethodBeat.o(114635);
    }
    throw paramContext;
  }

  private static int getClockSpeedYear()
  {
    AppMethodBeat.i(114640);
    long l = DeviceInfo.getCPUMaxFreqKHz();
    int i;
    if (l == -1L)
    {
      i = -1;
      AppMethodBeat.o(114640);
    }
    while (true)
    {
      return i;
      if (l <= 528000L)
      {
        i = 2008;
        AppMethodBeat.o(114640);
      }
      else if (l <= 620000L)
      {
        i = 2009;
        AppMethodBeat.o(114640);
      }
      else if (l <= 1020000L)
      {
        i = 2010;
        AppMethodBeat.o(114640);
      }
      else if (l <= 1220000L)
      {
        i = 2011;
        AppMethodBeat.o(114640);
      }
      else if (l <= 1520000L)
      {
        i = 2012;
        AppMethodBeat.o(114640);
      }
      else if (l <= 2020000L)
      {
        i = 2013;
        AppMethodBeat.o(114640);
      }
      else
      {
        i = 2014;
        AppMethodBeat.o(114640);
      }
    }
  }

  private static int getNumCoresYear()
  {
    AppMethodBeat.i(114639);
    int i = DeviceInfo.getNumberOfCPUCores();
    if (i <= 0)
    {
      i = -1;
      AppMethodBeat.o(114639);
    }
    while (true)
    {
      return i;
      if (i == 1)
      {
        i = 2008;
        AppMethodBeat.o(114639);
      }
      else if (i <= 3)
      {
        i = 2011;
        AppMethodBeat.o(114639);
      }
      else
      {
        i = 2012;
        AppMethodBeat.o(114639);
      }
    }
  }

  private static int getRamYear(Context paramContext)
  {
    AppMethodBeat.i(114641);
    long l = DeviceInfo.getTotalMemory(paramContext);
    int i;
    if (l <= 0L)
    {
      i = -1;
      AppMethodBeat.o(114641);
    }
    while (true)
    {
      return i;
      if (l <= 201326592L)
      {
        i = 2008;
        AppMethodBeat.o(114641);
      }
      else if (l <= 304087040L)
      {
        i = 2009;
        AppMethodBeat.o(114641);
      }
      else if (l <= 536870912L)
      {
        i = 2010;
        AppMethodBeat.o(114641);
      }
      else if (l <= 1073741824L)
      {
        i = 2011;
        AppMethodBeat.o(114641);
      }
      else if (l <= 1610612736L)
      {
        i = 2012;
        AppMethodBeat.o(114641);
      }
      else if (l <= 2147483648L)
      {
        i = 2013;
        AppMethodBeat.o(114641);
      }
      else
      {
        i = 2014;
        AppMethodBeat.o(114641);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.device.yearclass.YearClass
 * JD-Core Version:    0.6.2
 */