package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class q extends com.tencent.mm.bt.a
{
  public String nac;
  public String nad;
  public String nae;
  public ds naf;
  public int nag;
  public int nah;
  public String nai;
  public int naj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111556);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nac == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadURL");
        AppMethodBeat.o(111556);
        throw paramArrayOfObject;
      }
      if (this.nac != null)
        paramArrayOfObject.e(1, this.nac);
      if (this.nad != null)
        paramArrayOfObject.e(2, this.nad);
      if (this.nae != null)
        paramArrayOfObject.e(4, this.nae);
      if (this.naf != null)
      {
        paramArrayOfObject.iy(5, this.naf.computeSize());
        this.naf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.nag);
      paramArrayOfObject.iz(7, this.nah);
      if (this.nai != null)
        paramArrayOfObject.e(8, this.nai);
      paramArrayOfObject.iz(9, this.naj);
      AppMethodBeat.o(111556);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nac == null)
        break label776;
    label776: for (paramInt = e.a.a.b.b.a.f(1, this.nac) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nad != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nad);
      paramInt = i;
      if (this.nae != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nae);
      i = paramInt;
      if (this.naf != null)
        i = paramInt + e.a.a.a.ix(5, this.naf.computeSize());
      i = i + e.a.a.b.b.a.bs(6, this.nag) + e.a.a.b.b.a.bs(7, this.nah);
      paramInt = i;
      if (this.nai != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.nai);
      paramInt += e.a.a.b.b.a.bs(9, this.naj);
      AppMethodBeat.o(111556);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.nac == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadURL");
          AppMethodBeat.o(111556);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111556);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        q localq = (q)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 3:
        default:
          AppMethodBeat.o(111556);
          paramInt = -1;
          break;
        case 1:
          localq.nac = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 2:
          localq.nad = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 4:
          localq.nae = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ds();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localq.naf = paramArrayOfObject;
          }
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 6:
          localq.nag = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 7:
          localq.nah = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 8:
          localq.nai = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        case 9:
          localq.naj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111556);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111556);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.q
 * JD-Core Version:    0.6.2
 */