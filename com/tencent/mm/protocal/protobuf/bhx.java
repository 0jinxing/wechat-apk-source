package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bhx extends btd
{
  public String pdA;
  public String type;
  public String wLb;
  public bia wLf;
  public LinkedList<bhx> wLg;
  public int wLh;

  public bhx()
  {
    AppMethodBeat.i(90699);
    this.wLg = new LinkedList();
    AppMethodBeat.o(90699);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(90700);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wLf != null)
      {
        paramArrayOfObject.iy(2, this.wLf.computeSize());
        this.wLf.writeFields(paramArrayOfObject);
      }
      if (this.wLb != null)
        paramArrayOfObject.e(3, this.wLb);
      if (this.pdA != null)
        paramArrayOfObject.e(4, this.pdA);
      if (this.type != null)
        paramArrayOfObject.e(5, this.type);
      paramArrayOfObject.e(6, 8, this.wLg);
      paramArrayOfObject.iz(7, this.wLh);
      AppMethodBeat.o(90700);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label865;
    label865: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wLf != null)
        paramInt = i + e.a.a.a.ix(2, this.wLf.computeSize());
      i = paramInt;
      if (this.wLb != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wLb);
      paramInt = i;
      if (this.pdA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pdA);
      i = paramInt;
      if (this.type != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.type);
      paramInt = i + e.a.a.a.c(6, 8, this.wLg) + e.a.a.b.b.a.bs(7, this.wLh);
      AppMethodBeat.o(90700);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wLg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(90700);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhx localbhx = (bhx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(90700);
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
            localbhx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bia();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhx.wLf = paramArrayOfObject;
          }
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 3:
          localbhx.wLb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 4:
          localbhx.pdA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 5:
          localbhx.type = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bhx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhx.wLg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        case 7:
          localbhx.wLh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90700);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(90700);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhx
 * JD-Core Version:    0.6.2
 */