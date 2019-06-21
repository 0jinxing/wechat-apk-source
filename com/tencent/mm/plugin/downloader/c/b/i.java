package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class i extends com.tencent.mm.bt.a
{
  public String egm;
  public long kKP;
  public String kKT;
  public String kKW;
  public l kLu;
  public String kLv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35535);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.egm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: download_url");
        AppMethodBeat.o(35535);
        throw paramArrayOfObject;
      }
      if (this.egm != null)
        paramArrayOfObject.e(1, this.egm);
      paramArrayOfObject.ai(2, this.kKP);
      if (this.kLu != null)
      {
        paramArrayOfObject.iy(3, this.kLu.computeSize());
        this.kLu.writeFields(paramArrayOfObject);
      }
      if (this.kLv != null)
        paramArrayOfObject.e(4, this.kLv);
      if (this.kKW != null)
        paramArrayOfObject.e(5, this.kKW);
      if (this.kKT != null)
        paramArrayOfObject.e(6, this.kKT);
      AppMethodBeat.o(35535);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.egm == null)
        break label674;
    label674: for (paramInt = e.a.a.b.b.a.f(1, this.egm) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.kKP);
      i = paramInt;
      if (this.kLu != null)
        i = paramInt + e.a.a.a.ix(3, this.kLu.computeSize());
      paramInt = i;
      if (this.kLv != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kLv);
      i = paramInt;
      if (this.kKW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kKW);
      paramInt = i;
      if (this.kKT != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.kKT);
      AppMethodBeat.o(35535);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.egm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: download_url");
          AppMethodBeat.o(35535);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35535);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35535);
          break;
        case 1:
          locali.egm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        case 2:
          locali.kKP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new l();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.kLu = paramArrayOfObject;
          }
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        case 4:
          locali.kLv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        case 5:
          locali.kKW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        case 6:
          locali.kKT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35535);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35535);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.i
 * JD-Core Version:    0.6.2
 */