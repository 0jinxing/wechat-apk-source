package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bbe extends com.tencent.mm.bt.a
{
  public int jCt;
  public String ncM;
  public int pcX;
  public bts vEC;
  public String vEG;
  public int wFW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60044);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(60044);
        throw paramArrayOfObject;
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(1, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      if (this.ncM != null)
        paramArrayOfObject.e(2, this.ncM);
      paramArrayOfObject.iz(3, this.jCt);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(5, this.wFW);
      if (this.vEG != null)
        paramArrayOfObject.e(6, this.vEG);
      AppMethodBeat.o(60044);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEC == null)
        break label639;
    label639: for (paramInt = e.a.a.a.ix(1, this.vEC.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncM);
      i = i + e.a.a.b.b.a.bs(3, this.jCt) + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(5, this.wFW);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vEG);
      AppMethodBeat.o(60044);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(60044);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60044);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bbe localbbe = (bbe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60044);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbe.vEC = ((bts)localObject1);
          }
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        case 2:
          localbbe.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        case 3:
          localbbe.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        case 4:
          localbbe.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        case 5:
          localbbe.wFW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        case 6:
          localbbe.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60044);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60044);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbe
 * JD-Core Version:    0.6.2
 */