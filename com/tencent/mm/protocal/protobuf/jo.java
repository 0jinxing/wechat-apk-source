package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class jo extends bsr
{
  public String jBB;
  public String luQ;
  public String vHS;
  public int vIJ;
  public String vIj;
  public int vLA;
  public int vLB;
  public int vLC;
  public String vLD;
  public SKBuiltinBuffer_t vLE;
  public SKBuiltinBuffer_t vLF;
  public String vLG;
  public String vLs;
  public String vLt;
  public int vLu;
  public String vLv;
  public int vLw;
  public String vLx;
  public String vLy;
  public SKBuiltinBuffer_t vLz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123506);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.vLs != null)
        paramArrayOfObject.e(3, this.vLs);
      paramArrayOfObject.iz(4, this.vIJ);
      if (this.vLt != null)
        paramArrayOfObject.e(5, this.vLt);
      paramArrayOfObject.iz(6, this.vLu);
      if (this.vLv != null)
        paramArrayOfObject.e(7, this.vLv);
      if (this.vHS != null)
        paramArrayOfObject.e(8, this.vHS);
      paramArrayOfObject.iz(9, this.vLw);
      if (this.vLx != null)
        paramArrayOfObject.e(10, this.vLx);
      if (this.vLy != null)
        paramArrayOfObject.e(11, this.vLy);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(12, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.luQ != null)
        paramArrayOfObject.e(13, this.luQ);
      paramArrayOfObject.iz(14, this.vLA);
      paramArrayOfObject.iz(15, this.vLB);
      if (this.vIj != null)
        paramArrayOfObject.e(16, this.vIj);
      paramArrayOfObject.iz(17, this.vLC);
      if (this.vLD != null)
        paramArrayOfObject.e(18, this.vLD);
      if (this.vLE != null)
      {
        paramArrayOfObject.iy(19, this.vLE.computeSize());
        this.vLE.writeFields(paramArrayOfObject);
      }
      if (this.vLF != null)
      {
        paramArrayOfObject.iy(20, this.vLF.computeSize());
        this.vLF.writeFields(paramArrayOfObject);
      }
      if (this.vLG != null)
        paramArrayOfObject.e(21, this.vLG);
      AppMethodBeat.o(123506);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1804;
    label1804: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
      i = paramInt;
      if (this.vLs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLs);
      i += e.a.a.b.b.a.bs(4, this.vIJ);
      paramInt = i;
      if (this.vLt != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vLt);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vLu);
      paramInt = i;
      if (this.vLv != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vLv);
      i = paramInt;
      if (this.vHS != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vHS);
      i += e.a.a.b.b.a.bs(9, this.vLw);
      paramInt = i;
      if (this.vLx != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vLx);
      i = paramInt;
      if (this.vLy != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vLy);
      paramInt = i;
      if (this.vLz != null)
        paramInt = i + e.a.a.a.ix(12, this.vLz.computeSize());
      i = paramInt;
      if (this.luQ != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.luQ);
      i = i + e.a.a.b.b.a.bs(14, this.vLA) + e.a.a.b.b.a.bs(15, this.vLB);
      paramInt = i;
      if (this.vIj != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vIj);
      i = paramInt + e.a.a.b.b.a.bs(17, this.vLC);
      paramInt = i;
      if (this.vLD != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.vLD);
      i = paramInt;
      if (this.vLE != null)
        i = paramInt + e.a.a.a.ix(19, this.vLE.computeSize());
      paramInt = i;
      if (this.vLF != null)
        paramInt = i + e.a.a.a.ix(20, this.vLF.computeSize());
      i = paramInt;
      if (this.vLG != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.vLG);
      AppMethodBeat.o(123506);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123506);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jo localjo = (jo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123506);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjo.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 2:
          localjo.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 3:
          localjo.vLs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 4:
          localjo.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 5:
          localjo.vLt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 6:
          localjo.vLu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 7:
          localjo.vLv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 8:
          localjo.vHS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 9:
          localjo.vLw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 10:
          localjo.vLx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 11:
          localjo.vLy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjo.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 13:
          localjo.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 14:
          localjo.vLA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 15:
          localjo.vLB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 16:
          localjo.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 17:
          localjo.vLC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 18:
          localjo.vLD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 19:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjo.vLE = paramArrayOfObject;
          }
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 20:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjo.vLF = paramArrayOfObject;
          }
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        case 21:
          localjo.vLG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123506);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123506);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jo
 * JD-Core Version:    0.6.2
 */