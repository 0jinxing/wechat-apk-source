package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ckp extends btd
{
  public String wGj;
  public int wnG;
  public int wnH;
  public int wnI;
  public int wnJ;
  public String wnK;
  public int wnL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5605);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5605);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wGj != null)
        paramArrayOfObject.e(2, this.wGj);
      if (this.wnK != null)
        paramArrayOfObject.e(3, this.wnK);
      paramArrayOfObject.iz(4, this.wnJ);
      paramArrayOfObject.iz(5, this.wnG);
      paramArrayOfObject.iz(6, this.wnH);
      paramArrayOfObject.iz(7, this.wnI);
      paramArrayOfObject.iz(8, this.wnL);
      AppMethodBeat.o(5605);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label746;
    label746: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wGj != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wGj);
      i = paramInt;
      if (this.wnK != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wnK);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wnJ) + e.a.a.b.b.a.bs(5, this.wnG) + e.a.a.b.b.a.bs(6, this.wnH) + e.a.a.b.b.a.bs(7, this.wnI) + e.a.a.b.b.a.bs(8, this.wnL);
      AppMethodBeat.o(5605);
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
          AppMethodBeat.o(5605);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5605);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ckp localckp = (ckp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5605);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localckp.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 2:
          localckp.wGj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 3:
          localckp.wnK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 4:
          localckp.wnJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 5:
          localckp.wnG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 6:
          localckp.wnH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 7:
          localckp.wnI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        case 8:
          localckp.wnL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5605);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5605);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckp
 * JD-Core Version:    0.6.2
 */