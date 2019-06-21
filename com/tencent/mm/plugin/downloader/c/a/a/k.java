package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import java.util.LinkedList;

public final class k extends btd
{
  public int kKC;
  public String kKD;
  public d kKy;
  public int kdT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35520);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(35520);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.kKy != null)
      {
        paramArrayOfObject.iy(2, this.kKy.computeSize());
        this.kKy.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.kdT);
      paramArrayOfObject.iz(4, this.kKC);
      if (this.kKD != null)
        paramArrayOfObject.e(5, this.kKD);
      AppMethodBeat.o(35520);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label684;
    label684: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kKy != null)
        i = paramInt + e.a.a.a.ix(2, this.kKy.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.kdT) + e.a.a.b.b.a.bs(4, this.kKC);
      paramInt = i;
      if (this.kKD != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.kKD);
      AppMethodBeat.o(35520);
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
          AppMethodBeat.o(35520);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35520);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35520);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(35520);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.kKy = paramArrayOfObject;
          }
          AppMethodBeat.o(35520);
          paramInt = i;
          break;
        case 3:
          localk.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35520);
          paramInt = i;
          break;
        case 4:
          localk.kKC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35520);
          paramInt = i;
          break;
        case 5:
          localk.kKD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35520);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35520);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.k
 * JD-Core Version:    0.6.2
 */