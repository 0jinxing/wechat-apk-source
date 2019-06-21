package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ry extends btd
{
  public String Md5;
  public int Version;
  public String vZm;
  public int vZn;
  public LinkedList<chi> vZo;
  public int vZp;

  public ry()
  {
    AppMethodBeat.i(14721);
    this.vZo = new LinkedList();
    AppMethodBeat.o(14721);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14722);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(14722);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.Version);
      if (this.vZm != null)
        paramArrayOfObject.e(3, this.vZm);
      if (this.Md5 != null)
        paramArrayOfObject.e(4, this.Md5);
      paramArrayOfObject.iz(5, this.vZn);
      paramArrayOfObject.e(6, 8, this.vZo);
      paramArrayOfObject.iz(7, this.vZp);
      AppMethodBeat.o(14722);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label799;
    label799: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.Version);
      paramInt = i;
      if (this.vZm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vZm);
      i = paramInt;
      if (this.Md5 != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Md5);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vZn) + e.a.a.a.c(6, 8, this.vZo) + e.a.a.b.b.a.bs(7, this.vZp);
      AppMethodBeat.o(14722);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(14722);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14722);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ry localry = (ry)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14722);
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
            localry.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 2:
          localry.Version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 3:
          localry.vZm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 4:
          localry.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 5:
          localry.vZn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localry.vZo.add(localObject1);
          }
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        case 7:
          localry.vZp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14722);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14722);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ry
 * JD-Core Version:    0.6.2
 */