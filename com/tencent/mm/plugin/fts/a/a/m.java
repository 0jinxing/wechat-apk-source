package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class m extends l
{
  private void a(Pattern paramPattern)
  {
    AppMethodBeat.i(114278);
    this.mEG = paramPattern.split(this.content);
    this.mEH = new int[this.mEG.length];
    int i = 0;
    int k;
    for (int j = 0; i < this.mEH.length; j = k + 1 + j)
    {
      this.mEH[i] = j;
      k = this.mEG[i].length();
      i++;
    }
    AppMethodBeat.o(114278);
  }

  private void bAp()
  {
    AppMethodBeat.i(114280);
    switch (this.mDw)
    {
    default:
      AppMethodBeat.o(114280);
      return;
    case 38:
    }
    ArrayList localArrayList = new ArrayList();
    a(c.a.mCA);
    String[] arrayOfString = c.a.mCz.split(this.mED);
    byte[] arrayOfByte = this.content.getBytes();
    int i = 0;
    label71: int j;
    int k;
    int n;
    Object localObject;
    String str;
    if (i < arrayOfString.length)
    {
      j = Integer.valueOf(arrayOfString[i]).intValue();
      k = new String(arrayOfByte, 0, Integer.valueOf(arrayOfString[(i + 1)]).intValue()).length();
      m = Arrays.binarySearch(this.mEH, k);
      n = m;
      if (m < 0)
        n = -m - 2;
      localObject = this.mEG[n];
      str = null;
      localObject = c.a.mCB.split((CharSequence)localObject);
      m = k - this.mEH[n];
      k = 0;
      label180: if (k >= localObject.length)
        break label278;
      m = m - localObject[k].length() - 1;
      if (m < 0)
        str = localObject[k];
    }
    label278: for (int m = com.tencent.mm.plugin.fts.a.c.mCs[k]; ; m = -1)
    {
      if (m > 0)
        localArrayList.add(new f(n, j, m, str, localObject[(localObject.length - 1)]));
      i += 2;
      break label71;
      k++;
      break label180;
      this.mEI = localArrayList;
      break;
    }
  }

  private void bAq()
  {
    AppMethodBeat.i(114281);
    switch (this.mDw)
    {
    default:
    case 11:
    case 51:
    case 2:
    case 3:
    case 6:
    case 7:
    }
    try
    {
      int i = Integer.valueOf(c.a.mCz.split(this.mED)[1]).intValue();
      Object localObject = new java/lang/String;
      ((String)localObject).<init>(this.content.getBytes(), 0, i);
      this.mEE = ((String)localObject).length();
      this.mEF = this.content;
      AppMethodBeat.o(114281);
      while (true)
      {
        return;
        this.mEE = 2147483647;
        this.mEF = "";
        AppMethodBeat.o(114281);
        continue;
        try
        {
          localObject = c.a.mCz.split(this.mED);
          a(c.a.mCD);
          i = Integer.valueOf(localObject[1]).intValue();
          localObject = new java/lang/String;
          ((String)localObject).<init>(this.content.getBytes(), 0, i);
          i = ((String)localObject).length();
          this.mEE = Arrays.binarySearch(this.mEH, i);
          if (this.mEE < 0)
            this.mEE = (-this.mEE - 2);
          this.mEF = this.mEG[this.mEE];
          AppMethodBeat.o(114281);
        }
        catch (Exception localException1)
        {
          this.mEE = 2147483647;
          this.mEF = "";
          AppMethodBeat.o(114281);
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        this.mEE = 2147483647;
        this.mEF = "";
        AppMethodBeat.o(114281);
      }
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(114282);
    if (paramg.mEa.length > 1)
      this.mEK = 1;
    while (this.type == 131075)
    {
      if (System.currentTimeMillis() - this.timestamp >= 1209600000L)
        break label387;
      this.mDW += 50;
      String str = r.Yz();
      if (this.mDw == 38)
      {
        HashSet localHashSet = new HashSet();
        if (this.mEI != null)
        {
          Iterator localIterator = this.mEI.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              f localf = (f)localIterator.next();
              if (!str.equals(localf.dFl))
              {
                localHashSet.add(Integer.valueOf(localf.mDS));
                continue;
                this.mEK = 0;
                break;
              }
            }
        }
        if (localHashSet.size() >= this.mEB - 1L)
        {
          this.mDW += 20;
          this.mEL = true;
        }
        if ((paramg.mEa.length > 1) && (this.content.contains(paramg.mDY)))
        {
          this.mEK = 2;
          this.mDW += 5;
        }
        if (this.mEB <= 15L)
          this.mEN = 1;
      }
      if (((this.mDw == 5) || (this.mDw == 1)) && (this.content.contains(paramg.mDY)))
      {
        if (paramg.mEa.length > 1)
          this.mEK = 2;
        this.mDW += 10;
      }
      AppMethodBeat.o(114282);
    }
    while (true)
    {
      return;
      if (this.type == 131072)
      {
        if (System.currentTimeMillis() - this.timestamp < 1105032704L)
          this.mDW += 50;
        if (((this.mDw == 5) || (this.mDw == 1)) && (this.content.contains(paramg.mDY)))
        {
          if (paramg.mEa.length > 1)
            this.mEK = 2;
          this.mDW += 10;
        }
      }
      label387: AppMethodBeat.o(114282);
    }
  }

  public final void bAo()
  {
    AppMethodBeat.i(114279);
    if (bo.isNullOrNil(this.mED))
    {
      AppMethodBeat.o(114279);
      return;
    }
    switch (this.type)
    {
    default:
    case 131072:
    case 131073:
    case 131074:
    case 131076:
    case 131081:
    case 262144:
    case 327680:
    case 131075:
    }
    while (true)
    {
      AppMethodBeat.o(114279);
      break;
      bAq();
      AppMethodBeat.o(114279);
      break;
      bAp();
    }
  }

  public final m i(Cursor paramCursor)
  {
    AppMethodBeat.i(114275);
    this.mEz = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.mDw = paramCursor.getInt(2);
    this.mEB = paramCursor.getLong(3);
    this.mDx = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    this.talker = paramCursor.getString(6);
    AppMethodBeat.o(114275);
    return this;
  }

  public final m j(Cursor paramCursor)
  {
    AppMethodBeat.i(114276);
    this.mEz = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.mDw = paramCursor.getInt(2);
    this.mEB = paramCursor.getLong(3);
    this.mDx = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    this.content = paramCursor.getString(6);
    this.mED = paramCursor.getString(7);
    this.mEJ = paramCursor.getLong(8);
    AppMethodBeat.o(114276);
    return this;
  }

  public final m k(Cursor paramCursor)
  {
    AppMethodBeat.i(114277);
    this.mEz = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.mDw = paramCursor.getInt(2);
    this.mEB = paramCursor.getLong(3);
    this.mDx = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    if (paramCursor.getColumnCount() >= 7)
      this.content = paramCursor.getString(6);
    if (paramCursor.getColumnCount() >= 8)
      this.mED = paramCursor.getString(7);
    AppMethodBeat.o(114277);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.m
 * JD-Core Version:    0.6.2
 */