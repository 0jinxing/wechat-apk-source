package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class uu extends btd
{
  public String gfa;
  public LinkedList<bgd> vEN;
  public String wcj;
  public String wck;

  public uu()
  {
    AppMethodBeat.i(80040);
    this.vEN = new LinkedList();
    AppMethodBeat.o(80040);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80041);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.gfa != null)
        paramArrayOfObject.e(2, this.gfa);
      paramArrayOfObject.e(3, 8, this.vEN);
      if (this.wcj != null)
        paramArrayOfObject.e(4, this.wcj);
      if (this.wck != null)
        paramArrayOfObject.e(5, this.wck);
      AppMethodBeat.o(80041);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label661;
    label661: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.gfa != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.gfa);
      i += e.a.a.a.c(3, 8, this.vEN);
      paramInt = i;
      if (this.wcj != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wcj);
      i = paramInt;
      if (this.wck != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wck);
      AppMethodBeat.o(80041);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80041);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uu localuu = (uu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80041);
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
            localuu.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80041);
          paramInt = i;
          break;
        case 2:
          localuu.gfa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80041);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bgd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bgd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuu.vEN.add(localObject1);
          }
          AppMethodBeat.o(80041);
          paramInt = i;
          break;
        case 4:
          localuu.wcj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80041);
          paramInt = i;
          break;
        case 5:
          localuu.wck = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80041);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80041);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uu
 * JD-Core Version:    0.6.2
 */