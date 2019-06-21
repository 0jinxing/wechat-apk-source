package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class qw extends btd
{
  public cwg vXT;
  public boolean vXU;
  public String vXV;
  public String vXW;
  public boolean vXX;
  public String vXY;
  public String vXZ;
  public String vYa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96212);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96212);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vXT != null)
      {
        paramArrayOfObject.iy(2, this.vXT.computeSize());
        this.vXT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(3, this.vXU);
      if (this.vXV != null)
        paramArrayOfObject.e(4, this.vXV);
      if (this.vXW != null)
        paramArrayOfObject.e(5, this.vXW);
      paramArrayOfObject.aO(6, this.vXX);
      if (this.vXY != null)
        paramArrayOfObject.e(7, this.vXY);
      if (this.vXZ != null)
        paramArrayOfObject.e(8, this.vXZ);
      if (this.vYa != null)
        paramArrayOfObject.e(9, this.vYa);
      AppMethodBeat.o(96212);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label945;
    label945: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vXT != null)
        i = paramInt + e.a.a.a.ix(2, this.vXT.computeSize());
      i += e.a.a.b.b.a.fv(3) + 1;
      paramInt = i;
      if (this.vXV != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXV);
      i = paramInt;
      if (this.vXW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXW);
      paramInt = i + (e.a.a.b.b.a.fv(6) + 1);
      i = paramInt;
      if (this.vXY != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vXY);
      paramInt = i;
      if (this.vXZ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vXZ);
      i = paramInt;
      if (this.vYa != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vYa);
      AppMethodBeat.o(96212);
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
          AppMethodBeat.o(96212);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96212);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qw localqw = (qw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96212);
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
            localqw.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqw.vXT = ((cwg)localObject1);
          }
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 3:
          localqw.vXU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 4:
          localqw.vXV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 5:
          localqw.vXW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 6:
          localqw.vXX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 7:
          localqw.vXY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 8:
          localqw.vXZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        case 9:
          localqw.vYa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96212);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96212);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qw
 * JD-Core Version:    0.6.2
 */