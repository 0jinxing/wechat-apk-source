package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class CursorJoiner
  implements Iterable<CursorJoiner.Result>, Iterator<CursorJoiner.Result>
{
  private int[] mColumnsLeft;
  private int[] mColumnsRight;
  private CursorJoiner.Result mCompareResult;
  private boolean mCompareResultIsValid;
  private Cursor mCursorLeft;
  private Cursor mCursorRight;
  private String[] mValues;

  public CursorJoiner(Cursor paramCursor1, String[] paramArrayOfString1, Cursor paramCursor2, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(11994);
    if (paramArrayOfString1.length != paramArrayOfString2.length)
    {
      paramCursor1 = new IllegalArgumentException("you must have the same number of columns on the left and right, " + paramArrayOfString1.length + " != " + paramArrayOfString2.length);
      AppMethodBeat.o(11994);
      throw paramCursor1;
    }
    this.mCursorLeft = paramCursor1;
    this.mCursorRight = paramCursor2;
    this.mCursorLeft.moveToFirst();
    this.mCursorRight.moveToFirst();
    this.mCompareResultIsValid = false;
    this.mColumnsLeft = buildColumnIndiciesArray(paramCursor1, paramArrayOfString1);
    this.mColumnsRight = buildColumnIndiciesArray(paramCursor2, paramArrayOfString2);
    this.mValues = new String[this.mColumnsLeft.length * 2];
    AppMethodBeat.o(11994);
  }

  private int[] buildColumnIndiciesArray(Cursor paramCursor, String[] paramArrayOfString)
  {
    AppMethodBeat.i(11995);
    int[] arrayOfInt = new int[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
      arrayOfInt[i] = paramCursor.getColumnIndexOrThrow(paramArrayOfString[i]);
    AppMethodBeat.o(11995);
    return arrayOfInt;
  }

  private static int compareStrings(String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(12001);
    if (paramArrayOfString.length % 2 != 0)
    {
      paramArrayOfString = new IllegalArgumentException("you must specify an even number of values");
      AppMethodBeat.o(12001);
      throw paramArrayOfString;
    }
    int j = 0;
    if (j < paramArrayOfString.length)
      if (paramArrayOfString[j] == null)
      {
        if (paramArrayOfString[(j + 1)] == null)
          break label126;
        AppMethodBeat.o(12001);
        j = -1;
      }
    while (true)
    {
      return j;
      if (paramArrayOfString[(j + 1)] == null)
      {
        AppMethodBeat.o(12001);
        j = 1;
      }
      else
      {
        int k = paramArrayOfString[j].compareTo(paramArrayOfString[(j + 1)]);
        if (k != 0)
        {
          if (k < 0)
          {
            AppMethodBeat.o(12001);
            j = -1;
          }
          else
          {
            AppMethodBeat.o(12001);
            j = 1;
          }
        }
        else
        {
          label126: j += 2;
          break;
          AppMethodBeat.o(12001);
          j = i;
        }
      }
    }
  }

  private void incrementCursors()
  {
    AppMethodBeat.i(12000);
    if (this.mCompareResultIsValid)
      switch (1.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()])
      {
      default:
      case 2:
      case 3:
      case 1:
      }
    while (true)
    {
      this.mCompareResultIsValid = false;
      AppMethodBeat.o(12000);
      return;
      this.mCursorLeft.moveToNext();
      continue;
      this.mCursorRight.moveToNext();
      continue;
      this.mCursorLeft.moveToNext();
      this.mCursorRight.moveToNext();
    }
  }

  private static void populateValues(String[] paramArrayOfString, Cursor paramCursor, int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(11999);
    for (int i = 0; i < paramArrayOfInt.length; i++)
      paramArrayOfString[(i * 2 + paramInt)] = paramCursor.getString(paramArrayOfInt[i]);
    AppMethodBeat.o(11999);
  }

  public final boolean hasNext()
  {
    boolean bool = false;
    AppMethodBeat.i(11996);
    if (this.mCompareResultIsValid)
      switch (1.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()])
      {
      default:
        IllegalStateException localIllegalStateException = new IllegalStateException("bad value for mCompareResult, " + this.mCompareResult);
        AppMethodBeat.o(11996);
        throw localIllegalStateException;
      case 1:
        if ((!this.mCursorLeft.isLast()) || (!this.mCursorRight.isLast()))
        {
          AppMethodBeat.o(11996);
          bool = true;
        }
        break;
      case 2:
      case 3:
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11996);
      continue;
      if ((!this.mCursorLeft.isLast()) || (!this.mCursorRight.isAfterLast()))
      {
        AppMethodBeat.o(11996);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(11996);
        continue;
        if ((!this.mCursorLeft.isAfterLast()) || (!this.mCursorRight.isLast()))
        {
          AppMethodBeat.o(11996);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(11996);
          continue;
          if ((!this.mCursorLeft.isAfterLast()) || (!this.mCursorRight.isAfterLast()))
          {
            AppMethodBeat.o(11996);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(11996);
          }
        }
      }
    }
  }

  public final Iterator<CursorJoiner.Result> iterator()
  {
    return this;
  }

  public final CursorJoiner.Result next()
  {
    AppMethodBeat.i(11997);
    Object localObject;
    if (!hasNext())
    {
      localObject = new IllegalStateException("you must only call next() when hasNext() is true");
      AppMethodBeat.o(11997);
      throw ((Throwable)localObject);
    }
    incrementCursors();
    int i;
    int j;
    if (!this.mCursorLeft.isAfterLast())
    {
      i = 1;
      if (this.mCursorRight.isAfterLast())
        break label159;
      j = 1;
      label63: if ((i == 0) || (j == 0))
        break label194;
      populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
      populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
      switch (compareStrings(this.mValues))
      {
      default:
      case -1:
      case 0:
      case 1:
      }
    }
    while (true)
    {
      this.mCompareResultIsValid = true;
      localObject = this.mCompareResult;
      AppMethodBeat.o(11997);
      return localObject;
      i = 0;
      break;
      label159: j = 0;
      break label63;
      this.mCompareResult = CursorJoiner.Result.LEFT;
      continue;
      this.mCompareResult = CursorJoiner.Result.BOTH;
      continue;
      this.mCompareResult = CursorJoiner.Result.RIGHT;
      continue;
      label194: if (i != 0)
        this.mCompareResult = CursorJoiner.Result.LEFT;
      else
        this.mCompareResult = CursorJoiner.Result.RIGHT;
    }
  }

  public final void remove()
  {
    AppMethodBeat.i(11998);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("not implemented");
    AppMethodBeat.o(11998);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CursorJoiner
 * JD-Core Version:    0.6.2
 */