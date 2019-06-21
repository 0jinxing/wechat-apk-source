package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bah extends com.tencent.mm.bt.a
{
  public String jBB;
  public xu vIr;
  public String vLJ;
  public String vLW;
  public SKBuiltinBuffer_t vLz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58914);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
        AppMethodBeat.o(58914);
        throw paramArrayOfObject;
      }
      if (this.vIr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CliPubECDHKey");
        AppMethodBeat.o(58914);
        throw paramArrayOfObject;
      }
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(1, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.vIr != null)
      {
        paramArrayOfObject.iy(2, this.vIr.computeSize());
        this.vIr.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      if (this.vLJ != null)
        paramArrayOfObject.e(4, this.vLJ);
      if (this.vLW != null)
        paramArrayOfObject.e(5, this.vLW);
      AppMethodBeat.o(58914);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vLz == null)
        break label769;
    label769: for (paramInt = e.a.a.a.ix(1, this.vLz.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vIr != null)
        i = paramInt + e.a.a.a.ix(2, this.vIr.computeSize());
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jBB);
      i = paramInt;
      if (this.vLJ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLJ);
      paramInt = i;
      if (this.vLW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vLW);
      AppMethodBeat.o(58914);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
          AppMethodBeat.o(58914);
          throw paramArrayOfObject;
        }
        if (this.vIr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CliPubECDHKey");
          AppMethodBeat.o(58914);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58914);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bah localbah = (bah)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58914);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbah.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58914);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbah.vIr = ((xu)localObject1);
          }
          AppMethodBeat.o(58914);
          paramInt = i;
          break;
        case 3:
          localbah.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58914);
          paramInt = i;
          break;
        case 4:
          localbah.vLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58914);
          paramInt = i;
          break;
        case 5:
          localbah.vLW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58914);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58914);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bah
 * JD-Core Version:    0.6.2
 */