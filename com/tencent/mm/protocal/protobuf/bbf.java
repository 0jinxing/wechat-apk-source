package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bbf extends btd
{
  public int Ret;
  public int jCt;
  public int pcX;
  public int ptD;
  public long ptF;
  public bts vEC;
  public int vHX;
  public int wFW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60045);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(60045);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(2, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.ptD);
      paramArrayOfObject.iz(4, this.wFW);
      paramArrayOfObject.iz(5, this.pcX);
      paramArrayOfObject.iz(6, this.vHX);
      paramArrayOfObject.iz(7, this.jCt);
      paramArrayOfObject.ai(8, this.ptF);
      AppMethodBeat.o(60045);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.vEC != null)
          paramInt = i + e.a.a.a.ix(2, this.vEC.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.ptD) + e.a.a.b.b.a.bs(4, this.wFW) + e.a.a.b.b.a.bs(5, this.pcX) + e.a.a.b.b.a.bs(6, this.vHX) + e.a.a.b.b.a.bs(7, this.jCt) + e.a.a.b.b.a.o(8, this.ptF);
        AppMethodBeat.o(60045);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(60045);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60045);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bbf localbbf = (bbf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60045);
          break;
        case 1:
          localbbf.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbf.vEC = ((bts)localObject1);
          }
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 3:
          localbbf.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 4:
          localbbf.wFW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 5:
          localbbf.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 6:
          localbbf.vHX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 7:
          localbbf.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        case 8:
          localbbf.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(60045);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60045);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbf
 * JD-Core Version:    0.6.2
 */