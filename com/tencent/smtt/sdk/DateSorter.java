package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;

public class DateSorter
{
  public static int DAY_COUNT;
  private android.webkit.DateSorter a;
  private IX5DateSorter b;

  static
  {
    AppMethodBeat.i(63898);
    a();
    DAY_COUNT = 5;
    AppMethodBeat.o(63898);
  }

  public DateSorter(Context paramContext)
  {
    AppMethodBeat.i(63893);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      this.b = localbv.c().h(paramContext);
      AppMethodBeat.o(63893);
    }
    while (true)
    {
      return;
      this.a = new android.webkit.DateSorter(paramContext);
      AppMethodBeat.o(63893);
    }
  }

  private static boolean a()
  {
    AppMethodBeat.i(63897);
    boolean bool1 = false;
    bv localbv = bv.a();
    boolean bool2 = bool1;
    if (localbv != null)
    {
      bool2 = bool1;
      if (localbv.b())
        bool2 = true;
    }
    AppMethodBeat.o(63897);
    return bool2;
  }

  public long getBoundary(int paramInt)
  {
    AppMethodBeat.i(63896);
    bv localbv = bv.a();
    long l;
    if ((localbv != null) && (localbv.b()))
    {
      l = this.b.getBoundary(paramInt);
      AppMethodBeat.o(63896);
    }
    while (true)
    {
      return l;
      l = this.a.getBoundary(paramInt);
      AppMethodBeat.o(63896);
    }
  }

  public int getIndex(long paramLong)
  {
    AppMethodBeat.i(63894);
    bv localbv = bv.a();
    int i;
    if ((localbv != null) && (localbv.b()))
    {
      i = this.b.getIndex(paramLong);
      AppMethodBeat.o(63894);
    }
    while (true)
    {
      return i;
      i = this.a.getIndex(paramLong);
      AppMethodBeat.o(63894);
    }
  }

  public String getLabel(int paramInt)
  {
    AppMethodBeat.i(63895);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()))
    {
      localObject = this.b.getLabel(paramInt);
      AppMethodBeat.o(63895);
    }
    while (true)
    {
      return localObject;
      localObject = this.a.getLabel(paramInt);
      AppMethodBeat.o(63895);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.DateSorter
 * JD-Core Version:    0.6.2
 */