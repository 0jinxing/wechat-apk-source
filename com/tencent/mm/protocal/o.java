package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
{
  public String host = "";
  public String nJq = "";
  private int port = 80;
  private int type = 0;

  public o()
  {
  }

  public o(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.type = paramInt1;
    this.nJq = paramString1;
    this.port = paramInt2;
    this.host = paramString2;
  }

  private static o akE(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(58844);
    String[] arrayOfString = paramString.split(",");
    if (arrayOfString.length < 4)
    {
      AppMethodBeat.o(58844);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new o();
      try
      {
        paramString.type = bo.getInt(arrayOfString[0], 0);
        paramString.nJq = bo.nullAsNil(arrayOfString[1]);
        paramString.port = bo.getInt(arrayOfString[2], 0);
        paramString.host = bo.nullAsNil(arrayOfString[3]);
        AppMethodBeat.o(58844);
      }
      catch (NumberFormatException paramString)
      {
        ab.e("MicroMsg.MMBuiltInIP", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58844);
        paramString = localObject;
      }
    }
  }

  public static List<o> akF(String paramString)
  {
    AppMethodBeat.i(58846);
    LinkedList localLinkedList = new LinkedList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(58846);
    while (true)
    {
      return localLinkedList;
      try
      {
        String[] arrayOfString = paramString.split("\\|");
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          o localo = akE(arrayOfString[j]);
          if (localo != null)
            localLinkedList.add(localo);
        }
      }
      catch (Exception localException)
      {
        ab.d("MicroMsg.MMBuiltInIP", "unserialize split failed str[%s]", new Object[] { paramString });
        ab.e("MicroMsg.MMBuiltInIP", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58846);
      }
    }
  }

  public static String ei(List<o> paramList)
  {
    AppMethodBeat.i(58845);
    Iterator localIterator = paramList.iterator();
    o localo;
    for (paramList = ""; localIterator.hasNext(); paramList = paramList + localo.toString() + "|")
      localo = (o)localIterator.next();
    AppMethodBeat.o(58845);
    return paramList;
  }

  public static a hN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58847);
    ab.d("MicroMsg.MMBuiltInIP", "parsing network control params:");
    ab.d("MicroMsg.MMBuiltInIP", "ports = ".concat(String.valueOf(paramString1)));
    ab.d("MicroMsg.MMBuiltInIP", "timeouts = ".concat(String.valueOf(paramString2)));
    int[] arrayOfInt = bo.ang(paramString1);
    paramString2 = bo.ang(paramString2);
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length >= 2);
    }
    else
    {
      paramString1 = new int[2];
      paramString1[0] = 0;
      paramString1[1] = 0;
      paramString1;
      ab.e("MicroMsg.MMBuiltInIP", "invalid timeouts");
    }
    paramString1 = new a(arrayOfInt, (int)(paramString1[0] * 1000L), (int)(paramString1[1] * 1000L));
    AppMethodBeat.o(58847);
    return paramString1;
  }

  public final String toString()
  {
    AppMethodBeat.i(58843);
    String str = this.type + "," + this.nJq + "," + this.port + "," + this.host;
    AppMethodBeat.o(58843);
    return str;
  }

  public static final class a
  {
    public final int[] vys = null;
    public final int[] vyt;
    public final int vyu;
    public final int vyv;

    public a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
    {
      this.vyt = paramArrayOfInt;
      this.vyu = paramInt1;
      this.vyv = paramInt2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.o
 * JD-Core Version:    0.6.2
 */