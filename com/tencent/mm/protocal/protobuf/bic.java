package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bic extends com.tencent.mm.bt.a
{
  public String Md5;
  public String Name;
  public String PackName;
  public int Version;
  public int jCo;
  public int ndE;
  public SKBuiltinBuffer_t vFG;
  public SKBuiltinBuffer_t wLt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80153);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ndE);
      paramArrayOfObject.iz(2, this.Version);
      if (this.Name != null)
        paramArrayOfObject.e(3, this.Name);
      paramArrayOfObject.iz(4, this.jCo);
      if (this.vFG != null)
      {
        paramArrayOfObject.iy(5, this.vFG.computeSize());
        this.vFG.writeFields(paramArrayOfObject);
      }
      if (this.PackName != null)
        paramArrayOfObject.e(6, this.PackName);
      if (this.wLt != null)
      {
        paramArrayOfObject.iy(7, this.wLt.computeSize());
        this.wLt.writeFields(paramArrayOfObject);
      }
      if (this.Md5 != null)
        paramArrayOfObject.e(8, this.Md5);
      AppMethodBeat.o(80153);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ndE) + 0 + e.a.a.b.b.a.bs(2, this.Version);
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.Name);
        paramInt += e.a.a.b.b.a.bs(4, this.jCo);
        i = paramInt;
        if (this.vFG != null)
          i = paramInt + e.a.a.a.ix(5, this.vFG.computeSize());
        paramInt = i;
        if (this.PackName != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.PackName);
        i = paramInt;
        if (this.wLt != null)
          i = paramInt + e.a.a.a.ix(7, this.wLt.computeSize());
        paramInt = i;
        if (this.Md5 != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.Md5);
        AppMethodBeat.o(80153);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80153);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bic localbic = (bic)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80153);
          break;
        case 1:
          localbic.ndE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 2:
          localbic.Version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 3:
          localbic.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 4:
          localbic.jCo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbic.vFG = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 6:
          localbic.PackName = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbic.wLt = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        case 8:
          localbic.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80153);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bic
 * JD-Core Version:    0.6.2
 */