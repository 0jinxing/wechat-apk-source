package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class ag$b
{
  ArrayList<String> rma;
  Map<String, Boolean> rmb;
  Map<String, Integer> rmc;

  ag$b(ag paramag)
  {
    AppMethodBeat.i(38488);
    this.rma = new ArrayList();
    this.rmb = new HashMap();
    this.rmc = new HashMap();
    AppMethodBeat.o(38488);
  }

  public final void S(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(38490);
    this.rmb.clear();
    if (paramArrayList == null)
    {
      this.rma = new ArrayList();
      AppMethodBeat.o(38490);
    }
    while (true)
    {
      return;
      this.rma = paramArrayList;
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        this.rmb.put(str, Boolean.FALSE);
      }
      AppMethodBeat.o(38490);
    }
  }

  public final b ZC(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(38492);
    try
    {
      paramString = paramString.split(";");
      int j = paramString.length;
      while (i < j)
      {
        String[] arrayOfString = paramString[i].split(",");
        this.rma.add(arrayOfString[0]);
        this.rmc.put(arrayOfString[0], Integer.valueOf(bo.getInt(arrayOfString[1], 0)));
        i++;
      }
    }
    catch (Exception paramString)
    {
      AppMethodBeat.o(38492);
    }
    return this;
  }

  public final b q(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(38489);
    this.rma.add(paramString);
    this.rmc.put(paramString, Integer.valueOf(paramInt));
    this.rmb.put(paramString, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(38489);
    return this;
  }

  public final String toString()
  {
    AppMethodBeat.i(38491);
    Iterator localIterator = this.rma.iterator();
    String str2;
    int i;
    for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + "," + i + ";")
    {
      str2 = (String)localIterator.next();
      i = 0;
      if (this.rmc != null)
        i = ((Integer)this.rmc.get(str2)).intValue();
    }
    AppMethodBeat.o(38491);
    return str1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.b
 * JD-Core Version:    0.6.2
 */