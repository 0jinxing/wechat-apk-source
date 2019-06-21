package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class jq extends bsr
{
  public SKBuiltinBuffer_t vJT;
  public String vLJ;
  public int vLV;
  public String vLW;
  public String vLX;
  public String vLY;
  public int vLZ;
  public String vLx;
  public String vLy;
  public bts vMa;
  public SKBuiltinBuffer_t vMb;
  public int vMc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73695);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vLV);
      if (this.vLJ != null)
        paramArrayOfObject.e(3, this.vLJ);
      if (this.vLW != null)
        paramArrayOfObject.e(4, this.vLW);
      if (this.vLX != null)
        paramArrayOfObject.e(5, this.vLX);
      if (this.vLY != null)
        paramArrayOfObject.e(6, this.vLY);
      paramArrayOfObject.iz(7, this.vLZ);
      if (this.vMa != null)
      {
        paramArrayOfObject.iy(8, this.vMa.computeSize());
        this.vMa.writeFields(paramArrayOfObject);
      }
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(9, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.vMc);
      if (this.vLx != null)
        paramArrayOfObject.e(11, this.vLx);
      if (this.vLy != null)
        paramArrayOfObject.e(12, this.vLy);
      if (this.vJT != null)
      {
        paramArrayOfObject.iy(13, this.vJT.computeSize());
        this.vJT.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(73695);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1334;
    label1334: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vLV);
      paramInt = i;
      if (this.vLJ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vLJ);
      i = paramInt;
      if (this.vLW != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLW);
      paramInt = i;
      if (this.vLX != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vLX);
      i = paramInt;
      if (this.vLY != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vLY);
      i += e.a.a.b.b.a.bs(7, this.vLZ);
      paramInt = i;
      if (this.vMa != null)
        paramInt = i + e.a.a.a.ix(8, this.vMa.computeSize());
      i = paramInt;
      if (this.vMb != null)
        i = paramInt + e.a.a.a.ix(9, this.vMb.computeSize());
      i += e.a.a.b.b.a.bs(10, this.vMc);
      paramInt = i;
      if (this.vLx != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vLx);
      i = paramInt;
      if (this.vLy != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.vLy);
      paramInt = i;
      if (this.vJT != null)
        paramInt = i + e.a.a.a.ix(13, this.vJT.computeSize());
      AppMethodBeat.o(73695);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73695);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jq localjq = (jq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73695);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjq.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 2:
          localjq.vLV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 3:
          localjq.vLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 4:
          localjq.vLW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 5:
          localjq.vLX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 6:
          localjq.vLY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 7:
          localjq.vLZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjq.vMa = ((bts)localObject1);
          }
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjq.vMb = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 10:
          localjq.vMc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 11:
          localjq.vLx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 12:
          localjq.vLy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjq.vJT = paramArrayOfObject;
          }
          AppMethodBeat.o(73695);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73695);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jq
 * JD-Core Version:    0.6.2
 */