package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bxd extends bsr
{
  public int Scene;
  public String ncM;
  public int wXm;
  public axx wcn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80186);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Loc");
        AppMethodBeat.o(80186);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wcn != null)
      {
        paramArrayOfObject.iy(2, this.wcn.computeSize());
        this.wcn.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wXm);
      paramArrayOfObject.iz(4, this.Scene);
      if (this.ncM != null)
        paramArrayOfObject.e(5, this.ncM);
      AppMethodBeat.o(80186);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label685;
    label685: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcn != null)
        i = paramInt + e.a.a.a.ix(2, this.wcn.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.wXm) + e.a.a.b.b.a.bs(4, this.Scene);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ncM);
      AppMethodBeat.o(80186);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Loc");
          AppMethodBeat.o(80186);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80186);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bxd localbxd = (bxd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80186);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbxd.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80186);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbxd.wcn = ((axx)localObject1);
          }
          AppMethodBeat.o(80186);
          paramInt = i;
          break;
        case 3:
          localbxd.wXm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80186);
          paramInt = i;
          break;
        case 4:
          localbxd.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80186);
          paramInt = i;
          break;
        case 5:
          localbxd.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80186);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80186);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxd
 * JD-Core Version:    0.6.2
 */