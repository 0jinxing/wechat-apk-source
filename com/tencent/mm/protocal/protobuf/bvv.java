package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bvv extends com.tencent.mm.bt.a
{
  public xu vHF;
  public SKBuiltinBuffer_t vHG;
  public SKBuiltinBuffer_t vHH;
  public int vHV;
  public SKBuiltinBuffer_t vHY;
  public SKBuiltinBuffer_t vHZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58930);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
        AppMethodBeat.o(58930);
        throw paramArrayOfObject;
      }
      if (this.vHF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SvrPubECDHKey");
        AppMethodBeat.o(58930);
        throw paramArrayOfObject;
      }
      if (this.vHG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SessionKey");
        AppMethodBeat.o(58930);
        throw paramArrayOfObject;
      }
      if (this.vHH != null)
      {
        paramArrayOfObject.iy(1, this.vHH.computeSize());
        this.vHH.writeFields(paramArrayOfObject);
      }
      if (this.vHF != null)
      {
        paramArrayOfObject.iy(2, this.vHF.computeSize());
        this.vHF.writeFields(paramArrayOfObject);
      }
      if (this.vHG != null)
      {
        paramArrayOfObject.iy(3, this.vHG.computeSize());
        this.vHG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vHV);
      if (this.vHY != null)
      {
        paramArrayOfObject.iy(5, this.vHY.computeSize());
        this.vHY.writeFields(paramArrayOfObject);
      }
      if (this.vHZ != null)
      {
        paramArrayOfObject.iy(6, this.vHZ.computeSize());
        this.vHZ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58930);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHH == null)
        break label1150;
    label1150: for (i = e.a.a.a.ix(1, this.vHH.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHF != null)
        paramInt = i + e.a.a.a.ix(2, this.vHF.computeSize());
      i = paramInt;
      if (this.vHG != null)
        i = paramInt + e.a.a.a.ix(3, this.vHG.computeSize());
      i += e.a.a.b.b.a.bs(4, this.vHV);
      paramInt = i;
      if (this.vHY != null)
        paramInt = i + e.a.a.a.ix(5, this.vHY.computeSize());
      i = paramInt;
      if (this.vHZ != null)
        i = paramInt + e.a.a.a.ix(6, this.vHZ.computeSize());
      AppMethodBeat.o(58930);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
          AppMethodBeat.o(58930);
          throw paramArrayOfObject;
        }
        if (this.vHF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SvrPubECDHKey");
          AppMethodBeat.o(58930);
          throw paramArrayOfObject;
        }
        if (this.vHG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SessionKey");
          AppMethodBeat.o(58930);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58930);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvv localbvv = (bvv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58930);
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
            localbvv.vHH = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58930);
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
            localbvv.vHF = ((xu)localObject1);
          }
          AppMethodBeat.o(58930);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvv.vHG = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58930);
          paramInt = i;
          break;
        case 4:
          localbvv.vHV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58930);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvv.vHY = paramArrayOfObject;
          }
          AppMethodBeat.o(58930);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvv.vHZ = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58930);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58930);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvv
 * JD-Core Version:    0.6.2
 */