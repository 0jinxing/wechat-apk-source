package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnh extends btd
{
  public String kbV;
  public int kdT;
  public String kdU;
  public String pbn;
  public String pbo;
  public String wQf;
  public String wQg;
  public nc wQh;
  public String wQi;
  public String wQj;
  public cif wQk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48931);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48931);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      if (this.wQf != null)
        paramArrayOfObject.e(4, this.wQf);
      if (this.kbV != null)
        paramArrayOfObject.e(5, this.kbV);
      if (this.wQg != null)
        paramArrayOfObject.e(6, this.wQg);
      if (this.wQh != null)
      {
        paramArrayOfObject.iy(7, this.wQh.computeSize());
        this.wQh.writeFields(paramArrayOfObject);
      }
      if (this.wQi != null)
        paramArrayOfObject.e(8, this.wQi);
      if (this.pbo != null)
        paramArrayOfObject.e(9, this.pbo);
      if (this.pbn != null)
        paramArrayOfObject.e(10, this.pbn);
      if (this.wQj != null)
        paramArrayOfObject.e(11, this.wQj);
      if (this.wQk != null)
      {
        paramArrayOfObject.iy(12, this.wQk.computeSize());
        this.wQk.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48931);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1257;
    label1257: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kdT);
      i = paramInt;
      if (this.kdU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kdU);
      paramInt = i;
      if (this.wQf != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wQf);
      i = paramInt;
      if (this.kbV != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kbV);
      int j = i;
      if (this.wQg != null)
        j = i + e.a.a.b.b.a.f(6, this.wQg);
      paramInt = j;
      if (this.wQh != null)
        paramInt = j + e.a.a.a.ix(7, this.wQh.computeSize());
      i = paramInt;
      if (this.wQi != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wQi);
      paramInt = i;
      if (this.pbo != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.pbo);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.pbn);
      paramInt = i;
      if (this.wQj != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wQj);
      i = paramInt;
      if (this.wQk != null)
        i = paramInt + e.a.a.a.ix(12, this.wQk.computeSize());
      AppMethodBeat.o(48931);
      paramInt = i;
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
          AppMethodBeat.o(48931);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48931);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnh localbnh = (bnh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48931);
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
            localbnh.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 2:
          localbnh.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 3:
          localbnh.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 4:
          localbnh.wQf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 5:
          localbnh.kbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 6:
          localbnh.wQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnh.wQh = paramArrayOfObject;
          }
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 8:
          localbnh.wQi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 9:
          localbnh.pbo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 10:
          localbnh.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 11:
          localbnh.wQj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cif();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cif)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnh.wQk = ((cif)localObject1);
          }
          AppMethodBeat.o(48931);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48931);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnh
 * JD-Core Version:    0.6.2
 */