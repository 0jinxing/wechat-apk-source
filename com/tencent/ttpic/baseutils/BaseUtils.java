package com.tencent.ttpic.baseutils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public class BaseUtils
{
  public static boolean equals(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(49593);
    boolean bool;
    if ((paramCharSequence1 != null) && (paramCharSequence1.equals(paramCharSequence2)))
    {
      bool = true;
      AppMethodBeat.o(49593);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49593);
    }
  }

  public static boolean indexOutOfBounds(Collection paramCollection, int paramInt)
  {
    AppMethodBeat.i(49594);
    boolean bool;
    if ((paramCollection == null) || (paramInt < 0) || (paramInt >= paramCollection.size()))
    {
      bool = true;
      AppMethodBeat.o(49594);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49594);
    }
  }

  public static boolean isEmpty(Collection paramCollection)
  {
    AppMethodBeat.i(49591);
    boolean bool;
    if ((paramCollection == null) || (paramCollection.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(49591);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49591);
    }
  }

  public static int size(Collection paramCollection)
  {
    AppMethodBeat.i(49592);
    int i;
    if (paramCollection == null)
    {
      i = 0;
      AppMethodBeat.o(49592);
    }
    while (true)
    {
      return i;
      i = paramCollection.size();
      AppMethodBeat.o(49592);
    }
  }

  public static int size(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null);
    for (int i = 0; ; i = paramArrayOfObject.length)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.BaseUtils
 * JD-Core Version:    0.6.2
 */