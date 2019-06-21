package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.platformtools.ab;
import e.a.a.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
{
  String ptn;
  private boolean pto;
  LinkedList<o> ptp;
  private boolean ptq;

  public a()
  {
    AppMethodBeat.i(67903);
    this.ptp = new LinkedList();
    AppMethodBeat.o(67903);
  }

  public static String Vd(String paramString)
  {
    AppMethodBeat.i(67908);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.d("MicroMsg.getAdjustFullSpell", "%s", new Object[] { "srcName is null or empty, adjust full spell = ~" });
      paramString = "~";
      AppMethodBeat.o(67908);
    }
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      for (int i = 0; ; i++)
      {
        if (i >= arrayOfChar.length)
          break label215;
        char c = arrayOfChar[i];
        if ((c >= '0') && (c <= '9'))
        {
          paramString = String.format("{%c%s", new Object[] { Character.valueOf(c), paramString });
          AppMethodBeat.o(67908);
          break;
        }
        if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
        {
          if (i == 0)
          {
            AppMethodBeat.o(67908);
            break;
          }
          paramString = String.format("%c%s", new Object[] { Character.valueOf(c), paramString });
          AppMethodBeat.o(67908);
          break;
        }
        if ((c == '{') && (i == 0) && (arrayOfChar.length > 1) && (arrayOfChar[(i + 1)] >= '0') && (arrayOfChar[(i + 1)] <= '9'))
        {
          AppMethodBeat.o(67908);
          break;
        }
      }
      label215: ab.d("MicroMsg.getAdjustFullSpell", "%s is not ok, return '~'", new Object[] { paramString });
      paramString = "~";
      AppMethodBeat.o(67908);
    }
  }

  private static boolean a(o paramo1, o paramo2)
  {
    boolean bool = true;
    AppMethodBeat.i(67906);
    if ((paramo1 == null) || (paramo2 == null))
    {
      AppMethodBeat.o(67906);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = b(paramo1).compareTo(b(paramo2));
      if (i == 0)
      {
        if (paramo1.nJq.compareTo(paramo2.nJq) <= 0)
        {
          AppMethodBeat.o(67906);
        }
        else
        {
          AppMethodBeat.o(67906);
          bool = false;
        }
      }
      else if (i < 0)
      {
        AppMethodBeat.o(67906);
      }
      else
      {
        AppMethodBeat.o(67906);
        bool = false;
      }
    }
  }

  public static String b(o paramo)
  {
    AppMethodBeat.i(67907);
    String str = paramo.puh;
    if ((str == null) || ("".equals(str)));
    for (str = Vd(g.vo(paramo.name.trim()).toLowerCase()); ; str = Vd(str))
    {
      paramo.puh = str;
      AppMethodBeat.o(67907);
      return str;
    }
  }

  private a ccn()
  {
    AppMethodBeat.i(67910);
    if (!this.pto)
    {
      b localb = new b("Not all required fields were included (false = not included in message),  syncInfo:" + this.pto);
      AppMethodBeat.o(67910);
      throw localb;
    }
    AppMethodBeat.o(67910);
    return this;
  }

  public final a Bo(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(67904);
    if ((paramInt < 0) || (paramInt >= this.ptp.size()))
      AppMethodBeat.o(67904);
    while (true)
    {
      return this;
      if (paramInt < 10)
        break;
      this.ptp.remove(paramInt);
      if (this.ptp.size() > 0)
        bool = true;
      this.ptq = bool;
      AppMethodBeat.o(67904);
    }
    this.ptp.remove(paramInt);
    Iterator localIterator = this.ptp.iterator();
    int i = -1;
    int j = -2147483648;
    int k = 0;
    while (true)
    {
      label96: if (localIterator.hasNext())
      {
        o localo = (o)localIterator.next();
        paramInt = k + 1;
        if (k < 10)
          break label234;
        if (j >= localo.pug)
          break label231;
        j = localo.pug;
        i = paramInt;
      }
      label231: 
      while (true)
      {
        while (true)
        {
          k = paramInt;
          break label96;
          if ((i == -1) || (i >= this.ptp.size()))
            break;
          try
          {
            a((o)this.ptp.remove(i));
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.AddrBook", localException, "size:%d, idx:%d", new Object[] { Integer.valueOf(this.ptp.size()), Integer.valueOf(i) });
          }
        }
        break;
      }
      label234: k = paramInt;
    }
  }

  public final a Vc(String paramString)
  {
    this.ptn = paramString;
    this.pto = true;
    return this;
  }

  public final a a(o paramo)
  {
    int i = 0;
    AppMethodBeat.i(67905);
    if (!this.ptq)
      this.ptq = true;
    Object localObject = this.ptp.iterator();
    int j = 0;
    o localo;
    if (((Iterator)localObject).hasNext())
    {
      localo = (o)((Iterator)localObject).next();
      if (j < 10)
        if (paramo.pug <= localo.pug)
          break label106;
    }
    else
    {
      label69: if (j < this.ptp.size())
        break label112;
      this.ptp.add(paramo);
    }
    while (true)
    {
      AppMethodBeat.o(67905);
      return this;
      if (a(paramo, localo))
        break label69;
      label106: j++;
      break;
      label112: this.ptp.add(j, paramo);
      if ((j < 10) && (this.ptp.size() > 10))
      {
        localo = (o)this.ptp.remove(10);
        paramo = this.ptp.iterator();
        for (j = i; paramo.hasNext(); j++)
        {
          localObject = (o)paramo.next();
          if ((j >= 10) && (a(localo, (o)localObject)))
            break;
        }
        if (j >= this.ptp.size())
          this.ptp.add(localo);
        else
          this.ptp.add(j, localo);
      }
    }
  }

  public final a be(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67914);
    paramArrayOfByte = new e.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    int i = getNextFieldNumber(paramArrayOfByte);
    if (i > 0)
    {
      switch (i)
      {
      default:
        i = 0;
      case 1:
      case 2:
      }
      while (true)
      {
        if (i == 0)
          paramArrayOfByte.ems();
        i = getNextFieldNumber(paramArrayOfByte);
        break;
        Vc(paramArrayOfByte.BTU.readString());
        i = 1;
        continue;
        Object localObject1 = paramArrayOfByte.Vh(2);
        for (i = 0; i < ((LinkedList)localObject1).size(); i++)
        {
          Object localObject2 = (byte[])((LinkedList)localObject1).get(i);
          localObject3 = new o();
          localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((o)localObject3).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject3, getNextFieldNumber((e.a.a.a.a)localObject2)));
          if (!this.ptq)
            this.ptq = true;
          this.ptp.add(localObject3);
        }
        Object localObject3 = new o[1];
        localObject1 = (o[])this.ptp.toArray((Object[])localObject3);
        Arrays.sort((Object[])localObject1, new a.1(this));
        if (10 <= localObject1.length)
          Arrays.sort((Object[])localObject1, 10, localObject1.length, new a.2(this));
        this.ptp.clear();
        int j = localObject1.length;
        for (i = 0; i < j; i++)
        {
          localObject3 = localObject1[i];
          this.ptp.add(localObject3);
        }
        i = 1;
      }
    }
    paramArrayOfByte = ccn();
    AppMethodBeat.o(67914);
    return paramArrayOfByte;
  }

  public final int computeSize()
  {
    AppMethodBeat.i(67911);
    int i = e.a.a.b.b.a.f(1, this.ptn);
    int j = e.a.a.a.c(2, 8, this.ptp);
    AppMethodBeat.o(67911);
    return i + 0 + (j + 0);
  }

  public final byte[] toByteArray()
  {
    AppMethodBeat.i(67912);
    ccn();
    byte[] arrayOfByte = super.toByteArray();
    AppMethodBeat.o(67912);
    return arrayOfByte;
  }

  public final String toString()
  {
    AppMethodBeat.i(67909);
    String str = "" + getClass().getName() + "(";
    str = str + "syncInfo = " + this.ptn + "   ";
    str = str + "addrs = " + this.ptp + "   ";
    str = str + ")";
    AppMethodBeat.o(67909);
    return str;
  }

  public final void writeFields(e.a.a.c.a parama)
  {
    AppMethodBeat.i(67913);
    parama.e(1, this.ptn);
    parama.e(2, 8, this.ptp);
    AppMethodBeat.o(67913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.a
 * JD-Core Version:    0.6.2
 */