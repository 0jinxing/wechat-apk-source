package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnl extends btd
{
  public int kdT;
  public String kdU;
  public LinkedList<bir> vAD;
  public long vYi;
  public long vYj;
  public bdh wQl;
  public atj wci;
  public chl woi;
  public mu wpq;
  public btn wxm;

  public bnl()
  {
    AppMethodBeat.i(48935);
    this.vAD = new LinkedList();
    AppMethodBeat.o(48935);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48936);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48936);
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
      if (this.wci != null)
      {
        paramArrayOfObject.iy(4, this.wci.computeSize());
        this.wci.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(5, 8, this.vAD);
      paramArrayOfObject.ai(6, this.vYi);
      paramArrayOfObject.ai(7, this.vYj);
      if (this.wxm != null)
      {
        paramArrayOfObject.iy(8, this.wxm.computeSize());
        this.wxm.writeFields(paramArrayOfObject);
      }
      if (this.wpq != null)
      {
        paramArrayOfObject.iy(9, this.wpq.computeSize());
        this.wpq.writeFields(paramArrayOfObject);
      }
      if (this.woi != null)
      {
        paramArrayOfObject.iy(10, this.woi.computeSize());
        this.woi.writeFields(paramArrayOfObject);
      }
      if (this.wQl != null)
      {
        paramArrayOfObject.iy(11, this.wQl.computeSize());
        this.wQl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48936);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1520;
    label1520: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wci != null)
        i = paramInt + e.a.a.a.ix(4, this.wci.computeSize());
      i = i + e.a.a.a.c(5, 8, this.vAD) + e.a.a.b.b.a.o(6, this.vYi) + e.a.a.b.b.a.o(7, this.vYj);
      paramInt = i;
      if (this.wxm != null)
        paramInt = i + e.a.a.a.ix(8, this.wxm.computeSize());
      i = paramInt;
      if (this.wpq != null)
        i = paramInt + e.a.a.a.ix(9, this.wpq.computeSize());
      paramInt = i;
      if (this.woi != null)
        paramInt = i + e.a.a.a.ix(10, this.woi.computeSize());
      i = paramInt;
      if (this.wQl != null)
        i = paramInt + e.a.a.a.ix(11, this.wQl.computeSize());
      AppMethodBeat.o(48936);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vAD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(48936);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48936);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnl localbnl = (bnl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48936);
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
            localbnl.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 2:
          localbnl.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 3:
          localbnl.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.wci = ((atj)localObject1);
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bir();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bir)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.vAD.add(localObject1);
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 6:
          localbnl.vYi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 7:
          localbnl.vYj = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.wxm = paramArrayOfObject;
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.wpq = paramArrayOfObject;
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new chl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.woi = paramArrayOfObject;
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnl.wQl = ((bdh)localObject1);
          }
          AppMethodBeat.o(48936);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48936);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnl
 * JD-Core Version:    0.6.2
 */