package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ad extends btd
{
  public int vAS;
  public String vAT;
  public bzt vAU;
  public bqv vAV;
  public int vBc;
  public tw vBg;
  public boolean vBh;
  public int vBi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28296);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28296);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vAS);
      if (this.vAT != null)
        paramArrayOfObject.e(3, this.vAT);
      if (this.vAU != null)
      {
        paramArrayOfObject.iy(4, this.vAU.computeSize());
        this.vAU.writeFields(paramArrayOfObject);
      }
      if (this.vAV != null)
      {
        paramArrayOfObject.iy(5, this.vAV.computeSize());
        this.vAV.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vBc);
      if (this.vBg != null)
      {
        paramArrayOfObject.iy(7, this.vBg.computeSize());
        this.vBg.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(8, this.vBh);
      paramArrayOfObject.iz(9, this.vBi);
      AppMethodBeat.o(28296);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1115;
    label1115: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vAS);
      paramInt = i;
      if (this.vAT != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vAT);
      i = paramInt;
      if (this.vAU != null)
        i = paramInt + e.a.a.a.ix(4, this.vAU.computeSize());
      paramInt = i;
      if (this.vAV != null)
        paramInt = i + e.a.a.a.ix(5, this.vAV.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(6, this.vBc);
      paramInt = i;
      if (this.vBg != null)
        paramInt = i + e.a.a.a.ix(7, this.vBg.computeSize());
      paramInt = paramInt + (e.a.a.b.b.a.fv(8) + 1) + e.a.a.b.b.a.bs(9, this.vBi);
      AppMethodBeat.o(28296);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28296);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28296);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ad localad = (ad)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28296);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 2:
          localad.vAS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 3:
          localad.vAT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.vAU = paramArrayOfObject;
          }
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bqv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.vAV = ((bqv)localObject1);
          }
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 6:
          localad.vBc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.vBg = paramArrayOfObject;
          }
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 8:
          localad.vBh = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        case 9:
          localad.vBi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28296);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28296);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ad
 * JD-Core Version:    0.6.2
 */