package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import java.util.LinkedList;

public final class bc extends btd
{
  public String mZM;
  public LinkedList<ad> nbU;
  public com.tencent.mm.bt.b nbV;
  public boolean nbW;

  public bc()
  {
    AppMethodBeat.i(111598);
    this.nbU = new LinkedList();
    AppMethodBeat.o(111598);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111599);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(111599);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.nbU);
      if (this.nbV != null)
        paramArrayOfObject.c(3, this.nbV);
      paramArrayOfObject.aO(4, this.nbW);
      if (this.mZM != null)
        paramArrayOfObject.e(5, this.mZM);
      AppMethodBeat.o(111599);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label689;
    label689: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.nbU);
      paramInt = i;
      if (this.nbV != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.nbV);
      i = paramInt + (e.a.a.b.b.a.fv(4) + 1);
      paramInt = i;
      if (this.mZM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mZM);
      AppMethodBeat.o(111599);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbU.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(111599);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111599);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bc localbc = (bc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111599);
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
            localbc.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(111599);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ad();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ad)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbc.nbU.add(localObject1);
          }
          AppMethodBeat.o(111599);
          paramInt = i;
          break;
        case 3:
          localbc.nbV = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(111599);
          paramInt = i;
          break;
        case 4:
          localbc.nbW = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111599);
          paramInt = i;
          break;
        case 5:
          localbc.mZM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111599);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111599);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bc
 * JD-Core Version:    0.6.2
 */